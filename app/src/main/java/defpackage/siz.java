package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class siz extends sja {
    private final Map a;

    public siz(sij sijVar, sij sijVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(linkedHashMap, sijVar);
        e(linkedHashMap, sijVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((shl) entry.getKey()).b) {
                entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    private static void e(Map map, sij sijVar) {
        for (int i = 0; i < sijVar.b(); i++) {
            shl shlVarC = sijVar.c(i);
            Object obj = map.get(shlVarC);
            if (shlVarC.b) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(shlVarC, arrayList);
                }
                arrayList.add(shlVarC.c(sijVar.e(i)));
            } else {
                map.put(shlVarC, shlVarC.c(sijVar.e(i)));
            }
        }
    }

    @Override // defpackage.sja
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.sja
    public final Object b(shl shlVar) {
        ske.f(!shlVar.b, "key must be single valued");
        Object obj = this.a.get(shlVar);
        if (obj != null) {
            return obj;
        }
        return null;
    }

    @Override // defpackage.sja
    public final Set c() {
        return this.a.keySet();
    }

    @Override // defpackage.sja
    public final void d(siq siqVar, Object obj) {
        for (Map.Entry entry : this.a.entrySet()) {
            shl shlVar = (shl) entry.getKey();
            Object value = entry.getValue();
            if (shlVar.b) {
                siqVar.b(shlVar, ((List) value).iterator(), obj);
            } else {
                siqVar.a(shlVar, value, obj);
            }
        }
    }
}
