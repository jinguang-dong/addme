package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oie extends fbh implements oig {
    public oie(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.oig
    public final int e() {
        Parcel parcelZ = z(2, a());
        int i = parcelZ.readInt();
        parcelZ.recycle();
        return i;
    }

    @Override // defpackage.oig
    public final ojr f() {
        ojr ojpVar;
        Parcel parcelZ = z(1, a());
        IBinder strongBinder = parcelZ.readStrongBinder();
        if (strongBinder == null) {
            ojpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            ojpVar = iInterfaceQueryLocalInterface instanceof ojr ? (ojr) iInterfaceQueryLocalInterface : new ojp(strongBinder);
        }
        parcelZ.recycle();
        return ojpVar;
    }
}
