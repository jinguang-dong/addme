package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sky implements Closeable {
    private static final ThreadLocal b = new skx();
    public int a = 0;

    public static sky a() {
        return (sky) b.get();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        if (i <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.a = i - 1;
    }
}
