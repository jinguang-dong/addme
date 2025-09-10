package defpackage;

import com.google.android.apps.camera.backup.cNHl.ibINv;
import com.google.android.gms.analytics.EQvQ.UvOvSgfD;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class swv extends szq implements syu {
    static final Object d = new Object();
    static final syt e = new syt(swn.class);
    static final boolean f;
    public static final swo g;
    volatile swk listenersField;
    volatile Object valueField;
    volatile swu waitersField;

    private static void a(swu swuVar, swu swuVar2) {
        g.c(swuVar, swuVar2);
    }

    private final void b(swu swuVar) {
        swuVar.thread = null;
        while (true) {
            swu swuVar2 = this.waitersField;
            if (swuVar2 != swu.a) {
                swu swuVar3 = null;
                while (swuVar2 != null) {
                    swu swuVar4 = swuVar2.next;
                    if (swuVar2.thread != null) {
                        swuVar3 = swuVar2;
                    } else if (swuVar3 != null) {
                        swuVar3.next = swuVar4;
                        if (swuVar3.thread == null) {
                            break;
                        }
                    } else if (!d(swuVar2, swuVar4)) {
                        break;
                    }
                    swuVar2 = swuVar4;
                }
                return;
            }
            return;
        }
    }

    private final boolean d(swu swuVar, swu swuVar2) {
        return g.g(this, swuVar, swuVar2);
    }

    static boolean u(swv swvVar, Object obj, Object obj2) {
        return g.f(swvVar, obj, obj2);
    }

    public final Object s() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && swn.q(obj2)) {
            return swn.k(obj2);
        }
        swu swuVar = this.waitersField;
        if (swuVar != swu.a) {
            swu swuVar2 = new swu();
            do {
                a(swuVar2, swuVar);
                if (d(swuVar, swuVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            b(swuVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & swn.q(obj)));
                    return swn.k(obj);
                }
                swuVar = this.waitersField;
            } while (swuVar != swu.a);
        }
        Object obj3 = this.valueField;
        obj3.getClass();
        return swn.k(obj3);
    }

    public final Object t(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && swn.q(obj)) {
            return swn.k(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            swu swuVar = this.waitersField;
            if (swuVar != swu.a) {
                swu swuVar2 = new swu();
                while (true) {
                    a(swuVar2, swuVar);
                    if (d(swuVar, swuVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(swuVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && swn.q(obj2)) {
                                return swn.k(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(swuVar2);
                    } else {
                        swu swuVar3 = this.waitersField;
                        if (swuVar3 == swu.a) {
                            break;
                        }
                        swuVar = swuVar3;
                    }
                }
            }
            Object obj3 = this.valueField;
            obj3.getClass();
            return swn.k(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && swn.q(obj4)) {
                return swn.k(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
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

    static {
        boolean z;
        swo swqVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                swqVar = new swt();
            } catch (Error | Exception e2) {
                try {
                    swqVar = new swp();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    swqVar = new swq();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                swqVar = new swp();
            } catch (NoClassDefFoundError unused2) {
                swqVar = new swq();
            }
        }
        th = null;
        th2 = null;
        g = swqVar;
        if (th != null) {
            syt sytVar = e;
            sytVar.a().logp(Level.SEVERE, ibINv.anS, "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            sytVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", UvOvSgfD.SAOcHbRkUdOxacS, th);
        }
    }
}
