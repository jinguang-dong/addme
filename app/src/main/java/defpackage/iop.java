package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iop implements rvu {
    public static final iop a = new iop(0);
    private final /* synthetic */ int b;

    public iop(int i) {
        this.b = i;
    }

    @Override // defpackage.rvu
    public final /* synthetic */ Object apply(Object obj) {
        lnn lnnVar;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return Integer.valueOf(((lnm) obj).g);
            }
            if (i != 2) {
                return i != 3 ? i != 4 ? i != 5 ? Short.valueOf(((pcu) obj).i) : ((kmz) obj).b() : ((kmz) obj).a() : ((Boolean) obj).booleanValue() ? qpt.ci(CaptureRequest.CONTROL_AF_TRIGGER, 1) : qpt.cl();
            }
            kfv kfvVar = (kfv) ((mwq) obj).b;
            return Boolean.valueOf((kfvVar.a != lnm.CONTINUOUS_PICTURE || (lnnVar = kfvVar.b) == lnn.FOCUSED_LOCKED || lnnVar == lnn.NOT_FOCUSED_LOCKED) ? false : true);
        }
        List list = (List) obj;
        Object obj2 = list.get(0);
        obj2.getClass();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Object obj3 = list.get(1);
        obj3.getClass();
        return new iql(zBooleanValue && ((iqh) obj3) == iqh.URANUS);
    }
}
