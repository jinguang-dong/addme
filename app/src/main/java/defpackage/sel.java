package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sel extends sem implements Serializable {
    public static final sel a = new sel();
    private static final long serialVersionUID = 0;

    private sel() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.sem
    public final sem a() {
        return sff.a;
    }

    @Override // defpackage.sem, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
