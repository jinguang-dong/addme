package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rcv implements Closeable {
    public Closeable a;

    public rcv(Closeable closeable) {
        this.a = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Closeable closeable = this.a;
        if (closeable != null) {
            closeable.close();
        }
    }
}
