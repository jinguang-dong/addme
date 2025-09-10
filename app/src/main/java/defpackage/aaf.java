package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaf {
    public final float a;
    public final float b;

    public aaf(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaf)) {
            return false;
        }
        aaf aafVar = (aaf) obj;
        return Float.compare(this.a, aafVar.a) == 0 && Float.compare(this.b, aafVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "FlingResult(distanceCoefficient=" + this.a + ", velocityCoefficient=" + this.b + ')';
    }
}
