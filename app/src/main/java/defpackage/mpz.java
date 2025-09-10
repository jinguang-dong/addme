package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
class mpz extends mpy {
    final /* synthetic */ mqb a;

    public mpz(mqb mqbVar) {
        this.a = mqbVar;
    }

    private final void f() throws Resources.NotFoundException {
        mqb mqbVar = this.a;
        mqbVar.c.r();
        nkw nkwVar = (nkw) mqbVar.f.dL();
        mzz mzzVar = mqbVar.a;
        mzzVar.w(mzzVar.t(nkwVar));
        mqbVar.k.j();
    }

    @Override // defpackage.mpy, defpackage.mcz, defpackage.mda
    public final void a() throws Resources.NotFoundException {
        mqb mqbVar = this.a;
        mqbVar.b.a(true);
        mzz mzzVar = mqbVar.a;
        mqbVar.j = mzzVar.s();
        mzzVar.m(false);
        mqbVar.g.b(false);
        mqbVar.c.h();
        mzzVar.w(false);
        mqbVar.d.T();
        mqbVar.e.d(false);
        mqbVar.k.k();
        mqbVar.l.i();
        nql.b();
    }

    @Override // defpackage.mpy, defpackage.mcz, defpackage.mda
    public final void b() throws Resources.NotFoundException {
        mqb mqbVar = this.a;
        mqbVar.b.a(false);
        mqbVar.a.m(mqbVar.j);
        if (!mqbVar.i || !mqbVar.h.k()) {
            f();
        }
        mqbVar.e.d(true);
        nql.c();
        if (((Boolean) ((ovx) mqbVar.m.a).d).booleanValue()) {
            mqbVar.g.f();
        }
    }

    @Override // defpackage.mpy
    public void c() {
        mqb mqbVar = this.a;
        if (mqbVar.h.k() && mqbVar.i) {
            f();
        }
        mqbVar.d.f();
    }

    @Override // defpackage.mpy
    public void e() {
        this.a.d.ap();
    }
}
