package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AssetData {
    public transient long a;
    protected transient boolean b;

    public AssetData() {
        long jNew_AssetData = GcamModuleJNI.new_AssetData();
        this.b = true;
        this.a = jNew_AssetData;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_AssetData(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
