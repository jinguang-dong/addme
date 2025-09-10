package defpackage;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
final class swt extends swo {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;
    public static final /* synthetic */ int g = 0;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: sws
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() throws IllegalAccessException, IllegalArgumentException {
                        int i = swt.g;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                c = unsafe.objectFieldOffset(swv.class.getDeclaredField("waitersField"));
                b = unsafe.objectFieldOffset(swv.class.getDeclaredField("listenersField"));
                d = unsafe.objectFieldOffset(swv.class.getDeclaredField("valueField"));
                e = unsafe.objectFieldOffset(swu.class.getDeclaredField("thread"));
                f = unsafe.objectFieldOffset(swu.class.getDeclaredField("next"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        } catch (PrivilegedActionException e3) {
            throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // defpackage.swo
    public final swk a(swv swvVar, swk swkVar) {
        swk swkVar2;
        do {
            swkVar2 = swvVar.listenersField;
            if (swkVar == swkVar2) {
                break;
            }
        } while (!e(swvVar, swkVar2, swkVar));
        return swkVar2;
    }

    @Override // defpackage.swo
    public final swu b(swv swvVar, swu swuVar) {
        swu swuVar2;
        do {
            swuVar2 = swvVar.waitersField;
            if (swuVar == swuVar2) {
                break;
            }
        } while (!g(swvVar, swuVar2, swuVar));
        return swuVar2;
    }

    @Override // defpackage.swo
    public final void c(swu swuVar, swu swuVar2) {
        a.putObject(swuVar, f, swuVar2);
    }

    @Override // defpackage.swo
    public final void d(swu swuVar, Thread thread) {
        a.putObject(swuVar, e, thread);
    }

    @Override // defpackage.swo
    public final boolean e(swv swvVar, swk swkVar, swk swkVar2) {
        return swr.a(a, swvVar, b, swkVar, swkVar2);
    }

    @Override // defpackage.swo
    public final boolean f(swv swvVar, Object obj, Object obj2) {
        return swr.a(a, swvVar, d, obj, obj2);
    }

    @Override // defpackage.swo
    public final boolean g(swv swvVar, swu swuVar, swu swuVar2) {
        return swr.a(a, swvVar, c, swuVar, swuVar2);
    }
}
