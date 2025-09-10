package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class htb extends kfn {
    final /* synthetic */ hti a;

    public htb(hti htiVar) {
        this.a = htiVar;
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void b() {
        sgv sgvVar = hti.a;
        hti htiVar = this.a;
        hup hupVar = htiVar.Q;
        if (hupVar != null) {
            hupVar.d();
        }
        htiVar.l.x();
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void e(float f) {
        g(f, -1L);
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void g(float f, long j) {
        sgv sgvVar = hti.a;
        hti htiVar = this.a;
        hup hupVar = htiVar.Q;
        if (hupVar != null) {
            hupVar.f(f);
        }
        htiVar.l.K((int) (f * 100.0f), j, false);
    }
}
