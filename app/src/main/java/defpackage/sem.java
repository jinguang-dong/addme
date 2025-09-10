package defpackage;

import java.util.Comparator;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class sem implements Comparator {
    protected sem() {
    }

    public static sem b(Comparator comparator) {
        return comparator instanceof sem ? (sem) comparator : new rzi(comparator);
    }

    public sem a() {
        return new sfg(this);
    }

    public Object c(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = d(next, it.next());
        }
        return next;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public Object d(Object obj, Object obj2) {
        return compare(obj, obj2) >= 0 ? obj : obj2;
    }

    public final Object e(Iterable iterable) {
        return f(iterable.iterator());
    }

    public Object f(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = g(next, it.next());
        }
        return next;
    }

    public Object g(Object obj, Object obj2) {
        return compare(obj, obj2) <= 0 ? obj : obj2;
    }
}
