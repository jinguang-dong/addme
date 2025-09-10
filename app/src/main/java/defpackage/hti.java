package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.VibrationEffect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.ar.core.R;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hti extends fqf {
    public static final sgv a = sgv.g("hti");
    public static final VibrationEffect b;
    public static final VibrationEffect c;
    public paq A;
    public boolean B;
    public final nan C;
    public final nan D;
    public final nan E;
    public final nan F;
    public final owf G;
    public final htd H;
    public final htb I;
    public final muu J;
    public final htv K;
    public final imi L;
    public final huc M;
    public final mbj N;
    public jth O;
    public final fqy P;
    public hup Q;
    public final mkq R;
    public final uh S;
    public final syj T;
    public final mwq U;
    public final jod V;
    public final ocq W;
    private final gnt X;
    private final FrameLayout Y;
    private final kgt Z;
    private final mzz aa;
    private final fvu ab;
    private final hyh ac;
    private final ngw ad;
    private final owq ae;
    private final owq af;
    private final owf ag;
    private final huk ah;
    private final nqa ai;
    private final ViewGroup aj;
    private final owf ak;
    private final uhf al;
    private final uhf am;
    private our an;
    private jtg ao;
    private boolean ap;
    private final kgp aq;
    private final krj ar;
    private final kqy as;
    private final ktx at;
    private final luj au;
    private final hto av;
    private final hbj aw;
    private final AmbientModeSupport.AmbientController ax;
    public final huq d;
    public final hup e;
    public final owq f;
    public final out g;
    public final moy h;
    public final pbn i;
    public final mes j;
    public final jub k;
    public final ndj l;
    public final itl m;
    public final owq n;
    public final owq o;
    public final Context p;
    public final fel q;
    public final owq r;
    public final owf s;
    public our v;
    public und w;
    public our x;
    public meu y;
    public boolean z;

    static {
        VibrationEffect vibrationEffectCompose = VibrationEffect.startComposition().addPrimitive(7, 1.0f, 0).compose();
        vibrationEffectCompose.getClass();
        b = vibrationEffectCompose;
        VibrationEffect vibrationEffectCompose2 = VibrationEffect.startComposition().addPrimitive(1, 1.0f, 0).compose();
        vibrationEffectCompose2.getClass();
        c = vibrationEffectCompose2;
    }

    public hti(kgp kgpVar, gnt gntVar, FrameLayout frameLayout, huq huqVar, hup hupVar, kgt kgtVar, owq owqVar, out outVar, moy moyVar, pbn pbnVar, mzz mzzVar, krj krjVar, kqy kqyVar, mes mesVar, jub jubVar, muu muuVar, uh uhVar, ndj ndjVar, itl itlVar, fvu fvuVar, htv htvVar, hyh hyhVar, owq owqVar2, syj syjVar, ktx ktxVar, imi imiVar, huc hucVar, hbj hbjVar, owq owqVar3, iyu iyuVar, Context context, ngw ngwVar, luj lujVar, owq owqVar4, owq owqVar5, mbj mbjVar, ocq ocqVar, fel felVar, hto htoVar, owf owfVar, huk hukVar, owq owqVar6, jod jodVar, nqa nqaVar, ViewGroup viewGroup, owf owfVar2, jho jhoVar, mwq mwqVar, owf owfVar3, uhf uhfVar, uhf uhfVar2, qwz qwzVar) {
        kgpVar.getClass();
        gntVar.getClass();
        frameLayout.getClass();
        huqVar.getClass();
        hupVar.getClass();
        owqVar.getClass();
        outVar.getClass();
        moyVar.getClass();
        pbnVar.getClass();
        mzzVar.getClass();
        krjVar.getClass();
        kqyVar.getClass();
        mesVar.getClass();
        muuVar.getClass();
        ndjVar.getClass();
        itlVar.getClass();
        fvuVar.getClass();
        htvVar.getClass();
        hyhVar.getClass();
        owqVar2.getClass();
        syjVar.getClass();
        ktxVar.getClass();
        imiVar.getClass();
        hucVar.getClass();
        hbjVar.getClass();
        owqVar3.getClass();
        iyuVar.getClass();
        lujVar.getClass();
        owqVar4.getClass();
        owqVar5.getClass();
        mbjVar.getClass();
        felVar.getClass();
        htoVar.getClass();
        owfVar.getClass();
        owqVar6.getClass();
        jodVar.getClass();
        nqaVar.getClass();
        viewGroup.getClass();
        owfVar2.getClass();
        jhoVar.getClass();
        mwqVar.getClass();
        owfVar3.getClass();
        uhfVar.getClass();
        qwzVar.getClass();
        this.aq = kgpVar;
        this.X = gntVar;
        this.Y = frameLayout;
        this.d = huqVar;
        this.e = hupVar;
        this.Z = kgtVar;
        this.f = owqVar;
        this.g = outVar;
        this.h = moyVar;
        this.i = pbnVar;
        this.aa = mzzVar;
        this.ar = krjVar;
        this.as = kqyVar;
        this.j = mesVar;
        this.k = jubVar;
        this.J = muuVar;
        this.S = uhVar;
        this.l = ndjVar;
        this.m = itlVar;
        this.ab = fvuVar;
        this.K = htvVar;
        this.ac = hyhVar;
        this.n = owqVar2;
        this.T = syjVar;
        this.at = ktxVar;
        this.L = imiVar;
        this.M = hucVar;
        this.aw = hbjVar;
        this.o = owqVar3;
        this.p = context;
        this.ad = ngwVar;
        this.au = lujVar;
        this.ae = owqVar4;
        this.af = owqVar5;
        this.N = mbjVar;
        this.W = ocqVar;
        this.q = felVar;
        this.av = htoVar;
        this.ag = owfVar;
        this.ah = hukVar;
        this.r = owqVar6;
        this.V = jodVar;
        this.ai = nqaVar;
        this.aj = viewGroup;
        this.s = owfVar2;
        this.U = mwqVar;
        this.ak = owfVar3;
        this.al = uhfVar;
        this.am = uhfVar2;
        fqy fqyVar = iyuVar.K;
        fqyVar.getClass();
        this.P = fqyVar;
        this.y = (meu) mesVar.a();
        nao naoVar = new nao();
        naoVar.h = context;
        naoVar.e = context.getString(R.string.device_not_leveled);
        naoVar.a = false;
        naoVar.j = 10;
        naoVar.b();
        this.C = naoVar.a();
        nao naoVar2 = new nao();
        naoVar2.h = context;
        naoVar2.e = context.getString(R.string.serengeti_instruction);
        naoVar2.a = true;
        naoVar2.j = 10;
        naoVar2.b();
        this.D = naoVar2.a();
        nao naoVar3 = new nao();
        naoVar3.h = context;
        naoVar3.e = context.getString(R.string.serengeti_night_sight_instruction);
        naoVar3.a = true;
        naoVar3.j = 10;
        naoVar3.b();
        naoVar3.g = R.drawable.gs_bedtime_fill1_vd_20;
        this.E = naoVar3.a();
        nao naoVar4 = new nao();
        naoVar4.h = context;
        naoVar4.e = context.getString(R.string.hold_still);
        naoVar4.a = true;
        naoVar4.j = 10;
        naoVar4.b();
        this.F = naoVar4.a();
        this.G = owb.a(owl.h(owl.a(owqVar3, hyhVar.b, lujVar.a(luf.M)), hth.a));
        this.H = new htd(this);
        this.R = new mkq(this, qwzVar, 1);
        this.I = new htb(this);
        this.ax = new AmbientModeSupport.AmbientController(this);
    }

    private final void G() {
        this.L.f(this.C);
        d();
    }

    private final void g() {
        jtg jtgVar = this.ao;
        if (jtgVar != null) {
            if (!jtgVar.isDone()) {
                jtgVar.cancel(false);
            }
            this.ao = null;
        }
        our ourVar = this.x;
        if (ourVar != null) {
            ourVar.close();
        }
    }

    private final void k() {
        if (((Boolean) this.G.dL()).booleanValue()) {
            this.L.f(this.E);
        } else {
            this.L.f(this.D);
        }
    }

    @Override // defpackage.fqf
    protected final void C(int i) {
        hup hupVar = this.e;
        hvg hvgVar = hupVar.K;
        Sensor sensor = hvgVar.c;
        SensorManager sensorManager = hvgVar.a;
        int i2 = 1;
        sensorManager.registerListener(hvgVar, sensor, 1);
        sensorManager.registerListener(hvgVar, hvgVar.b, 1);
        hupVar.L.f(hupVar.i);
        our ourVar = new our();
        int i3 = 19;
        hdg hdgVar = new hdg(hupVar, i3);
        Executor executor = hupVar.b;
        ourVar.d(hupVar.d.dK(hdgVar, executor));
        int i4 = 20;
        ourVar.d(hupVar.f.dK(new hdg(hupVar, i4), executor));
        ourVar.d(hupVar.g.dK(new ijl(hupVar, i2), executor));
        hupVar.h = ourVar;
        Object obj = this.ad.d;
        ViewGroup viewGroup = this.aj;
        viewGroup.addView(this.Y, viewGroup.indexOfChild((View) obj) + 1);
        huq huqVar = this.d;
        ScheduledFuture scheduledFuture = huqVar.d;
        int i5 = 0;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        huqVar.d = huqVar.a.scheduleWithFixedDelay(new hbv(huqVar, i4), 0L, 33L, TimeUnit.MILLISECONDS);
        our ourVar2 = new our();
        ourVar2.d(this.G.dK(new hdg(this, 13), this.g));
        this.an = ourVar2;
        htv htvVar = this.K;
        if (!htvVar.f()) {
            G();
        }
        huc hucVar = this.M;
        jsv.J(hucVar.l != null, hucVar.g);
        our ourVar3 = new our();
        hdg hdgVar2 = new hdg(hucVar, 15);
        owf owfVar = hucVar.c;
        out outVar = hucVar.f;
        ourVar3.d(owfVar.dK(hdgVar2, outVar));
        int i6 = 16;
        hdg hdgVar3 = new hdg(hucVar, i6);
        owf owfVar2 = hucVar.e;
        ourVar3.d(owfVar2.dK(hdgVar3, outVar));
        owf owfVar3 = hucVar.b;
        int i7 = 17;
        ourVar3.d(owl.a(owfVar2, owb.a(owfVar3)).dK(new hdg(hucVar, i7), outVar));
        ourVar3.d(hucVar.h.dK(new hdg(hucVar, 18), outVar));
        hucVar.t = ourVar3;
        hucVar.g();
        if (i == 2) {
            Object objDL = owfVar3.dL();
            objDL.getClass();
            if (huc.i((mxj) objDL)) {
                hbv hbvVar = new hbv(hucVar, i3);
                hucVar.u.j(hbvVar);
                our ourVar4 = hucVar.t;
                if (ourVar4 != null) {
                    ourVar4.d(new hty(hucVar, hbvVar, i2));
                }
            } else {
                hbv hbvVar2 = new hbv(hucVar, i7);
                hucVar.u.s.D.add(hbvVar2);
                our ourVar5 = hucVar.t;
                if (ourVar5 != null) {
                    ourVar5.d(new hty(hucVar, hbvVar2, i5));
                }
            }
        } else {
            hucVar.e(false);
        }
        ConstraintLayout constraintLayout = hucVar.l;
        if (constraintLayout == null) {
            ujp.c("container");
            constraintLayout = null;
        }
        constraintLayout.setOnClickListener(new fvr(hucVar, i6));
        htvVar.m = hucVar;
        ktx ktxVar = this.at;
        this.ap = ktxVar.e;
        ktxVar.j(true);
    }

    @Override // defpackage.fqf
    public final rwc a() {
        return rwc.i(this.O);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, owf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.uhb r11) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hti.b(uhb):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        Rect rect;
        Rect rect2;
        Rect rect3;
        hui huiVar;
        pfu pfuVarH;
        huk hukVar = this.ah;
        hukVar.b++;
        if (hukVar.c) {
            tpc tpcVarM = stj.a.m();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stj stjVar = (stj) tpcVarM.b;
            stjVar.b |= 8;
            stjVar.f = 1;
            tph tphVarL = tpcVarM.l();
            tphVarL.getClass();
            hukVar.d.f((stj) tphVarL);
        }
        if (((Boolean) this.G.dL()).booleanValue()) {
            this.l.n();
        } else {
            this.l.m();
        }
        fvu fvuVar = this.ab;
        fvuVar.a.p(sbv.o(fvo.LEFT, fvuVar.d(), fvo.CENTER_LEFT, rwc.j(fvuVar.c)), true);
        mzz mzzVar = this.aa;
        mzzVar.w(true);
        mzzVar.m(true);
        if (this.aw.p(gzo.bJ)) {
            this.J.h(this);
        }
        this.ar.j();
        this.at.k(getClass());
        this.N.c(R.raw.panorama_stop);
        gzi gziVar = gzp.a;
        this.o.a(hvb.a);
        this.ae.a(false);
        jth jthVar = this.O;
        if (jthVar != null && (pfuVarH = jthVar.h()) != null) {
            pfuVarH.q(false, false, true);
        }
        htv htvVar = this.K;
        huc hucVar = this.M;
        Bitmap bitmapCreateBitmap = (hucVar.o != null && ((rect = hucVar.p) == null || rect.width() != 0) && (((rect2 = hucVar.p) == null || rect2.height() != 0) && (rect3 = hucVar.p) != null)) ? Bitmap.createBitmap(hucVar.w.E(hucVar.o), rect3.left, rect3.top, rect3.width(), rect3.height()) : null;
        htvVar.d.a(-1);
        if (bitmapCreateBitmap != null && (huiVar = htvVar.f) != null) {
            gga ggaVar = huiVar.y;
            lss lssVar = ggaVar != null ? ggaVar.b : null;
            if (lssVar == null) {
                ((sgt) hui.a.c().M(1600)).s("Capture session is null. Aborting.");
            } else {
                lssVar.ae(bitmapCreateBitmap, huiVar.h.b.e);
            }
        }
        hui huiVar2 = htvVar.f;
        if (huiVar2 != null) {
            huiVar2.close();
        }
        htvVar.f = null;
        htvVar.d();
        ImageView imageView = hucVar.m;
        if (imageView == null) {
            ujp.c("livePreview");
            imageView = null;
        }
        imageView.setImageDrawable(null);
        hucVar.h(1);
        paq paqVar = this.A;
        if (paqVar != null) {
            paqVar.close();
        }
        G();
        this.e.g();
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        e(false);
    }

    public final void d() {
        if (this.K.f()) {
            return;
        }
        if (((Boolean) this.G.dL()).booleanValue()) {
            this.L.a(this.E);
        } else {
            this.L.a(this.D);
        }
    }

    public final void e(boolean z) {
        if (this.t) {
            this.P.h(z, false);
        }
    }

    @Override // defpackage.fqf
    protected final void eA() {
        p();
    }

    @Override // defpackage.fqf
    public final void eB() {
        pbp pbpVarA = this.i.a("Panorama#reconfigureCamera");
        g();
        jtg jtgVarA = this.aq.a(this.X, this.Z, nkw.SERENGETI);
        this.ao = jtgVarA;
        ske.W(jtgVarA, new fpc(this, pbpVarA, 6), this.g);
    }

    @Override // defpackage.fqf
    protected final void eC() {
        C(3);
    }

    public final void f(boolean z) {
        this.as.g(z, R.drawable.gs_clear_night_vd_theme_24, R.string.night_sight, "Serengeti", krs.NIGHT_FRONT_PHOTO_FLASH);
    }

    @Override // defpackage.fqf
    protected final void l() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        tpc tpcVar = this.ah.e;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        stj stjVar = (stj) tpcVar.b;
        stj stjVar2 = stj.a;
        stjVar.b |= 1;
        stjVar.c = jCurrentTimeMillis;
        gzi gziVar = gzp.a;
        this.ai.a = new hte(this);
        our ourVar = new our();
        und undVarJ = ung.j(this.am.plus(new upi()));
        int i = 11;
        byte[] bArr = null;
        ourVar.d(new mpc(undVarJ, i, bArr));
        this.w = undVarJ;
        owf owfVar = this.ag;
        owf owfVarA = owb.a(owfVar);
        hdg hdgVar = new hdg(this, 10);
        out outVar = this.g;
        ourVar.d(owfVarA.dK(hdgVar, outVar));
        ndj ndjVar = this.l;
        ourVar.d(ndjVar.e(this.H));
        this.m.b(this.R);
        hup hupVar = this.e;
        hupVar.O = this.ax;
        this.Q = hupVar;
        this.q.b();
        ndjVar.az(ltw.OFF);
        this.K.o = new AmbientModeSupport.AmbientController(this, bArr);
        ourVar.d(new gge(this, 17));
        this.v = ourVar;
        gnt gntVar = this.X;
        if (gntVar.j()) {
            gntVar.g();
        }
        luj lujVar = this.au;
        ourVar.d(lujVar.a(luf.M).dK(new hdg(this, i), outVar));
        ourVar.d(owl.a(owfVar, lujVar.a(luf.N)).dK(new htf(this, 0), sxo.a));
        ourVar.d(owb.a(this.ak).dK(new hdg(this, 12), outVar));
        if (this.aw.p(gzo.bJ)) {
            muu muuVar = this.J;
            muuVar.g(rbb.c, R.string.serengeti_help_button_accessibility, R.string.mode_panorama, false);
            muuVar.h(this);
            ourVar.d(new gge(this, 18));
        }
        gzi gziVar2 = han.a;
        eB();
    }

    @Override // defpackage.fqf
    protected final void m() {
        huk hukVar = this.ah;
        tpc tpcVar = hukVar.e;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        stj stjVar = (stj) tpcVar.b;
        stj stjVar2 = stj.a;
        stjVar.b |= 2;
        stjVar.d = jCurrentTimeMillis;
        int i = hukVar.a;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        tph tphVar = tpcVar.b;
        stj stjVar3 = (stj) tphVar;
        stjVar3.b |= 4;
        stjVar3.e = i;
        int i2 = hukVar.b;
        if (!tphVar.C()) {
            tpcVar.o();
        }
        stj stjVar4 = (stj) tpcVar.b;
        stjVar4.b |= 8;
        stjVar4.f = i2;
        tph tphVarL = tpcVar.l();
        tphVarL.getClass();
        hukVar.d.f((stj) tphVarL);
        gzi gziVar = gzp.a;
        this.ai.c();
        g();
        this.Z.d();
        our ourVar = this.v;
        if (ourVar != null) {
            ourVar.close();
        }
    }

    @Override // defpackage.fqf
    public final boolean o() {
        if (!this.K.f()) {
            return false;
        }
        c();
        return true;
    }

    @Override // defpackage.fqf
    protected final void p() {
        htv htvVar = this.K;
        if (htvVar.f()) {
            c();
        }
        huc hucVar = this.M;
        if (hucVar.l != null) {
            our ourVar = hucVar.t;
            if (ourVar != null) {
                ourVar.close();
            }
            hucVar.t = null;
            ConstraintLayout constraintLayout = hucVar.l;
            if (constraintLayout == null) {
                ujp.c("container");
                constraintLayout = null;
            }
            constraintLayout.setVisibility(8);
            hucVar.d(false);
            ConstraintLayout constraintLayout2 = hucVar.l;
            if (constraintLayout2 == null) {
                ujp.c("container");
                constraintLayout2 = null;
            }
            constraintLayout2.setOnClickListener(null);
            View view = hucVar.r;
            if (view == null) {
                ujp.c("ghostViewfinderContainer");
                view = null;
            }
            view.setVisibility(4);
            View view2 = hucVar.n;
            if (view2 == null) {
                ujp.c("background");
                view2 = null;
            }
            view2.setAlpha(0.0f);
            ImageView imageView = hucVar.m;
            if (imageView == null) {
                ujp.c("livePreview");
                imageView = null;
            }
            imageView.setImageDrawable(null);
        }
        htvVar.m = null;
        huq huqVar = this.d;
        ScheduledFuture scheduledFuture = huqVar.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        huqVar.d = null;
        this.aj.removeView(this.Y);
        hup hupVar = this.e;
        hvg hvgVar = hupVar.K;
        hvgVar.a.unregisterListener(hvgVar);
        hupVar.L.i(hupVar.i);
        our ourVar2 = hupVar.h;
        if (ourVar2 != null) {
            ourVar2.close();
        }
        hupVar.h = null;
        htk htkVar = hupVar.I;
        if (htkVar != null) {
            htkVar.a();
        }
        k();
        our ourVar3 = this.an;
        if (ourVar3 != null) {
            ourVar3.close();
        }
        this.l.x();
        this.at.j(this.ap);
    }
}
