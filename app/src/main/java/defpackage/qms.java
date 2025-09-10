package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qms extends qfn implements qmn {
    public final qmr a;
    public final AtomicBoolean b = new AtomicBoolean(true);

    public qms(qmn qmnVar) {
        this.a = new qmr(qmnVar);
    }

    @Override // defpackage.qfn
    protected final qgi b() {
        this.b.set(false);
        qmr qmrVar = this.a;
        int iDecrementAndGet = qmrVar.a.decrementAndGet();
        if (iDecrementAndGet == 0) {
            boolean z = qmrVar.c;
            return qmrVar.b.a();
        }
        if (iDecrementAndGet >= 0) {
            return qgh.a;
        }
        throw new IllegalStateException("Reference count dropped below zero");
    }

    @Override // defpackage.qmn
    public final Object c() {
        if (this.b.get()) {
            return this.a.b.c();
        }
        throw new qmp();
    }

    @Override // defpackage.qmn
    public final Object fk() {
        throw null;
    }

    @Override // defpackage.qfn
    protected final void fl() {
        this.b.set(false);
        qmr qmrVar = this.a;
        int iDecrementAndGet = qmrVar.a.decrementAndGet();
        if (iDecrementAndGet == 0) {
            boolean z = qmrVar.c;
            qmrVar.b.close();
        } else if (iDecrementAndGet < 0) {
            throw new IllegalStateException("Reference count dropped below zero");
        }
    }

    public final String toString() {
        return "ref-counted[" + this.a.b.toString() + "]";
    }

    public qms(qmr qmrVar) {
        this.a = qmrVar;
    }
}
