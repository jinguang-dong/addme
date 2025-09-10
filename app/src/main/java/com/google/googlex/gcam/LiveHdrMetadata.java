package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LiveHdrMetadata {
    public transient long a;
    protected transient boolean b;

    public LiveHdrMetadata(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final float a() {
        return GcamModuleJNI.LiveHdrMetadata_manual_long_tet_override_get(this.a, this);
    }

    public final float b() {
        return GcamModuleJNI.LiveHdrMetadata_manual_portrait_tet_override_get(this.a, this);
    }

    public final float c() {
        return GcamModuleJNI.LiveHdrMetadata_manual_short_tet_override_get(this.a, this);
    }

    public final synchronized void d() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_LiveHdrMetadata(j);
            }
            this.a = 0L;
        }
    }

    public final void e(float f) {
        GcamModuleJNI.LiveHdrMetadata_manual_long_tet_override_set(this.a, this, f);
    }

    public final void f(float f) {
        GcamModuleJNI.LiveHdrMetadata_manual_portrait_tet_override_set(this.a, this, f);
    }

    protected final void finalize() {
        d();
    }

    public final void g(float f) {
        GcamModuleJNI.LiveHdrMetadata_manual_short_tet_override_set(this.a, this, f);
    }

    public final void h(float f) {
        GcamModuleJNI.LiveHdrMetadata_viewfinder_long_tet_set(this.a, this, f);
    }

    public final void i(float f) {
        GcamModuleJNI.LiveHdrMetadata_viewfinder_portrait_tet_set(this.a, this, f);
    }

    public final void j(float f) {
        GcamModuleJNI.LiveHdrMetadata_viewfinder_short_tet_set(this.a, this, f);
    }

    public LiveHdrMetadata() {
        this(GcamModuleJNI.new_LiveHdrMetadata(), true);
    }
}
