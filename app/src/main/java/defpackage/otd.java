package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otd extends oix {
    public static final Parcelable.Creator CREATOR = new oss(7);
    public final int a;
    public final String b;

    public otd(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 2, this.a);
        ojl.J(parcel, 3, this.b);
        ojl.w(parcel, iU);
    }
}
