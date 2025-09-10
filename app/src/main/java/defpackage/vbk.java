package defpackage;

import org.chromium.net.QuicException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vbk extends QuicException {
    private final vbj a;

    public vbk(android.net.http.QuicException quicException) {
        super(quicException.getMessage(), quicException);
        this.a = new vbj(quicException, true);
    }

    @Override // org.chromium.net.QuicException
    public final int getConnectionCloseSource() {
        return 0;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return -1;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.a.getErrorCode();
    }

    @Override // org.chromium.net.QuicException
    public final int getQuicDetailedErrorCode() {
        return 0;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.a.immediatelyRetryable();
    }
}
