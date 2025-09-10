package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ciu implements syu {
    static final cil b;
    public static final /* synthetic */ int c = 0;
    private static final Object e;
    volatile cip listeners;
    volatile Object value;
    volatile cit waiters;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger d = Logger.getLogger(ciu.class.getName());

    static {
        cil cisVar;
        try {
            cisVar = new ciq(AtomicReferenceFieldUpdater.newUpdater(cit.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(cit.class, cit.class, "next"), AtomicReferenceFieldUpdater.newUpdater(ciu.class, cit.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(ciu.class, cip.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(ciu.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            cisVar = new cis();
        }
        b = cisVar;
        if (th != null) {
            d.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        e = new Object();
    }

    protected ciu() {
    }

    static Object a(syu syuVar) {
        if (syuVar instanceof ciu) {
            Object obj = ((ciu) syuVar).value;
            if (!(obj instanceof cim)) {
                return obj;
            }
            cim cimVar = (cim) obj;
            if (!cimVar.c) {
                return obj;
            }
            Throwable th = cimVar.d;
            return th != null ? new cim(false, th) : cim.b;
        }
        boolean zIsCancelled = syuVar.isCancelled();
        if ((!a) && zIsCancelled) {
            return cim.b;
        }
        try {
            Object objH = a.H(syuVar);
            return objH == null ? e : objH;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new cim(false, e2);
            }
            Objects.toString(syuVar);
            return new cio(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(syuVar)), e2));
        } catch (ExecutionException e3) {
            return new cio(e3.getCause());
        } catch (Throwable th2) {
            return new cio(th2);
        }
    }

    static void d(ciu ciuVar) {
        cip cipVar;
        cip cipVar2;
        cip cipVar3 = null;
        while (true) {
            cit citVar = ciuVar.waiters;
            if (b.e(ciuVar, citVar, cit.a)) {
                while (citVar != null) {
                    Thread thread = citVar.thread;
                    if (thread != null) {
                        citVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    citVar = citVar.next;
                }
                do {
                    cipVar = ciuVar.listeners;
                } while (!b.c(ciuVar, cipVar, cip.a));
                while (true) {
                    cipVar2 = cipVar3;
                    cipVar3 = cipVar;
                    if (cipVar3 == null) {
                        break;
                    }
                    cipVar = cipVar3.next;
                    cipVar3.next = cipVar2;
                }
                while (cipVar2 != null) {
                    Runnable runnable = cipVar2.b;
                    cip cipVar4 = cipVar2.next;
                    if (runnable instanceof cir) {
                        cir cirVar = (cir) runnable;
                        ciuVar = cirVar.a;
                        if (ciuVar.value == cirVar) {
                            if (b.d(ciuVar, cirVar, a(cirVar.b))) {
                                cipVar3 = cipVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        i(runnable, cipVar2.c);
                    }
                    cipVar2 = cipVar4;
                }
                return;
            }
        }
    }

    static void f(Object obj) {
        obj.getClass();
    }

    private final String g(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            d.log(Level.SEVERE, a.bC(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e2);
        }
    }

    private final void j(cit citVar) {
        citVar.thread = null;
        while (true) {
            cit citVar2 = this.waiters;
            if (citVar2 != cit.a) {
                cit citVar3 = null;
                while (citVar2 != null) {
                    cit citVar4 = citVar2.next;
                    if (citVar2.thread != null) {
                        citVar3 = citVar2;
                    } else if (citVar3 != null) {
                        citVar3.next = citVar4;
                        if (citVar3.thread == null) {
                            break;
                        }
                    } else if (!b.e(this, citVar2, citVar4)) {
                        break;
                    }
                    citVar2 = citVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object k(Object obj) throws ExecutionException {
        if (obj instanceof cim) {
            Throwable th = ((cim) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof cio) {
            throw new ExecutionException(((cio) obj).b);
        }
        if (obj == e) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String b() {
        Object obj = this.value;
        if (obj instanceof cir) {
            return "setFuture=[" + g(((cir) obj).b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // defpackage.syu
    public final void c(Runnable runnable, Executor executor) {
        f(executor);
        cip cipVar = this.listeners;
        if (cipVar != cip.a) {
            cip cipVar2 = new cip(runnable, executor);
            do {
                cipVar2.next = cipVar;
                if (b.c(this, cipVar, cipVar2)) {
                    return;
                } else {
                    cipVar = this.listeners;
                }
            } while (cipVar != cip.a);
        }
        i(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean cancel(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.value
            boolean r1 = r0 instanceof defpackage.cir
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5a
            boolean r1 = defpackage.ciu.a
            if (r1 == 0) goto L1f
            cim r1 = new cim
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r7, r4)
            goto L26
        L1f:
            if (r7 == 0) goto L24
            cim r1 = defpackage.cim.a
            goto L26
        L24:
            cim r1 = defpackage.cim.b
        L26:
            r4 = r2
        L27:
            cil r5 = defpackage.ciu.b
            boolean r5 = r5.d(r6, r0, r1)
            if (r5 == 0) goto L53
            d(r6)
            boolean r6 = r0 instanceof defpackage.cir
            if (r6 == 0) goto L52
            cir r0 = (defpackage.cir) r0
            syu r6 = r0.b
            boolean r0 = r6 instanceof defpackage.ciu
            if (r0 == 0) goto L4f
            ciu r6 = (defpackage.ciu) r6
            java.lang.Object r0 = r6.value
            if (r0 != 0) goto L46
            r4 = r3
            goto L47
        L46:
            r4 = r2
        L47:
            boolean r5 = r0 instanceof defpackage.cir
            r4 = r4 | r5
            if (r4 == 0) goto L4e
            r4 = r3
            goto L27
        L4e:
            return r3
        L4f:
            r6.cancel(r7)
        L52:
            return r3
        L53:
            java.lang.Object r0 = r6.value
            boolean r5 = r0 instanceof defpackage.cir
            if (r5 != 0) goto L27
            return r4
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciu.cancel(boolean):boolean");
    }

    protected boolean e(Object obj) {
        if (obj == null) {
            obj = e;
        }
        if (!b.d(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof cir))) {
            return k(obj2);
        }
        cit citVar = this.waiters;
        if (citVar != cit.a) {
            cit citVar2 = new cit();
            do {
                citVar2.a(citVar);
                if (b.e(this, citVar, citVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            j(citVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof cir))));
                    return k(obj);
                }
                citVar = this.waiters;
            } while (citVar != cit.a);
        }
        return k(this.value);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof cim;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.value != null) & (!(r2 instanceof cir));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            h(sb);
        } else {
            try {
                strConcat = b();
            } catch (RuntimeException e2) {
                Class<?> cls = e2.getClass();
                Objects.toString(cls);
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                h(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private final void h(StringBuilder sb) {
        try {
            Object objH = a.H(this);
            sb.append(SHXc.ZLfBaBobl);
            sb.append(g(objH));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof cir))) {
                return k(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                cit citVar = this.waiters;
                if (citVar != cit.a) {
                    cit citVar2 = new cit();
                    do {
                        citVar2.a(citVar);
                        if (b.e(this, citVar, citVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof cir))) {
                                        return k(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    j(citVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            j(citVar2);
                        } else {
                            citVar = this.waiters;
                        }
                    } while (citVar != cit.a);
                }
                return k(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if ((obj3 != null) & (!(obj3 instanceof cir))) {
                    return k(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j2 = -nanos;
                long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(strConcat + " for " + string);
        }
        throw new InterruptedException();
    }
}
