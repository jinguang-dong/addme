package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class cid {
    private static final cie[] b = {new cie(0), new cie(4294967296L), new cie(8589934592L)};
    public static final long a = chp.D(0, Float.NaN);

    public static final long a(long j) {
        return j & 1095216660480L;
    }

    public static final long b(long j) {
        return b[(int) (a(j) >>> 32)].a;
    }

    public static String c(long j) {
        long jB = b(j);
        if (a.q(jB, 0L)) {
            return "Unspecified";
        }
        if (a.q(jB, 4294967296L)) {
            return Float.intBitsToFloat((int) (j & 4294967295L)) + ".sp";
        }
        if (!a.q(jB, 8589934592L)) {
            return "Invalid";
        }
        return Float.intBitsToFloat((int) (j & 4294967295L)) + ".em";
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
