package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqc extends oix {
    public static final Parcelable.Creator CREATOR = new okq(17);
    public final Uri a;
    public final int b;

    public oqc(Uri uri, int i) {
        this.a = uri;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oqc)) {
            return false;
        }
        oqc oqcVar = (oqc) obj;
        return Objects.equals(this.a, oqcVar.a) && this.b == oqcVar.b;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.b("uri", this.a);
        rwbVarW.e("filterType", this.b);
        return rwbVarW.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int iU = ojl.u(parcel);
        ojl.I(parcel, 1, uri, i);
        ojl.A(parcel, 2, this.b);
        ojl.w(parcel, iU);
    }
}
