package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class r implements TemporalAmount, Serializable {
    public static final r d = new r(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.desugar.sun.nio.fs.g.H(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public r(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static void a(Instant instant) {
        j$.time.chrono.l lVar = (j$.time.chrono.l) instant.N(j$.time.temporal.m.b);
        if (lVar == null || j$.time.chrono.s.c.equals(lVar)) {
            return;
        }
        throw new b("Chronology mismatch, expected: ISO, actual: " + lVar.f());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 14, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.a == rVar.a && this.b == rVar.b && this.c == rVar.c) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal h(Instant instant) {
        a(instant);
        int i = this.a;
        int i2 = this.b;
        if (i2 != 0) {
            long j = (i * 12) + i2;
            if (j != 0) {
                instant = instant.b(j, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            instant = instant.b(i, ChronoUnit.YEARS);
        }
        int i3 = this.c;
        return i3 != 0 ? instant.b(i3, ChronoUnit.DAYS) : instant;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal k(Instant instant) {
        a(instant);
        int i = this.a;
        int i2 = this.b;
        Temporal temporalX = instant;
        if (i2 != 0) {
            long j = (i * 12) + i2;
            temporalX = instant;
            if (j != 0) {
                temporalX = instant.x(j, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporalX = instant.x(i, ChronoUnit.YEARS);
        }
        int i3 = this.c;
        if (i3 == 0) {
            return temporalX;
        }
        return ((Instant) temporalX).x(i3, ChronoUnit.DAYS);
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
