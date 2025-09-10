package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bw implements des {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bw(dx dxVar, int i) {
        this.b = i;
        this.a = dxVar;
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [bfx, java.lang.Object] */
    @Override // defpackage.des
    public final Bundle a() {
        int i = this.b;
        if (i == 0) {
            return ((ch) this.a).b();
        }
        if (i == 1) {
            bp bpVar = (bp) this.a;
            bpVar.e();
            bpVar.d.b(cwa.ON_STOP);
            return new Bundle();
        }
        if (i == 2) {
            Bundle bundle = new Bundle();
            ((dx) this.a).i();
            return bundle;
        }
        if (i == 3) {
            Bundle bundle2 = new Bundle();
            og ogVar = ((nh) this.a).h;
            Map map = ogVar.b;
            bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
            bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
            bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(ogVar.d));
            bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(ogVar.g));
            return bundle2;
        }
        int i2 = bzi.a;
        Map mapB = this.a.b();
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry : mapB.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            bundle3.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        return bundle3;
    }

    public /* synthetic */ bw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
