package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class unn extends Exception {
    public final Throwable a;

    public unn(Throwable th, una unaVar, uhf uhfVar) {
        super(a.bC(uhfVar, unaVar, "Coroutine dispatcher ", " threw an exception, context = "), th);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
