package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes2.dex */
public final class but {
    public static final int a(long j, long j2) {
        boolean zC = c(j);
        if (zC != c(j2)) {
            return zC ? -1 : 1;
        }
        return (Math.min(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32))) >= 0.0f && b(j) != b(j2)) ? b(j) ? -1 : 1 : (int) Math.signum(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32)));
    }

    public static final boolean b(long j) {
        return (j & 2) != 0;
    }

    public static final boolean c(long j) {
        return (j & 1) != 0;
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
