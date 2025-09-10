package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgz implements List, RandomAccess, bhl, uke {
    public bhn a;

    public bgz() {
        beh behVar = beh.a;
        bgj bgjVarB = bgr.b();
        bgy bgyVar = new bgy(bgjVarB.v(), behVar);
        if (!(bgjVarB instanceof bge)) {
            bgyVar.h = new bgy(1L, behVar);
        }
        this.a = bgyVar;
    }

    public static final boolean i(bgy bgyVar, int i, bdw bdwVar, boolean z) {
        boolean z2;
        synchronized (bha.a) {
            int i2 = bgyVar.b;
            if (i2 == i) {
                bgyVar.a = bdwVar;
                z2 = true;
                if (z) {
                    bgyVar.c++;
                }
                bgyVar.b = i2 + 1;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    private final boolean j(uiq uiqVar) {
        int i;
        bdw bdwVar;
        Object objA;
        bgj bgjVarB;
        boolean zI;
        do {
            synchronized (bha.a) {
                bhn bhnVar = this.a;
                bhnVar.getClass();
                bgy bgyVar = (bgy) bgr.e(bhnVar);
                i = bgyVar.b;
                bdwVar = bgyVar.a;
            }
            bdwVar.getClass();
            bed bedVarJ = bdwVar.j();
            objA = uiqVar.a(bedVarJ);
            bdw bdwVarC = bedVarJ.c();
            if (a.ao(bdwVarC, bdwVar)) {
                break;
            }
            bhn bhnVar2 = this.a;
            bhnVar2.getClass();
            synchronized (bgr.b) {
                bgjVarB = bgr.b();
                zI = i((bgy) bgr.l(bhnVar2, this, bgjVarB), i, bdwVarC, true);
            }
            bgr.t(bgjVarB, this);
        } while (!zI);
        return ((Boolean) objA).booleanValue();
    }

    public final int a() {
        return e().a.size();
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        bdw bdwVar;
        bgj bgjVarB;
        boolean zI;
        do {
            synchronized (bha.a) {
                bhn bhnVar = this.a;
                bhnVar.getClass();
                bgy bgyVar = (bgy) bgr.e(bhnVar);
                i2 = bgyVar.b;
                bdwVar = bgyVar.a;
            }
            bdwVar.getClass();
            bdw bdwVarC = bdwVar.c(i, obj);
            if (a.ao(bdwVarC, bdwVar)) {
                return;
            }
            bhn bhnVar2 = this.a;
            bhnVar2.getClass();
            synchronized (bgr.b) {
                bgjVarB = bgr.b();
                zI = i((bgy) bgr.l(bhnVar2, this, bgjVarB), i2, bdwVarC, true);
            }
            bgr.t(bgjVarB, this);
        } while (!zI);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return j(new bgx(i, collection, 0));
    }

    public final int b() {
        bhn bhnVar = this.a;
        bhnVar.getClass();
        return ((bgy) bgr.e(bhnVar)).c;
    }

    @Override // defpackage.bhl
    public final bhn c() {
        return this.a;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        bgj bgjVarB;
        bhn bhnVar = this.a;
        bhnVar.getClass();
        synchronized (bgr.b) {
            bgjVarB = bgr.b();
            bgy bgyVar = (bgy) bgr.l(bhnVar, this, bgjVarB);
            synchronized (bha.a) {
                bgyVar.a = beh.a;
                bgyVar.b++;
                bgyVar.c++;
            }
        }
        bgr.t(bgjVarB, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return e().a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return e().a.containsAll(collection);
    }

    @Override // defpackage.bhl
    public final void d(bhn bhnVar) {
        bhnVar.h = this.a;
        bhnVar.getClass();
        this.a = (bgy) bhnVar;
    }

    public final bgy e() {
        bhn bhnVar = this.a;
        bhnVar.getClass();
        return (bgy) bgr.j(bhnVar, this);
    }

    public final Object f(int i) {
        int i2;
        bdw bdwVar;
        bgj bgjVarB;
        boolean zI;
        Object obj = get(i);
        do {
            synchronized (bha.a) {
                bhn bhnVar = this.a;
                bhnVar.getClass();
                bgy bgyVar = (bgy) bgr.e(bhnVar);
                i2 = bgyVar.b;
                bdwVar = bgyVar.a;
            }
            bdwVar.getClass();
            bdw bdwVarH = bdwVar.h(i);
            if (a.ao(bdwVarH, bdwVar)) {
                break;
            }
            bhn bhnVar2 = this.a;
            bhnVar2.getClass();
            synchronized (bgr.b) {
                bgjVarB = bgr.b();
                zI = i((bgy) bgr.l(bhnVar2, this, bgjVarB), i2, bdwVarH, true);
            }
            bgr.t(bgjVarB, this);
        } while (!zI);
        return obj;
    }

    @Override // defpackage.bhl
    public final /* synthetic */ bhn g(bhn bhnVar, bhn bhnVar2, bhn bhnVar3) {
        return null;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return e().a.get(i);
    }

    public final void h(int i, int i2) {
        int i3;
        bdw bdwVar;
        bgj bgjVarB;
        boolean zI;
        do {
            synchronized (bha.a) {
                bhn bhnVar = this.a;
                bhnVar.getClass();
                bgy bgyVar = (bgy) bgr.e(bhnVar);
                i3 = bgyVar.b;
                bdwVar = bgyVar.a;
            }
            bdwVar.getClass();
            bed bedVarJ = bdwVar.j();
            bedVarJ.subList(i, i2).clear();
            bdw bdwVarC = bedVarJ.c();
            if (a.ao(bdwVarC, bdwVar)) {
                return;
            }
            bhn bhnVar2 = this.a;
            bhnVar2.getClass();
            synchronized (bgr.b) {
                bgjVarB = bgr.b();
                zI = i((bgy) bgr.l(bhnVar2, this, bgjVarB), i3, bdwVarC, true);
            }
            bgr.t(bgjVarB, this);
        } while (!zI);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return e().a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return e().a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ugi(this, 0, 1);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return e().a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ugi(this, 0, 1);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        return f(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        bdw bdwVar;
        bgj bgjVarB;
        boolean zI;
        do {
            synchronized (bha.a) {
                bhn bhnVar = this.a;
                bhnVar.getClass();
                bgy bgyVar = (bgy) bgr.e(bhnVar);
                i = bgyVar.b;
                bdwVar = bgyVar.a;
            }
            bdwVar.getClass();
            bdw bdwVarF = bdwVar.f(collection);
            if (a.ao(bdwVarF, bdwVar)) {
                return false;
            }
            bhn bhnVar2 = this.a;
            bhnVar2.getClass();
            synchronized (bgr.b) {
                bgjVarB = bgr.b();
                zI = i((bgy) bgr.l(bhnVar2, this, bgjVarB), i, bdwVarF, true);
            }
            bgr.t(bgjVarB, this);
        } while (!zI);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return j(new asj(collection, 9));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        bdw bdwVar;
        bgj bgjVarB;
        boolean zI;
        Object obj2 = get(i);
        do {
            synchronized (bha.a) {
                bhn bhnVar = this.a;
                bhnVar.getClass();
                bgy bgyVar = (bgy) bgr.e(bhnVar);
                i2 = bgyVar.b;
                bdwVar = bgyVar.a;
            }
            bdwVar.getClass();
            bdw bdwVarI = bdwVar.i(i, obj);
            if (a.ao(bdwVarI, bdwVar)) {
                break;
            }
            bhn bhnVar2 = this.a;
            bhnVar2.getClass();
            synchronized (bgr.b) {
                bgjVarB = bgr.b();
                zI = i((bgy) bgr.l(bhnVar2, this, bgjVarB), i2, bdwVarI, false);
            }
            bgr.t(bgjVarB, this);
        } while (!zI);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > a()) {
            bad.a("fromIndex or toIndex are out of bounds");
        }
        return new bhp(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ujj.a(this);
    }

    public final String toString() {
        bhn bhnVar = this.a;
        bhnVar.getClass();
        return "SnapshotStateList(value=" + ((bgy) bgr.e(bhnVar)).a + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        bdw bdwVar;
        bgj bgjVarB;
        boolean zI;
        do {
            synchronized (bha.a) {
                bhn bhnVar = this.a;
                bhnVar.getClass();
                bgy bgyVar = (bgy) bgr.e(bhnVar);
                i = bgyVar.b;
                bdwVar = bgyVar.a;
            }
            bdwVar.getClass();
            bdw bdwVarD = bdwVar.d(collection);
            if (a.ao(bdwVarD, bdwVar)) {
                return false;
            }
            bhn bhnVar2 = this.a;
            bhnVar2.getClass();
            synchronized (bgr.b) {
                bgjVarB = bgr.b();
                zI = i((bgy) bgr.l(bhnVar2, this, bgjVarB), i, bdwVarD, true);
            }
            bgr.t(bgjVarB, this);
        } while (!zI);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ugi(this, i, 1);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        bdw bdwVar;
        bgj bgjVarB;
        boolean zI;
        do {
            synchronized (bha.a) {
                bhn bhnVar = this.a;
                bhnVar.getClass();
                bgy bgyVar = (bgy) bgr.e(bhnVar);
                i = bgyVar.b;
                bdwVar = bgyVar.a;
            }
            bdwVar.getClass();
            bdw bdwVarE = bdwVar.e(obj);
            if (a.ao(bdwVarE, bdwVar)) {
                return false;
            }
            bhn bhnVar2 = this.a;
            bhnVar2.getClass();
            synchronized (bgr.b) {
                bgjVarB = bgr.b();
                zI = i((bgy) bgr.l(bhnVar2, this, bgjVarB), i, bdwVarE, true);
            }
            bgr.t(bgjVarB, this);
        } while (!zI);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ujj.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        bdw bdwVar;
        bgj bgjVarB;
        boolean zI;
        do {
            synchronized (bha.a) {
                bhn bhnVar = this.a;
                bhnVar.getClass();
                bgy bgyVar = (bgy) bgr.e(bhnVar);
                i = bgyVar.b;
                bdwVar = bgyVar.a;
            }
            bdwVar.getClass();
            bdw bdwVarB = bdwVar.b(obj);
            if (a.ao(bdwVarB, bdwVar)) {
                return false;
            }
            bhn bhnVar2 = this.a;
            bhnVar2.getClass();
            synchronized (bgr.b) {
                bgjVarB = bgr.b();
                zI = i((bgy) bgr.l(bhnVar2, this, bgjVarB), i, bdwVarB, true);
            }
            bgr.t(bgjVarB, this);
        } while (!zI);
        return true;
    }
}
