package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnq extends bof {
    public final float a;
    public final float b;

    public bnq(float f, float f2) {
        super(false, false, 3);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnq)) {
            return false;
        }
        bnq bnqVar = (bnq) obj;
        return Float.compare(this.a, bnqVar.a) == 0 && Float.compare(this.b, bnqVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "LineTo(x=" + this.a + ", y=" + this.b + ')';
    }
}
