package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Int16ToFloatMap {
    public transient long a;
    protected transient boolean b;

    public Int16ToFloatMap(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_Int16ToFloatMap(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }

    public Int16ToFloatMap() {
        this(GcamModuleJNI.new_Int16ToFloatMap__SWIG_0(), true);
    }
}
