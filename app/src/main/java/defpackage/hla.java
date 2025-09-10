package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hla {
    public static final sgv a = sgv.g("hla");
    public final List b;
    public final rwc c;
    public final ovo d;
    private final rwc e;
    private final hkz f;

    public hla(Executor executor, rwc rwcVar, rwc rwcVar2, Set set, hkz hkzVar) {
        this.d = ojl.bV(executor);
        this.e = rwcVar;
        this.c = rwcVar2;
        this.b = hlx.a(set);
        this.f = hkzVar;
    }

    final synchronized void a(pjo pjoVar, fee feeVar) {
        List list = this.b;
        hlx.b("frame", list);
        this.f.a = pjoVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((hlw) it.next()).d(pjoVar, feeVar);
        }
        rwc rwcVar = this.e;
        if (rwcVar.h() && this.c.h()) {
            ((pdn) rwcVar.c()).l(new kzh(this, 1));
        }
    }

    public final synchronized void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((hlw) it.next()).b();
        }
    }
}
