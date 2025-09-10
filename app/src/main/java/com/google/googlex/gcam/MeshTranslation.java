package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MeshTranslation {
    protected transient boolean a;
    private transient long b;

    public MeshTranslation(long j) {
        this.a = true;
        this.b = j;
    }

    public final int a() {
        return GcamModuleJNI.MeshTranslation_x_get(this.b, this);
    }

    public final int b() {
        return GcamModuleJNI.MeshTranslation_y_get(this.b, this);
    }

    public final synchronized void c() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_MeshTranslation(j);
            }
            this.b = 0L;
        }
    }

    protected final void finalize() {
        c();
    }

    public MeshTranslation() {
        this(GcamModuleJNI.new_MeshTranslation());
    }
}
