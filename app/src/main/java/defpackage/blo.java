package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blo {
    public static final blo a = new blo(bko.j(4278190080L));
    public final long b;
    public final long c = 0;
    public final float d = 0.0f;

    public blo(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blo)) {
            return false;
        }
        long j = this.b;
        blo bloVar = (blo) obj;
        long j2 = bloVar.b;
        long j3 = bkv.a;
        if (!a.q(j, j2)) {
            return false;
        }
        long j4 = bloVar.c;
        if (!a.q(0L, 0L)) {
            return false;
        }
        float f = bloVar.d;
        return true;
    }

    public final int hashCode() {
        long j = bkv.a;
        return (((a.r(this.b) * 31) + a.r(0L)) * 31) + Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "Shadow(color=" + ((Object) bkv.g(this.b)) + ", offset=" + ((Object) bkf.c(0L)) + ", blurRadius=0.0)";
    }
}
