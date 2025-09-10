package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzn implements tzk {
    public final Object a;

    public tzn(izm izmVar) {
        this.a = izmVar;
    }

    public tzn(Map map, Map map2) {
        if (!map.isEmpty()) {
            LinkedHashMap linkedHashMapAT = rnt.aT(((sfc) map).c + ((sfc) map2).c);
            linkedHashMapAT.putAll(map2);
            for (Map.Entry entry : ((sbv) map).entrySet()) {
                linkedHashMapAT.put(((Class) entry.getKey()).getName(), entry.getValue());
            }
            map2 = DesugarCollections.unmodifiableMap(linkedHashMapAT);
        }
        this.a = map2;
    }
}
