package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.InterfaceC0018b;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class h implements Temporal, TemporalAdjuster, InterfaceC0018b, Serializable {
    public static final h d = Z(-999999999, 1, 1);
    public static final h e = Z(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        Z(1970, 1, 1);
    }

    public h(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static h P(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.s.c.M(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new b("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new b("Invalid date '" + k.R(i2).name() + " " + i3 + "'");
            }
        }
        return new h(i, i2, i3);
    }

    public static h Q(TemporalAccessor temporalAccessor) {
        Objects.a(temporalAccessor, "temporal");
        h hVar = (h) temporalAccessor.N(j$.time.temporal.m.f);
        if (hVar != null) {
            return hVar;
        }
        throw new b(e.b("Unable to obtain LocalDate from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()));
    }

    public static h Z(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.B(i);
        j$.time.temporal.a.MONTH_OF_YEAR.B(i2);
        j$.time.temporal.a.DAY_OF_MONTH.B(i3);
        return P(i, i2, i3);
    }

    public static h a0(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.B(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + (i2 / 10);
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new h(aVar.d.a(j7, aVar), i3, i4);
    }

    public static h f0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, j$.time.chrono.s.c.M((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new h(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 3, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.EPOCH_DAY ? E() : lVar == j$.time.temporal.a.PROLEPTIC_MONTH ? U() : R(lVar) : lVar.l(this);
    }

    @Override // j$.time.chrono.InterfaceC0018b
    public final long E() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !v() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // j$.time.chrono.InterfaceC0018b
    public final ChronoLocalDateTime F(LocalTime localTime) {
        return LocalDateTime.R(this, localTime);
    }

    @Override // j$.time.chrono.InterfaceC0018b
    public final int K() {
        return v() ? 366 : 365;
    }

    @Override // java.lang.Comparable
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0018b interfaceC0018b) {
        return interfaceC0018b instanceof h ? O((h) interfaceC0018b) : j$.desugar.sun.nio.fs.g.d(this, interfaceC0018b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object N(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.m.f ? this : j$.desugar.sun.nio.fs.g.p(this, nVar);
    }

    public final int O(h hVar) {
        int i = this.a - hVar.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - hVar.b;
        return i2 == 0 ? this.c - hVar.c : i2;
    }

    public final int R(j$.time.temporal.l lVar) {
        int i;
        int i2 = g.a[((j$.time.temporal.a) lVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return T();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return S().getValue();
            case 6:
                i = (s - 1) % 7;
                break;
            case 7:
                return ((T() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.n("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((T() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.n("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
        }
        return i + 1;
    }

    public final c S() {
        return c.O(((int) j$.desugar.sun.nio.fs.g.M(E() + 3, 7)) + 1);
    }

    public final int T() {
        return (k.R(this.b).O(v()) + this.c) - 1;
    }

    public final long U() {
        return ((this.a * 12) + this.b) - 1;
    }

    public final boolean V(InterfaceC0018b interfaceC0018b) {
        return interfaceC0018b instanceof h ? O((h) interfaceC0018b) < 0 : E() < interfaceC0018b.E();
    }

    public final int W() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : v() ? 29 : 28;
    }

    @Override // j$.time.chrono.InterfaceC0018b
    /* renamed from: X, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h x(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j, temporalUnit);
    }

    public final long Y(h hVar) {
        return (((hVar.U() * 32) + hVar.c) - ((U() * 32) + this.c)) / 32;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final h b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (h) temporalUnit.h(this, j);
        }
        switch (g.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return c0(j);
            case 2:
                return c0(j$.desugar.sun.nio.fs.g.O(j, 7));
            case 3:
                return d0(j);
            case 4:
                return e0(j);
            case 5:
                return e0(j$.desugar.sun.nio.fs.g.O(j, 10));
            case 6:
                return e0(j$.desugar.sun.nio.fs.g.O(j, 100));
            case 7:
                return e0(j$.desugar.sun.nio.fs.g.O(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.desugar.sun.nio.fs.g.N(D(aVar), j), aVar);
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        return j$.desugar.sun.nio.fs.g.n(this, lVar);
    }

    public final h c0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new h(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long jW = W();
                if (j2 <= jW) {
                    return new h(i, s, (int) j2);
                }
                if (s < 12) {
                    return new h(i, s + 1, (int) (j2 - jW));
                }
                int i2 = i + 1;
                j$.time.temporal.a.YEAR.B(i2);
                return new h(i2, 1, (int) (j2 - jW));
            }
        }
        return a0(j$.desugar.sun.nio.fs.g.N(E(), j));
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        h hVarQ = Q(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, hVarQ);
        }
        switch (g.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return hVarQ.E() - E();
            case 2:
                return (hVarQ.E() - E()) / 7;
            case 3:
                return Y(hVarQ);
            case 4:
                return Y(hVarQ) / 12;
            case 5:
                return Y(hVarQ) / 120;
            case 6:
                return Y(hVarQ) / 1200;
            case 7:
                return Y(hVarQ) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return hVarQ.D(aVar) - D(aVar);
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final h d0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j3 = 12;
        return f0(aVar.d.a(j$.desugar.sun.nio.fs.g.F(j2, j3), aVar), ((int) j$.desugar.sun.nio.fs.g.M(j2, j3)) + 1, this.c);
    }

    public final h e0(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return f0(aVar.d.a(this.a + j, aVar), this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && O((h) obj) == 0;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final h a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (h) lVar.s(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        aVar.B(j);
        int i = g.a[aVar.ordinal()];
        short s = this.c;
        short s2 = this.b;
        int i2 = this.a;
        switch (i) {
            case 1:
                int i3 = (int) j;
                if (s != i3) {
                    return Z(i2, s2, i3);
                }
                return this;
            case 2:
                return i0((int) j);
            case 3:
                return c0(j$.desugar.sun.nio.fs.g.O(j - D(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return j0((int) j);
            case 5:
                return c0(j - S().getValue());
            case 6:
                return c0(j - D(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return c0(j - D(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return a0(j);
            case 9:
                return c0(j$.desugar.sun.nio.fs.g.O(j - D(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i4 = (int) j;
                if (s2 != i4) {
                    j$.time.temporal.a.MONTH_OF_YEAR.B(i4);
                    return f0(i2, i4, s);
                }
                return this;
            case 11:
                return d0(j - U());
            case 12:
                return j0((int) j);
            case 13:
                if (D(j$.time.temporal.a.ERA) != j) {
                    return j0(1 - i2);
                }
                return this;
            default:
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
        }
    }

    @Override // j$.time.chrono.InterfaceC0018b
    public final j$.time.chrono.l getChronology() {
        return j$.time.chrono.s.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? R(lVar) : j$.time.temporal.m.a(this, lVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final h k(TemporalAdjuster temporalAdjuster) {
        return temporalAdjuster instanceof h ? (h) temporalAdjuster : (h) temporalAdjuster.s(this);
    }

    @Override // j$.time.chrono.InterfaceC0018b
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    public final h i0(int i) {
        if (T() == i) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int i2 = this.a;
        long j = i2;
        aVar.B(j);
        j$.time.temporal.a.DAY_OF_YEAR.B(i);
        boolean zM = j$.time.chrono.s.c.M(j);
        if (i == 366 && !zM) {
            throw new b("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
        }
        k kVarR = k.R(((i - 1) / 31) + 1);
        if (i > (kVarR.P(zM) + kVarR.O(zM)) - 1) {
            kVarR = k.a[((((int) 1) + 12) + kVarR.ordinal()) % 12];
        }
        return new h(i2, kVarR.getValue(), (i - kVarR.O(zM)) + 1);
    }

    public final h j0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.B(i);
        return f0(i, this.b, this.c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.k(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
        }
        int i = g.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.o.f(1L, W());
        }
        if (i == 2) {
            return j$.time.temporal.o.f(1L, K());
        }
        if (i != 3) {
            return i != 4 ? ((j$.time.temporal.a) lVar).d : this.a <= 0 ? j$.time.temporal.o.f(1L, 1000000000L) : j$.time.temporal.o.f(1L, 999999999L);
        }
        return j$.time.temporal.o.f(1L, (k.R(this.b) != k.FEBRUARY || v()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal s(Temporal temporal) {
        return j$.desugar.sun.nio.fs.g.a(this, temporal);
    }

    @Override // j$.time.chrono.InterfaceC0018b
    public final String toString() {
        int i = this.a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        short s = this.b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.c;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // j$.time.chrono.InterfaceC0018b
    public final boolean v() {
        return j$.time.chrono.s.c.M(this.a);
    }
}
