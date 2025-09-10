package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sje {
    public static final sie a;
    private static final Set b;

    static {
        Set setSingleton = Collections.singleton(sgy.a);
        b = setSingleton;
        a = new sie(setSingleton);
    }

    public static String a(sid sidVar) {
        return sih.b(sidVar.m());
    }

    public static boolean b(sid sidVar, sja sjaVar, Set set) {
        return (sidVar.l() == null && sjaVar.a() <= set.size() && set.containsAll(sjaVar.c())) ? false : true;
    }

    public static void c(sja sjaVar, siq siqVar, StringBuilder sb) {
        sic sicVar = new sic(sb);
        sjaVar.d(siqVar, sicVar);
        if (sicVar.c) {
            sicVar.b.append(sicVar.a);
        }
    }
}
