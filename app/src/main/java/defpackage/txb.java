package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.ndk.base.DaydreamApi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txb implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public txb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws PendingIntent.CanceledException {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                try {
                    ((PendingIntent) this.a).send(0);
                    return;
                } catch (Exception e) {
                    Log.e("DaydreamApi", "Couldn't launch PendingIntent: ".concat(e.toString()));
                    return;
                }
            }
            DaydreamApi daydreamApi = (DaydreamApi) this.a;
            Context applicationContext = daydreamApi.a;
            if (applicationContext.getApplicationContext() != null) {
                applicationContext = applicationContext.getApplicationContext();
            }
            applicationContext.unbindService(daydreamApi.d);
            daydreamApi.e = null;
            return;
        }
        txw txwVar = ((DaydreamApi) this.a).f;
        if (txwVar == null) {
            Log.e("DaydreamApi", "Can't launch VR homescreen via DaydreamManager. Giving up trying to leave current VR activity...");
            return;
        }
        try {
            Parcel parcelZ = txwVar.z(8, txwVar.a());
            boolean zE = fbj.e(parcelZ);
            parcelZ.recycle();
            if (zE) {
                return;
            }
            Log.e("DaydreamApi", "There is no VR homescreen installed.");
        } catch (RemoteException e2) {
            Log.e("DaydreamApi", "RemoteException while launching VR homescreen: ".concat(e2.toString()));
        }
    }
}
