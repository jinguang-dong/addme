package defpackage;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class smw extends Spliterators.AbstractSpliterator {
    final /* synthetic */ BiFunction a;
    final /* synthetic */ smx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smw(smx smxVar, long j, BiFunction biFunction) {
        super(j, 16);
        this.a = biFunction;
        this.b = smxVar;
    }

    @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Spliterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        smx smxVar = this.b;
        if (!smxVar.a()) {
            return false;
        }
        consumer.accept(this.a.apply(smxVar.a.a, smxVar.b.a));
        return true;
    }
}
