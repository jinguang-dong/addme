package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StringAeResultsMap {
    public transient long a;
    protected transient boolean b;

    public StringAeResultsMap(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_StringAeResultsMap(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }

    public StringAeResultsMap() {
        this(GcamModuleJNI.new_StringAeResultsMap__SWIG_0(), true);
    }
}
