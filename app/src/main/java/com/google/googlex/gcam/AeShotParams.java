package com.google.googlex.gcam;

import defpackage.tbm;
import defpackage.tcz;
import defpackage.tda;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AeShotParams {
    public transient long a;
    protected transient boolean b;

    public AeShotParams(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final tbm a() {
        int iAeShotParams_auto_night_sight_get = GcamModuleJNI.AeShotParams_auto_night_sight_get(this.a, this);
        tbm[] tbmVarArr = tbm.e;
        if (iAeShotParams_auto_night_sight_get < 4 && iAeShotParams_auto_night_sight_get >= 0) {
            tbm tbmVar = tbmVarArr[iAeShotParams_auto_night_sight_get];
            if (tbmVar.f == iAeShotParams_auto_night_sight_get) {
                return tbmVar;
            }
        }
        for (int i = 0; i < 4; i++) {
            tbm tbmVar2 = tbmVarArr[i];
            if (tbmVar2.f == iAeShotParams_auto_night_sight_get) {
                return tbmVar2;
            }
        }
        throw new IllegalArgumentException("No enum " + tbm.class.toString() + " with value " + iAeShotParams_auto_night_sight_get);
    }

    public final NormalizedRect b() {
        long jAeShotParams_crop_get = GcamModuleJNI.AeShotParams_crop_get(this.a, this);
        if (jAeShotParams_crop_get == 0) {
            return null;
        }
        return new NormalizedRect(jAeShotParams_crop_get, false);
    }

    public final NormalizedRect c() {
        long jAeShotParams_merged_crop_get = GcamModuleJNI.AeShotParams_merged_crop_get(this.a, this);
        if (jAeShotParams_merged_crop_get == 0) {
            return null;
        }
        return new NormalizedRect(jAeShotParams_merged_crop_get, false);
    }

    public final tcz d() {
        return tcz.a(GcamModuleJNI.AeShotParams_touch_roi_type_get(this.a, this));
    }

    public final WeightedNormalizedRectVector e() {
        long jAeShotParams_weighted_metering_areas_get = GcamModuleJNI.AeShotParams_weighted_metering_areas_get(this.a, this);
        if (jAeShotParams_weighted_metering_areas_get == 0) {
            return null;
        }
        return new WeightedNormalizedRectVector(jAeShotParams_weighted_metering_areas_get, false);
    }

    public final synchronized void f() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_AeShotParams(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        f();
    }

    public final void g(tbm tbmVar) {
        GcamModuleJNI.AeShotParams_auto_night_sight_set(this.a, this, tbmVar.f);
    }

    public final void h(NormalizedRect normalizedRect) {
        GcamModuleJNI.AeShotParams_crop_set(this.a, this, NormalizedRect.a(normalizedRect), normalizedRect);
    }

    public final void i(float f) {
        GcamModuleJNI.AeShotParams_exposure_compensation_set(this.a, this, f);
    }

    public final void j(NormalizedRect normalizedRect) {
        GcamModuleJNI.AeShotParams_merged_crop_set(this.a, this, NormalizedRect.a(normalizedRect), normalizedRect);
    }

    public final void k(boolean z) {
        GcamModuleJNI.AeShotParams_relighting_expected_set(this.a, this, z);
    }

    public final void l(int i) {
        GcamModuleJNI.AeShotParams_target_height_set(this.a, this, i);
    }

    public final void m(int i) {
        GcamModuleJNI.AeShotParams_target_width_set(this.a, this, i);
    }

    public final void n(tcz tczVar) {
        GcamModuleJNI.AeShotParams_touch_roi_type_set(this.a, this, tczVar.f);
    }

    public final void o(tda tdaVar) {
        GcamModuleJNI.AeShotParams_ux_mode_set(this.a, this, tdaVar.e);
    }

    public AeShotParams() {
        this(GcamModuleJNI.new_AeShotParams__SWIG_0(), true);
    }
}
