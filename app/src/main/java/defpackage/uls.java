package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class uls implements Comparable {
    public static final long a;
    public static final long b;

    static {
        int i = ult.a;
        a = ujp.g(4611686018427387903L);
        b = ujp.g(-4611686018427387903L);
    }

    public static final int a(long j, ulu uluVar) {
        uluVar.getClass();
        return (int) ukc.s(e(j, uluVar), -2147483648L, 2147483647L);
    }

    public static final long b(long j) {
        boolean zL = l(j);
        long jC = c(j);
        if (zL) {
            return jC;
        }
        if (jC > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jC < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return ujp.h(jC);
    }

    public static final long c(long j) {
        return j >> 1;
    }

    public static final long d(long j, long j2) {
        if (i(j)) {
            if (g(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (i(j2)) {
            return j2;
        }
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return h(j) ? m(c(j), c(j2)) : m(c(j2), c(j));
        }
        long jC = c(j) + c(j2);
        if (l(j)) {
            if (jC < -4611686018426999999L || jC >= 4611686018427000000L) {
                return ujp.g(ujp.i(jC));
            }
            int i = ult.a;
            return jC + jC;
        }
        if (jC < -4611686018426L || jC >= 4611686018427L) {
            return ujp.g(ukc.s(jC, -4611686018427387903L, 4611686018427387903L));
        }
        int i2 = ult.a;
        long jH = ujp.h(jC);
        return jH + jH;
    }

    public static final long e(long j, ulu uluVar) {
        uluVar.getClass();
        if (j == a) {
            return Long.MAX_VALUE;
        }
        if (j == b) {
            return Long.MIN_VALUE;
        }
        return ukc.D(c(j), l(j) ? ulu.a : ulu.c, uluVar);
    }

    public static final long f(long j) {
        int i = ult.a;
        int i2 = ((int) j) & 1;
        long j2 = -c(j);
        return j2 + j2 + i2;
    }

    public static final boolean g(long j) {
        return !i(j);
    }

    public static final boolean h(long j) {
        return (((int) j) & 1) == 1;
    }

    public static final boolean i(long j) {
        return j == a || j == b;
    }

    public static final boolean j(long j) {
        return j < 0;
    }

    public static final void k(StringBuilder sb, int i, int i2, int i3, String str) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strX = ujp.x(String.valueOf(i2), i3);
            int i4 = -1;
            int length = strX.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strX.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (i6 < 3) {
                sb.append((CharSequence) strX, 0, i6);
            } else {
                sb.append((CharSequence) strX, 0, ((i4 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    private static final boolean l(long j) {
        return (((int) j) & 1) == 0;
    }

    private static final long m(long j, long j2) {
        long jI = ujp.i(j2);
        long j3 = j + jI;
        if (j3 < -4611686018426L || j3 >= 4611686018427L) {
            return ujp.g(ukc.s(j3, -4611686018427387903L, 4611686018427387903L));
        }
        long jH = j2 - ujp.h(jI);
        int i = ult.a;
        long jH2 = ujp.h(j3) + jH;
        return jH2 + jH2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        throw null;
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
