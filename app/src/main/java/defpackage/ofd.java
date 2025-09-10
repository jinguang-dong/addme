package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ofd extends UnsupportedOperationException {
    private final odl a;

    public ofd(odl odlVar) {
        this.a = odlVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(String.valueOf(this.a)));
    }
}
