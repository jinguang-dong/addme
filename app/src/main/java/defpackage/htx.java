package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class htx implements Runnable, paq {
    private final our a;
    private final Runnable b;

    public htx(our ourVar, Runnable runnable) {
        this.a = ourVar;
        this.b = runnable;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.run();
    }
}
