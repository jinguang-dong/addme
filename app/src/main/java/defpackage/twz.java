package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.ndk.base.DaydreamApi;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twz implements ServiceConnection {
    final /* synthetic */ DaydreamApi a;

    public twz(DaydreamApi daydreamApi) {
        this.a = daydreamApi;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        txz txzVar;
        txw txwVar = null;
        if (iBinder == null) {
            txzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IVrCoreSdkService");
            txzVar = iInterfaceQueryLocalInterface instanceof txz ? (txz) iInterfaceQueryLocalInterface : new txz(iBinder);
        }
        DaydreamApi daydreamApi = this.a;
        daydreamApi.e = txzVar;
        try {
            txz txzVar2 = daydreamApi.e;
            Parcel parcelZ = txzVar2.z(2, txzVar2.a());
            IBinder strongBinder = parcelZ.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IDaydreamManager");
                txwVar = iInterfaceQueryLocalInterface2 instanceof txw ? (txw) iInterfaceQueryLocalInterface2 : new txw(strongBinder);
            }
            parcelZ.recycle();
            daydreamApi.f = txwVar;
        } catch (RemoteException unused) {
            Log.e("DaydreamApi", "RemoteException in onServiceConnected");
        }
        DaydreamApi daydreamApi2 = this.a;
        if (daydreamApi2.f == null) {
            Log.w("DaydreamApi", "Daydream service component unavailable.");
        }
        ArrayList arrayList = daydreamApi2.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) arrayList.get(i)).run();
        }
        arrayList.clear();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.e = null;
    }
}
