package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import androidx.wear.ambient.AmbientDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class maa extends mau implements mdc {
    public final mdb a;
    public final mdd b;
    public final mdd c;
    public final mdd d;
    public final mdd e;
    public final mdd f;
    private final mdd r;

    public maa(Context context, mav mavVar, AmbientDelegate ambientDelegate, hbw hbwVar, mah mahVar, Handler handler, Resources resources, may mayVar, mal malVar, mbf mbfVar) {
        super(context, mavVar, ambientDelegate, hbwVar, mahVar, handler, resources, mayVar, malVar, mbfVar);
        mdd mddVar = new mdd(new lzu(this), new mcz[0]);
        this.b = mddVar;
        this.c = new mdd(new lzv(this), new mcz[0]);
        this.d = new mdd(new lzw(this), new mcz[0]);
        this.e = new mdd(new lzx(this), new mcz[0]);
        this.f = new mdd(new lzy(this), new mcz[0]);
        this.r = new mdd(new lzz(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.a = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.mau, defpackage.mcz, defpackage.mda
    public final void a() {
        this.a.c();
    }

    @Override // defpackage.mau, defpackage.mcz, defpackage.mda
    public final void b() {
        this.a.d();
    }

    @Override // defpackage.mau, defpackage.mam
    public final void d() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mam) mdbVar.a().a).d();
    }

    @Override // defpackage.mau, defpackage.mam
    public final void e() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mam) mdbVar.a().a).e();
    }

    @Override // defpackage.mau, defpackage.mam
    public final void eT() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mam) mdbVar.a().a).eT();
    }

    @Override // defpackage.mau, defpackage.mam, defpackage.jhe
    public final void eb() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mam) mdbVar.a().a).eb();
    }

    @Override // defpackage.mau, defpackage.mam
    public final void f(fqb fqbVar) {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mam) mdbVar.a().a).f(fqbVar);
    }

    @Override // defpackage.mau, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mau, defpackage.mam
    public final void h(fqb fqbVar) {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mam) mdbVar.a().a).h(fqbVar);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.a.b();
        this.b.i();
        this.c.i();
        this.d.i();
        this.e.i();
        this.f.i();
        this.r.i();
    }

    @Override // defpackage.mau, defpackage.mam
    public final void j() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mam) mdbVar.a().a).j();
    }

    @Override // defpackage.mau, defpackage.mam
    public final void k() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mam) mdbVar.a().a).k();
    }

    @Override // defpackage.mau, defpackage.mam
    public final void l() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mam) mdbVar.a().a).l();
    }

    @Override // defpackage.mau, defpackage.mam
    public final void m() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mam) mdbVar.a().a).m();
    }

    @Override // defpackage.mau, defpackage.mam
    public final void n() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mam) mdbVar.a().a).n();
    }

    @Override // defpackage.mau, defpackage.mam, defpackage.jfs
    public final boolean r() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return false;
        }
        return ((mam) mdbVar.a().a).r();
    }
}
