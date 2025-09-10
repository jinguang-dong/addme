package com.google.googlex.gcam;

import defpackage.rup;
import defpackage.tch;
import defpackage.tdh;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InterleavedImageU16 {
    public transient long a;
    protected transient boolean b;
    private Optional c;

    public InterleavedImageU16() {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_0());
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
        return GcamModuleJNI.InterleavedImageU16_size_in_bytes(this.a, this);
    }

    public final InterleavedReadViewU16 b() {
        return new InterleavedReadViewU16(GcamModuleJNI.InterleavedImageU16_read_view(this.a, this));
    }

    public final synchronized void c() {
        if (this.a != 0) {
            if (this.b) {
                int i = tdh.a;
                this.b = false;
                GcamModuleJNI.delete_InterleavedImageU16(this.a);
                this.c.ifPresent(new tch(2));
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        c();
    }

    public InterleavedImageU16(int i, int i2, int i3) {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_1(i, i2, i3));
        if (this.a == 0) {
            return;
        }
        long jA = a();
        if (jA > 0) {
            this.c = Optional.of(rup.q(this, jA));
        }
        int i4 = tdh.a;
    }

    public InterleavedImageU16(long j) {
        this.c = Optional.empty();
        this.b = true;
        this.a = j;
    }
}
