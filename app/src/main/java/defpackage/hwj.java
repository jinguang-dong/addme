package defpackage;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hwj implements plc {
    private final plc b;
    private final our c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    public final Set a = new HashSet();

    public hwj(plc plcVar, our ourVar) {
        this.b = plcVar;
        this.c = ourVar;
    }

    @Override // defpackage.plc
    public final int a() {
        throw null;
    }

    @Override // defpackage.plc
    public final plb b(String str) {
        plb plbVarB = this.b.b(str);
        if (plbVarB == null) {
            return null;
        }
        int i = 1;
        if (!this.d.getAndSet(true)) {
            this.c.d(new hye(this, i));
        }
        hwi hwiVar = new hwi(this, plbVarB);
        synchronized (this) {
            this.a.add(hwiVar);
        }
        return hwiVar;
    }

    public final synchronized void c() {
        Set set = this.a;
        if (!set.isEmpty()) {
            throw new IllegalStateException(String.format(Locale.US, "%d gyro sessions, e.g. %s, leaked", Integer.valueOf(set.size()), ((plb) set.iterator().next()).a()));
        }
    }
}
