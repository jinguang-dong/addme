package defpackage;

import android.content.res.Resources;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxx extends fqf implements fyt, mng {
    public final fwk a;
    public final fyd c;
    private final String d;
    private our e;
    private final fvu f;
    private final gkv g;
    private final jyb h;
    private final mni i;
    private final juh j;
    private final nrc k;
    private final iyu l;
    private final hbj m;
    private final ocq o;
    public final Object b = new Object();
    private final gsn n = new jxw(this);

    public jxx(iyu iyuVar, Resources resources, fyd fydVar, fvu fvuVar, fwk fwkVar, gkv gkvVar, ocq ocqVar, hbj hbjVar, jyb jybVar, mni mniVar, juh juhVar, nrc nrcVar) {
        this.l = iyuVar;
        this.d = resources.getString(R.string.video_accessibility_peek);
        this.a = fwkVar;
        this.f = fvuVar;
        this.c = fydVar;
        this.g = gkvVar;
        this.o = ocqVar;
        this.m = hbjVar;
        this.h = jybVar;
        this.i = mniVar;
        this.j = juhVar;
        this.k = nrcVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            ((fwn) this.a).m();
        }
    }

    @Override // defpackage.fyt
    public final void d() {
        this.c.m();
    }

    @Override // defpackage.mng
    public final void e(int i) {
        if (i == 14) {
            this.h.i();
        }
    }

    @Override // defpackage.fqf
    public final void eA() {
        synchronized (this.b) {
            this.c.b();
        }
    }

    @Override // defpackage.fqf
    public final void eB() {
        if (this.u) {
            fwk fwkVar = this.a;
            fwkVar.c(fwkVar.n() ? gnm.FOLD_STATE_CHANGED : gnm.RESOLUTION_SWITCH);
        }
    }

    @Override // defpackage.fqf
    public final void eC() {
        synchronized (this.b) {
            this.c.e();
            this.a.l(true);
            gzi gziVar = gym.a;
            ocq ocqVar = this.o;
            if (ocqVar.ai("amber_edu") == 0) {
                this.g.b();
                ocqVar.ak("amber_edu");
            }
        }
    }

    @Override // defpackage.mng
    public final void eE(int i) {
        if (i == 14) {
            this.h.j();
        }
    }

    @Override // defpackage.fyt
    public final void k(boolean z) {
        this.a.g(z);
    }

    @Override // defpackage.fqf
    public final void l() {
        synchronized (this.b) {
            this.e = new our();
            this.j.b(this, nkw.AMBER, this.e);
            this.f.A(this.n);
            this.i.f(this);
            this.c.g();
            this.a.b(this);
            this.h.i();
            gkv gkvVar = this.g;
            if (gkvVar.b) {
                muu muuVar = gkvVar.g;
                muuVar.g(rbb.k, R.string.cinematic_blur_help_button_accessibility, R.string.mode_amber, false);
                muuVar.h(gkvVar);
            } else {
                gkvVar.g.d(new fvr(gkvVar, 4), R.string.cinematic_blur_help_button_accessibility);
            }
            gkvVar.d();
        }
    }

    @Override // defpackage.fqf
    public final void m() {
        synchronized (this.b) {
            this.f.B(this.n);
            this.i.i(this);
            this.c.h();
            fwk fwkVar = this.a;
            fwkVar.m();
            this.e.close();
            fwkVar.k(this);
            this.h.j();
            this.g.a();
        }
    }

    @Override // defpackage.fqf
    public final boolean o() {
        boolean zO;
        synchronized (this.b) {
            zO = this.a.o();
        }
        return zO;
    }

    @Override // defpackage.fqf
    public final String r() {
        return this.d;
    }

    @Override // defpackage.fqf
    public final void s(Runnable runnable) {
        nrc nrcVar = this.k;
        if (nrcVar.b < nrcVar.a(nkw.AMBER)) {
            return;
        }
        runnable.run();
    }

    @Override // defpackage.fqf
    public final void u(int i) {
        synchronized (this.b) {
            this.a.f(i);
        }
    }

    @Override // defpackage.fqf
    public final void v(boolean z) {
        synchronized (this.b) {
            this.a.j(z);
        }
    }

    @Override // defpackage.fqf
    public final void w() {
        synchronized (this.b) {
            this.c.l(this.l.K, nkw.AMBER);
            this.a.d();
        }
    }

    @Override // defpackage.fyt
    public final void f() {
    }

    @Override // defpackage.fyt
    public final void g() {
    }

    @Override // defpackage.fyt
    public final void h() {
    }

    @Override // defpackage.fyt
    public final void i() {
    }

    @Override // defpackage.fyt
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.fyt
    public final void q(kbk kbkVar) {
    }
}
