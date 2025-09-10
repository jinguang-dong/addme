package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Vibrator;
import com.google.ar.core.ImageMetadata;
import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ntf implements jfv, nqp, oqf, jhh, jgw, jhf, jhe, jhc, jhg, jgz {
    public final owf A;
    public final owq B;
    public final owq C;
    public boolean E;
    public boolean F;
    public boolean L;
    public int N;
    public final pnk P;
    public final qwz Q;
    private String S;
    private Intent T;
    private HandlerThread U;
    private Handler V;
    private final nti X;
    private final Context Y;
    private final fvu Z;
    private final rwc aa;
    private final jtc ab;
    private final owq ac;
    private final owq ad;
    private final mni ae;
    private final owf af;
    private final boolean ag;
    private paq aj;
    private final mbj ak;
    private final krj al;
    private final mdy am;
    private final hbj an;
    private final gtm ao;
    Runnable i;
    Runnable j;
    public final nss k;
    public final Activity l;
    public final pbn m;
    public final owq n;
    public final gnt p;
    public final ngk q;
    public final ndj r;
    public final msh s;
    public final owq t;
    public final rwc u;
    public final nrc v;
    public final owf w;
    public final Executor x;
    public final sbp y;
    public final owf z;
    public static final sgv a = sgv.g("ntf");
    private static final long[] R = {0, 400};
    public static boolean b = false;
    public static boolean c = false;
    long d = 0;
    public int e = 384;
    boolean f = false;
    public int g = 384;
    public boolean h = false;
    private final Object W = new Object();
    public boolean D = false;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;
    public boolean J = false;
    public boolean K = false;
    public boolean M = false;
    private long ah = -1;
    private int ai = 0;
    final may O = new nte(this);
    public final our o = new our();

    public ntf(Activity activity, Context context, pnk pnkVar, final nss nssVar, owq owqVar, mbj mbjVar, mdy mdyVar, nti ntiVar, gnt gntVar, ngk ngkVar, ndj ndjVar, fvu fvuVar, msh mshVar, owq owqVar2, owq owqVar3, rwc rwcVar, nrc nrcVar, pbn pbnVar, boolean z, sbp sbpVar, jtc jtcVar, owf owfVar, hbj hbjVar, krj krjVar, owf owfVar2, owf owfVar3, owq owqVar4, owq owqVar5, qwz qwzVar, owq owqVar6, mni mniVar, rwc rwcVar2, Executor executor, gtm gtmVar, owf owfVar4) {
        ogd ogdVar;
        this.l = activity;
        this.P = pnkVar;
        this.k = nssVar;
        this.ak = mbjVar;
        this.am = mdyVar;
        this.X = ntiVar;
        this.z = owfVar;
        this.m = pbnVar;
        this.ag = z;
        this.Y = context;
        this.n = owqVar;
        this.p = gntVar;
        this.q = ngkVar;
        this.r = ndjVar;
        this.Z = fvuVar;
        this.s = mshVar;
        this.ac = owqVar3;
        this.t = owqVar2;
        this.u = rwcVar;
        this.aa = rwcVar2;
        this.v = nrcVar;
        this.w = owfVar3;
        this.x = executor;
        this.y = sbpVar;
        this.ab = jtcVar;
        this.an = hbjVar;
        this.B = owqVar4;
        this.C = owqVar6;
        this.ad = owqVar5;
        this.ae = mniVar;
        this.al = krjVar;
        this.A = owfVar2;
        this.Q = qwzVar;
        this.ao = gtmVar;
        this.af = owfVar4;
        odn odnVar = odn.a;
        opu opuVarA = oqi.a(context);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(opuVarA);
        arrayList.addAll(Arrays.asList(new oet[0]));
        synchronized (ogd.c) {
            ojl.az(ogd.d, "Must guarantee manager is non-null before using getInstance");
            ogdVar = ogd.d;
        }
        ofm ofmVar = new ofm(arrayList);
        Handler handler = ogdVar.n;
        handler.sendMessage(handler.obtainMessage(2, ofmVar));
        Object obj = ofmVar.b.a;
        Executor executor2 = oov.a;
        oow oowVar = new oow();
        oow oowVar2 = (oow) obj;
        oowVar2.e.c(new oop(executor2, oowVar));
        oowVar2.n();
        oowVar.m(new ooo() { // from class: ntb
            @Override // defpackage.ooo
            public final void d(Object obj2) {
                sgv sgvVar = ntf.a;
                ((sgt) sgvVar.c().M(5533)).s("Wearable api is available");
                ntf ntfVar = this.a;
                if (ntfVar.U()) {
                    ((sgt) sgvVar.c().M(5534)).s("Launched by wear");
                    ntfVar.D = true;
                    Intent intent = ntfVar.l.getIntent();
                    nssVar.c(intent == null ? "" : intent.getStringExtra("extra_wear_node_id"));
                }
                ntfVar.E = true;
                ntfVar.F = true;
                nss nssVar2 = ntfVar.k;
                nssVar2.d = 1;
                oet oetVar = nssVar2.e;
                IntentFilter intentFilter = new IntentFilter("com.google.android.gms.wearable.MESSAGE_RECEIVED");
                intentFilter.addDataScheme("wear");
                intentFilter.addDataAuthority("*", null);
                ogn ognVarAE = ojl.aE(ntfVar, oetVar.f, "MessageListener");
                ogs ogsVar = new ogs();
                ogsVar.c = ognVarAE;
                ogsVar.a = new opc((oqf) ntfVar, ognVarAE, new IntentFilter[]{intentFilter}, 2);
                ogsVar.b = new ojb(ntfVar, 5);
                ogsVar.f = 24016;
                oetVar.l(ogsVar.a());
                nssVar2.c = new ntc(ntfVar, 2);
                ntfVar.i = new nsz(ntfVar, 14);
                ntfVar.j = new nsz(ntfVar, 15);
                ntfVar.x.execute(new nsz(ntfVar, 16));
                nssVar2.b("/check_status");
                if (ntfVar.D) {
                    ntfVar.M();
                    ntfVar.I(0L);
                }
                our ourVar = ntfVar.o;
                owf owfVar5 = ntfVar.w;
                nta ntaVar = new nta(ntfVar, 0);
                sxo sxoVar = sxo.a;
                ourVar.d(owfVar5.dK(ntaVar, sxoVar));
                ourVar.d(ntfVar.n.dK(new nta(ntfVar, 2), sxoVar));
                ourVar.d(ntfVar.p.b.dK(new nta(ntfVar, 3), sxoVar));
                ourVar.d(ntfVar.A.dK(new nta(ntfVar, 4), sxoVar));
                rwc rwcVar3 = ntfVar.u;
                if (rwcVar3.h()) {
                    ((mac) rwcVar3.c()).a(ntfVar.O);
                }
                ntfVar.K();
                ntfVar.R(true);
            }
        });
        oowVar.j(new ntc(this, 0));
        gzi gziVar = hay.a;
        if (rwcVar2.h()) {
            ((nrf) rwcVar2.c()).e();
            ((nrf) rwcVar2.c()).b();
        }
    }

    private final void W() {
        if (S()) {
            this.X.b.b();
        }
    }

    private final void X() {
        if (this.D && this.an.p(gzo.bv)) {
            F().post(new nsz(this, 10));
        }
    }

    private final void Y() {
        this.S = null;
        this.ah = -1L;
    }

    private final void Z(String str) {
        Y();
        if (this.D) {
            F().post(new mzq(this, str, 17));
        }
    }

    private final void aa() {
        if (this.M) {
            return;
        }
        this.Q.d();
        this.M = true;
    }

    private final void ab() {
        Runnable runnable = this.j;
        if (runnable == null) {
            return;
        }
        F().removeCallbacks(runnable);
        F().postDelayed(runnable, 100L);
    }

    private final void ac() {
        if (S() && V() && !this.J) {
            F().post(new nsz(this, 0));
        }
    }

    private final void ad() {
        if (this.D) {
            F().post(new mzq(this, true != ((Boolean) this.z.dL()).booleanValue() ? "/exit_jupiter" : "/enter_jupiter", 16));
        }
    }

    private final void ae(String str, long j) {
        F().post(new gon(this, str, j, 8));
    }

    private final void af() {
        if (this.D) {
            F().post(new mzq(this, true != T() ? "onPause" : "onResume", 15));
        }
    }

    private final void ag(boolean z) {
        if (this.ag) {
            c = z;
        } else {
            b = z;
        }
    }

    private final void ah(int i) {
        if (ai(true)) {
            if (i <= 0 && this.s.d()) {
                this.r.A();
                return;
            }
            if (this.h) {
                this.r.A();
                return;
            }
            if (i >= 0) {
                mni mniVar = this.ae;
                if (mniVar.k()) {
                    mniVar.h();
                }
                this.t.a(ltw.a(i));
                this.am.A = 2;
                ndj ndjVar = this.r;
                ndjVar.az(ltw.a(i));
                ndjVar.B();
                ndjVar.G(false);
                ndjVar.A();
                krj krjVar = this.al;
                if (krjVar.t()) {
                    krjVar.v(7);
                }
            }
        }
    }

    private final boolean ai(boolean z) {
        boolean z2;
        synchronized (this.W) {
            z2 = false;
            if (T() && (z || this.D)) {
                z2 = true;
            }
        }
        return z2;
    }

    @Override // defpackage.nqp
    public final void A(boolean z) {
        this.K = z;
        if (this.D) {
            F().post(new nsz(this, 11));
        }
    }

    @Override // defpackage.nqp
    public final void B(long j) {
        if (this.D && this.f) {
            this.h = true;
            F().post(new hcv(this, j, 9));
        }
    }

    @Override // defpackage.nqp
    public final void C(long j) {
        if (this.D) {
            F().post(new hcv(this, j, 10));
        }
    }

    @Override // defpackage.nqp
    public final void D(int i) {
        if (this.D) {
            if (i == 150) {
                if (!this.f) {
                    return;
                } else {
                    i = 150;
                }
            }
            F().post(new mzp(this, i, 4));
        }
    }

    public final synchronized Handler F() {
        if (this.V == null) {
            HandlerThread handlerThread = new HandlerThread("WRSListenerV2BG");
            this.U = handlerThread;
            handlerThread.start();
            this.V = new Handler(this.U.getLooper());
        }
        return this.V;
    }

    public final nkw G() {
        return (nkw) this.ac.dL();
    }

    final void H() {
        if (this.D && this.an.p(hay.e)) {
            F().post(new nsz(this, 2));
        }
    }

    public final void I(long j) {
        Runnable runnable = this.i;
        if (!S() || runnable == null || !V() || this.J || this.L) {
            return;
        }
        F().removeCallbacks(runnable);
        if (j <= 0) {
            F().post(runnable);
        } else {
            F().postDelayed(runnable, j);
        }
    }

    final void J() {
        if (S()) {
            if (this.p.a().equals(pka.FRONT)) {
                this.B.a(false);
            }
            F().post(new nsz(this, 4));
        }
    }

    final void K() {
        ((sgt) a.c().M(5579)).s("send configuration to wear");
        ad();
        X();
        H();
        L();
        this.ai = 0;
        Intent intent = this.l.getIntent();
        if (intent == null || intent.equals(this.T)) {
            return;
        }
        this.T = intent;
        if (U()) {
            tpc tpcVar = this.X.i;
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            suj sujVar = (suj) tpcVar.b;
            suj sujVar2 = suj.a;
            sujVar.g = 2;
            sujVar.b |= 128;
            Vibrator vibrator = (Vibrator) this.Y.getSystemService("vibrator");
            if (vibrator == null || !vibrator.hasVibrator()) {
                return;
            }
            vibrator.vibrate(R, -1);
        }
    }

    public final void L() {
        if (this.D) {
            F().post(new ntd(this, 2));
        }
    }

    public final void M() {
        if (this.D) {
            F().post(new nsz(this, 20));
            if (!this.y.isEmpty()) {
                F().post(new ntd(this, 1));
            }
            F().post(new ntd(this, 0));
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [sgt, shi] */
    public final void N(Bitmap bitmap, boolean z) {
        byte[] byteArray;
        try {
            boolean z2 = this.G;
            int i = 65;
            int i2 = true != z ? 65 : 30;
            if (!z2) {
                i = i2;
            } else if (i2 == 30) {
                i = 20;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(this.G ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            ((sgt) ((sgt) a.c().i(e)).M((char) 5583)).s("Error when compressBitmap");
            byteArray = null;
        }
        if (z) {
            bitmap.recycle();
        }
        if (byteArray == null) {
            ((sgt) a.b().M(5582)).s("Compress bitmap failed!");
            return;
        }
        tpc tpcVarM = nqv.a.m();
        toj tojVarQ = toj.q(byteArray);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        ((nqv) tpcVarM.b).b = tojVarQ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        ((nqv) tpcVarM.b).c = jCurrentTimeMillis;
        nqv nqvVar = (nqv) tpcVarM.l();
        String str = true != z ? "/image" : "/preview";
        if (ai(!z)) {
            this.k.d(str, nqvVar.h());
        }
    }

    public final void O() {
        if (S()) {
            F().post(new mvn(this, 12));
        }
        P();
    }

    public final void P() {
        if (S()) {
            int i = this.ai;
            if (i > 0) {
                this.ai = i - 1;
            } else {
                F().post(new nsz(this, 13));
            }
        }
    }

    final void Q() {
        if (this.an.p(hay.h)) {
            F().post(new nsz(this, 5));
        }
    }

    final void R(boolean z) {
        ((sgt) a.c().M(5586)).s("update wear configuration.");
        af();
        if (z) {
            x();
        } else {
            v();
        }
    }

    final boolean S() {
        return ai(false);
    }

    final boolean T() {
        return this.ag ? c : b;
    }

    public final boolean U() {
        Intent intent = this.l.getIntent();
        if (intent == null) {
            return false;
        }
        return intent.getBooleanExtra("extra_launch_fom_wear", false);
    }

    public final boolean V() {
        return this.h ? this.f : this.y.contains(G().name());
    }

    @Override // defpackage.jhc
    public final void ea() {
        Q();
        this.ad.a(true);
        this.J = false;
        this.L = false;
        ag(false);
        this.h = false;
        this.N = 0;
        R(false);
        Y();
    }

    @Override // defpackage.jhe
    public final void eb() {
        ag(true);
        R(true);
        if (this.an.p(hay.h)) {
            if (this.D) {
                Q();
            } else {
                F().post(new nhp(this, 19));
            }
        }
    }

    @Override // defpackage.jhf
    public final void ej() {
        if (this.E) {
            K();
        }
    }

    @Override // defpackage.jhg
    public final void eu() {
        paq paqVar = this.aj;
        if (paqVar != null) {
            paqVar.close();
            this.aj = null;
        }
    }

    @Override // defpackage.nqp
    public final void f() {
        if (this.D && V()) {
            F().post(new nsz(this, 3));
        }
    }

    @Override // defpackage.nqp
    public final void g() {
        if (this.D && V()) {
            F().post(new mvn(this, 11));
        }
    }

    @Override // defpackage.nqp
    public final void h() {
        boolean z = true;
        this.h = true;
        if (!this.f) {
            n();
            return;
        }
        if (!this.D) {
            F().post(new nsz(this, 12));
            return;
        }
        if (!((Boolean) this.C.dL()).booleanValue() && !((Boolean) this.B.dL()).booleanValue()) {
            z = false;
        }
        F().post(new emz(this, z, 16, (char[]) null));
    }

    @Override // defpackage.nqp
    public final void i() {
        this.H = true;
        if (this.D) {
            F().post(new mvn(this, 10));
        }
    }

    @Override // defpackage.nqp
    public final void j() {
        if (this.D) {
            x();
        }
    }

    @Override // defpackage.nqp
    public final void k() {
        this.I = true;
        if (this.D) {
            F().post(new nsz(this, 18));
        }
    }

    @Override // defpackage.nqp
    public final void l() {
        if (S()) {
            F().post(new nsz(this, 8));
        }
    }

    @Override // defpackage.jfv
    public final void m(Intent intent) {
    }

    @Override // defpackage.nqp
    public final void n() {
        if (this.D) {
            if (this.v.b < nrd.WCA_202301_00.h) {
                v();
            } else if (this.D) {
                Z("/mode_unsupported");
            }
        }
    }

    @Override // defpackage.lpz
    public final void o() {
        if (this.D && this.L) {
            this.L = false;
            x();
        }
    }

    @Override // defpackage.lpz
    public final void p() {
        this.L = true;
        n();
    }

    @Override // defpackage.lpz
    public final void q() {
        if (this.D && this.L) {
            this.L = false;
            x();
        }
    }

    @Override // defpackage.nqp
    public final void r() {
        this.h = false;
        if (this.D) {
            if (this.f) {
                F().post(new nsz(this, 9));
            } else {
                j();
            }
        }
    }

    @Override // defpackage.nqp
    public final void s() {
        this.H = false;
        if (this.D) {
            F().post(new nsz(this, 6));
        }
    }

    @Override // defpackage.nqp
    public final void t() {
        this.I = false;
        if (this.D) {
            F().post(new nsz(this, 1));
        }
    }

    @Override // defpackage.nqp
    public final void u() {
        if (S()) {
            F().post(new nhp(this, 20));
        }
    }

    @Override // defpackage.nqp
    public final void v() {
        if (this.D) {
            Z("/mode_exit");
        }
    }

    @Override // defpackage.jgw
    public final void w() {
    }

    @Override // defpackage.nqp
    public final void x() {
        G().name();
        if (this.D) {
            nrc nrcVar = this.v;
            if (nrcVar.b < nrcVar.a(G())) {
                return;
            }
            if (!G().equals(nkw.NIGHT_SIGHT) && this.h) {
                r();
            }
            ac();
            if (!V()) {
                n();
            } else {
                I(0L);
                W();
            }
        }
    }

    @Override // defpackage.nqp
    public final void y(Bitmap bitmap, int i) {
        if (S()) {
            F().post(new ng(this, bitmap, i, 13));
        }
    }

    @Override // defpackage.nqp
    public final void z(boolean z) {
        if (S() && V()) {
            F().post(new emz(this, z, 17, (char[]) null));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0135  */
    /* JADX WARN: Type inference failed for: r0v120, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r0v64, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r14v13, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r14v136, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r14v2, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r14v22, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r14v36, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r14v46, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r14v61, types: [sgt, shi] */
    @Override // defpackage.oqe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.osy r14) {
        /*
            Method dump skipped, instructions count: 1876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntf.a(osy):void");
    }

    @Override // defpackage.jgz
    public final void et() {
        String str;
        nti ntiVar = this.X;
        nth nthVar = ntiVar.b;
        if (nthVar.a() <= 0) {
            ntiVar.a.f("Session is not started. No need to send usage log.");
        } else {
            tpc tpcVar = ntiVar.i;
            long jA = nthVar.a();
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            suj sujVar = (suj) tpcVar.b;
            suj sujVar2 = suj.a;
            sujVar.b |= 1;
            sujVar.c = jA;
            long jA2 = ntiVar.c.a();
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            tph tphVar = tpcVar.b;
            suj sujVar3 = (suj) tphVar;
            sujVar3.b |= 2;
            sujVar3.d = jA2;
            int i = ntiVar.d;
            if (!tphVar.C()) {
                tpcVar.o();
            }
            tph tphVar2 = tpcVar.b;
            suj sujVar4 = (suj) tphVar2;
            sujVar4.b |= 4;
            sujVar4.e = i;
            nqy nqyVar = ntiVar.g;
            if (nqyVar != null) {
                String str2 = nqyVar.b;
                if (!tphVar2.C()) {
                    tpcVar.o();
                }
                tph tphVar3 = tpcVar.b;
                suj sujVar5 = (suj) tphVar3;
                str2.getClass();
                sujVar5.b |= 512;
                sujVar5.i = str2;
                String str3 = ntiVar.g.c;
                if (!tphVar3.C()) {
                    tpcVar.o();
                }
                suj sujVar6 = (suj) tpcVar.b;
                str3.getClass();
                sujVar6.b |= 256;
                sujVar6.h = str3;
            }
            long j = ntiVar.f;
            if (j > 0) {
                long j2 = ntiVar.e / j;
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                suj sujVar7 = (suj) tpcVar.b;
                sujVar7.b |= 64;
                sujVar7.f = (int) j2;
            }
            suj sujVar8 = (suj) tpcVar.l();
            mdy mdyVar = ntiVar.h;
            tpc tpcVarM = sod.a.m();
            soc socVar = soc.WEAR_SESSION_EVENT;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            tph tphVar4 = tpcVarM.b;
            sod sodVar = (sod) tphVar4;
            sodVar.f = socVar.aJ;
            sodVar.b |= 1;
            if (!tphVar4.C()) {
                tpcVarM.o();
            }
            sod sodVar2 = (sod) tpcVarM.b;
            sujVar8.getClass();
            sodVar2.O = sujVar8;
            sodVar2.c |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            mdyVar.I(tpcVarM);
            pbc pbcVar = ntiVar.a;
            long j3 = sujVar8.c;
            long j4 = sujVar8.d;
            String string = Integer.toString((a.ax(sujVar8.g) != 0 ? r3 : 1) - 1);
            int i2 = sujVar8.e;
            if (ntiVar.f > 0) {
                str = pAAtrB.Umfu + sujVar8.f;
            } else {
                str = "";
            }
            pbcVar.f("sendUsageLog done, SessionDurationMs=" + j3 + ", SessionAmbientDurationMs=" + j4 + ", LaunchType=" + string + ", FailureLostConnectionTimes=" + i2 + str);
        }
        if (this.D) {
            this.k.b("onDestroy");
        }
        nss nssVar = this.k;
        oet oetVar = nssVar.e;
        ogl oglVar = ojl.aE(this, oetVar.f, "MessageListener").b;
        coe.e(oglVar, "Key must not be null");
        oetVar.g(oglVar, 24007);
        int i3 = nssVar.d;
        HandlerThread handlerThread = this.U;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.U = null;
            this.V = null;
        }
        this.o.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    @Override // defpackage.nqp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(java.lang.String r6, long r7) {
        /*
            r5 = this;
            boolean r0 = r5.V()
            if (r0 != 0) goto L8
            goto L88
        L8:
            nkw r0 = r5.G()
            nkw r1 = defpackage.nkw.TIME_LAPSE
            boolean r0 = j$.util.Objects.equals(r0, r1)
            r1 = 0
            java.lang.String r1 = com.bumptech.glide.qd.MyBPCgKwEjJI.vvzSufR
            r2 = 0
            if (r0 == 0) goto L33
            owf r0 = r5.af
            java.lang.Object r3 = r0.dL()
            fyx r4 = defpackage.fyx.RECORDING
            boolean r3 = j$.util.Objects.equals(r3, r4)
            if (r3 != 0) goto L5e
            java.lang.Object r0 = r0.dL()
            fyx r3 = defpackage.fyx.PAUSED
            boolean r0 = j$.util.Objects.equals(r0, r3)
            if (r0 == 0) goto L44
            goto L5e
        L33:
            gtm r0 = r5.ao
            nkw r3 = r5.G()
            gjw r0 = r0.j(r3)
            boolean r0 = r0.m()
            if (r0 == 0) goto L44
            goto L5e
        L44:
            boolean r0 = r6.equals(r1)
            if (r0 == 0) goto L5e
            sgv r0 = defpackage.ntf.a
            shi r0 = r0.c()
            r2 = 5585(0x15d1, float:7.826E-42)
            shi r0 = r0.M(r2)
            sgt r0 = (defpackage.sgt) r0
            java.lang.String r2 = "Incorrect recording state. Ignore caching the state."
            r0.s(r2)
            r2 = 1
        L5e:
            boolean r0 = r5.S()
            if (r0 == 0) goto L67
            r5.ae(r6, r7)
        L67:
            if (r2 != 0) goto L7d
            java.lang.String r0 = "/video_state_paused"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L79
            java.lang.String r0 = r5.S
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7b
        L79:
            r5.ah = r7
        L7b:
            r5.S = r6
        L7d:
            java.lang.String r7 = "/video_state_stopped"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L88
            r5.Y()
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntf.E(java.lang.String, long):void");
    }
}
