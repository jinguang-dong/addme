package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class opg extends oix {
    public static final Parcelable.Creator CREATOR = new okq(13);
    public final boolean a;
    public final boolean b;
    public final int c;

    public opg(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.x(parcel, 2, this.a);
        ojl.x(parcel, 3, this.b);
        ojl.A(parcel, 4, this.c);
        ojl.w(parcel, iU);
    }
}
