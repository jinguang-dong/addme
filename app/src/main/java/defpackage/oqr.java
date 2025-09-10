package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqr extends oix {
    public static final Parcelable.Creator CREATOR = new oks(3);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final byte g;
    public final byte h;
    public final byte i;
    public final byte j;
    public final String k;
    private final String l;

    public oqr(int i, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.l = str6;
        this.g = b;
        this.h = b2;
        this.i = b3;
        this.j = b4;
        this.k = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        oqr oqrVar = (oqr) obj;
        if (this.a != oqrVar.a || this.g != oqrVar.g || this.h != oqrVar.h || this.i != oqrVar.i || this.j != oqrVar.j || !this.b.equals(oqrVar.b)) {
            return false;
        }
        String str = this.c;
        if (str == null ? oqrVar.c != null : !str.equals(oqrVar.c)) {
            return false;
        }
        if (!this.d.equals(oqrVar.d) || !this.e.equals(oqrVar.e) || !this.f.equals(oqrVar.f)) {
            return false;
        }
        String str2 = this.l;
        if (str2 == null ? oqrVar.l != null : !str2.equals(oqrVar.l)) {
            return false;
        }
        String str3 = this.k;
        return str3 != null ? str3.equals(oqrVar.k) : oqrVar.k == null;
    }

    public final int hashCode() {
        int iHashCode = ((this.a + 31) * 31) + this.b.hashCode();
        String str = this.c;
        int iHashCode2 = ((((((((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        String str2 = this.l;
        int iHashCode3 = (((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31;
        String str3 = this.k;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AncsNotificationParcelable{, id=" + this.a + ", appId='" + this.b + "', dateTime='" + this.c + "', eventId=" + ((int) this.g) + ", eventFlags=" + ((int) this.h) + ", categoryId=" + ((int) this.i) + ", categoryCount=" + ((int) this.j) + ", packageName='" + this.k + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 2, this.a);
        String str = this.b;
        ojl.J(parcel, 3, str);
        ojl.J(parcel, 4, this.c);
        ojl.J(parcel, 5, this.d);
        ojl.J(parcel, 6, this.e);
        ojl.J(parcel, 7, this.f);
        String str2 = this.l;
        if (str2 != null) {
            str = str2;
        }
        ojl.J(parcel, 8, str);
        ojl.y(parcel, 9, this.g);
        ojl.y(parcel, 10, this.h);
        ojl.y(parcel, 11, this.i);
        ojl.y(parcel, 12, this.j);
        ojl.J(parcel, 13, this.k);
        ojl.w(parcel, iU);
    }
}
