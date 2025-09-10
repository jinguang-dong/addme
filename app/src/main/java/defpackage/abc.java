package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abc {
    public final float a;
    public final float b;
    public final long c;

    public abc(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abc)) {
            return false;
        }
        abc abcVar = (abc) obj;
        return Float.compare(this.a, abcVar.a) == 0 && Float.compare(this.b, abcVar.b) == 0 && this.c == abcVar.c;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + a.r(this.c);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
    }
}
