package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class orx extends oix {
    public static final Parcelable.Creator CREATOR = new orr(7);
    public final int a;
    public final boolean b;

    public orx(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 2, this.a);
        ojl.x(parcel, 3, this.b);
        ojl.w(parcel, iU);
    }
}
