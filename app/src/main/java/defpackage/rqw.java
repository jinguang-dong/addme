package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rqw extends rqt {
    final /* synthetic */ rqt a;
    final /* synthetic */ rrc b;
    final /* synthetic */ pfl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqw(rrc rrcVar, pfl pflVar, pfl pflVar2, rqt rqtVar) {
        super(pflVar);
        this.c = pflVar2;
        this.a = rqtVar;
        this.b = rrcVar;
    }

    @Override // defpackage.rqt
    public final void a() {
        final rrc rrcVar = this.b;
        synchronized (rrcVar.e) {
            final pfl pflVar = this.c;
            rrcVar.d.add(pflVar);
            ((oor) pflVar.a).h(new oom() { // from class: rqv
                @Override // defpackage.oom
                public final void a(oor oorVar) {
                    pfl pflVar2 = pflVar;
                    rrc rrcVar2 = rrcVar;
                    synchronized (rrcVar2.e) {
                        rrcVar2.d.remove(pflVar2);
                    }
                }
            });
            rrcVar.j.getAndIncrement();
            rqt rqtVar = this.a;
            if (rrcVar.l == null && !rrcVar.f) {
                List list = rrcVar.c;
                list.add(rqtVar);
                rrcVar.k = new rrb(rrcVar, 0);
                rrcVar.f = true;
                if (!rrcVar.a.bindService(rrcVar.g, rrcVar.k, 1)) {
                    rrcVar.f = false;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((rqt) it.next()).b(new rrd());
                    }
                    list.clear();
                }
            } else if (rrcVar.f) {
                rrcVar.c.add(rqtVar);
            } else {
                rqtVar.run();
            }
        }
    }
}
