package com.google.android.apps.camera.jni.gxp;

import defpackage.paw;
import defpackage.sgt;
import defpackage.sgv;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GxpUtils {
    private static final sgv a = sgv.g("com.google.android.apps.camera.jni.gxp.GxpUtils");

    private GxpUtils() {
    }

    public static boolean a() {
        int i;
        b();
        b();
        int[] versionNative = getVersionNative();
        if (versionNative.length > 1) {
            int i2 = versionNative[0];
            int i3 = versionNative[1];
        } else {
            ((sgt) a.c().M(2170)).v("Error loading version: %s", versionNative);
            versionNative = new int[0];
        }
        if (versionNative.length > 1 && ((i = versionNative[0]) > 1 || (i == 1 && versionNative[1] >= 5))) {
            return true;
        }
        if (!releaseNative()) {
            ((sgt) a.c().M(2173)).s("Error releasing.");
        }
        return false;
    }

    public static synchronized void b() {
        paw.a(GxpUtils.class, "gcastartup");
        initializeNative();
    }

    static native int[] getVersionNative();

    static native boolean initializeNative();

    static native boolean releaseNative();
}
