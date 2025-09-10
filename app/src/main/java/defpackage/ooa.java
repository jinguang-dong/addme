package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ooa extends oix {
    public static final Parcelable.Creator CREATOR = new okq(8);
    final int a;
    final oiq b;

    public ooa(int i, oiq oiqVar) {
        this.a = i;
        this.b = oiqVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.a);
        ojl.I(parcel, 2, this.b, i);
        ojl.w(parcel, iU);
    }
}
