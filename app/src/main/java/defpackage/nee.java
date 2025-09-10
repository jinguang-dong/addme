package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nee {
    public final float a;
    public final long b;
    public final long c;
    public final long d;
    public final aii e;

    public nee(float f, long j, long j2, long j3, aii aiiVar) {
        aiiVar.getClass();
        this.a = f;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = aiiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nee)) {
            return false;
        }
        nee neeVar = (nee) obj;
        if (Float.compare(this.a, neeVar.a) != 0 || !a.q(this.b, neeVar.b)) {
            return false;
        }
        long j = this.c;
        long j2 = neeVar.c;
        long j3 = bkv.a;
        return a.q(j, j2) && a.q(this.d, neeVar.d) && this.e == neeVar.e;
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        long j = bkv.a;
        aii aiiVar = this.e;
        long j2 = this.d;
        return ((((((iFloatToIntBits + a.r(this.b)) * 31) + a.r(this.c)) * 31) + a.r(j2)) * 31) + aiiVar.hashCode();
    }

    public final String toString() {
        long j = this.d;
        long j2 = this.c;
        return "SelectedBackgroundSpec(iconPxIncrement=" + this.a + ", size=" + chv.a(this.b) + ", selectedBackgroundColor=" + bkv.g(j2) + ", selectedIconColor=" + bkv.g(j) + ", orientation=" + this.e + ")";
    }
}
