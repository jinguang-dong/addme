package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class our implements paq {
    private final our a;
    private final ovq b;
    private List c;

    public our() {
        this(ovt.a);
    }

    public boolean b() {
        boolean z;
        synchronized (this) {
            z = this.c == null;
        }
        return z;
    }

    public final our c() {
        our ourVar = new our(this, this.b);
        d(ourVar);
        return ourVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            List list = this.c;
            if (list != null) {
                this.c = null;
                our ourVar = this.a;
                if (ourVar != null) {
                    synchronized (ourVar) {
                        List list2 = ourVar.c;
                        if (list2 != null) {
                            list2.remove(this);
                        }
                    }
                }
                this.b.b(list);
            }
        }
    }

    public final void d(paq paqVar) {
        boolean z;
        paqVar.getClass();
        synchronized (this) {
            List list = this.c;
            if (list == null) {
                z = true;
            } else {
                list.add(paqVar);
                z = false;
            }
        }
        if (z) {
            this.b.a(paqVar);
        }
    }

    private our(our ourVar, ovq ovqVar) {
        this.b = ovqVar;
        this.a = ourVar;
        this.c = new ArrayList();
    }

    public our(ovq ovqVar) {
        this.b = ovqVar;
        this.a = null;
        this.c = new ArrayList();
    }
}
