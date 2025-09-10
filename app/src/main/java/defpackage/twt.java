package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.vr.dynamite.client.ILoadedInstanceCreator;
import com.google.vr.dynamite.client.INativeLibraryLoader;
import com.google.vr.dynamite.client.IObjectWrapper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twt extends fbh implements ILoadedInstanceCreator {
    public twt(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.ILoadedInstanceCreator");
    }

    @Override // com.google.vr.dynamite.client.ILoadedInstanceCreator
    public final INativeLibraryLoader newNativeLibraryLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        INativeLibraryLoader twuVar;
        Parcel parcelA = a();
        fbj.d(parcelA, iObjectWrapper);
        fbj.d(parcelA, iObjectWrapper2);
        Parcel parcelZ = z(1, parcelA);
        IBinder strongBinder = parcelZ.readStrongBinder();
        if (strongBinder == null) {
            twuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.vr.dynamite.client.INativeLibraryLoader");
            twuVar = iInterfaceQueryLocalInterface instanceof INativeLibraryLoader ? (INativeLibraryLoader) iInterfaceQueryLocalInterface : new twu(strongBinder);
        }
        parcelZ.recycle();
        return twuVar;
    }
}
