package com.google.googlex.gcam;

import defpackage.tcc;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GeometricCalibration {
    public transient long a;
    protected transient boolean b;

    public GeometricCalibration() {
        long jNew_GeometricCalibration = GcamModuleJNI.new_GeometricCalibration();
        this.b = true;
        this.a = jNew_GeometricCalibration;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_GeometricCalibration(j);
            }
            this.a = 0L;
        }
    }

    public final void b(PixelRect pixelRect) {
        GcamModuleJNI.GeometricCalibration_active_rectangle_set(this.a, this, PixelRect.g(pixelRect), pixelRect);
    }

    public final void c(float[] fArr) {
        GcamModuleJNI.GeometricCalibration_lens_distortion_set(this.a, this, fArr);
    }

    public final void d(float[] fArr) {
        GcamModuleJNI.GeometricCalibration_lens_distortion_extended_set(this.a, this, fArr);
    }

    public final void e(float[] fArr) {
        GcamModuleJNI.GeometricCalibration_lens_intrinsic_calibration_set(this.a, this, fArr);
    }

    public final void f(float[] fArr) {
        GcamModuleJNI.GeometricCalibration_lens_pose_rotation_set(this.a, this, fArr);
    }

    protected final void finalize() {
        a();
    }

    public final void g(float[] fArr) {
        GcamModuleJNI.GeometricCalibration_lens_pose_translation_set(this.a, this, fArr);
    }

    public final void h(tcc tccVar) {
        GcamModuleJNI.GeometricCalibration_quality_set(this.a, this, tccVar.c);
    }

    public final void i(PixelRect pixelRect) {
        GcamModuleJNI.GeometricCalibration_valid_rectangle_set(this.a, this, PixelRect.g(pixelRect), pixelRect);
    }

    public final float[] j() {
        return GcamModuleJNI.GeometricCalibration_lens_distortion_get(this.a, this);
    }

    public final float[] k() {
        return GcamModuleJNI.GeometricCalibration_lens_distortion_extended_get(this.a, this);
    }

    public final float[] l() {
        return GcamModuleJNI.GeometricCalibration_lens_intrinsic_calibration_get(this.a, this);
    }
}
