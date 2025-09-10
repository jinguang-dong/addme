package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ilh {
    private static final Map a = new HashMap();

    public static synchronized Object a(Class cls) {
        Object obj;
        obj = a.get(cls);
        if (obj == null) {
            throw new IllegalStateException("No instance for " + cls.getName() + " has been provided.");
        }
        return obj;
    }

    public static synchronized void b(Class cls, Object obj) {
        a.put(cls, obj);
    }
}
