package j$.time;

import j$.time.format.A;
import j$.time.format.z;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class w implements Temporal, TemporalAdjuster, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    static {
        j$.time.format.s sVar = new j$.time.format.s();
        sVar.m(j$.time.temporal.a.YEAR, 4, 10, A.EXCEEDS_PAD);
        sVar.c('-');
        sVar.l(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        sVar.q(Locale.getDefault(), z.SMART, null);
    }

    public w(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 12, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: B */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        int i = v.a[((j$.time.temporal.a) lVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return O();
        }
        int i2 = this.a;
        if (i == 3) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 4) {
            return i2;
        }
        if (i == 5) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object N(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.m.b ? j$.time.chrono.s.c : nVar == j$.time.temporal.m.c ? ChronoUnit.MONTHS : j$.time.temporal.m.c(this, nVar);
    }

    public final long O() {
        return ((this.a * 12) + this.b) - 1;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final w b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (w) temporalUnit.h(this, j);
        }
        switch (v.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return Q(j);
            case 2:
                return R(j);
            case 3:
                return R(j$.desugar.sun.nio.fs.g.O(j, 10));
            case 4:
                return R(j$.desugar.sun.nio.fs.g.O(j, 100));
            case 5:
                return R(j$.desugar.sun.nio.fs.g.O(j, 1000));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.desugar.sun.nio.fs.g.N(D(aVar), j), aVar);
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final w Q(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j3 = 12;
        return S(aVar.d.a(j$.desugar.sun.nio.fs.g.F(j2, j3), aVar), ((int) j$.desugar.sun.nio.fs.g.M(j2, j3)) + 1);
    }

    public final w R(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return S(aVar.d.a(this.a + j, aVar), this.b);
    }

    public final w S(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new w(i, i2);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final w a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (w) lVar.s(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        aVar.B(j);
        int i = v.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.B(i3);
            return S(i2, i3);
        }
        if (i == 2) {
            return Q(j - O());
        }
        int i4 = this.b;
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            j$.time.temporal.a.YEAR.B(i5);
            return S(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            j$.time.temporal.a.YEAR.B(i6);
            return S(i6, i4);
        }
        if (i != 5) {
            throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
        }
        if (D(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        j$.time.temporal.a.YEAR.B(i7);
        return S(i7, i4);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.YEAR || lVar == j$.time.temporal.a.MONTH_OF_YEAR || lVar == j$.time.temporal.a.PROLEPTIC_MONTH || lVar == j$.time.temporal.a.YEAR_OF_ERA || lVar == j$.time.temporal.a.ERA : lVar != null && lVar.h(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w wVar = (w) obj;
        int i = this.a - wVar.a;
        return i == 0 ? this.b - wVar.b : i;
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        w wVar;
        if (temporal instanceof w) {
            wVar = (w) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.s.c.equals(j$.desugar.sun.nio.fs.g.D(temporal))) {
                    temporal = h.Q(temporal);
                }
                j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
                int iH = temporal.h(aVar);
                j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
                int iH2 = temporal.h(aVar2);
                aVar.B(iH);
                aVar2.B(iH2);
                wVar = new w(iH, iH2);
            } catch (b e) {
                throw new b(e.b("Unable to obtain YearMonth from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, wVar);
        }
        long jO = wVar.O() - O();
        switch (v.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jO;
            case 2:
                return jO / 12;
            case 3:
                return jO / 120;
            case 4:
                return jO / 1200;
            case 5:
                return jO / 12000;
            case 6:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
                return wVar.D(aVar3) - D(aVar3);
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.a == wVar.a && this.b == wVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        return l(lVar).a(D(lVar), lVar);
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(h hVar) {
        return (w) j$.desugar.sun.nio.fs.g.a(hVar, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.o.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.m.d(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal s(Temporal temporal) {
        if (!j$.desugar.sun.nio.fs.g.D(temporal).equals(j$.time.chrono.s.c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return temporal.a(O(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final String toString() {
        int i = this.a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }
}
