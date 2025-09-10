package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otk extends oix {
    public static final Parcelable.Creator CREATOR = new oss(14);
    public final int a;
    public final long b;
    public final List c;

    public otk(int i, long j, List list) {
        this.a = i;
        this.b = j;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 2, this.a);
        ojl.B(parcel, 3, this.b);
        ojl.N(parcel, 4, this.c);
        ojl.w(parcel, iU);
    }
}
