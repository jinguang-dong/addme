package defpackage;

import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fqi extends fqj {
    public static final sgv a = sgv.g("fqi");
    public final fql b;
    private final out c;

    public fqi(fql fqlVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        super(uncaughtExceptionHandler);
        this.c = out.b;
        this.b = fqlVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [sgt, shi] */
    @Override // defpackage.fqj
    protected final void a(Throwable th) {
        if (this.b != null) {
            if (!out.d()) {
                ((sgt) ((sgt) a.b().i(th)).M((char) 342)).s("Uncaught exception in background thread");
            }
            this.c.c(new fjw(this, th, 8));
        }
    }
}
