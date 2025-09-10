package defpackage;

import com.google.android.apps.camera.evcomp.EvCompView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hiy extends hiq implements mdc {
    public final mdb o;
    public final mdd p;
    public final mdd q;
    public final mdd r;

    public hiy(uem uemVar, EvCompView evCompView, owq owqVar, owq owqVar2, owq owqVar3, owq owqVar4, gox goxVar, owq owqVar5, rwc rwcVar, owf owfVar, owq owqVar6) {
        super(uemVar, evCompView, owqVar, owqVar2, owqVar3, owqVar4, goxVar, owqVar5, rwcVar, owfVar, owqVar6);
        mdd mddVar = new mdd(new hiv(this), new mcz[0]);
        this.p = mddVar;
        this.q = new mdd(new hiw(this), new mcz[0]);
        this.r = new mdd(new hix(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.o = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.him, defpackage.mcz, defpackage.mda
    public final void a() {
        this.o.c();
    }

    @Override // defpackage.him, defpackage.mcz, defpackage.mda
    public final void b() {
        this.o.d();
    }

    @Override // defpackage.him
    public final void c() {
        mdb mdbVar = this.o;
        if (mdbVar.a() == null) {
            return;
        }
        ((him) mdbVar.a().a).c();
    }

    @Override // defpackage.him
    public final void d(hhy hhyVar) {
        mdb mdbVar = this.o;
        if (mdbVar.a() == null) {
            return;
        }
        ((him) mdbVar.a().a).d(hhyVar);
    }

    @Override // defpackage.him
    public final void e() {
        mdb mdbVar = this.o;
        if (mdbVar.a() == null) {
            return;
        }
        ((him) mdbVar.a().a).e();
    }

    @Override // defpackage.him
    public final void f(float f, hhy hhyVar) {
        mdb mdbVar = this.o;
        if (mdbVar.a() == null) {
            return;
        }
        ((him) mdbVar.a().a).f(f, hhyVar);
    }

    @Override // defpackage.him, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.o.b();
        this.p.i();
        this.q.i();
        this.r.i();
    }
}
