package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyb {
    public volatile boolean c;
    public final cqh d = new cqh(null);
    public final Map a = new LinkedHashMap();
    public final Set b = new LinkedHashSet();

    public static final void a(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
