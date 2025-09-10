package com.google.googlex.gcam;

import defpackage.rup;
import defpackage.tch;
import defpackage.tdd;
import defpackage.tdh;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class YuvImage {
    public transient long a;
    protected transient boolean b;
    private Optional c;

    public YuvImage(int i, int i2, tdd tddVar) {
        this(GcamModuleJNI.new_YuvImageBase__SWIG_0(i, i2, tddVar.d));
        long j = this.a;
        if (j != 0) {
            long jYuvImage_size_in_bytes = GcamModuleJNI.YuvImage_size_in_bytes(j, this);
            if (jYuvImage_size_in_bytes > 0) {
                this.c = Optional.of(rup.q(this, jYuvImage_size_in_bytes));
            }
            int i3 = tdh.a;
        }
    }

    public final int a() {
        return GcamModuleJNI.YuvImage_height(this.a, this);
    }

    public final int b() {
        return GcamModuleJNI.YuvImage_width(this.a, this);
    }

    public final synchronized void c() {
        if (this.a != 0) {
            if (this.b) {
                int i = tdh.a;
                this.b = false;
                GcamModuleJNI.delete_YuvImage(this.a);
                this.c.ifPresent(new tch(5));
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        c();
    }

    public YuvImage(long j) {
        this.c = Optional.empty();
        this.b = true;
        this.a = j;
    }
}
