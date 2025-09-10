package com.google.lens.sdk;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import defpackage.a;
import defpackage.nun;
import defpackage.nur;
import defpackage.nut;
import defpackage.nuy;
import defpackage.prh;
import defpackage.psd;
import defpackage.pse;
import defpackage.psj;
import defpackage.qej;
import defpackage.smv;
import defpackage.tmx;
import defpackage.tmy;
import defpackage.tnc;
import defpackage.tnd;
import defpackage.tne;
import defpackage.tnf;
import defpackage.tpc;
import defpackage.tpe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LensApi {
    static final Uri a = Uri.parse("googleapp://lens");
    public static final /* synthetic */ int c = 0;
    public final AmbientDelegate b;
    private final psd d;
    private final KeyguardManager e;

    /* compiled from: PG */
    public interface LensAvailabilityCallback {
        void onAvailabilityStatusFetched(int i);
    }

    /* compiled from: PG */
    public @interface LensAvailabilityStatus {
        public static final int LENS_AVAILABILITY_UNKNOWN = -1;
        public static final int LENS_READY = 0;
        public static final int LENS_UNAVAILABLE = 1;
        public static final int LENS_UNAVAILABLE_AGSA_OUTDATED = 6;

        @Deprecated
        public static final int LENS_UNAVAILABLE_ASSISTANT_EYES_FLAG_DISABLED = 8;
        public static final int LENS_UNAVAILABLE_DEVICE_INCOMPATIBLE = 3;
        public static final int LENS_UNAVAILABLE_DEVICE_LOCKED = 5;
        public static final int LENS_UNAVAILABLE_FEATURE_UNAVAILABLE = 11;
        public static final int LENS_UNAVAILABLE_INVALID_CURSOR = 4;

        @Deprecated
        public static final int LENS_UNAVAILABLE_LOCALE_NOT_SUPPORTED = 2;
        public static final int LENS_UNAVAILABLE_SERVICE_BUSY_FAILURE = 10;
        public static final int LENS_UNAVAILABLE_SERVICE_UNAVAILABLE = 9;
        public static final int LENS_UNAVAILABLE_UNKNOWN_ERROR_CODE = 12;
    }

    /* compiled from: PG */
    public @interface LensFeature {
        public static final int LENS_AR_STICKERS = 1;
        public static final int LENS_CORE = 0;
    }

    /* compiled from: PG */
    public @interface LensLaunchStatus {
        public static final int LAUNCH_FAILURE_UNLOCK_FAILED = 1;
        public static final int LAUNCH_SUCCESS = 0;
    }

    /* compiled from: PG */
    public interface LensLaunchStatusCallback {
        void onLaunchStatusFetched(int i);
    }

    public LensApi(Context context) {
        this.e = (KeyguardManager) context.getSystemService("keyguard");
        psd psdVar = new psd(context);
        this.d = psdVar;
        this.b = new AmbientDelegate(context, psdVar);
    }

    public static final void d(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(a);
        activity.startActivityForResult(intent, 0);
    }

    private final void e(Activity activity, LensLaunchStatusCallback lensLaunchStatusCallback, Runnable runnable) {
        KeyguardManager keyguardManager = this.e;
        if (!keyguardManager.isKeyguardLocked()) {
            runnable.run();
            if (lensLaunchStatusCallback != null) {
                lensLaunchStatusCallback.onLaunchStatusFetched(0);
                return;
            }
            return;
        }
        if (activity != null) {
            keyguardManager.requestDismissKeyguard(activity, new tnd(runnable, lensLaunchStatusCallback));
            return;
        }
        Log.e("LensApi", "Cannot start Lens when device is locked with Android " + Build.VERSION.SDK_INT);
        if (lensLaunchStatusCallback != null) {
            lensLaunchStatusCallback.onLaunchStatusFetched(1);
        }
    }

    private final boolean f(String str) throws NumberFormatException {
        String str2 = this.d.f.d;
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        String[] strArrSplit = str2.split("\\.", -1);
        String[] strArrSplit2 = str.split("\\.", -1);
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i = 0; i < iMin; i++) {
            int i2 = Integer.parseInt(strArrSplit[i]);
            int i3 = Integer.parseInt(strArrSplit2[i]);
            if (i2 < i3) {
                return true;
            }
            if (i2 > i3) {
                return false;
            }
        }
        return strArrSplit.length < strArrSplit2.length;
    }

    public final void a(tnf tnfVar) {
        if (tnfVar.a != null || tnfVar.b != null) {
            AmbientDelegate ambientDelegate = this.b;
            if (!ambientDelegate.C(tnfVar.a(ambientDelegate.A()))) {
                return;
            }
        }
        AmbientDelegate ambientDelegate2 = this.b;
        ambientDelegate2.A();
        Bundle bundleB = tnfVar.b();
        prh.c();
        Object obj = ambientDelegate2.c;
        if (((psj) obj).k()) {
            tpe tpeVar = (tpe) nut.a.m();
            if (!tpeVar.b.C()) {
                tpeVar.o();
            }
            nut nutVar = (nut) tpeVar.b;
            nutVar.c = 355;
            nutVar.b |= 1;
            try {
                ((psj) obj).e(((nut) tpeVar.l()).h(), new nur(bundleB));
                ((psj) ambientDelegate2.c).f();
                return;
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceBridge", "Failed to start Lens", e);
            }
        }
        Log.e("LensApi", "Failed to start lens.");
    }

    public final boolean b(Bitmap bitmap, tnf tnfVar) {
        if (bitmap == null) {
            Log.w("LensApi", "launchLensActivityWithBitmap: bitmap should not be null.");
        }
        if (this.e.isKeyguardLocked()) {
            Log.e("LensApi", "Cannot start Lens with Bitmap when device is locked.");
            return false;
        }
        if (this.b.E() != 2) {
            return false;
        }
        a(new tnf(tnfVar.a, bitmap, tnfVar.c, tnfVar.d, tnfVar.e));
        return true;
    }

    public void checkArStickersAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        this.d.a(new tne(lensAvailabilityCallback, 1));
    }

    public void checkLensAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        this.e.isKeyguardLocked();
        if (f("8.3")) {
            lensAvailabilityCallback.onAvailabilityStatusFetched(6);
        } else {
            this.d.a(new tne(lensAvailabilityCallback, 0));
        }
    }

    public void checkPendingIntentAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        this.e.isKeyguardLocked();
        if (f("9.72")) {
            lensAvailabilityCallback.onAvailabilityStatusFetched(6);
            return;
        }
        AmbientDelegate ambientDelegate = this.b;
        tnc tncVar = new tnc(lensAvailabilityCallback, 0);
        prh.c();
        ambientDelegate.D(new pse(ambientDelegate, tncVar, 1));
    }

    public void checkPostCaptureAvailability(LensAvailabilityCallback lensAvailabilityCallback) {
        this.e.isKeyguardLocked();
        if (f("8.19")) {
            lensAvailabilityCallback.onAvailabilityStatusFetched(6);
            return;
        }
        AmbientDelegate ambientDelegate = this.b;
        tnc tncVar = new tnc(lensAvailabilityCallback, 1);
        prh.c();
        ambientDelegate.D(new pse(ambientDelegate, tncVar, 2));
    }

    @Deprecated
    public void launchLensActivity(Activity activity) {
        e(activity, null, new smv(activity, 4));
    }

    public boolean launchLensActivityWithBitmap(Bitmap bitmap) {
        if (!this.e.isKeyguardLocked()) {
            return b(bitmap, new tnf(null, null, Long.valueOf(SystemClock.elapsedRealtimeNanos()), null, null));
        }
        Log.e("LensApi", "Cannot start Lens with Bitmap when device is locked.");
        return false;
    }

    public boolean launchLensActivityWithBitmapForTranslate(Bitmap bitmap) {
        nuy nuyVar;
        prh.c();
        psj psjVar = (psj) this.b.c;
        prh.d(psjVar.k(), "getLensCapabilities() called when Lens is not ready.");
        if (psjVar.k()) {
            prh.c();
            prh.d(psjVar.l(), "Attempted to use LensCapabilities before ready.");
            nuyVar = psjVar.f;
        } else {
            nuyVar = nuy.a;
        }
        if ((nuyVar.b & 2) == 0) {
            Log.e("LensApi", "Translate is not supported.");
            return false;
        }
        tpc tpcVarM = tmy.a.m();
        tmx tmxVar = tmx.a;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tmy tmyVar = (tmy) tpcVarM.b;
        tmxVar.getClass();
        tmyVar.c = tmxVar;
        tmyVar.b = 2;
        return b(bitmap, new tnf(null, null, null, (tmy) tpcVarM.l(), 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.ServiceConnection, java.lang.Object] */
    public void onPause() {
        prh.c();
        prh.c();
        AmbientDelegate ambientDelegate = this.b;
        ?? r0 = ambientDelegate.c;
        psj psjVar = (psj) r0;
        if (psjVar.l()) {
            tpe tpeVar = (tpe) nut.a.m();
            if (!tpeVar.b.C()) {
                tpeVar.o();
            }
            nut nutVar = (nut) tpeVar.b;
            nutVar.c = 345;
            nutVar.b |= 1;
            nut nutVar2 = (nut) tpeVar.l();
            try {
                nun nunVar = ((psj) r0).i;
                prh.e(nunVar);
                nunVar.e(nutVar2.h());
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceConnImpl", "Unable to end Lens service session.", e);
            }
            psjVar.i = null;
            psjVar.d = 0;
            psjVar.e = null;
            psjVar.f = null;
        }
        if (psjVar.i()) {
            try {
                ((psj) r0).b.unbindService(r0);
            } catch (IllegalArgumentException unused) {
                Log.w("LensServiceConnImpl", "Unable to unbind, service is not registered.");
            }
            psjVar.h = null;
        }
        psjVar.g = 1;
        psjVar.g(1);
        ambientDelegate.a = null;
    }

    public void onResume() {
        prh.c();
        ((psj) this.b.c).m();
    }

    public boolean requestLensActivityPendingIntent(PendingIntentConsumer pendingIntentConsumer) {
        return c(new tnf(null, null, null, null, null), pendingIntentConsumer);
    }

    public boolean requestLensActivityPendingIntentWithBitmap(Bitmap bitmap, PendingIntentConsumer pendingIntentConsumer) {
        return c(new tnf(null, bitmap, null, null, null), pendingIntentConsumer);
    }

    public boolean requestLensActivityPendingIntentWithBitmapUri(Context context, Uri uri, PendingIntentConsumer pendingIntentConsumer) {
        if (context != null) {
            context.grantUriPermission("com.google.android.googlequicksearchbox", uri, 1);
        }
        return c(new tnf(uri, null, null, null, null), pendingIntentConsumer);
    }

    public final boolean c(tnf tnfVar, PendingIntentConsumer pendingIntentConsumer) {
        AmbientDelegate ambientDelegate = this.b;
        if (ambientDelegate.F() != 2) {
            return false;
        }
        ambientDelegate.C(tnfVar.a(ambientDelegate.A()));
        ambientDelegate.A();
        Bundle bundleB = tnfVar.b();
        prh.c();
        ambientDelegate.a = pendingIntentConsumer;
        Object obj = ambientDelegate.c;
        if (((psj) obj).k()) {
            tpe tpeVar = (tpe) nut.a.m();
            if (!tpeVar.b.C()) {
                tpeVar.o();
            }
            nut nutVar = (nut) tpeVar.b;
            nutVar.c = 412;
            nutVar.b |= 1;
            try {
                ((psj) obj).e(((nut) tpeVar.l()).h(), new nur(bundleB));
                return true;
            } catch (RemoteException | SecurityException e) {
                Log.e("LensServiceBridge", "Failed to send Lens service client event", e);
            }
        }
        Log.e("LensApi", TOnSyMaYeslEl.nsEGBypOwknL);
        return false;
    }

    @Deprecated
    public void launchLensActivity(Activity activity, int i) {
        if (i == 0) {
            e(activity, null, new smv(activity, 5));
            return;
        }
        if (i != 1) {
            Log.w("LensApi", a.bv(i, "Invalid lens activity: "));
            return;
        }
        int iB = prh.b(this.d.f.f);
        if (iB != 0 && iB == 2) {
            Intent intent = new Intent();
            intent.setClassName("com.google.ar.lens", PNlJufQ.CMnfhIGccO);
            activity.startActivity(intent);
        }
    }

    public void launchLensActivity(Activity activity, LensLaunchStatusCallback lensLaunchStatusCallback) {
        e(activity, lensLaunchStatusCallback, new qej(this, activity, new tnf(null, null, null, null, null), 6));
    }
}
