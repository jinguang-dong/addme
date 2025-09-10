package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jwr extends ndp {
    final /* synthetic */ msd a;
    final /* synthetic */ jxa b;

    public jwr(jxa jxaVar, msd msdVar) {
        this.a = msdVar;
        this.b = jxaVar;
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void a() {
        jxa jxaVar = this.b;
        if (jxaVar.i && jxaVar.h) {
            if (jxaVar.j) {
                jxaVar.g();
                return;
            }
            this.a.f();
            jeg jegVar = jxaVar.s;
            jwq jwqVar = new jwq(this, 0);
            if (jegVar.b == null || jegVar.d || jegVar.n != 0 || jegVar.u) {
                return;
            }
            jegVar.c.b.j(jegVar.H, new jef(jegVar, jwqVar, 0));
        }
    }
}
