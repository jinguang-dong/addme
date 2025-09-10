package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sff extends sem implements Serializable {
    static final sff a = new sff();
    private static final long serialVersionUID = 0;

    private sff() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.sem
    public final sem a() {
        return sel.a;
    }

    @Override // defpackage.sem
    public final /* bridge */ /* synthetic */ Object c(Iterator it) {
        return (Comparable) sel.a.f(it);
    }

    @Override // defpackage.sem, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // defpackage.sem
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2) {
        return (Comparable) sel.a.g((Comparable) obj, (Comparable) obj2);
    }

    @Override // defpackage.sem
    public final /* bridge */ /* synthetic */ Object f(Iterator it) {
        return (Comparable) sel.a.c(it);
    }

    @Override // defpackage.sem
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2) {
        return (Comparable) sel.a.d((Comparable) obj, (Comparable) obj2);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
