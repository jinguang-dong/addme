package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rv implements qb {
    public final String a;
    public final rw b;
    public final sy c;
    private final TotalCaptureResult d;

    public rv(TotalCaptureResult totalCaptureResult, String str, sy syVar) {
        str.getClass();
        syVar.getClass();
        this.d = totalCaptureResult;
        this.a = str;
        this.c = syVar;
        this.b = new rw(totalCaptureResult, str);
        try {
            Trace.beginSection("physicalCaptureResults");
            Map<String, TotalCaptureResult> physicalCameraTotalResults = totalCaptureResult.getPhysicalCameraTotalResults();
            physicalCameraTotalResults.getClass();
            if (physicalCameraTotalResults != null && !physicalCameraTotalResults.isEmpty()) {
                ArrayMap arrayMap = new ArrayMap(physicalCameraTotalResults.size());
                for (Map.Entry<String, TotalCaptureResult> entry : physicalCameraTotalResults.entrySet()) {
                    String key = entry.getKey();
                    pp.b(key);
                    arrayMap.put(new pp(key), new rw(entry.getValue(), key));
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.ri
    public final Object c(ukx ukxVar) {
        int i = ukb.a;
        if (a.ao(ukxVar, new uji(CaptureResult.class))) {
            return this.d;
        }
        if (a.ao(ukxVar, new uji(TotalCaptureResult.class))) {
            return this.d;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameInfo(camera: ");
        rw rwVar = this.b;
        sb.append((Object) pp.a(rwVar.b));
        sb.append(", frameNumber: ");
        sb.append(rwVar.a());
        sb.append(')');
        return sb.toString();
    }
}
