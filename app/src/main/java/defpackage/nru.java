package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nru extends TimerTask {
    final /* synthetic */ nrv a;

    public nru(nrv nrvVar) {
        this.a = nrvVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        bm bmVar = this.a.D;
        if (bmVar instanceof bb) {
            bmVar.getClass();
            ((bb) bmVar).e(true, false);
        }
    }
}
