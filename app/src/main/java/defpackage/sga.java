package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
class sga extends sfy implements SortedSet {
    private static final long serialVersionUID = 0;

    public sga(SortedSet sortedSet, Object obj) {
        super(sortedSet, obj);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        Comparator comparator;
        synchronized (this.h) {
            comparator = a().comparator();
        }
        return comparator;
    }

    @Override // defpackage.sfy
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet a() {
        return (SortedSet) super.a();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Object objFirst;
        synchronized (this.h) {
            objFirst = a().first();
        }
        return objFirst;
    }

    public SortedSet headSet(Object obj) {
        sga sgaVar;
        Object obj2 = this.h;
        synchronized (obj2) {
            sgaVar = new sga(a().headSet(obj), obj2);
        }
        return sgaVar;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        Object objLast;
        synchronized (this.h) {
            objLast = a().last();
        }
        return objLast;
    }

    public SortedSet subSet(Object obj, Object obj2) {
        sga sgaVar;
        Object obj3 = this.h;
        synchronized (obj3) {
            sgaVar = new sga(a().subSet(obj, obj2), obj3);
        }
        return sgaVar;
    }

    public SortedSet tailSet(Object obj) {
        sga sgaVar;
        Object obj2 = this.h;
        synchronized (obj2) {
            sgaVar = new sga(a().tailSet(obj), obj2);
        }
        return sgaVar;
    }
}
