package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfv {
    public final lnm a;
    public final lnn b;
    public final float c;
    public final rwc d;
    public final int e;
    public final int f;

    public kfv(lnm lnmVar, lnn lnnVar, float f, rwc rwcVar, int i, int i2) {
        this.a = lnmVar;
        this.b = lnnVar;
        this.c = f;
        this.d = rwcVar;
        this.e = i;
        this.f = i2;
    }

    public static kfv a() {
        return new kfv(lnm.OFF, lnn.INACTIVE, 0.0f, rvk.a, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kfv)) {
            return false;
        }
        kfv kfvVar = (kfv) obj;
        boolean z = this.a == kfvVar.a && this.b == kfvVar.b && this.c == kfvVar.c && this.e == kfvVar.e && this.f == kfvVar.f;
        rwc rwcVar = this.d;
        if (rwcVar.h()) {
            rwc rwcVar2 = kfvVar.d;
            if (rwcVar2.h()) {
                return z && rwcVar.c().equals(rwcVar2.c());
            }
        }
        return z;
    }

    public final int hashCode() {
        return ((((this.a.g + 527) * 31) + this.b.h) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        lnn lnnVar = this.b;
        return "{controlAfMode=" + String.valueOf(this.a) + ", controlAfState=" + String.valueOf(lnnVar) + ", lensFocusDistance=" + this.c + "}";
    }
}
