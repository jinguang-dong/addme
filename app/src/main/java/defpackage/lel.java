package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lel {
    public final boolean a;
    public final float b;

    public lel() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lel) {
            lel lelVar = (lel) obj;
            if (this.a == lelVar.a) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(lelVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + "}";
    }

    public lel(boolean z, float f) {
        this.a = z;
        this.b = f;
    }
}
