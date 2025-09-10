package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cxm {
    private final cyb a = new cyb();

    public final AutoCloseable fc(String str) {
        AutoCloseable autoCloseable;
        cyb cybVar = this.a;
        synchronized (cybVar.d) {
            autoCloseable = (AutoCloseable) cybVar.a.get(str);
        }
        return autoCloseable;
    }

    public final void fd(String str, AutoCloseable autoCloseable) throws Exception {
        AutoCloseable autoCloseable2;
        cyb cybVar = this.a;
        if (cybVar.c) {
            cyb.a(autoCloseable);
            return;
        }
        synchronized (cybVar.d) {
            autoCloseable2 = (AutoCloseable) cybVar.a.put(str, autoCloseable);
        }
        cyb.a(autoCloseable2);
    }

    public final void fe() {
        cyb cybVar = this.a;
        if (!cybVar.c) {
            cybVar.c = true;
            synchronized (cybVar.d) {
                Iterator it = cybVar.a.values().iterator();
                while (it.hasNext()) {
                    cyb.a((AutoCloseable) it.next());
                }
                Set set = cybVar.b;
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    cyb.a((AutoCloseable) it2.next());
                }
                set.clear();
            }
        }
        ff();
    }

    protected void ff() {
    }
}
