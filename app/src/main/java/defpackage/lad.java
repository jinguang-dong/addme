package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lad {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final float e;

    public lad() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lad) {
            lad ladVar = (lad) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(ladVar.a)) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(ladVar.b)) {
                    if (Float.floatToIntBits(this.c) == Float.floatToIntBits(ladVar.c) && this.d == ladVar.d) {
                        if (Float.floatToIntBits(this.e) == Float.floatToIntBits(ladVar.e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c);
        float f = this.e;
        return ((this.d ^ (iFloatToIntBits * 1000003)) * 1000003) ^ Float.floatToIntBits(f);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + "}";
    }

    public lad(float f, float f2, float f3, int i, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = f4;
    }
}
