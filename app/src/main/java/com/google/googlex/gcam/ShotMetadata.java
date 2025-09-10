package com.google.googlex.gcam;

import defpackage.tcd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShotMetadata {
    public transient long a;
    protected transient boolean b;

    public ShotMetadata(long j) {
        this.b = true;
        this.a = j;
    }

    public static long a(ShotMetadata shotMetadata) {
        if (shotMetadata == null) {
            return 0L;
        }
        return shotMetadata.a;
    }

    public final long b() {
        return GcamModuleJNI.ShotMetadata_timestamp_unix_us_get(this.a, this);
    }

    public final AeResults c() {
        long jShotMetadata_ae_results_get = GcamModuleJNI.ShotMetadata_ae_results_get(this.a, this);
        if (jShotMetadata_ae_results_get == 0) {
            return null;
        }
        return new AeResults(jShotMetadata_ae_results_get, false);
    }

    public final FrameMetadata d() {
        long jShotMetadata_frame_metadata_get = GcamModuleJNI.ShotMetadata_frame_metadata_get(this.a, this);
        if (jShotMetadata_frame_metadata_get == 0) {
            return null;
        }
        return new FrameMetadata(jShotMetadata_frame_metadata_get, false);
    }

    public final tcd e() {
        return tcd.a(GcamModuleJNI.ShotMetadata_image_rotation_get(this.a, this));
    }

    public final StaticMetadata f() {
        long jShotMetadata_static_metadata_get = GcamModuleJNI.ShotMetadata_static_metadata_get(this.a, this);
        if (jShotMetadata_static_metadata_get == 0) {
            return null;
        }
        return new StaticMetadata(jShotMetadata_static_metadata_get, false);
    }

    protected final void finalize() {
        g();
    }

    public final synchronized void g() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_ShotMetadata(j);
            }
            this.a = 0L;
        }
    }

    public final void h(HdrGainMapInfo hdrGainMapInfo) {
        GcamModuleJNI.ShotMetadata_hdr_gain_map_set(this.a, this, HdrGainMapInfo.a(hdrGainMapInfo), hdrGainMapInfo);
    }

    public final void i(tcd tcdVar) {
        GcamModuleJNI.ShotMetadata_image_rotation_set(this.a, this, tcdVar.j);
    }

    public final void j(String str) {
        GcamModuleJNI.ShotMetadata_slowraw_path_set(this.a, this, str);
    }

    public final void k(String str) {
        GcamModuleJNI.ShotMetadata_software_suffix_set(this.a, this, str);
    }

    public final boolean l() {
        return GcamModuleJNI.ShotMetadata_should_apply_deblur_badge_get(this.a, this);
    }

    public ShotMetadata() {
        this(GcamModuleJNI.new_ShotMetadata__SWIG_0());
    }

    public ShotMetadata(ShotMetadata shotMetadata) {
        this(GcamModuleJNI.new_ShotMetadata__SWIG_1(a(shotMetadata), shotMetadata));
    }
}
