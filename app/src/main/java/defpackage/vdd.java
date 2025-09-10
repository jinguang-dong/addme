package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import org.chromium.net.NetworkException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vdd extends NetworkException {
    protected final int a;
    protected final int b;

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return this.b;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(super.getMessage());
        sb.append(", ErrorCode=");
        sb.append(this.a);
        int i = this.b;
        if (i != 0) {
            sb.append(", InternalErrorCode=");
            sb.append(i);
        }
        sb.append(", Retryable=");
        sb.append(immediatelyRetryable());
        return sb.toString();
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        int i = this.a;
        return i == 3 || i == 4 || i == 5 || i == 6 || i == 8;
    }

    public vdd() {
        super(PJGqOKsIpSdZ.RxXccrVcN, null);
        this.a = 9;
        this.b = -4;
    }
}
