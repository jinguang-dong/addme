package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class osy extends oix {
    public static final Parcelable.Creator CREATOR = new oss(2);
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public osy(int i, String str, byte[] bArr, String str2) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    public final String toString() {
        byte[] bArr = this.c;
        Object objValueOf = bArr == null ? "null" : Integer.valueOf(bArr.length);
        String str = this.b;
        return "MessageEventParcelable[" + this.a + "," + str + ", size=" + objValueOf.toString() + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iU = ojl.u(parcel);
        ojl.A(parcel, 2, i2);
        ojl.J(parcel, 3, this.b);
        ojl.D(parcel, 4, this.c);
        ojl.J(parcel, 5, this.d);
        ojl.w(parcel, iU);
    }
}
