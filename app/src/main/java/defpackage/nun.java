package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nun extends fbh implements IInterface {
    public nun(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
    }

    public final void e(byte[] bArr) {
        Parcel parcelA = a();
        parcelA.writeByteArray(bArr);
        B(1, parcelA);
    }
}
