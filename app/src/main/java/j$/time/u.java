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
public final class u implements Temporal, TemporalAdjuster, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    static {
        j$.time.format.s sVar = new j$.time.format.s();
        sVar.m(j$.time.temporal.a.YEAR, 4, 10, A.EXCEEDS_PAD);
        sVar.q(Locale.getDefault(), z.SMART, null);
    }

    public u(int i) {
        this.a = i;
    }

    public static u O(int i) {
        j$.time.temporal.a.YEAR.B(i);
        return new u(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 11, this);
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
        int i = t.a[((j$.time.temporal.a) lVar).ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return i2;
        }
        if (i == 3) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object N(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.m.b ? j$.time.chrono.s.c : nVar == j$.time.temporal.m.c ? ChronoUnit.YEARS : j$.time.temporal.m.c(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final u b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (u) temporalUnit.h(this, j);
        }
        int i = t.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return Q(j);
        }
        if (i == 2) {
            return Q(j$.desugar.sun.nio.fs.g.O(j, 10));
        }
        if (i == 3) {
            return Q(j$.desugar.sun.nio.fs.g.O(j, 100));
        }
        if (i == 4) {
            return Q(j$.desugar.sun.nio.fs.g.O(j, 1000));
        }
        if (i != 5) {
            throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return a(j$.desugar.sun.nio.fs.g.N(D(aVar), j), aVar);
    }

    public final u Q(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return O(aVar.d.a(this.a + j, aVar));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final u a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (u) lVar.s(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        aVar.B(j);
        int i = t.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                j = 1 - j;
            }
            return O((int) j);
        }
        if (i == 2) {
            return O((int) j);
        }
        if (i == 3) {
            return D(j$.time.temporal.a.ERA) == j ? this : O(1 - i2);
        }
        throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.YEAR || lVar == j$.time.temporal.a.YEAR_OF_ERA || lVar == j$.time.temporal.a.ERA : lVar != null && lVar.h(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((u) obj).a;
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        u uVarO;
        if (temporal instanceof u) {
            uVarO = (u) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.s.c.equals(j$.desugar.sun.nio.fs.g.D(temporal))) {
                    temporal = h.Q(temporal);
                }
                uVarO = O(temporal.h(j$.time.temporal.a.YEAR));
            } catch (b e) {
                throw new b(e.b("Unable to obtain Year from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, uVarO);
        }
        long j = uVarO.a - this.a;
        int i = t.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j / 10;
        }
        if (i == 3) {
            return j / 100;
        }
        if (i == 4) {
            return j / 1000;
        }
        if (i != 5) {
            throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return uVarO.D(aVar) - D(aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            if (this.a == ((u) obj).a) {
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
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(h hVar) {
        return (u) j$.desugar.sun.nio.fs.g.a(hVar, this);
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
        return temporal.a(this.a, j$.time.temporal.a.YEAR);
    }

    public final String toString() {
        return Integer.toString(this.a);
    }
}
