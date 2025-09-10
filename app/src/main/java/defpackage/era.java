package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class era {
    private static final eqw a = new eqy();
    private final Map b = new HashMap();

    public final synchronized eqx a(Object obj) {
        eqw eqwVar;
        eoz.k(obj);
        Map map = this.b;
        eqwVar = (eqw) map.get(obj.getClass());
        if (eqwVar == null) {
            Iterator it = map.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                eqw eqwVar2 = (eqw) it.next();
                if (eqwVar2.b().isAssignableFrom(obj.getClass())) {
                    eqwVar = eqwVar2;
                    break;
                }
            }
        }
        if (eqwVar == null) {
            eqwVar = a;
        }
        return eqwVar.a(obj);
    }

    public final synchronized void b(eqw eqwVar) {
        this.b.put(eqwVar.b(), eqwVar);
    }
}
