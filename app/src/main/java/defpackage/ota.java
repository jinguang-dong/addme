package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ota extends oix {
    public static final Parcelable.Creator CREATOR = new oss(4);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public ota(String str, String str2, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ota) {
            return ((ota) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Node{" + this.b + ", id=" + this.a + ", hops=" + this.c + ", isNearby=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iU = ojl.u(parcel);
        ojl.J(parcel, 2, str);
        ojl.J(parcel, 3, this.b);
        ojl.A(parcel, 4, this.c);
        ojl.x(parcel, 5, this.d);
        ojl.w(parcel, iU);
    }
}
