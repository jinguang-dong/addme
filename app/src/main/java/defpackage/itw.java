package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itw implements iuc {
    public final Map a = new LinkedHashMap();

    @Override // defpackage.iuc
    public final void a(iui iuiVar, long j) {
        iua iuaVar;
        iuiVar.getClass();
        Map map = this.a;
        synchronized (map) {
            Object iuaVar2 = map.get(iuiVar);
            if (iuaVar2 == null) {
                iuaVar2 = new iua();
                map.put(iuiVar, iuaVar2);
            }
            iuaVar = (iua) iuaVar2;
        }
        iuaVar.a(j);
    }
}
