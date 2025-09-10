package defpackage;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import android.opengl.Matrix;
import android.util.CloseGuard;
import android.util.Size;
import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import com.google.android.libraries.oliveoil.natives.BitmapNativeBuffer;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import com.google.vr.audio.Cf.qcjAcSmlN;
import j$.lang.Iterable$EL;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nph implements AutoCloseable, pdl, npx, ngo, npj, npq {
    public static final sgv a = sgv.g("nph");
    private static final Instant j = Instant.ofEpochMilli(2000);
    private static final AtomicInteger k = new AtomicInteger();
    private long A;
    private paq B;
    private final AtomicInteger C;
    private rwc D;
    private boolean E;
    private long F;
    private final Object G;
    private volatile sbp H;
    private boolean I;
    private pbp J;
    private int K;
    private boolean L;
    private final ktx M;
    private final hdm N;
    public final owf b;
    public final String c;
    public final Executor d;
    public final our f;
    public final npr g;
    public final List h;
    public Size i;
    private final owf l;
    private final hbc m;
    private final Supplier n;
    private final CloseGuard o;
    private final qin p;
    private final pbn q;
    private final pbr r;
    private final iuc v;
    private final iuo w;
    private final CameraActivityTiming x;
    private final boolean y;
    private final Set z;
    private final AtomicBoolean s = new AtomicBoolean(false);
    private final AtomicBoolean t = new AtomicBoolean(false);
    private final AtomicBoolean u = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);

    public nph(Executor executor, qin qinVar, owf owfVar, owf owfVar2, pbn pbnVar, hbc hbcVar, ktx ktxVar, iuc iucVar, iuo iuoVar, hdm hdmVar, CameraActivityTiming cameraActivityTiming, npr nprVar, npp nppVar, Supplier supplier) {
        npt nptVar;
        our ourVar = new our();
        this.f = ourVar;
        this.z = new HashSet();
        this.A = -1L;
        this.B = null;
        this.C = new AtomicInteger(0);
        this.D = rvk.a;
        this.E = false;
        this.h = new ArrayList();
        this.G = new Object();
        int i = sbp.d;
        this.H = sex.a;
        this.I = false;
        this.J = pbp.a;
        this.K = 0;
        this.L = true;
        this.m = hbcVar;
        this.n = supplier;
        this.c = "VFEPipeline-" + k.getAndIncrement();
        CloseGuard closeGuard = new CloseGuard();
        this.o = closeGuard;
        this.d = executor;
        this.p = qinVar;
        this.b = owfVar;
        this.l = owfVar2;
        this.q = pbnVar;
        this.r = pbnVar.b("VFE.IntervalMs");
        this.M = ktxVar;
        this.v = iucVar;
        this.w = iuoVar;
        this.N = hdmVar;
        this.x = cameraActivityTiming;
        boolean z = nppVar.b;
        this.y = z;
        this.J = pbnVar.a("VFE.ready");
        if (z && (nptVar = nprVar.d) != null) {
            rnt.x(nptVar);
            nptVar.a(this);
            ourVar.d(new ktu(nptVar, this, 17));
        }
        mtd mtdVar = new mtd(this, 19);
        sxo sxoVar = sxo.a;
        ourVar.d(owfVar.dK(mtdVar, sxoVar));
        scn scnVar = nppVar.a;
        ourVar.d(owl.h(new owe((Collection) Collection.EL.stream(scnVar).map(new mcx(7)).collect(ryv.a)), new hve(this, (Set) Collection.EL.stream(scnVar).map(new ndu(13)).collect(Collectors.toCollection(new ier(2))), 9)).dK(new mix(this, 20), sxoVar));
        closeGuard.open("close");
        this.g = nprVar;
        nprVar.a.l(this);
    }

    private final our m() {
        our ourVar = new our();
        AtomicInteger atomicInteger = this.C;
        atomicInteger.incrementAndGet();
        atomicInteger.getClass();
        ourVar.d(new ngh(atomicInteger, 2));
        return ourVar;
    }

    private final rwc n(paq paqVar, Function function) {
        if (this.I) {
            ((sgt) a.c().M(5474)).v("[%s] cannot take screenshot after VFE is closed", this.c);
            return rvk.a;
        }
        if (paqVar == null) {
            ((sgt) a.c().M(5473)).v("[%s] no frame found to save as screenshot", this.c);
            return rvk.a;
        }
        if (paqVar instanceof poj) {
            HardwareBuffer hardwareBufferF = ((poj) paqVar).f();
            try {
                if (hardwareBufferF == null) {
                    ((sgt) a.c().M(5472)).v("[%s] can't save screenshot as YUV image has no associated HardwareBuffer", this.c);
                    return rvk.a;
                }
                rwc rwcVar = (rwc) function.apply(hardwareBufferF);
                hardwareBufferF.close();
                return rwcVar;
            } catch (Throwable th) {
                if (hardwareBufferF != null) {
                    try {
                        hardwareBufferF.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        rnt.s(paqVar instanceof pdk);
        poj pojVarE = ((pdk) paqVar).e(this.g.b);
        try {
            if (pojVarE == null) {
                ((sgt) a.c().M(5471)).v("[%s] can't save screenshot as frame has no YUV image", this.c);
                return rvk.a;
            }
            HardwareBuffer hardwareBufferF2 = pojVarE.f();
            try {
                if (hardwareBufferF2 == null) {
                    ((sgt) a.c().M(5470)).v("[%s] can't save screenshot as YUV image has no associated HardwareBuffer", this.c);
                    rvk rvkVar = rvk.a;
                    pojVarE.close();
                    return rvkVar;
                }
                rwc rwcVar2 = (rwc) function.apply(hardwareBufferF2);
                hardwareBufferF2.close();
                pojVarE.close();
                return rwcVar2;
            } finally {
            }
        } catch (Throwable th3) {
            if (pojVarE != null) {
                try {
                    pojVarE.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    private final void o(paq paqVar) {
        paqVar.close();
        Set set = this.z;
        synchronized (set) {
            set.remove(paqVar);
        }
    }

    private final synchronized void p(poj pojVar) {
        pbm pbmVar = new pbm(this.q, "VFE.processFast");
        try {
            if (this.I || ((Boolean) this.n.get()).booleanValue()) {
                s(pojVar, "Pipeline was already closed. Skipping the image.");
                pojVar.close();
            } else if (this.h.isEmpty()) {
                s(pojVar, "No outputSpecs. Skipping the image.");
                pojVar.close();
            } else {
                poj pkfVar = new pkf(pojVar, 2);
                q(pkfVar);
                our ourVarM = m();
                ourVarM.d(pkfVar);
                HardwareBuffer hardwareBufferF = pkfVar.f();
                if (hardwareBufferF == null) {
                    s(pojVar, "Failed to get the buffer. Skipping the image.");
                    ourVarM.close();
                } else {
                    ourVarM.d(new ngh(hardwareBufferF, 3));
                    u(pkfVar, hardwareBufferF, ourVarM, false);
                }
            }
            pbmVar.close();
        } finally {
        }
    }

    private final void q(paq paqVar) {
        boolean z = true;
        int i = 0;
        if (!(paqVar instanceof pdk) && !(paqVar instanceof poj)) {
            z = false;
        }
        rnt.s(z);
        paq paqVar2 = this.B;
        if (paqVar2 != null) {
            o(paqVar2);
        }
        if (this.E) {
            if (Instant.now().minusMillis(this.F).isAfter(j)) {
                ((sgt) a.c().M(5492)).v("[%s] do not update screenshot for WCA - idle time is too long", this.c);
                this.D = rvk.a;
                this.E = false;
            } else {
                synchronized (this) {
                    rwc rwcVarN = n(paqVar, new npd(this, i));
                    if (rwcVarN.h()) {
                        this.D = rwcVarN;
                    }
                }
            }
        }
        this.B = paqVar;
    }

    private final void r(pdk pdkVar, String str) {
        ((sgt) a.c().M(5493)).I("[%s][%s, closed=%s](repeat=%d) %s", this.c, pdkVar, Boolean.valueOf(pdkVar.f()), Integer.valueOf(this.K), str);
        this.K++;
    }

    private final void s(poj pojVar, String str) {
        ((sgt) a.c().M(5494)).H("[%s][%d](repeat=%d) %s", this.c, Long.valueOf(pojVar.d()), Integer.valueOf(this.K), str);
        this.K++;
    }

    private static final int t(int i) {
        if (i == 0) {
            return 0;
        }
        if (i != 180) {
            return i != 270 ? 4 : 7;
        }
        return 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dc, code lost:
    
        if (r11 != 3) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8 A[Catch: all -> 0x021b, TryCatch #5 {all -> 0x021b, blocks: (B:3:0x000f, B:14:0x0035, B:18:0x0070, B:19:0x007f, B:21:0x0086, B:45:0x00e4, B:50:0x011c, B:30:0x00b6, B:32:0x00c8, B:34:0x00cd), top: B:117:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101 A[Catch: all -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x002f, blocks: (B:5:0x001e, B:8:0x0023, B:10:0x0027, B:17:0x0060, B:24:0x0095, B:26:0x00a3, B:47:0x0101, B:27:0x00ac, B:36:0x00d1), top: B:119:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c A[Catch: all -> 0x021b, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x021b, blocks: (B:3:0x000f, B:14:0x0035, B:18:0x0070, B:19:0x007f, B:21:0x0086, B:45:0x00e4, B:50:0x011c, B:30:0x00b6, B:32:0x00c8, B:34:0x00cd), top: B:117:0x000f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:? -> B:75:0x01aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void u(defpackage.poj r32, android.hardware.HardwareBuffer r33, defpackage.our r34, boolean r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nph.u(poj, android.hardware.HardwareBuffer, our, boolean):void");
    }

    @Override // defpackage.pdm
    public final String a() {
        return "vfe";
    }

    @Override // defpackage.ngo
    public final rwc b(int i, int i2) {
        this.F = Instant.now().toEpochMilli();
        if (this.D.h()) {
            return rwc.j(Bitmap.createScaledBitmap((Bitmap) this.D.c(), i, i2, true));
        }
        ((sgt) a.c().M(5477)).v("[%s] update screenshot for WCA since it is connected", this.c);
        this.E = true;
        return rvk.a;
    }

    @Override // defpackage.ngo
    public final rwc c(final int i, final int i2) {
        rwc rwcVarN;
        synchronized (this) {
            rwcVarN = n(this.B, new Function() { // from class: npe
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo30andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    nph nphVar = this.a;
                    HardwareBuffer hardwareBuffer = (HardwareBuffer) obj;
                    boolean z = true;
                    if (!nphVar.g.a() && !((iqk) nphVar.b.dL()).b) {
                        z = false;
                    }
                    return rwc.j(nphVar.e(hardwareBuffer, i, i2, z));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        return rwcVarN;
    }

    @Override // java.lang.AutoCloseable, defpackage.paq
    public final synchronized void close() {
        ArrayList arrayList;
        pbm pbmVar = new pbm(this.q, "VFE.close");
        try {
            if (!this.I) {
                this.I = true;
                this.g.a.m(this);
                paq paqVar = this.B;
                if (paqVar != null) {
                    o(paqVar);
                }
                Set set = this.z;
                synchronized (set) {
                    arrayList = new ArrayList(set);
                    set.clear();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((paq) it.next()).close();
                }
                List list = this.h;
                Iterable$EL.forEach(list, new jgf(15));
                list.clear();
                int i = sbp.d;
                j(sex.a);
                pbn pbnVar = this.q;
                pbnVar.f("glContext");
                this.f.close();
                this.p.close();
                pbnVar.g();
                this.o.close();
            }
            pbmVar.close();
        } finally {
        }
    }

    @Override // defpackage.pdm
    public final void d(phc phcVar) {
        AtomicBoolean atomicBoolean = this.u;
        boolean zK = k();
        pdo pdoVarB = phcVar.b();
        if (atomicBoolean.compareAndSet(false, true)) {
            CameraActivityTiming cameraActivityTiming = this.x;
            cameraActivityTiming.l(mej.ACTIVITY_FIRST_PREVIEW_FRAME_RECEIVED, CameraActivityTiming.a);
            cameraActivityTiming.f.a();
            cameraActivityTiming.f = pbp.a;
        }
        if (pdoVarB != null) {
            this.v.a(iui.c, pdoVarB.b);
        }
        if (zK) {
            return;
        }
        pdk pdkVarA = phcVar.a();
        if (pdkVarA == null || pdkVarA.b() == null) {
            ((sgt) a.c().M(5486)).E("[%s] The frame %s should be non-null but it is.", this.c, pdoVarB);
            return;
        }
        Set set = this.z;
        synchronized (set) {
            set.add(pdkVarA);
        }
        if (pdkVarA.f()) {
            ((sgt) a.c().M(5487)).E("[%s] The frame %s should be valid but is closed on arrival.", this.c, pdkVarA);
        }
        this.d.execute(new lor(this, pdkVarA, 13));
    }

    public final Bitmap e(HardwareBuffer hardwareBuffer, int i, int i2, boolean z) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        EGLImage eGLImage = new EGLImage(hardwareBuffer);
        try {
            qin qinVar = this.p;
            qjn qjnVarB = qjn.b(qinVar, eGLImage);
            try {
                BitmapNativeBuffer bitmapNativeBuffer = new BitmapNativeBuffer(bitmapCreateBitmap);
                qim qimVarD = qim.d(new qml(qko.c(f(), (qhx) bitmapNativeBuffer.b)));
                try {
                    qkp qkpVar = new qkp(f());
                    try {
                        int iIntValue = ((Integer) this.g.c.dL()).intValue();
                        if (z) {
                            iIntValue = (360 - iIntValue) % 360;
                        }
                        float[] fArr = new float[16];
                        Matrix.setIdentityM(fArr, 0);
                        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
                        Matrix.rotateM(fArr, 0, -iIntValue, 0.0f, 0.0f, 1.0f);
                        if (z) {
                            if (iIntValue % 180 == 0) {
                                Matrix.rotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
                            } else {
                                Matrix.rotateM(fArr, 0, 180.0f, 1.0f, 0.0f, 0.0f);
                            }
                        }
                        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
                        for (int i3 = 0; i3 < 16; i3++) {
                            fArr[i3] = Math.round(fArr[i3]);
                        }
                        qkpVar.b(qjnVarB, qimVarD, fArr);
                        qimVarD.g(new qig(bitmapNativeBuffer, 0), new qfk(bitmapNativeBuffer, 3, null));
                        qpt.C(qinVar);
                        qkpVar.close();
                        qimVarD.close();
                        qjnVarB.close();
                        eGLImage.close();
                        return bitmapCreateBitmap;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final sbp g() {
        sbp sbpVar;
        synchronized (this.G) {
            sbpVar = this.H;
        }
        return sbpVar;
    }

    @Override // defpackage.npx
    public final void h(poj pojVar) {
        this.t.compareAndSet(false, true);
        p(pojVar);
    }

    final synchronized void i(pdk pdkVar) {
        pbm pbmVar = new pbm(this.q, GdpuLBytnYW.nFsYfLcKCjVO);
        try {
            if (this.I || ((Boolean) this.n.get()).booleanValue()) {
                r(pdkVar, "Pipeline was already closed. Aborting Display.");
            } else {
                q(pdkVar);
                if (this.h.isEmpty()) {
                    r(pdkVar, "No output configured yet. Aborting display.");
                } else {
                    npr nprVar = this.g;
                    our ourVarM = m();
                    pdk pdkVarA = pdkVar.a();
                    if (pdkVarA == null) {
                        r(pdkVar, "failed to fork() frame. Aborting display.");
                        ourVarM.close();
                    } else {
                        ourVarM.d(pdkVarA);
                        peo peoVar = nprVar.b;
                        poj pojVarE = pdkVarA.e(peoVar);
                        if (pojVarE == null) {
                            r(pdkVar, "can't display frame as frame has no associated YUV image");
                            ourVarM.close();
                        } else {
                            ourVarM.d(pojVarE);
                            HardwareBuffer hardwareBufferF = pojVarE.f();
                            if (hardwareBufferF == null) {
                                r(pdkVar, SHXc.ZByAwKJuRMqHda);
                                ourVarM.close();
                            } else {
                                ourVarM.d(new ngh(hardwareBufferF, 3));
                                sbp sbpVarG = g();
                                if (sbpVarG.isEmpty()) {
                                    u(pojVarE, hardwareBufferF, ourVarM, true);
                                } else {
                                    sgk it = sbpVarG.iterator();
                                    while (it.hasNext()) {
                                        if (((npl) it.next()).b(pdkVar, peoVar, pdkVar) == npk.DROPPED) {
                                            ourVarM.close();
                                            break;
                                        }
                                    }
                                    u(pojVarE, hardwareBufferF, ourVarM, true);
                                }
                            }
                        }
                    }
                }
            }
            pbmVar.close();
        } finally {
        }
    }

    public final void j(sbp sbpVar) {
        synchronized (this.G) {
            this.H = sbpVar;
        }
    }

    @Override // defpackage.npx
    public final boolean k() {
        return this.y && g().isEmpty();
    }

    @Override // defpackage.npq
    public final synchronized paq l(ngn ngnVar) {
        int i;
        rnt.M(ngnVar.e, "Surface is invalid: ignoring set filter output");
        if (this.I) {
            return new fgp(20);
        }
        List list = this.h;
        if (list.contains(ngnVar)) {
            return new pan(1);
        }
        list.add(ngnVar);
        ngnVar.d.d(this);
        int i2 = ngnVar.f;
        int i3 = ngnVar.g;
        int i4 = 384;
        if (i2 > i3) {
            i = (i3 * 384) / i2;
        } else {
            int i5 = (i2 * 384) / i3;
            i = 384;
            i4 = i5;
        }
        this.i = new Size(i4, i);
        this.J.a();
        this.J = pbp.a;
        return new hku(this, new AtomicBoolean(false), ngnVar, 3);
    }

    @Override // defpackage.npj
    public final qin f() {
        rnt.O(!this.I, VnmwoBe.vHRY, this.c);
        return this.p;
    }

    protected final void finalize() {
        this.o.warnIfOpen();
        AtomicInteger atomicInteger = this.C;
        if (atomicInteger.get() > 0) {
            ((sgt) a.c().M(5476)).C("[%s] Still %d inflight process(es) at VFE close!", this.c, atomicInteger.get());
            if (this.m.equals(hbc.ENG)) {
                throw new IllegalStateException(qcjAcSmlN.bwNxFRa);
            }
        }
    }
}
