package j$.util;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class K implements Spliterator.OfPrimitive {
    public final /* synthetic */ L a;

    public /* synthetic */ K(L l) {
        this.a = l;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(L l) {
        if (l == null) {
            return null;
        }
        if (l instanceof J) {
            return ((J) l).a;
        }
        if (l instanceof C) {
            C c = (C) l;
            return c instanceof A ? ((A) c).a : new B(c);
        }
        if (l instanceof Spliterator.OfInt) {
            Spliterator.OfInt ofInt = (Spliterator.OfInt) l;
            return ofInt instanceof D ? ((D) ofInt).a : new E(ofInt);
        }
        if (!(l instanceof I)) {
            return new K(l);
        }
        I i = (I) l;
        return i instanceof G ? ((G) i).a : new H(i);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        L l = this.a;
        if (obj instanceof K) {
            obj = ((K) obj).a;
        }
        return l.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return a(this.a.trySplit());
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return N.a(this.a.trySplit());
    }
}
