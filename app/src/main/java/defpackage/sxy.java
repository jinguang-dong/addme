package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxy {
    public final Object a;
    public Object b;

    public sxy(byte[] bArr) {
        this.a = new qaq((char[]) null, (byte[]) null);
        this.b = null;
        System.nanoTime();
    }

    public final syu a(Callable callable, Executor executor) {
        executor.getClass();
        return b(new sxt(callable), executor);
    }

    public final syu b(sxh sxhVar, Executor executor) {
        executor.getClass();
        final sxw sxwVar = new sxw(executor, this);
        sxu sxuVar = new sxu(sxwVar, sxhVar, 0);
        final szh szhVar = new szh();
        final syu syuVar = (syu) ((AtomicReference) this.a).getAndSet(szhVar);
        final szo szoVar = new szo(sxuVar);
        syuVar.c(szoVar, sxwVar);
        final syu syuVarN = ske.N(szoVar);
        Runnable runnable = new Runnable() { // from class: sxs
            @Override // java.lang.Runnable
            public final void run() {
                szo szoVar2 = szoVar;
                if (szoVar2.isDone()) {
                    szhVar.f(syuVar);
                } else if (syuVarN.isCancelled() && sxwVar.compareAndSet(sxv.NOT_RUN, sxv.CANCELLED)) {
                    szoVar2.cancel(false);
                }
            }
        };
        sxo sxoVar = sxo.a;
        syuVarN.c(runnable, sxoVar);
        szoVar.c(runnable, sxoVar);
        return syuVarN;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final void c(pmv pmvVar) {
        ?? r0 = ((qaq) this.a).a;
        Object obj = pmvVar.a;
        qas qasVar = (qas) r0.get(obj);
        if (qasVar == null) {
            qasVar = new qas(pmvVar);
            r0.put(obj, qasVar);
        }
        this.b = qasVar;
    }

    public sxy() {
        this.a = new AtomicReference(syq.a);
        this.b = new sxx();
    }
}
