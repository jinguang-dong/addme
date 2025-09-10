package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hrm implements pon {
    public pas a;
    private final Executor c;
    private paq e;
    private rwc f;
    private rwc d = rvk.a;
    private paq g = new fhf(11);
    private final AtomicInteger h = new AtomicInteger(0);
    private final AtomicInteger i = new AtomicInteger(0);
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());

    public hrm(Executor executor) {
        this.c = executor;
    }

    public final synchronized paq a(pas pasVar, final rwc rwcVar, rwc rwcVar2, final rwc rwcVar3) {
        paq paqVar;
        paq paqVar2 = this.g;
        if (paqVar2 != null) {
            paqVar2.close();
        }
        this.a = pasVar;
        this.d = rwcVar;
        this.f = rwcVar2;
        this.e = ((hsb) ((rwg) rwcVar2).a).b(this, this.c);
        ((hpj) ((rwg) rwcVar3).a).i("palmtimer-metadata");
        final int iIncrementAndGet = this.h.incrementAndGet();
        paqVar = new paq() { // from class: hrl
            @Override // defpackage.paq, java.lang.AutoCloseable
            public final void close() {
                this.a.b(rwcVar, rwcVar3, iIncrementAndGet);
            }
        };
        this.g = paqVar;
        return paqVar;
    }

    public final synchronized void b(rwc rwcVar, rwc rwcVar2, int i) {
        AtomicInteger atomicInteger = this.i;
        if (i > atomicInteger.get()) {
            atomicInteger.set(i);
            if (this.d.h() && this.d.c() == ((rwg) rwcVar).a) {
                this.d = rvk.a;
            }
            ((hpj) ((rwg) rwcVar2).a).j("palmtimer-metadata");
            paq paqVar = this.e;
            if (paqVar != null) {
                paqVar.close();
            }
        }
    }

    public final synchronized void d() {
        ((hsb) ((rwg) this.f).a).a();
    }

    @Override // defpackage.pon
    public final void eS() {
    }
}
