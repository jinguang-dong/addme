package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.ndk.base.DaydreamApi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txa implements Runnable {
    final /* synthetic */ txy a;
    final /* synthetic */ DaydreamApi b;

    public txa(DaydreamApi daydreamApi, txy txyVar) {
        this.a = txyVar;
        this.b = daydreamApi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        txw txwVar = this.b.f;
        if (txwVar != null) {
            try {
                txy txyVar = this.a;
                Parcel parcelA = txwVar.a();
                fbj.d(parcelA, txyVar);
                Parcel parcelZ = txwVar.z(9, parcelA);
                boolean zE = fbj.e(parcelZ);
                parcelZ.recycle();
                if (zE) {
                    return;
                }
            } catch (RemoteException e) {
                Log.e("DaydreamApi", "RemoteException while launching VR transition: ", e);
            }
        }
        Log.w("DaydreamApi", "Can't launch callbacks via DaydreamManager, sending manually");
        try {
            this.a.b();
        } catch (RemoteException unused) {
        }
    }
}
