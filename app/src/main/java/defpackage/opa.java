package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class opa extends oix {
    public static final Parcelable.Creator CREATOR = new okq(12);
    public final boolean a;
    public final int b;

    public opa(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.x(parcel, 2, this.a);
        ojl.A(parcel, 3, this.b);
        ojl.w(parcel, iU);
    }
}
