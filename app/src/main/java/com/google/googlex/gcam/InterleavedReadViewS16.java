package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InterleavedReadViewS16 {
    public transient long a;
    protected transient boolean b;

    public InterleavedReadViewS16(long j) {
        this.b = true;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_InterleavedReadViewS16(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }

    public InterleavedReadViewS16() {
        this(GcamModuleJNI.new_InterleavedReadViewS16__SWIG_0());
    }
}
