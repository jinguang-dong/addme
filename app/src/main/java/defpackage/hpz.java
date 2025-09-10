package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hpz {
    public final int a;
    public final float b;
    public final rwc c;
    public final float d;

    public hpz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hpz) {
            hpz hpzVar = (hpz) obj;
            if (this.a == hpzVar.a) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(hpzVar.b) && this.c.equals(hpzVar.c)) {
                    if (Float.floatToIntBits(this.d) == Float.floatToIntBits(hpzVar.d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((this.a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c.hashCode();
        return Float.floatToIntBits(this.d) ^ (iFloatToIntBits * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + String.valueOf(this.c) + ", " + this.d + "}";
    }

    public hpz(int i, float f, rwc rwcVar, float f2) {
        this.a = i;
        this.b = f;
        this.c = rwcVar;
        this.d = f2;
    }
}
