package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CroppedGrayMap {
    protected transient boolean a;
    private transient long b;

    public CroppedGrayMap(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    public static long a(CroppedGrayMap croppedGrayMap) {
        if (croppedGrayMap == null) {
            return 0L;
        }
        return croppedGrayMap.b;
    }

    public final NormalizedRect b() {
        long jCroppedGrayMap_crop_get = GcamModuleJNI.CroppedGrayMap_crop_get(this.b, this);
        if (jCroppedGrayMap_crop_get == 0) {
            return null;
        }
        return new NormalizedRect(jCroppedGrayMap_crop_get, false);
    }

    public final synchronized void c() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_CroppedGrayMap(j);
            }
            this.b = 0L;
        }
    }

    protected final void finalize() {
        c();
    }

    public CroppedGrayMap() {
        this(GcamModuleJNI.new_CroppedGrayMap(), true);
    }
}
