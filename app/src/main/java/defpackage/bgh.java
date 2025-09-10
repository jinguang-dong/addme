package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgh extends bgj {
    private final uiq a;
    private final bgj b;

    public bgh(long j, bgq bgqVar, uiq uiqVar, bgj bgjVar) {
        super(j, bgqVar);
        this.a = uiqVar;
        this.b = bgjVar;
        bgjVar.f();
    }

    @Override // defpackage.bgj
    public final /* bridge */ /* synthetic */ bgj b(uiq uiqVar) {
        return new bgh(this.i, this.h, bgr.p(uiqVar, this.a, true), this.b);
    }

    @Override // defpackage.bgj
    public final void d() {
        if (this.j) {
            return;
        }
        long j = this.i;
        bgj bgjVar = this.b;
        if (j != bgjVar.v()) {
            y();
        }
        bgjVar.g();
        super.d();
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
    public final /* bridge */ /* synthetic */ void n(bhl bhlVar) {
        bgr.A();
        throw new uer();
    }

    @Override // defpackage.bgj
    public final boolean r() {
        return true;
    }

    @Override // defpackage.bgj
    public final void e() {
    }
}
