package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzc extends UrlRequest.Callback {
    public WritableByteChannel a;
    private final szh b;
    private final szh c = new szh();
    private final boolean d;
    private nzd e;
    private long f;

    public nzc(szh szhVar, boolean z) {
        this.b = szhVar;
        this.d = z;
    }

    private final void a() {
        nzd nzdVar = this.e;
        if (nzdVar == null) {
            return;
        }
        nzdVar.close();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        a();
        this.c.a(new nzz());
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        nzx nzxVarA;
        int cronetInternalErrorCode;
        Throwable cause;
        a();
        if (urlResponseInfo != null && urlResponseInfo.getHttpStatusCode() >= 400) {
            nzxVarA = nzx.b(urlResponseInfo.getHttpStatusCode(), urlResponseInfo.getAllHeaders(), urlResponseInfo.getHttpStatusText());
        } else if (cronetException instanceof NetworkException) {
            NetworkException networkException = (NetworkException) cronetException;
            nzw nzwVarA = nzx.a();
            nzwVarA.c(networkException.getCronetInternalErrorCode());
            nzwVarA.a = rnt.U(networkException.getMessage());
            boolean z = true;
            if (!networkException.immediatelyRetryable() && networkException.getErrorCode() != 3 && (cronetInternalErrorCode = networkException.getCronetInternalErrorCode()) != -106 && cronetInternalErrorCode != -103) {
                z = false;
            }
            nzwVarA.d(z);
            nzxVarA = nzwVarA.a();
        } else {
            nzw nzwVarA2 = nzx.a();
            nzwVarA2.a = rnt.U(cronetException.getMessage());
            nzxVarA = nzwVarA2.a();
        }
        int i = nze.a;
        if ((cronetException instanceof CallbackException) && (cause = cronetException.getCause()) != null) {
            cronetException = cause;
        }
        nzz nzzVar = new nzz(nzxVarA, cronetException);
        szh szhVar = this.b;
        if (szhVar.isDone()) {
            this.c.a(nzzVar);
        } else {
            szhVar.a(nzzVar);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        if (urlRequest.isDone()) {
            return;
        }
        if (this.c.isCancelled()) {
            urlRequest.cancel();
            return;
        }
        byteBuffer.flip();
        long j = this.f;
        this.a.getClass();
        long jWrite = 0;
        while (byteBuffer.hasRemaining()) {
            jWrite += r8.write(byteBuffer);
        }
        this.f = j + jWrite;
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        if (this.d) {
            urlRequest.followRedirect();
            return;
        }
        urlRequest.cancel();
        nzd nzdVar = new nzd(urlRequest, urlResponseInfo, this.c, this, str);
        this.e = nzdVar;
        this.b.e(nzdVar);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (httpStatusCode >= 400) {
            this.b.a(new nzz(nzx.b(httpStatusCode, urlResponseInfo.getAllHeaders(), urlResponseInfo.getHttpStatusText())));
            urlRequest.cancel();
        } else {
            nzd nzdVar = new nzd(urlRequest, urlResponseInfo, this.c, this, "");
            this.e = nzdVar;
            this.b.e(nzdVar);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        a();
        this.c.e(Long.valueOf(this.f));
    }
}
