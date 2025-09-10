package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class cin extends Throwable {
    public cin() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
