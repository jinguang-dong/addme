package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.ar.core.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jxt extends fqf implements fyt {
    public static final sgv a = sgv.g("jxt");
    public final fwk b;
    public final fyd c;
    public gaw g;
    public final iyu h;
    public final ngw i;
    private final Resources j;
    private final fvu k;
    private final gfn l;
    private final juh m;
    private final Executor n;
    private final hem o;
    private our p;
    public final Object d = new Object();
    public rwc e = rvk.a;
    public boolean f = false;
    private final gsn q = new jxs(this);

    public jxt(iyu iyuVar, fwk fwkVar, Resources resources, fvu fvuVar, uem uemVar, ngw ngwVar, Executor executor, gfn gfnVar, hem hemVar, juh juhVar) {
        this.h = iyuVar;
        this.b = fwkVar;
        this.j = resources;
        this.k = fvuVar;
        this.c = (fyd) uemVar.a();
        this.l = gfnVar;
        this.m = juhVar;
        this.i = ngwVar;
        this.n = executor;
        this.o = hemVar;
    }

    public final void b() {
        if (this.e.h()) {
            this.n.execute(new jnw(this, (Uri) this.e.c(), 12));
        }
    }

    public final void c() {
        b();
        fyd fydVar = this.c;
        fydVar.f.a();
        ojl.ce().execute(new fxs(fydVar, 4));
        this.b.c(gnm.b);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.n.execute(new jxr(this, 2));
    }

    @Override // defpackage.fqf
    public final void eA() {
        synchronized (this.d) {
            this.c.b();
        }
    }

    @Override // defpackage.fqf
    public final void eB() {
        if (this.t) {
            fwk fwkVar = this.b;
            fwkVar.c(fwkVar.n() ? gnm.FOLD_STATE_CHANGED : gnm.RESOLUTION_SWITCH);
        }
    }

    @Override // defpackage.fqf
    public final void eC() {
        synchronized (this.d) {
            fyd fydVar = this.c;
            fydVar.e();
            this.b.l(fydVar.n() != 4);
        }
    }

    @Override // defpackage.fyt
    public final void g() {
        synchronized (this.d) {
            fwk fwkVar = this.b;
            if (fwkVar.a() != null) {
                this.g = fwkVar.a().q;
            }
        }
    }

    @Override // defpackage.fyt
    public final void k(boolean z) {
        fyd fydVar = this.c;
        fydVar.n();
        synchronized (this.d) {
            if (fydVar.n() == 4) {
                rnt.M(this.e.h(), "URI not set.");
                Intent intent = new Intent();
                intent.setData((Uri) this.e.c());
                intent.addFlags(1);
                this.f = true;
                this.h.h(intent);
            } else {
                this.b.g(z);
            }
        }
    }

    @Override // defpackage.fqf
    public final void l() {
        synchronized (this.d) {
            this.p = new our();
            this.m.b(this, nkw.VIDEO_INTENT, this.p);
            this.k.A(this.q);
            this.c.g();
            this.b.b(this);
        }
    }

    @Override // defpackage.fqf
    public final void m() {
        synchronized (this.d) {
            this.c.h();
            fwk fwkVar = this.b;
            fwkVar.m();
            this.p.close();
            fwkVar.k(this);
            this.k.B(this.q);
        }
    }

    @Override // defpackage.fqf
    public final boolean o() {
        if (this.c.n() != 4) {
            return this.b.o();
        }
        c();
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fyt
    public final void q(kbk kbkVar) {
        synchronized (this.d) {
            ?? r1 = kbkVar.d;
            if (r1.isEmpty()) {
                ojl.ce().execute(new jxr(this, 0));
            } else {
                gbw gbwVar = (gbw) r1.get(0);
                gaw gawVar = this.g;
                if (gawVar == null) {
                    ((sgt) a.b().M(3145)).s("Session config is null.");
                    this.o.i(gbwVar.s.b);
                    return;
                }
                rwc rwcVar = gawVar.j;
                this.e = rwcVar;
                if (rwcVar.h()) {
                    this.o.c(gbwVar.s.b);
                } else {
                    rwc rwcVarJ = rwc.j(((lsu) gbwVar.a.b().c()).b.b());
                    this.e = rwcVarJ;
                    ((Uri) rwcVarJ.c()).getPath();
                    gfn gfnVar = this.l;
                    gfnVar.c.execute(new gbh(gfnVar, gbwVar, 7, null));
                }
                fyd fydVar = this.c;
                Object obj = kbkVar.c;
                obj.getClass();
                fydVar.f.b((Bitmap) obj);
                fydVar.m();
            }
        }
    }

    @Override // defpackage.fqf
    public final String r() {
        return this.j.getString(R.string.video_accessibility_peek);
    }

    @Override // defpackage.fqf
    public final void w() {
        synchronized (this.d) {
            this.c.l(this.h.K, nkw.VIDEO_INTENT);
            this.b.d();
        }
    }

    @Override // defpackage.fyt
    public final void d() {
    }

    @Override // defpackage.fyt
    public final void f() {
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
}
