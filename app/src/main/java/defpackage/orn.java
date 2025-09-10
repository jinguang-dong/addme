package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class orn extends oix {
    public static final Parcelable.Creator CREATOR = new oks(19);
    private final byte[] a;

    public orn(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iU = ojl.u(parcel);
        ojl.D(parcel, 1, (byte[]) bArr.clone());
        ojl.w(parcel, iU);
    }
}
