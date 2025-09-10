package com.google.googlex.gcam;

import defpackage.rup;
import defpackage.tch;
import defpackage.tdh;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GrayImageS16 {
    public transient long a;
    protected transient boolean b;
    private Optional c;

    public GrayImageS16() {
        this(GcamModuleJNI.new_GrayImageS16__SWIG_0());
        if (this.a == 0) {
            return;
        }
        long jA = a();
        if (jA > 0) {
            this.c = Optional.of(rup.q(this, jA));
        }
        int i = tdh.a;
    }

    public final int a() {
        return GcamModuleJNI.GrayImageS16_size_in_bytes(this.a, this);
    }

    public final synchronized void b() {
        if (this.a != 0) {
            if (this.b) {
                int i = tdh.a;
                this.b = false;
                GcamModuleJNI.delete_GrayImageS16(this.a);
                this.c.ifPresent(new tch(1));
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }

    public GrayImageS16(int i, int i2) {
        this(GcamModuleJNI.new_GrayImageS16__SWIG_1(i, i2, 1));
        if (this.a == 0) {
            return;
        }
        long jA = a();
        if (jA > 0) {
            this.c = Optional.of(rup.q(this, jA));
        }
        int i3 = tdh.a;
    }

    public GrayImageS16(long j) {
        this.c = Optional.empty();
        this.b = true;
        this.a = j;
    }
}
