package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.media.AudioManager;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import j$.time.Duration;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mjl {
    public static final sgv a = sgv.g("mjl");
    public final mje A;
    public final mkl B;
    public final mke C;
    public final mkr D;
    public final pau E;
    public final Sensor F;
    public final hem G;
    public pka H;
    public syu I;
    public double J;
    public double K;
    public long L;
    public long M;
    public final mky N;
    public final mbj O;
    public final nca P;
    public final gay Q;
    public final hbj R;
    public final mdy S;
    public final cxb T;
    public final gox U;
    public final gtm V;
    public final ree W;
    public final obu X;
    public final qqq Y;
    private final jug Z;
    private final owf aa;
    private final luw ab;
    private ScheduledFuture ac;
    private final mjj ad;
    private final oge ae;
    private final oge af;
    private final ggg ag;
    private final oge ah;
    public long d;
    public final gfn i;
    public final gnt j;
    public final moc k;
    public final Context m;
    public final Executor n;
    public final miv o;
    public final out p;
    public final rwc r;
    public final owq s;
    public final owq t;
    public final owq u;
    public final ScheduledExecutorService v;
    public final SensorEventListener w;
    public final SensorManager x;
    public final ghd y;
    public final mik z;
    public final Object b = new Object();
    public final double[] c = new double[3];
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicLong h = new AtomicLong(0);
    public final Object q = new Object();
    public final ovx l = new ovx(mii.STATE_UNINITIALIZED);

    public mjl(cxb cxbVar, gnt gntVar, mbj mbjVar, moc mocVar, Context context, Executor executor, gox goxVar, hbj hbjVar, cxb cxbVar2, our ourVar, out outVar, imi imiVar, rwc rwcVar, owq owqVar, owq owqVar2, owq owqVar3, nca ncaVar, ScheduledExecutorService scheduledExecutorService, mik mikVar, miv mivVar, mje mjeVar, mkl mklVar, mke mkeVar, mkr mkrVar, mdy mdyVar, gtm gtmVar, luw luwVar, qqq qqqVar, pau pauVar, ghd ghdVar, gfn gfnVar, ree reeVar, ggg gggVar, hem hemVar, obu obuVar, mky mkyVar, gay gayVar, jug jugVar, owf owfVar) {
        this.F = cxbVar.z().getDefaultSensor(4);
        this.j = gntVar;
        this.O = mbjVar;
        this.k = mocVar;
        this.m = context;
        this.R = hbjVar;
        this.E = pauVar;
        this.o = mivVar;
        this.U = goxVar;
        this.T = cxbVar2;
        this.n = executor;
        this.p = outVar;
        this.r = rwcVar;
        this.s = owqVar;
        this.t = owqVar2;
        this.u = owqVar3;
        this.P = ncaVar;
        this.x = cxbVar.z();
        this.X = obuVar;
        this.z = mikVar;
        this.A = mjeVar;
        this.B = mklVar;
        this.C = mkeVar;
        this.D = mkrVar;
        this.S = mdyVar;
        this.V = gtmVar;
        this.Y = qqqVar;
        this.y = ghdVar;
        this.i = gfnVar;
        this.W = reeVar;
        this.v = scheduledExecutorService;
        this.ag = gggVar;
        this.G = hemVar;
        this.N = mkyVar;
        this.Q = gayVar;
        this.Z = jugVar;
        this.ab = luwVar;
        this.aa = owfVar;
        ourVar.d(mjeVar.d.dK(new mix(this, 4), outVar));
        ourVar.d(luwVar.dK(new mix(this, 5), outVar));
        ourVar.d(owfVar.dK(new mix(this, 6), outVar));
        ourVar.d(new kxj(owqVar, 18));
        this.w = new mji(this, mkrVar);
        mjj mjjVar = new mjj(this, outVar, mklVar, mkrVar, imiVar, context);
        this.ad = mjjVar;
        oge ogeVar = new oge(this, mkrVar);
        this.ah = ogeVar;
        oge ogeVar2 = new oge(this, mkrVar, (char[]) null);
        this.af = ogeVar2;
        oge ogeVar3 = new oge(this, hbjVar);
        this.ae = ogeVar3;
        mjeVar.ac = mjjVar;
        mkrVar.K = ogeVar;
        mkeVar.q = ogeVar2;
        mikVar.v = ogeVar3;
    }

    public final void a(pka pkaVar) {
        if (this.Z.b()) {
            this.ab.a(lty.RES_1080P);
        }
        this.H = pkaVar;
        mkr mkrVar = this.D;
        mkrVar.k.c(new mjh(mkrVar, 8));
        mje mjeVar = this.A;
        mky mkyVar = this.N;
        mjeVar.d.a(false);
        mjeVar.G = mkyVar.c();
        mjeVar.J = pkaVar;
        mjeVar.U = mkyVar;
        mjeVar.H = jea.A(mjeVar.f, mjeVar.ad, mjeVar.ag, mjeVar.ah);
    }

    public final void b(boolean z, boolean z2) {
        tpc tpcVarM = stx.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        stx stxVar = (stx) tphVar;
        stxVar.b |= 1;
        stxVar.c = z;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        stx stxVar2 = (stx) tpcVarM.b;
        stxVar2.b |= 2;
        stxVar2.d = z2;
        stx stxVar3 = (stx) tpcVarM.l();
        mdy mdyVar = this.S;
        tpc tpcVarM2 = sod.a.m();
        soc socVar = soc.TIMELAPSE_CAPTURE_SESSION_EVENT;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar2 = tpcVarM2.b;
        sod sodVar = (sod) tphVar2;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar2.C()) {
            tpcVarM2.o();
        }
        sod sodVar2 = (sod) tpcVarM2.b;
        stxVar3.getClass();
        sodVar2.az = stxVar3;
        sodVar2.d |= 134217728;
        mdyVar.I(tpcVarM2);
    }

    public final void c(List list, boolean z) {
        synchronized (this.q) {
            list.clear();
            this.e.set(false);
            if (!z) {
                this.l.a(mii.STATE_IDLE);
            }
            out outVar = this.p;
            mkl mklVar = this.B;
            mklVar.getClass();
            outVar.c(new mir(mklVar, 20));
        }
    }

    final void d() {
        syu syuVar;
        ovx ovxVar = this.l;
        int i = 1;
        if (((mii) ovxVar.d).equals(mii.STATE_RECORDING) || ((mii) ovxVar.d).equals(mii.STATE_RECORDING_PAUSE)) {
            j(1);
        }
        if (!((mii) ovxVar.d).equals(mii.STATE_PROCESSING) || (syuVar = this.I) == null || syuVar.isDone()) {
            e();
        } else {
            this.I.c(new mjh(this, i), this.p);
        }
    }

    public final void e() {
        this.l.a(mii.STATE_PREPARING_ON_START);
        mje mjeVar = this.A;
        mjeVar.j();
        mkl mklVar = this.B;
        mklVar.getClass();
        this.p.c(new mir(mklVar, 15));
        a(this.j.a());
        mjeVar.i();
        mjeVar.h();
    }

    public final void f() {
        if (this.R.p(haw.i)) {
            ScheduledFuture scheduledFuture = this.ac;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.ac = null;
            }
            this.ac = this.v.schedule(new mir(this, 19), true != ((mii) this.l.d).equals(mii.STATE_RECORDING) ? 2L : 15L, TimeUnit.SECONDS);
        }
    }

    public final void h(boolean z) {
        if (this.R.p(haw.i)) {
            ScheduledFuture scheduledFuture = this.ac;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.ac = null;
            }
            this.J = 0.0d;
            this.K = 0.0d;
            synchronized (this.b) {
                this.d = 0L;
                Arrays.fill(this.c, 0, 3, 0.0d);
            }
            if (z) {
                this.z.d(false);
            }
        }
    }

    final void i() {
        syu syuVar;
        ovx ovxVar = this.l;
        if (((mii) ovxVar.d).equals(mii.STATE_PRE_RECORDING)) {
            return;
        }
        if (!((mii) ovxVar.d).equals(mii.STATE_PROCESSING) || (syuVar = this.I) == null || syuVar.isDone()) {
            this.j.h(new mir(this, 11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r12) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjl.j(int):void");
    }

    public final boolean k(int i) {
        if (!mii.a((mii) this.l.d)) {
            return false;
        }
        ((sgt) a.c().M(4876)).s("stopRecordingOnCriticalState()");
        j(i);
        return true;
    }

    public final void g() {
        ovx ovxVar = this.l;
        if (!((mii) ovxVar.d).equals(mii.STATE_IDLE)) {
            ((sgt) a.c().M(4873)).s(oUZhwRhE.ZyCNvyTE);
            return;
        }
        if (!this.D.l()) {
            ((sgt) a.b().M(4872)).s("Device status is not allowed to start recording");
            return;
        }
        ovxVar.a(mii.STATE_PRE_RECORDING);
        this.Q.b();
        this.B.h();
        out outVar = this.p;
        nca ncaVar = this.P;
        ncaVar.getClass();
        outVar.c(new mjh(ncaVar, 4));
        this.O.c(R.raw.video_start);
        ncaVar.a();
        this.ag.j();
        final mje mjeVar = this.A;
        rwd rwdVarD = mjeVar.d();
        final boolean zBooleanValue = ((Boolean) rwdVarD.b).booleanValue();
        final boolean zL = mjeVar.l(true, zBooleanValue, (mkw) rwdVarD.a);
        final int iIntValue = zL ? ((Integer) mjeVar.ad.a(haw.d).get()).intValue() : 0;
        final mjb mjbVar = new mjb(mjeVar, iIntValue);
        gcc gccVar = mjeVar.Q;
        if (gccVar != null) {
            gccVar.close();
            mjeVar.Q = null;
        }
        gno gnoVar = mjeVar.B;
        ppo ppoVar = ppo.f;
        mjeVar.Q = gnoVar.e(ppoVar);
        if (mjeVar.y.c()) {
            mjeVar.R = gnoVar.e(ppoVar);
        }
        oxw oxwVarA = oxw.a(mjeVar.H);
        oxwVarA.getClass();
        ojl ojlVar = mjeVar.ai;
        oxy oxyVarBT = ojl.bT(mjeVar.F, oxwVarA);
        final oya oyaVar = new oya(mjeVar.H);
        oyaVar.j = oxyVarBT;
        oyaVar.c = mjeVar.ag.k();
        final gcc gccVar2 = mjeVar.Q;
        gccVar2.getClass();
        ske.R(new sxh() { // from class: miy
            /* JADX WARN: Type inference failed for: r10v20, types: [java.lang.Object, oyg] */
            @Override // defpackage.sxh
            public final syu a() {
                rwc rwcVarBQ;
                boolean z;
                oyo ozuVar;
                oxy oxyVarA;
                mje mjeVar2 = mjeVar;
                hbj hbjVar = mjeVar2.ad;
                gcc gccVar3 = gccVar2;
                oxj oxjVar = mjeVar2.H;
                oxh oxhVar = mjeVar2.G;
                FileDescriptor fileDescriptorE = gccVar3.e();
                int iC = mjeVar2.c();
                Object gevVar = hbjVar.p(gym.L) ? new gev(hbjVar, mjeVar2.A) : new oyb();
                oxb oxbVar = mjeVar2.e;
                oxbVar.b = oxjVar;
                oxbVar.c = oxhVar;
                oxbVar.d = mjeVar2.F;
                oxbVar.p = mjeVar2.c;
                oxbVar.o = fileDescriptorE;
                oxbVar.e = iC;
                oxbVar.k = rwc.j(true);
                oxbVar.s = mjeVar2.b();
                oxbVar.j = rwc.j(gevVar);
                oxbVar.v = rwc.j(Float.valueOf(mjeVar2.a()));
                miv mivVar = mjeVar2.y;
                float fFloatValue = mivVar.c() ? ((Float) hbjVar.e(haw.k).get()).floatValue() : 1.0f;
                oya oyaVar2 = oyaVar;
                oxbVar.w = rwc.j(Float.valueOf(fFloatValue));
                oxbVar.l = rwc.j(oyaVar2);
                oxbVar.n = rwc.j(new owz(mjeVar2, 1));
                oxbVar.m = rwc.j(oyc.SURFACE);
                oxbVar.i = rwc.j(mivVar.k.g);
                jid jidVar = mjeVar2.i;
                if (jidVar.d().h()) {
                    oxbVar.f = (Location) jidVar.d().c();
                }
                oxbVar.y = !hbjVar.p(gzo.ai);
                oxbVar.z = rwc.j(true);
                gfa gfaVar = mjeVar2.ae;
                List list = oxbVar.a;
                list.add(gfaVar);
                rnt.B(oxbVar.o != null, "Neither recordFileDescriptor nor recordFile are specified");
                rnt.B(oxbVar.b != null, "camcorderVideoResolution is required");
                oxbVar.d.getClass();
                oxbVar.c.getClass();
                oxbVar.p.getClass();
                rwc rwcVar = oxbVar.r;
                oxo oxoVar = new oxo(new pfl());
                if (oxbVar.l.h()) {
                    Object objC = oxbVar.l.c();
                    oxj oxjVar2 = ((oya) oxbVar.l.c()).b;
                    pjr pjrVar = oxbVar.d;
                    int i = ((oya) oxbVar.l.c()).c;
                    oxh oxhVar2 = oxbVar.c;
                    rwc rwcVar2 = oxbVar.w;
                    rwc rwcVar3 = ((oya) oxbVar.l.c()).a;
                    oxbVar.l.c();
                    oxbVar.l.c();
                    oxy oxyVar = ((oya) objC).j;
                    if (oxyVar == null) {
                        rwcVarBQ = rvk.a;
                    } else {
                        int iBU = ojl.bU(oxyVar.g, oxjVar2, i, rwcVar2, rwcVar3);
                        if (i == 5) {
                            oxx oxxVarB = oxy.b(oxyVar);
                            oxxVarB.i(5);
                            oxxVarB.k(1);
                            oxxVarB.j(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
                            oxxVarB.h(iBU);
                            oxyVarA = oxxVarB.a();
                        } else {
                            if (i != 2) {
                                throw new IllegalArgumentException(a.bv(i, "Unsupported video encoder type: "));
                            }
                            oxx oxxVarB2 = oxy.b(oxyVar);
                            oxxVarB2.i(2);
                            oxxVarB2.k(8);
                            oxxVarB2.j(32768);
                            oxxVarB2.h(iBU);
                            oxyVarA = oxxVarB2.a();
                        }
                        rwcVarBQ = rwc.j(oxyVarA);
                    }
                } else {
                    rwcVarBQ = ojl.bQ(oxbVar.b, oxbVar.d, 2, oxbVar.c, oxbVar.w, rvk.a, false, false);
                }
                rnt.O(rwcVarBQ.h(), "Fail to camcorder profile for resolution %s", oxbVar.b);
                oxp oxpVarD = oxbVar.v.h() ? oxoVar.d((oxy) rwcVarBQ.c(), oxbVar.c, oxbVar.b, ((Float) oxbVar.v.c()).floatValue()) : oxoVar.c((oxy) rwcVarBQ.c(), oxbVar.c, oxbVar.b);
                ExecutorService executorServiceBZ = ojl.bZ("CamcorderCllbck");
                executorServiceBZ.getClass();
                syw sywVarA = ske.A(ojl.bZ("Camcorder"));
                HandlerThread handlerThread = new HandlerThread("Camcorder");
                handlerThread.start();
                Handler handler = new Handler(handlerThread.getLooper());
                if (oxbVar.k.h()) {
                    ((Boolean) oxbVar.k.c()).booleanValue();
                    z = true;
                } else {
                    z = false;
                }
                if (oxbVar.c.h() || z) {
                    pbl pblVar = new pbl();
                    AudioManager audioManager = oxbVar.p;
                    ozl ozlVar = new ozl(sywVarA, handler, pblVar);
                    if (oxbVar.j.h()) {
                        ozlVar.n = oxbVar.j.c();
                    }
                    rwc rwcVar4 = oxbVar.q;
                    ozlVar.w = oxbVar.y;
                    if (oxbVar.z.h()) {
                        ((Boolean) oxbVar.z.c()).booleanValue();
                        ozlVar.q = true;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ozlVar.s((oyz) it.next());
                    }
                    ozuVar = ozlVar;
                } else {
                    ozuVar = new ozu(new ozm(new MediaRecorder()), sywVarA, new oxa());
                }
                ozuVar.o(oxpVarD);
                ozuVar.l(oxbVar.e);
                ozuVar.k();
                FileDescriptor fileDescriptor = oxbVar.o;
                if (fileDescriptor != null) {
                    ozuVar.n(fileDescriptor);
                }
                Location location = oxbVar.f;
                if (location != null) {
                    ozuVar.f(location);
                }
                rwc rwcVar5 = oxbVar.h;
                rwc rwcVar6 = oxbVar.g;
                rwc rwcVar7 = oxbVar.x;
                if (oxbVar.i.h()) {
                    ozuVar.j((MediaCodec.Callback) oxbVar.i.c());
                }
                if (oxbVar.m.h()) {
                    ozuVar.c((oyc) oxbVar.m.c());
                }
                ozuVar.d(oxbVar.s);
                rwc rwcVar8 = oxbVar.t;
                rwc rwcVar9 = oxbVar.u;
                try {
                    oxd oxdVar = new oxd(ozuVar.a(), executorServiceBZ, oxbVar.n, sywVarA, handlerThread);
                    boolean z2 = zBooleanValue;
                    mjeVar2.Z = oxdVar;
                    mjeVar2.e();
                    ScheduledExecutorService scheduledExecutorService = mjeVar2.v;
                    mir mirVar = new mir(mjeVar2, 6);
                    Duration duration = hei.a;
                    mjeVar2.S = scheduledExecutorService.scheduleAtFixedRate(mirVar, duration.toSeconds(), duration.toSeconds(), TimeUnit.SECONDS);
                    mla mlaVar = new mla((byte[]) null);
                    mlaVar.b(0);
                    oxh oxhVar3 = mjeVar2.G;
                    oxhVar3.getClass();
                    mlaVar.a = oxhVar3;
                    oxj oxjVar3 = mjeVar2.H;
                    oxjVar3.getClass();
                    mlaVar.b = oxjVar3;
                    mlaVar.d = gccVar3;
                    mlaVar.c = rvk.a;
                    mlaVar.g = mjeVar2.c();
                    mlaVar.j = (byte) (mlaVar.j | 1);
                    rwc rwcVarC = mjeVar2.Z.a.c();
                    rwcVarC.getClass();
                    mlaVar.e = rwcVarC;
                    mky mkyVar = mjeVar2.U;
                    mkyVar.getClass();
                    mlaVar.f = mkyVar;
                    mlaVar.c(mjeVar2.C);
                    mlaVar.e();
                    mlaVar.d(mjeVar2.T);
                    mlaVar.h = z2;
                    mlaVar.j = (byte) (mlaVar.j | 4);
                    mlaVar.i = mjeVar2.a();
                    mlaVar.j = (byte) (mlaVar.j | 8);
                    mlaVar.b(mjeVar2.b());
                    mlb mlbVarA = mlaVar.a();
                    List list2 = mjeVar2.D;
                    if (!list2.isEmpty()) {
                        ((sgt) mje.a.c().M(4839)).s("prepareCamcorder(): Pending video file exists.");
                        list2.clear();
                    }
                    owy owyVar = mjbVar;
                    list2.add(mlbVarA);
                    mjeVar2.V = new mlc(mjeVar2.U, ezh.E(gccVar3) == ltg.MARS_STORE, z2, ((Float) mjeVar2.m.dL()).floatValue(), mjeVar2.H.c().a, mjeVar2.H.c().b, mjeVar2.G.k, ((Float) mjeVar2.r.dL()).floatValue());
                    mjeVar2.Z.a(owyVar);
                    return ske.M(mjeVar2.Z);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Fail to create video recorder", e);
                }
            }
        }, mjeVar.g).c(new Runnable() { // from class: miw
            /* JADX WARN: Removed duplicated region for block: B:107:0x01f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.concurrent.Executor] */
            /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, jid] */
            /* JADX WARN: Type inference failed for: r7v11, types: [sgt, shi] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 662
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.miw.run():void");
            }
        }, mjeVar.j);
        final mke mkeVar = this.C;
        mkeVar.h.b(new mgl() { // from class: mkb
            @Override // defpackage.mgl
            public final void a(mgn mgnVar) {
                mkeVar.a(mgnVar, false);
            }
        });
    }
}
