package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shg extends Exception {
    public shg(Throwable th, shw shwVar, StackTraceElement[] stackTraceElementArr) {
        super(shwVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
