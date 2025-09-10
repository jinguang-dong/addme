package defpackage;

import j$.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlx {
    private static final sgv a = sgv.g("hlx");

    public static List a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        List.EL.sort(arrayList, new wp(7));
        return arrayList;
    }

    public static void b(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(((hlw) it.next()).a.b);
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            hlg hlgVar = ((hlw) it2.next()).a.b;
            for (hlg hlgVar2 : hlgVar.c()) {
                if (!hashSet.contains(hlgVar2)) {
                    ((sgt) a.c().M(1371)).G("Extractor (%s) of type %s depends on foreign type %s! Feature values may be calculated out of order!", str, hlgVar, hlgVar2);
                }
            }
        }
    }
}
