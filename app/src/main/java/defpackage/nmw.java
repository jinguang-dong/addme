package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.SurfaceView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nmw implements PixelCopy.OnPixelCopyFinishedListener {
    private static final sgv b = sgv.g("nmw");
    public final Handler a;

    public nmw(HandlerThread handlerThread) {
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
    }

    public final void a(SurfaceView surfaceView, Bitmap bitmap) {
        synchronized (this) {
            PixelCopy.request(surfaceView, bitmap, this, this.a);
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    public final void b() throws InterruptedException {
        try {
            wait();
        } catch (InterruptedException e) {
            ((sgt) ((sgt) b.c().i(e)).M((char) 5452)).s("SynchronousPixelCopy: Wait interrupted");
        }
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        synchronized (this) {
            if (i != 0) {
                ((sgt) b.c().M(5451)).t("SynchronousPixelCopy: PixelCopy failed with %s", i);
                notify();
            } else {
                notify();
            }
        }
    }
}
