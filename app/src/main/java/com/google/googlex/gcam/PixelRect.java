package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PixelRect {
    protected transient boolean a;
    private transient long b;

    public PixelRect(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    public static long g(PixelRect pixelRect) {
        if (pixelRect == null) {
            return 0L;
        }
        return pixelRect.b;
    }

    public final int a() {
        return GcamModuleJNI.PixelRect_x0_get(this.b, this);
    }

    public final int b() {
        return GcamModuleJNI.PixelRect_x1_get(this.b, this);
    }

    public final int c() {
        return GcamModuleJNI.PixelRect_y0_get(this.b, this);
    }

    public final int d() {
        return GcamModuleJNI.PixelRect_y1_get(this.b, this);
    }

    public final int e() {
        return GcamModuleJNI.PixelRect_height(this.b, this);
    }

    public final int f() {
        return GcamModuleJNI.PixelRect_width(this.b, this);
    }

    protected final void finalize() {
        h();
    }

    public final synchronized void h() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_PixelRect(j);
            }
            this.b = 0L;
        }
    }

    public final void i(int i) {
        GcamModuleJNI.PixelRect_x0_set(this.b, this, i);
    }

    public final void j(int i) {
        GcamModuleJNI.PixelRect_x1_set(this.b, this, i);
    }

    public final void k(int i) {
        GcamModuleJNI.PixelRect_y0_set(this.b, this, i);
    }

    public final void l(int i) {
        GcamModuleJNI.PixelRect_y1_set(this.b, this, i);
    }

    public PixelRect() {
        this(GcamModuleJNI.new_PixelRect(), true);
    }
}
