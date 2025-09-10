package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pmb implements paq {
    public final long b;
    public long d = 0;
    public boolean e = false;
    public final Object a = new Object();
    public final LinkedList c = new LinkedList();

    public pmb(long j) {
        this.b = j;
    }

    private final plz f(long j) {
        this.d += j;
        d();
        return new plz(this, j);
    }

    public final plz a(long j) {
        plz plzVarF;
        boolean z = false;
        if (j > 0 && j <= this.b) {
            z = true;
        }
        rnt.H(z, "%s is an illegal block size (Must be > 0 and <= %s", j, this.b);
        synchronized (this.a) {
            plzVarF = !this.e ? f(j) : null;
        }
        return plzVarF;
    }

    public final plz b(long j) {
        plz plzVarF;
        boolean z = false;
        if (j > 0 && j <= this.b) {
            z = true;
        }
        long j2 = this.b;
        rnt.H(z, "%s is an illegal block size (Must be > 0 and <= %s", j, j2);
        synchronized (this.a) {
            plzVarF = null;
            if (!this.e && this.c.isEmpty() && j > 0 && this.d + j <= j2) {
                plzVarF = f(j);
            }
        }
        return plzVarF;
    }

    public final syu c(long j) {
        boolean z = false;
        if (j > 0 && j <= this.b) {
            z = true;
        }
        long j2 = this.b;
        rnt.H(z, "%s is an illegal block size (Must be > 0 and <= %s", j, j2);
        synchronized (this.a) {
            if (this.e) {
                return ske.L(new pco());
            }
            LinkedList linkedList = this.c;
            if (linkedList.isEmpty() && this.d + j <= j2) {
                return ske.M(f(j));
            }
            pma pmaVar = new pma(this, j);
            linkedList.add(pmaVar);
            d();
            e();
            return pmaVar.a;
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            this.e = true;
            LinkedList linkedList = this.c;
            arrayList.addAll(linkedList);
            linkedList.clear();
            d();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((pma) arrayList.get(i)).a(null);
            }
        }
    }

    public final void e() {
        while (true) {
            synchronized (this.a) {
                LinkedList linkedList = this.c;
                pma pmaVar = (pma) linkedList.peekFirst();
                if (pmaVar != null) {
                    plz plzVarF = null;
                    if (this.e) {
                        linkedList.removeFirst();
                    } else {
                        long j = this.d;
                        long j2 = pmaVar.b;
                        if (j + j2 <= this.b) {
                            plzVarF = f(j2);
                            linkedList.removeFirst();
                        } else {
                            pmaVar = null;
                        }
                    }
                    if (pmaVar == null) {
                        break;
                    } else {
                        pmaVar.a(plzVarF);
                    }
                } else {
                    break;
                }
            }
        }
        synchronized (this.a) {
            d();
        }
    }

    public void d() {
    }
}
