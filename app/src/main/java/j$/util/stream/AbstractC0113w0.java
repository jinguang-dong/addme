package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* renamed from: j$.util.stream.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0113w0 implements Spliterator {
    public T a;
    public int b;
    public Spliterator c;
    public Spliterator d;
    public ArrayDeque e;

    public AbstractC0113w0(T t) {
        this.a = t;
    }

    public static T a(ArrayDeque arrayDeque) {
        while (true) {
            T t = (T) arrayDeque.pollFirst();
            if (t == null) {
                return null;
            }
            if (t.u() != 0) {
                for (int iU = t.u() - 1; iU >= 0; iU--) {
                    arrayDeque.addFirst(t.a(iU));
                }
            } else if (t.count() > 0) {
                return t;
            }
        }
    }

    public final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iU = this.a.u();
        while (true) {
            iU--;
            if (iU < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.a(iU));
        }
    }

    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            this.d = spliterator;
            return true;
        }
        ArrayDeque arrayDequeB = b();
        this.e = arrayDequeB;
        T tA = a(arrayDequeB);
        if (tA != null) {
            this.d = tA.spliterator();
            return true;
        }
        this.a = null;
        return false;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.u(); i++) {
            jCount += this.a.a(i).count();
        }
        return jCount;
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
    public final Spliterator trySplit() {
        T t = this.a;
        if (t == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < t.u() - 1) {
            T t2 = this.a;
            int i = this.b;
            this.b = i + 1;
            return t2.a(i).spliterator();
        }
        T tA = this.a.a(this.b);
        this.a = tA;
        if (tA.u() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        T t3 = this.a;
        this.b = 1;
        return t3.a(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.L trySplit() {
        return (j$.util.L) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.I trySplit() {
        return (j$.util.I) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.C trySplit() {
        return (j$.util.C) trySplit();
    }
}
