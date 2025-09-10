package com.google.android.apps.camera.async.tt;

import defpackage.jal;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CpuSets {
    private CpuSets() {
    }

    public static jal a(int i) {
        long jNativeDropCpuFromSet = nativeDropCpuFromSet(i, 2);
        if (jNativeDropCpuFromSet == 0) {
            return null;
        }
        return new jal(jNativeDropCpuFromSet);
    }

    private static native long nativeDropCpuFromSet(int i, int i2);

    public static native void nativeRestoreCpuSet(int i, long j);
}
