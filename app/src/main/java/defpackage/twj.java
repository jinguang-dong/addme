package defpackage;

import android.graphics.SurfaceTexture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twj implements SurfaceTexture.OnFrameAvailableListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public twj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        twl twlVar;
        if (this.b != 0) {
            if (((iki) this.a).h.getAndSet(true)) {
                ((sgt) iki.a.c().M(2100)).s("Skipped a camera frame");
                return;
            }
            return;
        }
        Object obj = this.a;
        twk twkVar = (twk) obj;
        twkVar.d.getAndIncrement();
        synchronized (twkVar.k) {
            if (!((twk) obj).j && (twlVar = ((twk) obj).b) != null) {
                twlVar.b();
            }
        }
    }
}
