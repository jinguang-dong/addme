package defpackage;

import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnp {
    private static final TreeMap a = new TreeMap();

    public static synchronized long a(long j) {
        Long l;
        l = (Long) a.get(Long.valueOf(j));
        return l != null ? l.longValue() : System.currentTimeMillis();
    }

    public static synchronized void b(long j) {
        TreeMap treeMap = a;
        Long lValueOf = Long.valueOf(j);
        if (!treeMap.containsKey(lValueOf)) {
            treeMap.put(lValueOf, Long.valueOf(System.currentTimeMillis()));
        }
        while (treeMap.size() > 1800) {
            treeMap.pollFirstEntry();
        }
    }
}
