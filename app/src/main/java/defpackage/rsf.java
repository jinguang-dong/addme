package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsf implements Runnable, rsp {
    private rso a;
    private final boolean b = rcc.f(Thread.currentThread());
    private boolean c;
    private boolean d;
    private boolean e;

    public rsf(rso rsoVar, boolean z) {
        this.e = false;
        this.a = rsoVar;
        this.e = z;
    }

    private final void b() {
        this.c = true;
        if (!this.b || this.d) {
            return;
        }
        rcc.e();
    }

    public final void a(syu syuVar) {
        if (this.c) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.d) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.d = true;
        syuVar.c(this, sxo.a);
    }

    @Override // defpackage.rsp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        rso rsoVar = this.a;
        try {
            this.a = null;
            if (!this.d) {
                if (this.c) {
                    throw new IllegalStateException("Span was already closed!");
                }
                b();
            }
            if (rsoVar != null) {
                rsoVar.close();
            }
            if (this.e) {
                rsa.c(rsa.a(), rse.a);
            }
        } catch (Throwable th) {
            if (rsoVar != null) {
                try {
                    rsoVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c || !this.d) {
            rcc.d(new ndk(20));
        } else {
            b();
        }
    }
}
