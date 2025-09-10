package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cuy {
    public final float a;
    public final cvg b;
    public final cvg c;

    public cuy(float f, cvg cvgVar, cvg cvgVar2) {
        cvgVar.getClass();
        cvgVar2.getClass();
        this.a = f;
        this.b = cvgVar;
        this.c = cvgVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuy)) {
            return false;
        }
        cuy cuyVar = (cuy) obj;
        return Float.compare(this.a, cuyVar.a) == 0 && a.ao(this.b, cuyVar.b) && a.ao(this.c, cuyVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DistanceVertex(distance=" + this.a + ", f1=" + this.b + ", f2=" + this.c + ')';
    }
}
