package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oit extends oix {
    public static final Parcelable.Creator CREATOR = new azu(9);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public oit(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, i2);
        ojl.x(parcel, 2, this.b);
        ojl.x(parcel, 3, this.c);
        ojl.A(parcel, 4, this.d);
        ojl.A(parcel, 5, this.e);
        ojl.w(parcel, iU);
    }
}
