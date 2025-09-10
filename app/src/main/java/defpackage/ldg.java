package defpackage;

import android.hardware.camera2.CaptureResult;
import com.google.googlex.gcam.BurstSpec;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ldg implements hzi, iac, iam {
    public static final sgv a = sgv.g("ldg");
    public final kow b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    private final HashMap f = new HashMap();
    private final boolean g;
    private final Executor h;
    private final pbn i;
    private final owf j;
    private final Optional k;
    private final Optional l;
    private final Optional m;
    private final Optional n;
    private poe o;
    private final pfu p;
    private final iso q;

    public ldg(hbj hbjVar, pfu pfuVar, iso isoVar, kow kowVar, Executor executor, pbn pbnVar, owf owfVar, jva jvaVar) {
        this.g = hbjVar.p(gzs.z);
        this.q = isoVar;
        this.b = kowVar;
        this.h = executor;
        this.i = pbnVar;
        this.p = pfuVar;
        this.j = owfVar;
        this.c = jvaVar.a;
        this.d = jvaVar.b;
        this.e = jvaVar.c;
        this.k = jvaVar.d;
        this.l = jvaVar.e;
        this.m = jvaVar.f;
        this.n = jvaVar.g;
        ((sgt) a.c().M(3957)).v("3A_DEBUG Exclusive FrameServer session enabled: %s.", false);
    }

    public static final String q(poe poeVar) {
        if (CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID == null) {
            return null;
        }
        return (String) poeVar.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
    }

    private final synchronized void s(Map map) {
        pbn pbnVar = this.i;
        pbnVar.h("clear");
        this.o = null;
        map.clear();
        pbnVar.g();
    }

    private final boolean t(poe poeVar) {
        boolean zH = h(poeVar);
        boolean zJ = j(poeVar);
        boolean zK = k(poeVar);
        r(poeVar);
        poeVar.d();
        return zH || zJ || zK;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    private static final int u(iby ibyVar) {
        try {
            return ibyVar.a();
        } catch (IllegalStateException e) {
            ((sgt) ((sgt) a.c().i(e)).M((char) 3963)).s("Error getting the shot ID.");
            return -1;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, lss] */
    @Override // defpackage.hzi
    public final synchronized void a(ltd ltdVar) {
        iby ibyVar;
        Iterator it = this.f.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                ibyVar = null;
                break;
            } else {
                ibyVar = (iby) it.next();
                if (ibyVar.x.b.l().equals(ltdVar)) {
                    break;
                }
            }
        }
        if (ibyVar != null) {
            u(ibyVar);
            g(ibyVar);
        }
    }

    @Override // defpackage.hzi
    public final synchronized void b(iby ibyVar, lau lauVar) {
        poe poeVarD = lauVar.d();
        lauVar.close();
        if (poeVarD != null) {
            HashMap map = this.f;
            if (map.containsKey(ibyVar)) {
                Long l = (Long) poeVarD.a(CaptureResult.SENSOR_TIMESTAMP);
                poeVarD.d();
                if (l != null) {
                    this.o = poeVarD;
                    ((HashMap) map.get(ibyVar)).put(l, poeVarD);
                    u(ibyVar);
                }
            }
        }
    }

    @Override // defpackage.hzi
    public final synchronized void c(iby ibyVar, BurstSpec burstSpec, poe poeVar) {
        this.f.put(ibyVar, new HashMap());
        u(ibyVar);
    }

    @Override // defpackage.hzi
    public final void d(iby ibyVar, BurstSpec burstSpec) {
        u(ibyVar);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0220 -> B:74:0x021c). Please report as a decompilation issue!!! */
    @Override // defpackage.iac
    public final synchronized void f(defpackage.iby r11, int r12, long r13, defpackage.poe r15) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldg.f(iby, int, long, poe):void");
    }

    protected final synchronized void g(iby ibyVar) {
        HashMap map = (HashMap) this.f.remove(ibyVar);
        if (map != null) {
            map.clear();
        }
    }

    public final boolean h(poe poeVar) {
        Optional optional = this.k;
        return optional.isPresent() && poeVar.a((CaptureResult.Key) optional.get()) != null;
    }

    @Override // defpackage.hzi
    public final void i(ltd ltdVar) {
        ibz ibzVarF = this.q.f(ltdVar);
        ibzVarF.a(this);
        ibzVarF.f(this);
        int i = ltdVar.a;
    }

    public final boolean j(poe poeVar) {
        Optional optional = this.l;
        return optional.isPresent() && poeVar.a((CaptureResult.Key) optional.get()) != null;
    }

    public final boolean k(poe poeVar) {
        return this.l.isPresent() && poeVar.a((CaptureResult.Key) this.m.get()) != null;
    }

    protected final boolean l() {
        return this.e.isPresent();
    }

    @Override // defpackage.iam
    public final synchronized void m(iby ibyVar) {
        ((sgt) a.c().M(3978)).t("3A_DEBUG onShotAborted for shotId=%d, shot 3A metadata will be cleared.", ibyVar.a());
        g(ibyVar);
    }

    protected final void n(final pfu pfuVar, final lss lssVar, Executor executor, final long j, final boolean z, final boolean z2) {
        executor.execute(new Runnable() { // from class: lde
            /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:13:0x0032, B:15:0x0040, B:17:0x0048, B:20:0x004f, B:22:0x0076, B:21:0x0074, B:23:0x007f), top: B:38:0x0030 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r10 = this;
                    ldg r0 = r10.a
                    lss r1 = r3
                    boolean r2 = r6
                    boolean r3 = r7
                    long r4 = r4
                    kow r6 = r0.b     // Catch: java.lang.Throwable -> La4
                    boolean r6 = r6.a()     // Catch: java.lang.Throwable -> La4
                    pfu r10 = r2
                    if (r6 != 0) goto L2c
                    java.lang.String r6 = "tryAcquireExclusiveSession"
                    boolean r6 = r10.t(r6)     // Catch: java.lang.Throwable -> La4 java.lang.Throwable -> La4
                    r7 = 0
                    if (r6 != 0) goto L30
                    pgq r6 = r10.d     // Catch: java.lang.Throwable -> La4 java.lang.Throwable -> La4
                    pgo r6 = r6.b()     // Catch: java.lang.Throwable -> La4 java.lang.Throwable -> La4
                    if (r6 == 0) goto L30
                    pmv r10 = r10.g     // Catch: java.lang.Throwable -> La4 java.lang.Throwable -> La4
                    pfz r7 = r10.j(r6)     // Catch: java.lang.Throwable -> La4 java.lang.Throwable -> La4
                    goto L30
                L2c:
                    pfz r7 = r10.u()     // Catch: java.lang.Throwable -> La4 java.lang.Throwable -> La4
                L30:
                    if (r7 == 0) goto L7f
                    ltd r10 = r1.l()     // Catch: java.lang.Throwable -> L98
                    int r10 = r10.a     // Catch: java.lang.Throwable -> L98
                    j$.util.Optional r10 = r0.d     // Catch: java.lang.Throwable -> L98
                    boolean r6 = r10.isEmpty()     // Catch: java.lang.Throwable -> L98
                    if (r6 != 0) goto L74
                    j$.util.Optional r6 = r0.c     // Catch: java.lang.Throwable -> L98
                    boolean r8 = r6.isEmpty()     // Catch: java.lang.Throwable -> L98
                    if (r8 != 0) goto L74
                    boolean r8 = r0.l()     // Catch: java.lang.Throwable -> L98
                    if (r8 != 0) goto L4f
                    goto L74
                L4f:
                    java.lang.Object r10 = r10.get()     // Catch: java.lang.Throwable -> L98
                    android.hardware.camera2.CaptureRequest$Key r10 = (android.hardware.camera2.CaptureRequest.Key) r10     // Catch: java.lang.Throwable -> L98
                    java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L98
                    pej r8 = new pej     // Catch: java.lang.Throwable -> L98
                    r8.<init>(r10, r6)     // Catch: java.lang.Throwable -> L98
                    j$.util.Optional r10 = r0.e     // Catch: java.lang.Throwable -> L98
                    java.lang.Object r10 = r10.get()     // Catch: java.lang.Throwable -> L98
                    android.hardware.camera2.CaptureRequest$Key r10 = (android.hardware.camera2.CaptureRequest.Key) r10     // Catch: java.lang.Throwable -> L98
                    java.lang.Long r6 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L98
                    pej r9 = new pej     // Catch: java.lang.Throwable -> L98
                    r9.<init>(r10, r6)     // Catch: java.lang.Throwable -> L98
                    scn r10 = defpackage.scn.H(r8, r9)     // Catch: java.lang.Throwable -> L98
                    goto L76
                L74:
                    sfd r10 = defpackage.sfd.a     // Catch: java.lang.Throwable -> L98
                L76:
                    ldf r6 = new ldf     // Catch: java.lang.Throwable -> L98
                    r6.<init>(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L98
                    r7.m(r10, r6)     // Catch: java.lang.Throwable -> L98
                    goto L92
                L7f:
                    sgv r10 = defpackage.ldg.a     // Catch: java.lang.Throwable -> L98
                    shi r10 = r10.c()     // Catch: java.lang.Throwable -> L98
                    r0 = 3964(0xf7c, float:5.555E-42)
                    shi r10 = r10.M(r0)     // Catch: java.lang.Throwable -> L98
                    sgt r10 = (defpackage.sgt) r10     // Catch: java.lang.Throwable -> L98
                    java.lang.String r0 = "3A_DEBUG frame server session for requesting debug data is null!"
                    r10.s(r0)     // Catch: java.lang.Throwable -> L98
                L92:
                    if (r7 == 0) goto L97
                    r7.close()     // Catch: java.lang.Throwable -> La4 java.lang.Throwable -> La4
                L97:
                    return
                L98:
                    r10 = move-exception
                    if (r7 == 0) goto La3
                    r7.close()     // Catch: java.lang.Throwable -> L9f
                    goto La3
                L9f:
                    r0 = move-exception
                    r10.addSuppressed(r0)     // Catch: java.lang.Throwable -> La4 java.lang.Throwable -> La4
                La3:
                    throw r10     // Catch: java.lang.Throwable -> La4 java.lang.Throwable -> La4
                La4:
                    r10 = move-exception
                    sgv r0 = defpackage.ldg.a
                    shi r0 = r0.b()
                    shi r10 = r0.i(r10)
                    sgt r10 = (defpackage.sgt) r10
                    r0 = 3965(0xf7d, float:5.556E-42)
                    shi r10 = r10.M(r0)
                    sgt r10 = (defpackage.sgt) r10
                    java.lang.String r0 = "3A_DEBUG request for frame=%d failed."
                    r10.u(r0, r4)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lde.run():void");
            }
        });
    }

    @Override // defpackage.iam
    public final void p(iby ibyVar, iag iagVar) {
        ((sgt) ((sgt) a.c().i(iagVar)).M(3979)).t("3A_DEBUG onShotError for shotId=%d, shot 3A metadata will be cleared.", u(ibyVar));
        g(ibyVar);
    }

    public final void r(poe poeVar) {
        Optional optional = this.n;
        if (optional.isPresent()) {
            poeVar.a((CaptureResult.Key) optional.get());
        }
    }

    @Override // defpackage.hzi
    public final /* synthetic */ void e(iby ibyVar) {
    }

    @Override // defpackage.iam
    public final /* synthetic */ void o(iby ibyVar, mdr mdrVar) {
    }
}
