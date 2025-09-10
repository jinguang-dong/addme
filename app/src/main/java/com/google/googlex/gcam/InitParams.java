package com.google.googlex.gcam;

import defpackage.tbu;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InitParams {
    public transient long a;
    protected transient boolean b;

    public InitParams() {
        long jNew_InitParams = GcamModuleJNI.new_InitParams();
        this.b = true;
        this.a = jNew_InitParams;
    }

    public final tbu a() {
        return tbu.a(GcamModuleJNI.InitParams_execute_finish_on_get(this.a, this));
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_InitParams(j);
            }
            this.a = 0L;
        }
    }

    public final void c(tbu tbuVar) {
        GcamModuleJNI.InitParams_execute_finish_on_set(this.a, this, tbuVar.e);
    }

    protected final void finalize() {
        b();
    }
}
