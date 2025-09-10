package com.google.android.apps.camera.ui.hotshot;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import android.speech.tts.TextToSpeech;
import android.util.Range;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import com.google.android.apps.camera.ui.hotshot.jni.ObjectInfo;
import com.google.android.apps.camera.ui.hotshot.logging.HotshotUsage;
import com.google.android.material.button.xlT.JvFFEwFNdCrxf;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import defpackage.cxb;
import defpackage.emz;
import defpackage.fdq;
import defpackage.gnt;
import defpackage.gzt;
import defpackage.hbj;
import defpackage.hfo;
import defpackage.hjb;
import defpackage.hjc;
import defpackage.imi;
import defpackage.itl;
import defpackage.ito;
import defpackage.jfb;
import defpackage.krj;
import defpackage.ktu;
import defpackage.ktx;
import defpackage.loe;
import defpackage.lor;
import defpackage.luf;
import defpackage.luj;
import defpackage.lvq;
import defpackage.mbj;
import defpackage.mbl;
import defpackage.mdn;
import defpackage.mix;
import defpackage.mtd;
import defpackage.mub;
import defpackage.muw;
import defpackage.muy;
import defpackage.muz;
import defpackage.mva;
import defpackage.mvk;
import defpackage.mvp;
import defpackage.mvq;
import defpackage.mvr;
import defpackage.mvs;
import defpackage.mvt;
import defpackage.mvz;
import defpackage.mwb;
import defpackage.mwc;
import defpackage.mwd;
import defpackage.mwe;
import defpackage.mwj;
import defpackage.mwk;
import defpackage.mwl;
import defpackage.mwn;
import defpackage.mwq;
import defpackage.myl;
import defpackage.nan;
import defpackage.ndj;
import defpackage.nkw;
import defpackage.our;
import defpackage.out;
import defpackage.ovx;
import defpackage.owf;
import defpackage.owq;
import defpackage.paq;
import defpackage.pas;
import defpackage.pau;
import defpackage.pbn;
import defpackage.rwc;
import defpackage.sbp;
import defpackage.sex;
import defpackage.sgt;
import defpackage.sgv;
import defpackage.squ;
import defpackage.tpc;
import defpackage.tph;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HotshotController {
    public static final sgv a = sgv.g("com.google.android.apps.camera.ui.hotshot.HotshotController");
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public Runnable A;
    public int B;
    public boolean C;
    public boolean D;
    public mwd E;
    public mwd F;
    public long G;
    public long H;
    public Rect I;
    public long J;
    public List K;
    public mwj L;
    public boolean M;
    public long N;
    public int O;
    public boolean P;
    public long Q;
    public nan R;
    public boolean S;
    public boolean T;
    public final mbj U;
    public final mvk V;
    public final krj W;
    public final luj X;
    public final ktx Y;
    private final List Z = new ArrayList();
    private final fdq aA;
    private final mwq aB;
    private final cxb aC;
    private final owf aa;
    private final paq ab;
    private final owq ac;
    private final List ad;
    private final owf ae;
    private final owq af;
    private final pbn ag;
    private final mva ah;
    private final itl ai;
    private final owf aj;
    private final owf ak;
    private final AtomicBoolean al;
    private final boolean am;
    private final boolean an;
    private boolean ao;
    private boolean ap;
    private ScheduledFuture aq;
    private int ar;
    private long as;
    private long at;
    private View.AccessibilityDelegate au;
    private int av;
    private int aw;
    private Sensor ax;
    private int ay;
    private SensorEventListener az;
    public final AccessibilityManager c;
    public final gnt d;
    public final Context e;
    public final hjb f;
    public final owq g;
    public final mwn h;
    public final out i;
    public final myl j;
    public final owq k;
    public final ScheduledExecutorService l;
    public final owf m;
    public final owf n;
    public final owq o;
    public final owq p;
    public final AccessibilityManager.TouchExplorationStateChangeListener q;
    public final mwb r;
    public final mwc s;
    public final owf t;
    public final ito u;
    public final AtomicBoolean v;
    public final HotshotUsage w;
    public final Object x;
    public final List y;
    public final boolean z;

    static {
        Range.create(3, 4);
    }

    public HotshotController(Context context, owf owfVar, mwn mwnVar, mbj mbjVar, AccessibilityManager accessibilityManager, hbj hbjVar, luj lujVar, hjb hjbVar, owq owqVar, gnt gntVar, mvk mvkVar, krj krjVar, ndj ndjVar, ScheduledExecutorService scheduledExecutorService, owf owfVar2, owf owfVar3, fdq fdqVar, owq owqVar2, ktx ktxVar, owq owqVar3, myl mylVar, owq owqVar4, cxb cxbVar, owf owfVar4, out outVar, owq owqVar5, pbn pbnVar, mwb mwbVar, mwc mwcVar, owf owfVar5, mva mvaVar, imi imiVar, itl itlVar, lvq lvqVar, owf owfVar6, mwq mwqVar, owf owfVar7) {
        int i = sbp.d;
        this.p = new ovx(mwj.a(sex.a));
        this.ad = new ArrayList();
        new AtomicBoolean(false);
        this.v = new AtomicBoolean(false);
        new AtomicBoolean(false);
        this.al = new AtomicBoolean(false);
        this.w = new HotshotUsage();
        this.x = new Object();
        this.y = new ArrayList();
        this.ao = false;
        this.B = 10;
        this.ap = false;
        this.C = false;
        this.D = false;
        mwd mwdVar = mwd.IDLE;
        this.E = mwdVar;
        this.F = mwdVar;
        this.G = 0L;
        this.ar = 0;
        this.as = 0L;
        this.H = Long.MAX_VALUE;
        this.I = new Rect(0, 0, 0, 0);
        this.at = 0L;
        this.K = new ArrayList();
        this.av = 0;
        this.aw = 0;
        this.M = false;
        this.N = 0L;
        this.O = 0;
        this.P = false;
        this.ay = 0;
        this.Q = 0L;
        this.S = false;
        this.T = false;
        Optional.empty();
        this.e = context;
        this.aa = owfVar;
        this.h = mwnVar;
        this.U = mbjVar;
        this.c = accessibilityManager;
        this.X = lujVar;
        this.f = hjbVar;
        this.i = outVar;
        mwnVar.d = owqVar;
        rwc rwcVar = mwnVar.b;
        if (rwcVar.h()) {
            ((HotshotView) rwcVar.c()).k = owqVar;
        }
        rwc rwcVar2 = mwnVar.b;
        if (rwcVar2.h()) {
            HotshotView hotshotView = (HotshotView) rwcVar2.c();
            if (!hotshotView.d) {
                hotshotView.d = true;
            }
        }
        hjbVar.r = owqVar;
        this.d = gntVar;
        this.W = krjVar;
        this.j = mylVar;
        this.V = mvkVar;
        this.k = owqVar;
        this.l = scheduledExecutorService;
        this.m = owfVar2;
        this.n = owfVar3;
        this.aA = fdqVar;
        this.g = owqVar2;
        this.Y = ktxVar;
        this.o = owqVar3;
        this.ac = owqVar4;
        this.aC = cxbVar;
        this.ae = owfVar4;
        this.af = owqVar5;
        this.ag = pbnVar;
        this.r = mwbVar;
        this.s = mwcVar;
        this.t = owfVar5;
        this.ah = mvaVar;
        this.ai = itlVar;
        this.aj = owfVar6;
        this.aB = mwqVar;
        this.ak = owfVar7;
        this.am = hbjVar.p(gzt.a);
        boolean zP = hbjVar.p(gzt.b);
        this.z = zP;
        this.an = hbjVar.p(gzt.c);
        b.set(false);
        mvkVar.a.f(new mvq(mvkVar, ndjVar));
        if (zP) {
            fdqVar.j().d(owqVar2.dK(new pau() { // from class: mvo
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:182:0x04e2  */
                /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0128  */
                @Override // defpackage.pau
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void a(java.lang.Object r25) {
                    /*
                        Method dump skipped, instructions count: 1280
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mvo.a(java.lang.Object):void");
                }
            }, outVar));
        }
        fdqVar.j().d(owfVar3.dK(new mix(this, 11), scheduledExecutorService));
        mvp mvpVar = new mvp(this, 0);
        this.q = mvpVar;
        accessibilityManager.addTouchExplorationStateChangeListener(mvpVar);
        loe loeVar = new loe(this, accessibilityManager, 5);
        this.ab = loeVar;
        fdqVar.j().d(loeVar);
        fdqVar.j().d(owqVar4.dK(new mix(this, 12), scheduledExecutorService));
        fdqVar.j().d(lujVar.a(luf.q).dK(new mtd(this, 9), scheduledExecutorService));
        this.u = new mvr(this, accessibilityManager, lvqVar, context, imiVar);
        fdqVar.j().d(new ktu(this, itlVar, 14, (byte[]) null));
        fdqVar.j().d(owfVar6.dK(new mix(this, 13), scheduledExecutorService));
    }

    private final void A() {
        this.g.a(Optional.of(mwq.b(0, 0, new Rect(0, 0, 0, 0), sbp.k(new ObjectInfo[0]))));
    }

    private final void B(boolean z, String str) {
        if (z) {
            this.ag.h(str);
        }
    }

    private final void C(mwj mwjVar) {
        this.av = mwjVar.c;
        sbp sbpVar = mwjVar.a;
        this.aw = sbpVar.size();
        List list = this.ad;
        list.clear();
        int i = this.av;
        if (i == 1) {
            list.add((mwk) sbpVar.get(0));
            return;
        }
        if (i > 1) {
            int size = sbpVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                mwk mwkVar = (mwk) sbpVar.get(i2);
                if (mwkVar.a.a.a()) {
                    list.add(mwkVar);
                }
            }
        }
    }

    private final boolean D() {
        if (!this.z) {
            int iN = this.f.n();
            boolean z = iN == 2;
            if (iN != 0) {
                return z;
            }
            throw null;
        }
        sbp sbpVar = ((mwj) ((ovx) this.p).d).a;
        if (sbpVar.isEmpty()) {
            return false;
        }
        float f = true != this.d.i() ? 42.0f : 55.0f;
        if (this.E.equals(mwd.FACE_TOO_CLOSE)) {
            f -= 3.0f;
        }
        return ((mwk) sbpVar.get(0)).c >= f;
    }

    private final boolean E() {
        float f;
        float f2;
        if (!this.z) {
            int iN = this.f.n();
            boolean z = iN == 4;
            if (iN != 0) {
                return z;
            }
            throw null;
        }
        sbp sbpVar = ((mwj) ((ovx) this.p).d).a;
        if (sbpVar.isEmpty()) {
            return false;
        }
        gnt gntVar = this.d;
        if (gntVar.i() && ((mwk) sbpVar.get(0)).a.a.equals(muz.FACE)) {
            f2 = 0.2f;
            f = 1.0f;
        } else {
            f = true != gntVar.i() ? 3.5f : 3.0f;
            f2 = 3.0f;
        }
        if (!this.E.equals(mwd.READY_TO_CAPTURE)) {
            f += f2;
        }
        return ((mwk) sbpVar.get(0)).c <= f;
    }

    private void dumpDetectedObjectGroupInHotshotView(mwj mwjVar) {
        sbp sbpVar = mwjVar.a;
        sbpVar.size();
        muy muyVar = mwjVar.b;
        int i = mwjVar.c;
        int i2 = mwjVar.d;
        for (int i3 = 0; i3 < sbpVar.size(); i3++) {
            sbpVar.get(i3);
        }
    }

    private void dumpObjectDetectionResult(mwq mwqVar) {
        mwqVar.a().size();
        Object obj = mwqVar.a;
        for (int i = 0; i < mwqVar.a().size(); i++) {
            mwqVar.a().get(i);
        }
    }

    public static final void y(List list, int i, int i2) {
        mwk mwkVar = (mwk) list.get(i);
        muw muwVar = new muw(mwkVar.a);
        muwVar.b(i2);
        list.set(i, new mwk(muwVar.a(), mwkVar.b, mwkVar.c, mwkVar.d, mwkVar.e));
    }

    private final void z() {
        this.av = 0;
        this.aw = 0;
        this.ad.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mwd a(float r18) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.ui.hotshot.HotshotController.a(float):mwd");
    }

    public void abortImageCaption() {
    }

    public final void c() {
        this.ay++;
        if (this.z) {
            this.f.d(this.e.getString(R.string.hotshot_cancel_countdown_for_objects), hjc.CANCEL_COUNTDOWN.u);
        } else if (this.h.b.h()) {
            this.aB.h(this.e.getString(R.string.hotshot_cancel_countdown));
        }
    }

    public final void d(mwd mwdVar) {
        mwdVar.equals(mwd.READY_TO_CAPTURE);
        Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            ((mwe) it.next()).g(mwdVar);
        }
    }

    public final void e(mwe mweVar) {
        List list = this.Z;
        if (list.contains(mweVar)) {
            return;
        }
        list.add(mweVar);
    }

    public final void f() {
        boolean z = !((mbl) this.ak.dL()).equals(mbl.STATE_ENABLED);
        this.T = z;
        this.f.i(z);
    }

    public final void g() {
        HotshotUsage hotshotUsage = this.w;
        hotshotUsage.c();
        hotshotUsage.b();
        z();
        this.ay = 0;
        this.Q = 0L;
    }

    public final void h(List list) {
        this.K = list;
        if (this.au == null) {
            this.au = new mvs(this, list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAccessibilityDelegate(this.au);
        }
    }

    public final void i(View view) {
        if (this.A == null) {
            this.A = new lor(this, view, 11, (char[]) null);
        }
        view.postDelayed(this.A, 450L);
    }

    public final void j(boolean z) {
        this.ap = z;
        if (!this.ao) {
            fdq fdqVar = this.aA;
            owf owfVar = this.ae;
            our ourVarJ = fdqVar.j();
            mix mixVar = new mix(this, 14);
            ScheduledExecutorService scheduledExecutorService = this.l;
            ourVarJ.d(owfVar.dK(mixVar, scheduledExecutorService));
            fdqVar.j().d(this.ak.dK(new mix(this, 15), scheduledExecutorService));
            this.ao = true;
        }
        if (z) {
            HotshotUsage hotshotUsage = this.w;
            hotshotUsage.d = Instant.now();
            hotshotUsage.b();
            return;
        }
        HotshotUsage hotshotUsage2 = this.w;
        if (hotshotUsage2.d()) {
            hotshotUsage2.c();
            hotshotUsage2.a();
            hotshotUsage2.d = Instant.MAX;
            hotshotUsage2.b.clear();
        }
    }

    public final void l(pas pasVar) {
        rwc rwcVar = this.h.b;
        if (!rwcVar.h()) {
            ((sgt) mwn.a.b().M(5108)).s("setPreviewSize, view is not present.");
        } else if (pasVar == null) {
            ((sgt) mwn.a.b().M(5107)).s("previewSize is null");
        } else {
            ((hfo) rwcVar.c()).e.b(pasVar);
        }
    }

    public final void m() {
        pbn pbnVar = this.ag;
        pbnVar.f("startHotshot#resetProp");
        A();
        pbnVar.g();
        if (this.ap) {
            boolean z = true;
            if (!u(true)) {
                if (!v() || this.c.isTouchExplorationEnabled()) {
                    return;
                }
                mva mvaVar = this.ah;
                if (mvaVar.a() || mvaVar.b()) {
                    this.i.execute(new mub(this, 7));
                    return;
                }
                return;
            }
            AtomicBoolean atomicBoolean = b;
            if (atomicBoolean.get()) {
                r(this.K);
                if (this.z) {
                    this.f.j(this.c.isTouchExplorationEnabled());
                }
                if ((!this.d.j() || ((Boolean) this.aj.dL()).booleanValue()) && !((Boolean) this.n.dL()).booleanValue()) {
                    z = false;
                }
                k(z);
                return;
            }
            atomicBoolean.set(true);
            this.i.execute(new mub(this, 8));
            hjb hjbVar = this.f;
            hjbVar.k = true;
            hjbVar.l = true;
            hjbVar.q = mwd.IDLE;
            boolean z2 = this.z;
            if (z2) {
                hjbVar.j(this.c.isTouchExplorationEnabled());
                if (hjbVar.t.isEmpty()) {
                    hjbVar.t = Optional.of(((mvz) hjbVar.e).a());
                    ((TextToSpeech) hjbVar.t.get()).setOnUtteranceProgressListener(hjbVar.f);
                    hjbVar.j(hjbVar.x);
                }
                hjbVar.i(false);
            }
            f();
            this.J = Long.MAX_VALUE;
            this.aq = this.l.scheduleWithFixedDelay(new Runnable() { // from class: mvl
                /* JADX WARN: Removed duplicated region for block: B:254:0x053e  */
                /* JADX WARN: Removed duplicated region for block: B:278:0x0593  */
                /* JADX WARN: Removed duplicated region for block: B:284:0x05a4  */
                /* JADX WARN: Removed duplicated region for block: B:285:0x05a8  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() throws android.content.res.Resources.NotFoundException {
                    /*
                        Method dump skipped, instructions count: 1606
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mvl.run():void");
                }
            }, 0L, true != z2 ? 30L : 50L, TimeUnit.MILLISECONDS);
            if ((!this.d.j() || ((Boolean) this.aj.dL()).booleanValue()) && !((Boolean) this.n.dL()).booleanValue()) {
                z = false;
            }
            k(z);
            this.H = SystemClock.elapsedRealtime();
            this.ay = 0;
            this.Q = 0L;
            r(this.K);
            if (z2) {
                if (this.ax == null) {
                    this.ax = this.aC.z().getDefaultSensor(4);
                }
                if (this.az == null) {
                    this.az = new jfb(this, 3);
                }
                if (this.ax == null || this.az == null) {
                    ((sgt) a.c().M(5088)).s("Gyro sensor is null.");
                } else {
                    this.aC.z().registerListener(this.az, this.ax, 3);
                }
            }
            this.ai.f(this.u);
        }
    }

    public final void n() {
        A();
        this.S = false;
        AtomicBoolean atomicBoolean = b;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            mwn mwnVar = this.h;
            mwnVar.c = false;
            mwnVar.c(false);
            mwnVar.d.a(new mwl[0]);
            rwc rwcVar = mwnVar.b;
            if (rwcVar.h()) {
                ((HotshotView) rwcVar.c()).j = true;
            }
            hjb hjbVar = this.f;
            hjbVar.k = false;
            if (hjbVar.t.isPresent()) {
                ((TextToSpeech) hjbVar.t.get()).stop();
                ((TextToSpeech) hjbVar.t.get()).shutdown();
                hjbVar.t = Optional.empty();
            }
            hjbVar.m = false;
            hjbVar.n = false;
            this.E = mwd.IDLE;
            this.H = Long.MAX_VALUE;
            if (this.D) {
                hjbVar.h();
                this.D = false;
            }
            ScheduledFuture scheduledFuture = this.aq;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.o.a(mvt.STOP);
            if (this.ax != null) {
                this.aC.z().unregisterListener(this.az, this.ax);
            }
            if (v()) {
                mwb mwbVar = this.r;
                mwbVar.a.a(mwbVar.b);
                mwbVar.e = false;
                mwbVar.d = false;
                mwbVar.c = Optional.empty();
            }
            this.ai.h(this.u);
        }
    }

    public final void o() {
        if (this.ap) {
            this.l.execute(new mub(this, 9));
        }
    }

    public final void p(mwe mweVar) {
        this.Z.remove(mweVar);
    }

    public final void q() {
        mvk mvkVar;
        myl mylVar;
        out outVar;
        owq owqVar;
        krj krjVar = this.W;
        if (krjVar == null || (mvkVar = this.V) == null || (mylVar = this.j) == null || this.h == null || (outVar = this.i) == null || (owqVar = this.o) == null) {
            return;
        }
        mvt mvtVar = (mvt) owqVar.dL();
        boolean z = true;
        if (!krjVar.t() && !mvkVar.a() && !mylVar.g() && !mvtVar.equals(mvt.PAUSE) && !mvtVar.equals(mvt.STOP)) {
            z = false;
        }
        outVar.execute(new emz(this, z, 14, (char[]) null));
    }

    public final void r(List list) {
        mvt mvtVar;
        if (this.al.get()) {
            this.o.a(mvt.PAUSE);
            A();
            return;
        }
        if (list.isEmpty() || !this.z || (v() && !this.c.isTouchExplorationEnabled())) {
            owq owqVar = this.o;
            if (w()) {
                mvtVar = mvt.b;
            } else {
                if (v()) {
                    this.c.isTouchExplorationEnabled();
                }
                mvtVar = mvt.START;
            }
            owqVar.a(mvtVar);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((View) it.next()).isAccessibilityFocused()) {
                this.o.a(w() ? mvt.b : mvt.START);
                return;
            }
        }
        this.o.a(mvt.PAUSE);
        A();
    }

    public final boolean s() {
        return b.get();
    }

    public final boolean t() {
        return u(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(boolean r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L9
            pbn r0 = r8.ag
            java.lang.String r1 = "isSupportHotshot#getAppMode"
            r0.f(r1)
        L9:
            owf r0 = r8.aa
            java.lang.Object r0 = r0.dL()
            nkw r0 = (defpackage.nkw) r0
            nkw r1 = defpackage.nkw.PHOTO
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L1e
            nkw r1 = defpackage.nkw.PORTRAIT
            if (r0 != r1) goto L1c
            goto L1e
        L1c:
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            java.lang.String r1 = "isSupportHotshot#checkCamFacing"
            r8.B(r9, r1)
            boolean r1 = r8.z
            if (r1 != 0) goto L41
            gnt r1 = r8.d
            boolean r1 = r1.j()
            if (r1 != 0) goto L41
            owf r1 = r8.n
            java.lang.Object r1 = r1.dL()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L3f
            goto L41
        L3f:
            r1 = r3
            goto L42
        L41:
            r1 = r2
        L42:
            java.lang.String r4 = "isSupportHotshot#checkA11yManager"
            r8.B(r9, r4)
            android.view.accessibility.AccessibilityManager r4 = r8.c
            boolean r5 = r4.isTouchExplorationEnabled()
            if (r5 != 0) goto L57
            boolean r5 = r8.v()
            if (r5 != 0) goto L57
            r5 = r3
            goto L58
        L57:
            r5 = r2
        L58:
            java.lang.String r6 = "isSupportHotshot#checkCountdown"
            r8.B(r9, r6)
            owq r6 = r8.ac
            java.lang.Object r6 = r6.dL()
            ltw r6 = (defpackage.ltw) r6
            ltw r7 = defpackage.ltw.OFF
            boolean r6 = r6.equals(r7)
            java.lang.String r7 = "isSupportHotshot#checkSettings"
            r8.B(r9, r7)
            if (r5 == 0) goto Lb7
            boolean r5 = r8.am
            if (r5 == 0) goto Lb7
            boolean r5 = r8.v()
            if (r5 == 0) goto La0
            boolean r4 = r4.isTouchExplorationEnabled()
            if (r4 == 0) goto L91
            luj r4 = r8.X
            lur r5 = defpackage.luf.p
            java.lang.Object r4 = r4.b(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            goto Lae
        L91:
            luj r4 = r8.X
            lur r5 = defpackage.luf.q
            java.lang.Object r4 = r4.b(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            goto Lae
        La0:
            luj r4 = r8.X
            lur r5 = defpackage.luf.p
            java.lang.Object r4 = r4.b(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
        Lae:
            if (r4 == 0) goto Lb7
            if (r0 == 0) goto Lb7
            if (r1 == 0) goto Lb7
            if (r6 == 0) goto Lb7
            goto Lb8
        Lb7:
            r2 = r3
        Lb8:
            java.lang.String r0 = "isSupportHotshot#updateSupported"
            r8.B(r9, r0)
            owq r9 = r8.af
            java.lang.Object r0 = r9.dL()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r2 == r0) goto Ld2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r9.a(r0)
        Ld2:
            pbn r8 = r8.ag
            r8.g()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.ui.hotshot.HotshotController.u(boolean):boolean");
    }

    public final boolean v() {
        return this.an;
    }

    public final boolean w() {
        if (!t()) {
            return false;
        }
        if (!this.z || ((Boolean) this.ae.dL()).booleanValue()) {
            return true;
        }
        return ((nkw) this.aa.dL()).equals(nkw.PORTRAIT);
    }

    public final int x() {
        if (t()) {
            return this.c.isTouchExplorationEnabled() ? 3 : 2;
        }
        return 1;
    }

    public final squ b() {
        String string;
        int i;
        mwj mwjVar = (mwj) ((ovx) this.p).d;
        sbp sbpVar = mwjVar.a;
        int iCount = (int) Collection.EL.stream(sbpVar).filter(new mdn(4)).count();
        String str = !sbpVar.isEmpty() ? ((mwk) sbpVar.get(0)).a.a.al : mNLbzhCxd.VpVDYMpraPLC;
        synchronized (this.x) {
            string = this.y.toString();
        }
        tpc tpcVarM = squ.a.m();
        boolean zT = t();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        squ squVar = (squ) tpcVarM.b;
        squVar.b |= 1;
        squVar.c = zT;
        luj lujVar = this.X;
        boolean zBooleanValue = ((Boolean) lujVar.b(luf.p)).booleanValue();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        squ squVar2 = (squ) tpcVarM.b;
        squVar2.b |= 2;
        squVar2.d = zBooleanValue;
        mwd mwdVar = this.E;
        hjc hjcVar = hjc.UNKNOWN;
        mwd mwdVar2 = mwd.READY_TO_CAPTURE;
        switch (mwdVar) {
            case READY_TO_CAPTURE:
                i = 2;
                break;
            case DISTANCE_1:
                i = 3;
                break;
            case DISTANCE_2:
                i = 4;
                break;
            case DISTANCE_3:
                i = 5;
                break;
            case e:
                i = 6;
                break;
            case IDLE:
            default:
                i = 1;
                break;
            case FACE_TOO_FAR:
                i = 7;
                break;
            case FACE_TOO_CLOSE:
                i = 8;
                break;
            case OBJECT_TILT_UP:
            case OBJECT_TILT_DOWN:
                i = 10;
                break;
            case OBJECT_PAN_LEFT:
            case OBJECT_PAN_RIGHT:
                i = 9;
                break;
        }
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        squ squVar3 = (squ) tphVar;
        squVar3.e = i - 1;
        squVar3.b = 4 | squVar3.b;
        boolean z = this.C;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        squ squVar4 = (squ) tphVar2;
        squVar4.b = 8 | squVar4.b;
        squVar4.f = z;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        squ squVar5 = (squ) tphVar3;
        squVar5.b |= 16;
        squVar5.g = iCount;
        int i2 = mwjVar.c;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        squ squVar6 = (squ) tpcVarM.b;
        squVar6.b |= 32;
        squVar6.h = i2;
        int size = mwjVar.a.size() - i2;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        squ squVar7 = (squ) tpcVarM.b;
        squVar7.b |= 64;
        squVar7.i = size;
        boolean zBooleanValue2 = ((Boolean) lujVar.b(luf.q)).booleanValue();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        squ squVar8 = (squ) tpcVarM.b;
        squVar8.b |= 128;
        squVar8.j = zBooleanValue2;
        boolean zBooleanValue3 = ((Boolean) this.t.dL()).booleanValue();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar4 = tpcVarM.b;
        squ squVar9 = (squ) tphVar4;
        squVar9.b |= 256;
        squVar9.k = zBooleanValue3;
        int i3 = true == this.an ? 3 : 2;
        if (!tphVar4.C()) {
            tpcVarM.o();
        }
        squ squVar10 = (squ) tpcVarM.b;
        squVar10.b |= 512;
        squVar10.l = i3;
        mva mvaVar = this.ah;
        boolean z2 = mvaVar.a.getResources().getConfiguration().fontScale >= 1.3f;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        squ squVar11 = (squ) tpcVarM.b;
        squVar11.b |= 1024;
        squVar11.m = z2;
        boolean zB = mvaVar.b();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        squ squVar12 = (squ) tpcVarM.b;
        squVar12.b |= 4096;
        squVar12.n = zB;
        boolean zA = mvaVar.a();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar5 = tpcVarM.b;
        squ squVar13 = (squ) tphVar5;
        squVar13.b |= 8192;
        squVar13.o = zA;
        int i4 = this.ay;
        if (!tphVar5.C()) {
            tpcVarM.o();
        }
        squ squVar14 = (squ) tpcVarM.b;
        squVar14.b |= 16384;
        squVar14.p = i4;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.Q;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar6 = tpcVarM.b;
        squ squVar15 = (squ) tphVar6;
        squVar15.b |= 32768;
        squVar15.q = (int) jElapsedRealtime;
        if (!tphVar6.C()) {
            tpcVarM.o();
        }
        tph tphVar7 = tpcVarM.b;
        squ squVar16 = (squ) tphVar7;
        str.getClass();
        squVar16.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        squVar16.r = str;
        if (!tphVar7.C()) {
            tpcVarM.o();
        }
        squ squVar17 = (squ) tpcVarM.b;
        string.getClass();
        squVar17.b |= 131072;
        squVar17.s = string;
        return (squ) tpcVarM.l();
    }

    public final void k(boolean z) {
        rwc rwcVar = this.h.b;
        if (rwcVar.h()) {
            ((hfo) rwcVar.c()).e.c(z);
        } else {
            ((sgt) mwn.a.b().M(5106)).s(JvFFEwFNdCrxf.aXQo);
        }
    }
}
