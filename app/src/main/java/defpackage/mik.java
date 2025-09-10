package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mik implements fbl {
    public final fbq c;
    public final rwc d;
    public final rwc e;
    public final fck f;
    public final mkr g;
    public final kgk h;
    public final owq i;
    public pjo k;
    public our l;
    public kqx m;
    public ScheduledFuture n;
    public szh o;
    public final hie r;
    public pfu s;
    public final hbj t;
    public final qrh u;
    public oge v;
    public final mwq w;
    private final ScheduledExecutorService x;
    private final qpt y;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Runnable j = new man(this, 19, null);
    public int p = 1;
    public final kfw q = new kfw(false);

    public mik(qrh qrhVar, mwq mwqVar, hie hieVar, fbq fbqVar, hbj hbjVar, rwc rwcVar, rwc rwcVar2, fck fckVar, ScheduledExecutorService scheduledExecutorService, qpt qptVar, mkr mkrVar, kgk kgkVar, owq owqVar) {
        this.u = qrhVar;
        this.w = mwqVar;
        this.r = hieVar;
        this.c = fbqVar;
        this.t = hbjVar;
        this.d = rwcVar;
        this.e = rwcVar2;
        this.f = fckVar;
        this.x = scheduledExecutorService;
        this.y = qptVar;
        this.g = mkrVar;
        this.h = kgkVar;
        this.i = owqVar;
    }

    @Override // defpackage.fbl
    public final fda a(ejt ejtVar) {
        this.f.c(this.j);
        ScheduledFuture scheduledFuture = this.n;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        PointF pointF = (PointF) ejtVar.a;
        fch fchVarC = fch.c(pointF, pointF, this.k.g());
        Rect rect = ((kqw) this.m.dL()).a;
        boolean zBooleanValue = ((Boolean) ((ovx) this.u.d).d).booleanValue();
        boolean z = !zBooleanValue;
        MeteringRectangle[] meteringRectangleArrB = fchVarC.b(rect);
        pey peyVar = (pey) pfu.v();
        peyVar.d = 4;
        peyVar.h = meteringRectangleArrB;
        if (!zBooleanValue) {
            peyVar.i = meteringRectangleArrB;
        }
        pex pexVar = new pex(peyVar);
        pfu pfuVar = this.s;
        pem pemVarA = pen.a();
        pemVarA.c(3);
        pemVarA.b(true != z ? 1 : 3);
        pemVarA.e(1);
        pfuVar.p(pexVar, pemVarA.a());
        this.o = new szh();
        ScheduledFuture scheduledFuture2 = this.n;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
        }
        this.n = this.x.schedule(new man(this, 18), 2000L, TimeUnit.MILLISECONDS);
        hbj hbjVar = this.t;
        gzg gzgVar = haw.i;
        if (hbjVar.p(gzgVar) && this.a.get() && this.b.get()) {
            this.g.g(false);
        }
        oge ogeVar = this.v;
        if (ogeVar != null && ((hbj) ogeVar.a).p(gzgVar)) {
            mjl mjlVar = (mjl) ogeVar.b;
            if (((mii) mjlVar.l.d).equals(mii.STATE_RECORDING)) {
                mjlVar.f();
            }
        }
        return new mij(this, ejtVar, 0);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, owq] */
    final void b(boolean z, boolean z2) {
        Rect rect = ((kqw) this.m.dL()).a;
        MeteringRectangle[] meteringRectangleArr = kgc.a;
        kgc kgcVar = kgb.a;
        MeteringRectangle[] meteringRectangleArr2 = kgc.a;
        if (z) {
            this.p = 1;
        }
        this.s.q(z, z2, false);
        pdi pdiVarV = pfu.v();
        if (z) {
            ((pey) pdiVarV).h = meteringRectangleArr2;
        }
        if (z2) {
            ((pey) pdiVarV).i = meteringRectangleArr2;
        }
        pey peyVar = (pey) pdiVarV;
        peyVar.j = meteringRectangleArr2;
        this.s.s(new pex(peyVar));
        if (z) {
            this.f.c(this.j);
            this.w.a.a(false);
        }
        if (z2) {
            this.u.f();
        }
    }

    final void c() {
        this.a.set(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void d(boolean r7) {
        /*
            r6 = this;
            hbj r0 = r6.t
            gzg r1 = defpackage.haw.i
            boolean r0 = r0.p(r1)
            if (r0 != 0) goto Lc
            goto L93
        Lc:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.b
            boolean r1 = r0.get()
            r2 = 1
            r3 = 0
            if (r1 == r7) goto L1a
            if (r7 != 0) goto L1a
            r1 = r2
            goto L1e
        L1a:
            r0.get()
            r1 = r3
        L1e:
            r0.set(r7)
            r0 = 0
            r4 = 3
            if (r7 == 0) goto L5c
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.a
            boolean r1 = r1.get()
            if (r1 == 0) goto L7b
            int r1 = r6.p
            if (r1 == 0) goto L5b
            r5 = 2
            if (r1 == r5) goto L7b
            r6.p = r4
            pfu r1 = r6.s
            pem r5 = defpackage.pen.a()
            r5.c(r4)
            r5.b(r2)
            r5.e(r2)
            pen r5 = r5.a()
            r1.o(r5)
            java.util.concurrent.ScheduledFuture r1 = r6.n
            if (r1 == 0) goto L53
            r1.cancel(r3)
        L53:
            fck r1 = r6.f
            java.lang.Runnable r5 = r6.j
            r1.c(r5)
            goto L7b
        L5b:
            throw r0
        L5c:
            if (r1 == 0) goto L7b
            int r1 = r6.p
            if (r1 == r4) goto L64
            r5 = r3
            goto L65
        L64:
            r5 = r2
        L65:
            if (r1 == 0) goto L7a
            qrh r1 = r6.u
            java.lang.Object r1 = r1.d
            ovx r1 = (defpackage.ovx) r1
            java.lang.Object r1 = r1.d
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r2
            r6.b(r5, r1)
            goto L7b
        L7a:
            throw r0
        L7b:
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.a
            boolean r1 = r1.get()
            if (r1 == 0) goto L93
            mkr r1 = r6.g
            if (r7 == 0) goto L8f
            int r6 = r6.p
            if (r6 == 0) goto L8e
            if (r6 != r4) goto L8f
            goto L90
        L8e:
            throw r0
        L8f:
            r2 = r3
        L90:
            r1.g(r2)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mik.d(boolean):void");
    }
}
