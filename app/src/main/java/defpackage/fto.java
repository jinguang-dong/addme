package defpackage;

import android.os.Process;
import com.google.android.apps.camera.async.tt.CpuSets;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fto {
    public static final sgv a = sgv.g("fto");
    private final tzj b;
    private Boolean c;

    public fto(tzj tzjVar) {
        this.b = tzjVar;
    }

    public final void a() {
        if (b()) {
            if (CpuSets.a(Process.myTid()) == null) {
                ((sgt) a.c().M(376)).v("Failed to cpuset-limit thread %s.", Thread.currentThread().getName());
            } else {
                Thread.currentThread().getName();
            }
        }
    }

    public final boolean b() {
        boolean zBooleanValue;
        paw.a(CpuSets.class, "gcastartup");
        synchronized (this) {
            if (this.c == null) {
                this.c = Boolean.valueOf(((hbj) this.b.a()).p(gzo.bh));
            }
            zBooleanValue = this.c.booleanValue();
        }
        return zBooleanValue;
    }
}
