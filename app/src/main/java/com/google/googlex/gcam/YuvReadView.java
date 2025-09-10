package com.google.googlex.gcam;

import defpackage.tdd;

/* compiled from: PG */
/* loaded from: classes.dex */
public class YuvReadView {
    public transient long a;
    protected transient boolean b;

    public YuvReadView(long j) {
        this.b = true;
        this.a = j;
    }

    public final int a() {
        return GcamModuleJNI.YuvReadView_height(this.a, this);
    }

    public final int b() {
        return GcamModuleJNI.YuvReadView_width(this.a, this);
    }

    public final tdd c() {
        return tdd.a(GcamModuleJNI.YuvReadView_yuv_format(this.a, this));
    }

    public final synchronized void d() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_YuvReadView(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        d();
    }

    public YuvReadView() {
        this(GcamModuleJNI.new_YuvReadViewBase__SWIG_0());
    }

    public YuvReadView(YuvReadView yuvReadView) {
        this(GcamModuleJNI.new_YuvReadViewBase__SWIG_1(yuvReadView.a, yuvReadView));
    }
}
