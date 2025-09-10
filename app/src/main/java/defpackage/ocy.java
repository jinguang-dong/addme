package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ocy extends oix {
    public static final Parcelable.Creator CREATOR = new hbs(6);
    public final int a;
    public final int b;
    public final int c;

    public ocy(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, i2);
        ojl.A(parcel, 2, this.b);
        ojl.A(parcel, 3, this.c);
        ojl.w(parcel, iU);
    }
}
