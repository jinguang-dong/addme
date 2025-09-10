package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GrayWriteViewS16 {
    public transient long a;
    protected transient boolean b;

    public GrayWriteViewS16(long j) {
        this.b = true;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_GrayWriteViewS16(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }

    public GrayWriteViewS16() {
        this(GcamModuleJNI.new_GrayWriteViewS16__SWIG_0());
    }
}
