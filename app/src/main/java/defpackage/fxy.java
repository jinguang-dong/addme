package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fxy implements oyk, paq {
    public lte A;
    public ScheduledFuture B;
    public final List C;
    public fxx D;
    public gdv E;
    public int F;
    public pbp G;
    public final fxm H;
    public final ktx I;
    public final ggo J;
    public final luj K;
    public final hbj L;
    public final ggg M;
    public final ggg N;
    public final lta O;
    public final cxb P;
    public final obu Q;
    private final naw S;
    private final gno V;
    private final boolean W;
    private final rwc X;
    private final gbg Y;
    private final lti Z;
    private final lru aa;
    private final rwc ab;
    private final gnp ac;
    private gcc ad;
    private long ae;
    private final fzb af;
    private final got ag;
    public final out b;
    public final fyd c;
    public final gdm f;
    public final fyw g;
    public final fyc h;
    public final gbp i;
    public final gaw j;
    public final gau k;
    public final ggz m;
    public final gcz n;
    public final ScheduledExecutorService o;
    public final mfd p;
    public final rwc q;
    public final gkr r;
    public final gks s;
    public final hem t;
    public final ScheduledExecutorService u;
    public final pbn v;
    public final Set w;
    public final gda x;
    public static final sgv a = sgv.g("fxy");
    private static final long R = TimeUnit.MINUTES.toSeconds(1);
    public final List d = DesugarCollections.synchronizedList(new ArrayList());
    public final Object e = new Object();
    private final fxg T = new fxg();
    private final pak U = new pak();
    public final AtomicReference l = new AtomicReference();
    public final List y = new ArrayList();
    public final List z = new CopyOnWriteArrayList();

    public fxy(out outVar, ggg gggVar, fyw fywVar, fyc fycVar, cxb cxbVar, gav gavVar, got gotVar, ggo ggoVar, ghd ghdVar, gdm gdmVar, gno gnoVar, fyd fydVar, ggg gggVar2, mfd mfdVar, hbj hbjVar, ktx ktxVar, ghr ghrVar, final naw nawVar, boolean z, cxb cxbVar2, gkr gkrVar, gks gksVar, fzb fzbVar, luj lujVar, hem hemVar, ScheduledExecutorService scheduledExecutorService, pbn pbnVar, rwc rwcVar, gbg gbgVar, lti ltiVar, Set set, lta ltaVar, gda gdaVar, gbp gbpVar, qrh qrhVar, obu obuVar, fxm fxmVar, gaw gawVar, lte lteVar, lru lruVar) {
        ArrayList arrayList = new ArrayList();
        this.C = arrayList;
        final int i = 0;
        this.F = 0;
        this.ae = 0L;
        this.b = outVar;
        this.N = gggVar;
        this.c = fydVar;
        this.ag = gotVar;
        this.J = ggoVar;
        this.g = fywVar;
        this.h = fycVar;
        this.P = cxbVar;
        this.L = hbjVar;
        this.I = ktxVar;
        this.S = nawVar;
        this.W = z;
        this.x = gdaVar;
        this.i = gbpVar;
        this.Q = obuVar;
        this.j = gawVar;
        gau gauVarA = gavVar.a();
        this.k = gauVarA;
        this.H = fxmVar;
        this.m = ghdVar;
        this.f = gdmVar;
        this.V = gnoVar;
        this.o = ojl.cc("Recording-" + ((AtomicInteger) gotVar.b).incrementAndGet());
        this.M = gggVar2;
        this.p = mfdVar;
        this.r = gkrVar;
        this.s = gksVar;
        this.af = fzbVar;
        this.K = lujVar;
        this.t = hemVar;
        this.u = scheduledExecutorService;
        this.v = pbnVar;
        this.X = rwcVar;
        this.Y = gbgVar;
        this.Z = ltiVar;
        this.w = set;
        this.O = ltaVar;
        this.aa = lruVar;
        this.ab = gawVar.L ? rwc.j(qrhVar.k()) : rvk.a;
        this.A = lteVar;
        l(fxx.READY);
        gotVar.f();
        final int i2 = 1;
        if (fywVar.h()) {
            arrayList.add(ghrVar.f);
            cxbVar.w(gdo.RECORDING_SESSION).d(ghrVar.a(new ghp(this, i2)));
        }
        cxbVar.w(gdo.RECORDING_SESSION).d(ghdVar);
        this.q = gawVar.c == oxh.FPS_AUTO ? rwc.j(new gct()) : rvk.a;
        this.n = new gcz(gawVar, cxbVar2, hbjVar, gksVar, gauVarA, b(), pbnVar);
        gnp gnpVar = new gnp();
        this.ac = gnpVar;
        gnpVar.d = gawVar.c.l;
        rwc rwcVar2 = gawVar.k;
        if (rwcVar2.h()) {
            long jIntValue = ((Integer) rwcVar2.c()).intValue();
            gdmVar.b(jIntValue, new gdl() { // from class: fxq
                @Override // defpackage.gdl
                public final void a() {
                    int i3 = i2;
                    if (i3 == 0) {
                        sgv sgvVar = fxy.a;
                        ((naw) this).c(nau.ONE_MIN_REMAINING);
                        return;
                    }
                    if (i3 == 1) {
                        ((fxy) this).d();
                        return;
                    }
                    sgv sgvVar2 = fxy.a;
                    ((naw) this).c(nau.FIVE_SECS_REMAINING);
                }
            });
            if (gawVar.L) {
                gdmVar.b(jIntValue - R, new gdl() { // from class: fxq
                    @Override // defpackage.gdl
                    public final void a() {
                        int i3 = i;
                        if (i3 == 0) {
                            sgv sgvVar = fxy.a;
                            ((naw) nawVar).c(nau.ONE_MIN_REMAINING);
                            return;
                        }
                        if (i3 == 1) {
                            ((fxy) nawVar).d();
                            return;
                        }
                        sgv sgvVar2 = fxy.a;
                        ((naw) nawVar).c(nau.FIVE_SECS_REMAINING);
                    }
                });
                final int i3 = 2;
                gdmVar.b(jIntValue - 5, new gdl() { // from class: fxq
                    @Override // defpackage.gdl
                    public final void a() {
                        int i32 = i3;
                        if (i32 == 0) {
                            sgv sgvVar = fxy.a;
                            ((naw) nawVar).c(nau.ONE_MIN_REMAINING);
                            return;
                        }
                        if (i32 == 1) {
                            ((fxy) nawVar).d();
                            return;
                        }
                        sgv sgvVar2 = fxy.a;
                        ((naw) nawVar).c(nau.FIVE_SECS_REMAINING);
                    }
                });
            }
        }
    }

    private final float n() {
        rwc rwcVar = this.q;
        if (!rwcVar.h()) {
            return this.j.c == oxh.FPS_30 ? 1.0f : 0.0f;
        }
        float f = ((gct) rwcVar.c()).a;
        float f2 = (r3.b / 2) + f;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f / f2;
    }

    private static boolean o(gaw gawVar, gau gauVar) {
        return gawVar.G && ((ltv) gauVar.u.dL()).equals(ltv.ON);
    }

    public final gbt a() {
        gbt gbtVar;
        synchronized (this.e) {
            gdv gdvVar = this.E;
            gdvVar.getClass();
            gbtVar = (gbt) ujp.aQ(gdvVar.b);
        }
        return gbtVar;
    }

    public final gho b() {
        List list = this.C;
        if (list.isEmpty()) {
            return null;
        }
        return (gho) ujp.aQ(list);
    }

    @Override // defpackage.oyv
    public final void c(oyu oyuVar) {
        if (!this.j.E) {
            throw new UnsupportedOperationException("Not implemented");
        }
        this.T.c(oyuVar);
        this.H.c(oyuVar);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            fxx fxxVar = this.D;
            fxx fxxVar2 = fxx.STOPPED;
            if (fxxVar != fxxVar2) {
                l(fxxVar2);
                this.o.shutdown();
                this.P.x(gdo.RECORDING_SESSION);
                Iterator it = this.w.iterator();
                while (it.hasNext()) {
                    ((gcv) it.next()).close();
                }
            }
        }
    }

    @Override // defpackage.oyk
    public final void d() {
        fxm fxmVar = this.H;
        fyd fydVar = fxmVar.d;
        fxmVar.p(new foh(fydVar, 18), new foh(fydVar, 18), 6);
    }

    @Override // defpackage.oyk
    public final void e() {
        synchronized (this.e) {
            if (this.D == fxx.STOPPING_RECORDING) {
                return;
            }
            if (this.g.j()) {
                try {
                    this.ad = this.V.e(this.j.g.a.f);
                    gdv gdvVar = this.E;
                    gdvVar.getClass();
                    gdvVar.a.l(this.ad.e());
                } catch (Exception e) {
                    ((sgt) ((sgt) a.b().i(e)).M(534)).s("Failed to set next video file.");
                    f();
                }
            }
        }
    }

    @Override // defpackage.oyk
    public final void f() {
        fxm fxmVar = this.H;
        fyd fydVar = fxmVar.d;
        fxmVar.p(new foh(fydVar, 19), new foh(fydVar, 19), 5);
    }

    @Override // defpackage.oyk
    public final void g() {
        synchronized (this.e) {
            gbs gbsVarE = gbt.e();
            gbsVarE.b(this.ad);
            gbsVarE.c(this.ag.g());
            gaw gawVar = this.j;
            gbsVarE.b = gawVar.c;
            gbt gbtVarA = gbsVarE.a();
            this.f.d(((gbr) gbtVarA).b);
            m(a());
            gdv gdvVar = this.E;
            gdvVar.getClass();
            gdvVar.b.add(gbtVarA);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ltd ltdVarA = ltd.a();
            ltf ltfVar = gawVar.C;
            lte lteVarB = lte.b(ltdVarA, jCurrentTimeMillis, hei.a(ltfVar, jCurrentTimeMillis), ltfVar, this.Q.q());
            this.A = lteVarB;
            lteVarB.getClass();
            i(lteVarB);
        }
    }

    @Override // defpackage.oyk
    public final void h(long j, long j2) {
        a().c++;
        long j3 = j2 * 8;
        this.U.a(new paj(j, j3));
        this.ae += j3;
        this.n.k(j);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(TimeUnit.MICROSECONDS.toMillis(j));
        instantOfEpochMilli.getClass();
        gnp gnpVar = this.ac;
        long j4 = gnpVar.a + 1;
        gnpVar.a = j4;
        if (j4 != 1) {
            Duration.between(gnpVar.e, instantOfEpochMilli).getClass();
            Duration.ofSeconds(1L).dividedBy(gnpVar.d).getClass();
            double millis = r4.toMillis() / r5.toMillis();
            if (Double.isNaN(millis)) {
                throw new IllegalArgumentException("Cannot round NaN value.");
            }
            int iRound = (millis > 2.147483647E9d ? Integer.MAX_VALUE : millis < -2.147483648E9d ? Integer.MIN_VALUE : (int) Math.round(millis)) - 1;
            if (iRound > 0) {
                if (iRound > gnpVar.c) {
                    gnpVar.c = iRound;
                }
                gnpVar.b += iRound;
            }
        }
        gnpVar.e = instantOfEpochMilli;
    }

    public final void i(lte lteVar) {
        this.z.add(lteVar);
        this.t.m(lteVar, Optional.empty());
    }

    public final void j() {
        synchronized (this.e) {
            fxx fxxVar = this.D;
            if (fxxVar == fxx.STOPPED) {
                ((sgt) a.c().M(530)).s("Already stopped.");
                return;
            }
            if (fxxVar != fxx.STOPPING_RECORDING) {
                close();
                throw new IllegalStateException("doStop when state=" + String.valueOf(this.D));
            }
            this.p.j(mfc.VIDEO_RECORDER_STOPPED);
            if (this.j.F) {
                this.r.a();
                this.s.c(false);
            }
            this.f.i();
            this.i.c();
            gce gceVar = this.J.b;
            gceVar.getClass();
            synchronized (((gcm) gceVar).c) {
                if (((gcm) gceVar).N) {
                    ((sgt) gcm.a.c().M(719)).s("Already closed.");
                } else {
                    pdn pdnVar = ((gcm) gceVar).x;
                    if (pdnVar != null) {
                        pdnVar.close();
                        ((gcm) gceVar).x = null;
                        pdn pdnVar2 = ((gcm) gceVar).y;
                        if (pdnVar2 != null) {
                            pdnVar2.close();
                            ((gcm) gceVar).y = null;
                        }
                        fcr fcrVar = ((gcm) gceVar).E;
                        fcrVar.getClass();
                        fcrVar.b(6);
                    } else {
                        ((sgt) gcm.a.c().M(717)).s("Recording stream not attached.");
                    }
                }
            }
            this.G.a();
            gau gauVar = this.k;
            if (((ovx) gauVar.g).d == gas.RECORDING_SESSION_ACTIVE) {
                gauVar.a(gas.CAPTURE_SESSION_ACTIVE);
            }
            ScheduledFuture scheduledFuture = this.B;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            close();
        }
    }

    public final void k(String str) {
        lte lteVar = this.A;
        lteVar.getClass();
        this.t.g(lteVar.b, str);
    }

    final void l(fxx fxxVar) {
        synchronized (this.e) {
            this.D = fxxVar;
        }
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [gcc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v36, types: [gcc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [gcc, java.lang.Object] */
    public final void m(gbt gbtVar) {
        gaw gawVar;
        boolean z;
        synchronized (this.e) {
            gcc gccVarB = gbtVar.b();
            rwc rwcVarD = gbtVar.d();
            long jA = this.f.a(gbtVar.a());
            if (gbtVar.f() && ((z = (gawVar = this.j).E) || jA >= 1000)) {
                gccVarB.close();
                if (rwcVarD.h()) {
                    rwcVarD.c().close();
                }
                gdv gdvVar = this.E;
                gdvVar.getClass();
                oyn oynVar = gdvVar.a;
                if (gdvVar.b.size() == 1 && z) {
                    jA = ((Long) oynVar.e().e(Long.valueOf(jA))).longValue();
                }
                long j = jA;
                float f = j / 1000.0f;
                float fA = 0.0f;
                if (f != 0.0f) {
                    fA = this.ae / (f * gawVar.c.a());
                }
                long jH = z ? this.ac.a : this.n.h();
                oxp oxpVar = gawVar.g;
                ggg gggVar = this.M;
                oynVar.c();
                gau gauVar = this.k;
                owq owqVar = gauVar.f;
                boolean zBooleanValue = ((Boolean) ((ovx) owqVar).d).booleanValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                gcz gczVar = this.n;
                int iG = gczVar.g();
                int iF = gczVar.f();
                got gotVar = this.ag;
                int iE = gotVar.e();
                int iF2 = gotVar.f();
                owf owfVar = gauVar.s;
                int iIntValue = ((Integer) ((ovx) owfVar).d).intValue();
                fxg fxgVar = this.T;
                Map mapA = fxgVar.a();
                ltf ltfVar = gawVar.C;
                List list = this.C;
                int i = this.F;
                boolean z2 = this.W;
                float fN = n();
                long j2 = (long) fA;
                lte lteVar = this.A;
                lteVar.getClass();
                boolean z3 = gawVar.F;
                boolean zO = o(gawVar, gauVar);
                fzb fzbVar = this.af;
                rwc rwcVarA = fzbVar.a();
                rwc rwcVar = this.X;
                rwc rwcVarJ = rwcVar.h() ? rwc.j(((qqq) rwcVar.c()).x()) : rvk.a;
                gbg gbgVar = this.Y;
                rwc rwcVarA2 = gbgVar.a();
                lti ltiVar = this.Z;
                int iB = ltiVar.b();
                boolean z4 = gawVar.L;
                rwc rwcVarJ2 = gawVar.S ? rwc.j((Float) gauVar.y.dL()) : rvk.a;
                rwc rwcVar2 = this.ab;
                gnp gnpVar = this.ac;
                gbw gbwVar = new gbw(gccVarB, oxpVar, gggVar, zBooleanValue, jCurrentTimeMillis, j, iG, iF, iE, iF2, iIntValue, jH, mapA, ltfVar, list, i, z2, fN, j2, lteVar, z3, zO, rwcVarA, rwcVarJ, rwcVarA2, iB, z4, true, rwcVarJ2, rwcVar2, gnpVar.b, gnpVar.c);
                gczVar.h();
                gczVar.g();
                gczVar.f();
                if (z) {
                    ((sgt) a.c().M(544)).A("Video file encoded %d frames, frame drop listener saw %d", gbwVar.k, gczVar.h());
                }
                List list2 = this.y;
                list2.add(0, gbwVar);
                if (rwcVarD.h()) {
                    ?? C = rwcVarD.c();
                    Object objC = gawVar.h.c();
                    oynVar.c();
                    boolean zBooleanValue2 = ((Boolean) ((ovx) owqVar).d).booleanValue();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    int iG2 = gczVar.g();
                    int iF3 = gczVar.f();
                    int iE2 = gotVar.e();
                    int iF4 = gotVar.f();
                    int iIntValue2 = ((Integer) ((ovx) owfVar).d).intValue();
                    Map mapA2 = fxgVar.a();
                    int i2 = this.F;
                    float fN2 = n();
                    lte lteVar2 = this.A;
                    lteVar2.getClass();
                    boolean zO2 = o(gawVar, gauVar);
                    rwc rwcVarA3 = fzbVar.a();
                    rwc rwcVarJ3 = rwcVar.h() ? rwc.j(((qqq) rwcVar.c()).x()) : rvk.a;
                    rwc rwcVarA4 = gbgVar.a();
                    int iB2 = ltiVar.b();
                    rvk rvkVar = rvk.a;
                    list2.add(0, new gbw(C, (oxp) objC, gggVar, zBooleanValue2, jCurrentTimeMillis2, j, iG2, iF3, iE2, iF4, iIntValue2, jH, mapA2, ltfVar, list, i2, z2, fN2, j2, lteVar2, z3, zO2, rwcVarA3, rwcVarJ3, rwcVarA4, iB2, z4, false, rvkVar, rvkVar, gnpVar.b, gnpVar.c));
                }
                return;
            }
            gccVarB.f();
            if (rwcVarD.h()) {
                rwcVarD.c().f();
            }
            this.S.c(nau.RECORDING_TOO_SHORT);
            ((sgt) a.c().M(542)).s("Video file is abandoned. Probably because the length is too short.");
            hem hemVar = this.t;
            lte lteVar3 = this.A;
            lteVar3.getClass();
            hemVar.j(lteVar3.b);
            List list3 = this.z;
            lte lteVar4 = this.A;
            lteVar4.getClass();
            list3.remove(lteVar4);
            this.aa.g(9, 9, null);
        }
    }
}
