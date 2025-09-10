package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fqf implements paq {
    private static final sgv a = sgv.g("fqf");
    public boolean t;
    public boolean u;

    public boolean A() {
        return false;
    }

    public boolean B() {
        return true;
    }

    protected void C(int i) {
        eC();
    }

    public final void D(int i) {
        out.a();
        rnt.M(this.t, "Cannot resume a stopped module");
        if (this.u) {
            ((sgt) a.c().M(329)).s("Duplicate call to resumeModule; skipping resume.");
        } else {
            this.u = true;
            C(i);
        }
    }

    public final void F() {
        out.a();
        if (!this.t) {
            ((sgt) a.c().M(328)).s("Module is already stopped; skipping pause.");
        } else if (!this.u) {
            ((sgt) a.c().M(327)).s("Duplicate call to pauseModule; skipping pause.");
        } else {
            this.u = false;
            p();
        }
    }

    public rwc a() {
        return rvk.a;
    }

    protected abstract void eA();

    protected abstract void eC();

    public rwc eD() {
        return rvk.a;
    }

    protected abstract void l();

    protected abstract void m();

    public boolean o() {
        throw null;
    }

    protected void p() {
        eA();
    }

    public String r() {
        return null;
    }

    public final void x() {
        F();
    }

    public final void y() {
        out.a();
        if (this.u) {
            ((sgt) a.c().M(331)).s("Module is already resumed; skipping start.");
        } else if (this.t) {
            ((sgt) a.c().M(330)).s("Duplicate call to startModule; skipping start.");
        } else {
            this.t = true;
            l();
        }
    }

    public final void z() {
        out.a();
        if (this.u) {
            ((sgt) a.c().M(333)).s("Attempting to stop a resumed module!");
            x();
        }
        if (!this.t) {
            ((sgt) a.c().M(332)).s("Duplicate call to stopModule; skipping stop.");
        } else {
            this.t = false;
            m();
        }
    }

    public void E() {
    }

    public void eB() {
    }

    public void n() {
    }

    public void w() {
    }

    public void s(Runnable runnable) {
    }

    public void t(ena enaVar) {
    }

    public void u(int i) {
    }

    public void v(boolean z) {
    }
}
