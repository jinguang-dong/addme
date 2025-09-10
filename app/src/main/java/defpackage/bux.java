package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bux implements List, j$.util.List, ukd {
    final /* synthetic */ buy a;
    private final int b;
    private final int c;

    public bux(buy buyVar, int i, int i2) {
        this.a = buyVar;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.c - this.b;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        a.h();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return a.l();
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        a.i();
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        a.i();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        a.a();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        return (obj instanceof bij) && indexOf((bij) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((bij) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        Object objC = this.a.b.c(i + this.b);
        objC.getClass();
        return (bij) objC;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof bij)) {
            return -1;
        }
        bij bijVar = (bij) obj;
        int i = this.b;
        int i2 = this.c;
        if (i <= i2) {
            int i3 = i;
            while (!a.ao(this.a.b.c(i3), bijVar)) {
                if (i3 != i2) {
                    i3++;
                }
            }
            return i3 - i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return a() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.c;
        buy buyVar = this.a;
        int i2 = this.b;
        return new buw(buyVar, i2, i2, i);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof bij)) {
            return -1;
        }
        bij bijVar = (bij) obj;
        int i = this.c;
        int i2 = this.b;
        if (i2 <= i) {
            while (!a.ao(this.a.b.c(i), bijVar)) {
                if (i != i2) {
                    i--;
                }
            }
            return i - i2;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i = this.c;
        buy buyVar = this.a;
        int i2 = this.b;
        return new buw(buyVar, i2, i2, i);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        return a.e();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return a.c();
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        return a.f();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        return a.f();
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        a.j();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        return a.c();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return a.g();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        a.k();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        int i3 = this.b;
        return new bux(this.a, i + i3, i3 + i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ujj.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return a.b();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        return a.c();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.b;
        return new buw(this.a, i + i2, i2, this.c);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return a.b();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ujj.b(this, objArr);
    }
}
