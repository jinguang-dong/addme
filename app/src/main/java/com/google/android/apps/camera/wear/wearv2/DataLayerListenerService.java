package com.google.android.apps.camera.wear.wearv2;

import android.app.KeyguardManager;
import android.content.Intent;
import android.os.PowerManager;
import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;
import defpackage.ntf;
import defpackage.oqm;
import defpackage.osy;
import defpackage.sgt;
import defpackage.sgv;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DataLayerListenerService extends oqm {
    private static final sgv f = sgv.g("com.google.android.apps.camera.wear.wearv2.DataLayerListenerService");

    /* JADX WARN: Type inference failed for: r1v6, types: [sgt, shi] */
    @Override // defpackage.oqm, defpackage.oqe
    public final void a(osy osyVar) {
        String str = osyVar.b;
        if (!Objects.equals(str, "/sending_time")) {
            Objects.equals(str, "/preview");
        }
        if (!"/start-activity".equals(str) || ntf.c || ntf.b) {
            return;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(268435466, "Camera:ScreenOnForWearable");
        wakeLockNewWakeLock.acquire(1000L);
        try {
            wakeLockNewWakeLock.release();
        } catch (RuntimeException e) {
            ((sgt) ((sgt) f.c().i(e)).M((char) 5524)).s("Failed to release wakelock");
        }
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        startActivity(new Intent((keyguardManager == null || !keyguardManager.isKeyguardLocked()) ? "android.media.action.STILL_IMAGE_CAMERA" : "android.media.action.STILL_IMAGE_CAMERA_SECURE").setFlags(268468224).putExtra("extra_turn_screen_on", true).putExtra(pAAtrB.jSd, true).putExtra("extra_wear_node_id", osyVar.d).setPackage(getPackageName()));
    }
}
