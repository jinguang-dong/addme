package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TfliteFileData {
    public transient long a;
    protected transient boolean b;

    public TfliteFileData(int i, long j, long j2) {
        long jNew_TfliteFileData = GcamModuleJNI.new_TfliteFileData(i, j, j2);
        this.b = true;
        this.a = jNew_TfliteFileData;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_TfliteFileData(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
