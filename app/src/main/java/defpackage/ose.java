package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ose extends oix {
    public static final Parcelable.Creator CREATOR = new orr(14);
    public final int a;
    public final orn b;

    public ose(int i, orn ornVar) {
        this.a = i;
        this.b = ornVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.a);
        ojl.I(parcel, 2, this.b, i);
        ojl.w(parcel, iU);
    }
}
