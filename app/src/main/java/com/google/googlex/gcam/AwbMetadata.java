package com.google.googlex.gcam;

import defpackage.tbn;
import defpackage.tbo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AwbMetadata {
    public transient long a;
    protected transient boolean b;

    public AwbMetadata(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_AwbMetadata(j);
            }
            this.a = 0L;
        }
    }

    public final void b(boolean z) {
        GcamModuleJNI.AwbMetadata_lock_set(this.a, this, z);
    }

    public final void c(tbn tbnVar) {
        GcamModuleJNI.AwbMetadata_mode_set(this.a, this, tbnVar.k);
    }

    public final void d(tbo tboVar) {
        GcamModuleJNI.AwbMetadata_state_set(this.a, this, tboVar.f);
    }

    protected final void finalize() {
        a();
    }

    public AwbMetadata() {
        this(GcamModuleJNI.new_AwbMetadata(), true);
    }
}
