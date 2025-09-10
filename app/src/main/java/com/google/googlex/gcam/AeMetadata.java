package com.google.googlex.gcam;

import defpackage.tbf;
import defpackage.tbg;
import defpackage.tbh;
import defpackage.tcz;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AeMetadata {
    public transient long a;
    protected transient boolean b;

    public AeMetadata(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final tcz a() {
        return tcz.a(GcamModuleJNI.AeMetadata_touch_roi_type_get(this.a, this));
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_AeMetadata(j);
            }
            this.a = 0L;
        }
    }

    public final void c(float f) {
        GcamModuleJNI.AeMetadata_exposure_compensation_set(this.a, this, f);
    }

    public final void d(boolean z) {
        GcamModuleJNI.AeMetadata_lock_set(this.a, this, z);
    }

    public final void e(tbf tbfVar) {
        GcamModuleJNI.AeMetadata_mode_set(this.a, this, tbfVar.h);
    }

    public final void f(tbg tbgVar) {
        GcamModuleJNI.AeMetadata_precapture_trigger_set(this.a, this, tbgVar.e);
    }

    protected final void finalize() {
        b();
    }

    public final void g(tbh tbhVar) {
        GcamModuleJNI.AeMetadata_state_set(this.a, this, tbhVar.h);
    }

    public final void h(tcz tczVar) {
        GcamModuleJNI.AeMetadata_touch_roi_type_set(this.a, this, tczVar.f);
    }

    public AeMetadata() {
        this(GcamModuleJNI.new_AeMetadata(), true);
    }
}
