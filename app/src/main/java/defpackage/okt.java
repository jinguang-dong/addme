package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okt extends oix {
    public static final Parcelable.Creator CREATOR = new okg(5);
    public int a;
    int b;

    public okt(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 2, this.a);
        ojl.A(parcel, 3, this.b);
        ojl.w(parcel, iU);
    }

    public okt() {
        this(3, 0);
    }
}
