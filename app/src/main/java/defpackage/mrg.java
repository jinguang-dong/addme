package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrg extends mqb implements mdc {
    public final mdb n;
    public final mdd o;
    public final mdd p;

    public mrg(owq owqVar, fvu fvuVar, ndj ndjVar, mts mtsVar, mzz mzzVar, krj krjVar, mwq mwqVar, owq owqVar2, mmk mmkVar, pez pezVar, hyh hyhVar, hbj hbjVar) {
        super(owqVar, fvuVar, ndjVar, mtsVar, mzzVar, krjVar, mwqVar, owqVar2, mmkVar, pezVar, hyhVar, hbjVar);
        this.o = new mdd(new mre(this), new mcz[0]);
        mdd mddVar = new mdd(new mrf(this), new mcz[0]);
        this.p = mddVar;
        mdb mdbVar = new mdb(mddVar, false);
        this.n = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.mpy, defpackage.mcz, defpackage.mda
    public final void a() {
        this.n.c();
    }

    @Override // defpackage.mpy, defpackage.mcz, defpackage.mda
    public final void b() {
        this.n.d();
    }

    @Override // defpackage.mpy
    public final void c() {
        mdb mdbVar = this.n;
        if (mdbVar.a() == null) {
            return;
        }
        ((mpy) mdbVar.a().a).c();
    }

    @Override // defpackage.mpy
    public final void d() {
        mdb mdbVar = this.n;
        if (mdbVar.a() == null) {
            return;
        }
        ((mpy) mdbVar.a().a).d();
    }

    @Override // defpackage.mpy
    public final void e() {
        mdb mdbVar = this.n;
        if (mdbVar.a() == null) {
            return;
        }
        ((mpy) mdbVar.a().a).e();
    }

    @Override // defpackage.mpy, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.n.b();
        this.o.i();
        this.p.i();
    }
}
