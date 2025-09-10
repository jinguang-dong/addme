package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0056d extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    public final AbstractC0047a a;
    public Spliterator b;
    public long c;
    public AbstractC0056d d;
    public AbstractC0056d e;
    public Object f;

    public AbstractC0056d(AbstractC0047a abstractC0047a, Spliterator spliterator) {
        super(null);
        this.a = abstractC0047a;
        this.b = spliterator;
        this.c = 0L;
    }

    public static long d(long j) {
        long j2 = j / g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    public abstract Object a();

    public abstract AbstractC0056d b(Spliterator spliterator);

    public void c(Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jD = this.c;
        if (jD == 0) {
            jD = d(jEstimateSize);
            this.c = jD;
        }
        boolean z = false;
        AbstractC0056d abstractC0056d = this;
        while (jEstimateSize > jD && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC0056d abstractC0056dB = abstractC0056d.b(spliteratorTrySplit);
            abstractC0056d.d = abstractC0056dB;
            AbstractC0056d abstractC0056dB2 = abstractC0056d.b(spliterator);
            abstractC0056d.e = abstractC0056dB2;
            abstractC0056d.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC0056d = abstractC0056dB;
                abstractC0056dB = abstractC0056dB2;
            } else {
                abstractC0056d = abstractC0056dB2;
            }
            z = !z;
            abstractC0056dB.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC0056d.c(abstractC0056d.a());
        abstractC0056d.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public AbstractC0056d(AbstractC0056d abstractC0056d, Spliterator spliterator) {
        super(abstractC0056d);
        this.b = spliterator;
        this.a = abstractC0056d.a;
        this.c = abstractC0056d.c;
    }
}
