package defpackage;

import android.os.Handler;
import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jws implements enb {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jws(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.enb
    public final void a() {
        if (this.b != 0) {
            ((jee) this.a).a.s = true;
            return;
        }
        Object obj = this.a;
        jxa jxaVar = (jxa) obj;
        jeg jegVar = jxaVar.s;
        if (jegVar == null) {
            return;
        }
        jxaVar.i = true;
        jegVar.s = true;
        jegVar.b.D = false;
        Thread.State state = jxaVar.f.getState();
        if (state == Thread.State.NEW) {
            jxaVar.f.start();
        } else {
            ((sgt) jxa.a.c().M(3092)).v("aligner has already been started! State=%s", state);
        }
        jxaVar.b();
        jxaVar.o.n();
        try {
            ((jxa) obj).E = ((jxa) obj).s.b() <= 0.0f;
            jxa jxaVar2 = (jxa) this.a;
            Handler handler = jxaVar2.F;
            if (handler != null) {
                handler.obtainMessage(1).sendToTarget();
                jxaVar2.F.obtainMessage(2, jxaVar2.w, jxaVar2.x).sendToTarget();
                jxaVar2.s.t = jxaVar2.G;
            }
            jxaVar2.I(true);
            jxaVar2.c.p(true);
        } catch (IllegalStateException unused) {
        }
    }
}
