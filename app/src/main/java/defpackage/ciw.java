package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ciw extends Throwable {
    public ciw(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
