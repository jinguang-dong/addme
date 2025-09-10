package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyq implements fys {
    public final fck a;
    public final rwc b;
    public final nnw c;
    public final rwc d;
    public final gau e;
    public final nms f;
    public szh g;
    public szh h;
    public boolean i;
    public final pfu l;
    public final mdy m;
    public final qrh n;
    public final cxb o;
    public final mwq p;
    private final uem r;
    private boolean t;
    private final kfw u;
    private final sgh v;
    private final qqq w;
    private volatile boolean s = false;
    public final Runnable j = new fxs(this, 13, null);
    public final Runnable k = new fxs(this, 14, null);
    private final ScheduledExecutorService q = ojl.cc("cdr_trk_ttf_ex");

    public fyq(gau gauVar, cxb cxbVar, kfw kfwVar, fck fckVar, rwc rwcVar, rwc rwcVar2, mdy mdyVar, qrh qrhVar, mwq mwqVar, uem uemVar, pfu pfuVar, qqq qqqVar, sgh sghVar, nnw nnwVar, nms nmsVar) {
        this.e = gauVar;
        this.u = kfwVar;
        this.a = fckVar;
        this.b = rwcVar;
        this.c = nnwVar;
        this.d = rwcVar2;
        this.v = sghVar;
        this.m = mdyVar;
        this.l = pfuVar;
        this.n = qrhVar;
        this.p = mwqVar;
        this.o = cxbVar;
        this.r = uemVar;
        this.w = qqqVar;
        this.f = nmsVar;
    }

    public static final PointF h(mmf mmfVar) {
        RectF rectF = mmfVar.c;
        return new PointF(rectF.centerX(), rectF.centerY());
    }

    private final synchronized void i() {
        if (this.s) {
            return;
        }
        this.s = true;
        this.o.w(gdo.MODULE).d(((mlw) this.b.c()).b(rvk.a, rwc.j(this.r.a())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(boolean z, boolean z2, boolean z3) {
        if (z3) {
            this.e.d.a(false);
        }
        lnn lnnVar = ((kfv) ((mwq) this.u.a.d).b).b;
        boolean z4 = (lnnVar == lnn.FOCUSED_LOCKED || lnnVar == lnn.NOT_FOCUSED_LOCKED) && z2;
        if (z4) {
            this.e.e.a(false);
        }
        pfu pfuVar = this.l;
        pfuVar.q(z4, z3, false);
        if (z) {
            pdi pdiVarV = pfu.v();
            if (z2) {
                ((pey) pdiVarV).h = this.w.E();
            }
            if (z3) {
                ((pey) pdiVarV).i = this.w.E();
            }
            pey peyVar = (pey) pdiVarV;
            peyVar.j = this.w.E();
            pfuVar.r(new pex(peyVar));
        }
    }

    @Override // defpackage.fbl
    public final synchronized fda a(ejt ejtVar) {
        if (!this.t) {
            rwc rwcVar = this.b;
            if (rwcVar.h()) {
                rwc rwcVar2 = this.d;
                if (rwcVar2.h() && ((mlw) rwcVar.c()).n(mlv.TOUCH_TO_FOCUS)) {
                    cxb cxbVar = this.o;
                    gdo gdoVar = gdo.FOCUS_SESSION;
                    cxbVar.x(gdoVar);
                    szh szhVar = this.h;
                    if (szhVar != null) {
                        szhVar.cancel(false);
                    }
                    szh szhVar2 = this.g;
                    if (szhVar2 != null) {
                        szhVar2.cancel(false);
                    }
                    this.h = new szh();
                    this.g = new szh();
                    this.i = false;
                    i();
                    cxbVar.w(gdoVar).d(new fis(this, 18));
                    j(false, true, !((Boolean) ((ovx) this.n.d).d).booleanValue());
                    this.v.e();
                    nnw nnwVar = this.c;
                    Object obj = ejtVar.a;
                    mdy mdyVar = this.m;
                    final PointF pointFA = nnwVar.a((PointF) obj);
                    mdyVar.b(false, pointFA);
                    ((Executor) rwcVar2.c()).execute(new fjw(this, ejtVar, 17, null));
                    final szh szhVar3 = new szh();
                    ((Executor) rwcVar2.c()).execute(new Runnable() { // from class: fyn
                        @Override // java.lang.Runnable
                        public final void run() {
                            fyq fyqVar = this.a;
                            if (((Boolean) ((ovx) fyqVar.p.a).d).booleanValue()) {
                                return;
                            }
                            szh szhVar4 = szhVar3;
                            PointF pointF = pointFA;
                            fyqVar.c(2000L, false);
                            owf owfVarH = ((mlw) fyqVar.b.c()).h(pointF, mlv.TOUCH_TO_FOCUS);
                            owf owfVarH2 = owl.h(owfVarH, new fym(fyqVar, 0));
                            szhVar4.e(owfVarH2);
                            cxb cxbVar2 = fyqVar.o;
                            gdo gdoVar2 = gdo.FOCUS_SESSION;
                            our ourVarW = cxbVar2.w(gdoVar2);
                            fyo fyoVar = new fyo(fyqVar, 0);
                            sxo sxoVar = sxo.a;
                            ourVarW.d(owfVarH2.dK(fyoVar, sxoVar));
                            cxbVar2.w(gdoVar2).d(owfVarH.dK(new htf(fyqVar, 1), sxoVar));
                        }
                    });
                    return new fyp(this, szhVar3);
                }
            }
        }
        return new fca();
    }

    public final void b() {
        fck fckVar = this.a;
        fckVar.c(this.k);
        fckVar.c(this.j);
    }

    public final synchronized void c(long j, boolean z) {
        try {
            this.o.w(gdo.FOCUS_SESSION).d(new fis(this.q.schedule(new emz(this, z, 4, (char[]) null), j, TimeUnit.MILLISECONDS), 17));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.t = true;
        this.o.x(gdo.FOCUS_SESSION);
    }

    public final synchronized void d() {
        try {
            this.o.w(gdo.FOCUS_SESSION).d(new fis(this.q.schedule(this.j, 6L, TimeUnit.SECONDS), 19));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0013 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #3 {, blocks: (B:4:0x0003, B:12:0x0013, B:14:0x0020, B:16:0x003b, B:18:0x003f, B:19:0x004b, B:21:0x0052, B:23:0x0060, B:31:0x006e, B:30:0x006b, B:38:0x007b, B:32:0x006f, B:35:0x0075, B:13:0x001a), top: B:47:0x0003, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001a A[Catch: all -> 0x000e, TryCatch #3 {, blocks: (B:4:0x0003, B:12:0x0013, B:14:0x0020, B:16:0x003b, B:18:0x003f, B:19:0x004b, B:21:0x0052, B:23:0x0060, B:31:0x006e, B:30:0x006b, B:38:0x007b, B:32:0x006f, B:35:0x0075, B:13:0x001a), top: B:47:0x0003, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[Catch: all -> 0x000e, TryCatch #3 {, blocks: (B:4:0x0003, B:12:0x0013, B:14:0x0020, B:16:0x003b, B:18:0x003f, B:19:0x004b, B:21:0x0052, B:23:0x0060, B:31:0x006e, B:30:0x006b, B:38:0x007b, B:32:0x006f, B:35:0x0075, B:13:0x001a), top: B:47:0x0003, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b A[Catch: all -> 0x000e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:12:0x0013, B:14:0x0020, B:16:0x003b, B:18:0x003f, B:19:0x004b, B:21:0x0052, B:23:0x0060, B:31:0x006e, B:30:0x006b, B:38:0x007b, B:32:0x006f, B:35:0x0075, B:13:0x001a), top: B:47:0x0003, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void e(android.graphics.PointF r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r6 != 0) goto L11
            sgh r0 = r4.v     // Catch: java.lang.Throwable -> Le
            boolean r0 = r0.f(r5)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto Lc
            goto L11
        Lc:
            monitor-exit(r4)
            return
        Le:
            r5 = move-exception
            goto L89
        L11:
            if (r6 == 0) goto L1a
            qqq r0 = r4.w     // Catch: java.lang.Throwable -> Le
            android.hardware.camera2.params.MeteringRectangle[] r0 = r0.H(r5)     // Catch: java.lang.Throwable -> Le
            goto L20
        L1a:
            qqq r0 = r4.w     // Catch: java.lang.Throwable -> Le
            android.hardware.camera2.params.MeteringRectangle[] r0 = r0.G(r5)     // Catch: java.lang.Throwable -> Le
        L20:
            pfu r1 = r4.l     // Catch: java.lang.Throwable -> Le
            pdi r2 = defpackage.pfu.v()     // Catch: java.lang.Throwable -> Le
            r3 = r2
            pey r3 = (defpackage.pey) r3     // Catch: java.lang.Throwable -> Le
            r3.h = r0     // Catch: java.lang.Throwable -> Le
            qrh r3 = r4.n     // Catch: java.lang.Throwable -> Le
            java.lang.Object r3 = r3.d     // Catch: java.lang.Throwable -> Le
            ovx r3 = (defpackage.ovx) r3     // Catch: java.lang.Throwable -> Le
            java.lang.Object r3 = r3.d     // Catch: java.lang.Throwable -> Le
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Le
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Le
            if (r3 != 0) goto L50
            boolean r3 = r4.i     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L4b
            qqq r0 = r4.w     // Catch: java.lang.Throwable -> Le
            android.hardware.camera2.params.MeteringRectangle[] r0 = r0.E()     // Catch: java.lang.Throwable -> Le
            r3 = r2
            pey r3 = (defpackage.pey) r3     // Catch: java.lang.Throwable -> Le
            r3.i = r0     // Catch: java.lang.Throwable -> Le
            goto L50
        L4b:
            r3 = r2
            pey r3 = (defpackage.pey) r3     // Catch: java.lang.Throwable -> Le
            r3.i = r0     // Catch: java.lang.Throwable -> Le
        L50:
            if (r6 == 0) goto L7b
            pfz r6 = r1.u()     // Catch: java.lang.Throwable -> Le java.lang.InterruptedException -> L6f defpackage.pco -> L75
            pex r0 = new pex     // Catch: java.lang.Throwable -> L65
            pey r2 = (defpackage.pey) r2     // Catch: java.lang.Throwable -> L65
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L65
            r6.l(r0)     // Catch: java.lang.Throwable -> L65
            r6.close()     // Catch: java.lang.Throwable -> Le java.lang.InterruptedException -> L6f defpackage.pco -> L75
            monitor-exit(r4)
            return
        L65:
            r0 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r6 = move-exception
            r0.addSuppressed(r6)     // Catch: java.lang.Throwable -> Le java.lang.InterruptedException -> L6f defpackage.pco -> L75
        L6e:
            throw r0     // Catch: java.lang.Throwable -> Le java.lang.InterruptedException -> L6f defpackage.pco -> L75
        L6f:
            float r6 = r5.x     // Catch: java.lang.Throwable -> Le
            float r5 = r5.y     // Catch: java.lang.Throwable -> Le
            monitor-exit(r4)
            return
        L75:
            float r6 = r5.x     // Catch: java.lang.Throwable -> Le
            float r5 = r5.y     // Catch: java.lang.Throwable -> Le
            monitor-exit(r4)
            return
        L7b:
            pfu r5 = r4.l     // Catch: java.lang.Throwable -> Le
            pex r6 = new pex     // Catch: java.lang.Throwable -> Le
            pey r2 = (defpackage.pey) r2     // Catch: java.lang.Throwable -> Le
            r6.<init>(r2)     // Catch: java.lang.Throwable -> Le
            r5.r(r6)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r4)
            return
        L89:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyq.e(android.graphics.PointF, boolean):void");
    }

    public final void f(mlw mlwVar) {
        ((Executor) this.d.c()).execute(new fxs(mlwVar, 10));
    }
}
