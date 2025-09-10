package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otf extends oix {
    public static final Parcelable.Creator CREATOR = new oss(9);
    final int a;
    public final osq b;

    public otf(osq osqVar) {
        this.a = 1;
        this.b = osqVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.a);
        osq osqVar = this.b;
        ojl.F(parcel, 2, osqVar == null ? null : osqVar.asBinder());
        ojl.w(parcel, iU);
    }

    public otf(int i, IBinder iBinder) {
        osq osoVar;
        this.a = i;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            osoVar = iInterfaceQueryLocalInterface instanceof osq ? (osq) iInterfaceQueryLocalInterface : new oso(iBinder);
        } else {
            osoVar = null;
        }
        this.b = osoVar;
    }
}
