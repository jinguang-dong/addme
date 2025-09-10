package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lag {
    public final float a;
    public final float b;

    public lag() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lag) {
            lag lagVar = (lag) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(lagVar.a)) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(lagVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) ^ 1000003;
        return Float.floatToIntBits(this.b) ^ (iFloatToIntBits * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + "}";
    }

    public lag(float f, float f2) {
        this.a = f;
        this.b = f2;
    }
}
