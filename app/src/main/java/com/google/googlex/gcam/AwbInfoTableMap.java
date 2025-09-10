package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AwbInfoTableMap {
    public transient long a;
    protected transient boolean b;

    public AwbInfoTableMap() {
        long jNew_AwbInfoTableMap__SWIG_0 = GcamModuleJNI.new_AwbInfoTableMap__SWIG_0();
        this.b = true;
        this.a = jNew_AwbInfoTableMap__SWIG_0;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_AwbInfoTableMap(j);
            }
            this.a = 0L;
        }
    }

    public final void b(short s, AwbInfo awbInfo) {
        GcamModuleJNI.AwbInfoTableMap_set(this.a, this, s, AwbInfo.a(awbInfo), awbInfo);
    }

    protected final void finalize() {
        a();
    }
}
