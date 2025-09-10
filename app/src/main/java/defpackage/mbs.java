package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mbs extends TimerTask {
    final /* synthetic */ mbu a;

    public mbs(mbu mbuVar) {
        this.a = mbuVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        mbu mbuVar = this.a;
        mbuVar.b = true;
        mbuVar.a.cancel();
    }
}
