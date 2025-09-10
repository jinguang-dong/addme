package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mrr extends msf implements mdc {
    private final mdb b;
    private final mdd c;

    public mrr(owq owqVar, gjj gjjVar, gjn gjnVar) {
        super(owqVar);
        mdd mddVar = new mdd(new mse(this), gjjVar, gjnVar);
        this.c = mddVar;
        mdb mdbVar = new mdb(mddVar, false);
        this.b = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.msf, defpackage.mcz, defpackage.mda
    public final void a() {
        this.b.c();
    }

    @Override // defpackage.msf, defpackage.mcz, defpackage.mda
    public final void b() {
        this.b.d();
    }

    @Override // defpackage.msf, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.b.b();
        this.c.i();
    }
}
