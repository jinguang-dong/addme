package defpackage;

import android.os.Trace;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pt {
    private final int a = pu.a.b();
    private final kyz b;

    public pt(kyz kyzVar) {
        this.b = kyzVar;
    }

    public final void a(int i) {
        rnn rnnVar = (rnn) this.b.t.a();
        synchronized (rnnVar.d) {
            int iE = rnnVar.e();
            rnnVar.a = i;
            rnnVar.g(new pb(iE));
        }
    }

    public final vp b(pl plVar) {
        String strA = pp.a(plVar.a);
        Objects.toString(strA);
        try {
            Trace.beginSection("CXCP#CameraGraph-".concat(strA));
            return (vp) new kgu((kyz) this.b.w, new ocq(plVar, (byte[]) null)).n.a();
        } finally {
            Trace.endSection();
        }
    }

    public final ocq c() {
        return (ocq) this.b.r.a();
    }

    public final String toString() {
        return "CameraPipe-" + this.a;
    }
}
