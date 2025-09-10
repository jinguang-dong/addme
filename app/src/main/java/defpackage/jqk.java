package defpackage;

import android.hardware.HardwareBuffer;
import android.os.SystemClock;
import com.google.android.apps.camera.moments.FastMomentsHdrImpl;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.NormalizedRect;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jqk implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    private final /* synthetic */ int i;

    public /* synthetic */ jqk(FastMomentsHdrImpl fastMomentsHdrImpl, poj pojVar, kbk kbkVar, NormalizedRect normalizedRect, ShotMetadata shotMetadata, kbj kbjVar, HardwareBuffer hardwareBuffer, jyr jyrVar, int i) {
        this.i = i;
        this.b = fastMomentsHdrImpl;
        this.c = pojVar;
        this.g = kbkVar;
        this.d = normalizedRect;
        this.e = shotMetadata;
        this.h = kbjVar;
        this.f = hardwareBuffer;
        this.a = jyrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, poj] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, owq, pau] */
    /* JADX WARN: Type inference failed for: r1v47, types: [owf[]] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v35, types: [owf[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v5, types: [hpa] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v2, types: [hpb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [owf] */
    /* JADX WARN: Type inference failed for: r7v10, types: [int] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r8v3, types: [tgp] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HardwareBuffer hardwareBuffer;
        long jElapsedRealtimeNanos;
        RawWriteView rawWriteViewB;
        AeShotParams aeShotParams;
        long j;
        long jE;
        long jA;
        long jA2;
        Object obj;
        HardwareBuffer hardwareBufferProcessRaw10ToYuvHardwareBufferNative;
        char c;
        Object obj2;
        int i = this.i;
        if (i == 0) {
            ?? r1 = this.a;
            r1.f("MICRO_GyroModule#runGyroStartupTask");
            jkf jkfVar = new jkf(((hbp) this.c.a()).t(), 9);
            our ourVar = (our) this.b;
            ourVar.d(jkfVar);
            ?? r3 = this.d;
            ((hpj) r3.a()).i("microvideo-metadata");
            ourVar.d(new jkf(r3, 10));
            ((hpa) this.e.a()).c(this.f, this.g);
            rwc rwcVar = (rwc) this.h;
            if (rwcVar.h()) {
                ((hgj) rwcVar.c()).g();
                ourVar.d(new jkf((hgj) rwcVar.c(), 11));
            }
            r1.g();
            return;
        }
        byte[] bArr = null;
        if (i == 1) {
            ?? r12 = this.c;
            r12.a(false);
            Object obj3 = this.g;
            Object obj4 = this.b;
            our ourVar2 = (our) obj3;
            ourVar2.d(((fja) obj4).o((ggg) this.a));
            ourVar2.d(((fib) this.f).a().dK(r12, sxo.a));
            if (((hbj) this.h).o(gyi.l)) {
                Object obj5 = this.e;
                rwc rwcVar2 = (rwc) obj5;
                if (rwcVar2.h()) {
                    pfu pfuVar = (pfu) this.d;
                    pdn pdnVarC = pfuVar.c(pfuVar.d((peo) rwcVar2.c()), ((peo) rwcVar2.c()).c().f);
                    ourVar2.d(pdnVarC);
                    pdnVarC.l(new fmz(obj5, obj4, 1, bArr));
                    return;
                }
                return;
            }
            return;
        }
        int i2 = 3;
        if (i != 2) {
            Object obj6 = this.g;
            Object obj7 = this.f;
            owf owfVarA = owl.a(new owf[]{((lae) obj6).c(), obj7});
            Object obj8 = this.a;
            Object obj9 = this.e;
            fcd fcdVar = new fcd(obj8, obj6, obj9, 8);
            sxo sxoVar = sxo.a;
            paq paqVarDK = owfVarA.dK(fcdVar, sxoVar);
            our ourVar3 = (our) this.d;
            ourVar3.d(paqVarDK);
            boolean zEquals = ((nkw) this.c).equals(nkw.SERENGETI);
            Object obj10 = this.h;
            if (!zEquals) {
                ourVar3.d(((qrh) obj10).f.dK(new fun(obj6, obj9, 18), sxoVar));
                return;
            } else {
                gzi gziVar = gzp.a;
                ourVar3.d(owl.a(new owf[]{((qrh) obj10).f, obj7}).dK(new ktd(obj8, obj9, i2, bArr), sxoVar));
                return;
            }
        }
        Object obj11 = this.f;
        Object obj12 = this.h;
        Object obj13 = this.e;
        Object obj14 = this.d;
        Object obj15 = this.g;
        ?? r122 = this.c;
        Object obj16 = this.b;
        try {
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            rawWriteViewB = ((FastMomentsHdrImpl) obj16).e.b(r122);
            Object obj17 = ((kbk) obj15).c;
            aeShotParams = new AeShotParams(GcamModuleJNI.new_AeShotParams__SWIG_1(((AeShotParams) obj17).a, (AeShotParams) obj17), true);
            aeShotParams.k(false);
            j = aeShotParams.a;
            jE = RawWriteView.e(rawWriteViewB);
            jA = NormalizedRect.a((NormalizedRect) obj14);
            jA2 = ShotMetadata.a((ShotMetadata) obj13);
            hardwareBuffer = ((kbj) obj12).e;
            obj = this.a;
        } catch (Throwable th) {
            th = th;
            hardwareBuffer = obj11;
        }
        try {
            if (hardwareBuffer == 3) {
                long j2 = ((FastMomentsHdrImpl) obj16).b;
                long jA3 = Gcam.a(((FastMomentsHdrImpl) obj16).c);
                int i3 = ((kbk) obj15).a;
                pas pasVar = ((kbj) obj12).a;
                long jProcessRaw10ToYuvImageNative = ((FastMomentsHdrImpl) obj16).processRaw10ToYuvImageNative(j2, jA3, i3, (HardwareBuffer) obj11, jE, j, jA, pasVar.a, pasVar.b, ((kbj) obj12).c.e, jA2, ((kbj) obj12).b);
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                ((FastMomentsHdrImpl) obj16).a.b("processRaw10ToYuv, total time: " + TimeUnit.MILLISECONDS.convert(jElapsedRealtimeNanos2 - jElapsedRealtimeNanos, TimeUnit.NANOSECONDS) + "ms");
                if (jProcessRaw10ToYuvImageNative == 0) {
                    ((jyr) obj).b(new RuntimeException("Error processing raw10 to Yuv image"));
                } else {
                    YuvImage yuvImage = new YuvImage(jProcessRaw10ToYuvImageNative);
                    Object obj18 = ((kbk) obj15).b;
                    ((jyr) obj).a.l();
                    kbz kbzVar = ((jyr) obj).b;
                    poj pojVarA = ((jyr) obj).i.a.a(new jzw((ltr) kbzVar.b, Long.valueOf(((jyr) obj).c), ske.M(((jyr) obj).d), kbzVar.a), rup.t(yuvImage), ((jyr) obj).e, (ShotMetadata) obj18);
                    ((jyr) obj).f.close();
                    ((jyr) obj).g.c(pojVarA);
                }
                hardwareBuffer = obj11;
            } else {
                if (hardwareBuffer == 1) {
                    long j3 = ((FastMomentsHdrImpl) obj16).b;
                    long jA4 = Gcam.a(((FastMomentsHdrImpl) obj16).c);
                    int i4 = ((kbk) obj15).a;
                    Object obj19 = obj11;
                    long j4 = ((kbj) obj12).d;
                    pas pasVar2 = ((kbj) obj12).a;
                    hardwareBufferProcessRaw10ToYuvHardwareBufferNative = ((FastMomentsHdrImpl) obj16).processRaw10ToRgbaHardwareBufferNative(j3, jA4, i4, j4, (HardwareBuffer) obj19, jE, j, jA, pasVar2.a, pasVar2.b, ((kbj) obj12).c.e, jA2, ((kbj) obj12).b);
                    c = 1;
                    obj2 = obj19;
                } else {
                    Object obj20 = obj11;
                    long j5 = ((FastMomentsHdrImpl) obj16).b;
                    long jA5 = Gcam.a(((FastMomentsHdrImpl) obj16).c);
                    int i5 = ((kbk) obj15).a;
                    long j6 = ((kbj) obj12).d;
                    pas pasVar3 = ((kbj) obj12).a;
                    hardwareBufferProcessRaw10ToYuvHardwareBufferNative = ((FastMomentsHdrImpl) obj16).processRaw10ToYuvHardwareBufferNative(j5, jA5, i5, j6, (HardwareBuffer) obj20, jE, j, jA, pasVar3.a, pasVar3.b, ((kbj) obj12).c.e, jA2, ((kbj) obj12).b);
                    c = 2;
                    obj2 = obj20;
                }
                long jElapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos();
                ((FastMomentsHdrImpl) obj16).a.b("processRaw10ToHardwareBuffer, total time: " + TimeUnit.MILLISECONDS.convert(jElapsedRealtimeNanos3 - jElapsedRealtimeNanos, TimeUnit.NANOSECONDS) + "ms");
                if (hardwareBufferProcessRaw10ToYuvHardwareBufferNative == null) {
                    ((jyr) obj).b(new RuntimeException("Error processing raw10 to HardwareBuffer"));
                    hardwareBuffer = obj2;
                } else if (c == 1) {
                    Object obj21 = ((kbk) obj15).b;
                    ((jyr) obj).a.l();
                    poj pojVarA2 = ((jyr) obj).a(hardwareBufferProcessRaw10ToYuvHardwareBufferNative, (ShotMetadata) obj21);
                    ((jyr) obj).f.close();
                    ((jyr) obj).g.c(pojVarA2);
                    hardwareBuffer = obj2;
                } else {
                    Object obj22 = ((kbk) obj15).b;
                    ((jyr) obj).a.l();
                    poj pojVarA3 = ((jyr) obj).a(hardwareBufferProcessRaw10ToYuvHardwareBufferNative, (ShotMetadata) obj22);
                    ((jyr) obj).f.close();
                    ((jyr) obj).g.c(pojVarA3);
                    hardwareBuffer = obj2;
                }
            }
            aeShotParams.toString();
            rawWriteViewB.toString();
            hardwareBuffer.close();
        } catch (Throwable th2) {
            th = th2;
            hardwareBuffer.close();
            throw th;
        }
    }

    public /* synthetic */ jqk(our ourVar, lae laeVar, fua fuaVar, jvb jvbVar, pfu pfuVar, nkw nkwVar, hbj hbjVar, qrh qrhVar, int i) {
        this.i = i;
        this.d = ourVar;
        this.g = laeVar;
        this.f = fuaVar;
        this.a = jvbVar;
        this.e = pfuVar;
        this.c = nkwVar;
        this.b = hbjVar;
        this.h = qrhVar;
    }

    public /* synthetic */ jqk(owq owqVar, our ourVar, fja fjaVar, ggg gggVar, fib fibVar, hbj hbjVar, rwc rwcVar, pfu pfuVar, int i) {
        this.i = i;
        this.c = owqVar;
        this.g = ourVar;
        this.b = fjaVar;
        this.a = gggVar;
        this.f = fibVar;
        this.h = hbjVar;
        this.e = rwcVar;
        this.d = pfuVar;
    }

    public /* synthetic */ jqk(pbn pbnVar, our ourVar, uem uemVar, uem uemVar2, uem uemVar3, jqb jqbVar, Executor executor, rwc rwcVar, int i) {
        this.i = i;
        this.a = pbnVar;
        this.b = ourVar;
        this.c = uemVar;
        this.d = uemVar2;
        this.e = uemVar3;
        this.f = jqbVar;
        this.g = executor;
        this.h = rwcVar;
    }
}
