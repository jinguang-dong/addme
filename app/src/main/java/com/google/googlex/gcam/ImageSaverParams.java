package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ImageSaverParams {
    public transient long a;
    protected transient boolean b;

    public ImageSaverParams() {
        long jNew_ImageSaverParams = GcamModuleJNI.new_ImageSaverParams();
        this.b = true;
        this.a = jNew_ImageSaverParams;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_ImageSaverParams(j);
            }
            this.a = 0L;
        }
    }

    public final void b(String str) {
        GcamModuleJNI.ImageSaverParams_dest_folder_set(this.a, this, str);
    }

    protected final void finalize() {
        a();
    }
}
