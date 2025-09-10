package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.InstallActivity;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtj extends ArCoreApk {
    public static final rtj a = new rtj();
    public Exception c;
    public Exception d;
    public ArCoreApk.Availability f;
    public boolean g;
    private boolean i;
    private boolean j;
    private int k;
    private long l;
    private rtt m;
    private boolean n;
    private boolean o;
    private int p;
    private boolean q;
    public final Handler b = new Handler(Looper.getMainLooper());
    private final Messenger h = new Messenger(new rtg(this, Looper.getMainLooper()));
    boolean e = true;

    private static int g(Context context) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i = packageInfo.versionCode;
            if (i != 0) {
                return i;
            }
            if (packageInfo.services != null) {
                if (packageInfo.services.length != 0) {
                    return 0;
                }
            }
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private final synchronized void h(Context context) {
        if (this.n) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            Bundle bundle = packageManager.getApplicationInfo(packageName, 128).metaData;
            if (!bundle.containsKey("com.google.ar.core")) {
                throw new FatalException("Application manifest must contain meta-data com.google.ar.core");
            }
            String string = bundle.getString("com.google.ar.core");
            string.getClass();
            this.o = string.equals("required");
            if (!bundle.containsKey("com.google.ar.core.min_apk_version")) {
                throw new FatalException("Application manifest must contain meta-data com.google.ar.core.min_apk_version");
            }
            this.p = bundle.getInt("com.google.ar.core.min_apk_version");
            this.q = bundle.containsKey(PNlJufQ.QQSyKKDhmGLsFW) && !Process.is64Bit() && Build.SUPPORTED_64_BIT_ABIS.length > 0;
            try {
                ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageName, 1).activities;
                String canonicalName = InstallActivity.class.getCanonicalName();
                for (ActivityInfo activityInfo : activityInfoArr) {
                    if (canonicalName.equals(activityInfo.name)) {
                        this.n = true;
                        return;
                    }
                }
                throw new FatalException(mn.g(canonicalName, "Application manifest must contain activity "));
            } catch (PackageManager.NameNotFoundException e) {
                throw new FatalException("Could not load application package info", e);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new FatalException("Could not load application package metadata", e2);
        }
    }

    private final boolean i(Context context) {
        h(context);
        return this.q;
    }

    private static final Bundle j() {
        return ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
    }

    private static final boolean k(Context context) {
        Bundle bundle = new Bundle();
        bundle.putString("moduleName", "native_library_split");
        Bundle bundleCall = context.getContentResolver().call(qsz.g(), "splitCheckInstall", context.getPackageName(), bundle);
        return (bundleCall == null ? ArCoreApk.Availability.UNKNOWN_ERROR : bundleCall.getBoolean("splitCheckInstallResult") ? ArCoreApk.Availability.SUPPORTED_INSTALLED : ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED) == ArCoreApk.Availability.SUPPORTED_INSTALLED;
    }

    private static final void m(Exception exc) throws UnavailableUserDeclinedInstallationException, UnavailableDeviceNotCompatibleException {
        if (exc instanceof UnavailableDeviceNotCompatibleException) {
            Log.e("ARCore-ArCoreApk", "Throwing UnavailableDeviceNotCompatibleException");
            throw ((UnavailableDeviceNotCompatibleException) exc);
        }
        if (exc instanceof UnavailableUserDeclinedInstallationException) {
            Log.e("ARCore-ArCoreApk", "Throwing UnavailableUserDeclinedInstallationException");
            throw ((UnavailableUserDeclinedInstallationException) exc);
        }
        if (!(exc instanceof RuntimeException)) {
            throw new RuntimeException("Unexpected exception type", exc);
        }
        Log.e("ARCore-ArCoreApk", "Throwing RuntimeException.");
        throw ((RuntimeException) exc);
    }

    private static final ArCoreApk.InstallStatus n(Activity activity) throws IntentSender.SendIntentException {
        PendingIntent pendingIntentA = rub.a(activity);
        if (pendingIntentA != null) {
            try {
                activity.startIntentSender(pendingIntentA.getIntentSender(), null, 0, 0, 0, j());
                return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
            } catch (IntentSender.SendIntentException | RuntimeException e) {
                Log.w("ARCore-ArCoreApk", "Setup activity launch failed", e);
            }
        }
        return ArCoreApk.InstallStatus.INSTALLED;
    }

    public final synchronized rtt a(Context context) {
        if (this.m == null) {
            rtt rttVar = new rtt(null);
            rttVar.a(context.getApplicationContext());
            this.m = rttVar;
        }
        return this.m;
    }

    public final void b(Context context, ArCoreApk.ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        ArCoreApk.Availability availability;
        try {
            if (!f(context)) {
                if (g(context) != -1) {
                    iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD);
                    return;
                } else if (e(context)) {
                    iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
                    return;
                } else {
                    a(context).b(context, iCheckAvailabilityCallback);
                    return;
                }
            }
            c();
            try {
                availability = rub.a(context) != null ? ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD : ArCoreApk.Availability.SUPPORTED_INSTALLED;
            } catch (UnavailableDeviceNotCompatibleException unused) {
                availability = ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
            } catch (UnavailableUserDeclinedInstallationException | RuntimeException unused2) {
                availability = ArCoreApk.Availability.UNKNOWN_ERROR;
            }
            if (availability == ArCoreApk.Availability.SUPPORTED_INSTALLED && i(context) && !k(context)) {
                availability = ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED;
            } else {
                d();
            }
            iCheckAvailabilityCallback.onResult(availability);
        } catch (FatalException e) {
            Log.e("ARCore-ArCoreApk", "Error while checking app details and ARCore status", e);
            iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    public final synchronized void c() {
        if (this.c == null) {
            this.k = 0;
        }
        this.i = false;
        rtt rttVar = this.m;
        if (rttVar != null) {
            rttVar.f();
            this.m = null;
        }
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.Availability checkAvailability(Context context) {
        synchronized (this) {
            ArCoreApk.Availability availability = this.f;
            if ((availability == null || availability.isUnknown()) && !this.g) {
                this.g = true;
                b(context, new rth(this));
            }
            ArCoreApk.Availability availability2 = this.f;
            if (availability2 != null) {
                if (!availability2.isUnsupported()) {
                    this.f = null;
                }
                return availability2;
            }
            if (this.g) {
                return ArCoreApk.Availability.UNKNOWN_CHECKING;
            }
            Log.e("ARCore-ArCoreApk", "request not running but result is null?");
            return ArCoreApk.Availability.UNKNOWN_ERROR;
        }
    }

    @Override // com.google.ar.core.ArCoreApk
    public final void checkAvailabilityAsync(Context context, Consumer consumer) {
        b(context, new rti(this, consumer));
    }

    public final synchronized void d() {
        this.j = false;
    }

    public final boolean e(Context context) {
        h(context);
        return this.o;
    }

    final boolean f(Context context) {
        h(context);
        return g(context) == 0 || g(context) >= this.p;
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z) {
        return requestInstall(activity, z, e(activity) ? ArCoreApk.InstallBehavior.REQUIRED : ArCoreApk.InstallBehavior.OPTIONAL, e(activity) ? ArCoreApk.UserMessageType.APPLICATION : ArCoreApk.UserMessageType.USER_ALREADY_INFORMED);
    }

    private final void l(Context context, List list) throws IntentSender.SendIntentException {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(clFzVRcygwbq.bubuWeHgPTWmbb, new ArrayList<>(list));
        bundle.putParcelable("splitInstallMessenger", this.h);
        bundle.putBoolean("splitInstallDisplayDialog", true);
        Bundle bundleCall = context.getContentResolver().call(qsz.g(), "splitInstall", context.getPackageName(), bundle);
        PendingIntent pendingIntent = bundleCall == null ? null : (PendingIntent) bundleCall.getParcelable("splitInstallIntent");
        if (pendingIntent == null) {
            ArCoreApk.InstallStatus installStatus = ArCoreApk.InstallStatus.INSTALLED;
            return;
        }
        try {
            context.startIntentSender(pendingIntent.getIntentSender(), null, 0, 0, 0, j());
            ArCoreApk.InstallStatus installStatus2 = ArCoreApk.InstallStatus.INSTALLED;
        } catch (IntentSender.SendIntentException | RuntimeException e) {
            Log.w("ARCore-ArCoreApk", "Download activity launch failed.", e);
            this.d = new RuntimeException("Download activity launch failed.");
            ArCoreApk.InstallStatus installStatus3 = ArCoreApk.InstallStatus.INSTALLED;
        }
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z, ArCoreApk.InstallBehavior installBehavior, ArCoreApk.UserMessageType userMessageType) throws IntentSender.SendIntentException, UnavailableUserDeclinedInstallationException, UnavailableDeviceNotCompatibleException {
        boolean z2;
        if (f(activity)) {
            c();
            if (!i(activity) || k(activity)) {
                d();
                return n(activity);
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (!this.i && !this.j) {
            Exception exc = this.c;
            if (exc == null) {
                Exception exc2 = this.d;
                if (exc2 != null) {
                    if (z) {
                        Log.w("ARCore-ArCoreApk", "Clearing previous module install failure: ", exc2);
                        this.d = null;
                    } else {
                        m(exc2);
                    }
                }
            } else if (z) {
                Log.w("ARCore-ArCoreApk", "Clearing previous failure: ", exc);
                this.c = null;
            } else {
                m(exc);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis - this.l > 5000) {
                this.k = 0;
            }
            int i = this.k + 1;
            this.k = i;
            this.l = jUptimeMillis;
            if (i <= 2) {
                if (z2) {
                    try {
                        activity.startActivity(new Intent(activity, (Class<?>) InstallActivity.class).putExtra("message", userMessageType).putExtra("behavior", installBehavior));
                        this.i = true;
                    } catch (ActivityNotFoundException e) {
                        throw new FatalException("Failed to launch InstallActivity.", e);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("native_library_split");
                    l(activity, arrayList);
                    this.j = true;
                }
                return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
            }
            throw new FatalException("Requesting ARCore installation too rapidly.");
        }
        return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
    }

    @Override // com.google.ar.core.ArCoreApk
    public final void checkAvailability(Context context, ArCoreApk.ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        b(context, iCheckAvailabilityCallback);
    }
}
