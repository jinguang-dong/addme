package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uwn extends uwo {
    public static final uwn a = new uwn();

    private uwn() {
        super(uwr.c, uwr.d, uwr.e, uwr.a);
    }

    @Override // defpackage.uwo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.una
    public final String toString() {
        return "Dispatchers.Default";
    }
}
