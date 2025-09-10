package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tar extends Exception {
    public tar(Throwable th) {
        super(th);
        setStackTrace(skw.b(sha.class, -1, 2));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
