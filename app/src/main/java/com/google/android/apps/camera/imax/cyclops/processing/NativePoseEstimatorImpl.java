package com.google.android.apps.camera.imax.cyclops.processing;

import com.google.geo.lightfield.processing.ProgressCallback;
import defpackage.ikv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NativePoseEstimatorImpl implements ikv {
    static {
        System.loadLibrary("cyclops");
    }

    @Override // defpackage.ikv
    public native boolean computePose(String str, ProgressCallback progressCallback);
}
