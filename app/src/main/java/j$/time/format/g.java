package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;

/* loaded from: classes3.dex */
public final class g implements e {
    @Override // j$.time.format.e
    public final boolean h(u uVar, StringBuilder sb) {
        Long lA = uVar.a(j$.time.temporal.a.INSTANT_SECONDS);
        TemporalAccessor temporalAccessor = uVar.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long lValueOf = temporalAccessor.c(aVar) ? Long.valueOf(temporalAccessor.D(aVar)) : null;
        int i = 0;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int iA = aVar.d.a(lValueOf != null ? lValueOf.longValue() : 0L, aVar);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jF = 1 + j$.desugar.sun.nio.fs.g.F(j, 315569520000L);
            LocalDateTime localDateTimeS = LocalDateTime.S(j$.desugar.sun.nio.fs.g.M(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jF > 0) {
                sb.append('+');
                sb.append(jF);
            }
            sb.append(localDateTimeS);
            if (localDateTimeS.b.c == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = jLongValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime localDateTimeS2 = LocalDateTime.S(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeS2);
            if (localDateTimeS2.b.c == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (localDateTimeS2.a.a == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (iA > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (iA <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = iA / i2;
                sb.append((char) (i3 + 48));
                iA -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
