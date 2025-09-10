package defpackage;

import android.graphics.PointF;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyk implements fys {
    public final gau a;
    public final fck b;
    public szh d;
    public final pfu f;
    private final qrh h;
    private final qqq i;
    private final ovi g = new ovi(ojl.cb("CdrSCFocus", 1), 4, TimeUnit.SECONDS);
    public final Runnable c = new fxs(this, 8, null);
    public final Object e = new Object();

    public fyk(gav gavVar, qpt qptVar, fck fckVar, qrh qrhVar, hbj hbjVar, owf owfVar, pfu pfuVar, gaw gawVar) {
        gau gauVarA = gavVar.a();
        this.a = gauVarA;
        this.f = pfuVar;
        this.b = fckVar;
        this.h = qrhVar;
        this.i = new qqq(gauVarA.z, qptVar, (kgw) gawVar.X.b, owfVar, hbjVar);
    }

    private final void c() {
        try {
            this.g.execute(new fxs(this, 7));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // defpackage.fbl
    public final fda a(ejt ejtVar) {
        fyj fyjVar;
        this.g.b();
        synchronized (this.e) {
            szh szhVar = this.d;
            if (szhVar != null) {
                szhVar.cancel(true);
            }
            this.b.c(this.c);
            pfu pfuVar = this.f;
            pfuVar.q(true, false, false);
            pdi pdiVarV = pfu.v();
            boolean zBooleanValue = ((Boolean) ((ovx) this.h.d).d).booleanValue();
            ((pey) pdiVarV).d = 1;
            qqq qqqVar = this.i;
            Object obj = ejtVar.a;
            ((pey) pdiVarV).h = qqqVar.F((PointF) obj);
            if (!zBooleanValue) {
                ((pey) pdiVarV).i = qqqVar.F((PointF) obj);
            }
            pfuVar.p(new pex((pey) pdiVarV), eoz.f());
            this.a.h.a(false);
            szh szhVar2 = new szh();
            this.d = szhVar2;
            c();
            fyjVar = new fyj(this, szhVar2, ejtVar);
        }
        return fyjVar;
    }

    public final void b(boolean z, boolean z2) {
        if (z) {
            this.b.c(this.c);
            gau gauVar = this.a;
            gauVar.h.a(true);
            gauVar.e.a(false);
        }
        if (z2) {
            this.h.f();
        }
        pfu pfuVar = this.f;
        pfuVar.q(z, z2, false);
        pdi pdiVarV = pfu.v();
        if (z) {
            ((pey) pdiVarV).h = this.i.E();
        }
        if (z2) {
            ((pey) pdiVarV).i = this.i.E();
        }
        pey peyVar = (pey) pdiVarV;
        peyVar.j = this.i.E();
        pfuVar.r(new pex(peyVar));
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            this.g.close();
        }
    }
}
