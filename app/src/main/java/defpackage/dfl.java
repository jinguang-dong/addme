package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfl extends RuntimeException {
    public final Throwable a;
    public final int b;

    public dfl(int i, Throwable th) {
        super(th);
        this.b = i;
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
