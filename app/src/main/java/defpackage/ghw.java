package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ghw extends ghs {
    final /* synthetic */ ghx b;

    public ghw(ghx ghxVar) {
        this.b = ghxVar;
    }

    @Override // defpackage.ghs, defpackage.mcz, defpackage.mda
    public final void a() {
        ghx ghxVar = this.b;
        rwc rwcVar = ghxVar.f;
        if (rwcVar.h()) {
            ((gmt) rwcVar.c()).e();
            ghxVar.g.a(moa.IDLE);
        }
    }

    @Override // defpackage.ghs, defpackage.mcz, defpackage.mda
    public final void b() {
        ghx ghxVar = this.b;
        ghxVar.g.a(moa.HIDDEN);
        rwc rwcVar = ghxVar.f;
        if (rwcVar.h()) {
            ((gmt) rwcVar.c()).a();
        }
    }

    @Override // defpackage.ghs
    public void c() {
    }

    @Override // defpackage.ghs
    public void d() {
    }

    @Override // defpackage.ghs
    public void f() {
    }
}
