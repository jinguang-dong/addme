package defpackage;

import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pmj extends pmb {
    public final owu f;
    public final owr g;
    private owf h;

    public pmj(long j) {
        super(j);
        owr owrVar = new owr();
        this.g = owrVar;
        this.f = new owu(0L, owrVar);
    }

    @Override // defpackage.pmb
    public final void d() {
        long j;
        synchronized (this.a) {
            if (this.e) {
                j = this.b;
            } else {
                LinkedList linkedList = this.c;
                if (linkedList.isEmpty()) {
                    j = this.d;
                } else {
                    Iterator it = linkedList.iterator();
                    long j2 = 0;
                    while (it.hasNext()) {
                        j2 += ((pma) it.next()).b;
                    }
                    j = this.d + j2;
                }
            }
        }
        this.f.a(Long.valueOf(j));
    }

    public final long f() {
        return ((Long) g().dL()).longValue();
    }

    public final synchronized owf g() {
        if (this.h == null) {
            this.h = owl.h(this.f, new kou(this, 13));
        }
        return this.h;
    }
}
