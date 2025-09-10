package defpackage;

import android.os.SystemClock;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijn implements paf {
    final /* synthetic */ llo a;
    final /* synthetic */ ijo b;
    final /* synthetic */ int c;

    public ijn(ijo ijoVar, llo lloVar, int i) {
        this.a = lloVar;
        this.c = i;
        this.b = ijoVar;
    }

    @Override // defpackage.paf
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a.e(this);
        ijo ijoVar = this.b;
        ijoVar.B = SystemClock.uptimeMillis();
        ijoVar.E.c();
        ijoVar.K.L(this.c, ijoVar.B - ijoVar.A, Math.max(ijoVar.z - ijoVar.y, 0L), ijoVar.a(), ((Boolean) ijoVar.f.dL()).booleanValue());
        Set set = ijoVar.j;
        synchronized (set) {
            set.remove(ijoVar.E.a());
        }
    }
}
