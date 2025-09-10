package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jig implements paf {
    private final /* synthetic */ int a;

    @Override // defpackage.paf
    public final void a(Object obj) {
        int i = this.a;
        if (i == 0) {
            jic jicVar = (jic) obj;
            if (jicVar != null) {
                jicVar.c(false);
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        Map map = (Map) obj;
        HashMap map2 = new HashMap();
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            ((iqy) entry.getValue()).f.cancel(false);
            ((iqy) entry.getValue()).g.cancel(false);
            iqx iqxVar = new iqx((iqy) entry.getValue());
            iqxVar.c = new szh();
            iqxVar.d = new szh();
            map2.put((isj) entry.getKey(), iqxVar.a());
        }
        if (map.isEmpty()) {
            return;
        }
        map.clear();
        map.putAll(map2);
    }
}
