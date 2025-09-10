package com.google.googlex.gcam;

import defpackage.rup;
import defpackage.tch;
import defpackage.tdh;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InterleavedImageU8 {
    protected transient boolean a;
    private transient long b;
    private Optional c;

    public InterleavedImageU8() {
        this(GcamModuleJNI.new_InterleavedImageU8__SWIG_0());
        if (this.b == 0) {
            return;
        }
        long jC = c();
        if (jC > 0) {
            this.c = Optional.of(rup.q(this, jC));
        }
        int i = tdh.a;
    }

    public static long e(InterleavedImageU8 interleavedImageU8) {
        if (interleavedImageU8 == null) {
            return 0L;
        }
        return interleavedImageU8.b;
    }

    public final int a() {
        return GcamModuleJNI.InterleavedImageU8_channels(this.b, this);
    }

    public final int b() {
        return GcamModuleJNI.InterleavedImageU8_height(this.b, this);
    }

    public final int c() {
        return GcamModuleJNI.InterleavedImageU8_size_in_bytes(this.b, this);
    }

    public final int d() {
        return GcamModuleJNI.InterleavedImageU8_width(this.b, this);
    }

    public final InterleavedReadViewU8 f() {
        return new InterleavedReadViewU8(GcamModuleJNI.InterleavedImageU8_read_view(this.b, this));
    }

    protected final void finalize() {
        h();
    }

    public final InterleavedWriteViewU8 g() {
        return new InterleavedWriteViewU8(GcamModuleJNI.InterleavedImageU8_write_view(this.b, this));
    }

    public final synchronized void h() {
        if (this.b != 0) {
            if (this.a) {
                int i = tdh.a;
                this.a = false;
                GcamModuleJNI.delete_InterleavedImageU8(this.b);
                this.c.ifPresent(new tch(3));
            }
            this.b = 0L;
        }
    }

    public final boolean i() {
        return GcamModuleJNI.InterleavedImageU8_empty(this.b, this);
    }

    public InterleavedImageU8(int i, int i2, int i3) {
        this(GcamModuleJNI.new_InterleavedImageU8__SWIG_1(i, i2, i3));
        if (this.b == 0) {
            return;
        }
        long jC = c();
        if (jC > 0) {
            this.c = Optional.of(rup.q(this, jC));
        }
        int i4 = tdh.a;
    }

    public InterleavedImageU8(long j) {
        this.c = Optional.empty();
        this.a = true;
        this.b = j;
    }
}
