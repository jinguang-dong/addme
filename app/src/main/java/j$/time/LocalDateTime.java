package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.InterfaceC0018b;
import j$.time.chrono.InterfaceC0025i;
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
public final class LocalDateTime implements Temporal, TemporalAdjuster, ChronoLocalDateTime<h>, Serializable {
    public static final LocalDateTime c = R(h.d, LocalTime.e);
    public static final LocalDateTime d = R(h.e, LocalTime.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final h a;
    public final LocalTime b;

    public LocalDateTime(h hVar, LocalTime localTime) {
        this.a = hVar;
        this.b = localTime;
    }

    public static LocalDateTime P(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).a;
        }
        if (temporalAccessor instanceof o) {
            return ((o) temporalAccessor).a;
        }
        try {
            return new LocalDateTime(h.Q(temporalAccessor), LocalTime.Q(temporalAccessor));
        } catch (b e) {
            throw new b(e.b("Unable to obtain LocalDateTime from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e);
        }
    }

    public static LocalDateTime R(h hVar, LocalTime localTime) {
        Objects.a(hVar, "date");
        Objects.a(localTime, "time");
        return new LocalDateTime(hVar, localTime);
    }

    public static LocalDateTime S(long j, int i, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.B(j2);
        return new LocalDateTime(h.a0(j$.desugar.sun.nio.fs.g.F(j + zoneOffset.b, 86400)), LocalTime.S((((int) j$.desugar.sun.nio.fs.g.M(r5, r7)) * 1000000000) + j2));
    }

    public static LocalDateTime now() {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Instant instant = new a(zoneIdSystemDefault).instant();
        return S(instant.getEpochSecond(), instant.getNano(), zoneIdSystemDefault.P().d(instant));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 5, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: B */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) lVar).D() ? this.b.D(lVar) : this.a.D(lVar) : lVar.l(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? O((LocalDateTime) chronoLocalDateTime) : j$.desugar.sun.nio.fs.g.e(this, chronoLocalDateTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object N(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.m.f ? this.a : j$.desugar.sun.nio.fs.g.q(this, nVar);
    }

    public final int O(LocalDateTime localDateTime) {
        int iO = this.a.O(localDateTime.a);
        return iO == 0 ? this.b.compareTo(localDateTime.b) : iO;
    }

    public final boolean Q(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return O((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long jE = this.a.E();
        long jE2 = chronoLocalDateTime.toLocalDate().E();
        if (jE >= jE2) {
            return jE == jE2 && this.b.Z() < chronoLocalDateTime.toLocalTime().Z();
        }
        return true;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.h(this, j);
        }
        switch (i.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return V(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimePlusDays = plusDays(j / 86400000000L);
                return localDateTimePlusDays.V(localDateTimePlusDays.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimePlusDays2 = plusDays(j / 86400000);
                return localDateTimePlusDays2.V(localDateTimePlusDays2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return U(j);
            case 5:
                return V(this.a, 0L, j, 0L, 0L);
            case 6:
                return V(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimePlusDays3 = plusDays(j / 256);
                return localDateTimePlusDays3.V(localDateTimePlusDays3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return X(this.a.b(j, temporalUnit), this.b);
        }
    }

    public final LocalDateTime U(long j) {
        return V(this.a, 0L, 0L, j, 0L);
    }

    public final LocalDateTime V(h hVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTimeS = this.b;
        if (j5 == 0) {
            return X(hVar, localTimeS);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jZ = localTimeS.Z();
        long j10 = (j9 * j8) + jZ;
        long jF = j$.desugar.sun.nio.fs.g.F(j10, 86400000000000L) + (j7 * j8);
        long jM = j$.desugar.sun.nio.fs.g.M(j10, 86400000000000L);
        if (jM != jZ) {
            localTimeS = LocalTime.S(jM);
        }
        return X(hVar.c0(jF), localTimeS);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (LocalDateTime) lVar.s(this, j);
        }
        boolean zD = ((j$.time.temporal.a) lVar).D();
        LocalTime localTime = this.b;
        h hVar = this.a;
        return zD ? X(hVar, localTime.a(j, lVar)) : X(hVar.a(j, lVar), localTime);
    }

    public final LocalDateTime X(h hVar, LocalTime localTime) {
        return (this.a == hVar && this.b == localTime) ? this : new LocalDateTime(hVar, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar != null && lVar.h(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        return aVar.isDateBased() || aVar.D();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    @Override // j$.time.temporal.Temporal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d(j$.time.temporal.Temporal r11, j$.time.temporal.TemporalUnit r12) {
        /*
            r10 = this;
            j$.time.LocalDateTime r11 = P(r11)
            boolean r0 = r12 instanceof j$.time.temporal.ChronoUnit
            if (r0 == 0) goto Led
            r0 = r12
            j$.time.temporal.ChronoUnit r0 = (j$.time.temporal.ChronoUnit) r0
            j$.time.temporal.ChronoUnit r1 = j$.time.temporal.ChronoUnit.DAYS
            int r0 = r0.compareTo(r1)
            r1 = 1
            j$.time.LocalTime r3 = r10.b
            j$.time.h r4 = r10.a
            if (r0 >= 0) goto Laf
            j$.time.h r0 = r11.a
            j$.time.LocalTime r11 = r11.b
            r4.getClass()
            long r5 = r0.E()
            long r7 = r4.E()
            long r5 = r5 - r7
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L34
            long r11 = r3.d(r11, r12)
            return r11
        L34:
            long r7 = r11.Z()
            long r3 = r3.Z()
            long r7 = r7 - r3
            r3 = 86400000000000(0x4e94914f0000, double:4.26872718006837E-310)
            if (r0 <= 0) goto L47
            long r5 = r5 - r1
            long r7 = r7 + r3
            goto L49
        L47:
            long r5 = r5 + r1
            long r7 = r7 - r3
        L49:
            int[] r11 = j$.time.i.a
            j$.time.temporal.ChronoUnit r12 = (j$.time.temporal.ChronoUnit) r12
            int r12 = r12.ordinal()
            r11 = r11[r12]
            switch(r11) {
                case 1: goto La6;
                case 2: goto L99;
                case 3: goto L8d;
                case 4: goto L80;
                case 5: goto L72;
                case 6: goto L64;
                case 7: goto L57;
                default: goto L56;
            }
        L56:
            goto Laa
        L57:
            r11 = 2
            long r11 = (long) r11
            long r5 = j$.desugar.sun.nio.fs.g.O(r5, r11)
            r11 = 43200000000000(0x274a48a78000, double:2.1343635900342E-310)
            long r7 = r7 / r11
            goto Laa
        L64:
            r11 = 24
            long r11 = (long) r11
            long r5 = j$.desugar.sun.nio.fs.g.O(r5, r11)
            r11 = 3600000000000(0x34630b8a000, double:1.7786363250285E-311)
            long r7 = r7 / r11
            goto Laa
        L72:
            r11 = 1440(0x5a0, float:2.018E-42)
            long r11 = (long) r11
            long r5 = j$.desugar.sun.nio.fs.g.O(r5, r11)
            r11 = 60000000000(0xdf8475800, double:2.96439387505E-313)
            long r7 = r7 / r11
            goto Laa
        L80:
            r11 = 86400(0x15180, float:1.21072E-40)
            long r11 = (long) r11
            long r5 = j$.desugar.sun.nio.fs.g.O(r5, r11)
            r11 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r7 = r7 / r11
            goto Laa
        L8d:
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = j$.desugar.sun.nio.fs.g.O(r5, r11)
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 / r11
            goto Laa
        L99:
            r11 = 86400000000(0x141dd76000, double:4.26872718007E-313)
            long r5 = j$.desugar.sun.nio.fs.g.O(r5, r11)
            r11 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r11
            goto Laa
        La6:
            long r5 = j$.desugar.sun.nio.fs.g.O(r5, r3)
        Laa:
            long r11 = j$.desugar.sun.nio.fs.g.N(r5, r7)
            return r11
        Laf:
            j$.time.h r0 = r11.a
            j$.time.LocalTime r11 = r11.b
            if (r4 == 0) goto Lbf
            r0.getClass()
            int r5 = r0.O(r4)
            if (r5 <= 0) goto Ld8
            goto Lcb
        Lbf:
            long r5 = r0.E()
            long r7 = r4.E()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto Ld8
        Lcb:
            int r5 = r11.compareTo(r3)
            if (r5 >= 0) goto Ld8
            r1 = -1
            j$.time.h r0 = r0.c0(r1)
            goto Le8
        Ld8:
            boolean r5 = r0.V(r4)
            if (r5 == 0) goto Le8
            int r11 = r11.compareTo(r3)
            if (r11 <= 0) goto Le8
            j$.time.h r0 = r0.c0(r1)
        Le8:
            long r11 = r4.d(r0, r12)
            return r11
        Led:
            long r11 = r12.between(r10, r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.LocalDateTime.d(j$.time.temporal.Temporal, j$.time.temporal.TemporalUnit):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.l getChronology() {
        return ((h) toLocalDate()).getChronology();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) lVar).D() ? this.b.h(lVar) : this.a.h(lVar) : j$.time.temporal.m.a(this, lVar);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public boolean isAfter(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return O((LocalDateTime) chronoLocalDateTime) > 0;
        }
        long jE = this.a.E();
        long jE2 = chronoLocalDateTime.toLocalDate().E();
        if (jE <= jE2) {
            return jE == jE2 && this.b.Z() > chronoLocalDateTime.toLocalTime().Z();
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.k(this);
        }
        if (!((j$.time.temporal.a) lVar).D()) {
            return this.a.l(lVar);
        }
        LocalTime localTime = this.b;
        localTime.getClass();
        return j$.time.temporal.m.d(localTime, lVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final InterfaceC0025i m(ZoneOffset zoneOffset) {
        return ZonedDateTime.P(this, zoneOffset, null);
    }

    public LocalDateTime plusDays(long j) {
        return X(this.a.c0(j), this.b);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal s(Temporal temporal) {
        return temporal.a(((h) toLocalDate()).E(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().Z(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final InterfaceC0018b toLocalDate() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: with, reason: merged with bridge method [inline-methods] */
    public LocalDateTime k(TemporalAdjuster temporalAdjuster) {
        return temporalAdjuster instanceof h ? X((h) temporalAdjuster, this.b) : temporalAdjuster instanceof LocalTime ? X(this.a, (LocalTime) temporalAdjuster) : temporalAdjuster instanceof LocalDateTime ? (LocalDateTime) temporalAdjuster : (LocalDateTime) temporalAdjuster.s(this);
    }
}
