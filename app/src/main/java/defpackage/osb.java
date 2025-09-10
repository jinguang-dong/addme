package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class osb extends oix {
    public static final Parcelable.Creator CREATOR = new orr(11);
    public final int a;
    public final List b;

    public osb(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 2, this.a);
        ojl.N(parcel, 3, this.b);
        ojl.w(parcel, iU);
    }
}
