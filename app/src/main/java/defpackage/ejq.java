package defpackage;

import java.io.Closeable;
import java.net.HttpURLConnection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ejq implements Closeable {
    public final HttpURLConnection a;

    public ejq(HttpURLConnection httpURLConnection) {
        this.a = httpURLConnection;
    }

    public final boolean a() {
        return this.a.getResponseCode() / 100 == 2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.disconnect();
    }
}
