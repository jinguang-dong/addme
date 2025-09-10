package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iyu implements jhh, jgw, jgz, jhf, jhe, jhc, jhg, jfs, jfv, jft, jfz, emw, lpz {
    public static final sgv a = sgv.g("iyu");
    public paq A;
    public final enr B;
    public final mzz C;
    public final ViewfinderCover D;
    public final tzj E;
    public final szh F;
    public final rwc G;
    public final luj H;
    public final fdq I;
    public final lqc J;
    public fqy K;
    public final krj L;
    public int M;
    public final hbj N;
    public final mdy O;
    public final mwq P;
    private final feb Q;
    private final lve R;
    private final syu S;
    private final mye T;
    private final Context U;
    private final Context V;
    private final out W;
    private final Executor X;
    private final mes Y;
    private final luk Z;
    private final rwc aA;
    private final enq aE;
    private final ktx aF;
    private final luj aG;
    private final nll aH;
    private final pkc aI;
    private final mbj aJ;
    private final mwq aK;
    private final cxb aL;
    private final mwq aM;
    private final pmv aN;
    private final mwq aO;
    private final mwq aP;
    private final jgt aa;
    private final uem ab;
    private final boolean ac;
    private final jjn ad;
    private final tzj ae;
    private final mpf af;
    private final mpx ag;
    private final itl ah;
    private final Runnable ai;
    private final owq aj;
    private final owq ak;
    private final lvk al;
    private final owq am;
    private final owq an;
    private final AtomicReference ao;
    private boolean ar;
    private boolean as;
    private final gnt au;
    private final myl av;
    private final owq aw;
    private final owf ax;
    private final owq ay;
    private final uem az;
    public final fvu b;
    public final hhc c;
    public final Handler d;
    public final CameraActivityTiming e;
    public final ngk f;
    public final Resources g;
    public final pbn h;
    public final uem i;
    public final ngw j;
    public final tzj k;
    public fqf l;
    public final rwc m;
    public final tzj n;
    public nkw p;
    public boolean s;
    public boolean t;
    public Parcelable v;
    public Serializable w;
    public boolean x;
    public boolean y;
    public boolean z;
    public mep o = new mep(new pql(), new pbl());
    private boolean ap = false;
    public boolean q = false;
    public boolean r = false;
    public boolean u = true;
    private boolean aq = false;
    private boolean at = false;
    private final itk aB = new iyp(this);
    private final may aC = new iyr(this);
    private final fqe aD = new iys(this, 0);

    public iyu(Context context, Context context2, Resources resources, Handler handler, cxb cxbVar, jgt jgtVar, dx dxVar, fdq fdqVar, feb febVar, out outVar, Executor executor, mwq mwqVar, boolean z, ktx ktxVar, pkc pkcVar, syu syuVar, mwq mwqVar2, luk lukVar, luj lujVar, luj lujVar2, mye myeVar, ngk ngkVar, mwq mwqVar3, ngw ngwVar, tzj tzjVar, lve lveVar, hhc hhcVar, lqc lqcVar, uem uemVar, pbn pbnVar, mes mesVar, CameraActivityTiming cameraActivityTiming, uem uemVar2, mpf mpfVar, mpx mpxVar, pmv pmvVar, mwq mwqVar4, Intent intent, fvu fvuVar, hbj hbjVar, itl itlVar, mdy mdyVar, mzz mzzVar, krj krjVar, Runnable runnable, gnt gntVar, myl mylVar, owq owqVar, owq owqVar2, rwc rwcVar, tzj tzjVar2, tzj tzjVar3, lvk lvkVar, szh szhVar, owq owqVar3, nll nllVar, rwc rwcVar2, mbj mbjVar, owf owfVar, owq owqVar4, mwq mwqVar5, jjn jjnVar, owq owqVar5, owq owqVar6, AtomicReference atomicReference, uem uemVar3, tzj tzjVar4, rwc rwcVar3) {
        iyt iytVar = new iyt(this);
        this.aE = iytVar;
        this.V = context;
        this.U = context2;
        this.g = resources;
        this.b = fvuVar;
        outVar.getClass();
        this.W = outVar;
        executor.getClass();
        this.X = executor;
        this.d = handler;
        this.aL = cxbVar;
        mwqVar.getClass();
        this.aP = mwqVar;
        this.I = fdqVar;
        this.aa = jgtVar;
        febVar.getClass();
        this.Q = febVar;
        this.ac = z;
        ktxVar.getClass();
        this.aF = ktxVar;
        pkcVar.getClass();
        this.aI = pkcVar;
        this.S = syuVar;
        mwqVar2.getClass();
        this.P = mwqVar2;
        lukVar.getClass();
        this.Z = lukVar;
        this.H = lujVar;
        this.aG = lujVar2;
        myeVar.getClass();
        this.T = myeVar;
        ngkVar.getClass();
        this.f = ngkVar;
        mwqVar3.getClass();
        this.aK = mwqVar3;
        lveVar.getClass();
        this.R = lveVar;
        hhcVar.getClass();
        this.c = hhcVar;
        this.j = ngwVar;
        this.ae = tzjVar;
        mpfVar.getClass();
        this.af = mpfVar;
        mpxVar.getClass();
        this.ag = mpxVar;
        pmvVar.getClass();
        this.aN = pmvVar;
        this.aM = mwqVar4;
        lqcVar.getClass();
        this.J = lqcVar;
        uemVar.getClass();
        this.ab = uemVar;
        pbnVar.getClass();
        this.h = pbnVar;
        this.Y = mesVar;
        this.e = cameraActivityTiming;
        uemVar2.getClass();
        this.i = uemVar2;
        this.N = hbjVar;
        itlVar.getClass();
        this.ah = itlVar;
        this.O = mdyVar;
        this.C = mzzVar;
        this.L = krjVar;
        this.ai = runnable;
        this.au = gntVar;
        this.av = mylVar;
        this.D = (ViewfinderCover) ngwVar.e;
        this.aj = owqVar;
        this.ak = owqVar2;
        this.m = rwcVar;
        this.n = tzjVar2;
        this.E = tzjVar3;
        this.al = lvkVar;
        this.F = szhVar;
        this.aw = owqVar3;
        this.aH = nllVar;
        this.G = rwcVar2;
        this.aJ = mbjVar;
        this.ax = owfVar;
        this.ay = owqVar4;
        this.aO = mwqVar5;
        this.ad = jjnVar;
        this.k = tzjVar4;
        boolean zP = fdo.p(cxbVar);
        boolean z2 = (!intent.getBooleanExtra("open_socialshare", false) || z || zP) ? false : true;
        this.x = z2;
        if (z2) {
            Parcelable parcelableExtra = intent.getParcelableExtra("filmstrip_item_data");
            parcelableExtra.getClass();
            this.v = parcelableExtra;
            Serializable serializableExtra = intent.getSerializableExtra("filmstrip_item_type");
            serializableExtra.getClass();
            this.w = serializableExtra;
        }
        this.y = (!intent.getBooleanExtra("open_filmstrip", false) || z || zP) ? false : true;
        this.ar = (!intent.getBooleanExtra("open_empty_vault", false) || z || zP) ? false : true;
        this.am = owqVar5;
        this.an = owqVar6;
        this.ao = atomicReference;
        this.az = uemVar3;
        this.aA = rwcVar3;
        this.as = intent.getBooleanExtra("open_mars", false);
        owqVar3.dK(new hib(this, 20), outVar);
        new WeakReference(dxVar);
        this.B = new enr(iytVar, handler);
        mzzVar.v(this);
    }

    private final void A() {
        pbn pbnVar = this.h;
        pbnVar.f("resetSettingsOnModeChange");
        pbnVar.g();
    }

    private final void B() {
        pbn pbnVar = this.h;
        pbnVar.f("resetStartupSettingsForAllModules");
        gnt gntVar = this.au;
        gntVar.f(gntVar.a);
        this.ak.a(ltw.f);
        this.ai.run();
        this.aJ.a = false;
        if (((Boolean) this.H.b(luf.aN)).booleanValue()) {
            this.av.e(false);
            ((moc) this.i.a()).h();
        }
        if (!hax.c(this.N)) {
            this.am.a(false);
        }
        this.an.a(gho.DEFAULT);
        pbnVar.g();
    }

    private final void C(int i) {
        ConstraintLayout constraintLayout = this.K.b;
        if (i == 2) {
            constraintLayout.setVisibility(4);
        } else {
            constraintLayout.setVisibility(0);
        }
    }

    private final boolean D() {
        return ((hna) this.n.a()).g();
    }

    private final void E(final nkw nkwVar, int i, Executor executor, Executor executor2) {
        if (this.ap || this.p != nkwVar) {
            this.ap = false;
            pbn pbnVar = this.h;
            pbnVar.f("doSelectMode ".concat(String.valueOf(String.valueOf(nkwVar))));
            CameraActivityTiming cameraActivityTiming = this.e;
            if (!cameraActivityTiming.e()) {
                cameraActivityTiming.i = 3;
            }
            mep mepVar = (mep) this.Y.a();
            this.o = mepVar;
            nkwVar.name();
            qpt qptVar = mepVar.p;
            fqf fqfVar = this.l;
            nkw nkwVar2 = nkw.COTTAGE;
            fqfVar.F();
            fqfVar.z();
            fqy fqyVar = this.K;
            FrameLayout frameLayout = fqyVar.f;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            if (nkwVar != nkwVar2) {
                fqyVar.m(true);
            } else {
                fqyVar.h.N();
            }
            fqyVar.n = null;
            PreviewOverlay previewOverlay = fqyVar.m;
            previewOverlay.a = null;
            previewOverlay.b = null;
            final szh szhVar = new szh();
            nkw nkwVar3 = this.p;
            nkw nkwVar4 = nkw.PHOTO_SPHERE;
            if (nkwVar3 == nkwVar4 || nkwVar != nkwVar4) {
                szhVar.e(null);
            } else {
                executor.execute(new Runnable() { // from class: iym
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str = "doSelectMode " + String.valueOf(nkwVar) + " disconnectSync";
                        iyu iyuVar = this.a;
                        pbn pbnVar2 = iyuVar.h;
                        pbnVar2.f(str);
                        iyuVar.P.L();
                        pbnVar2.g();
                        szhVar.e(null);
                    }
                });
            }
            ske.W(szhVar, new lrk(this, nkwVar, i, 1), executor2);
            pbnVar.g();
        }
    }

    private final void F() {
        pbn pbnVar = this.h;
        pbnVar.f("setupCameraFacingFromIntent");
        cxb cxbVar = this.aL;
        if (!fdo.g(cxbVar.g())) {
            pbnVar.g();
            return;
        }
        pjr pjrVarE = fdo.i(cxbVar.g()) ? this.aI.e(pka.FRONT) : null;
        if (pjrVarE == null) {
            pjrVarE = this.aI.e(pka.BACK);
        }
        if (pjrVarE == null) {
            pjrVarE = this.aI.b();
        }
        pjrVarE.getClass();
        this.au.f(pjrVarE.a.equals("0") ? pka.BACK : pka.FRONT);
        pbnVar.g();
    }

    private final int x() {
        return this.r ? 2 : 0;
    }

    private final void y(boolean z) {
        fpy fpyVar = (fpy) ojl.ci(this.S);
        if (fpyVar == null) {
            return;
        }
        synchronized (fpyVar) {
            pjr pjrVar = fpyVar.f;
            if (pjrVar != null) {
                fpyVar.g(pjrVar.a());
            }
        }
        fpyVar.k(z);
        fpyVar.e = null;
    }

    private final void z(int i, Intent intent) {
        intent.getClass();
        ((Activity) this.aL.a).setResult(i, intent);
        i("CameraActivityController: Intent completed with a valid result. Closing activity.");
    }

    @Override // defpackage.emw
    public final void a(int i) {
        ((sgt) a.c().M(2534)).t("Camera disabled: %d", i);
        this.c.a();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [sgt, shi] */
    @Override // defpackage.emw
    public final void b(ena enaVar) {
        if (this.t) {
            y(false);
            return;
        }
        if (this.p != nkw.PHOTO_SPHERE) {
            y(false);
            ((sgt) a.c().M(2538)).C("Camera opened but the module shouldn't be requesting. Close & return. mode=%s camera=%s", this.p, enaVar.a());
        } else if (this.l != null) {
            ens ensVarF = enaVar.f();
            ensVarF.q = 0;
            enaVar.m(ensVarF);
            try {
                this.l.t(enaVar);
            } catch (RuntimeException e) {
                ((sgt) ((sgt) a.b().i(e)).M((char) 2537)).s("Error connecting to camera");
                this.c.e(e);
            }
        }
    }

    @Override // defpackage.emw
    public final void c(int i, String str) {
        ((sgt) a.c().M(2540)).v("Camera open failure: %s", str);
        this.c.e(null);
    }

    @Override // defpackage.emw
    public final void d(int i, String str) {
        ((sgt) a.c().M(2541)).y("Camera open already: %d,%s", i, str);
        this.c.g();
    }

    @Override // defpackage.emw
    public final void e(ene eneVar, String str) {
        ((sgt) a.c().M(2551)).v("Camera reconnection failure:%s", str);
        this.c.f();
    }

    @Override // defpackage.jhc
    public final void ea() {
        pbn pbnVar = this.h;
        pbnVar.f("CameraActivityController.onPause");
        this.s = true;
        if (!D() && !this.T.c() && !this.ac && !this.l.B()) {
            ViewfinderCover viewfinderCover = this.K.d;
            mzy mzyVar = viewfinderCover.s;
            int i = mzyVar.r;
            if (i != -1) {
                mzyVar.s.a(Integer.valueOf(i));
                mzyVar.r = -1;
            }
            mzyVar.c.cancel();
            mzyVar.d.cancel();
            mzyVar.t = nkw.UNINITIALIZED;
            mzyVar.k = rvk.a;
            mzyVar.F = 1;
            mzyVar.h();
            viewfinderCover.m();
            this.at = true;
            pbnVar.i();
        }
        this.ah.g(this.aB);
        if (fdo.a(this.aL.g()) >= 0.0f) {
            this.aH.b();
        }
        if (this.N.p(gzo.bH)) {
            this.l.F();
            this.l.z();
            this.f.h();
        } else {
            this.l.F();
            if (((hna) this.n.a()).g()) {
                ((sgt) a.c().M(2545)).s("Disconnecting the camera device because filmstrip was launched.");
                this.P.K();
                this.z = true;
                this.l.z();
            }
        }
        pbnVar.g();
    }

    @Override // defpackage.jhe
    public final void eb() {
        pbn pbnVar = this.h;
        pbnVar.f("CameraActivityController.onResume");
        this.s = false;
        this.ah.b(this.aB);
        this.af.d();
        if (this.N.p(gzo.bH)) {
            this.l.y();
            this.l.D(1);
        } else if (!D()) {
            if (this.z) {
                this.l.y();
                this.z = false;
            }
            this.l.D(1);
        }
        if (this.at) {
            fqy fqyVar = this.K;
            nkw nkwVar = nkw.UNINITIALIZED;
            fqyVar.s();
            this.at = false;
        }
        this.u = false;
        float fA = fdo.a(this.aL.g());
        if (fA >= 0.0f && fA <= 1.0f) {
            this.aH.c(fA);
        }
        this.e.d(this.p);
        pbnVar.g();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.jhf
    public final void ej() {
        pbn pbnVar = this.h;
        pbnVar.f("CameraActivityController.onStart");
        this.t = false;
        if (v()) {
            if (this.as && !this.ac) {
                this.av.e(true);
                this.as = false;
            }
            if (this.u || !D()) {
                this.K.k();
            }
            hbj hbjVar = this.N;
            gzi gziVar = gzo.a;
            if (hbjVar.p(gzy.j) && !hbjVar.p(gzy.o) && ((Integer) hbjVar.a(gzy.c).get()).intValue() == -1) {
                mhh mhhVarA = mhh.a(((Boolean) this.H.b(luf.r)).booleanValue());
                owq owqVar = this.ay;
                if (!((mhh) owqVar.dL()).equals(mhhVarA)) {
                    owqVar.a(mhhVarA);
                    mdy mdyVar = this.O;
                    tpc tpcVarM = stv.a.m();
                    nkw nkwVar = nkw.UNINITIALIZED;
                    int iOrdinal = mhhVarA.ordinal();
                    int i = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? 1 : 2 : 4 : 3;
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar = tpcVarM.b;
                    stv stvVar = (stv) tphVar;
                    stvVar.c = i - 1;
                    stvVar.b |= 1;
                    ssc sscVar = this.p.v;
                    if (!tphVar.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar2 = tpcVarM.b;
                    stv stvVar2 = (stv) tphVar2;
                    stvVar2.d = sscVar.T;
                    stvVar2.b |= 2;
                    if (!tphVar2.C()) {
                        tpcVarM.o();
                    }
                    stv stvVar3 = (stv) tpcVarM.b;
                    stvVar3.e = 2;
                    stvVar3.b |= 4;
                    mdyVar.k(sbp.l((stv) tpcVarM.l()));
                }
            }
            fdq fdqVar = this.I;
            mwq mwqVar = this.aO;
            our ourVarK = fdqVar.k();
            mwqVar.a.add(this);
            ourVarK.d(new ktu(mwqVar, this, 6, (byte[]) null));
            a.v(this.ao, kir.UNINITIALIZED, kir.LAUNCHING);
            this.af.d();
            this.l.y();
            this.O.K(f());
            C(x());
            this.J.d = this;
            pbnVar.g();
        }
    }

    @Override // defpackage.jgz
    public final void et() {
        fqy fqyVar = this.K;
        fqyVar.v.unregisterDisplayListener(fqyVar.k);
        fqyVar.i.a(null);
    }

    @Override // defpackage.jhg
    public final void eu() {
        pbn pbnVar = this.h;
        pbnVar.f("CameraActivityController.onStop");
        this.at = false;
        this.t = true;
        this.l.z();
        if (!this.N.p(gzo.bH)) {
            this.z = false;
        }
        pbnVar.i();
        this.K.n();
        this.J.d = null;
        if (this.q) {
            i("CameraActivityController: Fatal error during onPause!");
        } else {
            y(true);
            pbnVar.i();
        }
        this.ao.set(kir.UNINITIALIZED);
        pbnVar.i();
        pbnVar.g();
    }

    public final ssc f() {
        return this.p.v;
    }

    public final void g() {
        z(0, new Intent());
    }

    public final void h(Intent intent) {
        z(-1, intent);
    }

    public final void i(String str) {
        this.Q.a(str);
    }

    @Override // defpackage.jft
    public final void j(Configuration configuration) {
        this.l.E();
    }

    public final void k(nkw nkwVar) {
        if (this.s) {
            return;
        }
        this.h.f("onModeSelected ".concat(String.valueOf(String.valueOf(nkwVar))));
        try {
            this.ag.A(nkwVar);
            E(nkwVar, 2, this.X, this.W);
        } finally {
            A();
            this.h.g();
        }
    }

    @Override // defpackage.jfz
    public final void l(boolean z) {
        fqf fqfVar = this.l;
        if (fqfVar != null) {
            fqfVar.v(z);
        }
    }

    @Override // defpackage.jfv
    public final void m(Intent intent) {
        intent.getClass();
        cxb cxbVar = this.aL;
        ((Activity) cxbVar.a).setIntent(intent);
        String action = intent.getAction();
        this.u = true;
        mpf mpfVar = this.af;
        mpfVar.b();
        jea.y(mpfVar);
        mpfVar.a();
        if (this.au.j() != fdo.i(intent)) {
            this.ap = true;
        }
        if (fdo.h(intent)) {
            this.aG.d(luf.i, this.N.a(gzo.r).get());
        }
        nkw nkwVarO = fdo.o(cxbVar.g(), this.N);
        mzz mzzVar = this.C;
        if (mzzVar.t(nkwVarO)) {
            mzzVar.m(true);
        }
        if (!nkwVarO.equals(nkw.PHOTO)) {
            nkwVarO.name();
            this.ap = true;
        }
        B();
        F();
        sxo sxoVar = sxo.a;
        E(nkwVarO, 1, sxoVar, sxoVar);
        mzzVar.d();
        if (!this.t && this.u) {
            this.K.k();
            this.u = false;
        }
        ShortcutManager shortcutManager = (ShortcutManager) this.U.getSystemService(ShortcutManager.class);
        if (fdo.i(cxbVar.g())) {
            shortcutManager.reportShortcutUsed("selfie");
        }
        if (action == null || !action.equals("android.media.action.VIDEO_CAMERA")) {
            return;
        }
        shortcutManager.reportShortcutUsed("video");
    }

    public final void n() {
        this.O.x(6, null, null, null, null, null, null, null);
        gzi gziVar = gzo.a;
        this.J.c(new Intent(this.V, (Class<?>) CameraSettingsActivity.class));
        rwc rwcVar = (rwc) this.az.a();
        rwcVar.getClass();
        if (rwcVar.h()) {
            ((iqj) rwcVar.c()).f();
        }
    }

    @Override // defpackage.lpz
    public final void o() {
        fqf fqfVar = this.l;
        if (fqfVar == null) {
            return;
        }
        fqfVar.y();
        this.l.D(3);
        this.l.s(new ivi(this, 11));
    }

    @Override // defpackage.lpz
    public final void p() {
        fqf fqfVar = this.l;
        if (fqfVar == null) {
            return;
        }
        fqfVar.x();
        if (!this.N.p(gzo.bH)) {
            this.z = true;
        }
        this.l.z();
        this.l.s(new ivi(this, 12));
        if (this.p == nkw.PHOTO_SPHERE) {
            y(true);
        } else {
            this.P.L();
        }
    }

    @Override // defpackage.lpz
    public final void q() {
        this.l.s(new hjp(this, 20));
    }

    @Override // defpackage.jfs
    public final boolean r() {
        if (x() == 2) {
            return false;
        }
        if (this.K.r() || this.ad.r()) {
            return true;
        }
        return this.C.o();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pbn] */
    public final void s(nkw nkwVar) {
        String strValueOf = String.valueOf(String.valueOf(nkwVar));
        pbn pbnVar = this.h;
        pbnVar.f("setModuleFromMode ".concat(strValueOf));
        out.a();
        if (!v()) {
            pbnVar.g();
            return;
        }
        mwq mwqVar = this.aP;
        nkwVar.getClass();
        ?? r2 = mwqVar.a;
        r2.f("getModuleController for: " + nkwVar.u);
        uem uemVar = (uem) mwqVar.b.get(nkwVar);
        fqf fqfVar = uemVar != null ? (fqf) uemVar.a() : null;
        r2.g();
        if (fqfVar == null) {
            pbnVar.g();
            ((sgt) a.b().M(2565)).v("Cannot find controller for mode %s", nkwVar);
            return;
        }
        if (nkwVar != nkw.PHOTO_SPHERE) {
            y(true);
        }
        this.p = nkwVar;
        this.ag.A(nkwVar);
        this.aw.a(juk.a);
        this.I.j().d(fqfVar);
        this.l = fqfVar;
        fqfVar.w();
        this.o.a();
        pbnVar.g();
        ((nqp) this.E.a()).v();
        this.l.s(new hjp(this, 17));
    }

    public final void t(nbr nbrVar, boolean z) {
        if (z && nbrVar.d()) {
            this.K.u(2, nbrVar);
        } else {
            this.K.u(3, nbrVar);
        }
    }

    public final void u() {
        if (this.l == null) {
            return;
        }
        int iX = x();
        C(iX);
        this.l.u(iX);
    }

    @Override // defpackage.jgw
    public final void w() {
    }

    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, nkm] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, nkm] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, java.util.List] */
    public final boolean v() {
        fdq fdqVar;
        tzj tzjVar;
        rwc rwcVar;
        CameraActivityTiming cameraActivityTiming;
        mew mewVar;
        frm frmVar;
        Future future;
        out.a();
        if (!this.aq) {
            fdq fdqVar2 = this.I;
            if (!fdqVar2.g()) {
                this.aq = true;
                pbn pbnVar = this.h;
                pbnVar.f("AppUpgrader#upgrade");
                this.R.d(this.Z);
                lvk lvkVar = this.al;
                lvkVar.a(pka.FRONT);
                lvkVar.a(pka.BACK);
                B();
                F();
                pbnVar.h("UiWirer#wire");
                CameraActivityTiming cameraActivityTiming2 = this.e;
                mej mejVar = mej.ACTIVITY_UI_WIRE_START;
                mew mewVar2 = CameraActivityTiming.b;
                cameraActivityTiming2.l(mejVar, mewVar2);
                mwq mwqVar = this.aM;
                mwqVar.a.a();
                mwqVar.b.a();
                cameraActivityTiming2.l(mej.ACTIVITY_UI_WIRE_END, mewVar2);
                pbnVar.h("UiControllerInitializer#init");
                pmv pmvVar = this.aN;
                nkw nkwVar = nkw.UNINITIALIZED;
                int iOrdinal = ((nkw) pmvVar.d).ordinal();
                if (iOrdinal == 7) {
                    ((mrt) pmvVar.b.a()).a();
                } else if (iOrdinal != 8) {
                    ((mou) pmvVar.a.a()).a();
                } else {
                    ((msf) pmvVar.c.a()).a();
                }
                syu syuVar = this.S;
                iyn iynVar = new iyn(this, 0);
                sxo sxoVar = sxo.a;
                ojl.ck(syuVar, iynVar, sxoVar);
                pbnVar.h("FilmstripController#init");
                tzj tzjVar2 = this.n;
                hna hnaVar = (hna) tzjVar2.a();
                pbnVar.h("FilmstripUi#init");
                ngw ngwVar = this.j;
                Object obj = ngwVar.g;
                hnaVar.b.n = this;
                out outVar = this.W;
                jgt jgtVar = this.aa;
                ins.g(outVar, jgtVar, hnaVar);
                pbnVar.h("CameraAppUI#init");
                byte[] bArr = null;
                ((MainActivityLayout) ngwVar.c).p = rwc.j(new AmbientMode.AmbientController(this, bArr));
                ViewfinderCover viewfinderCover = this.D;
                owq owqVar = this.aj;
                mzy mzyVar = viewfinderCover.s;
                mzyVar.q = owqVar;
                mzyVar.s = this.aG.a(luf.d);
                viewfinderCover.r = new dyo(this, 13);
                mzyVar.z = rwc.j(this.aF);
                mzyVar.A = new mzw() { // from class: iyo
                    @Override // defpackage.mzw
                    public final boolean a() {
                        return ((Boolean) this.a.H.b(luf.O)).booleanValue();
                    }
                };
                gnt gntVar = this.au;
                mzyVar.B = gntVar;
                hbj hbjVar = this.N;
                if (hbjVar.p(gzo.bH)) {
                    fdqVar = fdqVar2;
                    tzjVar = tzjVar2;
                } else {
                    our ourVarJ = fdqVar2.j();
                    mwq mwqVar2 = this.aK;
                    fdqVar = fdqVar2;
                    AmbientMode.AmbientController ambientController = new AmbientMode.AmbientController(this, bArr);
                    mwqVar2.b.add(ambientController);
                    tzjVar = tzjVar2;
                    ourVarJ.d(new loe(mwqVar2, ambientController, 9));
                }
                this.K = (fqy) this.ae.a();
                krj krjVar = this.L;
                krjVar.i = new kru() { // from class: iyj
                    @Override // defpackage.kru
                    public final void a() {
                        this.a.g();
                    }
                };
                if (krjVar.k != null) {
                    krjVar.d.c(new krc(krjVar, 1));
                }
                krjVar.j = new krv() { // from class: iyk
                    @Override // defpackage.krv
                    public final void a() {
                        this.a.n();
                    }
                };
                rwc rwcVar2 = this.aA;
                if (rwcVar2.h()) {
                }
                rwc rwcVar3 = this.m;
                if (rwcVar3.h()) {
                    ((mac) rwcVar3.c()).a(this.aC);
                }
                fdqVar.j().d(hnaVar.a(this.aD));
                pbnVar.h("CameraFacing#config");
                fdqVar.j().d(gntVar.dK(new ijl(this, 17), sxoVar));
                pbnVar.g();
                cxb cxbVar = this.aL;
                nkw nkwVarO = fdo.o(cxbVar.g(), hbjVar);
                cameraActivityTiming2.d(nkwVarO);
                s(nkwVarO);
                pbnVar.f("CameraUi#prepareModuleUi");
                fqy fqyVar = this.K;
                ConstraintLayout constraintLayout = fqyVar.b;
                View.OnLayoutChangeListener onLayoutChangeListener = fqyVar.o;
                nbo nboVar = fqyVar.q;
                nkw nkwVar2 = fqyVar.A.p;
                mzz mzzVar = fqyVar.c;
                if (mzzVar.t(nkwVar2)) {
                    mzzVar.m(true);
                } else {
                    mzzVar.m(false);
                }
                pbnVar.h("FilmstripData#init");
                hbw hbwVar = (hbw) this.ab.a();
                int i = 18;
                if (this.ac || fdo.p(cxbVar) || fdqVar.g()) {
                    rwcVar = rwcVar3;
                    cameraActivityTiming = cameraActivityTiming2;
                    mewVar = mewVar2;
                    hbwVar.s();
                } else {
                    hbx hbxVar = hbwVar.n;
                    syu syuVarP = hbxVar.d.getAndSet(true) ? syq.a : ske.P(new fnf(hbxVar, i), hbxVar.c);
                    syu syuVarP2 = hbwVar.p();
                    lrp lrpVar = hbwVar.p;
                    Map map = lrpVar.b;
                    synchronized (map) {
                        Collection collectionValues = map.values();
                        int size = collectionValues.size();
                        if (size > 0) {
                            rwcVar = rwcVar3;
                            frmVar = new frm(size);
                        } else {
                            rwcVar = rwcVar3;
                            frmVar = null;
                        }
                        Iterator it = collectionValues.iterator();
                        while (it.hasNext()) {
                            lss lssVar = (lss) it.next();
                            ske.W(lssVar.t(), new lro(lssVar, hbwVar, frmVar, 0), lrpVar.c);
                            it = it;
                            cameraActivityTiming2 = cameraActivityTiming2;
                            mewVar2 = mewVar2;
                        }
                        cameraActivityTiming = cameraActivityTiming2;
                        mewVar = mewVar2;
                        future = frmVar == null ? syq.a : frmVar.a;
                    }
                    sxo sxoVar2 = sxo.a;
                    ArrayList arrayList = new ArrayList(3);
                    arrayList.add(syuVarP);
                    arrayList.add(syuVarP2);
                    arrayList.add(future);
                    ske.W(swz.j(ske.I(arrayList), new jie(3), sxoVar2), hbwVar.c, hbwVar.f);
                }
                if (rwcVar.h()) {
                    ((mac) rwcVar.c()).a(new iyq(this));
                }
                ojl.ck(((moc) this.i.a()).c(), new fqz(this, 7), sxoVar);
                if (this.ar) {
                    this.ar = false;
                    Handler handler = this.d;
                    hna hnaVar2 = (hna) tzjVar.a();
                    hnaVar2.getClass();
                    handler.post(new hjp(hnaVar2, 19));
                }
                pbnVar.h(LmJPKwPBa.qzVbDjzqESCQ);
                Object obj2 = ngwVar.k;
                rnu rnuVar = new rnu(this);
                ShutterButton shutterButton = (ShutterButton) obj2;
                rnt.M(shutterButton.B == null, "Cannot set on draw listener more than once.");
                shutterButton.B = rnuVar;
                shutterButton.invalidate();
                fdqVar.j().d(this.ax.dK(new ijl(this, 18), outVar));
                pbnVar.h("ActivityLifecycle#observe");
                jgtVar.k(this);
                pbnVar.g();
                t(new nbm(), true);
                cameraActivityTiming.l(mej.ACTIVITY_INITIALIZED, mewVar);
            }
        }
        return this.aq;
    }
}
