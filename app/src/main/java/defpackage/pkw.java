package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pkw implements plb {
    public final String a;
    final /* synthetic */ pkx b;
    private final List c = new ArrayList(100);
    private boolean d = true;

    public pkw(pkx pkxVar, String str) {
        this.b = pkxVar;
        this.a = str;
    }

    @Override // defpackage.plb
    public final String a() {
        return this.a;
    }

    @Override // defpackage.plb
    public final synchronized void b(long j, long j2, pla plaVar) {
        if (!this.d) {
            int i = sbp.d;
            plaVar.a(sex.a);
            return;
        }
        pkx pkxVar = this.b;
        synchronized (pkxVar) {
            pmv pmvVar = pkxVar.b;
            if (pmvVar != null) {
                ((pkz) pmvVar.a).a(j, j2, this.c);
            }
        }
        List list = this.c;
        plaVar.a(list);
        pkx pkxVar2 = this.b;
        synchronized (pkxVar2) {
            pmv pmvVar2 = pkxVar2.b;
            if (pmvVar2 != null) {
                ((pkz) pmvVar2.a).b(list);
            }
        }
    }

    @Override // defpackage.plb, defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        pkx pkxVar = this.b;
        pkxVar.a.b("Closing session : ".concat(this.a));
        this.d = false;
        pkxVar.c(this);
    }
}
