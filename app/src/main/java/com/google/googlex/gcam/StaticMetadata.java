package com.google.googlex.gcam;

import defpackage.tbp;
import defpackage.tci;
import defpackage.tcy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StaticMetadata {
    public transient long a;
    protected transient boolean b;

    public StaticMetadata(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long c(StaticMetadata staticMetadata) {
        if (staticMetadata == null) {
            return 0L;
        }
        return staticMetadata.a;
    }

    public final float a() {
        return GcamModuleJNI.StaticMetadata_sensor_physical_height_mm_get(this.a, this);
    }

    public final float b() {
        return GcamModuleJNI.StaticMetadata_sensor_physical_width_mm_get(this.a, this);
    }

    public final tbp d() {
        return tbp.a(GcamModuleJNI.StaticMetadata_bayer_pattern_get(this.a, this));
    }

    public final tci e() {
        int iStaticMetadata_lens_facing_get = GcamModuleJNI.StaticMetadata_lens_facing_get(this.a, this);
        tci[] tciVarArr = tci.e;
        if (iStaticMetadata_lens_facing_get < 4 && iStaticMetadata_lens_facing_get >= 0) {
            tci tciVar = tciVarArr[iStaticMetadata_lens_facing_get];
            if (tciVar.f == iStaticMetadata_lens_facing_get) {
                return tciVar;
            }
        }
        for (int i = 0; i < 4; i++) {
            tci tciVar2 = tciVarArr[i];
            if (tciVar2.f == iStaticMetadata_lens_facing_get) {
                return tciVar2;
            }
        }
        throw new IllegalArgumentException("No enum " + tci.class.toString() + " with value " + iStaticMetadata_lens_facing_get);
    }

    public final PixelRect f() {
        long jStaticMetadata_active_area_get = GcamModuleJNI.StaticMetadata_active_area_get(this.a, this);
        if (jStaticMetadata_active_area_get == 0) {
            return null;
        }
        return new PixelRect(jStaticMetadata_active_area_get, false);
    }

    protected final void finalize() {
        h();
    }

    public final tcy g() {
        return tcy.a(GcamModuleJNI.StaticMetadata_sensor_id_get(this.a, this));
    }

    public final synchronized void h() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_StaticMetadata(j);
            }
            this.a = 0L;
        }
    }

    public final void i(PixelRect pixelRect) {
        GcamModuleJNI.StaticMetadata_active_area_set(this.a, this, PixelRect.g(pixelRect), pixelRect);
    }

    public final void j(tbp tbpVar) {
        GcamModuleJNI.StaticMetadata_bayer_pattern_set(this.a, this, tbpVar.k);
    }

    public final void k(int i) {
        GcamModuleJNI.StaticMetadata_frame_raw_max_height_set(this.a, this, i);
    }

    public final void l(int i) {
        GcamModuleJNI.StaticMetadata_frame_raw_max_width_set(this.a, this, i);
    }

    public final void m(float f) {
        GcamModuleJNI.StaticMetadata_frame_readout_time_ms_set(this.a, this, f);
    }

    public final void n(String str) {
        GcamModuleJNI.StaticMetadata_package_name_set(this.a, this, str);
    }

    public final void o(String str) {
        GcamModuleJNI.StaticMetadata_package_version_set(this.a, this, str);
    }

    public final void p(int i) {
        GcamModuleJNI.StaticMetadata_pixel_array_height_set(this.a, this, i);
    }

    public final void q(int i) {
        GcamModuleJNI.StaticMetadata_pixel_array_width_set(this.a, this, i);
    }

    public final void r(tcy tcyVar) {
        GcamModuleJNI.StaticMetadata_sensor_id_set(this.a, this, tcyVar.w);
    }

    public final void s(float f) {
        GcamModuleJNI.StaticMetadata_sensor_physical_height_mm_set(this.a, this, f);
    }

    public final void t(float f) {
        GcamModuleJNI.StaticMetadata_sensor_physical_width_mm_set(this.a, this, f);
    }

    public final void u(int i) {
        GcamModuleJNI.StaticMetadata_white_level_set(this.a, this, i);
    }

    public StaticMetadata() {
        this(GcamModuleJNI.new_StaticMetadata__SWIG_0(), true);
    }

    public StaticMetadata(StaticMetadata staticMetadata) {
        this(GcamModuleJNI.new_StaticMetadata__SWIG_1(c(staticMetadata), staticMetadata), true);
    }
}
