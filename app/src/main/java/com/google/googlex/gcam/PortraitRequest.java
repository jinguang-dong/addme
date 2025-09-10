package com.google.googlex.gcam;

import defpackage.tbs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PortraitRequest {
    public transient long a;
    protected transient boolean b;

    public PortraitRequest(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final PixelRectVector a() {
        long jPortraitRequest_faces_get = GcamModuleJNI.PortraitRequest_faces_get(this.a, this);
        if (jPortraitRequest_faces_get == 0) {
            return null;
        }
        return new PixelRectVector(jPortraitRequest_faces_get, false);
    }

    public final StringStaticMetadataMap b() {
        long jPortraitRequest_static_metadata_get = GcamModuleJNI.PortraitRequest_static_metadata_get(this.a, this);
        if (jPortraitRequest_static_metadata_get == 0) {
            return null;
        }
        return new StringStaticMetadataMap(jPortraitRequest_static_metadata_get, false);
    }

    public final synchronized void c() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_PortraitRequest(j);
            }
            this.a = 0L;
        }
    }

    public final void d(tbs tbsVar) {
        GcamModuleJNI.PortraitRequest_depth_processing_set(this.a, this, tbsVar.i);
    }

    public final void e(boolean z) {
        GcamModuleJNI.PortraitRequest_enable_gpu_boost_set(this.a, this, z);
    }

    public final boolean f() {
        return GcamModuleJNI.PortraitRequest_manually_rotate_xmp_jpg_get(this.a, this);
    }

    protected final void finalize() {
        c();
    }

    public PortraitRequest() {
        this(GcamModuleJNI.new_PortraitRequest(), true);
    }
}
