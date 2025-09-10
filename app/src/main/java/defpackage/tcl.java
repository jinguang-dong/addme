package defpackage;

import android.graphics.Bitmap;
import com.google.googlex.gcam.AndroidJniUtils;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedWriteViewU8;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcl implements AutoCloseable {
    public final InterleavedWriteViewU8 a;
    private final Bitmap b;
    private long c;

    public tcl(Bitmap bitmap) {
        bitmap.getClass();
        this.b = bitmap;
        rnt.F(bitmap.getConfig().equals(Bitmap.Config.ARGB_8888), "Bitmap Config must be ARGB_8888", bitmap.getConfig());
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int rowBytes = bitmap.getRowBytes();
        rnt.G(bitmap.getRowBytes() % 4 == 0, "Bitmap's row stride in bytes (%s) must evenly divide the number of channels (%s)", bitmap.getRowBytes(), 4);
        long jLockBitmap = AndroidJniUtils.lockBitmap(bitmap);
        this.c = jLockBitmap;
        if (jLockBitmap == 0) {
            throw new IllegalArgumentException("Failed to lock bitmap.");
        }
        this.a = new InterleavedWriteViewU8(GcamModuleJNI.new_InterleavedWriteViewU8__SWIG_1(width, height, 4, tcx.a(new tcx(jLockBitmap)), rowBytes));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.c != 0) {
            AndroidJniUtils.unlockBitmap(this.b);
            this.c = 0L;
        }
    }

    protected final void finalize() {
        if (this.c != 0) {
            System.err.printf("LockedBitmap finalized with a non-zero native pointer (0x%x), this indicates a resource management error.%n", Long.valueOf(this.c));
        }
        close();
    }
}
