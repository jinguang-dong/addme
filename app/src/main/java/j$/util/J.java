package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class J implements L {
    public final /* synthetic */ Spliterator.OfPrimitive a;

    public /* synthetic */ J(Spliterator.OfPrimitive ofPrimitive) {
        this.a = ofPrimitive;
    }

    public static /* synthetic */ L a(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        if (ofPrimitive instanceof K) {
            return ((K) ofPrimitive).a;
        }
        if (F.t(ofPrimitive)) {
            Spliterator.OfDouble ofDoubleC = F.c(ofPrimitive);
            if (ofDoubleC == null) {
                return null;
            }
            return ofDoubleC instanceof B ? ((B) ofDoubleC).a : new A(ofDoubleC);
        }
        if (F.A(ofPrimitive)) {
            Spliterator.OfInt ofIntD = F.d(ofPrimitive);
            if (ofIntD == null) {
                return null;
            }
            return ofIntD instanceof E ? ((E) ofIntD).a : new D(ofIntD);
        }
        if (!F.C(ofPrimitive)) {
            return new J(ofPrimitive);
        }
        Spliterator.OfLong ofLongE = F.e(ofPrimitive);
        if (ofLongE == null) {
            return null;
        }
        return ofLongE instanceof H ? ((H) ofLongE).a : new G(ofLongE);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfPrimitive ofPrimitive = this.a;
        if (obj instanceof J) {
            obj = ((J) obj).a;
        }
        return ofPrimitive.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.L
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((Spliterator.OfPrimitive) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.L
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.a.tryAdvance((Spliterator.OfPrimitive) obj);
    }

    @Override // j$.util.L, j$.util.Spliterator
    public final /* synthetic */ L trySplit() {
        return a(this.a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return M.a(this.a.trySplit());
    }
}
