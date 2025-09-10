package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import com.google.ar.core.R;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jcv extends fqf implements mwe, hrp {
    public static final sgv a = sgv.g("jcv");
    public final rwc A;
    public final rwc C;
    public boolean D;
    public our E;
    public final lgh F;
    public jtq G;
    public hfn H;
    public owf I;
    public int J;
    public meu K;
    public final owq L;
    public final List M;
    public final iyu Q;
    public final mbj R;
    public final ktx S;
    public final muu T;
    public jth U;
    public final mns V;
    public final mnt W;
    public final hbj X;
    public final uh Y;
    public final qwz Z;
    private final mug aA;
    private final cxb aB;
    private final iso aC;
    public final qqq aa;
    public final ggg ac;
    private final jub ad;
    private final lgm ae;
    private final moc af;
    private final owq ag;
    private final mes ah;
    private final mhq ai;
    private final mhu aj;
    private final kdh ak;
    private final hyd al;
    private final juh am;
    private final ipq an;
    private final ipv ao;
    private final rwc ap;
    private final nrc aq;
    private jtg as;
    private final los at;
    private final owq au;
    private final owf av;
    private final owf aw;
    private final kgp ay;
    private final krj az;
    public final pbn b;
    public final gnt c;
    public final out d;
    public final Executor e;
    public final kgt f;
    public final ndo g;
    public final fbq h;
    public final itl i;
    public final moy j;
    public final AccessibilityManager k;
    public final hjb l;
    public final jtl n;
    public final fvu o;
    public final ndj p;
    public final msi q;
    public final owq r;
    public final mzz s;
    public final hyh v;
    public final rwc w;
    public final lae x;
    public final rwc y;
    public final HotshotController z;
    public final nmu m = new nmu(5);
    public final ovx B = new ovx(false);
    private boolean ar = false;
    public ltf N = null;
    public final gsn ab = new jcr(this);
    public final pau O = new jbp(this, 9);
    public final itk P = new jci(this, 2);
    private final msk ax = new jbu(this, 2);

    public jcv(pbn pbnVar, gnt gntVar, kgp kgpVar, iyu iyuVar, kgt kgtVar, rwc rwcVar, out outVar, Executor executor, jub jubVar, mbj mbjVar, rwc rwcVar2, lgh lghVar, fbq fbqVar, itl itlVar, qqq qqqVar, moy moyVar, ktx ktxVar, AccessibilityManager accessibilityManager, hjb hjbVar, ggg gggVar, mzz mzzVar, owq owqVar, owq owqVar2, jtl jtlVar, msi msiVar, uh uhVar, hbj hbjVar, cxb cxbVar, fvu fvuVar, ndj ndjVar, krj krjVar, iso isoVar, mes mesVar, mhq mhqVar, mhu mhuVar, hyh hyhVar, kdh kdhVar, mug mugVar, los losVar, rwc rwcVar3, rwc rwcVar4, lae laeVar, rwc rwcVar5, hyd hydVar, HotshotController hotshotController, moc mocVar, juh juhVar, ipq ipqVar, ipv ipvVar, nrc nrcVar, ngw ngwVar, mns mnsVar, mnt mntVar, owq owqVar3, rwc rwcVar6, muu muuVar, qwz qwzVar, owq owqVar4, owf owfVar, owf owfVar2) {
        this.b = pbnVar;
        this.ay = kgpVar;
        this.c = gntVar;
        this.Q = iyuVar;
        this.f = kgtVar;
        this.A = rwcVar;
        this.d = outVar;
        this.e = executor;
        this.ad = jubVar;
        this.R = mbjVar;
        this.F = lghVar;
        this.h = fbqVar;
        this.i = itlVar;
        this.aa = qqqVar;
        this.af = mocVar;
        this.j = moyVar;
        this.S = ktxVar;
        this.k = accessibilityManager;
        this.l = hjbVar;
        this.ac = gggVar;
        this.s = mzzVar;
        this.ag = owqVar;
        this.r = owqVar2;
        this.n = jtlVar;
        this.q = msiVar;
        this.X = hbjVar;
        this.aB = cxbVar;
        this.o = fvuVar;
        this.p = ndjVar;
        this.az = krjVar;
        this.Y = uhVar;
        this.aC = isoVar;
        this.ah = mesVar;
        this.K = (meu) mesVar.a();
        this.ai = mhqVar;
        this.aj = mhuVar;
        this.v = hyhVar;
        this.ak = kdhVar;
        this.w = rwcVar4;
        this.at = losVar;
        this.aA = mugVar;
        this.x = laeVar;
        this.y = rwcVar5;
        this.T = muuVar;
        a.I(rwcVar2.h());
        this.ae = (lgm) rwcVar2.c();
        this.z = hotshotController;
        this.al = hydVar;
        this.am = juhVar;
        this.an = ipqVar;
        this.ao = ipvVar;
        this.ap = rwcVar3;
        this.aq = nrcVar;
        this.V = mnsVar;
        this.W = mntVar;
        this.L = owqVar3;
        this.C = rwcVar6;
        this.Z = qwzVar;
        this.au = owqVar4;
        this.av = owfVar;
        this.aw = owfVar2;
        this.g = new jcs(this, hyhVar);
        this.M = new ArrayList();
        hotshotController.h(Arrays.asList(ndjVar.b(), (View) ngwVar.d));
    }

    @Override // defpackage.fqf
    public final boolean A() {
        return true;
    }

    @Override // defpackage.fqf
    public final void E() {
        this.ae.e();
    }

    @Override // defpackage.fqf
    public final rwc a() {
        return rwc.i(this.U);
    }

    @Override // defpackage.hrp
    public final void b(int i) {
        d(i, true);
    }

    public final void c(boolean z) {
        if (this.t) {
            if (!ltf.m.equals(this.N)) {
                kox koxVar = (kox) a().b(new idb(6)).e(kox.OFF);
                this.Q.K.l(z, !(koxVar.equals(kox.ON) || koxVar.equals(kox.AUTO) || ((Boolean) this.v.b.dL()).booleanValue()));
            }
            if (this.ar) {
                if (this.X.p(gzt.a)) {
                    HotshotController hotshotController = this.z;
                    if (hotshotController.t() && !this.az.t()) {
                        hotshotController.i(this.p.b());
                    }
                }
                this.ar = false;
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        c(false);
    }

    public final void d(int i, boolean z) {
        this.l.g();
        AccessibilityManager accessibilityManager = this.k;
        if (accessibilityManager.isTouchExplorationEnabled()) {
            accessibilityManager.interrupt();
        }
        if (z) {
            this.q.f(i);
        } else {
            this.q.e(i);
        }
    }

    public final boolean e() {
        if (this.U == null) {
            return false;
        }
        rwc rwcVar = this.y;
        if (!rwcVar.h()) {
            return false;
        }
        fty ftyVar = (fty) rwcVar.c();
        jth jthVar = this.U;
        jthVar.getClass();
        return ftyVar.l(jthVar.i(), this.ad);
    }

    @Override // defpackage.fqf
    public final void eA() {
        this.N = null;
        this.q.h();
        if (this.X.p(gzt.a)) {
            HotshotController hotshotController = this.z;
            hotshotController.p(this);
            hotshotController.n();
            hotshotController.j(false);
        }
        rwc rwcVar = this.ap;
        if (rwcVar.h()) {
            ((hro) rwcVar.c()).c(this);
        }
        rwc rwcVar2 = this.C;
        if (rwcVar2.h()) {
            ((hko) rwcVar2.c()).h();
            ((hko) rwcVar2.c()).c(false);
        }
    }

    @Override // defpackage.fqf
    public final void eB() {
        if (!this.t) {
            ((sgt) a.c().M(2662)).s("Not reconfiguring camera since module is not started.");
            return;
        }
        pbp pbpVarA = this.b.a("PortraitModule#reconfigureCamera");
        e();
        lgh lghVar = this.F;
        if (lghVar != null) {
            lghVar.a();
        }
        this.aa.g();
        rwc rwcVar = this.y;
        if (rwcVar.h()) {
            ((fty) rwcVar.c()).h();
        }
        this.U = null;
        jtg jtgVar = this.as;
        if (jtgVar != null && !jtgVar.isDone()) {
            this.as.cancel(false);
        }
        this.ar = true;
        jtg jtgVarA = this.ay.a(this.c, this.f, nkw.PORTRAIT);
        this.as = jtgVarA;
        jtgVarA.getClass();
        ske.W(jtgVarA, new iiz(this, pbpVarA, 7), this.d);
    }

    @Override // defpackage.fqf
    public final void eC() {
        hbj hbjVar = this.X;
        if (hbjVar.p(gzt.a)) {
            HotshotController hotshotController = this.z;
            hotshotController.n();
            hotshotController.P = false;
            hotshotController.j(true);
            this.e.execute(new jcq(this, 1));
            hotshotController.e(this);
        }
        rwc rwcVar = this.ap;
        if (rwcVar.h()) {
            ((hro) rwcVar.c()).a(this);
        }
        rwc rwcVar2 = this.C;
        if (rwcVar2.h()) {
            ((hko) rwcVar2.c()).c(true);
            ((hko) rwcVar2.c()).e();
            if (hbjVar.p(hak.h) || !this.c.j()) {
                return;
            }
            ((hko) rwcVar2.c()).f(true);
        }
    }

    @Override // defpackage.mwe
    public final void g(mwd mwdVar) {
        if (mwdVar.equals(mwd.READY_TO_CAPTURE)) {
            this.az.v(9);
            d(3, false);
        } else {
            msi msiVar = this.q;
            if (msiVar.i()) {
                this.z.c();
            }
            msiVar.h();
        }
    }

    @Override // defpackage.fqf
    public final void l() {
        this.ag.a(true);
        our ourVar = new our();
        this.E = ourVar;
        mhq mhqVar = this.ai;
        mhu mhuVar = this.aj;
        ourVar.d(mhqVar.d(mhuVar));
        our ourVar2 = this.E;
        jbp jbpVar = new jbp(this, 10);
        out outVar = this.d;
        ourVar2.d(mhuVar.a.dK(jbpVar, outVar));
        this.E.d(mhqVar.d(this.at));
        this.E.d(this.af.b(new jct(this, 0)));
        pbn pbnVar = this.b;
        pbnVar.f("PortraitModule#start");
        eB();
        c(true);
        this.o.A(this.ab);
        this.E.d(new hye(this, 20));
        ndj ndjVar = this.p;
        this.E.d(ndjVar.e(this.g));
        our ourVar3 = this.E;
        ndjVar.getClass();
        ourVar3.d(this.r.dK(new jbp(ndjVar, 11), outVar));
        this.an.a(new jcq(this, 4), new jcq(this, 5), this.E);
        this.ao.a(new jcq(this, 4), new jcq(this, 6), this.E);
        nkw nkwVar = nkw.PORTRAIT;
        this.am.b(this, nkwVar, this.E);
        this.q.d(this, this.ax, this.E);
        hgc hgcVar = this.Q.K.B;
        this.n.d();
        this.E.d(this.F);
        this.i.b(this.P);
        this.E.d(new jkf(this, 1));
        this.ak.b();
        rwc rwcVar = this.y;
        if (rwcVar.h()) {
            ((fty) rwcVar.c()).e(nkwVar, this.E);
        }
        if (this.V.b()) {
            this.E.d(this.W.a(nkwVar));
        }
        if (this.X.p(gzo.bJ)) {
            muu muuVar = this.T;
            muuVar.g(rbb.g, R.string.portrait_help_button_accessibility, R.string.mode_portrait, false);
            muuVar.h(this);
            this.E.d(new hye(this, 19));
        }
        cxb cxbVar = this.aB;
        if (fdo.q(cxbVar)) {
            this.aC.x();
            d(fdo.b(cxbVar.g()), false);
            fdo.e(cxbVar.g());
        }
        uh uhVar = this.Y;
        uhVar.k();
        uhVar.j();
        this.E.d(owl.j(this.aw, new jbp(this, 8), outVar));
        pbnVar.g();
    }

    @Override // defpackage.fqf
    public final void m() {
        e();
        this.N = null;
        jtg jtgVar = this.as;
        if (jtgVar != null) {
            if (jtgVar.isDone()) {
                jth jthVar = this.U;
                if (jthVar != null) {
                    jthVar.close();
                    this.U = null;
                }
            } else {
                this.as.cancel(false);
            }
        }
        this.as = null;
        this.f.d();
        this.aa.g();
        this.ak.a();
        hgc hgcVar = this.Q.K.B;
        this.J = 0;
        this.E.close();
        this.D = false;
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, owf] */
    @Override // defpackage.fqf
    public final void n() {
        boolean zB;
        this.b.f("PortraitModule#takePictureNow");
        jth jthVar = this.U;
        if (jthVar == null) {
            ((sgt) a.c().M(2669)).s("Not taking picture since Camera is closed.");
            return;
        }
        if (!((Boolean) jthVar.b().dL()).booleanValue()) {
            ((sgt) a.c().M(2668)).s("Not taking picture since the Camera is not ready to take a picture.");
            return;
        }
        this.l.g();
        AccessibilityManager accessibilityManager = this.k;
        if (accessibilityManager.isTouchExplorationEnabled()) {
            accessibilityManager.interrupt();
        }
        c(false);
        this.n.b();
        this.s.m(false);
        this.Q.K.e();
        rwc rwcVar = this.y;
        if (rwcVar.h()) {
            ((fty) rwcVar.c()).g();
        }
        if (((Boolean) this.v.b.dL()).booleanValue() && rwcVar.h()) {
            Duration duration = (Duration) jthVar.i().b.dL();
            duration.toMillis();
            zB = this.al.b(duration);
            ((fty) rwcVar.c()).j(zB, duration);
            this.N = ltf.m;
        } else {
            if (this.V.a((kow) jthVar.i().f)) {
                this.W.e();
            }
            zB = false;
        }
        this.aA.a();
        syu syuVarC = this.ad.c(jthVar, new jcu(this, zB), this.D, this.K);
        List list = this.M;
        synchronized (list) {
            list.add(syuVarC);
        }
        syuVarC.c(new gdq(this, syuVarC, jthVar, 15, (int[]) null), this.d);
        this.K.a();
        this.K.d();
        this.D = false;
        this.K = (meu) this.ah.a();
        if (((Boolean) this.av.dL()).booleanValue()) {
            this.au.a(true);
        }
        this.b.g();
        this.z.g();
    }

    @Override // defpackage.fqf
    public final boolean o() {
        out.a();
        return this.q.h();
    }

    @Override // defpackage.fqf
    public final void s(Runnable runnable) {
        nrc nrcVar = this.aq;
        if (nrcVar.b < nrcVar.a(nkw.PORTRAIT)) {
            return;
        }
        runnable.run();
    }

    @Override // defpackage.fqf
    public final void w() {
        this.ae.c();
    }
}
