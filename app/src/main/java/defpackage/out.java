package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class out implements Executor {
    public static final ouu a;
    public static final out b;
    private static final ThreadLocal c;
    private final ouu d;

    static {
        oup oupVar = new oup(new Handler(Looper.getMainLooper()));
        a = oupVar;
        b = new out(oupVar);
        c = new ous();
    }

    public out(ouu ouuVar) {
        this.d = ouuVar;
    }

    public static void b() {
        rnt.M(!d(), "Is main thread.");
    }

    public static boolean d() {
        Boolean bool = (Boolean) c.get();
        return bool != null && bool.booleanValue();
    }

    public final void c(Runnable runnable) {
        if (d()) {
            runnable.run();
        } else {
            this.d.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.execute(runnable);
    }

    @Deprecated
    public out() {
        this(a);
    }

    public static void a() {
        rnt.M(d(), GAQqzWiWWcYOgy.kRoaMNqg);
    }
}
