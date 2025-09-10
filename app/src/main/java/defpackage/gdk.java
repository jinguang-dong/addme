package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gdk extends TimerTask {
    public final /* synthetic */ gdm a;

    public gdk(gdm gdmVar) {
        this.a = gdmVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        gdm gdmVar = this.a;
        if (gdmVar.d.a) {
            gdmVar.c.execute(new gba(this, 9));
        }
    }
}
