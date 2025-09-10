package defpackage;

import android.content.res.Resources;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.ar.core.R;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jxp extends fqf implements fyt, mxl {
    public static final sgv a = sgv.g("jxp");
    private final sbp A;
    private final ggv B;
    private our C;
    private final fvu D;
    private final boolean E;
    private final luw F;
    private final uem G;
    private final gkz H;
    private final jug I;
    private final juh J;
    private final ipq K;
    private final ipv L;
    private final owq M;
    private final owf N;
    private final gmm O;
    private final nrc P;
    private final gmp Q;
    private final iyu U;
    private final fzb V;
    private final luj W;
    private final ggv X;
    private final pmv Y;
    private final gsn Z;
    public final ggx b;
    public final out c;
    public final ghr d;
    public final ggr e;
    public final ggt f;
    public final gnt g;
    public final fyd i;
    public final glb j;
    public final luw k;
    public final glt l;
    public lty m;
    public fwk p;
    public final gli q;
    public final muu r;
    public final hbj s;
    public final qqq v;
    public final ocq w;
    private final String x;
    private final uem y;
    private final gav z;
    public final Object h = new Object();
    private mxj R = mxj.PHONE_LAYOUT;
    private mxm S = mxm.PORTRAIT;
    private boolean T = false;
    public boolean n = false;
    public boolean o = false;

    public jxp(iyu iyuVar, out outVar, Resources resources, fyd fydVar, pmv pmvVar, luw luwVar, fvu fvuVar, ggx ggxVar, ggr ggrVar, ggt ggtVar, ggv ggvVar, ggv ggvVar2, qqq qqqVar, uem uemVar, fzb fzbVar, gav gavVar, ghr ghrVar, uem uemVar2, gnt gntVar, hbj hbjVar, Set set, gkz gkzVar, gli gliVar, ocq ocqVar, glb glbVar, jug jugVar, juh juhVar, ipq ipqVar, ipv ipvVar, nrc nrcVar, owq owqVar, boolean z, luw luwVar2, gmp gmpVar, muu muuVar, owf owfVar, gmm gmmVar, luj lujVar, glt gltVar) {
        this.s = hbjVar;
        this.e = ggrVar;
        this.f = ggtVar;
        this.X = ggvVar;
        this.B = ggvVar2;
        this.g = gntVar;
        this.U = iyuVar;
        this.c = outVar;
        this.b = ggxVar;
        this.x = resources.getString(R.string.video_accessibility_peek);
        this.Y = pmvVar;
        this.G = uemVar;
        this.y = uemVar2;
        this.D = fvuVar;
        this.i = fydVar;
        this.F = luwVar;
        this.v = qqqVar;
        this.V = fzbVar;
        this.z = gavVar;
        this.d = ghrVar;
        Stream streamFilter = Collection.EL.stream(set).filter(new hzk(14));
        int i = sbp.d;
        this.A = (sbp) streamFilter.collect(ryv.a);
        this.H = gkzVar;
        this.q = gliVar;
        this.E = z;
        this.k = luwVar2;
        this.r = muuVar;
        this.N = owfVar;
        this.Z = new jxo(this);
        this.w = ocqVar;
        this.j = glbVar;
        this.I = jugVar;
        this.J = juhVar;
        this.K = ipqVar;
        this.L = ipvVar;
        this.P = nrcVar;
        this.M = owqVar;
        this.Q = gmpVar;
        this.O = gmmVar;
        this.W = lujVar;
        this.l = gltVar;
    }

    public final void G(gnm gnmVar) {
        if (!this.u) {
            ((sgt) a.c().M(3134)).v("Ignore new session request because module has been closed: %s", gnmVar);
            return;
        }
        if (((Boolean) this.M.dL()).booleanValue() && this.g.i() && gnmVar.equals(gnm.AMETHYST)) {
            return;
        }
        ((ViewfinderCover) ((ngx) this.y).a().e).o(nkw.VIDEO, new jnw(this, gnmVar, 11));
    }

    public final void H(gho ghoVar, boolean z) {
        if (((gas) ((ovx) this.z.a().g).d).equals(gas.RECORDING_SESSION_ACTIVE) || this.s.p(gzo.by)) {
            return;
        }
        if (ghoVar.equals(gho.DEFAULT)) {
            this.q.h(z);
        } else {
            this.q.d(z, 0.5f);
        }
    }

    @Override // defpackage.fyt
    public final void d() {
        this.i.m();
    }

    final void e() {
        pka pkaVarA = this.g.a();
        if (pkaVarA.equals(pka.FRONT)) {
            oxj oxjVarD = this.v.D(pkaVarA);
            ggx ggxVar = this.b;
            ggxVar.a = oxjVarD;
            ggw ggwVarA = ggxVar.a(nkw.VIDEO);
            if (!this.s.p(gym.ai) && oxjVarD.equals(oxj.RES_2160P) && ((oxh) ggwVarA.dL()).equals(oxh.FPS_60)) {
                ggwVarA.a(oxh.FPS_30);
                this.o = true;
            } else if (((oxh) ggwVarA.dL()).equals(oxh.FPS_24)) {
                ggwVarA.a(oxh.FPS_30);
                this.o = true;
            }
        }
    }

    @Override // defpackage.fqf
    public final void eA() {
        synchronized (this.h) {
            this.i.b();
        }
    }

    @Override // defpackage.fqf
    public final void eB() {
        if (this.u) {
            fwk fwkVar = this.p;
            fwkVar.getClass();
            gnm gnmVar = fwkVar.n() ? gnm.FOLD_STATE_CHANGED : gnm.RESOLUTION_SWITCH;
            fwk fwkVar2 = this.p;
            fwkVar2.getClass();
            fwkVar2.c(gnmVar);
        }
    }

    @Override // defpackage.fqf
    public final void eC() {
        synchronized (this.h) {
            this.i.e();
            e();
            fwk fwkVar = this.p;
            fwkVar.getClass();
            fwkVar.l(true);
        }
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) {
        if (this.R == mxjVar && this.S == mxmVar) {
            return;
        }
        this.R = mxjVar;
        this.S = mxmVar;
        H(this.d.f, false);
    }

    @Override // defpackage.fyt
    public final void f() {
        this.d.d.b();
        this.n = false;
        this.o = false;
    }

    @Override // defpackage.fyt
    public final void g() {
        this.n = false;
        this.o = false;
        if (this.T) {
            if (this.E && this.g.i()) {
                luj lujVar = this.W;
                lus lusVar = luf.ad;
                int iIntValue = ((Integer) ((ovx) lujVar.a(lusVar)).d).intValue();
                if (iIntValue >= 0) {
                    iIntValue--;
                    lujVar.a(lusVar).a(Integer.valueOf(iIntValue));
                }
                if (iIntValue == 0) {
                    out outVar = this.c;
                    gmm gmmVar = this.O;
                    gmmVar.getClass();
                    outVar.execute(new juc(gmmVar, 14));
                }
            }
            this.T = false;
        }
    }

    @Override // defpackage.fyt
    public final void h() {
        this.n = false;
        this.o = false;
    }

    @Override // defpackage.fyt
    public final void i() {
        if (this.g.i()) {
            ghr ghrVar = this.d;
            rwc rwcVar = ghrVar.b;
            if (rwcVar.h()) {
                gmt gmtVar = (gmt) rwcVar.c();
                owq owqVar = ghrVar.c;
                gmtVar.b((gho) owqVar.dL());
                gmtVar.k = new AmbientModeSupport.AmbientController(ghrVar, null);
                ghrVar.d.a();
                ghrVar.e.set(false);
                hbj hbjVar = ghrVar.h;
                gzi gziVar = gym.h;
                if (hbjVar.a(gziVar).isPresent()) {
                    int iIntValue = ((Integer) hbjVar.a(gziVar).get()).intValue();
                    owqVar.a(iIntValue == 2 ? gho.CINEMATIC : iIntValue == 3 ? gho.LOCKED : iIntValue == 4 ? gho.ACTIVE : gho.DEFAULT);
                }
            }
        }
        if (this.I.b()) {
            this.F.a(lty.RES_1080P);
            this.n = true;
        }
    }

    @Override // defpackage.fyt
    public final void j() {
        if (this.E) {
            this.M.a(Boolean.valueOf(!((Boolean) r1.dL()).booleanValue()));
        }
    }

    @Override // defpackage.fyt
    public final void k(boolean z) {
        fwk fwkVar = this.p;
        if (fwkVar != null) {
            fwkVar.g(z);
        }
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, mcq] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, owq] */
    @Override // defpackage.fqf
    public final void l() {
        synchronized (this.h) {
            fwk fwkVarA = ((jxj) this.G).a();
            this.p = fwkVarA;
            fwkVarA.d();
            this.T = true;
            glt gltVar = this.l;
            nkw nkwVar = nkw.VIDEO;
            gltVar.c(nkwVar);
            this.C = new our();
            luw luwVar = this.k;
            this.m = (lty) luwVar.dL();
            our ourVar = this.C;
            fwk fwkVar = this.p;
            fwkVar.getClass();
            ourVar.d(fwkVar);
            our ourVar2 = this.C;
            pmv pmvVar = this.Y;
            ?? r7 = pmvVar.b;
            jxl jxlVar = new jxl(this, this.e);
            out outVar = this.c;
            ourVar2.d(r7.dK(jxlVar, outVar));
            this.C.d(pmvVar.a.dK(new jxl(this, this.f), outVar));
            this.C.d(pmvVar.c.dK(new jxl(this, this.X), outVar));
            this.C.d(pmvVar.d.dK(new jxl(this, this.B), outVar));
            int i = 2;
            this.C.d(this.F.dK(new jxm(this, 2), outVar));
            int i2 = 0;
            this.C.d(luwVar.dK(new jxm(this, 0), outVar));
            int i3 = 14;
            if (this.s.p(gzo.bJ)) {
                this.r.g(rbb.a, R.string.learn_about_camera_accessibility, R.string.mode_video, false);
                this.C.d(new jkf(this, i3));
                this.C.d(this.N.dK(new juf(this, 5), outVar));
            }
            this.J.b(this, nkwVar, this.C);
            this.C.d(this.g.dK(new jxn(this, 0), outVar));
            our ourVar3 = this.C;
            sbp sbpVar = this.A;
            int size = sbpVar.size();
            while (true) {
                int i4 = 4;
                if (i2 < size) {
                    krz krzVar = (krz) sbpVar.get(i2);
                    krs krsVarH = krzVar.h();
                    int iOrdinal = krsVarH.ordinal();
                    if (iOrdinal != 8 && iOrdinal != 9) {
                        if (iOrdinal == 14) {
                            ourVar3.d(krzVar.j().dK(new jxm(this, 4), outVar));
                        } else if (iOrdinal != 15 && iOrdinal != 20) {
                            if (iOrdinal == 21) {
                                ourVar3.d(krzVar.j().dK(new jxm(this, 3), outVar));
                            } else if (iOrdinal != 26 && iOrdinal != 28) {
                                throw new UnsupportedOperationException("Not a valid menu item in video mode: ".concat(String.valueOf(String.valueOf(krsVarH))));
                            }
                        }
                    }
                    i2++;
                } else {
                    this.C.d(this.d.a(new ghp(this, i)));
                    this.K.a(new juc(this, 20), new jxr(this, 1), this.C);
                    this.L.a(new juc(this, 15), new juc(this, 16), this.C);
                    this.C.d(this.M.dK(new juf(this, i4), outVar));
                    this.D.A(this.Z);
                    this.i.g();
                    fzb fzbVar = this.V;
                    if (fzbVar.a.g()) {
                        rwc rwcVar = fzbVar.c;
                        if (rwcVar.h()) {
                            ((mci) rwcVar.c()).e();
                        }
                        rwc rwcVar2 = fzbVar.d;
                        if (rwcVar2.h()) {
                            ((ggg) rwcVar2.c()).a.g();
                        }
                    }
                    fwk fwkVar2 = this.p;
                    fwkVar2.getClass();
                    fwkVar2.b(this);
                    ((MainActivityLayout) ((ngx) this.y).a().c).i(this, mxk.DEVICE);
                }
            }
        }
        gkz gkzVar = this.H;
        luj lujVar = gkzVar.d;
        lus lusVar = luf.ac;
        int iIntValue = ((Integer) lujVar.b(lusVar)).intValue();
        gkzVar.a = iIntValue;
        if (iIntValue > 0) {
            gkzVar.c.a(lusVar).a(Integer.valueOf(gkzVar.a - 1));
        }
        gkzVar.b.g(gkzVar);
        gmp gmpVar = this.Q;
        gmpVar.c.g(gmpVar);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, mcq] */
    @Override // defpackage.fqf
    public final void m() {
        synchronized (this.h) {
            this.D.B(this.Z);
            this.i.h();
            fwk fwkVar = this.p;
            fwkVar.getClass();
            fwkVar.m();
            this.C.close();
            fwk fwkVar2 = this.p;
            fwkVar2.getClass();
            fwkVar2.k(this);
            fzb fzbVar = this.V;
            if (fzbVar.a.g()) {
                rwc rwcVar = fzbVar.c;
                if (rwcVar.h()) {
                }
                rwc rwcVar2 = fzbVar.d;
                if (rwcVar2.h()) {
                    ((ggg) rwcVar2.c()).a.h();
                }
            }
            gkz gkzVar = this.H;
            gkzVar.b.l(gkzVar);
            gmp gmpVar = this.Q;
            gmpVar.c.l(gmpVar);
            paq paqVar = gmpVar.b;
            if (paqVar != null) {
                paqVar.close();
            }
            this.l.d();
            this.p = null;
        }
    }

    @Override // defpackage.fqf
    public final boolean o() {
        synchronized (this.h) {
            fwk fwkVar = this.p;
            if (fwkVar == null) {
                return false;
            }
            return fwkVar.o();
        }
    }

    @Override // defpackage.fqf
    public final String r() {
        return this.x;
    }

    @Override // defpackage.fqf
    public final void s(Runnable runnable) {
        nrc nrcVar = this.P;
        if (nrcVar.b < nrcVar.a(nkw.VIDEO)) {
            return;
        }
        runnable.run();
    }

    @Override // defpackage.fqf
    public final void u(int i) {
        synchronized (this.h) {
            fwk fwkVar = this.p;
            if (fwkVar != null) {
                fwkVar.f(i);
            }
        }
    }

    @Override // defpackage.fqf
    public final void v(boolean z) {
        synchronized (this.h) {
            fwk fwkVar = this.p;
            if (fwkVar != null) {
                fwkVar.j(z);
            }
        }
    }

    @Override // defpackage.fqf
    public final void w() {
        synchronized (this.h) {
            this.i.l(this.U.K, nkw.VIDEO);
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }

    @Override // defpackage.fyt
    public final void q(kbk kbkVar) {
    }
}
