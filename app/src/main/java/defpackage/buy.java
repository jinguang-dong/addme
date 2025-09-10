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
/* loaded from: classes.dex */
public final class buy implements List, j$.util.List, ukd {
    public final zo b = new zo(16);
    public final yw c = new yw(16);
    public int a = -1;

    public final int a() {
        return this.b.b;
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

    public final long b() {
        long jS = amo.s(Float.POSITIVE_INFINITY, false, false);
        int i = this.a + 1;
        int iBk = ske.bk(this);
        if (i <= iBk) {
            while (true) {
                yw ywVar = this.c;
                if (i < 0 || i >= ywVar.b) {
                    a.bn("Index must be between 0 and size");
                }
                long j = ywVar.a[i];
                if (but.a(j, jS) < 0) {
                    jS = j;
                }
                if ((Float.intBitsToFloat((int) (jS >> 32)) < 0.0f && but.c(jS)) || i == iBk) {
                    break;
                }
                i++;
            }
        }
        return jS;
    }

    @Override // java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final bij get(int i) {
        Object objC = this.b.c(i);
        objC.getClass();
        return (bij) objC;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a = -1;
        this.b.j();
        this.c.b = 0;
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

    public final void d(int i, int i2) {
        int i3;
        if (i >= i2) {
            return;
        }
        this.b.k(i, i2);
        yw ywVar = this.c;
        if (i < 0 || i > (i3 = ywVar.b) || i2 < 0 || i2 > i3) {
            a.bn("Index must be between 0 and size");
        }
        if (i2 < i) {
            a.bl("The end index must be < start index");
        }
        if (i2 != i) {
            int i4 = ywVar.b;
            if (i2 < i4) {
                long[] jArr = ywVar.a;
                rnt.ax(jArr, jArr, i, i2, i4);
            }
            ywVar.b -= i2 - i;
        }
    }

    public final boolean e(float f, boolean z) {
        if (this.a == ske.bk(this)) {
            return true;
        }
        return but.a(b(), amo.s(f, z, false)) > 0;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof bij)) {
            return -1;
        }
        bij bijVar = (bij) obj;
        int iBk = ske.bk(this);
        if (iBk < 0) {
            return -1;
        }
        int i = 0;
        while (!a.ao(this.b.c(i), bijVar)) {
            if (i == iBk) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.b.f();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new buw(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof bij)) {
            return -1;
        }
        bij bijVar = (bij) obj;
        for (int iBk = ske.bk(this); iBk >= 0; iBk--) {
            if (a.ao(this.b.c(iBk), bijVar)) {
                return iBk;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new buw(this, 0, 7);
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
        return new bux(this, i, i2);
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
        return new buw(this, i, 6);
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
