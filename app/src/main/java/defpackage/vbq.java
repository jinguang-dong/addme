package defpackage;

import android.net.http.HttpException;
import android.net.http.UrlRequest;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vbq implements UrlRequest.Callback {
    public final UrlRequest.Callback a;
    public vbs b;

    public vbq(UrlRequest.Callback callback) {
        this.a = callback;
    }

    @Override // android.net.http.UrlRequest.Callback
    public final void onCanceled(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        vbt vbtVarB = vbt.b(urlResponseInfo);
        try {
            this.a.onCanceled(this.b, vbtVarB);
        } finally {
            this.b.a(2, vbtVarB, null);
        }
    }

    @Override // android.net.http.UrlRequest.Callback
    public final void onFailed(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        vbt vbtVarB = vbt.b(urlResponseInfo);
        CronetException cronetExceptionP = ujo.p(httpException);
        try {
            this.a.onFailed(this.b, vbtVarB, cronetExceptionP);
        } finally {
            this.b.a(1, vbtVarB, cronetExceptionP);
        }
    }

    @Override // android.net.http.UrlRequest.Callback
    public final void onReadCompleted(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception {
        ujo.o(new vbp(this, urlResponseInfo, byteBuffer, 1), Exception.class);
    }

    @Override // android.net.http.UrlRequest.Callback
    public final void onRedirectReceived(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) throws Exception {
        ujo.o(new vbp(this, urlResponseInfo, str, 0), Exception.class);
    }

    @Override // android.net.http.UrlRequest.Callback
    public final void onResponseStarted(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) throws Exception {
        ujo.o(new vbo(this, urlResponseInfo, 0), Exception.class);
    }

    @Override // android.net.http.UrlRequest.Callback
    public final void onSucceeded(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        vbt vbtVarB = vbt.b(urlResponseInfo);
        try {
            this.a.onSucceeded(this.b, vbtVarB);
        } finally {
            this.b.a(0, vbtVarB, null);
        }
    }
}
