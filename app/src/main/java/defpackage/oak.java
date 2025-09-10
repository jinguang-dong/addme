package defpackage;

import android.content.Context;
import android.util.LogPrinter;
import java.lang.Thread;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oak {
    public static volatile oak a;
    public final Context b;
    public Thread.UncaughtExceptionHandler c;
    public volatile oae d;
    private final oah e;

    public oak(Context context) {
        Context applicationContext = context.getApplicationContext();
        ojl.ay(applicationContext);
        this.b = applicationContext;
        this.e = new oah(this);
        new CopyOnWriteArrayList();
        int i = oad.a;
        new LogPrinter(4, "GA/LogCatTransport");
    }

    public static void a() {
        if (!(Thread.currentThread() instanceof oaj)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final void b(Runnable runnable) {
        this.e.submit(runnable);
    }
}
