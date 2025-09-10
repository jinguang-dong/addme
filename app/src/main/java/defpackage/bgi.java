package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgi extends bgj {
    private final uiq a;
    private int b;

    public bgi(long j, bgq bgqVar, uiq uiqVar) {
        super(j, bgqVar);
        this.a = uiqVar;
        this.b = 1;
    }

    @Override // defpackage.bgj
    public final bgj b(uiq uiqVar) {
        bgr.w(this);
        return new bgh(this.i, this.h, bgr.p(uiqVar, this.a, true), this);
    }

    @Override // defpackage.bgj
    public final void d() {
        if (this.j) {
            return;
        }
        g();
        super.d();
    }

    @Override // defpackage.bgj
    public final void f() {
        this.b++;
    }

    @Override // defpackage.bgj
    public final void g() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            y();
        }
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
