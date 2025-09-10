package defpackage;

import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fxg implements oyv {
    final Map a = new EnumMap(oyu.class);
    private final Object b = new Object();

    public final Map a() {
        sbv sbvVarAv;
        synchronized (this.b) {
            Map map = this.a;
            sbvVarAv = ujp.av(map);
            map.clear();
        }
        return sbvVarAv;
    }

    @Override // defpackage.oyv
    public final void c(oyu oyuVar) {
        synchronized (this.b) {
            Map map = this.a;
            Integer num = (Integer) map.get(oyuVar);
            if (num == null) {
                num = 0;
            }
            map.put(oyuVar, Integer.valueOf(num.intValue() + 1));
        }
    }
}
