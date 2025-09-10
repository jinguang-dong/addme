package defpackage;

import android.content.res.Resources;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxi extends fqf implements fyt {
    public final fwk a;
    public final fyd b;
    public final ggx c;
    public final uem d;
    public final muu f;
    private final uem g;
    private final Resources h;
    private final fvu i;
    private final owf j;
    private final boolean l;
    private final juh m;
    private final nrc n;
    private our o;
    private final gln p;
    private final ovx q;
    private final hbj r;
    public final Object e = new Object();
    private final gsn s = new jxg(this);
    private final glr k = new jxh(this, 0);

    public jxi(uem uemVar, fwk fwkVar, Resources resources, fvu fvuVar, uem uemVar2, ggx ggxVar, uem uemVar3, gln glnVar, ovx ovxVar, boolean z, juh juhVar, nrc nrcVar, muu muuVar, owf owfVar, hbj hbjVar) {
        this.g = uemVar;
        this.a = fwkVar;
        this.h = resources;
        this.i = fvuVar;
        this.b = (fyd) uemVar2.a();
        this.c = ggxVar;
        this.d = uemVar3;
        this.f = muuVar;
        this.j = owfVar;
        this.r = hbjVar;
        this.p = glnVar;
        this.q = ovxVar;
        this.l = z;
        this.m = juhVar;
        this.n = nrcVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            ((fwn) this.a).m();
        }
    }

    @Override // defpackage.fyt
    public final void d() {
        this.b.m();
    }

    @Override // defpackage.fqf
    public final void eA() {
        synchronized (this.e) {
            this.b.b();
        }
        if (this.l) {
            this.q.a(oxh.FPS_240_HFR_8X);
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
        synchronized (this.e) {
            this.b.e();
            this.a.l(true);
        }
    }

    @Override // defpackage.fyt
    public final void k(boolean z) {
        this.a.g(z);
    }

    @Override // defpackage.fqf
    public final void l() {
        synchronized (this.e) {
            this.o = new our();
            this.m.b(this, nkw.SLOW_MOTION, this.o);
            this.i.A(this.s);
            this.b.g();
            this.a.b(this);
            this.p.a(this.k);
            if (this.r.p(gzo.bJ)) {
                this.f.g(rbb.y, R.string.slow_motion_help_button_accessibility, R.string.mode_video_slomo, false);
                this.o.d(new jkf(this, 13));
                this.o.d(this.j.dK(new juf(this, 3), ojl.ce()));
            }
        }
    }

    @Override // defpackage.fqf
    public final void m() {
        synchronized (this.e) {
            this.b.h();
            fwk fwkVar = this.a;
            fwkVar.m();
            this.o.close();
            fwkVar.k(this);
            this.i.B(this.s);
            this.p.d(this.k);
        }
    }

    @Override // defpackage.fqf
    public final boolean o() {
        boolean zO;
        synchronized (this.e) {
            zO = this.a.o();
        }
        return zO;
    }

    @Override // defpackage.fqf
    public final String r() {
        return this.h.getString(R.string.video_accessibility_peek);
    }

    @Override // defpackage.fqf
    public final void s(Runnable runnable) {
        nrc nrcVar = this.n;
        if (nrcVar.b < nrcVar.a(nkw.SLOW_MOTION)) {
            return;
        }
        runnable.run();
    }

    @Override // defpackage.fqf
    public final void u(int i) {
        synchronized (this.e) {
            this.a.f(i);
        }
    }

    @Override // defpackage.fqf
    public final void v(boolean z) {
        synchronized (this.e) {
            this.a.j(z);
        }
    }

    @Override // defpackage.fqf
    public final void w() {
        synchronized (this.e) {
            this.b.l(((iyu) this.g.a()).K, nkw.SLOW_MOTION);
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
