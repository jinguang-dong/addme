package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class swi extends Throwable {
    public swi() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
