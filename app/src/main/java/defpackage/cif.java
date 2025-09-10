package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes2.dex */
public final class cif {
    public final long a;

    public static String a(long j) {
        return "(" + Float.intBitsToFloat((int) (j >> 32)) + ", " + Float.intBitsToFloat((int) (j & 4294967295L)) + ") px/sec";
    }

    public static /* synthetic */ long b(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cif) && this.a == ((cif) obj).a;
    }

    public final int hashCode() {
        return a.r(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
