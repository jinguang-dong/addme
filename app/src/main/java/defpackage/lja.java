package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lja {
    public final float a;
    public final int b;
    public final boolean c;

    public lja() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lja) {
            lja ljaVar = (lja) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(ljaVar.a) && this.b == ljaVar.b && this.c == ljaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ ((Float.floatToIntBits(this.a) ^ 1000003) * 1000003)) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + "}";
    }

    public lja(float f, int i, boolean z) {
        this.a = f;
        this.b = i;
        this.c = z;
    }
}
