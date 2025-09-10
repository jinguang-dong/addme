package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mrm extends mrx implements mdc {
    public final mdb a;
    public final mdd b;
    public final mdd c;

    public mrm(owq owqVar, fvu fvuVar, ndj ndjVar, Window window, mts mtsVar, pfl pflVar, krj krjVar, mzz mzzVar, mte mteVar, jjn jjnVar, mqb mqbVar) {
        super(owqVar, fvuVar, ndjVar, window, mtsVar, pflVar, krjVar, mzzVar, mteVar, jjnVar);
        mdd mddVar = new mdd(new mrk(this), mqbVar);
        this.b = mddVar;
        this.c = new mdd(new mrl(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.a = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.mrx, defpackage.mru, defpackage.mcz, defpackage.mda
    public final void a() {
        super.a();
        this.a.c();
    }

    @Override // defpackage.mrx, defpackage.mru, defpackage.mcz, defpackage.mda
    public final void b() {
        super.b();
        this.a.d();
    }

    @Override // defpackage.mru
    public final void c() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mru) mdbVar.a().a).c();
    }

    @Override // defpackage.mru
    public final void d() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mru) mdbVar.a().a).d();
    }

    @Override // defpackage.mru, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.a.b();
        this.b.i();
        this.c.i();
    }
}
