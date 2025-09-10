package j$.util;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final class P implements Iterator, IntConsumer, InterfaceC0126v {
    public boolean a = false;
    public int b;
    public final /* synthetic */ Spliterator.OfInt c;

    public P(Spliterator.OfInt ofInt) {
        this.c = ofInt;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.Iterator, j$.util.InterfaceC0126v
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            IntConsumer intConsumer = (IntConsumer) consumer;
            intConsumer.getClass();
            while (hasNext()) {
                if (!this.a && !hasNext()) {
                    throw new NoSuchElementException();
                }
                this.a = false;
                intConsumer.accept(this.b);
            }
            return;
        }
        consumer.getClass();
        if (g0.a) {
            g0.a(P.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        C0128x c0128x = new C0128x(consumer, 0);
        while (hasNext()) {
            if (!this.a && !hasNext()) {
                throw new NoSuchElementException();
            }
            this.a = false;
            c0128x.accept(this.b);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((IntConsumer) this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (g0.a) {
            g0.a(P.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return Integer.valueOf(this.b);
    }
}
