package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okd extends fbh implements IInterface {
    public okd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int e() {
        Parcel parcelZ = z(6, a());
        int i = parcelZ.readInt();
        parcelZ.recycle();
        return i;
    }
}
