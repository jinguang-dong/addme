package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class par implements Comparable {
    public static final par a = e(100);
    public static final par b = c(0);
    public static final par c = new par(-1);
    public static final par d = c(32);
    public final int e;

    public par() {
        throw null;
    }

    public static par b(float f) {
        return c((int) (f * 100.0f));
    }

    public static par c(int i) {
        if (i > 99) {
            i = 99;
        }
        return e(i);
    }

    private static par e(int i) {
        rnt.D(i >= 0, "Percentages must be between [0,100] inclusive: %s", i);
        return new par(i);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(par parVar) {
        return Integer.compare(this.e, parVar.e);
    }

    public final boolean d() {
        return this.e >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof par) && this.e == ((par) obj).e;
    }

    public final int hashCode() {
        return this.e ^ 1000003;
    }

    public final String toString() {
        return this.e + "%";
    }

    public par(int i) {
        this.e = i;
    }
}
