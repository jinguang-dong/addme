package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HotPixelMetadata {
    protected transient boolean a;
    private transient long b;

    public HotPixelMetadata(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    public final HotPixelMetadataVector a() {
        long jHotPixelMetadata_hot_pixel_coordinates_get = GcamModuleJNI.HotPixelMetadata_hot_pixel_coordinates_get(this.b, this);
        if (jHotPixelMetadata_hot_pixel_coordinates_get == 0) {
            return null;
        }
        return new HotPixelMetadataVector(jHotPixelMetadata_hot_pixel_coordinates_get, false);
    }

    public final Size b() {
        long jHotPixelMetadata_hot_pixel_image_size_get = GcamModuleJNI.HotPixelMetadata_hot_pixel_image_size_get(this.b, this);
        if (jHotPixelMetadata_hot_pixel_image_size_get == 0) {
            return null;
        }
        return new Size(jHotPixelMetadata_hot_pixel_image_size_get, false);
    }

    public final synchronized void c() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_HotPixelMetadata(j);
            }
            this.b = 0L;
        }
    }

    protected final void finalize() {
        c();
    }

    public HotPixelMetadata() {
        this(GcamModuleJNI.new_HotPixelMetadata(), true);
    }
}
