package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AwbInfoTable {
    protected transient boolean a;
    private transient long b;

    public AwbInfoTable(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    public final synchronized void a() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_AwbInfoTable(j);
            }
            this.b = 0L;
        }
    }

    public final void b(AwbInfoTableMap awbInfoTableMap) {
        GcamModuleJNI.AwbInfoTable_awb_infos_set(this.b, this, awbInfoTableMap.a, awbInfoTableMap);
    }

    protected final void finalize() {
        a();
    }

    public AwbInfoTable() {
        this(GcamModuleJNI.new_AwbInfoTable__SWIG_0(), true);
    }
}
