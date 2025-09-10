package com.google.googlex.gcam;

import defpackage.tdd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class YuvWriteView {
    public transient long b;
    protected transient boolean c;

    public YuvWriteView(long j) {
        this.c = true;
        this.b = j;
    }

    public static long c(YuvWriteView yuvWriteView) {
        if (yuvWriteView == null) {
            return 0L;
        }
        return yuvWriteView.b;
    }

    public final int a() {
        return GcamModuleJNI.YuvWriteView_height(this.b, this);
    }

    public final int b() {
        return GcamModuleJNI.YuvWriteView_width(this.b, this);
    }

    public final tdd d() {
        return tdd.a(GcamModuleJNI.YuvWriteView_yuv_format(this.b, this));
    }

    public final synchronized void e() {
        long j = this.b;
        if (j != 0) {
            if (this.c) {
                this.c = false;
                GcamModuleJNI.delete_YuvWriteView(j);
            }
            this.b = 0L;
        }
    }

    protected final void finalize() {
        e();
    }

    public YuvWriteView() {
        this(GcamModuleJNI.new_YuvWriteViewBase__SWIG_0());
    }
}
