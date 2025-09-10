package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RawReadView {
    protected transient boolean a;
    private transient long b;

    public RawReadView(long j) {
        this.a = true;
        this.b = j;
    }

    public static long c(RawReadView rawReadView) {
        if (rawReadView == null) {
            return 0L;
        }
        return rawReadView.b;
    }

    public synchronized void a() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_RawReadView(j);
            }
            this.b = 0L;
        }
    }

    public final int b() {
        return GcamModuleJNI.RawReadView_size_in_bytes(this.b, this);
    }

    public final boolean d() {
        return GcamModuleJNI.RawReadView_empty(this.b, this);
    }

    protected void finalize() {
        a();
    }

    public RawReadView() {
        this(GcamModuleJNI.new_RawReadView__SWIG_0());
    }
}
