package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class phm implements qb {
    public final TotalCaptureResult a;

    public phm(TotalCaptureResult totalCaptureResult) {
        this.a = totalCaptureResult;
        new phn(totalCaptureResult);
        Map<String, TotalCaptureResult> physicalCameraTotalResults = totalCaptureResult.getPhysicalCameraTotalResults();
        physicalCameraTotalResults.getClass();
        if (physicalCameraTotalResults.isEmpty()) {
            return;
        }
        ArrayMap arrayMap = new ArrayMap(physicalCameraTotalResults.size());
        for (Map.Entry<String, TotalCaptureResult> entry : physicalCameraTotalResults.entrySet()) {
            String key = entry.getKey();
            pp.b(key);
            arrayMap.put(new pp(key), new phn(entry.getValue()));
        }
    }

    @Override // defpackage.ri
    public final Object c(ukx ukxVar) {
        throw null;
    }
}
