package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hth implements rvu {
    private final /* synthetic */ int c;
    public static final hth b = new hth(2);
    public static final hth a = new hth(0);

    public hth(int i) {
        this.c = i;
    }

    @Override // defpackage.rvu
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.c;
        boolean z = false;
        if (i == 0) {
            List list = (List) obj;
            Object obj2 = list.get(0);
            obj2.getClass();
            Object obj3 = list.get(1);
            obj3.getClass();
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = list.get(2);
            obj4.getClass();
            String str = (String) obj4;
            int iOrdinal = ((hvb) obj2).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new uet();
                    }
                    z = true;
                }
            } else if (zBooleanValue || a.ao(str, "on")) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (i == 1) {
            List list2 = (List) obj;
            if (list2 == null || list2.isEmpty()) {
                return 0;
            }
            return Integer.valueOf(Math.max(((Integer) sel.a.e(list2)).intValue(), 0));
        }
        if (i == 2) {
            List list3 = (List) obj;
            Object obj5 = list3.get(0);
            obj5.getClass();
            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
            Object obj6 = list3.get(1);
            obj6.getClass();
            float fFloatValue = ((Float) obj6).floatValue();
            if (zBooleanValue2 && fFloatValue > 140.0f) {
                z = true;
            }
            return new iqk(zBooleanValue2, z);
        }
        ArrayList arrayList = new ArrayList();
        for (poe poeVar : (List) obj) {
            rwb rwbVar = new rwb("Metadata");
            rwbVar.b("timestamp", poeVar.a(CaptureResult.SENSOR_TIMESTAMP));
            rwbVar.b("NR", poeVar.a(CaptureResult.NOISE_REDUCTION_MODE));
            rwbVar.b("EDGE", poeVar.a(CaptureResult.EDGE_MODE));
            rwbVar.b("REEF", poeVar.a(CaptureResult.REPROCESS_EFFECTIVE_EXPOSURE_FACTOR));
            rwbVar.b("Jpeg Qual", poeVar.a(CaptureResult.JPEG_QUALITY));
            arrayList.add(rwbVar.toString());
        }
        return arrayList.toString();
    }
}
