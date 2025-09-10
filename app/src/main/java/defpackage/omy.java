package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class omy extends oix {
    public static final Parcelable.Creator CREATOR = new okq(1);
    public final byte[] a;

    public omy(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.D(parcel, 2, this.a);
        ojl.w(parcel, iU);
    }
}
