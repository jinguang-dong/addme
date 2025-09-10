package defpackage;

import android.os.SystemClock;
import com.google.android.apps.camera.jni.denoise.DenoiseNative;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kba extends ojl {
    final /* synthetic */ pdo a;
    final /* synthetic */ pdk b;
    final /* synthetic */ kbq c;
    final /* synthetic */ long d;
    final /* synthetic */ kbb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kba(kbb kbbVar, pdo pdoVar, pdk pdkVar, kbq kbqVar, long j) {
        super((short[]) null);
        this.a = pdoVar;
        this.b = pdkVar;
        this.c = kbqVar;
        this.d = j;
        this.e = kbbVar;
    }

    @Override // defpackage.ojl
    public final Executor dX() {
        return this.e.e;
    }

    @Override // defpackage.ojl
    public final void dY() {
        kbb kbbVar = this.e;
        pbn pbnVar = kbbVar.d;
        pbnVar.f("ReprocessingMoments#onComplete");
        try {
            pdk pdkVar = this.b;
            try {
                rwc rwcVar = kbbVar.b;
                if (rwcVar.h()) {
                    poj pojVarE = pdkVar.e((peo) rwcVar.c());
                    if (pojVarE == null) {
                        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Reprocessed image is null. input=" + String.valueOf(this.a) + " output=" + String.valueOf(pdkVar.b()));
                        ((sgt) ((sgt) kbb.a.c().i(unsupportedOperationException)).M(3198)).q();
                        this.c.b(unsupportedOperationException);
                    } else {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        sgv sgvVar = kbb.a;
                        sgt sgtVar = (sgt) sgvVar.c().M(3195);
                        pdo pdoVar = this.a;
                        sgtVar.G("Reprocessing complete from HAL, input=%s output=%s. latency %s ms", pdoVar, pdkVar.b(), Long.valueOf(jElapsedRealtime - this.d));
                        boolean zDenoiseImage = false;
                        if (kbbVar.c) {
                            poi poiVar = (poi) pojVarE.g().get(0);
                            poi poiVar2 = (poi) pojVarE.g().get(1);
                            poi poiVar3 = (poi) pojVarE.g().get(2);
                            zDenoiseImage = DenoiseNative.denoiseImage(pojVarE.c(), pojVarE.b(), poiVar.getBuffer(), poiVar.getPixelStride(), poiVar.getRowStride(), poiVar2.getBuffer(), poiVar2.getPixelStride(), poiVar2.getRowStride(), poiVar3.getBuffer(), poiVar3.getPixelStride(), poiVar3.getRowStride());
                            if (zDenoiseImage) {
                                SystemClock.elapsedRealtime();
                                pdkVar.b();
                                this.c.d(pojVarE, true, zDenoiseImage);
                            } else {
                                UnsupportedOperationException unsupportedOperationException2 = new UnsupportedOperationException("Image denoising failed. input=" + String.valueOf(pdoVar) + " output=" + String.valueOf(pdkVar.b()));
                                ((sgt) ((sgt) sgvVar.c().i(unsupportedOperationException2)).M(3197)).q();
                                this.c.b(unsupportedOperationException2);
                            }
                        } else {
                            this.c.d(pojVarE, true, zDenoiseImage);
                        }
                    }
                } else {
                    UnsupportedOperationException unsupportedOperationException3 = new UnsupportedOperationException("Reprocessing Stream is absent. input=" + String.valueOf(this.a) + " output=" + String.valueOf(pdkVar.b()));
                    ((sgt) ((sgt) kbb.a.c().i(unsupportedOperationException3)).M(3199)).q();
                    this.c.b(unsupportedOperationException3);
                }
                pdkVar.close();
                pbnVar.g();
            } finally {
            }
        } catch (Throwable th) {
            this.e.d.g();
            throw th;
        }
    }

    @Override // defpackage.ojl
    public final void dI() {
        sgt sgtVar = (sgt) kbb.a.c().M(3194);
        pdo pdoVar = this.a;
        pdk pdkVar = this.b;
        sgtVar.E(nWEkBGOQPWQp.sjwjHFKBN, pdoVar, pdkVar.b());
        pdkVar.close();
        this.c.a();
    }
}
