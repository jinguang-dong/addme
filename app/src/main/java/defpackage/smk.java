package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class smk implements Closeable {
    public Throwable a;
    private final Deque b = new ArrayDeque(4);

    public final void a(Closeable closeable) {
        if (closeable != null) {
            this.b.addFirst(closeable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th = this.a;
        while (true) {
            Deque deque = this.b;
            if (deque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (Throwable unused) {
                        smj.a.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(String.valueOf(closeable))), th2);
                    }
                }
            }
        }
        if (this.a != null || th == null) {
            return;
        }
        rxa.b(th, IOException.class);
        rxa.c(th);
        throw new AssertionError(th);
    }
}
