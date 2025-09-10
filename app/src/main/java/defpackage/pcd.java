package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pcd implements pai {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public pcd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, pjp] */
    @Override // defpackage.pai
    public final /* synthetic */ Object a(Object obj) {
        if (this.b == 0) {
            return Boolean.valueOf(obj.l() == this.a);
        }
        if (!obj.M() || !obj.D()) {
            z = false;
            break;
        }
        Object obj2 = this.a;
        Iterator it = ((pjn) obj).b.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((pjn) ((pit) obj2).a.a((pjr) it.next())).o(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT);
            if (num.intValue() != 0 && num.intValue() != 2 && num.intValue() != 3 && num.intValue() != 4) {
                z = false;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
