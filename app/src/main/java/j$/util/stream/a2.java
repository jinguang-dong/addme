package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class a2 implements Spliterator, Consumer {
    public final Spliterator a;
    public final boolean b;
    public final int c;
    public final long d;
    public final AtomicLong e;
    public Object f;

    public a2(Spliterator spliterator, long j, long j2) {
        this.a = spliterator;
        this.b = j2 < 0;
        this.d = j2 >= 0 ? j2 : 0L;
        this.c = 128;
        this.e = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    public final long a(long j) {
        AtomicLong atomicLong;
        long j2;
        boolean z;
        long jMin;
        do {
            atomicLong = this.e;
            j2 = atomicLong.get();
            z = this.b;
            if (j2 != 0) {
                jMin = Math.min(j2, j);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z) {
                    return j;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j2 - jMin));
        if (z) {
            return Math.max(j - jMin, 0L);
        }
        long j3 = this.d;
        return j2 > j3 ? Math.max(jMin - (j2 - j3), 0L) : jMin;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        H1 h1 = null;
        while (true) {
            b2 b2Var = this.e.get() > 0 ? b2.MAYBE_MORE : this.b ? b2.UNLIMITED : b2.NO_MORE;
            if (b2Var == b2.NO_MORE) {
                return;
            }
            b2 b2Var2 = b2.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (b2Var != b2Var2) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            int i = this.c;
            if (h1 == null) {
                h1 = new H1(i);
            } else {
                h1.a = 0;
            }
            long j = 0;
            while (spliterator.tryAdvance(h1)) {
                j++;
                if (j >= i) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            long jA = a(j);
            for (int i2 = 0; i2 < jA; i2++) {
                consumer.accept(h1.b[i2]);
            }
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        do {
            if ((this.e.get() > 0 ? b2.MAYBE_MORE : this.b ? b2.UNLIMITED : b2.NO_MORE) == b2.NO_MORE || !this.a.tryAdvance(this)) {
                return false;
            }
        } while (a(1L) != 1);
        consumer.accept(this.f);
        this.f = null;
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.e.get() == 0 || (spliteratorTrySplit = this.a.trySplit()) == null) {
            return null;
        }
        return new a2(spliteratorTrySplit, this);
    }

    public a2(Spliterator spliterator, a2 a2Var) {
        this.a = spliterator;
        this.b = a2Var.b;
        this.e = a2Var.e;
        this.d = a2Var.d;
        this.c = a2Var.c;
    }
}
