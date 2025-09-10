package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hpq {
    public final long a;
    public final float b;
    public final rwc c;
    public final float d;
    private final rwc e;

    public hpq() {
        throw null;
    }

    public static hpp a() {
        hpp hppVar = new hpp(null);
        hppVar.d(-1L);
        rvk rvkVar = rvk.a;
        hppVar.a = rvkVar;
        hppVar.c(0.0f);
        hppVar.b = rvkVar;
        hppVar.b(0.0f);
        return hppVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hpq) {
            hpq hpqVar = (hpq) obj;
            if (this.a == hpqVar.a && this.e.equals(hpqVar.e)) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(hpqVar.b) && this.c.equals(hpqVar.c)) {
                    if (Float.floatToIntBits(this.d) == Float.floatToIntBits(hpqVar.d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c.hashCode();
        return Float.floatToIntBits(this.d) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        rwc rwcVar = this.c;
        return "{" + this.a + ", " + String.valueOf(this.e) + ", " + this.b + ", " + String.valueOf(rwcVar) + ", " + this.d + "}";
    }

    public hpq(long j, rwc rwcVar, float f, rwc rwcVar2, float f2) {
        this.a = j;
        this.e = rwcVar;
        this.b = f;
        this.c = rwcVar2;
        this.d = f2;
    }
}
