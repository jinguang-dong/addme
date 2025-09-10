package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class omg extends fbh implements IInterface {
    public omg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void e(omr omrVar) {
        Parcel parcelA = a();
        fbj.c(parcelA, omrVar);
        A(59, parcelA);
    }
}
