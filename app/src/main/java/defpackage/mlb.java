package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mlb {
    public final oxh a;
    public final oxj b;
    public final rwc c;
    public final gcc d;
    public final rwc e;
    public final mky f;
    public final int g;
    public final String h;
    public final boolean i;
    public final lte j;
    public final boolean k;
    public final float l;
    public final int m;

    public mlb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mlb) {
            mlb mlbVar = (mlb) obj;
            if (this.a.equals(mlbVar.a) && this.b.equals(mlbVar.b) && this.c.equals(mlbVar.c) && this.d.equals(mlbVar.d) && this.e.equals(mlbVar.e) && this.f.equals(mlbVar.f) && this.g == mlbVar.g && this.h.equals(mlbVar.h) && this.i == mlbVar.i && this.j.equals(mlbVar.j) && this.k == mlbVar.k) {
                if (Float.floatToIntBits(this.l) == Float.floatToIntBits(mlbVar.l) && this.m == mlbVar.m) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.m ^ ((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ this.j.hashCode()) * 1000003) ^ (true == this.k ? 1231 : 1237)) * 1000003) ^ Float.floatToIntBits(this.l)) * 1000003);
    }

    public final String toString() {
        lte lteVar = this.j;
        mky mkyVar = this.f;
        rwc rwcVar = this.e;
        gcc gccVar = this.d;
        rwc rwcVar2 = this.c;
        oxj oxjVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(oxjVar) + ", " + String.valueOf(rwcVar2) + ", " + String.valueOf(gccVar) + ", " + String.valueOf(rwcVar) + ", " + String.valueOf(mkyVar) + ", " + this.g + ", " + this.h + ", " + this.i + ", " + String.valueOf(lteVar) + ", " + this.k + ", " + this.l + ", " + this.m + "}";
    }

    public mlb(oxh oxhVar, oxj oxjVar, rwc rwcVar, gcc gccVar, rwc rwcVar2, mky mkyVar, int i, String str, boolean z, lte lteVar, boolean z2, float f, int i2) {
        this.a = oxhVar;
        this.b = oxjVar;
        this.c = rwcVar;
        this.d = gccVar;
        this.e = rwcVar2;
        this.f = mkyVar;
        this.g = i;
        this.h = str;
        this.i = z;
        this.j = lteVar;
        this.k = z2;
        this.l = f;
        this.m = i2;
    }
}
