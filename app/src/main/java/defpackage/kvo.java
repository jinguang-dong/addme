package defpackage;

import android.graphics.PointF;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvo implements fbl {
    public final ovi a;
    public final owq b;
    public szh c;
    public final pfu d;
    public final qrh e;
    public final mwq f;
    private final our g;
    private final lae h;
    private final ovx i;
    private final owf j;
    private final int k;
    private volatile boolean l;
    private final qqq m;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, owq] */
    public kvo(pfu pfuVar, qqq qqqVar, our ourVar, ovi oviVar, qrh qrhVar, mwq mwqVar, gox goxVar, lae laeVar, ovx ovxVar, int i, owq owqVar) {
        this.d = pfuVar;
        this.m = qqqVar;
        this.g = ourVar;
        this.a = oviVar;
        this.e = qrhVar;
        this.f = mwqVar;
        this.b = goxVar.c;
        this.h = laeVar;
        this.i = ovxVar;
        this.j = owqVar;
        this.k = i;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, owq] */
    @Override // defpackage.fbl
    public final fda a(ejt ejtVar) {
        ejtVar.a();
        ejtVar.b();
        out.a();
        this.a.b();
        ovx ovxVar = (ovx) this.e.d;
        if (!((Boolean) ovxVar.d).booleanValue()) {
            this.h.g();
        }
        if (!this.l) {
            this.l = true;
            this.g.d(this.b.dK(new kso(this, 7), sxo.a));
        }
        this.f.b.a(true);
        pfu pfuVar = this.d;
        ovx ovxVar2 = this.i;
        pdi pdiVarV = pfu.v();
        int i = ((lnm) ovxVar2.d).g;
        int i2 = i == 0 ? i : 1;
        boolean zBooleanValue = ((Boolean) ovxVar.d).booleanValue();
        pey peyVar = (pey) pdiVarV;
        peyVar.d = Integer.valueOf(i2);
        qqq qqqVar = this.m;
        PointF pointF = (PointF) ejtVar.a;
        peyVar.h = qqqVar.F(pointF);
        if (!zBooleanValue) {
            peyVar.i = qqqVar.F(pointF);
        }
        pfuVar.p(new pex(peyVar), eoz.f());
        c();
        szh szhVar = new szh();
        this.c = szhVar;
        return new kvn(this, szhVar, ejtVar);
    }

    public final void b(boolean z, boolean z2) {
        if (z2) {
            this.h.f();
            this.e.f();
        }
        if (z) {
            this.f.B();
        }
        pfu pfuVar = this.d;
        pfuVar.q(z, z2, false);
        pdi pdiVarV = pfu.v();
        if (z) {
            pey peyVar = (pey) pdiVarV;
            peyVar.h = this.m.E();
            peyVar.d = Integer.valueOf(((lnm) this.i.d).g);
        }
        if (z2) {
            ((pey) pdiVarV).i = this.m.E();
        }
        pey peyVar2 = (pey) pdiVarV;
        peyVar2.j = this.m.E();
        pfuVar.r(new pex(peyVar2));
    }

    public final void c() {
        boolean zEquals = ((ltw) this.j.dL()).equals(ltw.AUTO);
        long j = this.k;
        if (!zEquals) {
            j += r0.h;
        }
        try {
            this.a.a(new krc(this, 13), j, TimeUnit.SECONDS);
        } catch (RejectedExecutionException unused) {
        }
    }
}
