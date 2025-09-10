package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tzv extends tzq {
    public static final tzx b = tzu.b(Collections.EMPTY_MAP);

    public tzv(Map map) {
        super(map);
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map a() {
        Map map = this.a;
        LinkedHashMap linkedHashMapAT = rnt.aT(map.size());
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMapAT.put(entry.getKey(), ((tzx) entry.getValue()).a());
        }
        return DesugarCollections.unmodifiableMap(linkedHashMapAT);
    }
}
