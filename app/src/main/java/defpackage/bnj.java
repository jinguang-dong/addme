package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnj {
    public static int a;
    public static final Object b;
    public static final byi m;
    public final String c = "";
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final boj h;
    public final long i;
    public final int j;
    public final boolean k;
    public final int l;

    static {
        byi byiVar = new byi();
        m = byiVar;
        b = byiVar;
    }

    public bnj(float f, float f2, float f3, float f4, boj bojVar, long j, int i, boolean z, int i2) {
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = bojVar;
        this.i = j;
        this.j = i;
        this.k = z;
        this.l = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnj)) {
            return false;
        }
        bnj bnjVar = (bnj) obj;
        if (!a.ao(this.c, bnjVar.c) || !cht.b(this.d, bnjVar.d) || !cht.b(this.e, bnjVar.e) || this.f != bnjVar.f || this.g != bnjVar.g || !a.ao(this.h, bnjVar.h)) {
            return false;
        }
        long j = this.i;
        long j2 = bnjVar.i;
        long j3 = bkv.a;
        return a.q(j, j2) && a.p(this.j, bnjVar.j) && this.k == bnjVar.k;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.c.hashCode() * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + this.h.hashCode();
        long j = bkv.a;
        return (((((iHashCode * 31) + a.r(this.i)) * 31) + this.j) * 31) + a.o(this.k);
    }
}
