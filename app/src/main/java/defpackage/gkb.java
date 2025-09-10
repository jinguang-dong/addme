package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class gkb extends gjy {
    final /* synthetic */ gkd b;

    public gkb(gkd gkdVar) {
        this.b = gkdVar;
    }

    @Override // defpackage.gjy, defpackage.mcz, defpackage.mda
    public final void a() {
        this.b.k = this;
    }

    @Override // defpackage.gjw
    public final int e() {
        return 1;
    }

    @Override // defpackage.gjy, defpackage.gjw
    public void f() {
        boolean z;
        gkd gkdVar = this.b;
        gkdVar.n.g();
        if (gkdVar.l.J) {
            gzi gziVar = gym.a;
            z = false;
        } else {
            z = true;
        }
        gkdVar.e.v(true, z);
        mzz mzzVar = gkdVar.h;
        mzzVar.w(false);
        mzzVar.m(false);
        gkdVar.f.ai();
        gkdVar.g.d(false);
        rwc rwcVar = gkdVar.i;
        if (rwcVar.h() && gkdVar.j.i()) {
            gmt gmtVar = (gmt) rwcVar.c();
            gmtVar.b.set(true);
            if (gmtVar.f.equals(gho.LOCKED)) {
                gmtVar.j.a(moa.ACTIVE);
                gmtVar.a();
            }
        }
        nql.b();
    }

    @Override // defpackage.gjy, defpackage.gjw
    public final void l(gaw gawVar) {
        this.b.l = gawVar;
    }
}
