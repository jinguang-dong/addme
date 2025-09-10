package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.Size;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.backup.cNHl.ibINv;
import com.google.android.apps.camera.debugui.DebugCanvasView;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jbc extends fqf implements mwe, hrp {
    public static final sgv a = sgv.g("jbc");
    public jtd A;
    public syu B;
    public kfg C;
    public jtq D;
    public hfn E;
    public meu F;
    public final syu G;
    public final owq H;
    public final our K;
    public final mos M;
    public final jti N;
    public our O;
    public final rwc P;
    public final Optional Q;
    public final moy R;
    public final ovx T;
    public final hyh U;
    public final fbq V;
    public final msi W;
    public final nan X;
    public final gny Y;
    public final owf Z;
    public final hbj aA;
    public final mbj aB;
    public final uh aC;
    public final qwz aD;
    public final gtm aE;
    public final qqq aF;
    private final Executor aG;
    private final kgt aH;
    private final Resources aI;
    private final mes aJ;
    private final fvu aK;
    private final naw aL;
    private final jub aM;
    private final hfy aN;
    private final mes aO;
    private final rwc aP;
    private final rwc aQ;
    private final lrd aR;
    private jtm aS;
    private final hyd aU;
    private final moc aW;
    private final ngk aX;
    private final itl aY;
    public final rwc aa;
    public final lae ab;
    public final krn ac;
    public final owq ad;
    public final owq ae;
    public final owf af;
    public final rwc ag;
    public final owf ah;
    public final fdq aj;
    public final ktx ak;
    public final hie al;
    public final jbe am;
    public final iyu an;
    public final mbj ao;
    public final nks ap;
    public kgw aq;
    public final lmx ar;
    public final krj as;
    public final imi at;
    public final muu au;
    public final luj av;
    public final jho aw;
    public final mnt ax;
    public final mns ay;
    public final mdy az;
    public final kpb b;
    private final owd bA;
    private final gsn bB;
    private final iso bC;
    private final mwq bD;
    private final pfl bE;
    private final nan bb;
    private final kdh bd;
    private final gtn be;
    private final juh bf;
    private final ipq bg;
    private final ipv bh;
    private final owf bi;
    private final owf bj;
    private final nrc bk;
    private final owf bl;
    private final owq bm;
    private final owf bn;
    private final owf bo;
    private final rwc bp;
    private final pjo bq;
    private final owf br;
    private final owf bs;
    private boolean bt;
    private final nca bu;
    private final mug bv;
    private final nll bw;
    private final pkc bx;
    private final mns by;
    private final cxb bz;
    public final out c;
    public final pbn d;
    public final itn e;
    public final ndj f;
    public final ndo g;
    public final mts h;
    public final gnt i;
    public final nas j;
    public final itm k;
    public final mzz l;
    public final rwc m;
    public final rwc n;
    public final tzj o;
    public final rwc p;
    public final rwc q;
    public final rwc r;
    public final rwc s;
    public final jtl v;
    public final hjb w;
    public final AccessibilityManager x;
    public final HotshotController y;
    public final boolean z;
    private boolean aT = false;
    public boolean I = false;
    public boolean J = false;
    public our L = new our();
    private final jal aV = new jal();
    public final ovx S = new ovx(true);
    private final itk aZ = new jat(this);
    private final msk ba = new jau(this);
    private boolean bc = false;
    public ltf ai = null;

    public jbc(Context context, iyu iyuVar, fdq fdqVar, out outVar, Executor executor, pbn pbnVar, mes mesVar, pkc pkcVar, ktx ktxVar, mwq mwqVar, mbj mbjVar, kgt kgtVar, rwc rwcVar, owq owqVar, kpb kpbVar, moc mocVar, moy moyVar, itl itlVar, ngw ngwVar, ngk ngkVar, AccessibilityManager accessibilityManager, hjb hjbVar, kdh kdhVar, syu syuVar, uem uemVar, cxb cxbVar, nca ncaVar, fvu fvuVar, ndj ndjVar, hie hieVar, krj krjVar, mts mtsVar, lmx lmxVar, mdy mdyVar, fbq fbqVar, msi msiVar, gnt gntVar, qqq qqqVar, nas nasVar, naw nawVar, jub jubVar, jbe jbeVar, uh uhVar, hbj hbjVar, jtl jtlVar, mzz mzzVar, nks nksVar, rwc rwcVar2, hfy hfyVar, lrd lrdVar, iso isoVar, mos mosVar, mbj mbjVar2, pfl pflVar, mes mesVar2, tzj tzjVar, mhq mhqVar, ihn ihnVar, mhu mhuVar, rwc rwcVar3, imi imiVar, owf owfVar, rwc rwcVar4, hyh hyhVar, gny gnyVar, gtm gtmVar, mug mugVar, los losVar, rwc rwcVar5, gtn gtnVar, lae laeVar, AtomicBoolean atomicBoolean, rwc rwcVar6, Optional optional, rwc rwcVar7, rwc rwcVar8, rwc rwcVar9, rwc rwcVar10, hyd hydVar, HotshotController hotshotController, juh juhVar, ipq ipqVar, ipv ipvVar, krn krnVar, jho jhoVar, owf owfVar2, mnt mntVar, mns mnsVar, owd owdVar, mns mnsVar2, owf owfVar3, nrc nrcVar, owq owqVar2, owf owfVar4, owq owqVar3, owf owfVar5, owf owfVar6, owf owfVar7, rwc rwcVar11, muu muuVar, rwc rwcVar12, nll nllVar, pjo pjoVar, owq owqVar4, qwz qwzVar, luj lujVar, owf owfVar8, owf owfVar9, owf owfVar10) {
        this.an = iyuVar;
        pkcVar.getClass();
        this.bx = pkcVar;
        this.bD = mwqVar;
        this.aj = fdqVar;
        this.c = outVar;
        this.aG = executor;
        Resources resources = context.getResources();
        this.aI = resources;
        this.d = pbnVar;
        this.aJ = mesVar;
        this.ak = ktxVar;
        this.ao = mbjVar;
        this.bd = kdhVar;
        this.aH = kgtVar;
        this.s = rwcVar;
        this.H = owqVar;
        this.b = kpbVar;
        this.aW = mocVar;
        this.R = moyVar;
        this.aY = itlVar;
        this.aX = ngkVar;
        this.x = accessibilityManager;
        this.w = hjbVar;
        this.G = syuVar;
        this.bz = cxbVar;
        this.bu = ncaVar;
        this.aK = fvuVar;
        this.f = ndjVar;
        this.al = hieVar;
        this.h = mtsVar;
        this.as = krjVar;
        this.ar = lmxVar;
        this.az = mdyVar;
        this.i = gntVar;
        this.aF = qqqVar;
        this.j = nasVar;
        this.aL = nawVar;
        this.aM = jubVar;
        this.am = jbeVar;
        this.aC = uhVar;
        this.Z = owfVar;
        this.aa = rwcVar5;
        this.ab = laeVar;
        this.au = muuVar;
        this.av = lujVar;
        this.T = new ovx(false);
        our ourVar = new our();
        this.K = ourVar;
        jti jtiVar = new jti();
        this.N = jtiVar;
        this.O = new our();
        this.aA = hbjVar;
        this.v = jtlVar;
        this.l = mzzVar;
        this.n = rwcVar2;
        this.aN = hfyVar;
        this.aR = lrdVar;
        this.bC = isoVar;
        this.M = mosVar;
        this.aB = mbjVar2;
        this.bE = pflVar;
        this.aO = mesVar2;
        this.F = (meu) mesVar2.a();
        this.o = tzjVar;
        this.m = rwcVar3;
        this.at = imiVar;
        this.p = rwcVar4;
        this.U = hyhVar;
        this.Y = gnyVar;
        this.aE = gtmVar;
        this.bv = mugVar;
        this.be = gtnVar;
        this.P = rwcVar6;
        this.Q = optional;
        this.V = fbqVar;
        this.W = msiVar;
        this.q = rwcVar8;
        this.r = rwcVar9;
        this.aQ = rwcVar10;
        this.aU = hydVar;
        this.y = hotshotController;
        this.bf = juhVar;
        this.bg = ipqVar;
        this.bh = ipvVar;
        this.ac = krnVar;
        this.aP = rwcVar7;
        this.z = hbjVar.p(gzy.j) && hbjVar.p(gzy.k);
        this.aw = jhoVar;
        this.bi = owfVar2;
        this.ay = mnsVar;
        this.ax = mntVar;
        this.bA = owdVar;
        this.by = mnsVar2;
        this.bj = owfVar3;
        this.bk = nrcVar;
        this.ad = owqVar2;
        this.bl = owfVar4;
        this.bm = owqVar3;
        this.af = owfVar5;
        this.bn = owfVar6;
        this.bo = owfVar7;
        this.bp = rwcVar12;
        this.bw = nllVar;
        this.bq = pjoVar;
        this.ae = owqVar4;
        this.aD = qwzVar;
        this.br = owfVar8;
        this.bs = owfVar9;
        this.ah = owfVar10;
        ourVar.d(jtiVar);
        ourVar.d(jtiVar.dK(new jaq(this, 2), outVar));
        jtiVar.b.execute(new img(jtiVar, jbeVar.b, 15));
        nao naoVar = new nao();
        naoVar.e = resources.getString(R.string.gcam_HDR_plus_enhanced_processing);
        naoVar.h = context;
        naoVar.a = true;
        naoVar.j = 10;
        this.bb = naoVar.a();
        nao naoVar2 = new nao();
        naoVar2.e = resources.getString(R.string.flash_on_chip_text);
        naoVar2.h = context;
        naoVar2.i = 1;
        this.X = naoVar2.a();
        this.bB = new jav(this, nksVar, gntVar);
        this.ap = nksVar;
        jaw jawVar = new jaw(this, mdyVar, jbeVar, nksVar, ndjVar, atomicBoolean);
        this.k = jawVar;
        this.g = new jax(this);
        this.e = new itn(jawVar);
        ourVar.d(mhqVar.d(ihnVar));
        ourVar.d(mhqVar.d(mhuVar));
        ourVar.d(mhqVar.d(losVar));
        ojl.cj(syuVar, new fct(this, uemVar, 8));
        hotshotController.h(Arrays.asList(ndjVar.b(), (View) ngwVar.d));
        this.ag = rwcVar11;
    }

    private final void O() {
        this.c.execute(new ivi(this, 16));
    }

    private final void P(luu luuVar, lut lutVar, luu luuVar2) {
        luj lujVar = this.av;
        if (kox.a((String) ((ovx) lujVar.a(luuVar)).d, kox.AUTO) != kox.ON) {
            return;
        }
        long jLongValue = ((Long) ((ovx) lujVar.a(lutVar)).d).longValue();
        if (jLongValue == 0 || Math.abs(Instant.now().minusMillis(jLongValue).toEpochMilli()) < 3600000) {
            return;
        }
        String str = (String) ((ovx) lujVar.a(luuVar2)).d;
        if (str.isEmpty()) {
            str = (String) luuVar.d(this.aA);
        }
        lujVar.d(luuVar, str);
        lujVar.d(lutVar, 0L);
    }

    private final void Q() {
        jtm jtmVar;
        kfg kfgVar;
        rnt.L(this.t);
        hfy hfyVar = this.aN;
        pkc pkcVar = this.bx;
        pjr pjrVarA = hfyVar.a(pkcVar, this.aA, this.i.a());
        pjrVarA.getClass();
        jtd jtdVarD = this.bD.D(pjrVarA, nkw.PHOTO);
        kgt kgtVar = this.aH;
        jtm jtmVarA = kgtVar.a(jtdVarD);
        this.bc = true;
        rnt.L(this.t);
        jtm jtmVar2 = this.aS;
        if ((jtmVar2 != null && jtmVar2.b(jtmVarA) && this.B != null) || ((jtmVar = this.aS) != null && jtmVar.b(jtmVarA) && !this.O.b() && ((kfgVar = this.C) == null || !kfgVar.f()))) {
            O();
            f();
            this.ad.a(juk.b);
            this.an.K.m(true);
            return;
        }
        pbn pbnVar = this.d;
        pbnVar.f("CaptureModule#startCamera");
        iyu iyuVar = this.an;
        iyuVar.K.c();
        this.aF.g();
        rwc rwcVar = this.q;
        if (rwcVar.h()) {
            ((fty) rwcVar.c()).h();
        }
        this.O.close();
        this.O = new our();
        jtd jtdVar = jtmVarA.a;
        this.A = jtdVar;
        this.aq = pkcVar.f(jtdVar.a);
        O();
        this.aq.getClass();
        iyuVar.K.getClass();
        our ourVar = this.O;
        fsc fscVar = new fsc();
        ourVar.d(fscVar);
        pas pasVar = jtmVarA.a().b;
        ngk ngkVar = this.aX;
        ngkVar.i(new Size(jtmVarA.a().b.a, jtmVarA.a().b.b));
        syu syuVarC = kgtVar.c(jtmVarA, ske.M(ngkVar));
        ske.W(syuVarC, new jba(this, fscVar, ourVar, 0), this.c);
        this.B = syuVarC;
        this.aS = jtmVarA;
        pbnVar.g();
    }

    @Override // defpackage.fqf
    public final boolean A() {
        return true;
    }

    @Override // defpackage.fqf
    public final void E() {
    }

    public final void G(boolean z) {
        if (this.b.dL() == kpa.a && z) {
            this.at.a(this.bb);
        } else {
            this.at.f(this.bb);
        }
    }

    public final void H() {
        if (((Boolean) this.bn.dL()).booleanValue()) {
            this.bm.a(true);
        } else {
            gzi gziVar = gzs.a;
            this.an.K.o();
        }
    }

    public final void I(int i, boolean z) {
        this.w.g();
        AccessibilityManager accessibilityManager = this.x;
        if (accessibilityManager.isTouchExplorationEnabled()) {
            accessibilityManager.interrupt();
        }
        if (z) {
            this.W.f(i);
        } else {
            this.W.e(i);
        }
    }

    public final boolean K() {
        if (this.C == null) {
            return false;
        }
        rwc rwcVar = this.q;
        if (!rwcVar.h()) {
            return false;
        }
        fty ftyVar = (fty) rwcVar.c();
        kfg kfgVar = this.C;
        kfgVar.getClass();
        return ftyVar.l(kfgVar.i(), this.aM);
    }

    public final boolean L() {
        if (this.C != null && this.q.h() && ((Boolean) this.U.b.dL()).booleanValue()) {
            kfg kfgVar = this.C;
            kfgVar.getClass();
            if (((Boolean) ((ovx) kfgVar.i().a).d).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [imj, java.lang.Object] */
    public final boolean M() {
        ltw ltwVar = (ltw) this.H.dL();
        boolean zH = this.bA.h();
        if (!zH) {
            our ourVar = this.K;
            mns mnsVar = this.by;
            ourVar.d(((imi) mnsVar.c).a(mnsVar.d));
        }
        if (ltwVar == ltw.AUTO || this.W.i() || !this.J) {
            return false;
        }
        if ((!this.z && ((Boolean) this.Z.dL()).booleanValue()) || ((Boolean) this.ah.dL()).booleanValue() || ((Boolean) this.bo.dL()).booleanValue() || ((Boolean) this.bl.dL()).booleanValue() || !zH) {
            return false;
        }
        return true;
    }

    public final boolean N() {
        return this.N.e() && !this.W.i();
    }

    @Override // defpackage.fqf
    public final rwc a() {
        return rwc.i(this.C);
    }

    @Override // defpackage.hrp
    public final void b(int i) {
        I(i, true);
    }

    public final void c() {
        cxb cxbVar = this.bz;
        if (fdo.q(cxbVar)) {
            this.bC.x();
            I(fdo.b(cxbVar.g()), false);
            fdo.e(cxbVar.g());
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.K.close();
    }

    public final void d(boolean z) {
        this.v.a();
        this.be.c();
        if (!this.aB.l()) {
            this.an.K.q();
        }
        G(false);
        rwc rwcVar = this.q;
        if (rwcVar.h() && ((Boolean) this.U.b.dL()).booleanValue()) {
            ((fty) rwcVar.c()).a(z);
            return;
        }
        kfg kfgVar = this.C;
        if (kfgVar == null || !this.ay.a((kow) kfgVar.i().f)) {
            return;
        }
        this.ax.b(z);
    }

    public final void e(final boolean z, final pka pkaVar) {
        if (this.t) {
            pbn pbnVar = this.d;
            mes mesVar = this.aJ;
            final pbp pbpVarA = pbnVar.a("CaptureModule#changeCamera");
            final mex mexVar = (mex) mesVar.a();
            gnt gntVar = this.i;
            final boolean zI = gntVar.i();
            jtq jtqVar = this.D;
            if (jtqVar != null) {
                jtqVar.b(!zI);
            }
            hfn hfnVar = this.E;
            if (hfnVar != null) {
                boolean z2 = !zI;
                DebugCanvasView debugCanvasView = hfnVar.b;
                if (debugCanvasView == null) {
                    ((sgt) hfn.a.c().M(1224)).s("UI view not yet initialized");
                } else {
                    debugCanvasView.e.c(z2);
                }
            }
            if (this.aA.p(gzt.a)) {
                HotshotController hotshotController = this.y;
                hotshotController.n();
                if (hotshotController.t()) {
                    this.aG.execute(new iyz(this, 9));
                }
            }
            rwc rwcVar = this.ag;
            if (rwcVar.h()) {
                ((hko) rwcVar.c()).e();
                ((hko) rwcVar.c()).a(((Boolean) this.ah.dL()).booleanValue());
            }
            gntVar.a();
            eB();
            rnt.w(this.O, "cameraLifetime", new Object[0]);
            syu syuVar = this.B;
            if (syuVar != null) {
                ojl.ck(swz.j(syuVar, new kjm(1), sxo.a), new paf() { // from class: jar
                    @Override // defpackage.paf
                    public final void a(Object obj) {
                        jbc jbcVar = this.a;
                        if (z) {
                            gtm gtmVar = jbcVar.aE;
                            pka pkaVarA = jbcVar.i.a();
                            pka pkaVar2 = pka.BACK;
                            if (pkaVarA == pkaVar2) {
                                pkaVar2 = pka.FRONT;
                            }
                            gtmVar.a(pkaVar2, 2, 3);
                        }
                        pka pkaVar3 = pkaVar;
                        mex mexVar2 = mexVar;
                        mem memVar = mem.a;
                        mexVar2.j(memVar);
                        mdy mdyVar = jbcVar.az;
                        int i = pkaVar3 == pka.BACK ? 3 : 2;
                        boolean z3 = zI;
                        int i2 = z3 ? 3 : 2;
                        long j = mexVar2.m;
                        long jI = mexVar2.i(memVar);
                        long j2 = mdyVar.j;
                        long j3 = mdyVar.r;
                        long jBa = ojl.ba(j3);
                        long j4 = j - j3;
                        int i3 = i;
                        tpc tpcVarM = sod.a.m();
                        int i4 = i2;
                        soc socVar = soc.CHANGE_CAMERA;
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        sod sodVar = (sod) tpcVarM.b;
                        sodVar.f = socVar.aJ;
                        sodVar.b |= 1;
                        tpc tpcVarM2 = sow.a.m();
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar = tpcVarM2.b;
                        sow sowVar = (sow) tphVar;
                        sowVar.c = i3 - 1;
                        sowVar.b |= 1;
                        if (!tphVar.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar2 = tpcVarM2.b;
                        sow sowVar2 = (sow) tphVar2;
                        sowVar2.d = i4 - 1;
                        sowVar2.b |= 2;
                        if (!tphVar2.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar3 = tpcVarM2.b;
                        sow sowVar3 = (sow) tphVar3;
                        sowVar3.b |= 4;
                        sowVar3.e = j;
                        if (!tphVar3.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar4 = tpcVarM2.b;
                        sow sowVar4 = (sow) tphVar4;
                        sowVar4.b |= 8;
                        sowVar4.f = jI;
                        int i5 = mdyVar.z;
                        if (!tphVar4.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar5 = tpcVarM2.b;
                        sow sowVar5 = (sow) tphVar5;
                        int i6 = i5 - 1;
                        if (i5 == 0) {
                            throw null;
                        }
                        sowVar5.g = i6;
                        sowVar5.b |= 16;
                        boolean z4 = j4 < 3000000000L && j2 < jBa;
                        if (!tphVar5.C()) {
                            tpcVarM2.o();
                        }
                        sow sowVar6 = (sow) tpcVarM2.b;
                        sowVar6.b |= 32;
                        sowVar6.h = z4;
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        sod sodVar2 = (sod) tpcVarM.b;
                        sow sowVar7 = (sow) tpcVarM2.l();
                        sowVar7.getClass();
                        sodVar2.t = sowVar7;
                        sodVar2.b |= ImageMetadata.LENS_APERTURE;
                        mdyVar.I(tpcVarM);
                        mdyVar.z = 1;
                        mdyVar.r = jI;
                        mexVar2.close();
                        if (z3) {
                            jbcVar.j.a();
                        } else {
                            nas nasVar = jbcVar.j;
                            owf owfVar = nasVar.a;
                            luk lukVar = nasVar.b;
                            if (lukVar != null && owfVar.dL() != ltr.OFF && !lukVar.m("face_retouching_hint")) {
                                String str = owfVar.dL() == ltr.ON_LIGHT ? nasVar.e : nasVar.f;
                                nao naoVar = new nao();
                                naoVar.h = nasVar.c;
                                naoVar.j = 8;
                                naoVar.e = str;
                                naoVar.a = false;
                                naoVar.b = 6000;
                                naoVar.d = new nar(nasVar, 0);
                                nasVar.j = naoVar.a();
                                nasVar.l.a(nasVar.j);
                                nasVar.m.i().d(owfVar.dK(new ktd(nasVar, (ltr) owfVar.dL(), 13), nasVar.d));
                            }
                        }
                        pbpVarA.a();
                    }
                }, this.c);
            }
        }
    }

    @Override // defpackage.fqf
    public final void eA() {
        this.ai = null;
        this.am.c();
        this.W.h();
        if (this.aB.l()) {
            this.M.d();
        }
        this.aL.b();
        if (this.aA.p(gzt.a)) {
            HotshotController hotshotController = this.y;
            hotshotController.p(this);
            hotshotController.n();
            hotshotController.j(false);
        }
        rwc rwcVar = this.ag;
        if (rwcVar.h()) {
            ((hko) rwcVar.c()).h();
            ((hko) rwcVar.c()).c(false);
        }
        rwc rwcVar2 = this.aP;
        if (rwcVar2.h()) {
            ((hro) rwcVar2.c()).c(this);
        }
        rwc rwcVar3 = this.r;
        if (rwcVar3.h()) {
            ((hwb) rwcVar3.c()).a();
        }
    }

    @Override // defpackage.fqf
    public final void eB() {
        this.W.h();
        K();
        if (this.t) {
            this.an.K.m(false);
            Q();
        }
    }

    @Override // defpackage.fqf
    public final void eC() {
        this.S.a(false);
        if (this.C != null) {
            cxb cxbVar = this.bz;
            if (fdo.q(cxbVar)) {
                if ((this.aq.l() == pka.FRONT) != fdo.i(cxbVar.g())) {
                    eB();
                } else {
                    c();
                }
            }
        }
        kfg kfgVar = this.C;
        if (kfgVar != null && kfgVar.f()) {
            eB();
        }
        uh uhVar = this.aC;
        uhVar.k();
        uhVar.j();
        this.h.d(true);
        if (this.aA.p(gzt.a)) {
            HotshotController hotshotController = this.y;
            hotshotController.n();
            hotshotController.P = true;
            hotshotController.j(true);
            this.aG.execute(new iyz(this, 4));
            hotshotController.e(this);
        }
        rwc rwcVar = this.ag;
        if (rwcVar.h()) {
            ((hko) rwcVar.c()).c(true);
            ((hko) rwcVar.c()).e();
            ((hko) rwcVar.c()).a(((Boolean) this.ah.dL()).booleanValue());
        }
        rwc rwcVar2 = this.aP;
        if (rwcVar2.h()) {
            ((hro) rwcVar2.c()).a(this);
        }
        this.as.i();
        ojl.cj(this.G, new iyn(this, 2));
    }

    public final void f() {
        this.an.K.t();
    }

    @Override // defpackage.mwe
    public final void g(mwd mwdVar) {
        if (mwdVar.equals(mwd.READY_TO_CAPTURE)) {
            this.as.v(9);
            I(3, false);
        } else {
            msi msiVar = this.W;
            if (msiVar.i()) {
                this.y.c();
            }
            msiVar.h();
        }
    }

    public final void k(boolean z) {
        if (this.t) {
            pbn pbnVar = this.d;
            pbnVar.f("CaptureModule#setReadyState");
            if (!ltf.m.equals(this.ai)) {
                this.an.K.l(z, this.bt);
                if (z) {
                    this.bt = true;
                }
            }
            if (this.bc) {
                if (this.aA.p(gzt.a)) {
                    HotshotController hotshotController = this.y;
                    if (hotshotController.t() && !this.as.t()) {
                        hotshotController.i(this.f.b());
                    }
                }
                this.bc = false;
            }
            pbnVar.g();
        }
    }

    @Override // defpackage.fqf
    public final void m() {
        pbn pbnVar = this.d;
        pbnVar.f("CaptureModule#stop");
        K();
        this.ai = null;
        this.L.close();
        this.aK.B(this.bB);
        ovx ovxVar = this.S;
        if (((Boolean) ovxVar.d).booleanValue()) {
            ovxVar.a(false);
            d(true);
        }
        this.ar.a();
        this.bd.a();
        this.I = false;
        this.W.h();
        lrd lrdVar = this.aR;
        lrdVar.e.execute(new lmw(lrdVar, 3));
        pbnVar.f("CaptureModule#closeCamera");
        syu syuVar = this.B;
        if (syuVar != null) {
            syuVar.cancel(false);
            this.B = null;
        }
        this.C = null;
        this.aH.d();
        this.N.a(new owi(false));
        pbnVar.f("CameraLifetime#close");
        this.O.close();
        pbnVar.g();
        this.aF.g();
        pbnVar.g();
        hgc hgcVar = this.an.K.B;
        this.ao.b();
        this.aY.g(this.aZ);
        pbnVar.g();
    }

    @Override // defpackage.fqf
    public final void n() {
        pbn pbnVar = this.d;
        pbnVar.f("CaptureModule#takePictureNow");
        this.w.g();
        AccessibilityManager accessibilityManager = this.x;
        if (accessibilityManager.isTouchExplorationEnabled()) {
            accessibilityManager.interrupt();
        }
        J(false);
        pbnVar.g();
    }

    @Override // defpackage.fqf
    public final boolean o() {
        if (this.W.h()) {
            return true;
        }
        if (this.aB.l()) {
            this.M.d();
            return true;
        }
        if (!this.ap.i) {
            return false;
        }
        this.am.b(4);
        this.c.execute(new iyz(this, 7));
        return true;
    }

    @Override // defpackage.fqf
    public final String r() {
        return this.aI.getString(R.string.photo_accessibility_peek);
    }

    @Override // defpackage.fqf
    public final void s(Runnable runnable) {
        nrc nrcVar = this.bk;
        if (nrcVar.b < nrcVar.a(nkw.PHOTO)) {
            return;
        }
        runnable.run();
    }

    @Override // defpackage.fqf
    public final void t(ena enaVar) {
    }

    @Override // defpackage.fqf
    public final void w() {
        if (this.aT) {
            return;
        }
        this.aT = true;
        pbn pbnVar = this.d;
        pbnVar.f("CaptureModule#initialize");
        this.K.d(this.aW.b(new jay(this)));
        pbnVar.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0185  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object, owf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(boolean r28) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbc.J(boolean):void");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fqf
    public final void l() {
        our ourVar = new our();
        this.L = ourVar;
        ndj ndjVar = this.f;
        ourVar.d(ndjVar.e(this.g));
        our ourVar2 = this.L;
        ndjVar.getClass();
        ourVar2.d(this.H.dK(new jaq(ndjVar, 1), this.c));
        this.bf.b(this, nkw.PHOTO, this.L);
        this.aK.A(this.bB);
        k(true);
        our ourVar3 = this.L;
        AmbientMode.AmbientController ambientController = new AmbientMode.AmbientController(this, null);
        pfl pflVar = this.bE;
        ?? r4 = pflVar.a;
        synchronized (r4) {
            r4.add(ambientController);
        }
        ourVar3.d(new ffx(pflVar, ambientController, 3));
        if (this.aA.p(gzo.bJ)) {
            muu muuVar = this.au;
            muuVar.g(rbb.a, R.string.learn_about_camera_accessibility, R.string.mode_camera_autobahn, false);
            muuVar.h(this);
            this.L.d(new hye(this, 9));
        }
        int i = 5;
        this.bg.a(new iyz(this, i), new iyz(this, 6), this.L);
        this.bh.a(new iyz(this, i), new ivi(this, 15), this.L);
        rwc rwcVar = this.q;
        if (rwcVar.h()) {
            ((fty) rwcVar.c()).e(nkw.PHOTO, this.L);
        }
        rwc rwcVar2 = this.r;
        if (rwcVar2.h()) {
            hwb hwbVar = (hwb) rwcVar2.c();
            our ourVar4 = this.L;
            owf owfVar = hwbVar.a;
            owfVar.dL();
            owq owqVar = hwbVar.e;
            owqVar.a(false);
            hwbVar.n = -1L;
            hwh hwhVar = hwbVar.l;
            hwhVar.getClass();
            ourVar4.d(new ffy(hwhVar, 17));
            owq owqVar2 = hwbVar.b;
            hib hibVar = new hib(hwbVar, 15);
            out outVar = hwbVar.i;
            ourVar4.d(owqVar2.dK(hibVar, outVar));
            ourVar4.d(hwbVar.c.dK(new hib(hwbVar, 16), outVar));
            ourVar4.d(owl.a(owfVar, owqVar).dK(new hib(hwbVar, 17), outVar));
        }
        if (this.ay.b()) {
            this.L.d(this.ax.a(nkw.PHOTO));
        }
        rwc rwcVar3 = this.bp;
        if (rwcVar3.h()) {
            nll nllVar = this.bw;
            mwq mwqVar = (mwq) rwcVar3.c();
            pjo pjoVar = this.bq;
            if (mwqVar.A() && kzz.j(kgx.g, pjoVar)) {
                ((Window) nllVar.b).setColorMode(1);
            } else {
                ((Window) nllVar.b).setColorMode(0);
            }
        }
        this.ae.a(false);
        pbn pbnVar = this.d;
        pbnVar.f("CaptureModule#resume");
        this.W.d(this, this.ba, this.L);
        Q();
        pbnVar.f(ibINv.asCTBT);
        this.bd.b();
        this.ar.b();
        this.v.d();
        pbnVar.g();
        P(luf.v, luf.w, luf.z);
        P(luf.x, luf.y, luf.A);
        pbnVar.f("Setup CameraAppUI");
        hgc hgcVar = this.an.K.B;
        pbnVar.g();
        lrd lrdVar = this.aR;
        lrdVar.e.execute(new lac(lrdVar, 5));
        this.aY.b(this.aZ);
        this.ao.e();
        our ourVar5 = this.L;
        owf owfVar2 = this.bi;
        ijl ijlVar = new ijl(this, 19);
        out outVar2 = this.c;
        ourVar5.d(owl.j(owfVar2, ijlVar, outVar2));
        this.L.d(owl.j(this.bj, new ijl(this, 20), outVar2));
        pbnVar.g();
    }
}
