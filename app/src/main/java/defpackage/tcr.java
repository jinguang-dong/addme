package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tcr {
    public transient long a;
    protected transient boolean b;

    public tcr(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    static /* synthetic */ String b(int i, Class cls) {
        return "No enum " + cls.toString() + " with value " + i;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_PortraitBrighteningProcessor(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }

    public tcr() {
        this(GcamModuleJNI.new_PortraitBrighteningProcessor(), true);
    }
}
