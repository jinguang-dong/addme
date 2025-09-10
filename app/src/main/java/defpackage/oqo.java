package defpackage;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqo extends oix {
    public static final Parcelable.Creator CREATOR = new okq(20);
    public final osq a;
    public final IntentFilter[] b;
    public final String c;
    public final String d;

    public oqo(otr otrVar) {
        this.a = otrVar;
        this.b = otrVar.b;
        this.c = null;
        this.d = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        osq osqVar = this.a;
        int iU = ojl.u(parcel);
        ojl.F(parcel, 2, osqVar == null ? null : osqVar.asBinder());
        ojl.M(parcel, 3, this.b, i);
        ojl.J(parcel, 4, this.c);
        ojl.J(parcel, 5, this.d);
        ojl.w(parcel, iU);
    }

    public oqo(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        osq osoVar;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            osoVar = iInterfaceQueryLocalInterface instanceof osq ? (osq) iInterfaceQueryLocalInterface : new oso(iBinder);
        } else {
            osoVar = null;
        }
        this.a = osoVar;
        this.b = intentFilterArr;
        this.c = str;
        this.d = str2;
    }
}
