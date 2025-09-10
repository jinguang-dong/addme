package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqg implements paq {
    public final owt a;
    public final ows d;
    public int e;
    public final Object b = new ReentrantLock(true);
    public final LinkedList c = new LinkedList();
    public boolean f = false;

    public kqg(int i) {
        this.e = i;
        ows owsVar = new ows(Integer.valueOf(i));
        this.d = owsVar;
        this.a = new owt(owsVar);
    }

    public final int a() {
        if (this.f || !this.c.isEmpty()) {
            return 0;
        }
        return this.e;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.b) {
            if (this.f) {
                return;
            }
            this.f = true;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                scf scfVar = (scf) it.next();
                scfVar.a = new kqk("FiniteTicketPool closing.");
                arrayList.add(scfVar);
            }
            this.d.a = Integer.valueOf(a());
            if (arrayList.size() <= 0) {
                this.d.a();
            } else {
                throw null;
            }
        }
    }
}
