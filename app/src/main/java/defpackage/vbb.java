package defpackage;

import android.net.http.BidirectionalStream;
import android.net.http.HeaderBlock;
import android.net.http.HttpException;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vbb implements BidirectionalStream.Callback {
    public vbc a;
    private final BidirectionalStream.Callback b;

    public vbb(BidirectionalStream.Callback callback) {
        this.b = callback;
    }

    @Override // android.net.http.BidirectionalStream.Callback
    public final void onCanceled(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        vbt vbtVarA = vbt.a(urlResponseInfo);
        try {
            this.b.onCanceled(this.a, vbtVarA);
        } finally {
            this.a.a(2, vbtVarA, null);
        }
    }

    @Override // android.net.http.BidirectionalStream.Callback
    public final void onFailed(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        vbt vbtVarA = vbt.a(urlResponseInfo);
        CronetException cronetExceptionP = ujo.p(httpException);
        try {
            this.b.onFailed(this.a, vbtVarA, cronetExceptionP);
        } finally {
            this.a.a(1, vbtVarA, cronetExceptionP);
        }
    }

    @Override // android.net.http.BidirectionalStream.Callback
    public final void onReadCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.b.onReadCompleted(this.a, vbt.a(urlResponseInfo), byteBuffer, z);
    }

    @Override // android.net.http.BidirectionalStream.Callback
    public final void onResponseHeadersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.b.onResponseHeadersReceived(this.a, vbt.a(urlResponseInfo));
    }

    @Override // android.net.http.BidirectionalStream.Callback
    public final void onResponseTrailersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HeaderBlock headerBlock) {
        this.b.onResponseTrailersReceived(this.a, vbt.a(urlResponseInfo), new vbe(headerBlock));
    }

    @Override // android.net.http.BidirectionalStream.Callback
    public final void onStreamReady(android.net.http.BidirectionalStream bidirectionalStream) {
        this.b.onStreamReady(this.a);
    }

    @Override // android.net.http.BidirectionalStream.Callback
    public final void onSucceeded(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        vbt vbtVarA = vbt.a(urlResponseInfo);
        try {
            this.b.onSucceeded(this.a, vbtVarA);
        } finally {
            this.a.a(0, vbtVarA, null);
        }
    }

    @Override // android.net.http.BidirectionalStream.Callback
    public final void onWriteCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.b.onWriteCompleted(this.a, vbt.a(urlResponseInfo), byteBuffer, z);
    }
}
