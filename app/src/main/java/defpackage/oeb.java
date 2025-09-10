package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oeb extends oix {
    public static final Parcelable.Creator CREATOR = new hbs(12);
    public final String a;
    public final boolean b;
    public final boolean c;
    private final oif d;

    public oeb(String str, oif oifVar, boolean z, boolean z2) {
        this.a = str;
        this.d = oifVar;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iU = ojl.u(parcel);
        ojl.J(parcel, 1, str);
        oif oifVar = this.d;
        if (oifVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            oifVar = null;
        }
        ojl.F(parcel, 2, oifVar);
        ojl.x(parcel, 3, this.b);
        ojl.x(parcel, 4, this.c);
        ojl.w(parcel, iU);
    }

    public oeb(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        odv odvVar = null;
        if (iBinder != null) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                ojr ojrVarF = (iInterfaceQueryLocalInterface instanceof oig ? (oig) iInterfaceQueryLocalInterface : new oie(iBinder)).f();
                byte[] bArr = ojrVarF == null ? null : (byte[]) ojq.b(ojrVarF);
                if (bArr != null) {
                    odvVar = new odv(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.d = odvVar;
        this.b = z;
        this.c = z2;
    }
}
