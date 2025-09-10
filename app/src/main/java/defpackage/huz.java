package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class huz {
    public final double a;
    public final double b;
    public final float c;

    public huz(double d, double d2, float f) {
        this.a = d;
        this.b = d2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof huz)) {
            return false;
        }
        huz huzVar = (huz) obj;
        return Double.compare(this.a, huzVar.a) == 0 && Double.compare(this.b, huzVar.b) == 0 && Float.compare(this.c, huzVar.c) == 0;
    }

    public final int hashCode() {
        return (((ezh.V(this.a) * 31) + ezh.V(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "TargetInfo(x=" + this.a + ", y=" + this.b + ", completion=" + this.c + ")";
    }
}
