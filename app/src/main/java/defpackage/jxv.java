package defpackage;

import android.content.res.Resources;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxv extends fqf implements fyt {
    public final luw a;
    public final fyd b;
    public final fwk c;
    public final owq e;
    public lty f;
    public final got g;
    private final out h;
    private final uem i;
    private final luv j;
    private final fvu k;
    private final Resources l;
    private final juh m;
    private final owq n;
    private final glt o;
    private final owq p;
    private final gna q;
    private our r;
    private boolean s;
    private final iyu w;
    private final luj x;
    private final rwr y;
    public final Object d = new Object();
    private boolean v = false;
    private final gsn z = new jxu(this);

    public jxv(out outVar, uem uemVar, luw luwVar, luv luvVar, fyd fydVar, fwk fwkVar, iyu iyuVar, fvu fvuVar, Resources resources, juh juhVar, owq owqVar, rwr rwrVar, luj lujVar, glt gltVar, got gotVar, owq owqVar2, gna gnaVar) {
        this.h = outVar;
        this.i = uemVar;
        this.a = luwVar;
        this.j = luvVar;
        this.b = fydVar;
        this.c = fwkVar;
        this.w = iyuVar;
        this.k = fvuVar;
        this.l = resources;
        this.m = juhVar;
        this.n = owqVar;
        this.y = rwrVar;
        this.x = lujVar;
        this.o = gltVar;
        this.g = gotVar;
        this.e = owqVar2;
        this.p = lujVar.a(luf.aN);
        this.q = gnaVar;
    }

    public final void b(gnm gnmVar) {
        if (this.u) {
            ((ViewfinderCover) ((ngx) this.i).a().e).o(nkw.VIDEO_NIGHT_SIGHT, new jnw(this, gnmVar, 13));
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            ((fwn) this.c).m();
        }
    }

    @Override // defpackage.fyt
    public final void d() {
        synchronized (this.d) {
            this.b.m();
        }
    }

    @Override // defpackage.fqf
    protected final void eA() {
        synchronized (this.d) {
            this.b.b();
        }
    }

    @Override // defpackage.fqf
    public final void eB() {
        if (this.u) {
            fwk fwkVar = this.c;
            fwkVar.c(fwkVar.n() ? gnm.FOLD_STATE_CHANGED : gnm.RESOLUTION_SWITCH);
        }
    }

    @Override // defpackage.fqf
    protected final void eC() {
        synchronized (this.d) {
            this.b.e();
            this.c.l(true);
            if (this.v) {
                this.y.h();
                this.x.d(luf.ag, true);
            }
        }
    }

    @Override // defpackage.fyt
    public final void f() {
        this.e.a(true);
    }

    @Override // defpackage.fyt
    public final void g() {
        this.h.execute(new jxr(this, 3));
    }

    @Override // defpackage.fyt
    public final void k(boolean z) {
        synchronized (this.d) {
            this.c.g(z);
        }
    }

    @Override // defpackage.fqf
    protected final void l() {
        synchronized (this.d) {
            this.n.a(true);
            this.r = new our();
            luw luwVar = this.a;
            this.f = (lty) luwVar.dL();
            this.k.A(this.z);
            fyd fydVar = this.b;
            fydVar.g();
            this.c.b(this);
            juh juhVar = this.m;
            nkw nkwVar = nkw.VIDEO_NIGHT_SIGHT;
            juhVar.b(this, nkwVar, this.r);
            rwr rwrVar = this.y;
            if (rwrVar.a) {
                Object obj = rwrVar.c;
                ((muu) obj).g(rbb.z, R.string.nsv_help_button_accessibility, R.string.mode_video_night_sight, false);
                ((muu) obj).h(rwrVar);
            } else {
                ((muu) rwrVar.c).d(new fvr(rwrVar, 13), R.string.nsv_help_button_accessibility);
            }
            rwrVar.i();
            glt gltVar = this.o;
            gltVar.c(nkwVar);
            this.q.f();
            boolean zBooleanValue = ((Boolean) ((ovx) this.x.a(luf.ag)).d).booleanValue();
            this.v = !zBooleanValue;
            if (zBooleanValue) {
                gltVar.b();
            }
            our ourVar = this.r;
            owq owqVar = this.p;
            jxn jxnVar = new jxn(this, 2);
            out outVar = this.h;
            ourVar.d(owqVar.dK(jxnVar, outVar));
            this.r.d(luwVar.dK(new jxm(this, 5), outVar));
            this.r.d(this.j.dK(new jxm(this, 6), outVar));
            our ourVar2 = this.r;
            owq owqVar2 = this.e;
            fydVar.getClass();
            ourVar2.d(owqVar2.dK(new juf(fydVar, 6), outVar));
        }
    }

    @Override // defpackage.fqf
    protected final void m() {
        synchronized (this.d) {
            this.k.B(this.z);
            fwk fwkVar = this.c;
            fwkVar.m();
            this.b.h();
            fwkVar.k(this);
            this.r.close();
            this.n.a(Boolean.valueOf(this.s));
            this.y.g();
            this.o.d();
            this.q.g();
            this.v = false;
        }
    }

    @Override // defpackage.fqf
    public final boolean o() {
        boolean zO;
        synchronized (this.d) {
            zO = this.c.o();
        }
        return zO;
    }

    @Override // defpackage.fqf
    public final String r() {
        return this.l.getString(R.string.video_accessibility_peek);
    }

    @Override // defpackage.fqf
    public final void u(int i) {
        synchronized (this.d) {
            this.c.f(i);
        }
    }

    @Override // defpackage.fqf
    public final void v(boolean z) {
        synchronized (this.d) {
            this.c.j(z);
        }
    }

    @Override // defpackage.fqf
    public final void w() {
        synchronized (this.d) {
            this.s = ((Boolean) this.n.dL()).booleanValue();
            this.b.l(this.w.K, nkw.VIDEO_NIGHT_SIGHT);
            this.c.d();
        }
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
