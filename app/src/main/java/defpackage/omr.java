package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class omr extends oix {
    public static final Parcelable.Creator CREATOR = new okg(18);
    public final int a;
    public final omq b;
    public final PendingIntent c;
    public final String d;
    private final olx e;
    private final omf f;
    private final olu g;

    public omr(int i, omq omqVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        olx olvVar;
        olu oluVar;
        this.a = i;
        this.b = omqVar;
        omf omdVar = null;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            olvVar = iInterfaceQueryLocalInterface instanceof olx ? (olx) iInterfaceQueryLocalInterface : new olv(iBinder);
        } else {
            olvVar = null;
        }
        this.e = olvVar;
        this.c = pendingIntent;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            oluVar = iInterfaceQueryLocalInterface2 instanceof olu ? (olu) iInterfaceQueryLocalInterface2 : new olu(iBinder2);
        } else {
            oluVar = null;
        }
        this.g = oluVar;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            omdVar = iInterfaceQueryLocalInterface3 instanceof omf ? (omf) iInterfaceQueryLocalInterface3 : new omd(iBinder3);
        }
        this.f = omdVar;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, this.a);
        ojl.I(parcel, 2, this.b, i);
        olx olxVar = this.e;
        ojl.F(parcel, 3, olxVar == null ? null : olxVar.asBinder());
        ojl.I(parcel, 4, this.c, i);
        olu oluVar = this.g;
        ojl.F(parcel, 5, oluVar == null ? null : oluVar.a);
        omf omfVar = this.f;
        ojl.F(parcel, 6, omfVar != null ? omfVar.asBinder() : null);
        ojl.J(parcel, 8, this.d);
        ojl.w(parcel, iU);
    }
}
