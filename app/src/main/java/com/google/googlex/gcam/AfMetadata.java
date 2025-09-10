package com.google.googlex.gcam;

import defpackage.tbj;
import defpackage.tbk;
import defpackage.tbl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AfMetadata {
    public transient long a;
    protected transient boolean b;

    public AfMetadata(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_AfMetadata(j);
            }
            this.a = 0L;
        }
    }

    public final void b(tbj tbjVar) {
        GcamModuleJNI.AfMetadata_mode_set(this.a, this, tbjVar.h);
    }

    public final void c(tbk tbkVar) {
        GcamModuleJNI.AfMetadata_state_set(this.a, this, tbkVar.i);
    }

    public final void d(tbl tblVar) {
        GcamModuleJNI.AfMetadata_trigger_set(this.a, this, tblVar.e);
    }

    protected final void finalize() {
        a();
    }

    public AfMetadata() {
        this(GcamModuleJNI.new_AfMetadata(), true);
    }
}
