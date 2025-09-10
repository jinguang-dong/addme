package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public abstract class F0 extends CountedCompleter implements InterfaceC0079k1 {
    public final Spliterator a;
    public final AbstractC0047a b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public F0(Spliterator spliterator, AbstractC0047a abstractC0047a, int i) {
        this.a = spliterator;
        this.b = abstractC0047a;
        this.c = AbstractC0056d.d(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    public abstract F0 a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        L0.c();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final void c(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        F0 f0A = this;
        while (spliterator.estimateSize() > f0A.c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            f0A.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            F0 f0 = f0A;
            f0.a(spliteratorTrySplit, f0A.d, jEstimateSize).fork();
            f0A = f0.a(spliterator, f0.d + jEstimateSize, f0.e - jEstimateSize);
        }
        F0 f02 = f0A;
        f02.b.r(spliterator, f02);
        f02.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void end() {
    }

    public /* synthetic */ void accept(int i) {
        L0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        L0.l();
        throw null;
    }

    public F0(F0 f0, Spliterator spliterator, long j, long j2, int i) {
        super(f0);
        this.a = spliterator;
        this.b = f0.b;
        this.c = f0.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }
}
