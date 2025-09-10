package defpackage;

import android.os.Parcel;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okr extends oix {
    public static final oks CREATOR = new oks(0);
    final String a;
    final String b;
    final String[] c;
    final int d;
    final boolean e;

    public okr(String str, String str2, String[] strArr, int i, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2 != null ? str2 : str;
        this.c = strArr;
        if (i != 2 && i != 1) {
            throw new IllegalArgumentException(a.bv(i, "Unknown expected output format="));
        }
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            okr okrVar = (okr) obj;
            if (this.e == okrVar.e && this.d == okrVar.d && this.a.equals(okrVar.a) && this.b.equals(okrVar.b) && Arrays.equals(this.c, okrVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(this.a, this.b, Boolean.valueOf(this.e), Integer.valueOf(this.d)) * 31) + Arrays.hashCode(this.c);
    }

    public final String toString() {
        return "ServiceDumpRequest{serviceDumpId='" + this.a + "',serviceName='" + this.b + "', dumpsysFlags=" + Arrays.toString(this.c) + ", expectedOutputFormat=" + this.d + ", showOutputToUser=" + this.e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.J(parcel, 2, this.a);
        ojl.K(parcel, 3, this.c);
        ojl.A(parcel, 4, this.d);
        ojl.x(parcel, 5, this.e);
        ojl.J(parcel, 6, this.b);
        ojl.w(parcel, iU);
    }
}
