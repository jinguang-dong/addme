package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unh extends uob implements Runnable {
    private static volatile Thread _thread;
    public static final unh a;
    private static volatile int debugStatus;
    private static final long e;

    static {
        Long l;
        unh unhVar = new unh();
        a = unhVar;
        unhVar.o(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        e = timeUnit.toNanos(l.longValue());
    }

    private unh() {
    }

    private final synchronized void A() {
        if (C()) {
            debugStatus = 3;
            ((uob) this).c.c(null);
            this.d.c(null);
            notifyAll();
        }
    }

    private final synchronized boolean B() {
        if (C()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private static final boolean C() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    private static final void D() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    private final synchronized Thread z() {
        Thread thread = _thread;
        if (thread != null) {
            return thread;
        }
        Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
        _thread = thread2;
        thread2.setContextClassLoader(a.getClass().getClassLoader());
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    @Override // defpackage.unw
    protected final Thread e() {
        Thread thread = _thread;
        return thread == null ? z() : thread;
    }

    @Override // defpackage.uob, defpackage.unk
    public final unt h(long j, Runnable runnable, uhf uhfVar) {
        return v(j, runnable);
    }

    @Override // defpackage.uob
    public final void i(Runnable runnable) {
        if (debugStatus == 4) {
            D();
        }
        super.i(runnable);
    }

    @Override // defpackage.unw
    protected final void j(long j, unz unzVar) {
        D();
    }

    @Override // defpackage.uob, defpackage.unw
    public final void k() {
        debugStatus = 4;
        super.k();
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadLocal threadLocal = upk.a;
        upk.a.set(this);
        try {
            if (B()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jL = l();
                    if (jL == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = e + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            break;
                        } else {
                            jL = ukc.r(Long.MAX_VALUE, j2);
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jL > 0) {
                        if (C()) {
                            break;
                        } else {
                            LockSupport.parkNanos(this, jL);
                        }
                    }
                }
            }
            _thread = null;
            A();
            if (y()) {
                return;
            }
            e();
        } catch (Throwable th) {
            _thread = null;
            A();
            if (!y()) {
                e();
            }
            throw th;
        }
    }

    @Override // defpackage.una
    public final String toString() {
        return "DefaultExecutor";
    }
}
