package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqq extends oix {
    public static final Parcelable.Creator CREATOR = new oks(2);
    public final byte a;
    public final byte b;
    public final String c;

    public oqq(byte b, byte b2, String str) {
        this.a = b;
        this.b = b2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        oqq oqqVar = (oqq) obj;
        return this.a == oqqVar.a && this.b == oqqVar.b && this.c.equals(oqqVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "AmsEntityUpdateParcelable{, mEntityId=" + ((int) this.a) + ", mAttributeId=" + ((int) this.b) + ", mValue='" + this.c + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.y(parcel, 2, this.a);
        ojl.y(parcel, 3, this.b);
        ojl.J(parcel, 4, this.c);
        ojl.w(parcel, iU);
    }
}
