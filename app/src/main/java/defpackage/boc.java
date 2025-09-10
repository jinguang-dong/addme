package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boc extends bof {
    public final float a;
    public final float b;

    public boc(float f, float f2) {
        super(false, true, 1);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boc)) {
            return false;
        }
        boc bocVar = (boc) obj;
        return Float.compare(this.a, bocVar.a) == 0 && Float.compare(this.b, bocVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "RelativeReflectiveQuadTo(dx=" + this.a + ", dy=" + this.b + ')';
    }
}
