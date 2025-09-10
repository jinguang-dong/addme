package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class nuo extends fbi implements nup {
    public nuo() {
        super("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSessionCallback");
    }

    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        nur nurVar = (nur) fbj.a(parcel, nur.CREATOR);
        fbj.b(parcel);
        b(bArrCreateByteArray, nurVar);
        return true;
    }
}
