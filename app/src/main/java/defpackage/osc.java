package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class osc extends oix {
    public static final Parcelable.Creator CREATOR = new orr(12);
    public final int a;
    public final ork b;

    public osc(int i, ork orkVar) {
        this.a = i;
        this.b = orkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 2, this.a);
        ojl.I(parcel, 3, this.b, i);
        ojl.w(parcel, iU);
    }
}
