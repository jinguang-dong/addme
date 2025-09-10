package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phu implements poe {
    private final qb a;
    private final ues b = new uez(new dus(this, 13));

    public phu(qb qbVar) {
        this.a = qbVar;
    }

    private final TotalCaptureResult i() {
        return (TotalCaptureResult) this.b.a();
    }

    @Override // defpackage.pnx
    public final Object a(CaptureResult.Key key) {
        key.getClass();
        return ((rv) this.a).b.b(key);
    }

    @Override // defpackage.pnx
    public final String b() {
        return ((rv) this.a).a;
    }

    @Override // defpackage.pnx
    public final long d() {
        return ((rv) this.a).b.a();
    }

    @Override // defpackage.pnx
    public final pnw e() {
        int i = ukb.a;
        return new pix((CaptureRequest) ((rv) this.a).c.c(new uji(CaptureRequest.class)));
    }

    @Override // defpackage.pnx
    public final int ew() {
        return i().getSequenceId();
    }

    @Override // defpackage.pnt
    public final Object ex(Class cls) {
        if (a.ao(cls, TotalCaptureResult.class)) {
            qb qbVar = this.a;
            int i = ukb.a;
            return qbVar.c(new uji(TotalCaptureResult.class));
        }
        if (!a.ao(cls, CaptureResult.class)) {
            return null;
        }
        qb qbVar2 = this.a;
        int i2 = ukb.a;
        return qbVar2.c(new uji(CaptureResult.class));
    }

    @Override // defpackage.pnx
    public final List f() {
        List<CaptureResult.Key<?>> keys = i().getKeys();
        keys.getClass();
        return keys;
    }

    @Override // defpackage.poe
    public final Map g() {
        Map<String, CaptureResult> physicalCameraResults = i().getPhysicalCameraResults();
        physicalCameraResults.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ske.aZ(physicalCameraResults.size()));
        Iterator<T> it = physicalCameraResults.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), new piz((CaptureResult) entry.getValue()));
        }
        return linkedHashMap;
    }

    @Override // defpackage.poe
    public final Map h() {
        Map<String, TotalCaptureResult> physicalCameraTotalResults = i().getPhysicalCameraTotalResults();
        physicalCameraTotalResults.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ske.aZ(physicalCameraTotalResults.size()));
        Iterator<T> it = physicalCameraTotalResults.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), new pjk((TotalCaptureResult) entry.getValue()));
        }
        return linkedHashMap;
    }

    @Override // defpackage.pns
    public final qaq j() {
        Log.w("CameraPipeCaptureResult", "Please use unwrapAndroidObject to prevent the extra object wrapper.");
        return new qaq(i());
    }
}
