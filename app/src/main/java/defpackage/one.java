package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class one extends oix {
    public static final Parcelable.Creator CREATOR = new okq(3);
    public final String a;
    public final String b;
    public final ond c;
    public final boolean d;

    public one(String str, String str2, ond ondVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = ondVar;
        this.d = z;
    }

    final void a(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.a(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof one)) {
            return false;
        }
        one oneVar = (one) obj;
        return a.K(this.a, oneVar.a) && a.K(this.b, oneVar.b) && a.K(this.c, oneVar.c) && this.d == oneVar.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.J(parcel, 2, this.a);
        ojl.J(parcel, 3, this.b);
        ojl.I(parcel, 4, this.c, i);
        ojl.x(parcel, 5, this.d);
        ojl.w(parcel, iU);
    }
}
