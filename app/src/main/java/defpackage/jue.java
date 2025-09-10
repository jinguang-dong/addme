package defpackage;

import android.content.res.Resources;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jue extends fqf implements fyt {
    public final gnt a;
    public final fwk b;
    public final fyd c;
    public final hbj f;
    private final jug g;
    private final juh h;
    private final fvu i;
    private final gkw j;
    private final ipq k;
    private final uem l;
    private final luw m;
    private final out n;
    private final Resources o;
    private our p;
    private final iyu q;
    private final ocq s;
    public final Object d = new Object();
    public boolean e = false;
    private final gsn r = new jud(this);

    public jue(luw luwVar, Resources resources, jug jugVar, juh juhVar, fvu fvuVar, iyu iyuVar, gnt gntVar, fwk fwkVar, gkw gkwVar, ipq ipqVar, uem uemVar, ocq ocqVar, fyd fydVar, out outVar, hbj hbjVar) {
        this.m = luwVar;
        this.o = resources;
        this.g = jugVar;
        this.h = juhVar;
        this.i = fvuVar;
        this.f = hbjVar;
        this.q = iyuVar;
        this.a = gntVar;
        this.b = fwkVar;
        this.j = gkwVar;
        this.k = ipqVar;
        this.l = uemVar;
        this.s = ocqVar;
        this.c = fydVar;
        this.n = outVar;
    }

    public final void b(gnm gnmVar) {
        ((ViewfinderCover) ((ngx) this.l).a().e).o(nkw.ROOSTER, new jnw(this, gnmVar, 10));
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            ((fwn) this.b).m();
        }
    }

    @Override // defpackage.fyt
    public final void d() {
        this.c.m();
    }

    @Override // defpackage.fqf
    public final void eA() {
        synchronized (this.d) {
            this.c.b();
        }
    }

    @Override // defpackage.fqf
    public final void eB() {
        if (this.u) {
            fwk fwkVar = this.b;
            fwkVar.c(fwkVar.n() ? gnm.FOLD_STATE_CHANGED : gnm.RESOLUTION_SWITCH);
        }
    }

    @Override // defpackage.fqf
    public final void eC() {
        synchronized (this.d) {
            this.c.e();
            this.b.l(true);
            ocq ocqVar = this.s;
            if (ocqVar.ai("cinematic_pan_edu") == 0) {
                this.j.b();
                ocqVar.ak("cinematic_pan_edu");
            }
        }
    }

    @Override // defpackage.fyt
    public final void f() {
        this.e = false;
    }

    @Override // defpackage.fyt
    public final void g() {
        this.e = false;
    }

    @Override // defpackage.fyt
    public final void h() {
        this.e = false;
    }

    @Override // defpackage.fyt
    public final void i() {
        if (this.g.b()) {
            this.m.a(lty.RES_1080P);
            this.e = true;
        }
    }

    @Override // defpackage.fyt
    public final void k(boolean z) {
        this.b.g(z);
    }

    @Override // defpackage.fqf
    public final void l() {
        synchronized (this.d) {
            this.p = new our();
            this.h.b(this, nkw.ROOSTER, this.p);
            this.k.a(new juc(this, 0), new juc(this, 2), this.p);
            gkw gkwVar = this.j;
            if (gkwVar.a) {
                muu muuVar = gkwVar.b;
                muuVar.g(rbb.n, R.string.cinematic_pan_help_button_accessibility, R.string.mode_rooster, false);
                muuVar.h(gkwVar);
            } else {
                gkwVar.b.d(new fvr(gkwVar, 5), R.string.cinematic_pan_help_button_accessibility);
            }
            gkwVar.c();
            this.i.A(this.r);
            this.b.b(this);
            this.p.d(this.m.dK(new jxm(this, 1), this.n));
            this.c.g();
        }
    }

    @Override // defpackage.fqf
    public final void m() {
        synchronized (this.d) {
            this.j.a();
            fwk fwkVar = this.b;
            fwkVar.k(this);
            this.i.B(this.r);
            this.c.h();
            fwkVar.m();
            this.p.close();
        }
    }

    @Override // defpackage.fqf
    public final boolean o() {
        boolean zO;
        synchronized (this.d) {
            zO = this.b.o();
        }
        return zO;
    }

    @Override // defpackage.fqf
    public final String r() {
        return this.o.getString(R.string.video_accessibility_peek);
    }

    @Override // defpackage.fqf
    public final void u(int i) {
        synchronized (this.d) {
            this.b.f(i);
        }
    }

    @Override // defpackage.fqf
    public final void v(boolean z) {
        synchronized (this.d) {
            this.b.j(z);
        }
    }

    @Override // defpackage.fqf
    public final void w() {
        synchronized (this.d) {
            this.c.l(this.q.K, nkw.ROOSTER);
            this.b.d();
        }
    }

    @Override // defpackage.fyt
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.fyt
    public final void q(kbk kbkVar) {
    }
}
