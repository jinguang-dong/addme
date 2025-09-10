package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixs implements mcw {
    private final uem a;
    private final /* synthetic */ int b;

    public ixs(uem uemVar, int i) {
        this.b = i;
        this.a = uemVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            ((ixr) this.a).b();
            return;
        }
        out.a();
        final szh szhVar = (szh) this.a.a();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: ftl
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                szhVar.e(fsq.h);
            }
        });
    }
}
