package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rcc {
    private static final Object a = new Object();
    private static Thread b;
    private static volatile Handler c;

    public static Handler a() {
        if (c == null) {
            synchronized (a) {
                if (c == null) {
                    c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return c;
    }

    public static void b() {
        if (e()) {
            throw new rcb("Must be called on a background thread");
        }
    }

    public static void c() {
        if (!e()) {
            throw new rcb("Must be called on the main thread");
        }
    }

    public static void d(Runnable runnable) {
        a().post(runnable);
    }

    public static boolean e() {
        return f(Thread.currentThread());
    }

    public static boolean f(Thread thread) {
        if (b == null) {
            b = Looper.getMainLooper().getThread();
        }
        return thread == b;
    }
}
