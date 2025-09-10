package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otb extends oix {
    public static final Parcelable.Creator CREATOR = new oss(5);
    public final int a;
    public final ord b;

    public otb(int i, ord ordVar) {
        this.a = i;
        this.b = ordVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 2, this.a);
        ojl.I(parcel, 3, this.b, i);
        ojl.w(parcel, iU);
    }
}
