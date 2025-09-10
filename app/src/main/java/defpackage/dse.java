package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dse {
    public final float a;
    public final float b;
    public final float c;

    public dse(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dse)) {
            return false;
        }
        dse dseVar = (dse) obj;
        return Float.compare(this.a, dseVar.a) == 0 && Float.compare(this.b, dseVar.b) == 0 && Float.compare(this.c, dseVar.c) == 0;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "TransformationState(containerAlpha=" + this.a + ", contentAlpha=" + this.b + ", scale=" + this.c + ')';
    }
}
