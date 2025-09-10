package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ome extends fbi implements omf {
    public ome() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            omc omcVar = (omc) fbj.a(parcel, omc.CREATOR);
            fbj.b(parcel);
            e(omcVar);
        } else {
            if (i != 2) {
                return false;
            }
            f();
        }
        return true;
    }
}
