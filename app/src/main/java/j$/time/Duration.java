package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes3.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);
    public static final BigInteger c = BigInteger.valueOf(1000000000);
    private static final long serialVersionUID = 3078945930695997490L;
    public final long a;
    public final int b;

    public Duration(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return ofNanos(temporal.d(temporal2, ChronoUnit.NANOS));
        } catch (b | ArithmeticException unused) {
            long jD = temporal.d(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                long jD2 = temporal2.D(aVar) - temporal.D(aVar);
                if (jD > 0 && jD2 < 0) {
                    jD++;
                } else if (jD < 0 && jD2 > 0) {
                    jD--;
                }
                j = jD2;
            } catch (b unused2) {
            }
            return ofSeconds(jD, j);
        }
    }

    public static Duration l(long j, int i) {
        return (((long) i) | j) == 0 ? ZERO : new Duration(j, i);
    }

    public static Duration of(long j, TemporalUnit temporalUnit) {
        Duration duration = ZERO;
        duration.getClass();
        Objects.a(temporalUnit, "unit");
        if (temporalUnit == ChronoUnit.DAYS) {
            return duration.B(j$.desugar.sun.nio.fs.g.O(j, 86400), 0L);
        }
        if (temporalUnit.isDurationEstimated()) {
            throw new j$.time.temporal.n("Unit must not have an estimated duration");
        }
        if (j == 0) {
            return duration;
        }
        if (temporalUnit instanceof ChronoUnit) {
            int i = d.a[((ChronoUnit) temporalUnit).ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? duration.plusSeconds(j$.desugar.sun.nio.fs.g.O(temporalUnit.getDuration().a, j)) : duration.plusSeconds(j) : duration.plusMillis(j) : duration.plusSeconds((j / 1000000000) * 1000).B(0L, (j % 1000000000) * 1000) : duration.B(0L, j);
        }
        return duration.plusSeconds(temporalUnit.getDuration().multipliedBy(j).getSeconds()).B(0L, r10.getNano());
    }

    public static Duration ofHours(long j) {
        return l(j$.desugar.sun.nio.fs.g.O(j, 3600), 0);
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return l(j2, i * 1000000);
    }

    public static Duration ofMinutes(long j) {
        return l(j$.desugar.sun.nio.fs.g.O(j, 60), 0);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j2--;
        }
        return l(j2, i);
    }

    public static Duration ofSeconds(long j) {
        return l(j, 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static Duration s(BigDecimal bigDecimal) {
        BigInteger bigIntegerExact = bigDecimal.movePointRight(9).toBigIntegerExact();
        BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(c);
        if (bigIntegerArrDivideAndRemainder[0].bitLength() <= 63) {
            return ofSeconds(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        throw new ArithmeticException("Exceeds capacity of Duration: ".concat(String.valueOf(bigIntegerExact)));
    }

    private Object writeReplace() {
        return new s((byte) 1, this);
    }

    public final Duration B(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(j$.desugar.sun.nio.fs.g.N(j$.desugar.sun.nio.fs.g.N(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    public final BigDecimal D() {
        return BigDecimal.valueOf(this.a).add(BigDecimal.valueOf(this.b, 9));
    }

    public Duration dividedBy(long j) {
        if (j != 0) {
            return j == 1 ? this : s(D().divide(BigDecimal.valueOf(j), RoundingMode.DOWN));
        }
        throw new ArithmeticException("Cannot divide by zero");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.a == duration.a && this.b == duration.b) {
                return true;
            }
        }
        return false;
    }

    public int getNano() {
        return this.b;
    }

    public long getSeconds() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal h(Instant instant) {
        long j = this.a;
        if (j != 0) {
            instant = instant.b(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        return i != 0 ? instant.b(i, ChronoUnit.NANOS) : instant;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isNegative() {
        return this.a < 0;
    }

    public boolean isZero() {
        return (((long) this.b) | this.a) == 0;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal k(Instant instant) {
        long j = this.a;
        Temporal temporalB = instant;
        if (j != 0) {
            temporalB = instant.x(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        if (i == 0) {
            return temporalB;
        }
        return ((Instant) temporalB).x(i, ChronoUnit.NANOS);
    }

    public Duration minus(Duration duration) {
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        return seconds == Long.MIN_VALUE ? B(Long.MAX_VALUE, -nano).B(1L, 0L) : B(-seconds, -nano);
    }

    public Duration minusNanos(long j) {
        return j == Long.MIN_VALUE ? B(0L, Long.MAX_VALUE).B(0L, 1L) : B(0L, -j);
    }

    public Duration multipliedBy(long j) {
        return j == 0 ? ZERO : j == 1 ? this : s(D().multiply(BigDecimal.valueOf(j)));
    }

    public Duration plusMillis(long j) {
        return B(j / 1000, (j % 1000) * 1000000);
    }

    public Duration plusSeconds(long j) {
        return B(j, 0L);
    }

    public long toMillis() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.desugar.sun.nio.fs.g.N(j$.desugar.sun.nio.fs.g.O(j2, 1000), j / 1000000);
    }

    public long toMinutes() {
        return this.a / 60;
    }

    public long toNanos() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.desugar.sun.nio.fs.g.N(j$.desugar.sun.nio.fs.g.O(j2, 1000000000L), j);
    }

    public long toSeconds() {
        return this.a;
    }

    public final String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.a;
        int i = this.b;
        long j2 = (j >= 0 || i <= 0) ? j : 1 + j;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && i == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j >= 0 || i <= 0 || i3 != 0) {
            sb.append(i3);
        } else {
            sb.append("-0");
        }
        if (i > 0) {
            int length = sb.length();
            if (j < 0) {
                sb.append(2000000000 - i);
            } else {
                sb.append(i + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    public static Duration ofSeconds(long j, long j2) {
        return l(j$.desugar.sun.nio.fs.g.N(j, j$.desugar.sun.nio.fs.g.F(j2, 1000000000L)), (int) j$.desugar.sun.nio.fs.g.M(j2, 1000000000L));
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int iCompare = Long.compare(this.a, duration.a);
        return iCompare != 0 ? iCompare : this.b - duration.b;
    }

    public long dividedBy(Duration duration) {
        Objects.a(duration, "divisor");
        return D().divideToIntegralValue(duration.D()).longValueExact();
    }
}
