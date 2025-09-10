package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class unw extends una {
    private long a;
    public ufu b;
    private boolean c;

    private static final long fQ(boolean z) {
        return z ? 4294967296L : 1L;
    }

    protected abstract Thread e();

    protected void j(long j, unz unzVar) {
        unh.a.w(j, unzVar);
    }

    public void k() {
        throw null;
    }

    public long l() {
        throw null;
    }

    public final void m(boolean z) {
        long jFQ = this.a - fQ(z);
        this.a = jFQ;
        if (jFQ > 0) {
            return;
        }
        boolean z2 = unf.a;
        if (this.c) {
            k();
        }
    }

    public final void n(unp unpVar) {
        ufu ufuVar = this.b;
        if (ufuVar == null) {
            ufuVar = new ufu();
            this.b = ufuVar;
        }
        ufuVar.addLast(unpVar);
    }

    public final void o(boolean z) {
        this.a += fQ(z);
        if (z) {
            return;
        }
        this.c = true;
    }

    public final boolean p() {
        return this.a >= fQ(true);
    }

    public final boolean q() {
        ufu ufuVar = this.b;
        if (ufuVar != null) {
            return ufuVar.isEmpty();
        }
        return true;
    }

    public final boolean r() {
        unp unpVar;
        ufu ufuVar = this.b;
        if (ufuVar == null || (unpVar = (unp) ufuVar.f()) == null) {
            return false;
        }
        unpVar.run();
        return true;
    }

    protected final void s() {
        Thread threadE = e();
        if (Thread.currentThread() != threadE) {
            LockSupport.unpark(threadE);
        }
    }
}
