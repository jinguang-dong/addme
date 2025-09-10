package defpackage;

import java.io.Closeable;
import java.util.Map;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzd implements Closeable {
    public final UrlRequest a;
    public final szh b;
    public final nzc c;
    public final String d;
    private final UrlResponseInfo e;

    public nzd(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, szh szhVar, nzc nzcVar, String str) {
        this.a = urlRequest;
        this.e = urlResponseInfo;
        this.b = szhVar;
        this.c = nzcVar;
        this.d = str;
    }

    public final int a() {
        return this.e.getHttpStatusCode();
    }

    public final Map b() {
        return this.e.getAllHeaders();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.cancel();
    }
}
