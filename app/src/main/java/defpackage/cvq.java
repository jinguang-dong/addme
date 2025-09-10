package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
final class cvq {
    final Map a = new HashMap();
    final Map b;

    public cvq(Map map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            cwa cwaVar = (cwa) entry.getValue();
            List arrayList = (List) this.a.get(cwaVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(cwaVar, arrayList);
            }
            arrayList.add((cvr) entry.getKey());
        }
    }

    public static void a(List list, cwh cwhVar, cwa cwaVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            cvr cvrVar = (cvr) list.get(size);
            try {
                int i = cvrVar.a;
                if (i == 0) {
                    cvrVar.b.invoke(obj, null);
                } else if (i != 1) {
                    cvrVar.b.invoke(obj, cwhVar, cwaVar);
                } else {
                    cvrVar.b.invoke(obj, cwhVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }
    }
}
