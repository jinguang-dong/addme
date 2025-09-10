package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxw extends AtomicReference implements Executor, Runnable {
    sxy a;
    Executor b;
    Runnable c;
    Thread d;

    public sxw(Executor executor, sxy sxyVar) {
        super(sxv.NOT_RUN);
        this.b = executor;
        this.a = sxyVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == sxv.CANCELLED) {
            this.b = null;
            this.a = null;
            return;
        }
        this.d = Thread.currentThread();
        try {
            sxy sxyVar = this.a;
            sxyVar.getClass();
            Object obj = sxyVar.b;
            if (((sxx) obj).a == this.d) {
                this.a = null;
                rnt.L(((sxx) obj).b == null);
                ((sxx) obj).b = runnable;
                Executor executor = this.b;
                executor.getClass();
                ((sxx) obj).c = executor;
                this.b = null;
            } else {
                Executor executor2 = this.b;
                executor2.getClass();
                this.b = null;
                this.c = runnable;
                executor2.execute(this);
            }
        } finally {
            this.d = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r0;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.d) {
            Runnable runnable = this.c;
            runnable.getClass();
            this.c = null;
            runnable.run();
            return;
        }
        sxx sxxVar = new sxx();
        sxxVar.a = threadCurrentThread;
        sxy sxyVar = this.a;
        sxyVar.getClass();
        sxyVar.b = sxxVar;
        this.a = null;
        try {
            Runnable runnable2 = this.c;
            runnable2.getClass();
            this.c = null;
            runnable2.run();
            while (true) {
                ?? r3 = sxxVar.b;
                if (r3 == 0 || (r0 = sxxVar.c) == 0) {
                    break;
                }
                sxxVar.b = null;
                sxxVar.c = null;
                r0.execute(r3);
            }
        } finally {
            sxxVar.a = null;
        }
    }
}
