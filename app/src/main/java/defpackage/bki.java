package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class bki {
    public final long a;

    public /* synthetic */ bki(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static String b(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + acv.p(Float.intBitsToFloat((int) (j >> 32))) + ", " + acv.p(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static boolean c(long j, Object obj) {
        return (obj instanceof bki) && j == ((bki) obj).a;
    }

    public static final boolean d(long j) {
        long j2 = (~(-(((-9223372034707292160L) & j) >>> 31))) & j;
        return (((j2 & 4294967295L) & (j2 >>> 32)) == 0) | (j == 9205357640488583168L);
    }

    public final boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final int hashCode() {
        return a.r(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
