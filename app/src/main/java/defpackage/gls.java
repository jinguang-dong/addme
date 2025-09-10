package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gls extends TimerTask {
    public final /* synthetic */ glt a;

    public gls(glt gltVar) {
        this.a = gltVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.a.a.execute(new gku(this, 9));
    }
}
