package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0050b extends AbstractC0056d {
    public final AtomicReference h;
    public volatile boolean i;

    public AbstractC0050b(AbstractC0047a abstractC0047a, Spliterator spliterator) {
        super(abstractC0047a, spliterator);
        this.h = new AtomicReference(null);
    }

    @Override // j$.util.stream.AbstractC0056d
    public final void c(Object obj) {
        if (((AbstractC0056d) getCompleter()) != null) {
            this.f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC0056d, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objG;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jD = this.c;
        if (jD == 0) {
            jD = AbstractC0056d.d(jEstimateSize);
            this.c = jD;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        AbstractC0050b abstractC0050b = this;
        while (true) {
            objG = atomicReference.get();
            if (objG != null) {
                break;
            }
            boolean z2 = abstractC0050b.i;
            if (!z2) {
                CountedCompleter completer = abstractC0050b.getCompleter();
                while (true) {
                    AbstractC0050b abstractC0050b2 = (AbstractC0050b) ((AbstractC0056d) completer);
                    if (z2 || abstractC0050b2 == null) {
                        break;
                    }
                    z2 = abstractC0050b2.i;
                    completer = abstractC0050b2.getCompleter();
                }
            }
            if (z2) {
                objG = abstractC0050b.g();
                break;
            }
            if (jEstimateSize <= jD || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC0050b abstractC0050b3 = (AbstractC0050b) abstractC0050b.b(spliteratorTrySplit);
            abstractC0050b.d = abstractC0050b3;
            AbstractC0050b abstractC0050b4 = (AbstractC0050b) abstractC0050b.b(spliterator);
            abstractC0050b.e = abstractC0050b4;
            abstractC0050b.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC0050b = abstractC0050b3;
                abstractC0050b3 = abstractC0050b4;
            } else {
                abstractC0050b = abstractC0050b4;
            }
            z = !z;
            abstractC0050b3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        objG = abstractC0050b.a();
        abstractC0050b.c(objG);
        abstractC0050b.tryComplete();
    }

    public void e() {
        this.i = true;
    }

    public final void f() {
        AbstractC0050b abstractC0050b = this;
        for (AbstractC0050b abstractC0050b2 = (AbstractC0050b) ((AbstractC0056d) getCompleter()); abstractC0050b2 != null; abstractC0050b2 = (AbstractC0050b) ((AbstractC0056d) abstractC0050b2.getCompleter())) {
            if (abstractC0050b2.d == abstractC0050b) {
                AbstractC0050b abstractC0050b3 = (AbstractC0050b) abstractC0050b2.e;
                if (!abstractC0050b3.i) {
                    abstractC0050b3.e();
                }
            }
            abstractC0050b = abstractC0050b2;
        }
    }

    public abstract Object g();

    @Override // j$.util.stream.AbstractC0056d, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return h();
    }

    public final Object h() {
        if (((AbstractC0056d) getCompleter()) != null) {
            return this.f;
        }
        Object obj = this.h.get();
        return obj == null ? g() : obj;
    }

    public AbstractC0050b(AbstractC0050b abstractC0050b, Spliterator spliterator) {
        super(abstractC0050b, spliterator);
        this.h = abstractC0050b.h;
    }
}
