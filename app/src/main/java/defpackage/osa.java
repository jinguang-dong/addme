package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class osa extends oix {
    public static final Parcelable.Creator CREATOR = new orr(10);
    public final int a;
    public final ConnectionConfiguration[] b;

    public osa(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.a = i;
        this.b = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 2, this.a);
        ojl.M(parcel, 3, this.b, i);
        ojl.w(parcel, iU);
    }
}
