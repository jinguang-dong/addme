package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jya extends TimerTask {
    public final /* synthetic */ jyb a;

    public jya(jyb jybVar) {
        this.a = jybVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.a.d.execute(new jxr(this, 4));
    }
}
