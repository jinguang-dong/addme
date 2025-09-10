package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class osr extends fbh implements IInterface {
    public osr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    public final void e(osn osnVar, oqo oqoVar) {
        Parcel parcelA = a();
        fbj.d(parcelA, osnVar);
        fbj.c(parcelA, oqoVar);
        A(16, parcelA);
    }
}
