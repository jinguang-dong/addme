package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkt {
    public final float a;
    public final float b;

    public dkt(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkt)) {
            return false;
        }
        dkt dktVar = (dkt) obj;
        return Float.compare(this.a, dktVar.a) == 0 && Float.compare(this.b, dktVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "ScaleAndAlpha(scale=" + this.a + ", alpha=" + this.b + ')';
    }
}
