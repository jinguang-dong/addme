package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oti extends oix {
    public static final Parcelable.Creator CREATOR = new oss(12);
    public final int a;
    public final int b;
    public final byte[] c;

    public oti(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.a);
        ojl.A(parcel, 2, this.b);
        ojl.D(parcel, 3, this.c);
        ojl.w(parcel, iU);
    }
}
