package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqe extends mos implements mdc {
    public final mdb j;
    public final mdd k;
    public final mdd l;

    public mqe(mbj mbjVar, fvu fvuVar, ndj ndjVar, mts mtsVar, mzz mzzVar, krj krjVar, mwq mwqVar, mmk mmkVar) {
        super(mbjVar, fvuVar, ndjVar, mtsVar, mzzVar, krjVar, mwqVar, mmkVar);
        this.k = new mdd(new mqc(this), new mcz[0]);
        mdd mddVar = new mdd(new mqd(this), new mcz[0]);
        this.l = mddVar;
        mdb mdbVar = new mdb(mddVar, false);
        this.j = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.mop, defpackage.mcz, defpackage.mda
    public final void a() {
        this.j.c();
    }

    @Override // defpackage.mop, defpackage.mcz, defpackage.mda
    public final void b() {
        this.j.d();
    }

    @Override // defpackage.mop
    public final void c() {
        mdb mdbVar = this.j;
        if (mdbVar.a() == null) {
            return;
        }
        ((mop) mdbVar.a().a).c();
    }

    @Override // defpackage.mop
    public final void d() {
        mdb mdbVar = this.j;
        if (mdbVar.a() == null) {
            return;
        }
        ((mop) mdbVar.a().a).d();
    }

    @Override // defpackage.mop, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.j.b();
        this.k.i();
        this.l.i();
    }
}
