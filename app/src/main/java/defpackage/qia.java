package defpackage;

import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qia {
    public static volatile boolean a = false;
    public static final Map b = DesugarCollections.synchronizedMap(new WeakHashMap());
    private static volatile boolean c = false;

    public static int a(long j) {
        int i;
        Map map = b;
        synchronized (map) {
            Iterator it = map.values().iterator();
            i = 0;
            while (it.hasNext()) {
                if (((qhz) it.next()).a <= j) {
                    i++;
                }
            }
        }
        return i;
    }
}
