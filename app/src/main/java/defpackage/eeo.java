package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eeo {
    public static final Map a;

    static {
        HashMap map = new HashMap();
        a = map;
        eex eexVar = new eex();
        eexVar.q();
        map.put("dc:contributor", eexVar);
        map.put("dc:language", eexVar);
        map.put("dc:publisher", eexVar);
        map.put("dc:relation", eexVar);
        map.put("dc:subject", eexVar);
        map.put("dc:type", eexVar);
        eex eexVar2 = new eex();
        eexVar2.q();
        eexVar2.t();
        map.put("dc:creator", eexVar2);
        map.put("dc:date", eexVar2);
        eex eexVar3 = new eex();
        eexVar3.q();
        eexVar3.t();
        eexVar3.s();
        eexVar3.r();
        map.put("dc:description", eexVar3);
        map.put("dc:rights", eexVar3);
        map.put("dc:title", eexVar3);
    }

    public static void a(een eenVar, een eenVar2, boolean z) throws edv {
        if (!eenVar.b.equals(eenVar2.b) || eenVar.a() != eenVar2.a()) {
            throw new edv("Mismatch between alias and base nodes", 203);
        }
        if (!z && (!eenVar.a.equals(eenVar2.a) || !eenVar.g().equals(eenVar2.g()) || eenVar.b() != eenVar2.b())) {
            throw new edv("Mismatch between alias and base nodes", 203);
        }
        Iterator itH = eenVar.h();
        Iterator itH2 = eenVar2.h();
        while (itH.hasNext() && itH2.hasNext()) {
            a((een) itH.next(), (een) itH2.next(), false);
        }
        Iterator itI = eenVar.i();
        Iterator itI2 = eenVar2.i();
        while (itI.hasNext() && itI2.hasNext()) {
            a((een) itI.next(), (een) itI2.next(), false);
        }
    }

    public static void b(een eenVar) {
        if (eenVar == null || !eenVar.g().d()) {
            return;
        }
        eex eexVarG = eenVar.g();
        eexVarG.t();
        eexVarG.s();
        eexVarG.r();
        Iterator itH = eenVar.h();
        while (itH.hasNext()) {
            een eenVar2 = (een) itH.next();
            if (eenVar2.g().l()) {
                itH.remove();
            } else if (!eenVar2.g().c()) {
                String str = eenVar2.b;
                if (str == null || str.length() == 0) {
                    itH.remove();
                } else {
                    eenVar2.m(new een("xml:lang", "x-repair", null));
                }
            }
        }
    }

    public static void c(Iterator it, een eenVar, een eenVar2) throws edv {
        if (eenVar2.g().i()) {
            if (eenVar.g().c()) {
                throw new edv("Alias to x-default already has a language qualifier", 203);
            }
            eenVar.m(new een("xml:lang", "x-default", null));
        }
        it.remove();
        eenVar.a = "[]";
        eenVar2.k(eenVar);
    }
}
