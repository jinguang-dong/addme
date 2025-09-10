package defpackage;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdk implements InterleavedU8ClientAllocator {
    private static final Bitmap.Config c = Bitmap.Config.ARGB_8888;
    public Bitmap a;
    public tcl b;
    private final DisplayMetrics d;

    public tdk(DisplayMetrics displayMetrics) {
        a.I(GcamModuleJNI.kInvalidAllocationId_get() != 0);
        this.d = displayMetrics;
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        rnt.G(i3 == 4, LmJPKwPBa.OqXWB, i3, 4);
        rnt.M(this.a == null, "allocate() should be called at most once.");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.d, i, i2, c);
        this.a = bitmapCreateBitmap;
        this.b = new tcl(bitmapCreateBitmap);
        return new LongPair(0L, InterleavedWriteViewU8.a(this.b.a));
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final void doneWriting(long j) {
        a.I(j == 0);
        rnt.M(this.a != null, "doneWriting() was called before allocate().");
        rnt.M(this.b != null, "doneWriting() was called more than once.");
        this.b.close();
        this.b = null;
    }
}
