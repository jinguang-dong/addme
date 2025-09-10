package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.pm.PackageInstaller;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;
import com.google.android.gms.analytics.EQvQ.UvOvSgfD;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.exceptions.FatalException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtt {
    public BroadcastReceiver a;
    public Context b;
    public PackageInstaller c;
    public PackageInstaller.SessionCallback d;
    public rqo e;
    private final Queue f;
    private Context g;
    private final ServiceConnection h;
    private volatile int i;

    public rtt() {
        throw null;
    }

    public static Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("package.name", "com.google.ar.core");
        return bundle;
    }

    public final synchronized void a(Context context) {
        this.g = context;
        Intent intent = new Intent("com.google.android.play.core.install.BIND_INSTALL_SERVICE").setPackage("com.android.vending");
        ServiceConnection serviceConnection = this.h;
        if (context.bindService(intent, serviceConnection, 1)) {
            this.i = 2;
            return;
        }
        this.i = 1;
        this.g = null;
        Log.w("ARCore-InstallService", "bindService returned false.");
        context.unbindService(serviceConnection);
    }

    public final synchronized void b(Context context, ArCoreApk.ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        try {
            e(new qej(this, context, (Object) iCheckAvailabilityCallback, 3));
        } catch (rty unused) {
            Log.e("ARCore-InstallService", "Play Store install service could not be bound.");
            iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    public final synchronized void c(IBinder iBinder) {
        rqo rqoVar;
        if (iBinder == null) {
            rqoVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.install.protocol.IInstallService");
            rqoVar = iInterfaceQueryLocalInterface instanceof rqo ? (rqo) iInterfaceQueryLocalInterface : new rqo(iBinder);
        }
        this.e = rqoVar;
        this.i = 3;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final synchronized void d() {
        this.i = 1;
        this.e = null;
    }

    public final synchronized void e(Runnable runnable) {
        int i = this.i;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw new rty();
        }
        if (i2 == 1) {
            this.f.offer(runnable);
        } else {
            if (i2 != 2) {
                return;
            }
            runnable.run();
        }
    }

    public final synchronized void f() {
        int i = this.i;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1 || i2 == 2) {
            this.g.unbindService(this.h);
            this.g = null;
            this.i = 1;
        }
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            this.b.unregisterReceiver(broadcastReceiver);
        }
        PackageInstaller.SessionCallback sessionCallback = this.d;
        if (sessionCallback != null) {
            this.c.unregisterSessionCallback(sessionCallback);
            this.d = null;
        }
    }

    public rtt(byte[] bArr) {
        this.f = new ArrayDeque();
        this.i = 1;
        this.h = new rrb(this, 2);
    }

    public static void g(Activity activity, rtr rtrVar) {
        boolean z;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ar.core"));
            rtj rtjVar = rtj.a;
            Iterator<ResolveInfo> it = activity.getPackageManager().queryIntentActivities(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                ResolveInfo next = it.next();
                if (next.activityInfo != null && next.activityInfo.name.equals("com.sec.android.app.samsungapps.MainForChina")) {
                    z = true;
                    break;
                }
            }
            rtjVar.e = !z;
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            rtrVar.b(new FatalException(IQwwK.QJtlcWJs, e));
        }
    }

    public static void i(Activity activity, Bundle bundle, rtr rtrVar) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("resolution.intent");
        if (pendingIntent == null) {
            Log.e("ARCore-InstallService", UvOvSgfD.OOKp);
            rtrVar.b(new FatalException("Installation intent failed to unparcel."));
        } else {
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1234, new Intent(activity, activity.getClass()), 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                rtrVar.b(new FatalException("Installation Intent failed", e));
            }
        }
    }
}
