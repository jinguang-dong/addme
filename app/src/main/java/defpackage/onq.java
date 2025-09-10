package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class onq extends fbh implements IInterface {
    public onq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void e(onp onpVar, String str) {
        Parcel parcelA = a();
        fbj.d(parcelA, onpVar);
        parcelA.writeString(str);
        A(5, parcelA);
    }
}
