package defpackage;

import com.google.android.apps.camera.ui.views.GradientBar;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lra extends lqt implements mdc {
    public final tzj a;
    public final mdb b;
    public final mdd c = new mdd(new lqj(this), new mcz[0]);
    public final mdd d = new mdd(new lqk(this), new mcz[0]);
    public final mdd e;
    public final mdd f;
    public final mdy g;
    private final fvu h;
    private final owf i;
    private final owf j;
    private final nll k;
    private final mgr l;
    private final luj m;

    public lra(mdy mdyVar, fvu fvuVar, tzj tzjVar, nll nllVar, mgr mgrVar, owq owqVar, luj lujVar, owf owfVar) {
        this.g = mdyVar;
        this.a = tzjVar;
        this.h = fvuVar;
        this.k = nllVar;
        this.l = mgrVar;
        this.i = owqVar;
        this.m = lujVar;
        this.j = owfVar;
        mdd mddVar = new mdd(new lql(this), new mcz[0]);
        this.e = mddVar;
        this.f = new mdd(new lqm(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.b = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.lqt, defpackage.mcz, defpackage.mda
    public final void a() {
        this.b.c();
    }

    @Override // defpackage.lqt, defpackage.mcz, defpackage.mda
    public final void b() {
        this.b.d();
    }

    @Override // defpackage.lqt
    public final void c() {
        if (this.b.a() == null) {
            return;
        }
        ((lqt) this.b.a().a).c();
    }

    @Override // defpackage.lqt
    public final void d() {
        if (this.b.a() == null) {
            return;
        }
        ((lqt) this.b.a().a).d();
    }

    @Override // defpackage.lqt
    public final void e() {
        if (this.b.a() == null) {
            return;
        }
        ((lqt) this.b.a().a).e();
    }

    @Override // defpackage.lqt
    public final void f() {
        if (this.b.a() == null) {
            return;
        }
        ((lqt) this.b.a().a).f();
    }

    @Override // defpackage.lqt, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    public final void h() {
        this.h.o(true);
        this.m.d(luf.D, true);
        if (((Boolean) this.j.dL()).booleanValue()) {
            this.k.c(1.0f);
        } else if (k()) {
            this.k.d(((lrb) this.a.a()).h);
        } else {
            this.k.e();
        }
        this.l.a(true);
        lrb lrbVar = (lrb) this.a.a();
        boolean zK = k();
        int i = lrbVar.c;
        nlb nlbVar = lrbVar.j;
        int iA = lrbVar.a(zK);
        nlbVar.a(i);
        lrbVar.k.a(lrbVar.e);
        lrbVar.l.a(lrbVar.g);
        lrbVar.m.setBackgroundColor(iA);
        ((GradientBar) ((nac) lrbVar.i).a).setBackgroundColor(0);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.b.b();
        this.c.i();
        this.d.i();
        this.e.i();
        this.f.i();
    }

    public final void j() {
        this.h.o(false);
        this.k.b();
        ((lrb) this.a.a()).b();
        this.m.d(luf.D, false);
        this.l.a(false);
    }

    public final boolean k() {
        return ((nkw) this.i.dL()) == nkw.NIGHT_SIGHT;
    }
}
