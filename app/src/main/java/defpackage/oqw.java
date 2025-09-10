package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqw extends oix {
    public static final Parcelable.Creator CREATOR = new oks(7);
    public final int a;
    public final boolean b;

    public oqw(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqw)) {
            return false;
        }
        oqw oqwVar = (oqw) obj;
        return this.a == oqwVar.a && this.b == oqwVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Boolean.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.a);
        ojl.x(parcel, 2, this.b);
        ojl.w(parcel, iU);
    }
}
