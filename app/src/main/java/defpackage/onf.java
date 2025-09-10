package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class onf extends oix {
    public static final Parcelable.Creator CREATOR = new okq(4);
    public final List a;

    public onf(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof onf) {
            return this.a.equals(((onf) obj).a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (one oneVar : this.a) {
            if (!z) {
                sb.append(", ");
            }
            oneVar.a(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.N(parcel, 2, this.a);
        ojl.w(parcel, iU);
    }
}
