package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phq implements pnx {
    public final qc a;
    private final ues b = new uez(new dus(this, 12));

    public phq(qc qcVar) {
        this.a = qcVar;
    }

    @Override // defpackage.pnx
    public final Object a(CaptureResult.Key key) {
        key.getClass();
        return this.a.b(key);
    }

    @Override // defpackage.pnx
    public final String b() {
        return ((rw) this.a).b;
    }

    @Override // defpackage.pnx
    public final long d() {
        return this.a.a();
    }

    @Override // defpackage.pnx
    public final pnw e() {
        throw null;
    }

    @Override // defpackage.pnx
    public final int ew() {
        return ((CaptureResult) this.b.a()).getSequenceId();
    }

    @Override // defpackage.pnt
    public final Object ex(Class cls) {
        throw null;
    }

    @Override // defpackage.pnx
    public final List f() {
        throw null;
    }
}
