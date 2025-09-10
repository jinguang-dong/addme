package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class opo extends fbh implements IInterface {
    public opo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    public final void e(tyq tyqVar, opn opnVar) {
        Parcel parcelA = a();
        fbj.d(parcelA, tyqVar);
        fbj.d(parcelA, opnVar);
        A(4, parcelA);
    }
}
