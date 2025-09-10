package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qgp {
    public final Object[] b;
    public final qgg[] c;
    private final AtomicInteger e;
    public final qhd a = new qhd();
    public volatile boolean d = false;

    /* JADX WARN: Multi-variable type inference failed */
    public qgp(Iterable iterable) {
        int i = 0;
        int size = iterable.size();
        this.b = new Object[size];
        this.c = new qgg[size];
        this.e = new AtomicInteger(size);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((qgf) it.next()).c(sxo.a, new qgn(this, i), new qgo(this, i)).g(qfs.a);
            i++;
        }
    }

    public final void a() {
        if (this.e.decrementAndGet() == 0) {
            if (!this.d) {
                this.a.i(Arrays.asList(this.b));
                return;
            }
            qgg qggVar = null;
            for (qgg qggVar2 : this.c) {
                if (qggVar2 != null) {
                    if (qggVar == null) {
                        qggVar = qggVar2;
                    } else {
                        qggVar.addSuppressed(qggVar2);
                    }
                }
            }
            if (qggVar != null) {
                this.a.j(qggVar);
            } else {
                this.a.j(qgg.a(new AssertionError("Result list was marked as having an exception,but no exception was found")));
            }
        }
    }
}
