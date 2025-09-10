package defpackage;

import android.graphics.PointF;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvl implements fbl {
    public final fck a;
    public szh b;
    public final Runnable c = new iyz(this, 20);
    public final pfu d;
    public final qrh e;
    public final mwq f;
    private final ovi g;
    private final lae h;
    private final ovx i;
    private final owf j;
    private final qqq k;

    public kvl(pfu pfuVar, ovi oviVar, fck fckVar, qrh qrhVar, mwq mwqVar, qqq qqqVar, lae laeVar, ovx ovxVar, owf owfVar) {
        this.g = oviVar;
        this.a = fckVar;
        this.e = qrhVar;
        this.f = mwqVar;
        this.d = pfuVar;
        this.k = qqqVar;
        this.h = laeVar;
        this.i = ovxVar;
        this.j = owfVar;
    }

    private final void c() {
        try {
            this.g.execute(new krc(this, 12));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, owq] */
    @Override // defpackage.fbl
    public final fda a(ejt ejtVar) {
        ejtVar.a();
        ejtVar.b();
        this.g.b();
        szh szhVar = this.b;
        int i = 1;
        if (szhVar != null) {
            szhVar.cancel(true);
        }
        this.a.c(this.c);
        this.f.b.a(true);
        ovx ovxVar = (ovx) this.e.d;
        if (!((Boolean) ovxVar.d).booleanValue()) {
            this.h.g();
        }
        pfu pfuVar = this.d;
        ovx ovxVar2 = this.i;
        pdi pdiVarV = pfu.v();
        int i2 = ((lnm) ovxVar2.d).g;
        owf owfVar = this.j;
        if (((Boolean) owfVar.dL()).booleanValue()) {
            i = 4;
        } else if (i2 == 0) {
            i = 0;
        }
        boolean zBooleanValue = ((Boolean) ovxVar.d).booleanValue();
        pey peyVar = (pey) pdiVarV;
        peyVar.d = Integer.valueOf(i);
        qqq qqqVar = this.k;
        PointF pointF = (PointF) ejtVar.a;
        peyVar.h = qqqVar.F(pointF);
        if (!zBooleanValue) {
            peyVar.i = qqqVar.F(pointF);
        }
        pex pexVar = new pex(peyVar);
        if (((Boolean) owfVar.dL()).booleanValue()) {
            pfuVar.r(pexVar);
        } else {
            pfuVar.p(pexVar, eoz.f());
        }
        szh szhVar2 = new szh();
        this.b = szhVar2;
        c();
        return new kvk(this, szhVar2, ejtVar);
    }

    public final void b(boolean z, boolean z2) {
        if (z) {
            this.a.c(this.c);
            this.f.B();
        }
        if (z2) {
            this.h.f();
            this.e.f();
        }
        pfu pfuVar = this.d;
        pfuVar.q(z, z2, false);
        pdi pdiVarV = pfu.v();
        if (z) {
            pey peyVar = (pey) pdiVarV;
            peyVar.h = this.k.E();
            peyVar.d = Integer.valueOf(((lnm) this.i.d).g);
        }
        if (z2) {
            ((pey) pdiVarV).i = this.k.E();
        }
        pey peyVar2 = (pey) pdiVarV;
        peyVar2.j = this.k.E();
        pfuVar.r(new pex(peyVar2));
    }
}
