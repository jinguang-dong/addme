package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* compiled from: PG */
/* loaded from: classes.dex */
class lqv extends lqt {
    private Animator a;
    final /* synthetic */ lra b;

    public lqv(lra lraVar) {
        this.b = lraVar;
    }

    @Override // defpackage.lqt, defpackage.mcz, defpackage.mda
    public final void a() {
        lra lraVar = this.b;
        lrb lrbVar = (lrb) lraVar.a.a();
        int iA = lrbVar.a(lraVar.k());
        nla nlaVar = new nla(333, new cvn());
        nlaVar.c(lrbVar.m, "backgroundColor", iA, lrbVar.a);
        nlaVar.c(lrbVar.j, "color", lrbVar.c, lrbVar.b);
        nlaVar.c(lrbVar.k, "color", lrbVar.e, lrbVar.d);
        nlaVar.c(lrbVar.l, "color", lrbVar.g, lrbVar.f);
        AnimatorSet animatorSetA = nlaVar.a();
        this.a = animatorSetA;
        animatorSetA.addListener(new lqu(this));
        this.a.start();
    }

    @Override // defpackage.lqt, defpackage.mcz, defpackage.mda
    public final void b() {
        if (this.a.isRunning()) {
            this.a.removeAllListeners();
            this.a.cancel();
        }
    }

    @Override // defpackage.lqt
    public void c() {
    }

    @Override // defpackage.lqt
    public void d() {
    }
}
