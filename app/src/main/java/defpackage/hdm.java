package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdm {
    private boolean e = false;
    private final ScheduledExecutorService f = ojl.cc("JankReports");
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public nkw c = nkw.UNINITIALIZED;
    public final pry d = new pry(new rnu(this));

    public final synchronized List a() {
        ArrayList arrayList;
        List list = this.b;
        arrayList = new ArrayList(list);
        list.clear();
        List list2 = this.a;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((pmh) it.next()).b());
        }
        list2.clear();
        return arrayList;
    }

    public final void b(long j, long j2) {
        this.d.a(j, j2);
        synchronized (this) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((pmh) it.next()).c();
            }
        }
    }

    public final synchronized void c(nkw nkwVar) {
        this.c = nkwVar;
        List list = this.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.b.add(((pmh) it.next()).b());
        }
        list.clear();
        list.add(new pmh(nkwVar, 2));
        if (this.e) {
            return;
        }
        this.e = true;
        pmh pmhVar = new pmh(this.c, 3);
        list.add(pmhVar);
        this.f.schedule(new hdk(this, pmhVar, 0, null), 5L, TimeUnit.SECONDS);
    }

    public final synchronized void d() {
        pmh pmhVar = new pmh(this.c, 4);
        this.a.add(pmhVar);
        this.f.schedule(new hdk(this, pmhVar, 2, null), 5L, TimeUnit.SECONDS);
    }

    public final synchronized void e() {
    }
}
