package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* compiled from: PG */
/* loaded from: classes.dex */
class lqx extends lqt {
    private Animator a;
    final /* synthetic */ lra b;

    public lqx(lra lraVar) {
        this.b = lraVar;
    }

    @Override // defpackage.lqt, defpackage.mcz, defpackage.mda
    public final void a() {
        lra lraVar = this.b;
        lraVar.h();
        lrb lrbVar = (lrb) lraVar.a.a();
        int iA = lrbVar.a(lraVar.k());
        nla nlaVar = new nla(1000, new cvn());
        nlaVar.c(lrbVar.m, "backgroundColor", lrbVar.a, iA);
        nlaVar.c(lrbVar.j, "color", lrbVar.b, lrbVar.c);
        nlaVar.c(lrbVar.k, "color", lrbVar.d, lrbVar.e);
        nlaVar.c(lrbVar.l, "color", lrbVar.f, lrbVar.g);
        AnimatorSet animatorSetA = nlaVar.a();
        this.a = animatorSetA;
        animatorSetA.addListener(new lqw(this));
        this.a.start();
    }

    @Override // defpackage.lqt, defpackage.mcz, defpackage.mda
    public final void b() {
        if (this.a.isRunning()) {
            this.a.removeAllListeners();
            this.a.cancel();
        }
        this.b.j();
    }

    @Override // defpackage.lqt
    public void c() {
    }

    @Override // defpackage.lqt
    public void e() {
    }

    @Override // defpackage.lqt
    public void f() {
    }
}
