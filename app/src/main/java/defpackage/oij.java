package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oij extends fbh implements IInterface {
    public oij(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final oea e(odz odzVar) {
        Parcel parcelA = a();
        fbj.c(parcelA, odzVar);
        Parcel parcelZ = z(6, parcelA);
        oea oeaVar = (oea) fbj.a(parcelZ, oea.CREATOR);
        parcelZ.recycle();
        return oeaVar;
    }

    public final boolean f() {
        Parcel parcelZ = z(7, a());
        boolean zE = fbj.e(parcelZ);
        parcelZ.recycle();
        return zE;
    }
}
