package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fsi implements ouu {
    public static final sgv a = sgv.g("fsi");
    public final BlockingQueue b;
    public final ThreadLocal c = new fsh();
    public final ArrayList d = new ArrayList();
    private final ouu e;

    public fsi(ouu ouuVar, int i) {
        this.b = new ArrayBlockingQueue(i);
        this.e = ouuVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!this.b.offer(runnable)) {
            this.e.execute(runnable);
        } else {
            if (((Boolean) this.c.get()).booleanValue()) {
                return;
            }
            this.e.execute(new Runnable() { // from class: fsg
                /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
                
                    ((defpackage.sgt) defpackage.fsi.a.c().M(365)).s("MainThreadExecutor detected possible infinite loop.");
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        r5 = this;
                        boolean r0 = defpackage.out.d()
                        defpackage.rnt.s(r0)
                        fsi r5 = r5.a
                        java.util.ArrayList r0 = r5.d
                        boolean r1 = r0.isEmpty()
                        defpackage.rnt.s(r1)
                        java.lang.ThreadLocal r1 = r5.c     // Catch: java.lang.Throwable -> L5a
                        java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L5a
                        r1.set(r2)     // Catch: java.lang.Throwable -> L5a
                        r2 = 0
                    L1a:
                        int r2 = r2 + 1
                        r3 = 16
                        if (r2 <= r3) goto L34
                        sgv r0 = defpackage.fsi.a     // Catch: java.lang.Throwable -> L5a
                        shi r0 = r0.c()     // Catch: java.lang.Throwable -> L5a
                        r2 = 365(0x16d, float:5.11E-43)
                        shi r0 = r0.M(r2)     // Catch: java.lang.Throwable -> L5a
                        sgt r0 = (defpackage.sgt) r0     // Catch: java.lang.Throwable -> L5a
                        java.lang.String r2 = "MainThreadExecutor detected possible infinite loop."
                        r0.s(r2)     // Catch: java.lang.Throwable -> L5a
                        goto L54
                    L34:
                        java.util.concurrent.BlockingQueue r3 = r5.b     // Catch: java.lang.Throwable -> L5a
                        int r3 = r3.drainTo(r0)     // Catch: java.lang.Throwable -> L5a
                        if (r3 == 0) goto L54
                        java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L5a
                    L40:
                        boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L5a
                        if (r4 == 0) goto L50
                        java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L5a
                        java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L5a
                        r4.run()     // Catch: java.lang.Throwable -> L5a
                        goto L40
                    L50:
                        r0.clear()     // Catch: java.lang.Throwable -> L5a
                        goto L1a
                    L54:
                        java.lang.Boolean r5 = java.lang.Boolean.FALSE
                        r1.set(r5)
                        return
                    L5a:
                        r0 = move-exception
                        java.lang.ThreadLocal r5 = r5.c
                        java.lang.Boolean r1 = java.lang.Boolean.FALSE
                        r5.set(r1)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.fsg.run():void");
                }
            });
        }
    }
}
