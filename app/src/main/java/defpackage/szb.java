package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class szb extends swm implements Runnable {
    private final Runnable a;

    public szb(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    @Override // defpackage.swn
    protected final String ez() {
        return "task=[" + this.a.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            a(th);
            throw th;
        }
    }
}
