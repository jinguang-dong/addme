package defpackage;

import android.graphics.PointF;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyl implements fys {
    public final gau a;
    public szh b;
    public final pfu c;
    private final ovi d = new ovi(ojl.cb("CdrStdFocus", 1), 8, TimeUnit.SECONDS);
    private boolean e;
    private final qrh f;
    private final cxb g;
    private final qqq h;

    public fyl(gav gavVar, qpt qptVar, cxb cxbVar, hbj hbjVar, qrh qrhVar, owf owfVar, pfu pfuVar, gaw gawVar) {
        gau gauVarA = gavVar.a();
        this.a = gauVarA;
        this.c = pfuVar;
        this.g = cxbVar;
        this.f = qrhVar;
        this.h = new qqq(gauVarA.z, qptVar, (kgw) gawVar.X.b, owfVar, hbjVar);
    }

    @Override // defpackage.fbl
    public final fda a(ejt ejtVar) {
        b();
        if (!this.e) {
            this.e = true;
            our ourVarW = this.g.w(gdo.FOCUS_SESSION);
            gau gauVar = this.a;
            ourVarW.d(gauVar.a.dK(new fpe(this, 15), sxo.a));
        }
        boolean zBooleanValue = ((Boolean) ((ovx) this.f.d).d).booleanValue();
        pfu pfuVar = this.c;
        pey peyVar = (pey) pfu.v();
        peyVar.d = 1;
        qqq qqqVar = this.h;
        PointF pointF = (PointF) ejtVar.a;
        peyVar.h = qqqVar.F(pointF);
        if (!zBooleanValue) {
            peyVar.i = qqqVar.F(pointF);
        }
        pfuVar.p(new pex(peyVar), eoz.f());
        this.a.h.a(false);
        c();
        return new mij(this, ejtVar, 1);
    }

    public final void b() {
        synchronized (this) {
            szh szhVar = this.b;
            if (szhVar != null) {
                szhVar.cancel(false);
            }
            this.b = new szh();
            this.d.b();
        }
    }

    public final void c() {
        synchronized (this) {
            try {
                this.d.execute(new fxs(this, 9));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        b();
        this.g.x(gdo.FOCUS_SESSION);
        this.d.close();
    }

    public final void d(boolean z, boolean z2) {
        if (z2) {
            gau gauVar = this.a;
            gauVar.d.a(false);
            gauVar.a.a(0);
        }
        if (z) {
            this.a.e.a(false);
        }
        pfu pfuVar = this.c;
        pfuVar.q(z, z2, false);
        pdi pdiVarV = pfu.v();
        if (z) {
            ((pey) pdiVarV).h = this.h.E();
        }
        if (z2) {
            ((pey) pdiVarV).i = this.h.E();
        }
        pey peyVar = (pey) pdiVarV;
        peyVar.j = this.h.E();
        pfuVar.r(new pex(peyVar));
        if (z) {
            this.a.h.a(true);
        }
    }
}
