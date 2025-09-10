package com.google.android.apps.camera.imax.cyclops.processing;

import android.graphics.Bitmap;
import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;
import com.google.android.libraries.vision.opengl.Texture;
import defpackage.ikr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NativeCaptureImpl implements ikr {
    public final int a;
    public final float b;
    private long nativeRef;

    static {
        System.loadLibrary("cyclops");
    }

    public NativeCaptureImpl(int i, float f) {
        this.nativeRef = 0L;
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.ikr
    public native float getCaptureProgress();

    @Override // defpackage.ikr
    public native Bitmap getPreview(int i);

    @Override // defpackage.ikr
    public native Texture getPreviewAsTexture();

    @Override // defpackage.ikr
    public native void getTrackerStats(TrackerStats trackerStats);

    public native void initialize(int i, int i2, int i3, int i4, int i5, float f);

    @Override // defpackage.ikr
    public native void release();

    @Override // defpackage.ikr
    public native void setMetaData(float f, int i, boolean z, int i2, boolean z2);

    @Override // defpackage.ikr
    public native void startCapture();

    @Override // defpackage.ikr
    public native int stopCapture(String str);

    @Override // defpackage.ikr
    public native boolean trackTexture(float[] fArr, float[] fArr2);

    public NativeCaptureImpl() {
        this(512, 60.0f);
    }
}
