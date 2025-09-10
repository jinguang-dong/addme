package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lpg extends TimerTask {
    final /* synthetic */ int a;
    final /* synthetic */ lpb b;

    public lpg(lpb lpbVar, int i) {
        this.a = i;
        this.b = lpbVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        lpb lpbVar = this.b;
        lpbVar.b.c(this.a, true);
        synchronized (lpbVar) {
            lpbVar.a = null;
        }
    }
}
