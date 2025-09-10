package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gmz extends TimerTask {
    final /* synthetic */ gna a;

    public gmz(gna gnaVar) {
        this.a = gnaVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        gna gnaVar = this.a;
        gnaVar.b = false;
        gnaVar.a = true;
        gnaVar.c = gnaVar.e.a(gnaVar.d);
    }
}
