package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.UserManager;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prt {
    public static final /* synthetic */ int a = 0;
    private static UserManager b = null;
    private static volatile boolean c = false;

    private prt() {
    }

    public static Context a(Context context) {
        return context.isDeviceProtectedStorage() ? context : context.createDeviceProtectedStorageContext();
    }

    public static syu b(final Context context, Callable callable, Executor executor) {
        if (g(context)) {
            return ske.Q(callable, executor);
        }
        final szh szhVar = new szh();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final prs prsVar = new prs(atomicBoolean, context, szhVar, callable, executor);
        context.registerReceiver(prsVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!g(context) || !atomicBoolean.compareAndSet(false, true)) {
            szhVar.c(new Runnable() { // from class: prr
                @Override // java.lang.Runnable
                public final void run() {
                    int i = prt.a;
                    if (szhVar.isCancelled() && atomicBoolean.compareAndSet(false, true)) {
                        prt.e(context, prsVar);
                    }
                }
            }, sxo.a);
            return szhVar;
        }
        e(context, prsVar);
        szhVar.f(ske.Q(callable, executor));
        return szhVar;
    }

    public static syu c(Context context, Runnable runnable) {
        return b(context, Executors.callable(runnable, null), sxo.a);
    }

    public static syu d(Context context, Runnable runnable, Executor executor) {
        return b(context, Executors.callable(runnable, null), executor);
    }

    public static void e(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
    }

    public static boolean f(Context context) {
        return !h(context);
    }

    public static boolean g(Context context) {
        return h(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean h(android.content.Context r7) {
        /*
            boolean r0 = defpackage.prt.c
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<prt> r0 = defpackage.prt.class
            monitor-enter(r0)
            boolean r2 = defpackage.prt.c     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            return r1
        Lf:
            r2 = r1
        L10:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L48
            android.os.UserManager r3 = defpackage.prt.b     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L23
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> L52
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> L52
            defpackage.prt.b = r3     // Catch: java.lang.Throwable -> L52
        L23:
            android.os.UserManager r3 = defpackage.prt.b     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L29
            r5 = r1
            goto L4c
        L29:
            boolean r6 = r3.isUserUnlocked()     // Catch: java.lang.NullPointerException -> L3b java.lang.Throwable -> L52
            if (r6 != 0) goto L39
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.NullPointerException -> L3b java.lang.Throwable -> L52
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.NullPointerException -> L3b java.lang.Throwable -> L52
            if (r7 != 0) goto L48
        L39:
            r5 = r1
            goto L48
        L3b:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L52
            defpackage.prt.b = r4     // Catch: java.lang.Throwable -> L52
            int r2 = r2 + 1
            goto L10
        L48:
            if (r5 == 0) goto L4c
            defpackage.prt.b = r4     // Catch: java.lang.Throwable -> L52
        L4c:
            if (r5 == 0) goto L50
            defpackage.prt.c = r1     // Catch: java.lang.Throwable -> L52
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            return r5
        L52:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prt.h(android.content.Context):boolean");
    }
}
