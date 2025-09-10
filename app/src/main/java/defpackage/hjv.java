package defpackage;

import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify2;
import com.google.android.apps.camera.jni.facebeautification.GpuRetoucherNative;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjv implements hke {
    public final Executor a;
    private final pbc b;
    private long c = 0;
    private final kjc d;
    private final hbj e;

    public hjv(kjc kjcVar, Executor executor, hbj hbjVar, pbc pbcVar) {
        this.d = kjcVar;
        this.a = executor;
        this.e = hbjVar;
        this.b = pbcVar.a("GpuFBCtrl");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, poj] */
    @Override // defpackage.hke
    public final syu a(hkk hkkVar) {
        return !((ltr) hkkVar.d).b() ? ske.M(new hjt(hkkVar.a)) : this.d.a(new hkm(this, hkkVar, 1));
    }

    public final synchronized void b() {
        long j = this.c;
        if (j != 0) {
            GpuRetoucherNative.releaseRetoucher(j);
            this.c = 0L;
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.a.execute(new hbv(this, 7));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, poj] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, poj] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, poj] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, poe] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, poj] */
    public final synchronized hkd c(hkk hkkVar) {
        long jCreateRetoucher = this.c;
        if (jCreateRetoucher == 0) {
            Object obj = hkkVar.d;
            gzi gziVar = gyw.a;
            int iOrdinal = ((ltr) obj).ordinal();
            jCreateRetoucher = GpuRetoucherNative.createRetoucher(true, (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? 1 : 0);
            this.c = jCreateRetoucher;
        }
        rnt.L(jCreateRetoucher != 0);
        HardwareBuffer hardwareBufferF = hkkVar.a.f();
        try {
            hardwareBufferF.getClass();
            boolean z = hardwareBufferF.getFormat() == 1;
            hardwareBufferF.close();
            sbp sbpVarAg = ezh.ag(hkkVar.b);
            if (sbpVarAg.isEmpty()) {
                return new hjt(hkkVar.a);
            }
            ?? r5 = hkkVar.a;
            hardwareBufferF = r5.f();
            try {
                hardwareBufferF.getClass();
                this.b.g("Running GPU face retouch on an image of size " + r5.c() + uCzt.ZXXpncPtvOEC + r5.b());
                long j = this.c;
                boolean z2 = z ^ true;
                int iC = r5.c();
                int iB = r5.b();
                FaceToBeautify2[] faceToBeautify2Arr = (FaceToBeautify2[]) sbpVarAg.toArray(new FaceToBeautify2[0]);
                Object obj2 = hkkVar.d;
                obj2.getClass();
                GpuRetoucherNative.process(j, hardwareBufferF, z2, hardwareBufferF, z2, iC, iB, faceToBeautify2Arr, ((ltr) obj2).f);
                hardwareBufferF.close();
                return new hjs(hkkVar.a, null, (ltr) hkkVar.d);
            } finally {
            }
        } finally {
        }
    }
}
