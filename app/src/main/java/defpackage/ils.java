package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ils {
    private static final sgv a = sgv.g("ils");
    private final MediaMuxer b;
    private final int c;
    private final CountDownLatch d = new CountDownLatch(1);
    private int e = 0;

    public ils(String str, int i) {
        this.c = i;
        try {
            this.b = new MediaMuxer(str, 0);
        } catch (IOException e) {
            throw new RuntimeException("MediaMuxer creation failed", e);
        }
    }

    public final synchronized int a(MediaFormat mediaFormat) {
        if (d()) {
            ((sgt) a.b().M(2142)).t(uCzt.wEQdJdVngmgia, this.e);
            return -1;
        }
        MediaMuxer mediaMuxer = this.b;
        int iAddTrack = mediaMuxer.addTrack(mediaFormat);
        int i = this.e + 1;
        this.e = i;
        if (i == this.c) {
            mediaMuxer.start();
            this.d.countDown();
        }
        return iAddTrack;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r1v3, types: [sgt, shi] */
    public final synchronized void b() {
        if (this.e <= 0) {
            ((sgt) a.b().M(2146)).s("stopTrack called but no tracks were added!");
            return;
        }
        if (!d()) {
            ((sgt) a.b().M(2145)).s("stopTrack called but the muxer is not started!");
            return;
        }
        int i = this.e - 1;
        this.e = i;
        if (i > 0) {
            return;
        }
        try {
            this.b.stop();
        } catch (IllegalStateException e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 2144)).v("%s", e.getMessage());
        }
        try {
            this.b.release();
        } catch (IllegalStateException e2) {
            ((sgt) ((sgt) a.b().i(e2)).M((char) 2143)).v("%s", e2.getMessage());
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [sgt, shi] */
    public final void c(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) throws InterruptedException {
        try {
            this.d.await();
            try {
                this.b.writeSampleData(i, byteBuffer, bufferInfo);
            } catch (IllegalArgumentException e) {
                ((sgt) ((sgt) a.b().i(e)).M((char) 2147)).v("%s", e.getMessage());
            }
        } catch (InterruptedException unused) {
            ((sgt) a.b().M(2148)).s("writeSampleData called but muxer was not started!");
        }
    }

    public final boolean d() {
        return this.d.getCount() == 0;
    }
}
