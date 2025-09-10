package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HdrGainMapInfo {
    protected transient boolean a;
    private transient long b;

    public HdrGainMapInfo(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    public static long a(HdrGainMapInfo hdrGainMapInfo) {
        if (hdrGainMapInfo == null) {
            return 0L;
        }
        return hdrGainMapInfo.b;
    }

    public final synchronized void b() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_HdrGainMapInfo(j);
            }
            this.b = 0L;
        }
    }

    protected final void finalize() {
        b();
    }

    public HdrGainMapInfo() {
        this(GcamModuleJNI.new_HdrGainMapInfo(), true);
    }
}
