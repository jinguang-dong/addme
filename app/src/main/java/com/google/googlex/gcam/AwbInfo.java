package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AwbInfo {
    public transient long a;
    protected transient boolean b;

    public AwbInfo(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long a(AwbInfo awbInfo) {
        if (awbInfo == null) {
            return 0L;
        }
        return awbInfo.a;
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_AwbInfo(j);
            }
            this.a = 0L;
        }
    }

    public final void c(FloatArray9 floatArray9) {
        GcamModuleJNI.AwbInfo_rgb2rgb_set(this.a, this, floatArray9.a, floatArray9);
    }

    public final void d(FloatArray4 floatArray4) {
        GcamModuleJNI.AwbInfo_rggb_gains_set(this.a, this, floatArray4.a, floatArray4);
    }

    protected final void finalize() {
        b();
    }

    public AwbInfo() {
        this(GcamModuleJNI.new_AwbInfo__SWIG_0(), true);
    }
}
