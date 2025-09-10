package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axz extends IllegalStateException {
    private final String a;

    public axz(String str) {
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
