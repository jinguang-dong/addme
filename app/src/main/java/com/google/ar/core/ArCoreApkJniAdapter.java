package com.google.ar.core;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.ResourceExhaustedException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import defpackage.rti;
import defpackage.rtj;
import defpackage.rtz;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ArCoreApkJniAdapter {
    public static final /* synthetic */ int a = 0;
    private static final Map b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(IllegalArgumentException.class, Integer.valueOf(rtz.ERROR_INVALID_ARGUMENT.G));
        map.put(ResourceExhaustedException.class, Integer.valueOf(rtz.ERROR_RESOURCE_EXHAUSTED.G));
        map.put(UnavailableArcoreNotInstalledException.class, Integer.valueOf(rtz.UNAVAILABLE_ARCORE_NOT_INSTALLED.G));
        map.put(UnavailableDeviceNotCompatibleException.class, Integer.valueOf(rtz.UNAVAILABLE_DEVICE_NOT_COMPATIBLE.G));
        map.put(UnavailableApkTooOldException.class, Integer.valueOf(rtz.UNAVAILABLE_APK_TOO_OLD.G));
        map.put(UnavailableSdkTooOldException.class, Integer.valueOf(rtz.UNAVAILABLE_SDK_TOO_OLD.G));
        map.put(UnavailableUserDeclinedInstallationException.class, Integer.valueOf(rtz.UNAVAILABLE_USER_DECLINED_INSTALLATION.G));
    }

    private ArCoreApkJniAdapter() {
    }

    private static int a(Throwable th) {
        Log.e("ARCore-ArCoreApkJniAdap", "Exception details:", th);
        Map map = b;
        Class<?> cls = th.getClass();
        return map.containsKey(cls) ? ((Integer) map.get(cls)).intValue() : rtz.ERROR_FATAL.G;
    }

    static int checkAvailability(Context context) {
        try {
            return ArCoreApk.getInstance().checkAvailability(context).nativeCode;
        } catch (Throwable th) {
            a(th);
            return ArCoreApk.Availability.UNKNOWN_ERROR.nativeCode;
        }
    }

    static void checkAvailabilityAsync(Context context, final long j, final long j2) {
        final Consumer consumer = new Consumer() { // from class: com.google.ar.core.ArCoreApkJniAdapter$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void d(Object obj) {
                long j3 = j;
                long j4 = j2;
                int i = ArCoreApkJniAdapter.a;
                ArCoreApkJniAdapter.nativeInvokeAvailabilityCallback(j3, j4, ((ArCoreApk.Availability) obj).nativeCode);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        try {
            ArCoreApk arCoreApk = ArCoreApk.getInstance();
            ((rtj) arCoreApk).b(context, new rti((rtj) arCoreApk, consumer));
        } catch (Throwable th) {
            a(th);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.ar.core.ArCoreApkJniAdapter$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Consumer consumer2 = consumer;
                    int i = ArCoreApkJniAdapter.a;
                    consumer2.d(ArCoreApk.Availability.UNKNOWN_ERROR);
                }
            });
        }
    }

    public static native void nativeInvokeAvailabilityCallback(long j, long j2, int i);

    static int requestInstall(Activity activity, boolean z, int[] iArr) {
        try {
            ArCoreApk arCoreApk = ArCoreApk.getInstance();
            iArr[0] = arCoreApk.requestInstall(activity, z, ((rtj) arCoreApk).e(activity) ? ArCoreApk.InstallBehavior.REQUIRED : ArCoreApk.InstallBehavior.OPTIONAL, ((rtj) arCoreApk).e(activity) ? ArCoreApk.UserMessageType.APPLICATION : ArCoreApk.UserMessageType.USER_ALREADY_INFORMED).nativeCode;
            return rtz.SUCCESS.G;
        } catch (Throwable th) {
            return a(th);
        }
    }

    static int requestInstallCustom(Activity activity, boolean z, int i, int i2, int[] iArr) {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z, ArCoreApk.InstallBehavior.forNumber(i), ArCoreApk.UserMessageType.forNumber(i2)).nativeCode;
            return rtz.SUCCESS.G;
        } catch (Throwable th) {
            return a(th);
        }
    }
}
