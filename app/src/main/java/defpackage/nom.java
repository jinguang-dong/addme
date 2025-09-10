package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nom extends nov implements mdc {
    public final mdb a;
    public final mdd b = new mdd(new noj(this), new mcz[0]);
    public final mdd c = new mdd(new nok(this), new mcz[0]);
    private final mdd l;

    public nom() {
        mdd mddVar = new mdd(new nol(this), new mcz[0]);
        this.l = mddVar;
        mdb mdbVar = new mdb(mddVar, false);
        this.a = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.nor, defpackage.mcz, defpackage.mda
    public final void a() {
        this.a.c();
    }

    @Override // defpackage.nor, defpackage.mcz, defpackage.mda
    public final void b() {
        this.a.d();
    }

    @Override // defpackage.nor
    public final void c() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((nor) mdbVar.a().a).c();
    }

    @Override // defpackage.nor
    public final void d() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((nor) mdbVar.a().a).d();
    }

    @Override // defpackage.nor
    public final void e() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((nor) mdbVar.a().a).e();
    }

    @Override // defpackage.nor
    public final void f() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((nor) mdbVar.a().a).f();
    }

    @Override // defpackage.nor
    public final void fb() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((nor) mdbVar.a().a).fb();
    }

    @Override // defpackage.nor, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.nor
    public final void h() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((nor) mdbVar.a().a).h();
    }

    @Override // defpackage.mdc
    public final void i() {
        this.a.b();
        this.b.i();
        this.c.i();
        this.l.i();
    }

    @Override // defpackage.nor
    public final void j() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((nor) mdbVar.a().a).j();
    }

    @Override // defpackage.nov, defpackage.nor
    public final void k(nox noxVar, Uri uri, nod nodVar, noq noqVar, int i, boolean z, boolean z2) {
        mdb mdbVar = this.a;
        if (mdbVar.a() != null) {
            ((nor) mdbVar.a().a).k(noxVar, uri, nodVar, noqVar, i, z, z2);
            return;
        }
        noxVar.getClass();
        this.k = noxVar;
        this.d = noxVar.f;
        this.e = nodVar;
        this.f = noqVar;
        this.g = uri;
        this.h = i;
        this.i = z;
        this.j = z2;
    }
}
