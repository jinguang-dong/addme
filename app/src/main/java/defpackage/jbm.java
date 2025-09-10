package defpackage;

import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jbm extends fqf {
    public static final sgv a = sgv.g("jbm");
    public final owq A;
    public final rwc B;
    public boolean D;
    public our E;
    public meu F;
    public boolean G;
    public jtq H;
    public final iyu I;
    public final mbj J;
    public final muu K;
    public final ktx L;
    public jth M;
    public final hbj N;
    public final uh O;
    public final qwz P;
    private final pbn R;
    private final kgt S;
    private final ndo T;
    private final mes U;
    private final iwp V;
    private final juh W;
    private final lpd X;
    private final rwc Y;
    private final ipq Z;
    private jtg ac;
    private final kgp ad;
    private final imi ae;
    private final ocq af;
    public final gnt b;
    public final out c;
    public final moy d;
    public final rwc e;
    public final jtl f;
    public final ndj g;
    public final jub h;
    public final rwc i;
    public final fvu j;
    public final itl k;
    public final fbq l;
    public final msi m;
    public final gtx n;
    public final nak o;
    public final ixf p;
    public final owq q;
    public final kdh r;
    public final AccessibilityManager s;
    public final hjb v;
    public final HotshotController w;
    public final nkw x;
    public final rwc y;
    public final rwc z;
    public final gsn Q = new jbi(this);
    private final kfm aa = new jbk(this);
    public final itk C = new jci(this, 1);
    private final msk ab = new jbu(this, 1);

    public jbm(pbn pbnVar, gnt gntVar, kgp kgpVar, iyu iyuVar, out outVar, moy moyVar, mbj mbjVar, uh uhVar, mes mesVar, jtl jtlVar, ndj ndjVar, rwc rwcVar, rwc rwcVar2, fvu fvuVar, itl itlVar, fbq fbqVar, msi msiVar, juh juhVar, gtx gtxVar, nak nakVar, ixf ixfVar, ocq ocqVar, owq owqVar, hbj hbjVar, kdh kdhVar, lpd lpdVar, imi imiVar, rwc rwcVar3, rwc rwcVar4, AccessibilityManager accessibilityManager, hjb hjbVar, ktx ktxVar, HotshotController hotshotController, ipq ipqVar, rwc rwcVar5, muu muuVar, owq owqVar2, rwc rwcVar6, qwz qwzVar, nkw nkwVar, rwc rwcVar7, kgt kgtVar, jub jubVar) {
        this.R = pbnVar;
        this.b = gntVar;
        this.ad = kgpVar;
        this.h = jubVar;
        this.I = iyuVar;
        this.S = kgtVar;
        this.y = rwcVar7;
        this.c = outVar;
        this.d = moyVar;
        this.J = mbjVar;
        this.O = uhVar;
        this.U = mesVar;
        this.f = jtlVar;
        this.g = ndjVar;
        this.F = (meu) mesVar.a();
        this.j = fvuVar;
        this.k = itlVar;
        this.l = fbqVar;
        this.m = msiVar;
        this.W = juhVar;
        this.n = gtxVar;
        this.o = nakVar;
        this.p = ixfVar;
        this.af = ocqVar;
        this.q = owqVar;
        this.r = kdhVar;
        this.X = lpdVar;
        this.K = muuVar;
        this.ae = imiVar;
        this.Y = rwcVar3;
        this.x = nkwVar;
        this.T = new jbl(this, msiVar);
        this.e = rwcVar4;
        a.I(rwcVar.h());
        this.V = (iwp) rwcVar.c();
        this.i = rwcVar2;
        this.N = hbjVar;
        this.s = accessibilityManager;
        this.v = hjbVar;
        this.L = ktxVar;
        this.w = hotshotController;
        this.Z = ipqVar;
        this.z = rwcVar5;
        this.A = owqVar2;
        this.B = rwcVar6;
        this.P = qwzVar;
    }

    private final void e() {
        jtg jtgVar = this.ac;
        if (jtgVar != null) {
            if (jtgVar.isDone()) {
                jth jthVar = this.M;
                if (jthVar != null) {
                    jthVar.close();
                    this.M = null;
                }
            } else {
                this.ac.cancel(false);
            }
        }
        this.ac = null;
    }

    private final void f() {
        pbp pbpVarA = this.R.a("MotionBlurMode#startCameraFromCameraSetting");
        this.M = null;
        jtg jtgVarA = this.ad.a(this.b, this.S, this.x);
        this.ac = jtgVarA;
        jtgVarA.getClass();
        ske.W(jtgVarA, new iiz(this, pbpVarA, 4), this.c);
    }

    private final boolean g() {
        jth jthVar = this.M;
        if (jthVar == null) {
            return false;
        }
        uh uhVarI = jthVar.i();
        if (!((Boolean) ((ovx) uhVarI.a).d).booleanValue()) {
            return false;
        }
        this.h.f(uhVarI);
        return true;
    }

    @Override // defpackage.fqf
    public final boolean A() {
        return true;
    }

    @Override // defpackage.fqf
    public final rwc a() {
        return rwc.i(this.M);
    }

    public final void b() {
        rwc rwcVar = this.B;
        if (rwcVar.h()) {
            ((hko) rwcVar.c()).e();
        }
        eB();
    }

    public final void c(boolean z) {
        if (this.t && !this.m.i()) {
            if (z) {
                this.p.d();
            } else {
                this.p.f();
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        c(false);
    }

    public final boolean d() {
        jth jthVar = this.M;
        return jthVar != null && ((Boolean) jthVar.b().dL()).booleanValue();
    }

    @Override // defpackage.fqf
    public final void eA() {
        g();
        rwc rwcVar = this.B;
        if (rwcVar.h()) {
            ((hko) rwcVar.c()).h();
            ((hko) rwcVar.c()).c(false);
        }
    }

    @Override // defpackage.fqf
    public final void eB() {
        if (this.t) {
            g();
            e();
            f();
            jtq jtqVar = this.H;
            if (jtqVar != null) {
                jtqVar.b(this.b.j());
            }
        }
    }

    @Override // defpackage.fqf
    public final void eC() {
        rwc rwcVar = this.B;
        if (rwcVar.h()) {
            ((hko) rwcVar.c()).c(true);
            ((hko) rwcVar.c()).e();
        }
    }

    @Override // defpackage.fqf
    public final void l() {
        pbn pbnVar = this.R;
        pbnVar.f("MotionBlur-ModuleStart");
        this.p.a();
        nkw nkwVar = this.x;
        if (nkwVar.equals(nkw.LANDSCAPE)) {
            this.q.a(iwt.LANDSCAPE);
        } else if (nkwVar.equals(nkw.ACTION_PAN)) {
            this.q.a(iwt.ACTION);
        }
        c(true);
        our ourVar = new our();
        this.E = ourVar;
        iwp iwpVar = this.V;
        iwpVar.getClass();
        ourVar.d(iwpVar.a());
        this.f.d();
        this.m.d(this, this.ab, this.E);
        f();
        this.j.A(this.Q);
        this.E.d(new hye(this, 11));
        this.E.d(this.g.e(this.T));
        this.k.b(this.C);
        this.E.d(new hye(this, 12));
        nak nakVar = this.o;
        imi imiVar = this.ae;
        nakVar.c(imiVar);
        this.E.d(nakVar);
        rwc rwcVar = this.Y;
        if (rwcVar.h()) {
            ((iwu) rwcVar.c()).c(imiVar);
            this.E.d((iwu) rwcVar.c());
        }
        this.W.b(this, nkwVar, this.E);
        this.r.b();
        boolean zP = this.N.p(gzo.bJ);
        int i = 2;
        int i2 = 0;
        int i3 = R.string.long_exposure_help_button_accessibility;
        if (zP) {
            muu muuVar = this.K;
            owq owqVar = this.q;
            iwt iwtVar = (iwt) owqVar.dL();
            iwt iwtVar2 = iwt.ACTION;
            rbb rbbVar = iwtVar.equals(iwtVar2) ? rbb.h : rbb.i;
            if (true == ((iwt) owqVar.dL()).equals(iwtVar2)) {
                i3 = R.string.action_pan_help_button_accessibility;
            }
            muuVar.g(rbbVar, i3, true != ((iwt) owqVar.dL()).equals(iwtVar2) ? R.string.motion_blur_landscape : R.string.motion_blur_action_pan, false);
            muuVar.h(this);
        } else {
            muu muuVar2 = this.K;
            ipr iprVar = new ipr(this, 13);
            owq owqVar2 = this.q;
            if (true == ((iwt) owqVar2.dL()).equals(iwt.ACTION)) {
                i3 = R.string.action_pan_help_button_accessibility;
            }
            muuVar2.d(iprVar, i3);
            muuVar2.h(this);
            iwt iwtVar3 = (iwt) owqVar2.dL();
            rwc rwcVar2 = this.i;
            if (rwcVar2.h() && !this.X.a) {
                int iOrdinal = iwtVar3.ordinal();
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        ((sgt) a.c().M(2618)).v("No education for option %s", iwtVar3);
                    } else if (this.af.ai("lasagna_edu_action") == 0) {
                        ((iux) rwcVar2.c()).a(iwtVar3);
                    }
                } else if (this.af.ai("lasagna_edu_landscape") == 0) {
                    ((iux) rwcVar2.c()).a(iwtVar3);
                }
            }
        }
        this.Z.a(new jbh(this, i2), new jbh(this, i), this.E);
        pbnVar.g();
    }

    @Override // defpackage.fqf
    public final void m() {
        pbn pbnVar = this.R;
        pbnVar.f("MotionBlur-StopModule");
        e();
        this.E.close();
        this.m.h();
        this.r.a();
        this.K.a(this);
        this.S.d();
        this.D = false;
        this.p.b();
        pbnVar.g();
    }

    @Override // defpackage.fqf
    public final void n() {
        pbn pbnVar = this.R;
        pbnVar.f("MotionBlurModule#takePictureNow");
        jth jthVar = this.M;
        if (jthVar == null) {
            ((sgt) a.c().M(2624)).s("Not taking picture since Camera is closed.");
            return;
        }
        if (!((Boolean) jthVar.b().dL()).booleanValue()) {
            ((sgt) a.c().M(2623)).s("Not taking picture since the Camera is not ready to take a picture.");
            return;
        }
        c(false);
        this.f.b();
        this.p.e();
        kdh kdhVar = this.r;
        kdhVar.d(false);
        if (((iwt) this.q.dL()).equals(iwt.LANDSCAPE)) {
            kdhVar.e(127);
        }
        this.h.c(jthVar, this.aa, this.D, this.F).c(new jbh(this, 3), this.c);
        this.F.a();
        this.F.d();
        this.D = false;
        this.F = (meu) this.U.a();
        pbnVar.g();
    }

    @Override // defpackage.fqf
    public final boolean o() {
        out.a();
        if (g()) {
            return false;
        }
        return this.m.h();
    }
}
