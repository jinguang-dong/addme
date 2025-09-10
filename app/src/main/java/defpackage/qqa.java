package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qqa {
    public abstract tqr a(String str, Object obj);

    public abstract tqr b(tqr tqrVar, tqr tqrVar2);

    public abstract String c(tqr tqrVar);

    public final List d(Map map) {
        tqr tqrVarA;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (tqrVarA = a((String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(tqrVarA);
            }
        }
        return arrayList;
    }

    public final List e(List list, List list2) {
        tqr tqrVar;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tqr tqrVar2 = (tqr) it.next();
            String strC = c(tqrVar2);
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    tqrVar = null;
                    break;
                }
                tqrVar = (tqr) it2.next();
                if (strC.equals(c(tqrVar))) {
                    break;
                }
            }
            tqr tqrVarB = b(tqrVar2, tqrVar);
            if (tqrVarB != null) {
                arrayList.add(tqrVarB);
            }
        }
        return arrayList;
    }
}
