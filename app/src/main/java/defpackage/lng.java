package defpackage;

import com.google.android.apps.camera.progressoverlay.ProgressOverlay;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lng extends lnd implements mdc {
    public final ProgressOverlay a;
    public boolean b;
    public final mdb c;
    public final mdd d;
    public final mdd e;

    public lng(ProgressOverlay progressOverlay, lmy lmyVar) {
        out.a();
        this.a = progressOverlay;
        mdd mddVar = new mdd(new lmu(this), new mcz[0]);
        this.d = mddVar;
        this.e = new mdd(new lmv(this), lmyVar);
        mdb mdbVar = new mdb(mddVar, false);
        this.c = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.lnd, defpackage.mcz, defpackage.mda
    public final void a() {
        this.c.c();
    }

    @Override // defpackage.lnd, defpackage.mcz, defpackage.mda
    public final void b() {
        this.c.d();
    }

    @Override // defpackage.lnd
    public final void c() {
        if (this.c.a() == null) {
            return;
        }
        ((lnd) this.c.a().a).c();
    }

    @Override // defpackage.lnd
    public final void d() {
        if (this.c.a() == null) {
            return;
        }
        ((lnd) this.c.a().a).d();
    }

    @Override // defpackage.lnd, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.c.b();
        this.d.i();
        this.e.i();
    }
}
