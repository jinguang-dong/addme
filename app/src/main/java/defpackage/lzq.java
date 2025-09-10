package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.android.apps.camera.jni.saliency.SaliencyPredictor;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzq implements AutoCloseable {
    public final synchronized rwc a(poj pojVar, lnl lnlVar) {
        Face[] faceArr;
        float fMin;
        int length;
        if (pojVar != null) {
            SaliencyPredictor saliencyPredictor = new SaliencyPredictor();
            if (saliencyPredictor.b.getAndSet(false)) {
                saliencyPredictor.a = SaliencyPredictor.nativeLoad(false);
            }
            try {
                List listG = pojVar.g();
                if (listG == null || listG.size() < 3) {
                    return rvk.a;
                }
                poi poiVar = (poi) listG.get(0);
                poi poiVar2 = (poi) listG.get(1);
                poi poiVar3 = (poi) listG.get(2);
                if (lnlVar != null) {
                    pnx pnxVar = lnlVar.a;
                    pnxVar.getClass();
                    faceArr = (Face[]) pnxVar.a(CaptureResult.STATISTICS_FACES);
                } else {
                    faceArr = null;
                }
                float[] fArr = new float[0];
                if (faceArr != null && (length = faceArr.length) > 0) {
                    fArr = new float[length * 4];
                    for (int i = 0; i < faceArr.length; i++) {
                        int i2 = i * 4;
                        fArr[i2] = faceArr[i].getBounds().left / 1.1f;
                        fArr[i2 + 1] = faceArr[i].getBounds().top / 1.1f;
                        fArr[i2 + 2] = faceArr[i].getBounds().right * 1.1f;
                        fArr[i2 + 3] = faceArr[i].getBounds().bottom * 1.1f;
                    }
                }
                Face[] faceArr2 = faceArr;
                float[] fArrNativeGetSaliencyHeatMap = saliencyPredictor.nativeGetSaliencyHeatMap(saliencyPredictor.a, pojVar.c(), pojVar.b(), poiVar.getBuffer(), poiVar.getPixelStride(), poiVar.getRowStride(), poiVar2.getBuffer(), poiVar2.getPixelStride(), poiVar2.getRowStride(), poiVar3.getBuffer(), poiVar3.getPixelStride(), poiVar3.getRowStride(), lnlVar != null ? lnlVar.v.right : 0.0f, lnlVar != null ? lnlVar.v.bottom : 0.0f, fArr);
                int length2 = fArrNativeGetSaliencyHeatMap.length;
                if (length2 == 0) {
                    return rwc.j(Float.valueOf(0.0f));
                }
                if ((length2 & 3) != 0) {
                    fMin = 1.0f;
                } else {
                    fMin = 1.0f;
                    for (int i3 = 0; i3 < (fArrNativeGetSaliencyHeatMap.length >> 2); i3++) {
                        int i4 = i3 * 4;
                        fMin = Math.min(fMin, Math.max(Math.max(Math.abs(fArrNativeGetSaliencyHeatMap[i4] - 0.5f), Math.abs(fArrNativeGetSaliencyHeatMap[i4 + 2] - 0.5f)), Math.max(Math.abs(fArrNativeGetSaliencyHeatMap[i4 + 1] - 0.5f), Math.abs(fArrNativeGetSaliencyHeatMap[i4 + 3] - 0.5f))));
                    }
                }
                rwc rwcVarJ = rwc.j(Float.valueOf(0.5f / (fMin * 1.1f)));
                if (((Float) ((rwg) rwcVarJ).a).floatValue() < 1.2f) {
                    rwcVarJ = rwc.j(Float.valueOf(0.0f));
                }
                if (((Float) ((rwg) rwcVarJ).a).floatValue() < 1.0f && faceArr2 != null && faceArr2.length >= 2) {
                    rwcVarJ = rvk.a;
                }
                saliencyPredictor.a();
                return rwcVarJ;
            } catch (IllegalStateException unused) {
            }
        }
        return rvk.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
