package com.google.googlex.gcam;

import defpackage.tbq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FrameRequest {
    public transient long a;
    protected transient boolean b;

    public FrameRequest(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long c(FrameRequest frameRequest) {
        if (frameRequest == null) {
            return 0L;
        }
        return frameRequest.a;
    }

    public final float a() {
        return GcamModuleJNI.FrameRequest_desired_exposure_time_ms_get(this.a, this);
    }

    public final float b() {
        return GcamModuleJNI.FrameRequest_desired_focus_distance_diopters_get(this.a, this);
    }

    public final tbq d() {
        int iFrameRequest_type_get = GcamModuleJNI.FrameRequest_type_get(this.a, this);
        tbq[] tbqVarArr = tbq.j;
        if (iFrameRequest_type_get < 9 && iFrameRequest_type_get >= 0) {
            tbq tbqVar = tbqVarArr[iFrameRequest_type_get];
            if (tbqVar.k == iFrameRequest_type_get) {
                return tbqVar;
            }
        }
        for (int i = 0; i < 9; i++) {
            tbq tbqVar2 = tbqVarArr[i];
            if (tbqVar2.k == iFrameRequest_type_get) {
                return tbqVar2;
            }
        }
        throw new IllegalArgumentException("No enum " + tbq.class.toString() + " with value " + iFrameRequest_type_get);
    }

    public final CyclopsParameters e() {
        long jFrameRequest_cyclops_params_get = GcamModuleJNI.FrameRequest_cyclops_params_get(this.a, this);
        if (jFrameRequest_cyclops_params_get == 0) {
            return null;
        }
        return new CyclopsParameters(jFrameRequest_cyclops_params_get, false);
    }

    public final synchronized void f() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_FrameRequest(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        f();
    }

    public FrameRequest() {
        this(GcamModuleJNI.new_FrameRequest__SWIG_0(), true);
    }
}
