package defpackage;

import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rvt {
    private static final Map a = new WeakHashMap();

    public static rwc a(Class cls, String str) {
        Map map;
        str.getClass();
        Map map2 = a;
        synchronized (map2) {
            map = (Map) map2.get(cls);
            if (map == null) {
                map = new HashMap();
                Iterator it = EnumSet.allOf(cls).iterator();
                while (it.hasNext()) {
                    Enum r3 = (Enum) it.next();
                    map.put(r3.name(), new WeakReference(r3));
                }
                map2.put(cls, map);
            }
        }
        WeakReference weakReference = (WeakReference) map.get(str);
        return weakReference == null ? rvk.a : rwc.i((Enum) cls.cast(weakReference.get()));
    }
}
