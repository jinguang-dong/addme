package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgg extends TimerTask {
    public final /* synthetic */ lgh a;

    public lgg(lgh lghVar) {
        this.a = lghVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.a.b.execute(new lgc(this, 4));
    }
}
