package defpackage;

import android.graphics.Rect;
import android.os.SystemClock;
import com.google.android.apps.camera.processing.imagebackend.ImgUtilNative;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmq extends lmp {
    private final lmh a;
    private final jiz b;
    private final pbn i;
    private final lmi j;

    public lmq(lmg lmgVar, Executor executor, lly llyVar, lmh lmhVar, lss lssVar, lmi lmiVar, jiz jizVar, pbn pbnVar) {
        super(lmgVar, executor, llyVar, 1, lssVar);
        this.a = lmhVar;
        this.j = lmiVar;
        this.b = jizVar;
        this.i = pbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.f("LuckyShot");
        tpc tpcVarM = srq.a.m();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        srq srqVar = (srq) tpcVarM.b;
        srqVar.b |= 1;
        srqVar.c = jElapsedRealtimeNanos;
        lmi lmiVar = this.j;
        lmg lmgVar = this.e;
        pbn pbnVar = lmiVar.b;
        long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
        pbnVar.f("LuckyShotScore");
        poj pojVar = lmgVar.a;
        poi poiVar = (poi) pojVar.g().get(0);
        int iC = pojVar.c();
        int iB = pojVar.b();
        ByteBuffer buffer = poiVar.getBuffer();
        int pixelStride = poiVar.getPixelStride();
        int rowStride = poiVar.getRowStride();
        Rect rect = lmgVar.e;
        double dMeasureSharpnessOnEdgeGivenCropNative = ImgUtilNative.measureSharpnessOnEdgeGivenCropNative(iC, iB, buffer, pixelStride, rowStride, rect.left, rect.top, rect.right, rect.bottom);
        pbnVar.g();
        if (dMeasureSharpnessOnEdgeGivenCropNative <= 0.0d) {
            ((sgt) lmi.a.c().M(4235)).s("invalid metric value from LS metric calculation.");
        }
        rwc rwcVarJ = rwc.j(new jix(jiy.LUCKY_SHOT_DEFAULT_METRIC, (float) dMeasureSharpnessOnEdgeGivenCropNative, SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos2));
        long jElapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        srq srqVar2 = (srq) tpcVarM.b;
        srqVar2.b |= 2;
        srqVar2.d = jElapsedRealtimeNanos3;
        jiz jizVar = this.b;
        srq srqVar3 = (srq) tpcVarM.l();
        synchronized (jizVar.a) {
            if (jizVar.f == null) {
                jizVar.f = new ArrayList();
            }
            jizVar.f.add(srqVar3);
        }
        lmh lmhVar = this.a;
        lmg lmgVar2 = this.e;
        jiz jizVar2 = this.b;
        lmg lmgVarD = lmhVar.d(lmgVar2, dMeasureSharpnessOnEdgeGivenCropNative);
        tpc tpcVarM2 = sro.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        Object obj = ((rwg) rwcVarJ).a;
        tph tphVar = tpcVarM2.b;
        sro sroVar = (sro) tphVar;
        sroVar.b |= 1;
        sroVar.c = -1;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        tph tphVar2 = tpcVarM2.b;
        sro sroVar2 = (sro) tphVar2;
        sroVar2.b |= 2;
        jix jixVar = (jix) obj;
        sroVar2.d = jixVar.b;
        if (!tphVar2.C()) {
            tpcVarM2.o();
        }
        tph tphVar3 = tpcVarM2.b;
        sro sroVar3 = (sro) tphVar3;
        sroVar3.b |= 4;
        sroVar3.e = 0.0f;
        if (!tphVar3.C()) {
            tpcVarM2.o();
        }
        tph tphVar4 = tpcVarM2.b;
        sro sroVar4 = (sro) tphVar4;
        sroVar4.b |= 8;
        sroVar4.f = 0.0f;
        long j = jixVar.c;
        if (!tphVar4.C()) {
            tpcVarM2.o();
        }
        sro sroVar5 = (sro) tpcVarM2.b;
        sroVar5.b |= 16;
        sroVar5.g = j;
        sro sroVar6 = (sro) tpcVarM2.l();
        jiy jiyVar = jixVar.a;
        synchronized (jizVar2.a) {
            jizVar2.b.add(sroVar6);
            jizVar2.c.add(jiyVar);
        }
        if (lmgVarD != null) {
            this.h.b(lmgVarD.a, this.c);
        }
        this.i.g();
    }
}
