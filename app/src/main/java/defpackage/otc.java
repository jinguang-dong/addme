package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otc extends oix {
    public static final Parcelable.Creator CREATOR = new oss(6);
    public final String a;
    public final String b;
    public final long c;

    public otc(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.J(parcel, 2, this.a);
        ojl.J(parcel, 3, this.b);
        ojl.B(parcel, 4, this.c);
        ojl.w(parcel, iU);
    }
}
