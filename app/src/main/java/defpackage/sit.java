package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sit {
    private static final sip a = new sir();
    private static final sio b = new sis();

    public static siq a(Set set) {
        sim simVar = new sim(a);
        simVar.f = b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            shl shlVar = (shl) it.next();
            shlVar.getClass();
            if (shlVar.b) {
                sio sioVar = sim.b;
                ske.f(true, "key must be repeating");
                simVar.c.remove(shlVar);
                simVar.d.put(shlVar, sioVar);
            } else {
                Map map = simVar.d;
                sip sipVar = sim.a;
                map.remove(shlVar);
                simVar.c.put(shlVar, sipVar);
            }
        }
        return new sin(simVar);
    }
}
