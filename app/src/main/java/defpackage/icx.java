package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class icx {
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;
    private final long e;
    private final long f;

    public icx() {
        throw null;
    }

    public static boolean a(pnx pnxVar) {
        CaptureResult.Key key = nvj.h;
        boolean z = (key == null || pnxVar.a(key) == null) ? false : true;
        CaptureResult.Key key2 = nvj.i;
        boolean z2 = (key2 == null || pnxVar.a(key2) == null) ? false : true;
        CaptureResult.Key key3 = nvj.j;
        return z || z2 || (key3 != null && pnxVar.a(key3) != null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof icx) {
            icx icxVar = (icx) obj;
            if (this.e == icxVar.e && this.f == icxVar.f) {
                boolean z = icxVar instanceof icx;
                if (Arrays.equals(this.a, z ? icxVar.a : icxVar.a)) {
                    if (Arrays.equals(this.b, z ? icxVar.b : icxVar.b)) {
                        if (Arrays.equals(this.c, z ? icxVar.c : icxVar.c) && Arrays.equals(this.d, icxVar.d)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f;
        long j2 = this.e;
        int iHashCode = ((((((((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ Arrays.hashCode(this.a)) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ Arrays.hashCode(this.c);
        return Arrays.hashCode(this.d) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Camera3ADebugMetadata{");
        sb.append(this.e);
        long j = this.f;
        if (j > 0) {
            sb.append(" ");
            sb.append(j);
        }
        if (this.a != null) {
            sb.append(" AEC");
        }
        if (this.b != null) {
            sb.append(" AF");
        }
        if (this.c != null) {
            sb.append(" AWB");
        }
        if (this.d != null) {
            sb.append(" PD");
        }
        sb.append("}");
        return sb.toString();
    }

    public icx(long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.e = j;
        this.f = j2;
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
        this.d = bArr4;
    }
}
