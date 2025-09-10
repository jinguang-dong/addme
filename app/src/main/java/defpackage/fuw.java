package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fuw {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final tup g;

    public fuw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fuw) {
            fuw fuwVar = (fuw) obj;
            if (this.a == fuwVar.a && this.b == fuwVar.b && this.c == fuwVar.c && this.d == fuwVar.d && this.e == fuwVar.e) {
                if (Float.floatToIntBits(this.f) == Float.floatToIntBits(fuwVar.f) && this.g.equals(fuwVar.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        long j = this.b;
        long j2 = this.a;
        int i = (int) (j ^ (j >>> 32));
        int iFloatToIntBits = ((((((((i ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ Float.floatToIntBits(this.f);
        tup tupVar = this.g;
        if (tupVar.C()) {
            iJ = tupVar.j();
        } else {
            int iJ2 = tupVar.aT;
            if (iJ2 == 0) {
                iJ2 = tupVar.j();
                tupVar.aT = iJ2;
            }
            iJ = iJ2;
        }
        return iJ ^ (iFloatToIntBits * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g.toString() + "}";
    }

    public fuw(long j, long j2, int i, int i2, int i3, float f, tup tupVar) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = f;
        tupVar.getClass();
        this.g = tupVar;
    }
}
