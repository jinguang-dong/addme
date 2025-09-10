package defpackage;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import com.google.ar.core.R;
import j$.time.Duration;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jby extends fqf {
    public static final sgv a = sgv.g("jby");
    public final rwc A;
    public final rwc B;
    public final nqp C;
    public final rwc D;
    public final kek E;
    public final owf F;
    public final owq G;
    public boolean K;
    public our L;
    public jtq M;
    public hfn N;
    public CountDownTimer O;
    public meu P;
    public final kdb Q;
    public final rwc R;
    public final owq S;
    public final iyu U;
    public final muu V;
    public final lmx W;
    public final ktx X;
    public final kqy Y;
    public final jho Z;
    private ProgressOverlay aA;
    private final los aB;
    private final rwc aC;
    private final kdz aD;
    private final juh aE;
    private final ipq aF;
    private final icd aG;
    private final kgp aJ;
    private final mbj aK;
    private final mug aL;
    private final imi aM;
    private final cxb aN;
    public jth aa;
    public final hbj ab;
    public final uh ac;
    public final qwz ad;
    public final obu af;
    private final pbn ag;
    private final kgt ah;
    private final moc ai;
    private final msi aj;
    private final uem ak;
    private final owq al;
    private final owq am;
    private final mes an;
    private final ihn ao;
    private final mhq ap;
    private final File aq;
    private final hyd ar;
    private final owf as;
    private final nrc at;
    private final owf au;
    private final owf av;
    private final owf aw;
    private final kte ax;
    private jtg ay;
    private our az;
    public final gnt b;
    public final out c;
    public final ndo d;
    public final jtu e;
    public final itl f;
    public final moy g;
    public final fbq h;
    public final rwc i;
    public final jtl j;
    public final owq k;
    public final kez l;
    public final fvu m;
    public final ndj n;
    public final AccessibilityManager o;
    public final hjb p;
    public final hyh q;
    public final kdh r;
    public final rwc s;
    public final lae v;
    public final gtx w;
    public final gtn x;
    public final HotshotController y;
    public final rwc z;
    public boolean H = false;
    public boolean I = false;
    public boolean J = false;
    public final gsn ae = new jbq(this);
    public final itk T = new jbr(this);
    private final hyg aH = new jbs(this);
    private final msk aI = new jbu(this, 0);

    public jby(pbn pbnVar, gnt gntVar, kgp kgpVar, iyu iyuVar, kgt kgtVar, rwc rwcVar, out outVar, jtu jtuVar, mbj mbjVar, itl itlVar, moy moyVar, rwc rwcVar2, owq owqVar, uem uemVar, jtl jtlVar, msi msiVar, kez kezVar, owq owqVar2, owq owqVar3, fbq fbqVar, lmx lmxVar, uh uhVar, hbj hbjVar, hyh hyhVar, cxb cxbVar, fvu fvuVar, ndj ndjVar, AccessibilityManager accessibilityManager, hjb hjbVar, ktx ktxVar, mes mesVar, kdb kdbVar, kdh kdhVar, obu obuVar, ihn ihnVar, mhq mhqVar, Context context, mug mugVar, rwc rwcVar3, lae laeVar, los losVar, rwc rwcVar4, kdz kdzVar, gtx gtxVar, kqy kqyVar, gtn gtnVar, imi imiVar, hyd hydVar, HotshotController hotshotController, moc mocVar, rwc rwcVar5, rwc rwcVar6, juh juhVar, ipq ipqVar, rwc rwcVar7, jho jhoVar, owf owfVar, nrc nrcVar, nqp nqpVar, owq owqVar4, rwc rwcVar8, kek kekVar, owf owfVar2, owq owqVar5, owf owfVar3, owf owfVar4, owf owfVar5, qwz qwzVar, icd icdVar, muu muuVar, kte kteVar) {
        this.ag = pbnVar;
        this.aJ = kgpVar;
        this.b = gntVar;
        this.U = iyuVar;
        this.ah = kgtVar;
        this.B = rwcVar;
        this.c = outVar;
        this.e = jtuVar;
        this.aK = mbjVar;
        this.f = itlVar;
        this.g = moyVar;
        this.i = rwcVar2;
        this.k = owqVar;
        this.j = jtlVar;
        this.aj = msiVar;
        this.ak = uemVar;
        this.l = kezVar;
        this.al = owqVar2;
        this.am = owqVar3;
        this.h = fbqVar;
        this.W = lmxVar;
        this.ab = hbjVar;
        this.aN = cxbVar;
        this.m = fvuVar;
        this.n = ndjVar;
        this.q = hyhVar;
        this.ac = uhVar;
        this.o = accessibilityManager;
        this.p = hjbVar;
        this.X = ktxVar;
        this.an = mesVar;
        this.P = (meu) mesVar.a();
        this.Q = kdbVar;
        this.r = kdhVar;
        this.af = obuVar;
        this.ao = ihnVar;
        this.ap = mhqVar;
        this.aq = context.getFilesDir();
        this.aL = mugVar;
        this.s = rwcVar3;
        this.v = laeVar;
        this.aB = losVar;
        this.aC = rwcVar4;
        this.aD = kdzVar;
        this.w = gtxVar;
        this.Y = kqyVar;
        this.x = gtnVar;
        this.aM = imiVar;
        this.ar = hydVar;
        this.y = hotshotController;
        this.ai = mocVar;
        this.z = rwcVar5;
        this.A = rwcVar6;
        this.aE = juhVar;
        this.aF = ipqVar;
        this.R = rwcVar7;
        this.Z = jhoVar;
        this.as = owfVar;
        this.at = nrcVar;
        this.C = nqpVar;
        this.S = owqVar4;
        this.D = rwcVar8;
        this.E = kekVar;
        this.F = owfVar2;
        this.G = owqVar5;
        this.au = owfVar3;
        this.av = owfVar4;
        this.aw = owfVar5;
        this.ad = qwzVar;
        this.aG = icdVar;
        this.V = muuVar;
        this.ax = kteVar;
        this.d = new jbt(this, kdbVar);
    }

    private final void P() {
        jtg jtgVar = this.ay;
        if (jtgVar != null) {
            if (jtgVar.isDone()) {
                jth jthVar = this.aa;
                if (jthVar != null) {
                    jthVar.close();
                    this.aa = null;
                }
            } else {
                this.ay.cancel(false);
            }
        }
        this.ay = null;
    }

    private final void Q(boolean z) {
        if (z) {
            this.aA.a();
        } else {
            this.aA.b();
        }
        this.W.d(this.aA);
    }

    public final void G(boolean z, boolean z2) {
        if (z) {
            this.Q.f();
            iyu iyuVar = this.U;
            iyuVar.K.p();
            iyuVar.K.c();
            return;
        }
        if (z2) {
            this.l.f();
        } else {
            this.n.ac();
        }
    }

    public final void H(int i) {
        this.p.g();
        AccessibilityManager accessibilityManager = this.o;
        if (accessibilityManager.isTouchExplorationEnabled()) {
            accessibilityManager.interrupt();
        }
        if (((Boolean) this.F.dL()).booleanValue() && !((Boolean) this.av.dL()).booleanValue()) {
            kdb kdbVar = this.Q;
            kdbVar.i(kdbVar.h);
        }
        this.aj.e(i);
    }

    public final void I(boolean z) {
        this.Q.f();
        if (!z) {
            this.aK.c(R.raw.camera_shutter);
            return;
        }
        if (this.ab.p(hac.L)) {
            this.aK.d(R.raw.astro_capture_end);
        } else {
            this.aK.c(R.raw.astro_longexposure_stop);
        }
        this.U.K.q();
    }

    public final void J(boolean z) {
        kqy kqyVar = this.Y;
        kqyVar.getClass();
        kqyVar.g(z, R.drawable.gs_astrophotography_mode_auto_fill1_vd_24, R.string.astro_auto_acc_desc, "AutoAstro", krs.NIGHT_FRONT_PHOTO_FLASH);
    }

    public final boolean K() {
        return this.aj.h();
    }

    public final boolean L() {
        if (this.aa == null) {
            return false;
        }
        hyh hyhVar = this.q;
        boolean z = hyhVar.l() || this.ar.h;
        jth jthVar = this.aa;
        jthVar.getClass();
        uh uhVarI = jthVar.i();
        if (!((Boolean) ((ovx) uhVarI.a).d).booleanValue() || !z) {
            return false;
        }
        this.e.f(uhVarI);
        if (hyhVar.m()) {
            this.l.eF();
        } else {
            this.l.c();
        }
        return true;
    }

    public final boolean M() {
        jth jthVar = this.aa;
        return jthVar != null && ((Boolean) jthVar.b().dL()).booleanValue();
    }

    public final void N(kqy kqyVar, boolean z) {
        ltw ltwVar = (ltw) this.k.dL();
        boolean z2 = true;
        if (!z && ltwVar.equals(ltw.f)) {
            z2 = false;
        }
        this.ax.ed(kqyVar, z2);
    }

    @Override // defpackage.fqf
    public final rwc a() {
        return rwc.i(this.aa);
    }

    final void b(boolean z) {
        this.j.a();
        this.E.b();
        this.U.K.q();
        kdb kdbVar = this.Q;
        kdbVar.f();
        kdbVar.a();
        this.n.x();
        this.w.h();
        rwc rwcVar = this.z;
        if (rwcVar.h()) {
            ((ftv) rwcVar.c()).c(!z);
        }
        this.C.D(-1);
        CountDownTimer countDownTimer = this.O;
        if (countDownTimer != null) {
            countDownTimer.onFinish();
        }
        if (z || this.q.l()) {
            return;
        }
        this.l.c();
    }

    public final void c() {
        if (this.t) {
            rwc rwcVar = this.D;
            if (rwcVar.h()) {
                ((hko) rwcVar.c()).e();
            }
            eB();
            jtq jtqVar = this.M;
            if (jtqVar != null) {
                jtqVar.b(this.b.j());
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        k(false);
    }

    public final void d() {
        our ourVar = this.az;
        if (ourVar == null || ourVar.b()) {
            return;
        }
        this.az.close();
    }

    public final void e() {
        if (this.L == null || this.q == null) {
            return;
        }
        our ourVar = this.az;
        if (ourVar == null || ourVar.b()) {
            our ourVarC = this.L.c();
            this.az = ourVarC;
            icd icdVar = this.aG;
            icdVar.getClass();
            ourVarC.d(icdVar.a());
        }
    }

    @Override // defpackage.fqf
    public final void eA() {
        K();
        b(true);
        J(false);
        rwc rwcVar = this.D;
        if (rwcVar.h()) {
            ((hko) rwcVar.c()).h();
            ((hko) rwcVar.c()).c(false);
        }
    }

    @Override // defpackage.fqf
    public final void eB() {
        if (!this.t) {
            ((sgt) a.c().M(2637)).s("Not reconfiguring camera since module is not started.");
            return;
        }
        pbp pbpVarA = this.ag.a("NightSightMode#startCameraFromCameraSetting");
        L();
        P();
        jtg jtgVarA = this.aJ.a(this.b, this.ah, nkw.NIGHT_SIGHT);
        this.ay = jtgVarA;
        jtgVarA.getClass();
        ske.W(jtgVarA, new iiz(this, pbpVarA, 5), this.c);
    }

    @Override // defpackage.fqf
    public final void eC() {
        rwc rwcVar = this.D;
        if (rwcVar.h()) {
            ((hko) rwcVar.c()).c(true);
            ((hko) rwcVar.c()).e();
        }
    }

    public final void f() {
        if (((Boolean) this.G.dL()).booleanValue()) {
            ((sgt) a.c().M(2632)).s("Force enter astro mode from watch");
        }
        if (((Boolean) this.aw.dL()).booleanValue()) {
            kdb kdbVar = this.Q;
            kdbVar.i(kdbVar.f);
            this.k.a(ltw.FIVE);
        } else {
            this.k.a(ltw.THREE);
        }
        this.J = true;
    }

    public final void g() {
        owq owqVar = this.am;
        ltq ltqVarA = ltq.a(((Integer) owqVar.dL()).intValue());
        ltq ltqVar = ltq.ON;
        if (ltqVarA != ltqVar) {
            owqVar.a(Integer.valueOf(ltqVar.f));
        }
        owq owqVar2 = this.al;
        if (ltq.a(((Integer) owqVar2.dL()).intValue()) != ltqVar) {
            owqVar2.a(Integer.valueOf(ltqVar.f));
        }
    }

    public final void k(boolean z) {
        if (this.t && !this.aj.i()) {
            if (z) {
                this.l.e();
            } else {
                this.l.j();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, kej] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, kej] */
    @Override // defpackage.fqf
    public final void l() {
        this.l.a();
        our ourVar = this.L;
        if (ourVar != null && !ourVar.b()) {
            this.L.close();
        }
        this.L = new our();
        this.W.b();
        hbj hbjVar = this.ab;
        if (!hbjVar.p(hac.L)) {
            jtl jtlVar = this.j;
            jtlVar.d();
            jtlVar.e(true);
        }
        nhm nhmVar = this.j.b;
        int i = 0;
        if (nhmVar != null) {
            nhmVar.f = 0;
            nhmVar.g = 0;
            nhmVar.k = false;
        }
        ndj ndjVar = this.n;
        nkw nkwVar = nkw.NIGHT_SIGHT;
        ndjVar.aw(nkwVar);
        pbn pbnVar = this.ag;
        pbnVar.f("CuttlefishModule#start");
        eB();
        k(true);
        this.m.A(this.ae);
        this.aE.b(this, nkwVar, this.L);
        this.L.d(new hye(this, 14));
        this.L.d(ndjVar.e(this.d));
        this.L.d(new hye(this, 15));
        our ourVar2 = this.L;
        owf owfVarA = owb.a(this.k);
        jbp jbpVar = new jbp(this, i);
        out outVar = this.c;
        ourVar2.d(owfVarA.dK(jbpVar, outVar));
        this.L.d(this.q.f(this.aH));
        this.L.d(this.ai.b(new jct(this, 1)));
        this.L.d(owb.a(this.au).dK(new jbp(this, 2), outVar));
        this.L.d(owl.j(this.as, new jbp(this, 3), outVar));
        this.f.b(this.T);
        this.L.d(new hye(this, 16));
        this.aj.d(this, this.aI, this.L);
        this.aA = (ProgressOverlay) ((ocq) ((mwq) this.ak.a()).b).c(R.id.progress_overlay);
        Q(true);
        cxb cxbVar = this.aN;
        if (fdo.q(cxbVar)) {
            H(fdo.b(cxbVar.g()));
            fdo.e(cxbVar.g());
        }
        uh uhVar = this.ac;
        uhVar.k();
        uhVar.j();
        this.r.b();
        this.L.d(new hye(this, 17));
        pbnVar.g();
        kdb kdbVar = this.Q;
        kdbVar.c(this.aM);
        this.L.d(kdbVar);
        our ourVar3 = this.L;
        mhq mhqVar = this.ap;
        ourVar3.d(mhqVar.d(this.ao));
        this.L.d(mhqVar.d(this.aB));
        if (hbjVar.p(hac.p)) {
            File file = this.aq;
            if (file.exists()) {
                this.L.d(new tgl(file.getAbsolutePath()));
            }
        }
        rwc rwcVar = this.aC;
        if (rwcVar.h()) {
            this.L.d(rwcVar.c().a());
            kdz kdzVar = this.aD;
            if (kdzVar.h) {
                rwcVar.c().b();
                kdzVar.h = false;
            }
        }
        this.aF.a(new jbh(this, 12), new jbh(this, 9), this.L);
        if (hbjVar.p(gzo.bJ)) {
            muu muuVar = this.V;
            muuVar.g(rbb.e, R.string.night_sight_help_button_accessibility, R.string.mode_cuttlefish, false);
            muuVar.h(this);
            this.L.d(new hye(this, 13));
        }
    }

    @Override // defpackage.fqf
    public final void m() {
        L();
        this.L.close();
        P();
        if (this.J) {
            this.k.a(ltw.OFF);
            this.J = false;
        }
        kqy kqyVar = this.Y;
        kqyVar.getClass();
        N(kqyVar, false);
        this.H = false;
        this.I = false;
        g();
        this.ah.d();
        this.j.e(false);
        Q(false);
        this.W.a();
        this.l.b();
        this.K = false;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, owf] */
    @Override // defpackage.fqf
    public final void n() {
        pbn pbnVar = this.ag;
        pbnVar.f("CuttlefishModule#takePictureNow");
        jth jthVar = this.aa;
        if (jthVar == null) {
            ((sgt) a.c().M(2645)).s("Not taking picture since Camera is closed.");
            d();
            return;
        }
        if (!((Boolean) jthVar.b().dL()).booleanValue()) {
            ((sgt) a.c().M(2644)).s("Not taking picture since the Camera is not ready to take a picture.");
            d();
            return;
        }
        this.p.g();
        AccessibilityManager accessibilityManager = this.o;
        if (accessibilityManager.isTouchExplorationEnabled()) {
            accessibilityManager.interrupt();
        }
        k(false);
        this.aK.c(R.raw.longexposure_start);
        this.j.b();
        e();
        Duration duration = (Duration) jthVar.i().b.dL();
        duration.toMillis();
        hyh hyhVar = this.q;
        if (!hyhVar.k()) {
            rwc rwcVar = this.z;
            if (rwcVar.h()) {
                ((ftv) rwcVar.c()).s(duration);
            }
        }
        boolean zB = this.ar.b(duration);
        if (hyhVar.k() || !zB) {
            this.l.eG();
        } else {
            this.l.f();
        }
        this.aL.a();
        this.e.c(jthVar, new jbx(this, zB), this.K, this.P).c(new jbh(this, 11), this.c);
        this.P.a();
        this.P.d();
        this.K = false;
        this.P = (meu) this.an.a();
        pbnVar.g();
    }

    @Override // defpackage.fqf
    public final boolean o() {
        out.a();
        if (K()) {
            return true;
        }
        L();
        return false;
    }

    @Override // defpackage.fqf
    public final void s(Runnable runnable) {
        nrc nrcVar = this.at;
        if (nrcVar.b < nrcVar.a(nkw.NIGHT_SIGHT)) {
            return;
        }
        runnable.run();
    }

    @Override // defpackage.fqf
    public final void u(int i) {
        jth jthVar;
        if (i != 0 || (jthVar = this.aa) == null) {
            return;
        }
        k(((Boolean) jthVar.b().dL()).booleanValue());
    }

    @Override // defpackage.fqf
    public final void w() {
        g();
    }
}
