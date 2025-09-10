package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bob extends bof {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public bob(float f, float f2, float f3, float f4) {
        super(true, false, 2);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bob)) {
            return false;
        }
        bob bobVar = (bob) obj;
        return Float.compare(this.a, bobVar.a) == 0 && Float.compare(this.b, bobVar.b) == 0 && Float.compare(this.c, bobVar.c) == 0 && Float.compare(this.d, bobVar.d) == 0;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "RelativeReflectiveCurveTo(dx1=" + this.a + ", dy1=" + this.b + ", dx2=" + this.c + ", dy2=" + this.d + ')';
    }
}
