package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ohn extends oix {
    public static final Parcelable.Creator CREATOR = new hbs(16);
    public final int a;
    public final String b;

    public ohn(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ohn)) {
            return false;
        }
        ohn ohnVar = (ohn) obj;
        return ohnVar.a == this.a && a.K(ohnVar.b, this.b);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.a + ":" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.a);
        ojl.J(parcel, 2, this.b);
        ojl.w(parcel, iU);
    }
}
