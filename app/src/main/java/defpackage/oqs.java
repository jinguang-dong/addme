package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqs extends oix {
    public static final Parcelable.Creator CREATOR = new oks(4);
    public final String a;
    public final String b;
    public final ott c;
    public final String d;
    public final String e;
    public final Float f;
    public final oqu g;

    public oqs(String str, String str2, ott ottVar, String str3, String str4, Float f, oqu oquVar) {
        this.a = str;
        this.b = str2;
        this.c = ottVar;
        this.d = str3;
        this.e = str4;
        this.f = f;
        this.g = oquVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oqs oqsVar = (oqs) obj;
            if (Objects.equals(this.a, oqsVar.a) && Objects.equals(this.b, oqsVar.b) && Objects.equals(this.c, oqsVar.c) && Objects.equals(this.d, oqsVar.d) && Objects.equals(this.e, oqsVar.e) && Objects.equals(this.f, oqsVar.f) && Objects.equals(this.g, oqsVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final String toString() {
        ott ottVar = this.c;
        return "AppParcelable{title='" + this.b + "', developerName='" + this.d + "', formattedPrice='" + this.e + "', starRating=" + this.f + ", wearDetails=" + String.valueOf(this.g) + ", deepLinkUri='" + this.a + "', icon=" + String.valueOf(ottVar) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.J(parcel, 1, this.a);
        ojl.J(parcel, 2, this.b);
        ojl.I(parcel, 3, this.c, i);
        ojl.J(parcel, 4, this.d);
        ojl.J(parcel, 5, this.e);
        Float f = this.f;
        if (f != null) {
            ojl.z(parcel, 6, 4);
            parcel.writeFloat(f.floatValue());
        }
        ojl.I(parcel, 7, this.g, i);
        ojl.w(parcel, iU);
    }
}
