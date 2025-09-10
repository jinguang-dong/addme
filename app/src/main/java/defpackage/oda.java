package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oda extends fbh implements IInterface {
    public oda(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void e(ocz oczVar, ocm ocmVar) {
        Parcel parcelA = a();
        fbj.d(parcelA, oczVar);
        fbj.c(parcelA, ocmVar);
        B(1, parcelA);
    }
}
