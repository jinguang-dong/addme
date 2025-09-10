package com.google.googlex.gcam;

import defpackage.tbx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FaceInfo {
    public transient long a;
    protected transient boolean b;

    /* compiled from: PG */
    public class Landmark {
        public transient long a;
        protected transient boolean b;

        public Landmark() {
            long jNew_FaceInfo_Landmark = GcamModuleJNI.new_FaceInfo_Landmark();
            this.b = true;
            this.a = jNew_FaceInfo_Landmark;
        }

        public final synchronized void a() {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_FaceInfo_Landmark(j);
                }
                this.a = 0L;
            }
        }

        public final void b(float f) {
            GcamModuleJNI.FaceInfo_Landmark_x_set(this.a, this, f);
        }

        public final void c(float f) {
            GcamModuleJNI.FaceInfo_Landmark_y_set(this.a, this, f);
        }

        protected final void finalize() {
            a();
        }
    }

    public FaceInfo(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final LandmarkMap a() {
        long jFaceInfo_landmarks_get = GcamModuleJNI.FaceInfo_landmarks_get(this.a, this);
        if (jFaceInfo_landmarks_get == 0) {
            return null;
        }
        return new LandmarkMap(jFaceInfo_landmarks_get, false);
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_FaceInfo(j);
            }
            this.a = 0L;
        }
    }

    public final void c(float f) {
        GcamModuleJNI.FaceInfo_confidence_set(this.a, this, f);
    }

    public final void d(tbx tbxVar) {
        GcamModuleJNI.FaceInfo_face_type_set(this.a, this, tbxVar.f);
    }

    public final void e(int i) {
        GcamModuleJNI.FaceInfo_id_set(this.a, this, i);
    }

    public final void f(float f) {
        GcamModuleJNI.FaceInfo_monk_skin_type_set(this.a, this, f);
    }

    protected final void finalize() {
        b();
    }

    public final void g(float f) {
        GcamModuleJNI.FaceInfo_pan_angle_set(this.a, this, f);
    }

    public final void h(float f) {
        GcamModuleJNI.FaceInfo_pos_x_set(this.a, this, f);
    }

    public final void i(float f) {
        GcamModuleJNI.FaceInfo_pos_y_set(this.a, this, f);
    }

    public final void j(float f) {
        GcamModuleJNI.FaceInfo_roll_angle_set(this.a, this, f);
    }

    public final void k(float f) {
        GcamModuleJNI.FaceInfo_size_set(this.a, this, f);
    }

    public final void l(float f) {
        GcamModuleJNI.FaceInfo_tilt_angle_set(this.a, this, f);
    }

    public FaceInfo() {
        this(GcamModuleJNI.new_FaceInfo__SWIG_0(), true);
    }
}
