package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PixelRectVector {
    public transient long a;
    protected transient boolean b;

    public PixelRectVector(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final void a(PixelRect pixelRect) {
        GcamModuleJNI.PixelRectVector_add(this.a, this, PixelRect.g(pixelRect), pixelRect);
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_PixelRectVector(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }

    public PixelRectVector() {
        this(GcamModuleJNI.new_PixelRectVector__SWIG_0(), true);
    }
}
