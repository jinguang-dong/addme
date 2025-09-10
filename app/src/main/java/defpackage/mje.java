package defpackage;

import android.media.AudioManager;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import j$.util.Optional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mje {
    public static final sgv a = sgv.g("mje");
    public final pbn A;
    public final gno B;
    public final boolean C;
    public final List D;
    public final ScheduledExecutorService E;
    public pjr F;
    public oxh G;
    public oxj H;
    public klu I;
    public pka J;
    public pdn K;
    public mkt L;
    public our M;
    public kqx N;
    public rwc O;
    public peo P;
    public gcc Q;
    public gcc R;
    public ScheduledFuture S;
    public lte T;
    public mky U;
    public mlc V;
    public mla W;
    public szh X;
    public float Y;
    public oxd Z;
    private pdv aA;
    private Map aB;
    private Map aC;
    private int aD;
    private pdn aE;
    private final FocusIndicatorView aF;
    private final pfw aG;
    private final ngw aH;
    private final gga aI;
    private final obu aJ;
    private final obu aK;
    public pfu aa;
    public izs ab;
    public mjj ac;
    public final hbj ad;
    public final gfa ae;
    public final ree af;
    public final gtm ag;
    public final qqq ah;
    public final ojl ai;
    private final gcp aj;
    private final pjp ak;
    private final hyh al;
    private final owf am;
    private final rwc an;
    private final jwj ao;
    private final owq ap;
    private final owq aq;
    private final owq ar;
    private final owq as;
    private final owf at;
    private final ngk au;
    private final owq av;
    private final kcv aw;
    private final fee ax;
    private pjr ay;
    private pjo az;
    public final AudioManager c;
    public final ovx d;
    public final oxb e;
    public final gnt f;
    public final Executor g;
    public final jid i;
    public final out j;
    public final lav k;
    public final owf m;
    public final owq n;
    public final jwe o;
    public final jwh p;
    public owq q;
    public final owf r;
    public final owq s;
    public final fck t;
    public final ffq u;
    public final ScheduledExecutorService v;
    public final hem w;
    public final mik x;
    public final miv y;
    public final mkr z;
    public final AtomicBoolean b = new AtomicBoolean(false);
    private final ojl aL = new mja(this);
    public final List h = new CopyOnWriteArrayList();
    public final Object l = new Object();

    public mje(gfa gfaVar, AudioManager audioManager, hbj hbjVar, ngw ngwVar, gcp gcpVar, oxb oxbVar, ojl ojlVar, gnt gntVar, pjp pjpVar, Executor executor, jid jidVar, out outVar, pfw pfwVar, owf owfVar, owf owfVar2, fck fckVar, ffq ffqVar, mik mikVar, miv mivVar, pbn pbnVar, gtm gtmVar, gno gnoVar, qqq qqqVar, boolean z, hem hemVar, obu obuVar, ScheduledExecutorService scheduledExecutorService, owq owqVar, owf owfVar3, mky mkyVar, owq owqVar2, owq owqVar3, owq owqVar4, rwc rwcVar, ngk ngkVar, gga ggaVar, mkr mkrVar, obu obuVar2, hyh hyhVar, owq owqVar5, owf owfVar4, jwe jweVar, jwj jwjVar, jwh jwhVar, ScheduledExecutorService scheduledExecutorService2, lav lavVar, owq owqVar6, FocusIndicatorView focusIndicatorView, ree reeVar, kcv kcvVar, fee feeVar) {
        ovx ovxVar = new ovx(Float.valueOf(1.0f));
        this.s = ovxVar;
        this.D = new CopyOnWriteArrayList();
        this.O = rvk.a;
        this.Y = 1.0f;
        this.ae = gfaVar;
        this.c = audioManager;
        this.ad = hbjVar;
        this.e = oxbVar;
        this.aH = ngwVar;
        this.aj = gcpVar;
        this.ai = ojlVar;
        this.f = gntVar;
        this.ak = pjpVar;
        this.at = owfVar;
        this.C = z;
        this.aJ = obuVar;
        this.i = jidVar;
        this.j = outVar;
        this.aG = pfwVar;
        this.aq = owqVar3;
        this.o = jweVar;
        this.ao = jwjVar;
        this.p = jwhVar;
        this.d = new ovx(false);
        this.as = owqVar4;
        this.t = fckVar;
        this.u = ffqVar;
        this.x = mikVar;
        this.g = executor;
        this.y = mivVar;
        this.aI = ggaVar;
        this.A = pbnVar;
        this.ag = gtmVar;
        this.B = gnoVar;
        this.ap = owqVar2;
        this.ah = qqqVar;
        this.au = ngkVar;
        this.an = rwcVar;
        this.r = owfVar2;
        ovxVar.a(Float.valueOf(((Float) owfVar2.dL()).floatValue() * this.Y));
        this.w = hemVar;
        this.v = scheduledExecutorService;
        this.ar = owqVar;
        this.am = owfVar3;
        this.U = mkyVar;
        if (hbjVar.p(gzy.j)) {
            hbjVar.p(gzy.k);
        }
        this.z = mkrVar;
        this.aK = obuVar2;
        this.al = hyhVar;
        this.n = owqVar5;
        this.m = owfVar4;
        this.k = lavVar;
        this.av = owqVar6;
        this.aF = focusIndicatorView;
        this.af = reeVar;
        this.E = scheduledExecutorService2;
        this.aw = kcvVar;
        this.ax = feeVar;
        this.G = mkyVar.c();
        this.H = oxj.RES_1080P;
    }

    private final void n() {
        out.a();
        this.d.a(false);
        our ourVar = this.M;
        if (ourVar != null) {
            ourVar.close();
            this.M = null;
        }
        izs izsVar = this.ab;
        if (izsVar != null) {
            ((our) izsVar.L.a()).close();
            this.ab = null;
        }
    }

    public final float a() {
        if (this.y.c()) {
            return 1.75f / this.U.e;
        }
        return 1.0f;
    }

    public final int b() {
        return this.ad.p(gym.ad) ? 1 : 2;
    }

    public final int c() {
        return this.ax.c(this.az);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.rwd d() {
        /*
            r9 = this;
            owf r0 = r9.m
            java.lang.Object r0 = r0.dL()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            gzi r1 = defpackage.haw.a
            kcv r1 = r9.aw
            java.lang.Object r1 = r1.dL()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            com.google.android.apps.camera.focusindicator.FocusIndicatorView r1 = r9.aF
            owq r1 = r1.j
            ovx r1 = (defpackage.ovx) r1
            java.lang.Object r1 = r1.d
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L30
            r1 = r2
            goto L31
        L30:
            r1 = r3
        L31:
            hyh r4 = r9.al
            owf r4 = r4.b
            java.lang.Object r4 = r4.dL()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.util.concurrent.atomic.AtomicBoolean r5 = r9.b
            obu r6 = r9.aK
            boolean r5 = r5.get()
            boolean r7 = r6.v()
            if (r7 == 0) goto L90
            if (r4 == 0) goto L90
            if (r5 == 0) goto L90
            mkr r4 = r9.z
            fuf r5 = r4.p
            nkw r7 = defpackage.nkw.TIME_LAPSE
            boolean r5 = r5.a(r7)
            if (r5 == 0) goto L90
            luj r5 = r4.G
            luu r7 = defpackage.luf.G
            java.lang.Object r7 = r5.b(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "ns"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L77
            gnt r7 = r4.f
            boolean r7 = r7.i()
            if (r7 != 0) goto L8d
        L77:
            luu r7 = defpackage.luf.H
            java.lang.Object r5 = r5.b(r7)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L90
            gnt r4 = r4.f
            boolean r4 = r4.j()
            if (r4 == 0) goto L90
        L8d:
            if (r1 == 0) goto L90
            goto L91
        L90:
            r2 = r3
        L91:
            mkw r1 = defpackage.mkw.DEFAULT_30_FPS
            if (r2 == 0) goto Ldd
            hbj r9 = r9.ad
            gzg r3 = defpackage.haw.l
            boolean r3 = r9.p(r3)
            if (r3 == 0) goto Lb5
            gzg r3 = defpackage.haw.m
            j$.util.Optional r3 = r9.e(r3)
            java.lang.Object r3 = r3.get()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lb5
            mkw r1 = defpackage.mkw.LOW_12_FPS
        Lb5:
            boolean r3 = r6.w()
            if (r3 == 0) goto Ldd
            java.lang.Object r3 = r6.a
            gzg r4 = defpackage.haw.q
            hbj r3 = (defpackage.hbj) r3
            boolean r3 = r3.p(r4)
            if (r3 == 0) goto Ldd
            gzg r3 = defpackage.haw.r
            j$.util.Optional r9 = r9.e(r3)
            java.lang.Object r9 = r9.get()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 >= 0) goto Ldd
            mkw r1 = defpackage.mkw.ULTRA_LOW_4_FPS
        Ldd:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            r9.getClass()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            rwd r0 = new rwd
            r0.<init>(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mje.d():rwd");
    }

    public final void e() {
        ltd ltdVarA = ltd.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ltf ltfVar = ltf.TIMELAPSE;
        lte lteVarB = lte.b(ltdVarA, jCurrentTimeMillis, hei.a(ltfVar, System.currentTimeMillis()), ltfVar, this.aJ.q());
        this.T = lteVarB;
        this.h.add(lteVarB);
        this.w.m(this.T, Optional.empty());
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, owf] */
    public final void f(boolean z, boolean z2) {
        pdn pdnVarC;
        synchronized (this.l) {
            pdn pdnVar = this.aE;
            pdnVarC = null;
            if (pdnVar != null) {
                pdnVar.close();
                this.aE = null;
            }
        }
        if (z) {
            Object obj = this.l;
            synchronized (obj) {
                pfu pfuVar = this.aa;
                if (pfuVar == null) {
                    ((sgt) a.c().M(4837)).s("Frame server isn't created.");
                } else {
                    synchronized (obj) {
                        if (z2) {
                            Map map = this.aC;
                            lcz lczVar = lcz.RAW_WIDE;
                            if (map.get(lczVar) != null) {
                                gga ggaVar = (gga) this.ab.aD.a();
                                Map map2 = this.aB;
                                Map map3 = this.aC;
                                if (map3.get(lczVar) != null) {
                                    String str = ((peo) map3.get(lczVar)).d().a;
                                    HashMap map4 = new HashMap();
                                    for (Map.Entry entry : map2.entrySet()) {
                                        String strBY = qpt.bY((lcz) entry.getKey(), (pdv) entry.getValue());
                                        if (strBY != null) {
                                            map4.put(strBY, (pdv) entry.getValue());
                                        }
                                    }
                                    pdnVarC = new kzl(pfuVar, (our) ggaVar.c, ggaVar.b, ggaVar.d, ggaVar.a, map4, 3, str);
                                }
                            } else {
                                pdv pdvVar = (pdv) this.aB.get(lcz.a);
                                pdvVar.getClass();
                                pdnVarC = pfuVar.c(pdvVar, 3);
                            }
                        } else {
                            pdv pdvVar2 = (pdv) this.aB.get(lcz.PRIVATE_RECORDING);
                            pdvVar2.getClass();
                            pdnVarC = pfuVar.c(pdvVar2, 1);
                        }
                    }
                }
                if (pdnVarC == null) {
                    ((sgt) a.c().M(4836)).s("Failed to create video frame buffer.");
                    return;
                }
                our ourVar = this.M;
                ourVar.getClass();
                ourVar.d(pdnVarC);
                pdnVarC.l(new iva(this, 2));
                this.aE = pdnVarC;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0314 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mje.g():void");
    }

    public final void h() {
        pfu pfuVar = this.aa;
        if (pfuVar != null) {
            pfuVar.k();
        }
    }

    public final void i() {
        this.G = mkw.DEFAULT_30_FPS.a(this.U);
        k(false, false);
    }

    public final void j() {
        mik mikVar = this.x;
        if (mikVar.k.H()) {
            mikVar.r.d();
        }
        mikVar.a.set(false);
        mikVar.b.set(false);
        mikVar.u.f();
        this.aq.a(rvk.a);
        n();
        gcc gccVar = this.Q;
        if (gccVar != null) {
            gccVar.close();
            this.Q = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0358 A[LOOP:0: B:70:0x0352->B:72:0x0358, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03a1 A[LOOP:1: B:74:0x039b->B:76:0x03a1, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, owq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 1611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mje.k(boolean, boolean):void");
    }

    public final boolean l(boolean z, boolean z2, mkw mkwVar) {
        this.G = mkwVar.a(this.U);
        Set setKeySet = this.aC.keySet();
        setKeySet.retainAll(lcz.E);
        boolean z3 = (setKeySet.isEmpty() ^ true) != z2;
        this.j.execute(new msg(this, z3, z, z2, 1));
        return z3;
    }

    public final void m(pfu pfuVar) {
        if (nvl.n == null || !this.ad.p(gym.O)) {
            return;
        }
        this.aj.b(pfuVar, ((fyx) this.as.dL()).equals(fyx.RECORDING));
    }
}
