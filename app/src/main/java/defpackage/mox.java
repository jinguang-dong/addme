package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class mox extends mov {
    final /* synthetic */ moy a;
    private our b;

    public mox(moy moyVar) {
        this.a = moyVar;
    }

    @Override // defpackage.mov, defpackage.mcz, defpackage.mda
    public final void a() {
        this.b = new our();
        moy moyVar = this.a;
        moyVar.i.f();
        moyVar.j.B();
        rwc rwcVar = moyVar.b;
        if (rwcVar.h()) {
            ((ntr) rwcVar.c()).a(false, true);
        }
        kgw kgwVar = moyVar.e;
        kgwVar.getClass();
        if (kgwVar.H()) {
            int iF = moyVar.e.f();
            int iE = moyVar.e.e();
            moyVar.d.e(iF, iE, moyVar.e.a());
            owq owqVar = moyVar.c;
            laj lajVar = laj.a;
            lai laiVar = new lai();
            laiVar.c(iF);
            laiVar.b(iE);
            owqVar.a(laiVar.a());
        }
    }

    @Override // defpackage.mov, defpackage.mcz, defpackage.mda
    public final void b() {
        moy moyVar = this.a;
        moyVar.d.d();
        this.b.close();
        moyVar.e = null;
    }

    @Override // defpackage.mov
    public void c() {
    }
}
