package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rqx extends rqt {
    final /* synthetic */ rrc a;

    public rqx(rrc rrcVar) {
        this.a = rrcVar;
    }

    @Override // defpackage.rqt
    public final void a() {
        rrc rrcVar = this.a;
        synchronized (rrcVar.e) {
            AtomicInteger atomicInteger = rrcVar.j;
            if (atomicInteger.get() <= 0 || atomicInteger.decrementAndGet() <= 0) {
                if (rrcVar.l != null) {
                    rrcVar.a.unbindService(rrcVar.k);
                    rrcVar.f = false;
                    rrcVar.l = null;
                    rrcVar.k = null;
                }
                rrcVar.b();
            }
        }
    }
}
