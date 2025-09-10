package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.WindowManager;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.vr.audio.Cf.qcjAcSmlN;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mzk implements mzz {
    private final boolean A;
    private final boolean B;
    private final boolean C;
    private final boolean D;
    private final ArrayList E;
    private final rww F;
    private final dx G;
    private final boolean H;
    private final boolean I;
    private nkx J;
    private final Map K;
    private final lpd L;
    private final uem M;
    private final owf N;
    private final owf O;
    private final uem P;
    private final owf Q;
    private boolean R;
    private boolean S;
    private ViewfinderCover T;
    private final boolean U;
    private final fdq V;
    private final krj W;
    private final mdy X;
    private final hbj Y;
    private final qwz Z;
    private final cxb aa;
    public boolean c;
    public nkw d;
    public final Context e;
    public final nfc f;
    public final ConcurrentHashMap g;
    public pnq h;
    public iyu i;
    public final mzm j;
    public final cxb k;
    public final qqq l;
    private final fvu n;
    private final ndj o;
    private final itl p;
    private final WindowManager q;
    private ArrayList r;
    private int s;
    private nkw t;
    private final pbn u;
    private final boolean v;
    private final mes w;
    private final boolean x;
    private final boolean y;
    private final boolean z;
    private static final sgv m = sgv.g("mzk");
    static final sbp a = sbp.q(nkw.PHOTO, nkw.VIDEO, nkw.AMBER, nkw.ACTION_PAN, nkw.PORTRAIT, nkw.NIGHT_SIGHT);
    public static final sbp b = sbp.o(nkw.COTTAGE, nkw.IMAX, nkw.PHOTO_SPHERE, nkw.SERENGETI);

    public mzk(WindowManager windowManager, mdy mdyVar, fvu fvuVar, fdq fdqVar, ndj ndjVar, itl itlVar, qqq qqqVar, boolean z, pbn pbnVar, Context context, cxb cxbVar, jte jteVar, mes mesVar, krj krjVar, hbj hbjVar, rww rwwVar, dx dxVar, ConcurrentHashMap concurrentHashMap, ixg ixgVar, lpd lpdVar, uem uemVar, owf owfVar, owf owfVar2, nfc nfcVar, qwz qwzVar, uem uemVar2, cxb cxbVar2, owf owfVar3) {
        nkw nkwVar = nkw.PHOTO;
        this.d = nkwVar;
        nkw nkwVar2 = nkw.UNINITIALIZED;
        this.t = nkwVar2;
        nkx nkxVar = nkx.PHOTO;
        this.J = nkxVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.K = linkedHashMap;
        this.S = true;
        this.q = windowManager;
        this.n = fvuVar;
        this.V = fdqVar;
        this.o = ndjVar;
        this.p = itlVar;
        this.l = qqqVar;
        this.e = context;
        this.G = dxVar;
        this.u = pbnVar;
        this.aa = cxbVar;
        this.v = z;
        this.X = mdyVar;
        this.w = mesVar;
        this.W = krjVar;
        this.Y = hbjVar;
        this.F = rwwVar;
        this.g = concurrentHashMap;
        this.L = lpdVar;
        this.M = uemVar;
        this.N = owfVar;
        this.O = owfVar2;
        this.f = nfcVar;
        this.Z = qwzVar;
        this.P = uemVar2;
        this.k = cxbVar2;
        this.Q = owfVar3;
        this.j = new mzm(this, windowManager, context);
        this.x = hbjVar.p(gym.aj);
        this.H = hbjVar.p(gzo.aE);
        this.I = hbjVar.p(haw.f);
        this.z = hbjVar.p(gym.K);
        this.y = hbjVar.p(gym.T);
        ArrayList arrayList = new ArrayList();
        if (ixgVar.a) {
            if (ixgVar.b) {
                arrayList.add(nkw.ACTION_PAN);
            }
            if (ixgVar.c) {
                arrayList.add(nkw.LANDSCAPE);
            }
        }
        this.E = arrayList;
        this.A = hbjVar.p(hai.b);
        this.B = hbjVar.p(gzp.k);
        this.C = hbjVar.o(gyi.h);
        this.D = hax.a(hbjVar);
        this.U = hbjVar.p(gzo.bw);
        gzi gziVar = gzn.a;
        int i = sbp.d;
        sbp sbpVar = sex.a;
        ArrayList arrayList2 = new ArrayList(a(sbpVar));
        ArrayList arrayList3 = new ArrayList(b(sbpVar));
        linkedHashMap.put(nkxVar, arrayList2);
        nkx nkxVar2 = nkx.VIDEO;
        linkedHashMap.put(nkxVar2, arrayList3);
        nkw nkwVarO = fdo.o(cxbVar.g(), hbjVar);
        nkwVar = (arrayList2.contains(nkwVarO) || arrayList3.contains(nkwVarO)) ? nkwVarO : nkwVar;
        nkxVar = true == arrayList3.contains(nkwVar) ? nkxVar2 : nkxVar;
        this.J = nkxVar;
        this.r = (ArrayList) linkedHashMap.get(nkxVar);
        I(nkwVar);
        this.t = nkwVar2;
        jteVar.a(this);
    }

    private final nkx C(nkw nkwVar) {
        Map map = this.K;
        for (nkx nkxVar : map.keySet()) {
            if (((ArrayList) map.get(nkxVar)).contains(nkwVar)) {
                return nkxVar;
            }
        }
        return nkx.UNINITIALIZED;
    }

    private final nkx D(nkw nkwVar) {
        nkx nkxVarC = C(nkwVar);
        return nkxVarC == nkx.UNINITIALIZED ? nkx.PHOTO : nkxVarC;
    }

    private final void F(boolean z) {
        this.j.a = z;
        this.l.m(z);
        ((nfb) this.f).c.b(Boolean.valueOf(z));
    }

    private final void G(nkw nkwVar, boolean z) {
        if (this.r.contains(nkwVar)) {
            int i = 0;
            this.n.m(false);
            this.o.M(false);
            int i2 = 2;
            this.p.k(2);
            this.c = true;
            gga ggaVar = new gga(this.X, this.w, this.d, nkwVar);
            int iIndexOf = this.r.indexOf(nkwVar);
            if (iIndexOf != -1) {
                int i3 = this.s;
                if (iIndexOf < i3) {
                    i2 = 1;
                } else if (iIndexOf > i3) {
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(250, 0);
                valueAnimatorOfInt.setDuration(250L);
                if (z) {
                    valueAnimatorOfInt.addUpdateListener(new mzh(this, i2, i));
                }
                valueAnimatorOfInt.addListener(new mzj(this));
                valueAnimatorOfInt.start();
            }
            mub mubVar = new mub(ggaVar, 15);
            if (this.i != null) {
                if (this.V.f()) {
                    return;
                }
                if (this.d != nkwVar) {
                    I(nkwVar);
                    this.T.n(nkwVar, new nhu() { // from class: mzf
                        @Override // defpackage.nhu
                        public final void a(nkw nkwVar2) {
                            this.a.i.k(nkwVar2);
                        }
                    }, mubVar);
                    return;
                }
            }
            mubVar.run();
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    private final void H(nkx nkxVar) throws Resources.NotFoundException {
        Map map = this.K;
        if (!map.containsKey(nkxVar)) {
            ((sgt) m.c().M(5198)).v("No configuration available for supermode: %s. Keeping previous mode chips.", nkxVar);
            return;
        }
        qqq qqqVar = this.l;
        qqqVar.j();
        ArrayList arrayList = (ArrayList) map.get(nkxVar);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nkw nkwVar = (nkw) arrayList.get(i);
            ?? r4 = qqqVar.a;
            if (r4.containsKey(nkwVar)) {
                Object obj = qqqVar.b;
                View view = (View) r4.get(nkwVar);
                out.a();
                rnt.B(nkwVar != nkw.UNINITIALIZED, "Cannot append UNINITIALIZED mode");
                ((ModeSwitcher) obj).b.d(view, nkwVar);
            } else {
                Object obj2 = qqqVar.c;
                Object obj3 = qqqVar.b;
                ((EnumMap) obj2).put((EnumMap) nkwVar, (nkw) obj3);
                out.a();
                rnt.B(nkwVar != nkw.UNINITIALIZED, "Cannot append UNINITIALIZED mode");
                ModeSwitcher modeSwitcher = (ModeSwitcher) obj3;
                nae naeVar = modeSwitcher.b;
                out.a();
                View viewA = naeVar.a(nkwVar);
                naeVar.d(viewA, nkwVar);
                modeSwitcher.h(viewA, nkwVar);
            }
            sbv sbvVar = (sbv) qqqVar.d;
            owf owfVar = (owf) sbvVar.get(nkwVar);
            ModeSwitcher modeSwitcher2 = (ModeSwitcher) ((EnumMap) qqqVar.c).get(nkwVar);
            if (owfVar != null && modeSwitcher2 != null) {
                owf owfVar2 = (owf) sbvVar.get(nkwVar);
                modeSwitcher2.i(nkwVar, (owfVar2 == null || ((Boolean) owfVar2.dL()).booleanValue()) ? false : true);
            }
        }
    }

    private final void I(nkw nkwVar) {
        this.t = this.d;
        this.d = nkwVar;
        this.s = this.r.indexOf(nkwVar);
        this.g.put(this.J, this.d);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    private final boolean J(int i) {
        boolean z;
        Object objFr = this.F.fr();
        objFr.getClass();
        if (((mxu) objFr).a.j.equals(mxj.JARVIS_LAYOUT)) {
            return false;
        }
        if (i == 1) {
            this.W.x(2);
            return true;
        }
        jjn jjnVar = (jjn) this.M.a();
        jjnVar.getClass();
        krj krjVar = this.W;
        if (krjVar.t()) {
            krjVar.v(2);
            return true;
        }
        qwz qwzVar = this.Z;
        if (qwzVar.b) {
            loop0: while (true) {
                z = false;
                for (rnu rnuVar : qwzVar.d) {
                    if (!z) {
                        gwv gwvVar = (gwv) rnuVar.a;
                        if (gwvVar.u.a() == gxj.a) {
                            break;
                        }
                        gwvVar.j();
                    }
                    z = true;
                }
            }
            if (z) {
                return true;
            }
        }
        if (!jjnVar.A()) {
            return false;
        }
        jjnVar.q();
        return true;
    }

    @Override // defpackage.mzz
    public final void A(nkw nkwVar) {
        rnt.B(nkwVar != null, "requested mode is null");
        if (this.d == nkwVar) {
            ((sgt) m.c().M(5195)).s("requested mode is currently active");
            return;
        }
        if (this.c) {
            ((sgt) m.b().M(5194)).s("scroll is currently in progress; don't know what to do with this.");
        } else if (!this.R) {
            ((sgt) m.c().M(5193)).s("mode switch requested when switcher is disabled. Ignoring.");
        } else if (t(nkwVar)) {
            k(nkwVar);
        }
    }

    @Override // defpackage.mzz
    public final void B(nkw nkwVar) {
        G(nkwVar, false);
    }

    public final List a(sbp sbpVar) {
        ArrayList arrayList = new ArrayList(this.E);
        if (this.C) {
            arrayList.add(nkw.COTTAGE);
        }
        if (this.v) {
            arrayList.add(nkw.PORTRAIT);
        }
        arrayList.add(nkw.PHOTO);
        arrayList.add(nkw.NIGHT_SIGHT);
        if (this.B) {
            arrayList.add(nkw.SERENGETI);
        } else {
            arrayList.add(nkw.IMAX);
        }
        if (this.A) {
            arrayList.add(nkw.PHOTO_SPHERE);
        }
        arrayList.removeAll(sbpVar);
        return arrayList;
    }

    public final List b(sbp sbpVar) {
        ArrayList arrayList = new ArrayList();
        if (this.y && this.z) {
            arrayList.add(nkw.ROOSTER);
        }
        if (this.x) {
            arrayList.add(nkw.AMBER);
        }
        arrayList.add(nkw.VIDEO);
        if (this.D) {
            arrayList.add(nkw.VIDEO_NIGHT_SIGHT);
        }
        if (this.H) {
            arrayList.add(nkw.SLOW_MOTION);
        }
        if (this.I) {
            arrayList.add(nkw.TIME_LAPSE);
        }
        arrayList.removeAll(sbpVar);
        return arrayList;
    }

    @Override // defpackage.mzz
    public final void c() {
        nkw nkwVar = nkw.PHOTO;
        if (this.d == nkwVar) {
            return;
        }
        nkx nkxVarC = C(nkwVar);
        if (this.J != nkxVarC) {
            h(nkxVarC, Optional.of(nkwVar), false);
        } else {
            this.l.l(nkwVar, false);
            G(nkwVar, false);
        }
    }

    @Override // defpackage.mzz
    public final void d() {
        this.t = nkw.UNINITIALIZED;
        this.g.clear();
    }

    public final void e(sbp sbpVar) throws Resources.NotFoundException {
        if (sbpVar.contains(this.d)) {
            nkw nkwVar = this.J == nkx.VIDEO ? nkw.VIDEO : nkw.PHOTO;
            this.l.l(nkwVar, false);
            G(nkwVar, false);
        }
        qqq qqqVar = this.l;
        qqqVar.j();
        qqqVar.o();
        Map map = this.K;
        map.put(nkx.PHOTO, new ArrayList(a(sbpVar)));
        map.put(nkx.VIDEO, new ArrayList(b(sbpVar)));
        ArrayList arrayList = (ArrayList) map.get(this.J);
        arrayList.getClass();
        this.r = arrayList;
        E();
        this.s = this.r.indexOf(this.d);
        if (sbpVar.contains(this.t)) {
            this.t = nkw.UNINITIALIZED;
        }
        Iterable$EL.forEach(sbpVar, new mdw(this, 6));
    }

    @Override // defpackage.mzz
    public final void f() {
        Object obj = this.l.b;
        if (obj != null) {
            nnu.a(4, (View) obj, false);
        }
        this.f.f(false, false);
    }

    @Override // defpackage.mzz
    public final void g(ngw ngwVar) throws Resources.NotFoundException {
        this.T = (ViewfinderCover) ngwVar.e;
        if (this.U) {
            MainActivityLayout mainActivityLayout = (MainActivityLayout) ngwVar.c;
            this.h = mainActivityLayout.k;
            mainActivityLayout.addOnLayoutChangeListener(new mzi(this, mainActivityLayout, 0));
        }
        this.d.getClass();
        pbn pbnVar = this.u;
        pbnVar.f("ModeSwitchCtrl#init");
        fdq fdqVar = this.V;
        fdqVar.j().d(owb.a(((ModeSwitcher) this.l.b).f).dK(new mix(this, 17), sxo.a));
        E();
        nfc nfcVar = this.f;
        nfb nfbVar = (nfb) nfcVar;
        nfbVar.b.d(this.G, new mzg(this, 0));
        nfcVar.c(this.J, false);
        owf owfVarA = owb.a(owl.h(this.O, new mdv(3)));
        our ourVarJ = fdqVar.j();
        mhd mhdVar = new mhd(this, 5);
        ouu ouuVar = out.a;
        ourVarJ.d(owfVarA.dK(mhdVar, ouuVar));
        fdqVar.j().d(this.N.dK(new mhd(this, 6, (byte[]) null), ouuVar));
        fdqVar.j().d(owl.j(owl.h(this.Q, new leb(18)), new mtd(this, 11), ouuVar));
        nfbVar.i = this.Y.p(gzo.bw);
        pbnVar.g();
    }

    final void h(nkx nkxVar, Optional optional, boolean z) {
        if (this.J == nkxVar) {
            return;
        }
        if (this.i == null) {
            ((sgt) m.c().M(5191)).s("CameraModeController not ready; cannot perform supermode switch.");
            return;
        }
        boolean zF = this.V.f();
        if (zF && !z) {
            ((sgt) m.c().M(5190)).s("Activity lifetime closed, blocking supermode switch.");
            return;
        }
        Map map = this.K;
        if (!map.containsKey(nkxVar)) {
            ((sgt) m.c().M(5189)).v("No configuration available for supermode: %s", nkxVar);
            return;
        }
        this.r = (ArrayList) map.get(nkxVar);
        this.J = nkxVar;
        this.f.c(nkxVar, false);
        qqq qqqVar = this.l;
        qqqVar.o();
        H(nkxVar);
        if (optional.isPresent() && this.r.contains(optional.get())) {
            I((nkw) optional.get());
        } else {
            ConcurrentHashMap concurrentHashMap = this.g;
            if (concurrentHashMap.containsKey(this.J)) {
                I((nkw) concurrentHashMap.get(this.J));
            } else {
                I(this.J == nkx.VIDEO ? nkw.VIDEO : nkw.PHOTO);
            }
        }
        qqqVar.k(this.J, this.d, this.R);
        qqqVar.l(this.d, false);
        if (zF) {
            return;
        }
        this.T.n(this.d, new nhu() { // from class: mze
            @Override // defpackage.nhu
            public final void a(nkw nkwVar) {
                this.a.i.k(nkwVar);
            }
        }, new iwh(20));
    }

    public final void i(naj najVar) {
        int i = najVar.c;
        if (i == 1) {
            return;
        }
        mdy mdyVar = this.X;
        String string = najVar.a.toString();
        String string2 = najVar.b.toString();
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.MODE_SWITCH_EVENT;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar = (sod) tpcVarM.b;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        tpc tpcVarM2 = srx.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        srx srxVar = (srx) tphVar;
        srxVar.c = i - 1;
        srxVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        tph tphVar2 = tpcVarM2.b;
        srx srxVar2 = (srx) tphVar2;
        string.getClass();
        srxVar2.b |= 4;
        srxVar2.e = string;
        if (!tphVar2.C()) {
            tpcVarM2.o();
        }
        srx srxVar3 = (srx) tpcVarM2.b;
        string2.getClass();
        srxVar3.b |= 2;
        srxVar3.d = string2;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        srx srxVar4 = (srx) tpcVarM2.l();
        srxVar4.getClass();
        sodVar2.I = srxVar4;
        sodVar2.c |= 1024;
        mdyVar.I(tpcVarM);
    }

    @Override // defpackage.naa
    public final void j() {
        this.n.m(true);
        this.o.M(true);
        this.p.k(1);
    }

    public final void k(nkw nkwVar) {
        if (this.d == nkwVar || !this.R) {
            return;
        }
        nkx nkxVarD = D(nkwVar);
        if (nkxVarD != this.J) {
            h(nkxVarD, Optional.of(nkwVar), false);
        } else {
            G(nkwVar, false);
            x(nkwVar);
        }
    }

    public final void l(boolean z) {
        out.a();
        this.S = z;
        if (!z) {
            F(false);
        } else if (this.R) {
            F(true);
        }
    }

    @Override // defpackage.mzz
    public final void m(boolean z) {
        out.a();
        this.R = z;
        if (!z) {
            F(false);
        } else if (this.S) {
            F(true);
        }
    }

    @Override // defpackage.mzz
    public final void n() {
        Object obj = this.l.b;
        if (obj != null) {
            ((ModeSwitcher) obj).e(true, false);
            nnu.a(0, (View) obj, false);
        }
        if (((gur) this.Q.dL()).a()) {
            return;
        }
        this.f.f(true, false);
    }

    @Override // defpackage.mzz
    public final boolean o() {
        nkw nkwVar = this.t;
        nkw nkwVar2 = nkw.UNINITIALIZED;
        if (nkwVar == nkwVar2) {
            return false;
        }
        k(this.t);
        this.t = nkwVar2;
        return true;
    }

    @Override // defpackage.naa
    public final boolean p() {
        return this.s == 0;
    }

    @Override // defpackage.naa
    public final boolean q() {
        return this.s == this.r.size() + (-1);
    }

    @Override // defpackage.mzz
    public final boolean r() {
        return this.R;
    }

    @Override // defpackage.mzz
    public final boolean s() {
        return this.j.a;
    }

    @Override // defpackage.mzz
    public final boolean t(nkw nkwVar) {
        return C(nkwVar) != nkx.UNINITIALIZED;
    }

    @Override // defpackage.mzz
    public final mzm u() {
        return this.j;
    }

    @Override // defpackage.mzz
    public final void v(iyu iyuVar) {
        this.i = iyuVar;
    }

    @Override // defpackage.mzz
    public final void w(boolean z) {
        ((ModeSwitcher) this.l.b).e(z, true);
        if (((gur) this.Q.dL()).a()) {
            return;
        }
        this.f.f(z, true);
    }

    @Override // defpackage.mzz
    public final void x(nkw nkwVar) {
        if (this.d == nkwVar || this.c) {
            return;
        }
        if (!t(nkwVar) && (nkwVar.equals(nkw.TIME_LAPSE) || nkwVar.equals(nkw.SLOW_MOTION))) {
            nkwVar = nkw.VIDEO;
        }
        nkx nkxVarD = D(nkwVar);
        if (nkxVarD != this.J) {
            h(nkxVarD, Optional.of(nkwVar), true);
        } else {
            I(nkwVar);
            this.l.l(this.d, true);
        }
    }

    @Override // defpackage.naa
    public final void y(int i, boolean z) {
        nkx nkxVarD;
        nkw nkwVar;
        if (!z) {
            if (i == 1 && p()) {
                return;
            }
            if (i == 2 && q()) {
                return;
            }
        }
        if (((mxu) this.F.fr()).a.j.equals(mxj.JARVIS_LAYOUT)) {
            return;
        }
        nkw nkwVar2 = null;
        if (z) {
            if (this.L.a) {
                sbp sbpVar = a;
                int iIndexOf = sbpVar.indexOf(this.d);
                if (iIndexOf == -1) {
                    iIndexOf = sbpVar.indexOf(nkw.PHOTO);
                }
                int i2 = i == 2 ? iIndexOf + 1 : iIndexOf - 1;
                if (i2 < 0) {
                    i2 = ((sex) sbpVar).c - 1;
                } else if (i2 >= ((sex) sbpVar).c) {
                    i2 = 0;
                }
                nkwVar = (nkw) sbpVar.get(i2);
            } else {
                Map map = this.K;
                sbp sbpVarJ = sbp.j(map.keySet());
                int size = i == 2 ? this.s + 1 : this.s - 1;
                ArrayList arrayList = this.r;
                int iIndexOf2 = sbpVarJ.indexOf(this.J);
                if (size < 0) {
                    int size2 = iIndexOf2 - 1;
                    if (size2 < 0) {
                        size2 = sbpVarJ.size() - 1;
                    }
                    arrayList = (ArrayList) map.get((nkx) sbpVarJ.get(size2));
                    arrayList.getClass();
                    size = arrayList.size() - 1;
                } else if (size >= arrayList.size()) {
                    int i3 = iIndexOf2 + 1;
                    if (i3 >= sbpVarJ.size()) {
                        i3 = 0;
                    }
                    arrayList = (ArrayList) map.get((nkx) sbpVarJ.get(i3));
                    arrayList.getClass();
                    size = 0;
                }
                nkwVar = (nkw) arrayList.get(size);
            }
            if (nkwVar != this.d) {
                nkwVar2 = nkwVar;
            }
        } else if (i == 2 && !q()) {
            nkwVar2 = (nkw) this.r.get(this.s + 1);
        } else if (i == 1 && !p()) {
            nkwVar2 = (nkw) this.r.get(this.s - 1);
        }
        if (nkwVar2 != null) {
            i(new naj(this.d, nkwVar2, 2));
            if (!z || (nkxVarD = D(nkwVar2)) == this.J) {
                G(nkwVar2, true);
            } else {
                h(nkxVarD, Optional.of(nkwVar2), false);
            }
        }
    }

    @Override // defpackage.naa
    public final boolean z(int i, boolean z) {
        if (z) {
            if (i == 2 && J(2)) {
                return true;
            }
            y(i, false);
            return false;
        }
        if (J(i)) {
            return true;
        }
        uem uemVar = this.P;
        if (uemVar.a() != null) {
            HotshotController hotshotController = (HotshotController) uemVar.a();
            hotshotController.s();
            hotshotController.s();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    private final void E() throws Resources.NotFoundException {
        nkx nkxVar = this.J;
        nkxVar.getClass();
        Map map = this.K;
        if (!map.containsKey(nkxVar)) {
            this.J = nkx.PHOTO;
        }
        ((ArrayList) map.get(this.J)).getClass();
        for (ArrayList arrayList : map.values()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                nkw nkwVar = (nkw) arrayList.get(i);
                qqq qqqVar = this.l;
                EnumMap enumMap = (EnumMap) qqqVar.c;
                Object obj = qqqVar.b;
                enumMap.put((EnumMap) nkwVar, (nkw) obj);
                out.a();
                rnt.B(nkwVar != nkw.UNINITIALIZED, qcjAcSmlN.ixeqB);
                ModeSwitcher modeSwitcher = (ModeSwitcher) obj;
                View viewA = modeSwitcher.b.a(nkwVar);
                modeSwitcher.h(viewA, nkwVar);
                qqqVar.a.put(nkwVar, viewA);
            }
        }
        H(this.J);
        this.l.k(this.J, this.d, this.R);
    }
}
