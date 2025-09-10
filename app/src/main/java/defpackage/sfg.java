package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sfg extends sem implements Serializable {
    private static final long serialVersionUID = 0;
    final sem a;

    public sfg(sem semVar) {
        this.a = semVar;
    }

    @Override // defpackage.sem
    public final sem a() {
        return this.a;
    }

    @Override // defpackage.sem
    public final Object c(Iterator it) {
        return this.a.f(it);
    }

    @Override // defpackage.sem, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // defpackage.sem
    public final Object d(Object obj, Object obj2) {
        return this.a.g(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sfg) {
            return this.a.equals(((sfg) obj).a);
        }
        return false;
    }

    @Override // defpackage.sem
    public final Object f(Iterator it) {
        return this.a.c(it);
    }

    @Override // defpackage.sem
    public final Object g(Object obj, Object obj2) {
        return this.a.d(obj, obj2);
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
