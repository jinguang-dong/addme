package defpackage;

import android.os.Parcel;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okp extends oix {
    public static final okq CREATOR = new okq(0);
    public final okr a;
    public final byte[] b;

    public okp(okr okrVar, byte[] bArr) {
        okrVar.getClass();
        this.a = okrVar;
        bArr.getClass();
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            okp okpVar = (okp) obj;
            if (this.a.equals(okpVar.a) && Arrays.equals(this.b, okpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String string = this.a.toString();
        String string2 = Arrays.toString(bArr);
        if (string2.length() > 20) {
            string2 = String.valueOf(string2.substring(0, 17)).concat("...");
        }
        return "ServiceDump{serviceDumpRequest=" + string + ", dumpOutput=\"" + String.format(string2, new Object[0]) + "\"}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.I(parcel, 2, this.a, i);
        ojl.D(parcel, 3, this.b);
        ojl.w(parcel, iU);
    }
}
