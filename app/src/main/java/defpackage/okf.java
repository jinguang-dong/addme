package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okf extends oix {
    public static final okg CREATOR = new okg(0);
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final Bundle f;

    public okf(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.J(parcel, 2, this.a);
        ojl.J(parcel, 3, this.b);
        ojl.J(parcel, 4, this.c);
        ojl.J(parcel, 5, this.d);
        ojl.J(parcel, 6, this.e);
        ojl.C(parcel, 7, this.f);
        ojl.w(parcel, iU);
    }
}
