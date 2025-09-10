package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oiv extends oix {
    public static final Parcelable.Creator CREATOR = new okg(1);
    public final int a;
    public List b;

    public oiv(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, i2);
        ojl.N(parcel, 2, this.b);
        ojl.w(parcel, iU);
    }
}
