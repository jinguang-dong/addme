package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvf extends RuntimeException {
    private final transient uhf a;

    public uvf(uhf uhfVar) {
        this.a = uhfVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.a);
    }
}
