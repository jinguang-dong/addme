package defpackage;

import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfo {
    public final List a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfo) && a.ao(this.a, ((cfo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public cfo(cfl... cflVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (cfl cflVar : cflVarArr) {
            String strA = cflVar.a();
            Object arrayList = linkedHashMap.get(strA);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strA, arrayList);
            }
            ((List) arrayList).add(cflVar);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                ske.bT(arrayList2, list);
            } else {
                throw new IllegalArgumentException(mNLbzhCxd.jDRABl + str + "' must be unique. Actual [ [" + ske.ca(list, null, null, null, null, 63) + ']');
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.a = arrayList3;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            ((cfl) arrayList3.get(i)).b();
        }
    }
}
