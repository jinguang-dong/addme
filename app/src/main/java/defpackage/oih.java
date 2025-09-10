package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oih extends fbi implements IInterface {
    private ohm a;
    private final int b;

    public oih(ohm ohmVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = ohmVar;
        this.b = i;
    }

    public final void b(int i, IBinder iBinder, Bundle bundle) {
        ojl.az(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.x(i, iBinder, bundle, this.b);
        this.a = null;
    }

    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) fbj.a(parcel, Bundle.CREATOR);
            fbj.b(parcel);
            b(i2, strongBinder, bundle);
        } else if (i == 2) {
            parcel.readInt();
            fbj.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            ohr ohrVar = (ohr) fbj.a(parcel, ohr.CREATOR);
            fbj.b(parcel);
            ohm ohmVar = this.a;
            ojl.az(ohmVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            ojl.ay(ohrVar);
            ohmVar.m = ohrVar;
            if (ohmVar.D()) {
                ohs ohsVar = ohrVar.d;
                ois.a().b(ohsVar == null ? null : ohsVar.a);
            }
            b(i3, strongBinder2, ohrVar.a);
        }
        parcel2.writeNoException();
        return true;
    }

    public oih() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
}
