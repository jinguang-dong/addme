package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhr extends bgj {
    public uiq a;
    public final long b;
    private final bgj c;
    private final boolean d;
    private final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhr(bgj bgjVar, uiq uiqVar, boolean z, boolean z2) {
        uiq uiqVarI;
        super(0L, bgq.a);
        uiq uiqVar2 = bgr.a;
        this.c = bgjVar;
        this.d = z;
        this.e = z2;
        this.a = bgr.p(uiqVar, (bgjVar == null || (uiqVarI = bgjVar.i()) == null) ? bgr.h.a : uiqVarI, z);
        this.b = byi.ac();
    }

    private final bgj a() {
        bgj bgjVar = this.c;
        return bgjVar == null ? bgr.h : bgjVar;
    }

    @Override // defpackage.bgj
    public final bgj b(uiq uiqVar) {
        uiq uiqVarP = bgr.p(uiqVar, this.a, true);
        return !this.d ? bgr.a(a().b(null), uiqVarP, true) : a().b(uiqVarP);
    }

    @Override // defpackage.bgj
    public final void d() {
        bgj bgjVar;
        D();
        if (!this.e || (bgjVar = this.c) == null) {
            return;
        }
        bgjVar.d();
    }

    @Override // defpackage.bgj
    public final void e() {
        a().e();
    }

    @Override // defpackage.bgj
    public final /* synthetic */ void f() {
        bdq.l();
    }

    @Override // defpackage.bgj
    public final /* synthetic */ void g() {
        bdq.l();
    }

    @Override // defpackage.bgj
    public final /* synthetic */ uiq i() {
        return this.a;
    }

    @Override // defpackage.bgj
    public final uiq k() {
        return null;
    }

    @Override // defpackage.bgj
    public final void n(bhl bhlVar) {
        a().n(bhlVar);
    }

    @Override // defpackage.bgj
    public final boolean r() {
        return a().r();
    }

    @Override // defpackage.bgj
    public final long v() {
        return a().v();
    }

    @Override // defpackage.bgj
    public final bgq x() {
        return a().x();
    }
}
