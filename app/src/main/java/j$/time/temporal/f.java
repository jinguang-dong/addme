package j$.time.temporal;

import j$.time.chrono.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class f implements l {
    public static final f DAY_OF_QUARTER;
    public static final f QUARTER_OF_YEAR;
    public static final f WEEK_BASED_YEAR;
    public static final f WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ f[] b;

    static {
        f fVar = new f() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.l
            public final boolean h(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.c(a.DAY_OF_YEAR) || !temporalAccessor.c(a.MONTH_OF_YEAR) || !temporalAccessor.c(a.YEAR)) {
                    return false;
                }
                f fVar2 = h.a;
                return j$.desugar.sun.nio.fs.g.D(temporalAccessor).equals(s.c);
            }

            @Override // j$.time.temporal.l
            public final o k(TemporalAccessor temporalAccessor) {
                if (!h(temporalAccessor)) {
                    throw new n("Unsupported field: DayOfQuarter");
                }
                long jD = temporalAccessor.D(f.QUARTER_OF_YEAR);
                if (jD == 1) {
                    return s.c.M(temporalAccessor.D(a.YEAR)) ? o.f(1L, 91L) : o.f(1L, 90L);
                }
                return jD == 2 ? o.f(1L, 91L) : (jD == 3 || jD == 4) ? o.f(1L, 92L) : range();
            }

            @Override // j$.time.temporal.l
            public final long l(TemporalAccessor temporalAccessor) {
                if (!h(temporalAccessor)) {
                    throw new n("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.h(a.DAY_OF_YEAR) - f.a[((temporalAccessor.h(a.MONTH_OF_YEAR) - 1) / 3) + (s.c.M(temporalAccessor.D(a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.l
            public final o range() {
                return o.g(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.l
            public final Temporal s(Temporal temporal, long j) {
                long jL = l(temporal);
                range().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.a((j - jL) + temporal.D(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = fVar;
        f fVar2 = new f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.l
            public final boolean h(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.c(a.MONTH_OF_YEAR)) {
                    return false;
                }
                f fVar3 = h.a;
                return j$.desugar.sun.nio.fs.g.D(temporalAccessor).equals(s.c);
            }

            @Override // j$.time.temporal.l
            public final o k(TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return range();
                }
                throw new n("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.l
            public final long l(TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return (temporalAccessor.D(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new n("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.l
            public final o range() {
                return o.f(1L, 4L);
            }

            @Override // j$.time.temporal.l
            public final Temporal s(Temporal temporal, long j) {
                long jL = l(temporal);
                range().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.a(((j - jL) * 3) + temporal.D(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = fVar2;
        f fVar3 = new f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.l
            public final boolean h(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.c(a.EPOCH_DAY)) {
                    return false;
                }
                f fVar4 = h.a;
                return j$.desugar.sun.nio.fs.g.D(temporalAccessor).equals(s.c);
            }

            @Override // j$.time.temporal.l
            public final o k(TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return o.f(1L, f.N(f.D(j$.time.h.Q(temporalAccessor))));
                }
                throw new n("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.l
            public final long l(TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return f.B(j$.time.h.Q(temporalAccessor));
                }
                throw new n("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.l
            public final o range() {
                return o.g(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.l
            public final Temporal s(Temporal temporal, long j) {
                range().b(j, this);
                return temporal.b(j$.desugar.sun.nio.fs.g.P(j, l(temporal)), ChronoUnit.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = fVar3;
        f fVar4 = new f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.l
            public final boolean h(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.c(a.EPOCH_DAY)) {
                    return false;
                }
                f fVar5 = h.a;
                return j$.desugar.sun.nio.fs.g.D(temporalAccessor).equals(s.c);
            }

            @Override // j$.time.temporal.l
            public final o k(TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return range();
                }
                throw new n("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.l
            public final long l(TemporalAccessor temporalAccessor) {
                if (h(temporalAccessor)) {
                    return f.D(j$.time.h.Q(temporalAccessor));
                }
                throw new n("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.l
            public final o range() {
                return a.YEAR.d;
            }

            @Override // j$.time.temporal.l
            public final Temporal s(Temporal temporal, long j) {
                if (!h(temporal)) {
                    throw new n("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.d.a(j, f.WEEK_BASED_YEAR);
                j$.time.h hVarQ = j$.time.h.Q(temporal);
                int iH = hVarQ.h(a.DAY_OF_WEEK);
                int iB = f.B(hVarQ);
                if (iB == 53 && f.N(iA) == 52) {
                    iB = 52;
                }
                return temporal.k(j$.time.h.Z(iA, 1, 4).c0(((iB - 1) * 7) + (iH - r6.h(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = fVar4;
        b = new f[]{fVar, fVar2, fVar3, fVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int B(j$.time.h hVar) {
        int iOrdinal = hVar.S().ordinal();
        int iT = hVar.T() - 1;
        int i = (3 - iOrdinal) + iT;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iT < i3) {
            return (int) o.f(1L, N(D(hVar.i0(180).e0(-1L)))).d;
        }
        int i4 = ((iT - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && hVar.v())) {
            return i4;
        }
        return 1;
    }

    public static int D(j$.time.h hVar) {
        int i = hVar.a;
        int iT = hVar.T();
        if (iT <= 3) {
            return iT - hVar.S().ordinal() < -2 ? i - 1 : i;
        }
        if (iT >= 363) {
            return ((iT - 363) - (hVar.v() ? 1 : 0)) - hVar.S().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }

    public static int N(int i) {
        j$.time.h hVarZ = j$.time.h.Z(i, 1, 1);
        if (hVarZ.S() != j$.time.c.THURSDAY) {
            return (hVarZ.S() == j$.time.c.WEDNESDAY && hVarZ.v()) ? 53 : 52;
        }
        return 53;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) b.clone();
    }

    @Override // j$.time.temporal.l
    public final boolean isDateBased() {
        return true;
    }
}
