package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.vr.dynamite.client.INativeLibraryLoader;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twu extends fbh implements INativeLibraryLoader {
    public twu(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.INativeLibraryLoader");
    }

    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final int checkVersion(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        Parcel parcelZ = z(2, parcelA);
        int i = parcelZ.readInt();
        parcelZ.recycle();
        return i;
    }

    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final long initializeAndLoadNativeLibrary(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        Parcel parcelZ = z(1, parcelA);
        long j = parcelZ.readLong();
        parcelZ.recycle();
        return j;
    }
}
