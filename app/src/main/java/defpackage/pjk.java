package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pjk extends piz implements poe {
    private final TotalCaptureResult a;
    private volatile Map b;
    private volatile Map c;

    public pjk(TotalCaptureResult totalCaptureResult) {
        super(totalCaptureResult);
        this.b = null;
        this.c = null;
        this.a = totalCaptureResult;
    }

    @Override // defpackage.piz, defpackage.pnt
    public final Object ex(Class cls) {
        return this.a;
    }

    @Override // defpackage.poe
    public final Map g() {
        Map map;
        Map map2 = this.c;
        if (map2 != null) {
            return map2;
        }
        synchronized (this) {
            map = this.c;
            if (map == null) {
                map = (sbv) smz.j(this.a.getPhysicalCameraResults()).i(new mdn(9)).c(new ndu(14)).d(new jge(9)).collect(ryv.a(new ndu(15), new ndu(16)));
                this.c = map;
            }
        }
        return map;
    }

    @Override // defpackage.poe
    public final Map h() {
        Map map;
        Map map2 = this.b;
        if (map2 != null) {
            return map2;
        }
        synchronized (this) {
            map = this.b;
            if (map == null) {
                map = (sbv) smz.j(this.a.getPhysicalCameraTotalResults()).i(new mdn(10)).c(new ndu(17)).d(new jge(10)).collect(ryv.a(new ndu(15), new ndu(18)));
                this.b = map;
            }
        }
        return map;
    }

    @Override // defpackage.pns
    public final qaq j() {
        return new qaq(this.a);
    }

    public final String toString() {
        rwb rwbVar = new rwb("TotalCaptureResult");
        rwbVar.f("FrameNumber", d());
        rwbVar.e("SequenceNumber", ew());
        return rwbVar.toString();
    }
}
