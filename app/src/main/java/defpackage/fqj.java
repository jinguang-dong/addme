package defpackage;

import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fqj implements Thread.UncaughtExceptionHandler {
    private static final sgv a = sgv.g("fqj");
    private final Thread.UncaughtExceptionHandler b;
    private final out c = out.b;

    public fqj(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = uncaughtExceptionHandler;
    }

    protected abstract void a(Throwable th);

    public final void b(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sgt, shi] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        a(th);
        if (out.d()) {
            b(thread, th);
        } else {
            ((sgt) ((sgt) a.b().i(th)).M((char) 343)).v("Uncaught exception in background thread %s", thread);
            this.c.execute(new as(this, thread, th, 20, (short[]) null));
        }
    }
}
