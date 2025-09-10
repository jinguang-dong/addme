package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class Instant implements Temporal, TemporalAdjuster, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Instant O(long j, int i) {
        if ((i | j) == 0) {
            return EPOCH;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new b("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public static Instant P(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.a(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.D(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.h(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (b e) {
            throw new b(e.b("Unable to obtain Instant from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e);
        }
    }

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return O(j$.desugar.sun.nio.fs.g.F(j, j2), ((int) j$.desugar.sun.nio.fs.g.M(j, j2)) * 1000000);
    }

    public static Instant ofEpochSecond(long j) {
        return O(j, 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 2, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: B */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        int i;
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        int i2 = f.a[((j$.time.temporal.a) lVar).ordinal()];
        int i3 = this.b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            i = i3 / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
            }
            i = i3 / 1000000;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object N(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.m.c) {
            return ChronoUnit.NANOS;
        }
        if (nVar == j$.time.temporal.m.b || nVar == j$.time.temporal.m.a || nVar == j$.time.temporal.m.e || nVar == j$.time.temporal.m.d || nVar == j$.time.temporal.m.f || nVar == j$.time.temporal.m.g) {
            return null;
        }
        return nVar.a(this);
    }

    public final Instant Q(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(j$.desugar.sun.nio.fs.g.N(j$.desugar.sun.nio.fs.g.N(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Instant b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.h(this, j);
        }
        switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return Q(0L, j);
            case 2:
                return Q(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return plusMillis(j);
            case 4:
                return Q(j, 0L);
            case 5:
                return Q(j$.desugar.sun.nio.fs.g.O(j, 60), 0L);
            case 6:
                return Q(j$.desugar.sun.nio.fs.g.O(j, 3600), 0L);
            case 7:
                return Q(j$.desugar.sun.nio.fs.g.O(j, 43200), 0L);
            case 8:
                return Q(j$.desugar.sun.nio.fs.g.O(j, 86400), 0L);
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final long S(Instant instant) {
        long jP = j$.desugar.sun.nio.fs.g.P(instant.a, this.a);
        long j = instant.b - this.b;
        return (jP <= 0 || j >= 0) ? (jP >= 0 || j <= 0) ? jP : jP + 1 : jP - 1;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (Instant) lVar.s(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        aVar.B(j);
        int i = f.a[aVar.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i != 1) {
            if (i == 2) {
                int i3 = ((int) j) * 1000;
                if (i3 != i2) {
                    return O(j2, i3);
                }
            } else if (i == 3) {
                int i4 = ((int) j) * 1000000;
                if (i4 != i2) {
                    return O(j2, i4);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
                }
                if (j != j2) {
                    return O(j, i2);
                }
            }
        } else if (j != i2) {
            return O(j2, (int) j);
        }
        return this;
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        return ZonedDateTime.s(getEpochSecond(), getNano(), zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.INSTANT_SECONDS || lVar == j$.time.temporal.a.NANO_OF_SECOND || lVar == j$.time.temporal.a.MICRO_OF_SECOND || lVar == j$.time.temporal.a.MILLI_OF_SECOND : lVar != null && lVar.h(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantP = P(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, instantP);
        }
        int i = f.b[((ChronoUnit) temporalUnit).ordinal()];
        int i2 = this.b;
        long j = this.a;
        switch (i) {
            case 1:
                return j$.desugar.sun.nio.fs.g.N(j$.desugar.sun.nio.fs.g.O(j$.desugar.sun.nio.fs.g.P(instantP.a, j), 1000000000L), instantP.b - i2);
            case 2:
                return j$.desugar.sun.nio.fs.g.N(j$.desugar.sun.nio.fs.g.O(j$.desugar.sun.nio.fs.g.P(instantP.a, j), 1000000000L), instantP.b - i2) / 1000;
            case 3:
                return j$.desugar.sun.nio.fs.g.P(instantP.toEpochMilli(), toEpochMilli());
            case 4:
                return S(instantP);
            case 5:
                return S(instantP) / 60;
            case 6:
                return S(instantP) / 3600;
            case 7:
                return S(instantP) / 43200;
            case 8:
                return S(instantP) / 86400;
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.m.d(this, lVar).a(lVar.l(this), lVar);
        }
        int i = f.a[((j$.time.temporal.a) lVar).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.d.a(this.a, aVar);
        }
        throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(Instant instant) {
        return compareTo(instant) < 0;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(h hVar) {
        return (Instant) j$.desugar.sun.nio.fs.g.a(hVar, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.d(this, lVar);
    }

    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.k(this);
    }

    public Instant minusMillis(long j) {
        return j == Long.MIN_VALUE ? plusMillis(Long.MAX_VALUE).plusMillis(1L) : plusMillis(-j);
    }

    public Instant minusSeconds(long j) {
        return j == Long.MIN_VALUE ? Q(Long.MAX_VALUE, 0L).Q(1L, 0L) : Q(-j, 0L);
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.h(this);
    }

    public Instant plusMillis(long j) {
        return Q(j / 1000, (j % 1000) * 1000000);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal s(Temporal temporal) {
        return temporal.a(this.a, j$.time.temporal.a.INSTANT_SECONDS).a(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public long toEpochMilli() {
        int i = this.b;
        long j = this.a;
        return (j >= 0 || i <= 0) ? j$.desugar.sun.nio.fs.g.N(j$.desugar.sun.nio.fs.g.O(j, 1000), i / 1000000) : j$.desugar.sun.nio.fs.g.N(j$.desugar.sun.nio.fs.g.O(j + 1, 1000), (i / 1000000) - 1000);
    }

    public final String toString() {
        return DateTimeFormatter.g.format(this);
    }

    public Instant truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() > 86400) {
            throw new j$.time.temporal.n("Unit is too large to be used for truncation");
        }
        long nanos = duration.toNanos();
        if (86400000000000L % nanos != 0) {
            throw new j$.time.temporal.n("Unit must divide into a standard day without remainder");
        }
        long j = ((this.a % 86400) * 1000000000) + this.b;
        return Q(0L, (j$.desugar.sun.nio.fs.g.F(j, nanos) * nanos) - j);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return O(j$.desugar.sun.nio.fs.g.N(j, j$.desugar.sun.nio.fs.g.F(j2, 1000000000L)), (int) j$.desugar.sun.nio.fs.g.M(j2, 1000000000L));
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.a, instant.a);
        return iCompare != 0 ? iCompare : this.b - instant.b;
    }
}
