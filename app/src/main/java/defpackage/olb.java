package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class olb extends oix {
    public static final Parcelable.Creator CREATOR = new okg(9);
    final String a;
    final String b;
    final String c;
    final String d;

    public olb(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str4;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.J(parcel, 2, this.a);
        ojl.J(parcel, 3, this.b);
        ojl.J(parcel, 4, this.c);
        ojl.J(parcel, 5, this.d);
        ojl.w(parcel, iU);
    }
}
