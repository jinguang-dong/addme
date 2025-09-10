package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class orz extends oix {
    public static final Parcelable.Creator CREATOR = new orr(9);
    public final int a;
    public final ConnectionConfiguration b;

    public orz(int i, ConnectionConfiguration connectionConfiguration) {
        this.a = i;
        this.b = connectionConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 2, this.a);
        ojl.I(parcel, 3, this.b, i);
        ojl.w(parcel, iU);
    }
}
