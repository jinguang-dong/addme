package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.SizeF;
import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hgm implements hgj {
    public static final sgv a = sgv.g("hgm");
    private final hbj D;
    private obv E;
    private final mwq F;
    public final pas b;
    public final boolean d;
    private final hpa e;
    private final nms f;
    private final plc j;
    private final pbn k;
    private final boolean l;
    private final owf m;
    private final int n;
    private final boolean o;
    private final int p;
    private final String q;
    private final boolean t;
    private volatile int v;
    private volatile plb w;
    private final Set g = DesugarCollections.synchronizedSet(new HashSet());
    private final List h = DesugarCollections.synchronizedList(new ArrayList());
    public final AtomicLong c = new AtomicLong();
    private final AtomicLong i = new AtomicLong();
    private final Map r = new ConcurrentHashMap();
    private final Object s = new Object();
    private final Deque u = new ConcurrentLinkedDeque();
    private volatile boolean x = false;
    private volatile lnl y = null;
    private volatile long z = 0;
    private volatile AtomicLong A = new AtomicLong();
    private volatile AtomicLong B = new AtomicLong();
    private volatile AtomicLong C = new AtomicLong();

    public hgm(hbc hbcVar, pas pasVar, nms nmsVar, hpa hpaVar, pjo pjoVar, plc plcVar, hbj hbjVar, fgn fgnVar, pnq pnqVar, pbn pbnVar, sbv sbvVar, owf owfVar) {
        this.t = hbcVar.b(hbc.ENG);
        this.b = pasVar;
        this.e = hpaVar;
        this.f = nmsVar;
        this.j = plcVar;
        this.d = pjoVar.l() == pka.FRONT;
        gzi gziVar = gzz.a;
        this.F = new mwq(pnqVar, sbvVar, (char[]) null);
        this.k = pbnVar;
        this.l = fgnVar.b;
        this.m = owfVar;
        this.n = pjoVar.g();
        this.D = hbjVar;
        this.o = hbjVar.p(had.b);
        this.p = ((Integer) hbjVar.a(had.a).orElse(0)).intValue();
        this.q = hbjVar.f(had.c);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    private final hgn c(lnl lnlVar) {
        lcy lcyVar;
        float f;
        mwq mwqVar = this.F;
        long j = lnlVar.d;
        String str = lnlVar.b;
        boolean z = str != null && ((lcyVar = (lcy) mwqVar.a.get(str)) == lcy.WIDE_RM || lcyVar == lcy.TELE_RM || lcyVar == lcy.ULTRAWIDE_RM);
        int iU = mwqVar.u(str);
        Rect rect = lnlVar.p;
        if (rect == null) {
            rect = new Rect(lnlVar.v);
        }
        Rect rect2 = z ? new Rect(rect.left / 2, rect.top / 2, rect.right / 2, rect.bottom / 2) : rect;
        long j2 = lnlVar.e;
        long j3 = lnlVar.c;
        Rect rect3 = lnlVar.v;
        long jHeight = rect3.height();
        long jHeight2 = (rect2.height() * j2) / jHeight;
        long j4 = j3 + ((rect2.top * j2) / jHeight);
        long j5 = j / 2;
        float fWidth = rect2.width();
        float fWidth2 = rect3.width();
        SizeF sizeF = (SizeF) this.f.b(str).m(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        sizeF.getClass();
        if (z) {
            float width = sizeF.getWidth();
            float f2 = width + width;
            float height = sizeF.getHeight();
            f = fWidth;
            sizeF = new SizeF(f2, height + height);
        } else {
            f = fWidth;
        }
        long j6 = j5 + j4;
        float f3 = lnlVar.h;
        return new hgn(j6, j6, jHeight2, j, rect2, f3, (f / fWidth2) * (sizeF.getWidth() / f3), z, iU, str);
    }

    private final void d(long j) {
        for (jpp jppVar : this.g) {
            jppVar.a(j).b.cancel(true);
            jppVar.d.post(new jmr(jppVar, 10));
        }
    }

    private final void l(long j) {
        final int iIntValue = this.D.p(gza.d) ? ((Integer) this.m.dL()).intValue() : this.n;
        synchronized (this.s) {
            final obv obvVar = this.E;
            if (this.w != null) {
                this.w.b(this.c.get() + 1, j, new pla() { // from class: hgk
                    /* JADX WARN: Type inference failed for: r8v2, types: [sgt, shi] */
                    @Override // defpackage.pla
                    public final void a(List list) {
                        obv obvVar2 = obvVar;
                        if (obvVar2 == null) {
                            ((sgt) ((sgt) hgm.a.b().g((char) 1, TimeUnit.SECONDS)).M((char) 1265)).s("processGyroSamples called with a null eisNativeWrapper");
                            return;
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            int i = iIntValue;
                            hgm hgmVar = this.a;
                            pld pldVar = (pld) it.next();
                            float f = pldVar.f;
                            float f2 = pldVar.g;
                            boolean z = hgmVar.d;
                            Pair pair = (!(z && i == 90) && (z || i != 270)) ? (z && i == 0) ? new Pair(Float.valueOf(f2), Float.valueOf(-f)) : new Pair(Float.valueOf(f), Float.valueOf(f2)) : new Pair(Float.valueOf(-f), Float.valueOf(-f2));
                            obvVar2.i(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue(), pldVar.h, pldVar.e);
                            hgmVar.c.set(pldVar.e);
                        }
                    }
                });
            }
        }
    }

    @Override // defpackage.hgj
    public final szh a(lnl lnlVar, lnl lnlVar2) {
        ArrayList arrayList;
        int i = this.v * 9;
        pbn pbnVar = this.k;
        float[] fArr = new float[i];
        hgn hgnVarC = c(lnlVar);
        hgn hgnVarC2 = c(lnlVar2);
        pbnVar.f("processGyroSamples(MAX)");
        l(Long.MAX_VALUE);
        pbnVar.g();
        szh szhVar = new szh();
        synchronized (this.s) {
            ArrayList arrayList2 = new ArrayList();
            obv obvVar = this.E;
            if (obvVar != null) {
                long j = hgnVarC.a;
                long j2 = hgnVarC2.a;
                long j3 = hgnVarC.b;
                long j4 = hgnVarC2.b;
                long j5 = hgnVarC.d;
                long j6 = hgnVarC2.d;
                long j7 = hgnVarC.c;
                long j8 = hgnVarC2.c;
                int i2 = hgnVarC.h;
                int i3 = hgnVarC2.h;
                boolean z = hgnVarC.g;
                boolean z2 = hgnVarC2.g;
                pas pasVar = this.b;
                int i4 = pasVar.a;
                float f = i4;
                float f2 = f / hgnVarC.f;
                float f3 = f / hgnVarC2.f;
                float fWidth = hgnVarC.e.width();
                Rect rect = hgnVarC2.e;
                arrayList = arrayList2;
                boolean zH = obvVar.h(j, j2, j3, j4, j5, j6, j7, j8, i2, i3, z, z2, f2, f3, fWidth, rect.width(), r4.height(), rect.height(), i4, pasVar.b, this.v, fArr);
                for (int i5 = 0; i5 < this.v; i5++) {
                    arrayList.add(zH ? qib.c(Arrays.copyOfRange(fArr, i5 * 9, (i5 + 1) * 9)) : qib.d());
                }
            } else {
                arrayList = arrayList2;
                ((sgt) ((sgt) a.c().g(1, TimeUnit.SECONDS)).M(1264)).s("getTransformBetweenTimestamps called with a null eisNativeWrapper");
                for (int i6 = 0; i6 < this.v; i6++) {
                    arrayList.add(qib.d());
                }
            }
            szhVar.e(arrayList);
        }
        return szhVar;
    }

    @Override // defpackage.hgj
    public final szh b(lnl lnlVar, lnl lnlVar2) {
        szh szhVar = new szh();
        synchronized (this.s) {
            try {
                List list = (List) a(lnlVar, lnlVar2).s();
                qib.d();
                szhVar.e(list.size() == this.v ? (qib) list.get(this.v / 2) : (qib) list.get(0));
            } catch (InterruptedException | CancellationException | ExecutionException e) {
                szhVar.a(e);
            }
        }
        return szhVar;
    }

    @Override // defpackage.hgj
    public final void e(long j) {
        long j2;
        if (!this.x || j < this.z) {
            return;
        }
        this.z = j;
        AtomicLong atomicLong = this.c;
        long j3 = (-1) + j;
        atomicLong.compareAndSet(0L, j3);
        AtomicLong atomicLong2 = this.i;
        atomicLong2.compareAndSet(0L, j3);
        l(j);
        hpa hpaVar = this.e;
        lnl lnlVarB = hpaVar.b();
        long j4 = lnlVarB != null ? lnlVarB.c : 0L;
        List list = this.h;
        list.add(Long.valueOf(j));
        boolean z = j >= atomicLong.get() + 1000000000;
        if (z) {
            j2 = 1000000000;
            ((sgt) ((sgt) a.c().g(1, TimeUnit.SECONDS)).M(1268)).u("Gyro is dead at %d", atomicLong.get());
        } else {
            j2 = 1000000000;
        }
        boolean z2 = j >= atomicLong2.get() + j2;
        if (z2) {
            ((sgt) ((sgt) a.c().g(1, TimeUnit.SECONDS)).M(1267)).u("OIS is dead at %d", atomicLong2.get());
        }
        boolean z3 = j >= j4 + j2;
        if (z3) {
            ((sgt) ((sgt) a.c().g(1, TimeUnit.SECONDS)).M(1266)).u("Camera metadata is dead at %d", j4);
        }
        this.k.f("processFrame");
        while (list.size() > 1) {
            try {
                long jLongValue = ((Long) list.get(1)).longValue();
                long j5 = atomicLong.get();
                if (!z && j5 < jLongValue) {
                    break;
                }
                long j6 = atomicLong2.get();
                if ((!z2 && j6 < jLongValue) || (!z3 && j4 < jLongValue)) {
                    break;
                }
                long jLongValue2 = ((Long) list.remove(0)).longValue();
                lnl lnlVarA = hpaVar.a(jLongValue2);
                if (lnlVarA != null) {
                    m(lnlVarA);
                    this.y = lnlVarA;
                } else {
                    ((sgt) ((sgt) a.c().g(1, TimeUnit.SECONDS)).M(1275)).u("No metadata for frame %d", jLongValue2);
                    d(jLongValue2);
                }
            } finally {
                this.k.g();
            }
        }
    }

    @Override // defpackage.hgj
    public final void f(long j, float f, float f2, String str) {
        long j2;
        Object obj = this.s;
        int iU = this.F.u(str);
        synchronized (obj) {
            obv obvVar = this.E;
            if (obvVar != null) {
                j2 = j;
                obvVar.j(f, f2, j2, iU);
            } else {
                j2 = j;
                Deque deque = this.u;
                if (deque.isEmpty() || ((hgl) deque.getFirst()).a - j2 < 500000000) {
                    deque.addLast(new hgl(j2, f, f2));
                } else {
                    ((sgt) ((sgt) a.c().g(1, TimeUnit.SECONDS)).M(1285)).u("Dropping lens offset at %d; should we be listening to this?", j2);
                }
            }
        }
        this.i.set(j2);
    }

    @Override // defpackage.hgj
    public final synchronized void g() {
        obv obvVar;
        int i;
        String str;
        synchronized (this.s) {
            boolean z = this.o;
            if (!z || (i = this.p) < 2 || (str = this.q) == null) {
                mwq mwqVar = this.F;
                inr inrVarV = mwqVar.v();
                pas pasVar = this.b;
                obvVar = new obv(inrVarV, pasVar.a, pasVar.b, this.d, mwqVar.x(z));
            } else {
                mwq mwqVar2 = this.F;
                inr inrVarV2 = mwqVar2.v();
                pas pasVar2 = this.b;
                obvVar = new obv(inrVarV2, pasVar2.a, pasVar2.b, this.d, mwqVar2.x(true), i, str);
            }
            boolean z2 = this.t;
            if (z2) {
                this.F.v();
            }
            this.E = obvVar;
            this.v = obvVar.d();
            obvVar.k();
            Deque deque = this.u;
            if (!deque.isEmpty()) {
                long j = ((hgl) deque.getLast()).a - ((hgl) deque.getFirst()).a;
                deque.size();
                TimeUnit.NANOSECONDS.toMillis(j);
                while (!deque.isEmpty()) {
                    if (z2) {
                        long j2 = ((hgl) deque.getLast()).a - ((hgl) deque.getFirst()).a;
                        TimeUnit.SECONDS.getClass();
                        deque.size();
                        TimeUnit.NANOSECONDS.toMillis(j2);
                    }
                    hgl hglVar = (hgl) deque.removeFirst();
                    float f = hglVar.b;
                    float f2 = hglVar.c;
                    long j3 = hglVar.a;
                    obvVar.j(f, f2, j3, 0);
                    if (z2) {
                        TimeUnit.SECONDS.getClass();
                        TimeUnit.NANOSECONDS.toMillis(j3);
                    }
                }
            }
        }
        this.w = this.j.b("mv-eis");
        this.x = true;
        this.A.set(0L);
        this.B.set(0L);
        this.C.set(0L);
    }

    @Override // defpackage.hgj
    public final synchronized void h() {
        pbn pbnVar = this.k;
        pbnVar.f("EisFrameFeeder#stop");
        pbnVar.f(CGlJpiVWrCQOq.mrEMbcy);
        while (true) {
            List list = this.h;
            if (list.isEmpty()) {
                break;
            }
            lnl lnlVarA = this.e.a(((Long) list.remove(0)).longValue());
            if (lnlVarA != null) {
                this.y = lnlVarA;
            }
            if (lnlVarA == null) {
                lnlVarA = this.y;
            }
            if (lnlVarA != null) {
                m(lnlVarA);
            }
        }
        Map map = this.r;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            d(((Long) it.next()).longValue());
        }
        map.clear();
        pbnVar.g();
        if (this.w != null) {
            this.w.close();
            this.w = null;
        }
        synchronized (this.s) {
            obv obvVar = this.E;
            if (obvVar != null) {
                obvVar.e();
                this.E = null;
            } else {
                ((sgt) a.b().M(1283)).s("stop called with a null eisNativeWrapper");
            }
        }
        this.x = false;
        this.A.get();
        this.C.get();
        this.B.get();
        this.k.g();
    }

    @Override // defpackage.hgj
    public final boolean i() {
        return this.x;
    }

    @Override // defpackage.hgj
    public final synchronized void j(jpp jppVar) {
        this.g.add(jppVar);
    }

    @Override // defpackage.hgj
    public final synchronized void k(jpp jppVar) {
        this.g.remove(jppVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m(lnl lnlVar) throws Throwable {
        float[] fArr;
        Object obj;
        int i;
        long jL;
        qib qibVarC;
        hgn hgnVarC = c(lnlVar);
        long j = hgnVarC.a;
        this.r.put(Long.valueOf(j), Long.valueOf(lnlVar.c));
        int i2 = this.v * 9;
        Object obj2 = this.s;
        float[] fArr2 = new float[i2];
        synchronized (obj2) {
            try {
                try {
                    obv obvVar = this.E;
                    if (obvVar != null) {
                        Rect rect = lnlVar.v;
                        obvVar.f(rect.width(), rect.height());
                        obv obvVar2 = this.E;
                        Rect rect2 = hgnVarC.e;
                        obvVar2.g(rect2.width(), rect2.height());
                        obv obvVar3 = this.E;
                        pas pasVar = this.b;
                        try {
                            int i3 = pasVar.a;
                            int i4 = pasVar.b;
                            try {
                                long j2 = hgnVarC.b;
                                try {
                                    long j3 = hgnVarC.d;
                                    try {
                                        long j4 = hgnVarC.c;
                                        try {
                                            float f = hgnVarC.f;
                                            int iU = this.F.u(hgnVarC.i);
                                            boolean z = hgnVarC.g;
                                            obj = obj2;
                                            i = 1;
                                            jL = obvVar3.l(i3, i4, j, j2, j3, j4, f, f, fArr2, iU, z);
                                            fArr = fArr2;
                                        } catch (Throwable th) {
                                            th = th;
                                            hgnVarC = obj2;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        hgnVarC = obj2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    hgnVarC = obj2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                hgnVarC = obj2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            hgnVarC = obj2;
                        }
                    } else {
                        fArr = fArr2;
                        obj = obj2;
                        i = 1;
                        ((sgt) ((sgt) a.b().g(1, TimeUnit.SECONDS)).M(1269)).s("processCameraMetadata called with a null eisNativeWrapper.");
                        jL = -1;
                    }
                    if (jL == -1) {
                        TimeUnit.SECONDS.getClass();
                        this.B.incrementAndGet();
                        return;
                    }
                    if (jL < -1) {
                        long j5 = -jL;
                        Long l = (Long) this.r.remove(Long.valueOf(j5));
                        if (l == null) {
                            ((sgt) ((sgt) a.b().g(i, TimeUnit.SECONDS)).M(1273)).u("eis timestamp does not exist: %d", j5);
                            return;
                        }
                        ((sgt) ((sgt) a.b().g(i, TimeUnit.SECONDS)).M(1272)).D(GdpuLBytnYW.Ldlupv, l, this.C.incrementAndGet());
                        d(l.longValue());
                        return;
                    }
                    Map map = this.r;
                    Long l2 = (Long) map.remove(Long.valueOf(jL));
                    if (l2 == null) {
                        ((sgt) ((sgt) a.b().g(i, TimeUnit.SECONDS)).M(1271)).u("processFrame returned unexpected EIS timestamp %d", jL);
                        return;
                    }
                    long jLongValue = l2.longValue();
                    ArrayList arrayList = new ArrayList();
                    int i5 = 0;
                    while (i5 < this.v) {
                        int i6 = i5 + 1;
                        if (this.l) {
                            String str = lnlVar.b;
                            Rect rect3 = lnlVar.p;
                            if (rect3 == null) {
                                rect3 = lnlVar.v;
                            }
                            mwq mwqVar = this.F;
                            if (mwqVar.w(str) != lcy.TELE_RM ? !(mwqVar.w(str) != lcy.TELE || rect3.width() > 1613) : rect3.width() <= 3226) {
                                qibVarC = qib.d();
                            }
                            arrayList.add(qibVarC);
                            i5 = i6;
                        }
                        qibVarC = qib.c(Arrays.copyOfRange(fArr, i5 * 9, i6 * 9));
                        arrayList.add(qibVarC);
                        i5 = i6;
                    }
                    for (jpp jppVar : this.g) {
                        if (!jppVar.h) {
                            jppVar.a(jLongValue).b.e(arrayList);
                            jppVar.d.post(new jmr(jppVar, 10));
                        }
                    }
                    TimeUnit.SECONDS.getClass();
                    this.A.incrementAndGet();
                    this.C.get();
                    this.B.get();
                    map.size();
                } catch (Throwable th6) {
                    th = th6;
                    hgnVarC = obj2;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }
}
