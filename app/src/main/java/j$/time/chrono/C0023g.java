package j$.time.chrono;

import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0023g implements TemporalAmount, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final l a;
    public final int b;
    public final int c;
    public final int d;

    static {
        j$.desugar.sun.nio.fs.g.H(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public C0023g(l lVar, int i, int i2, int i3) {
        this.a = lVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final long a() {
        j$.time.temporal.o oVarW = this.a.w(j$.time.temporal.a.MONTH_OF_YEAR);
        long j = oVarW.a;
        long j2 = oVarW.d;
        if (j == oVarW.b && oVarW.c == j2 && oVarW.d()) {
            return (j2 - oVarW.a) + 1;
        }
        return -1L;
    }

    public final void b(Instant instant) {
        l lVar = (l) instant.N(j$.time.temporal.m.b);
        if (lVar != null) {
            l lVar2 = this.a;
            if (!lVar2.equals(lVar)) {
                throw new j$.time.b(j$.time.e.b("Chronology mismatch, expected: ", lVar2.f(), ", actual: ", lVar.f()));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0023g) {
            C0023g c0023g = (C0023g) obj;
            if (this.b == c0023g.b && this.c == c0023g.c && this.d == c0023g.d && this.a.equals(c0023g.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal h(Instant instant) {
        b(instant);
        int i = this.b;
        int i2 = this.c;
        if (i2 != 0) {
            long jA = a();
            if (jA > 0) {
                instant = instant.b((i * jA) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    instant = instant.b(i, ChronoUnit.YEARS);
                }
                instant = instant.b(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            instant = instant.b(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? instant.b(i3, ChronoUnit.DAYS) : instant;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal k(Instant instant) {
        b(instant);
        int i = this.b;
        int i2 = this.c;
        Temporal temporalX = instant;
        if (i2 != 0) {
            long jA = a();
            Temporal temporalX2 = instant;
            if (jA > 0) {
                temporalX = instant.x((i * jA) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    temporalX2 = instant.x(i, ChronoUnit.YEARS);
                }
                temporalX = ((Instant) temporalX2).x(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporalX = instant.x(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? temporalX.x(i3, ChronoUnit.DAYS) : temporalX;
    }

    public final String toString() {
        l lVar = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 == 0 && i2 == 0 && i == 0) {
            return lVar.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(lVar.toString());
        sb.append(" P");
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('D');
        }
        return sb.toString();
    }

    public Object writeReplace() {
        return new E((byte) 9, this);
    }
}
