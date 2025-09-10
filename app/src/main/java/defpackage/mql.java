package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mql extends mpf implements mdc {
    public final mdb q;
    public final mdd r;
    public final mdd s;
    private final mdd t;

    public mql(pfl pflVar, itl itlVar, fvu fvuVar, krj krjVar, mts mtsVar, uem uemVar, ndj ndjVar, hyf hyfVar, qqq qqqVar, gnt gntVar, luj lujVar, owq owqVar, imi imiVar, nfc nfcVar, mte mteVar, owq owqVar2, mos mosVar, mpx mpxVar, mqb mqbVar) {
        super(pflVar, itlVar, fvuVar, krjVar, mtsVar, uemVar, ndjVar, hyfVar, qqqVar, gntVar, lujVar, owqVar, imiVar, nfcVar, mteVar, owqVar2);
        mdd mddVar = new mdd(new mqj(this), mosVar, mpxVar, mqbVar);
        this.r = mddVar;
        this.s = new mdd(new mqk(this), new mcz[0]);
        this.t = new mdd(new mpe(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.q = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.mcy, defpackage.mcz, defpackage.mda
    public final void a() {
        super.a();
        this.q.c();
    }

    @Override // defpackage.mcy, defpackage.mcz, defpackage.mda
    public final void b() {
        super.b();
        this.q.d();
    }

    @Override // defpackage.mcy
    public final void d() {
        mdb mdbVar = this.q;
        if (mdbVar.a() == null) {
            return;
        }
        ((mcy) mdbVar.a().a).d();
    }

    @Override // defpackage.mcy
    public final void e() {
        mdb mdbVar = this.q;
        if (mdbVar.a() == null) {
            return;
        }
        ((mcy) mdbVar.a().a).e();
    }

    @Override // defpackage.mcy, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.q.b();
        this.r.i();
        this.s.i();
        this.t.i();
    }
}
