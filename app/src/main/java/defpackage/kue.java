package defpackage;

import android.app.Application;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kue implements mcw {
    public final Object a;
    private final /* synthetic */ int b;
    private final Object c;

    public kue(Object obj, Object obj2, int i) {
        this.b = i;
        this.c = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            Object obj = this.c;
            obj.getClass();
            this.a.execute(new iyz(obj, 19));
            return;
        }
        if (i == 1) {
            ((Application) this.c).registerActivityLifecycleCallbacks(new iss(this));
        } else {
            if (((AtomicBoolean) this.a).getAndSet(true)) {
                return;
            }
            this.c.run();
        }
    }

    public kue(Runnable runnable, int i) {
        this.b = i;
        this.a = new AtomicBoolean(false);
        this.c = runnable;
    }
}
