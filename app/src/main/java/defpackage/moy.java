package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class moy extends mov implements mdc {
    public final out a;
    public final rwc b;
    public final owq c;
    public final hie d;
    public kgw e = null;
    public final mdb f;
    public final mdd g;
    public final mdd h;
    public final qrh i;
    public final mwq j;

    public moy(out outVar, qrh qrhVar, mwq mwqVar, hie hieVar, rwc rwcVar, owq owqVar) {
        this.a = outVar;
        this.i = qrhVar;
        this.j = mwqVar;
        this.d = hieVar;
        this.b = rwcVar;
        this.c = owqVar;
        mdd mddVar = new mdd(new mqh(this), new mcz[0]);
        this.g = mddVar;
        this.h = new mdd(new mqi(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.f = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.mov, defpackage.mcz, defpackage.mda
    public final void a() {
        this.f.c();
    }

    @Override // defpackage.mov, defpackage.mcz, defpackage.mda
    public final void b() {
        this.f.d();
    }

    @Override // defpackage.mov
    public final void c() {
        if (this.f.a() == null) {
            return;
        }
        ((mov) this.f.a().a).c();
    }

    @Override // defpackage.mov
    public final void d(kgw kgwVar, our ourVar) {
        if (this.f.a() == null) {
            return;
        }
        ((mov) this.f.a().a).d(kgwVar, ourVar);
    }

    @Override // defpackage.mov, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.f.b();
        this.g.i();
        this.h.i();
    }
}
