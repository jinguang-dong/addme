package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhq extends bgf {
    public uiq l;
    public uiq m;
    public final long n;
    private final bgf o;
    private final boolean p;
    private final boolean q;

    /* JADX WARN: Illegal instructions before constructor call */
    public bhq(bgf bgfVar, uiq uiqVar, uiq uiqVar2, boolean z, boolean z2) {
        uiq uiqVarK;
        uiq uiqVarI;
        uiq uiqVar3 = bgr.a;
        super(0L, bgq.a, bgr.p(uiqVar, (bgfVar == null || (uiqVarI = bgfVar.i()) == null) ? bgr.h.a : uiqVarI, z), bgr.q(uiqVar2, (bgfVar == null || (uiqVarK = bgfVar.k()) == null) ? bgr.h.b : uiqVarK));
        this.o = bgfVar;
        this.p = z;
        this.q = z2;
        this.l = this.a;
        this.m = this.b;
        this.n = byi.ac();
    }

    private final bgf F() {
        bgf bgfVar = this.o;
        return bgfVar == null ? bgr.h : bgfVar;
    }

    @Override // defpackage.bgj
    public final void A(bgq bgqVar) {
        bhd.a();
        throw new uer();
    }

    @Override // defpackage.bgj
    public final void B(long j) {
        bhd.a();
        throw new uer();
    }

    @Override // defpackage.bgf
    public final bgf a(uiq uiqVar, uiq uiqVar2) {
        uiq uiqVarP = bgr.p(uiqVar, this.l, true);
        uiq uiqVarQ = bgr.q(uiqVar2, this.m);
        return !this.p ? new bhq(F().a(null, uiqVarQ), uiqVarP, uiqVarQ, false, true) : F().a(uiqVarP, uiqVarQ);
    }

    @Override // defpackage.bgf, defpackage.bgj
    public final bgj b(uiq uiqVar) {
        uiq uiqVarP = bgr.p(uiqVar, this.l, true);
        return !this.p ? bgr.a(F().b(null), uiqVarP, true) : F().b(uiqVarP);
    }

    @Override // defpackage.bgf
    public final bgn c() {
        return F().c();
    }

    @Override // defpackage.bgf, defpackage.bgj
    public final void d() {
        bgf bgfVar;
        D();
        if (!this.q || (bgfVar = this.o) == null) {
            return;
        }
        bgfVar.d();
    }

    @Override // defpackage.bgf, defpackage.bgj
    public final void e() {
        F().e();
    }

    @Override // defpackage.bgf, defpackage.bgj
    public final /* synthetic */ void f() {
        bdq.l();
    }

    @Override // defpackage.bgf, defpackage.bgj
    public final /* synthetic */ void g() {
        bdq.l();
    }

    @Override // defpackage.bgf, defpackage.bgj
    public final int h() {
        return F().h();
    }

    @Override // defpackage.bgf, defpackage.bgj
    public final /* synthetic */ uiq i() {
        return this.l;
    }

    @Override // defpackage.bgf
    /* renamed from: j */
    public final uiq i() {
        return this.l;
    }

    @Override // defpackage.bgf, defpackage.bgj
    public final uiq k() {
        return this.m;
    }

    @Override // defpackage.bgf, defpackage.bgj
    public final void n(bhl bhlVar) {
        F().n(bhlVar);
    }

    @Override // defpackage.bgf, defpackage.bgj
    public final void q(int i) {
        F().q(i);
    }

    @Override // defpackage.bgf, defpackage.bgj
    public final boolean r() {
        F().r();
        return false;
    }

    @Override // defpackage.bgf
    public final zw s() {
        return F().s();
    }

    @Override // defpackage.bgf
    public final void u(zw zwVar) {
        bhd.a();
        throw new uer();
    }

    @Override // defpackage.bgj
    public final long v() {
        return F().v();
    }

    @Override // defpackage.bgj
    public final bgq x() {
        return F().x();
    }
}
