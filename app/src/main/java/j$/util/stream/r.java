package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes3.dex */
public final class r extends CountedCompleter {
    public final AbstractC0047a a;
    public Spliterator b;
    public final long c;
    public final ConcurrentHashMap d;
    public final C0095q e;
    public final r f;
    public T g;

    public r(AbstractC0047a abstractC0047a, Spliterator spliterator, C0095q c0095q) {
        super(null);
        this.a = abstractC0047a;
        this.b = spliterator;
        this.c = AbstractC0056d.d(spliterator.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, AbstractC0056d.g << 1), 0.75f, 1);
        this.e = c0095q;
        this.f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long j = this.c;
        boolean z = false;
        r rVar = this;
        while (spliterator.estimateSize() > j && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            r rVar2 = new r(rVar, spliteratorTrySplit, rVar.f);
            r rVar3 = new r(rVar, spliterator, rVar2);
            rVar.addToPendingCount(1);
            rVar3.addToPendingCount(1);
            rVar.d.put(rVar2, rVar3);
            if (rVar.f != null) {
                rVar2.addToPendingCount(1);
                if (rVar.d.replace(rVar.f, rVar, rVar2)) {
                    rVar.addToPendingCount(-1);
                } else {
                    rVar2.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = spliteratorTrySplit;
                rVar = rVar2;
                rVar2 = rVar3;
            } else {
                rVar = rVar3;
            }
            z = !z;
            rVar2.fork();
        }
        if (rVar.getPendingCount() > 0) {
            C0077k c0077k = new C0077k(5);
            AbstractC0047a abstractC0047a = rVar.a;
            K kJ = abstractC0047a.j(abstractC0047a.f(spliterator), c0077k);
            rVar.a.r(spliterator, kJ);
            rVar.g = kJ.build();
            rVar.b = null;
        }
        rVar.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        T t = this.g;
        if (t != null) {
            t.forEach(this.e);
            this.g = null;
        } else {
            Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.r(spliterator, this.e);
                this.b = null;
            }
        }
        r rVar = (r) this.d.remove(this);
        if (rVar != null) {
            rVar.tryComplete();
        }
    }

    public r(r rVar, Spliterator spliterator, r rVar2) {
        super(rVar);
        this.a = rVar.a;
        this.b = spliterator;
        this.c = rVar.c;
        this.d = rVar.d;
        this.e = rVar.e;
        this.f = rVar2;
    }
}
