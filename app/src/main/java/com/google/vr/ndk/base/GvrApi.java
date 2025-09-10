package com.google.vr.ndk.base;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.StrictMode;
import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;
import defpackage.twy;
import defpackage.txf;
import defpackage.txh;
import defpackage.txi;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GvrApi {

    /* compiled from: PG */
    interface IdleListener {
        void onIdleChanged(boolean z);
    }

    /* compiled from: PG */
    public interface PoseTracker {
        void getHeadPoseInStartSpace(float[] fArr, long j);
    }

    static {
        "robolectric".equals(Build.FINGERPRINT);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            txf.a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static native long nativeGetUserPrefs(long j);

    private static native boolean nativeIsFeatureSupported(long j, int i);

    public static native boolean nativeUserPrefsIsFeatureEnabled(long j, int i);

    public long getNativeGvrContext() {
        throw null;
    }

    private static void requestFeatures(Context context, long j, int[] iArr, int[] iArr2, PendingIntent pendingIntent) {
        txh[] txhVarArrA = txh.a(iArr);
        txh[] txhVarArrA2 = txh.a(iArr2);
        txi txiVar = new txi(nativeGetUserPrefs(j));
        Intent flags = new Intent("com.google.intent.action.vr.REQUEST_FEATURE").setComponent(twy.a).setFlags(268435456);
        ArrayList arrayList = new ArrayList();
        for (txh txhVar : txhVarArrA) {
            if (nativeIsFeatureSupported(j, txhVar.c) && !txiVar.a(txhVar)) {
                arrayList.add(txhVar.d);
            }
        }
        if (!arrayList.isEmpty()) {
            flags.putExtra(GAQqzWiWWcYOgy.UJtpXKfVgUuw, (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        ArrayList arrayList2 = new ArrayList();
        for (txh txhVar2 : txhVarArrA2) {
            if (nativeIsFeatureSupported(j, txhVar2.c) && !txiVar.a(txhVar2)) {
                arrayList2.add(txhVar2.d);
            }
        }
        if (!arrayList2.isEmpty()) {
            flags.putExtra("optional_features", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        if (flags.getExtras() != null) {
            flags.putExtra("pending_intent", pendingIntent);
            context.startActivity(flags);
        }
    }
}
