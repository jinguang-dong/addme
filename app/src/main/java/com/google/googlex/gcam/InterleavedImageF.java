package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InterleavedImageF {
    protected transient boolean a;
    private transient long b;

    public InterleavedImageF(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    public static long a(InterleavedImageF interleavedImageF) {
        if (interleavedImageF == null) {
            return 0L;
        }
        return interleavedImageF.b;
    }

    public final synchronized void b() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_InterleavedImageF(j);
            }
            this.b = 0L;
        }
    }

    protected final void finalize() {
        b();
    }

    public InterleavedImageF() {
        this(GcamModuleJNI.new_InterleavedImageF(), true);
    }
}
