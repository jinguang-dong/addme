package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twv extends Exception {
    private final int a = 1;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return a.bw(this.a != 1 ? "Unknown error" : "Package not available", "LoaderException{", "}");
    }
}
