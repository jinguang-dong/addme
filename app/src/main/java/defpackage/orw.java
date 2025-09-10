package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class orw extends oix {
    public static final Parcelable.Creator CREATOR = new orr(6);
    public final int a;
    public final boolean b;
    public final boolean c;

    public orw(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 2, this.a);
        ojl.x(parcel, 3, this.b);
        ojl.x(parcel, 4, this.c);
        ojl.w(parcel, iU);
    }
}
