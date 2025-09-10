package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rzr implements Comparable, Serializable {
    private static final long serialVersionUID = 0;
    final Comparable b;

    public rzr(Comparable comparable) {
        this.b = comparable;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(rzr rzrVar) {
        if (rzrVar == rzp.a) {
            return 1;
        }
        if (rzrVar == rzn.a) {
            return -1;
        }
        int iB = seo.b(this.b, rzrVar.b);
        return iB != 0 ? iB : Boolean.compare(this instanceof rzo, rzrVar instanceof rzo);
    }

    public Comparable b() {
        return this.b;
    }

    public abstract Comparable c(rzw rzwVar);

    public abstract Comparable d(rzw rzwVar);

    public abstract void e(StringBuilder sb);

    public final boolean equals(Object obj) {
        if (obj instanceof rzr) {
            try {
                if (compareTo((rzr) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract void f(StringBuilder sb);

    public abstract boolean g(Comparable comparable);

    public abstract rzr h(rzw rzwVar);

    public abstract int hashCode();

    public abstract rzr i(rzw rzwVar);
}
