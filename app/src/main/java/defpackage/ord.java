package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ord extends oix implements Parcelable {
    public static final Parcelable.Creator CREATOR = new oks(10);
    public final String a;
    public final String b;
    public final String c;

    public ord(String str, String str2, String str3) {
        ojl.ay(str);
        this.a = str;
        ojl.ay(str2);
        this.b = str2;
        ojl.ay(str3);
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ord)) {
            return false;
        }
        ord ordVar = (ord) obj;
        return this.a.equals(ordVar.a) && a.K(ordVar.b, this.b) && a.K(ordVar.c, this.c);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        String strTrim = str.trim();
        int length = strTrim.length();
        if (length > 25) {
            strTrim = strTrim.substring(0, 10) + "..." + strTrim.substring(length - 10, length) + "::" + i;
        }
        return "Channel{token=" + strTrim + ", nodeId=" + this.b + ", path=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iU = ojl.u(parcel);
        ojl.J(parcel, 2, str);
        ojl.J(parcel, 3, this.b);
        ojl.J(parcel, 4, this.c);
        ojl.w(parcel, iU);
    }
}
