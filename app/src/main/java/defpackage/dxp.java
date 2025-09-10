package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxp implements dxo {
    private final Map a = new LinkedHashMap();

    @Override // defpackage.dxo
    public final List a(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = this.a;
        for (Map.Entry entry : map.entrySet()) {
            if (a.ao(((ebm) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            map.remove((ebm) it.next());
        }
        return ske.bN(linkedHashMap.values());
    }

    @Override // defpackage.dxo
    public final boolean b(ebm ebmVar) {
        return this.a.containsKey(ebmVar);
    }

    @Override // defpackage.dxo
    public final ejs c(ebm ebmVar) {
        return (ejs) this.a.remove(ebmVar);
    }

    @Override // defpackage.dxo
    public final ejs d(ebm ebmVar) {
        Map map = this.a;
        Object ejsVar = map.get(ebmVar);
        if (ejsVar == null) {
            ejsVar = new ejs(ebmVar);
            map.put(ebmVar, ejsVar);
        }
        return (ejs) ejsVar;
    }

    @Override // defpackage.dxo
    public final /* synthetic */ ejs e(ebx ebxVar) {
        return cpo.q(this, ebxVar);
    }
}
