package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class osl extends oix {
    public static final Parcelable.Creator CREATOR = new oss(1);
    public final int a;
    public final List b;

    public osl(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.a);
        ojl.N(parcel, 2, this.b);
        ojl.w(parcel, iU);
    }
}
