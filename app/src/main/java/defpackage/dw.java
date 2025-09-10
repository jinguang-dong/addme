package defpackage;

import android.os.Bundle;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dw implements nz {
    final /* synthetic */ nh a;
    private final /* synthetic */ int b;

    public dw(dx dxVar, int i) {
        this.b = i;
        this.a = dxVar;
    }

    public /* synthetic */ dw(nh nhVar, int i) {
        this.b = i;
        this.a = nhVar;
    }

    @Override // defpackage.nz
    public final void a() {
        int i = this.b;
        if (i == 0) {
            nh nhVar = this.a;
            dz dzVarI = ((dx) nhVar).i();
            dzVarI.e();
            nhVar.getSavedStateRegistry().a(mPfBwqXsnpXI.wxQQlg);
            dzVarI.o();
            return;
        }
        if (i == 1) {
            Object obj = ((bp) this.a).e.a;
            bu buVar = (bu) obj;
            buVar.e.m(buVar, (br) obj, null);
            return;
        }
        nh nhVar2 = this.a;
        Bundle bundleA = nhVar2.getSavedStateRegistry().a("android:support:activity-result");
        if (bundleA != null) {
            og ogVar = nhVar2.h;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                ogVar.d.addAll(stringArrayList2);
            }
            Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle != null) {
                ogVar.g.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = stringArrayList.get(i2);
                Map map = ogVar.b;
                if (map.containsKey(str)) {
                    Integer num = (Integer) map.remove(str);
                    if (!ogVar.g.containsKey(str)) {
                        Map map2 = ogVar.a;
                        ukc.g(map2);
                        map2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i2);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i2);
                str2.getClass();
                ogVar.c(iIntValue, str2);
            }
        }
    }
}
