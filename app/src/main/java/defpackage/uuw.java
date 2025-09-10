package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uuw extends umd {
    public final uuv b;

    public uuw(uhf uhfVar) {
        super(uhfVar, true);
        this.b = new uuv(this);
    }

    @Override // defpackage.umd
    protected final void fT(Throwable th, boolean z) {
        uuv uuvVar = this.b;
        if (th instanceof CancellationException) {
            uuvVar.a.e(new uuu((CancellationException) th));
        } else if (uuvVar.a.a(th)) {
            uuvVar.b = true;
        }
    }

    @Override // defpackage.umd
    protected final void fU(Object obj) {
        this.b.a.e(obj);
    }
}
