package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0107u0 extends AbstractC0113w0 implements j$.util.L {
    @Override // j$.util.L
    public final void forEachRemaining(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(obj)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            ((j$.util.L) spliterator).forEachRemaining(obj);
            return;
        }
        ArrayDeque arrayDequeB = b();
        while (true) {
            S s = (S) AbstractC0113w0.a(arrayDequeB);
            if (s == null) {
                this.a = null;
                return;
            }
            s.h(obj);
        }
    }

    @Override // j$.util.L
    public final boolean tryAdvance(Object obj) {
        S s;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((j$.util.L) this.d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.c == null && (s = (S) AbstractC0113w0.a(this.e)) != null) {
                j$.util.L lSpliterator = s.spliterator();
                this.d = lSpliterator;
                return lSpliterator.tryAdvance(obj);
            }
            this.a = null;
        }
        return zTryAdvance;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }
}
