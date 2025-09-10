package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import com.google.vr.ndk.base.DaydreamApi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txe implements Runnable {
    final /* synthetic */ PendingIntent a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public txe(DaydreamApi daydreamApi, PendingIntent pendingIntent, ComponentName componentName, int i) {
        this.d = i;
        this.a = pendingIntent;
        this.c = componentName;
        this.b = daydreamApi;
    }

    public txe(DaydreamApi daydreamApi, Runnable runnable, PendingIntent pendingIntent, int i) {
        this.d = i;
        this.b = runnable;
        this.a = pendingIntent;
        this.c = daydreamApi;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.os.Parcelable, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws PendingIntent.CanceledException {
        if (this.d != 0) {
            txw txwVar = ((DaydreamApi) this.b).f;
            if (txwVar == null) {
                Log.w("DaydreamApi", "Can't launch PendingIntent via DaydreamManager: not available.");
                try {
                    this.a.send();
                    return;
                } catch (Exception e) {
                    Log.e("DaydreamApi", "Couldn't launch PendingIntent: ", e);
                    return;
                }
            }
            try {
                PendingIntent pendingIntent = this.a;
                ?? r6 = this.c;
                Parcel parcelA = txwVar.a();
                fbj.c(parcelA, pendingIntent);
                fbj.c(parcelA, r6);
                Parcel parcelZ = txwVar.z(7, parcelA);
                fbj.e(parcelZ);
                parcelZ.recycle();
                return;
            } catch (RemoteException e2) {
                Log.e("DaydreamApi", "RemoteException while launching PendingIntent in VR.", e2);
                return;
            }
        }
        Object obj = this.c;
        txw txwVar2 = ((DaydreamApi) obj).f;
        if (txwVar2 == null) {
            Log.w("DaydreamApi", "Failed to exit VR: Daydream service unavailable.");
            this.b.run();
            return;
        }
        try {
            if (((DaydreamApi) obj).c < 23) {
                PendingIntent pendingIntent2 = this.a;
                Parcel parcelA2 = txwVar2.a();
                fbj.c(parcelA2, pendingIntent2);
                Parcel parcelZ2 = txwVar2.z(10, parcelA2);
                boolean zE = fbj.e(parcelZ2);
                parcelZ2.recycle();
                if (zE) {
                    return;
                }
                Log.w("DaydreamApi", "Failed to exit VR: Invalid request.");
                this.b.run();
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXIT_VR_INTENT_KEY", this.a);
            bundle.putString(VnmwoBe.HURhNUTQnE, null);
            txw txwVar3 = ((DaydreamApi) obj).f;
            Parcel parcelA3 = txwVar3.a();
            fbj.c(parcelA3, bundle);
            Parcel parcelZ3 = txwVar3.z(17, parcelA3);
            boolean zE2 = fbj.e(parcelZ3);
            parcelZ3.recycle();
            if (zE2) {
                return;
            }
            Log.w("DaydreamApi", "Failed to exit VR: Invalid request.");
            this.b.run();
        } catch (RemoteException e3) {
            Log.e("DaydreamApi", "Failed to exit VR: RemoteException while exiting:".concat(e3.toString()));
            this.b.run();
        }
    }
}
