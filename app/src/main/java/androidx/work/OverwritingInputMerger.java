package androidx.work;

import defpackage.cij;
import defpackage.dvx;
import defpackage.dwd;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OverwritingInputMerger extends dwd {
    @Override // defpackage.dwd
    public final dvx a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((dvx) it.next()).b);
            mapUnmodifiableMap.getClass();
            linkedHashMap2.putAll(mapUnmodifiableMap);
        }
        cij.t(linkedHashMap2, linkedHashMap);
        return cij.s(linkedHashMap);
    }
}
