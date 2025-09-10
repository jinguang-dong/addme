package com.google.android.apps.camera.dynamicdepth;

import android.hardware.camera2.CaptureResult;
import defpackage.hgc;
import defpackage.paq;
import defpackage.pas;
import defpackage.poe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DynamicDepthResult implements paq {
    public long a;

    public DynamicDepthResult(int i, int i2, boolean z) {
        hgc.a();
        this.a = alloc(i, i2, 0, false, z, null, null);
    }

    private static native long alloc(int i, int i2, int i3, boolean z, boolean z2, float[] fArr, float[] fArr2);

    private static native void dealloc(long j);

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        dealloc(this.a);
        this.a = 0L;
    }

    public DynamicDepthResult(pas pasVar, int i, boolean z, boolean z2, poe poeVar) {
        float[] fArr;
        float[] fArr2;
        if (poeVar != null) {
            float[] fArr3 = (float[]) poeVar.a(CaptureResult.LENS_INTRINSIC_CALIBRATION);
            fArr2 = (float[]) poeVar.a(CaptureResult.LENS_DISTORTION);
            fArr = fArr3;
        } else {
            fArr = null;
            fArr2 = null;
        }
        this.a = alloc(pasVar.a, pasVar.b, i, z, z2, fArr, fArr2);
    }
}
