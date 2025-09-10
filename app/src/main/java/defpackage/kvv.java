package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvv implements fbl, paq {
    private final kfw B;
    public final rwc a;
    public final owf b;
    public final rwc c;
    public final int d;
    public volatile ScheduledFuture e;
    public final fck g;
    public final fbx h;
    public szh i;
    public final lae l;
    public final fbm m;
    public final pfu o;
    public final mdy p;
    public final hbj q;
    public final qrh s;
    public final mwq t;
    public final qqq u;
    private final nnw v;
    private final kvl w;
    private final ScheduledExecutorService x;
    private final owq z;
    public final Object f = new Object();
    public paq j = null;
    public paq k = null;
    private fda y = null;
    private boolean A = false;
    public final Runnable n = new lac(this, 1);
    public final sgh r = new sgh((short[]) null);

    public kvv(kgw kgwVar, rwc rwcVar, kvl kvlVar, qrh qrhVar, mwq mwqVar, ScheduledExecutorService scheduledExecutorService, fck fckVar, pfu pfuVar, owq owqVar, owq owqVar2, kfw kfwVar, rwc rwcVar2, mdy mdyVar, uem uemVar, qqq qqqVar, lae laeVar, owf owfVar, hbj hbjVar, fbm fbmVar) {
        this.h = (fbx) uemVar.a();
        this.a = rwcVar;
        this.v = new nnw(kgwVar.g());
        this.b = owfVar;
        this.w = kvlVar;
        this.o = pfuVar;
        this.s = qrhVar;
        this.t = mwqVar;
        this.c = rwcVar2;
        this.x = scheduledExecutorService;
        this.g = fckVar;
        this.z = kgwVar.l() == pka.FRONT ? owqVar2 : owqVar;
        this.B = kfwVar;
        this.p = mdyVar;
        this.u = qqqVar;
        this.l = laeVar;
        this.q = hbjVar;
        this.m = fbmVar;
        this.d = ((Integer) hbjVar.a(gzy.g).orElse(10000)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, owq] */
    public final void i(boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        if (z3) {
            this.s.d.a(false);
        }
        if (z2) {
            this.t.b.a(false);
        }
        lnn lnnVar = ((kfv) ((mwq) this.B.a.d).b).b;
        if ((lnnVar == lnn.FOCUSED_LOCKED || lnnVar == lnn.NOT_FOCUSED_LOCKED) && z2) {
            z4 = true;
        }
        boolean z5 = z4;
        if (z5) {
            this.t.a.a(false);
        }
        ((Executor) this.c.c()).execute(new kvt(this, z5, z3, z, z2, 0));
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, owq] */
    @Override // defpackage.fbl
    public final synchronized fda a(ejt ejtVar) {
        ejtVar.a();
        ejtVar.b();
        if (!this.A) {
            rwc rwcVar = this.a;
            if (rwcVar.h()) {
                rwc rwcVar2 = this.c;
                if (rwcVar2.h()) {
                    Object obj = this.s.d;
                    if (!((Boolean) ((ovx) obj).d).booleanValue()) {
                        this.l.g();
                    }
                    this.t.b.a(true);
                    if (((mlw) rwcVar.c()).i() && !f()) {
                        nnw nnwVar = this.v;
                        Object obj2 = ejtVar.a;
                        mdy mdyVar = this.p;
                        final PointF pointFA = nnwVar.a((PointF) obj2);
                        mdyVar.b(true, pointFA);
                        if (!g((PointF) obj2)) {
                            fda fdaVar = this.y;
                            if (fdaVar != null) {
                                fdaVar.d();
                            }
                            szh szhVar = new szh();
                            this.i = szhVar;
                            owq owqVar = this.z;
                            if (((Integer) owqVar.dL()).intValue() == ltq.ON_LOCKED.f) {
                                owqVar.a(Integer.valueOf(ltq.ON.f));
                            }
                            boolean z = !((Boolean) ((ovx) obj).d).booleanValue();
                            i(false, true, z);
                            this.r.e();
                            final szh szhVar2 = new szh();
                            e((PointF) obj2, z, true, false);
                            e((PointF) obj2, z, true, true);
                            final szh szhVar3 = new szh();
                            ((Executor) rwcVar2.c()).execute(new Runnable() { // from class: kvq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final kvv kvvVar = this.a;
                                    if (((Boolean) ((ovx) kvvVar.t.a).d).booleanValue()) {
                                        return;
                                    }
                                    final szh szhVar4 = szhVar2;
                                    szh szhVar5 = szhVar3;
                                    owf owfVarH = ((mlw) kvvVar.a.c()).h(pointFA, mlv.TOUCH_TO_FOCUS);
                                    szhVar5.e(owl.h(owfVarH, new kve(kvvVar, 2)));
                                    kvvVar.j = owfVarH.dK(new kso(kvvVar, 8), sxo.a);
                                    kvvVar.k = owfVarH.dK(new pau() { // from class: kvr
                                        @Override // defpackage.pau
                                        public final void a(Object obj3) {
                                            mmf mmfVar = (mmf) obj3;
                                            mmi mmiVar = mmfVar.a;
                                            mmi mmiVar2 = mmi.OFF;
                                            if (mmiVar == mmiVar2) {
                                                szh szhVar6 = szhVar4;
                                                kvv kvvVar2 = kvvVar;
                                                RectF rectF = mmfVar.c;
                                                PointF pointF = new PointF(rectF.centerX(), rectF.centerY());
                                                long j = mmfVar.f;
                                                kvvVar2.p.c(true, pointF, j, mmfVar.e, mmfVar.b.ordinal());
                                                szhVar6.e(new eoz());
                                                if (mmiVar != mmiVar2) {
                                                    return;
                                                }
                                                if (kvvVar2.f()) {
                                                    kvvVar2.d(kvvVar2.d);
                                                } else if (j < 5000 || kvvVar2.m.a()) {
                                                    kvvVar2.d(Math.max(0L, 5000 - j));
                                                } else {
                                                    ((Executor) kvvVar2.c.c()).execute(kvvVar2.n);
                                                }
                                            }
                                        }
                                    }, (Executor) kvvVar.c.c());
                                }
                            });
                            kvu kvuVar = new kvu(this, szhVar2, szhVar, szhVar3);
                            this.y = kvuVar;
                            return kvuVar;
                        }
                    }
                    if (((mlw) rwcVar.c()).i()) {
                        f();
                    }
                    return this.w.a(ejtVar);
                }
            }
        }
        return new fca();
    }

    public final PointF b(mmf mmfVar) {
        RectF rectF = mmfVar.c;
        PointF pointF = new PointF(rectF.centerX(), rectF.centerY());
        return !mmfVar.c() ? pointF : this.v.b(pointF);
    }

    public final void c() {
        fck fckVar = this.g;
        Runnable runnable = this.n;
        fckVar.c(runnable);
        fbx fbxVar = this.h;
        fbxVar.c(runnable);
        fbxVar.e();
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.A = true;
        fda fdaVar = this.y;
        if (fdaVar != null) {
            fdaVar.d();
        }
    }

    public final void d(long j) {
        try {
            synchronized (this.f) {
                this.e = this.x.schedule(new krc(this, 14), j, TimeUnit.MILLISECONDS);
            }
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void e(final PointF pointF, final boolean z, final boolean z2, final boolean z3) {
        ((Executor) this.c.c()).execute(new Runnable() { // from class: kvs
            @Override // java.lang.Runnable
            public final void run() {
                boolean z4 = z2;
                boolean z5 = z;
                if (!z5) {
                    if (!z4) {
                        return;
                    } else {
                        z4 = true;
                    }
                }
                boolean z6 = z3;
                PointF pointF2 = pointF;
                kvv kvvVar = this.a;
                if ((z6 || kvvVar.r.f(pointF2)) && !kvvVar.g(pointF2)) {
                    MeteringRectangle[] meteringRectangleArrH = z6 ? kvvVar.u.H(pointF2) : kvvVar.u.G(pointF2);
                    pfu pfuVar = kvvVar.o;
                    pdi pdiVarV = pfu.v();
                    if (z4) {
                        ((pey) pdiVarV).h = meteringRectangleArrH;
                    }
                    if (z5) {
                        ((pey) pdiVarV).i = meteringRectangleArrH;
                    }
                    if (!z6) {
                        kvvVar.o.r(new pex((pey) pdiVarV));
                        return;
                    }
                    try {
                        pfz pfzVarU = pfuVar.u();
                        try {
                            pfzVarU.l(new pex((pey) pdiVarV));
                            pfzVarU.close();
                        } finally {
                        }
                    } catch (InterruptedException unused) {
                        float f = pointF2.x;
                        float f2 = pointF2.y;
                        Thread.currentThread().interrupt();
                    } catch (pco unused2) {
                        float f3 = pointF2.x;
                        float f4 = pointF2.y;
                    }
                }
            }
        });
    }

    public final boolean f() {
        return ((Boolean) this.b.dL()).booleanValue() && !this.q.p(gzy.l);
    }

    public final boolean g(PointF pointF) {
        return this.v.a(pointF).y > ((Float) this.q.e(gze.b).get()).floatValue();
    }
}
