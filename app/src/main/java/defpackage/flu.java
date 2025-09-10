package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class flu extends fln implements mdc {
    public final mdb q;
    public final mdd r;
    public final mdd s;
    public final mdd t;
    public final mdd u;
    private final mdd v;

    public flu(krj krjVar, mzz mzzVar, fvu fvuVar, ktx ktxVar, ndj ndjVar, fjz fjzVar, ovx ovxVar, ovx ovxVar2, fif fifVar, ocq ocqVar, fke fkeVar, nca ncaVar, owf owfVar) {
        super(krjVar, mzzVar, fvuVar, ktxVar, ndjVar, fjzVar, ovxVar, ovxVar2, fifVar, ocqVar, fkeVar, ncaVar, owfVar);
        this.r = new mdd(new flp(this), new mcz[0]);
        this.s = new mdd(new flq(this), new mcz[0]);
        this.t = new mdd(new flr(this), new mcz[0]);
        mdd mddVar = new mdd(new fls(this), new mcz[0]);
        this.v = mddVar;
        this.u = new mdd(new flt(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.q = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.flg, defpackage.mcz, defpackage.mda
    public final void a() {
        this.q.c();
    }

    @Override // defpackage.flg, defpackage.mcz, defpackage.mda
    public final void b() {
        this.q.d();
    }

    @Override // defpackage.flg
    public final void c() {
        mdb mdbVar = this.q;
        if (mdbVar.a() == null) {
            return;
        }
        ((flg) mdbVar.a().a).c();
    }

    @Override // defpackage.flg
    public final void d() {
        mdb mdbVar = this.q;
        if (mdbVar.a() == null) {
            return;
        }
        ((flg) mdbVar.a().a).d();
    }

    @Override // defpackage.flg
    public final void e() {
        mdb mdbVar = this.q;
        if (mdbVar.a() == null) {
            return;
        }
        ((flg) mdbVar.a().a).e();
    }

    @Override // defpackage.flg
    public final void f() {
        mdb mdbVar = this.q;
        if (mdbVar.a() == null) {
            return;
        }
        ((flg) mdbVar.a().a).f();
    }

    @Override // defpackage.flg, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.q.b();
        this.r.i();
        this.s.i();
        this.t.i();
        this.v.i();
        this.u.i();
    }
}
