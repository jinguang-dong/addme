package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqt extends oix {
    public static final Parcelable.Creator CREATOR = new oks(5);
    public final int a;
    public final List b;
    public final ott c;

    public oqt(int i, List list, ott ottVar) {
        this.a = i;
        this.b = list;
        this.c = ottVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.a);
        ojl.N(parcel, 2, this.b);
        ojl.I(parcel, 3, this.c, i);
        ojl.w(parcel, iU);
    }
}
