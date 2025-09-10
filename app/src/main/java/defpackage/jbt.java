package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jbt extends ndp {
    final /* synthetic */ kdb a;
    final /* synthetic */ jby b;

    public jbt(jby jbyVar, kdb kdbVar) {
        this.a = kdbVar;
        this.b = jbyVar;
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void a() {
        jby jbyVar = this.b;
        if (jbyVar.aa == null || jbyVar.L()) {
            return;
        }
        this.a.f();
        jbyVar.P.g();
        if (jbyVar.K()) {
            return;
        }
        our ourVar = jbyVar.L;
        if (ourVar != null && !ourVar.b()) {
            jbyVar.d();
            jbyVar.e();
        }
        int i = ((ltw) jbyVar.k.dL()).h;
        if (i > 0) {
            jbyVar.H(i);
        } else {
            jbyVar.n();
        }
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void c() {
        this.b.U.K.j();
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void d() {
        jby jbyVar = this.b;
        jbyVar.P.e();
        jbyVar.U.K.i();
    }
}
