package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oia implements ServiceConnection {
    public final Map a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final ohy e;
    public ComponentName f;
    final /* synthetic */ ohz g;

    public oia(ohz ohzVar, ohy ohyVar) {
        this.g = ohzVar;
        this.e = ohyVar;
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final void c(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final odj d(String str) throws oip, RemoteException {
        odj odjVar;
        Bundle bundleCall;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        try {
            Context context = this.g.d;
            ohy ohyVar = this.e;
            Uri uri = oiu.a;
            String str2 = ohyVar.a;
            Intent intent = null;
            if (ohyVar.d) {
                Bundle bundle = new Bundle();
                bundle.putString("serviceActionBundleKey", str2);
                try {
                    contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(oiu.a);
                } catch (RemoteException | IllegalArgumentException e) {
                    Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                    bundleCall = null;
                }
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    if (bundleCall != null) {
                        Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                        if (intent2 != null) {
                            intent = intent2;
                        } else {
                            PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                            if (pendingIntent != null) {
                                Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action " + str2 + " but has possible resolution");
                                throw new oip(new odj(25, pendingIntent));
                            }
                        }
                    }
                    if (intent == null) {
                        Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str2));
                    }
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            }
            if (intent == null) {
                intent = new Intent(str2).setPackage(ohyVar.b);
            }
            Intent intent3 = intent;
            this.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(ojl.r(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            try {
                ohz ohzVar = this.g;
                ojf ojfVar = ohzVar.f;
                Context context2 = ohzVar.d;
                ohy ohyVar2 = this.e;
                boolean zC = ojfVar.c(context2, str, intent3, this, 4225);
                this.c = zC;
                if (zC) {
                    ohzVar.e.sendMessageDelayed(ohzVar.e.obtainMessage(1, ohyVar2), ohzVar.g);
                    odjVar = odj.a;
                } else {
                    this.b = 2;
                    try {
                        ojfVar.b(context2, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    odjVar = new odj(16);
                }
                return odjVar;
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (oip e2) {
            return e2.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ohz ohzVar = this.g;
        synchronized (ohzVar.c) {
            ohzVar.e.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ohz ohzVar = this.g;
        synchronized (ohzVar.c) {
            ohzVar.e.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
