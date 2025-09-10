package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class enu extends Thread {
    private static final eny c = new eny("DispatchThread");
    public final Queue a;
    public Boolean b;
    private final Handler d;
    private final HandlerThread e;

    public enu(Handler handler, HandlerThread handlerThread) {
        super("Camera Job Dispatch Thread");
        this.a = new LinkedList();
        this.b = new Boolean(false);
        this.d = handler;
        this.e = handlerThread;
    }

    private final boolean c() {
        boolean zBooleanValue;
        synchronized (this.b) {
            zBooleanValue = this.b.booleanValue();
        }
        return zBooleanValue;
    }

    public final void a(Runnable runnable) {
        if (c()) {
            throw new IllegalStateException("Trying to run job on interrupted dispatcher thread");
        }
        Queue queue = this.a;
        synchronized (queue) {
            if (queue.size() == 256) {
                throw new RuntimeException("Camera master thread job queue full");
            }
            queue.add(runnable);
            queue.notifyAll();
        }
    }

    public final void b(Runnable runnable, Object obj, String str) {
        String strConcat = "Timeout waiting 3500ms for ".concat(str);
        synchronized (obj) {
            long jUptimeMillis = SystemClock.uptimeMillis() + 3500;
            try {
                a(runnable);
                obj.wait(3500L);
            } catch (InterruptedException unused) {
                if (SystemClock.uptimeMillis() > jUptimeMillis) {
                    throw new IllegalStateException(strConcat);
                }
            }
            if (SystemClock.uptimeMillis() > jUptimeMillis) {
                throw new IllegalStateException(strConcat);
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Runnable runnable;
        while (true) {
            Queue queue = this.a;
            synchronized (queue) {
                while (queue.size() == 0 && !c()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException unused) {
                        enz.c(c, "Dispatcher thread wait() interrupted, exiting");
                    }
                }
                runnable = (Runnable) this.a.poll();
            }
            if (runnable != null) {
                runnable.run();
                synchronized (this) {
                    this.d.post(new dzd(this, 9, null));
                    try {
                        wait();
                    } catch (InterruptedException unused2) {
                    }
                }
            } else if (c()) {
                this.e.quitSafely();
                return;
            }
        }
    }
}
