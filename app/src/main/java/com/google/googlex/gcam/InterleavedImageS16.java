package com.google.googlex.gcam;

import defpackage.rup;
import defpackage.tch;
import defpackage.tdh;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InterleavedImageS16 {
    public transient long a;
    protected transient boolean b;
    private Optional c;

    public InterleavedImageS16() {
        this(GcamModuleJNI.new_InterleavedImageS16__SWIG_0());
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
        return GcamModuleJNI.InterleavedImageS16_size_in_bytes(this.a, this);
    }

    public final synchronized void b() {
        if (this.a != 0) {
            if (this.b) {
                int i = tdh.a;
                this.b = false;
                GcamModuleJNI.delete_InterleavedImageS16(this.a);
                this.c.ifPresent(new tch(0));
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }

    public InterleavedImageS16(int i, int i2, int i3) {
        this(GcamModuleJNI.new_InterleavedImageS16__SWIG_1(i, i2, i3));
        if (this.a == 0) {
            return;
        }
        long jA = a();
        if (jA > 0) {
            this.c = Optional.of(rup.q(this, jA));
        }
        int i4 = tdh.a;
    }

    public InterleavedImageS16(long j) {
        this.c = Optional.empty();
        this.b = true;
        this.a = j;
    }
}
