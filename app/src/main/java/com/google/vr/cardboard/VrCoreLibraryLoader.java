package com.google.vr.cardboard;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.fbj;
import defpackage.thu;
import defpackage.txj;
import defpackage.txv;
import defpackage.tyv;
import defpackage.tyw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class VrCoreLibraryLoader {
    public static long loadNativeDlsymMethod(Context context) {
        return 0L;
    }

    public static long loadNativeGvrLibrary(Context context) {
        return loadNativeGvrLibrary(context, txj.b, txj.a);
    }

    public static long loadNativeGvrLibrary(Context context, txj txjVar, txj txjVar2) throws txv, PackageManager.NameNotFoundException {
        int i;
        int i2;
        int i3;
        int i4;
        tyv tyvVar;
        try {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
                if (applicationInfo == null) {
                    throw new txv(8);
                }
                if (!applicationInfo.enabled) {
                    throw new txv(2);
                }
                if (applicationInfo.metaData == null) {
                    throw new txv(4);
                }
                String string = applicationInfo.metaData.getString("com.google.vr.vrcore.SdkLibraryVersion", "");
                if (string.isEmpty()) {
                    throw new txv(4);
                }
                String strSubstring = string.substring(1);
                txj txjVarA = txj.a(strSubstring);
                if (txjVarA == null) {
                    throw new txv(4);
                }
                int i5 = txjVarA.c;
                int i6 = txjVar.c;
                if (i5 <= i6 && (i5 < i6 || ((i = txjVarA.d) <= (i2 = txjVar.d) && (i < i2 || ((i3 = txjVarA.e) <= (i4 = txjVar.e) && i3 < i4))))) {
                    Log.w("VrCoreLibraryLoader", String.format("VrCore GVR library version obsolete; VrCore supports %s but client min is %s", strSubstring, txjVar.toString()));
                    throw new txv(4);
                }
                Context contextF = thu.f(context);
                thu.f(context);
                int i7 = thu.b;
                tyw tywVar = null;
                if (thu.c == null) {
                    IBinder iBinderG = thu.g(thu.f(context).getClassLoader());
                    if (iBinderG == null) {
                        tyvVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderG.queryLocalInterface("com.google.vr.vrcore.library.api.IVrCreator");
                        tyvVar = iInterfaceQueryLocalInterface instanceof tyv ? (tyv) iInterfaceQueryLocalInterface : new tyv(iBinderG);
                    }
                    thu.c = tyvVar;
                }
                tyv tyvVar2 = thu.c;
                ObjectWrapper objectWrapper = new ObjectWrapper(contextF);
                ObjectWrapper objectWrapper2 = new ObjectWrapper(context);
                Parcel parcelA = tyvVar2.a();
                fbj.d(parcelA, objectWrapper);
                fbj.d(parcelA, objectWrapper2);
                Parcel parcelZ = tyvVar2.z(4, parcelA);
                IBinder strongBinder = parcelZ.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IVrNativeLibraryLoader");
                    tywVar = iInterfaceQueryLocalInterface2 instanceof tyw ? (tyw) iInterfaceQueryLocalInterface2 : new tyw(strongBinder);
                }
                parcelZ.recycle();
                if (tywVar == null) {
                    Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore: no library loader available.");
                    return 0L;
                }
                if (i7 >= 19) {
                    String string2 = txjVar.toString();
                    String string3 = txjVar2.toString();
                    Parcel parcelA2 = tywVar.a();
                    parcelA2.writeString(string2);
                    parcelA2.writeString(string3);
                    Parcel parcelZ2 = tywVar.z(5, parcelA2);
                    long j = parcelZ2.readLong();
                    parcelZ2.recycle();
                    return j;
                }
                int i8 = txjVar2.c;
                int i9 = txjVar2.d;
                int i10 = txjVar2.e;
                Parcel parcelA3 = tywVar.a();
                parcelA3.writeInt(i8);
                parcelA3.writeInt(i9);
                parcelA3.writeInt(i10);
                Parcel parcelZ3 = tywVar.z(2, parcelA3);
                long j2 = parcelZ3.readLong();
                parcelZ3.recycle();
                return j2;
            } catch (PackageManager.NameNotFoundException unused) {
                throw new txv(VrCoreUtils.a(context));
            }
        } catch (RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError | txv e) {
            Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore:\n  ".concat(e.toString()));
            return 0L;
        }
    }
}
