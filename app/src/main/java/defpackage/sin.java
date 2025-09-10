package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sin extends siq {
    private final Map a;
    private final Map b;
    private final sip c;
    private final sio d;

    public sin(sim simVar) {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        map.putAll(simVar.c);
        map2.putAll(simVar.d);
        this.c = simVar.e;
        this.d = simVar.f;
    }

    @Override // defpackage.siq
    protected final void a(shl shlVar, Object obj, Object obj2) {
        sip sipVar = (sip) this.a.get(shlVar);
        if (sipVar != null) {
            sipVar.a(shlVar, obj, obj2);
        } else {
            this.c.a(shlVar, obj, obj2);
        }
    }

    @Override // defpackage.siq
    protected final void b(shl shlVar, Iterator it, Object obj) {
        sio sioVar = (sio) this.b.get(shlVar);
        if (sioVar != null) {
            sioVar.a(shlVar, it, obj);
            return;
        }
        sio sioVar2 = this.d;
        if (sioVar2 != null && !this.a.containsKey(shlVar)) {
            sioVar2.a(shlVar, it, obj);
        } else {
            while (it.hasNext()) {
                a(shlVar, it.next(), obj);
            }
        }
    }
}
