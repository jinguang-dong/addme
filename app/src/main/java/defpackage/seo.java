package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class seo extends sep implements Serializable, rwe {
    public static final seo a = new seo(rzp.a, rzn.a);
    private static final long serialVersionUID = 0;
    public final rzr b;
    public final rzr c;

    public seo(rzr rzrVar, rzr rzrVar2) {
        this.b = rzrVar;
        this.c = rzrVar2;
        if (rzrVar.compareTo(rzrVar2) > 0 || rzrVar == rzn.a || rzrVar2 == rzp.a) {
            throw new IllegalArgumentException("Invalid range: ".concat(o(rzrVar, rzrVar2)));
        }
    }

    static int b(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static seo c(Comparable comparable) {
        return new seo(new rzq(comparable), rzn.a);
    }

    public static seo d(Comparable comparable) {
        return new seo(rzp.a, new rzo(comparable));
    }

    public static seo e(Comparable comparable, Comparable comparable2) {
        return new seo(new rzq(comparable), new rzo(comparable2));
    }

    public static seo f(Comparable comparable, Comparable comparable2) {
        return new seo(new rzq(comparable), new rzq(comparable2));
    }

    private static String o(rzr rzrVar, rzr rzrVar2) {
        StringBuilder sb = new StringBuilder(16);
        rzrVar.e(sb);
        sb.append("..");
        rzrVar2.f(sb);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof seo) {
            seo seoVar = (seo) obj;
            if (this.b.equals(seoVar.b) && this.c.equals(seoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final seo g(seo seoVar) {
        rzr rzrVar = this.b;
        rzr rzrVar2 = seoVar.b;
        int iCompareTo = rzrVar.compareTo(rzrVar2);
        rzr rzrVar3 = this.c;
        rzr rzrVar4 = seoVar.c;
        int iCompareTo2 = rzrVar3.compareTo(rzrVar4);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return seoVar;
        }
        if (iCompareTo < 0) {
            rzrVar = rzrVar2;
        }
        if (iCompareTo2 > 0) {
            rzrVar3 = rzrVar4;
        }
        rnt.I(rzrVar.compareTo(rzrVar3) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, seoVar);
        return new seo(rzrVar, rzrVar3);
    }

    public final Comparable h() {
        return this.b.b();
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final Comparable i() {
        return this.c.b();
    }

    @Override // defpackage.rwe
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final boolean a(Comparable comparable) {
        comparable.getClass();
        return this.b.g(comparable) && !this.c.g(comparable);
    }

    public final boolean k() {
        return this.b != rzp.a;
    }

    public final boolean l() {
        return this.c != rzn.a;
    }

    public final boolean m(seo seoVar) {
        return this.b.compareTo(seoVar.c) <= 0 && seoVar.b.compareTo(this.c) <= 0;
    }

    public final boolean n() {
        return this.b.equals(this.c);
    }

    Object readResolve() {
        seo seoVar = a;
        return equals(seoVar) ? seoVar : this;
    }

    public final String toString() {
        return o(this.b, this.c);
    }
}
