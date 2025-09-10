package j$.util.stream;

import j$.util.Collection;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
public final class X implements T {
    public final Collection a;

    public X(Collection collection) {
        this.a = collection;
    }

    @Override // j$.util.stream.T
    public final T a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.T
    public final long count() {
        return this.a.size();
    }

    @Override // j$.util.stream.T
    public final void forEach(Consumer consumer) {
        Collection.EL.a(this.a, consumer);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ T l(long j, long j2, IntFunction intFunction) {
        return L0.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.T
    public final void m(Object[] objArr, int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // j$.util.stream.T
    public final Object[] q(IntFunction intFunction) {
        java.util.Collection collection = this.a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.T
    public final Spliterator spliterator() {
        return Collection.EL.stream(this.a).spliterator();
    }

    public final String toString() {
        java.util.Collection collection = this.a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ int u() {
        return 0;
    }
}
