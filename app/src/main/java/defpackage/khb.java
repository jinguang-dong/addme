package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khb {
    public final Object a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;

    public khb(fdq fdqVar, owf owfVar, out outVar) {
        this.d = fdqVar;
        this.c = owfVar;
        this.a = outVar;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, syw] */
    public final void b(kgz kgzVar) {
        synchronized (this.a) {
            if (this.b) {
                ske.M(null);
                return;
            }
            if (this.e == null) {
                this.e = ske.A(kdp.c());
            }
            ?? r1 = this.e;
            r1.getClass();
            r1.submit(new kha(this, kgzVar, 0));
        }
    }

    public final synchronized void c() {
        this.b = true;
        ((Optional) this.e).ifPresent(new gqw(2));
        this.e = Optional.empty();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    public final synchronized void d() {
        if (this.b) {
            return;
        }
        ?? r0 = this.c;
        Object obj = this.d;
        obj.getClass();
        this.e = Optional.of(r0.schedule(new gpk(obj, 11), 1L, TimeUnit.SECONDS));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final synchronized void e() {
        this.b = false;
        this.a.execute(new fnf(this, 11));
    }

    public final int f() {
        return ((bbd) this.c).e();
    }

    public final int g() {
        return ((bbd) this.a).e();
    }

    public final void h(int i) {
        ((bbd) this.c).h(i);
    }

    public final void i(int i) {
        ((bbd) this.a).h(i);
    }

    public final void j(int i, int i2) {
        if (i < 0.0f) {
            akg.b("Index should be non-negative (" + i + ')');
        }
        h(i);
        ((aop) this.d).c(i);
        i(i2);
    }

    public khb() {
        this(0, 0);
    }

    public khb(ScheduledExecutorService scheduledExecutorService, Executor executor, gsz gszVar) {
        this.e = Optional.empty();
        this.b = false;
        this.c = scheduledExecutorService;
        this.a = executor;
        this.d = gszVar;
    }

    public khb(int i, int i2) {
        this.c = new azw(i);
        this.a = new azw(i2);
        this.d = new aop(i);
    }

    public khb(pbb pbbVar, pbn pbnVar, out outVar) {
        this.d = outVar;
        this.c = pbnVar;
        pbbVar.a("CommandExecutor");
        this.a = new Object();
        this.b = false;
    }
}
