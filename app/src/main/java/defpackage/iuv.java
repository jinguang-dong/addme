package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iuv implements rpj {
    final /* synthetic */ efs a;
    final /* synthetic */ iux b;

    public iuv(iux iuxVar, efs efsVar) {
        this.a = efsVar;
        this.b = iuxVar;
    }

    @Override // defpackage.rpi
    public final void a(rpn rpnVar) {
        syj.i(rpnVar.h);
        Object obj = rpnVar.a;
        obj.getClass();
        if (((iwt) obj).equals(iwt.ACTION)) {
            this.b.b.ak("lasagna_edu_action");
        } else {
            this.b.b.ak("lasagna_edu_landscape");
        }
        this.a.n();
        mno mnoVar = this.b.e;
        if (mnoVar != null) {
            mnoVar.d = 0;
        }
    }

    @Override // defpackage.rpi
    public final void c() {
        this.a.l();
    }

    @Override // defpackage.rpi
    public final void b() {
    }
}
