package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class umg extends umd {
    public final unw b;
    private final Thread e;

    public umg(uhf uhfVar, Thread thread, unw unwVar) {
        super(uhfVar, true);
        this.e = thread;
        this.b = unwVar;
    }

    @Override // defpackage.uov
    protected final void a(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.e;
        if (a.ao(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }

    @Override // defpackage.uov
    protected final boolean b() {
        return true;
    }
}
