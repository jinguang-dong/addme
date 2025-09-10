package com.google.googlex.gcam;

import defpackage.tbv;
import defpackage.tca;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ArkInfo {
    public transient long a;
    protected transient boolean b;

    public ArkInfo(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final float a() {
        return GcamModuleJNI.ArkInfo_brightness_factor_get(this.a, this);
    }

    public final float b() {
        return GcamModuleJNI.ArkInfo_exposure_time_ms_get(this.a, this);
    }

    public final float c() {
        return GcamModuleJNI.ArkInfo_gain_get(this.a, this);
    }

    public final float d() {
        return GcamModuleJNI.ArkInfo_shadow_factor_get(this.a, this);
    }

    public final tbv e() {
        int iArkInfo_exposure_mode_get = GcamModuleJNI.ArkInfo_exposure_mode_get(this.a, this);
        tbv[] tbvVarArr = tbv.f;
        if (iArkInfo_exposure_mode_get < 5 && iArkInfo_exposure_mode_get >= 0) {
            tbv tbvVar = tbvVarArr[iArkInfo_exposure_mode_get];
            if (tbvVar.g == iArkInfo_exposure_mode_get) {
                return tbvVar;
            }
        }
        for (int i = 0; i < 5; i++) {
            tbv tbvVar2 = tbvVarArr[i];
            if (tbvVar2.g == iArkInfo_exposure_mode_get) {
                return tbvVar2;
            }
        }
        throw new IllegalArgumentException("No enum " + tbv.class.toString() + " with value " + iArkInfo_exposure_mode_get);
    }

    public final synchronized void f() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_ArkInfo(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        f();
    }

    public final void g(tbv tbvVar) {
        GcamModuleJNI.ArkInfo_exposure_mode_set(this.a, this, tbvVar.g);
    }

    public final void h(tca tcaVar) {
        GcamModuleJNI.ArkInfo_focus_mode_set(this.a, this, tcaVar.e);
    }

    public ArkInfo() {
        this(GcamModuleJNI.new_ArkInfo__SWIG_0(), true);
    }
}
