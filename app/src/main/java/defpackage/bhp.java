package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bhp implements List, uke {
    public int a;
    private final bgz b;
    private final int c;
    private int d;

    public bhp(bgz bgzVar, int i, int i2) {
        this.b = bgzVar;
        this.c = i;
        this.d = bgzVar.b();
        this.a = i2 - i;
    }

    private final void b() {
        if (this.b.b() != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object a(int i) {
        b();
        bgz bgzVar = this.b;
        Object objF = bgzVar.f(this.c + i);
        this.a--;
        this.d = bgzVar.b();
        return objF;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        bgz bgzVar = this.b;
        bgzVar.add(this.c + i, obj);
        this.a++;
        this.d = bgzVar.b();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        bgz bgzVar = this.b;
        boolean zAddAll = bgzVar.addAll(i + this.c, collection);
        if (zAddAll) {
            this.a += collection.size();
            this.d = bgzVar.b();
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.a > 0) {
            b();
            bgz bgzVar = this.b;
            int i = this.c;
            bgzVar.h(i, this.a + i);
            this.a = 0;
            this.d = bgzVar.b();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        bha.a(i, this.a);
        return this.b.get(this.c + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i = this.c;
        ugd it = ukc.u(i, this.a + i).iterator();
        while (((uku) it).a) {
            int iA = it.a();
            if (a.ao(obj, this.b.get(iA))) {
                return iA - i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i = this.c;
        for (int i2 = (this.a + i) - 1; i2 >= i; i2--) {
            if (a.ao(obj, this.b.get(i2))) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        return a(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        bdw bdwVar;
        bgj bgjVarB;
        boolean zI;
        b();
        int i2 = this.c;
        int i3 = this.a + i2;
        bgz bgzVar = this.b;
        int iA = bgzVar.a();
        do {
            synchronized (bha.a) {
                bhn bhnVar = bgzVar.a;
                bhnVar.getClass();
                bgy bgyVar = (bgy) bgr.e(bhnVar);
                i = bgyVar.b;
                bdwVar = bgyVar.a;
            }
            bdwVar.getClass();
            bed bedVarJ = bdwVar.j();
            bedVarJ.subList(i2, i3).retainAll(collection);
            bdw bdwVarC = bedVarJ.c();
            if (a.ao(bdwVarC, bdwVar)) {
                break;
            }
            bhn bhnVar2 = bgzVar.a;
            bhnVar2.getClass();
            synchronized (bgr.b) {
                bgjVarB = bgr.b();
                zI = bgz.i((bgy) bgr.l(bhnVar2, bgzVar, bgjVarB), i, bdwVarC, true);
            }
            bgr.t(bgjVarB, bgzVar);
        } while (!zI);
        int iA2 = iA - bgzVar.a();
        if (iA2 > 0) {
            this.d = this.b.b();
            this.a -= iA2;
        }
        return iA2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        bha.a(i, this.a);
        b();
        bgz bgzVar = this.b;
        Object obj2 = bgzVar.set(i + this.c, obj);
        this.d = bgzVar.b();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.a) {
            bad.a("fromIndex or toIndex are out of bounds");
        }
        b();
        bgz bgzVar = this.b;
        int i3 = this.c;
        return new bhp(bgzVar, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ujj.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        ujy ujyVar = new ujy();
        ujyVar.a = i - 1;
        return new bho(ujyVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        a(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ujj.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i = this.c + this.a;
        bgz bgzVar = this.b;
        bgzVar.add(i, obj);
        this.a++;
        this.d = bgzVar.b();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.a, collection);
    }
}
