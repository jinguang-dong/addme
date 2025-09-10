package com.google.android.apps.camera.autotimer.analysis.jni;

import defpackage.paw;
import defpackage.poj;
import defpackage.tow;
import defpackage.tph;
import defpackage.tra;
import defpackage.tup;
import defpackage.tuz;
import defpackage.tvp;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Curator implements BaseCurator {
    private long pointer;

    public Curator(tuz tuzVar) {
        paw.a(Curator.class, "smartcapture_native");
        nativeAllocate();
        nativeInitialize(tuzVar.h());
    }

    private native void nativeAllocate();

    private native void nativeDispose();

    private native void nativeInitialize(byte[] bArr);

    private native byte[] nativeProcessImage(AnalysisImage analysisImage, byte[] bArr);

    private native void nativeReset();

    private native void nativeSetSaveAllowed(boolean z);

    private native void nativeTriggerCapture();

    private native void nativeUpdateCaptureTriggers(byte[] bArr);

    private native void nativeUpdateIndividualCaptureTrigger(int i);

    @Override // com.google.android.apps.camera.autotimer.analysis.jni.BaseCurator
    public final tvp a(poj pojVar, tup tupVar) {
        byte[] bArrNativeProcessImage = nativeProcessImage(new AnalysisImage(pojVar), tupVar.h());
        tvp tvpVar = tvp.a;
        int length = bArrNativeProcessImage.length;
        tow towVar = tow.a;
        tra traVar = tra.a;
        tph tphVarQ = tph.q(tvpVar, bArrNativeProcessImage, 0, length, tow.a);
        tph.D(tphVarQ);
        return (tvp) tphVarQ;
    }

    @Override // com.google.android.apps.camera.autotimer.analysis.jni.BaseCurator
    public final void b(boolean z) {
        nativeSetSaveAllowed(z);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        nativeDispose();
    }

    public native void nativeSetCaptureEnabled(boolean z);
}
