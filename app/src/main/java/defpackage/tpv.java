package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpv extends AbstractMap {
    public final tpr a;
    private final Map b;

    public tpv(Map map, tpr tprVar) {
        this.b = map;
        this.a = tprVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new tpu(this, this.b.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2 = this.b.get(obj);
        if (obj2 == null) {
            return null;
        }
        return this.a.a(obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut = this.b.put(obj, Integer.valueOf(((tpk) obj2).a()));
        if (objPut == null) {
            return null;
        }
        return this.a.a(objPut);
    }
}
