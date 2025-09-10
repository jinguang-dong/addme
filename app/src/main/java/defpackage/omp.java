package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class omp extends oix {
    public static final Parcelable.Creator CREATOR = new okg(16);
    public final int a;
    public final IBinder b;
    public final IBinder c;
    public final PendingIntent d;
    public final String e;

    public omp(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.a = i;
        this.b = iBinder;
        this.c = iBinder2;
        this.d = pendingIntent;
        this.e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, olx] */
    public static omp a(IInterface iInterface, olx olxVar, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new omp(1, iInterface, olxVar, null, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iU = ojl.u(parcel);
        ojl.A(parcel, 1, i2);
        ojl.F(parcel, 2, this.b);
        ojl.F(parcel, 3, this.c);
        ojl.I(parcel, 4, this.d, i);
        ojl.J(parcel, 6, this.e);
        ojl.w(parcel, iU);
    }
}
