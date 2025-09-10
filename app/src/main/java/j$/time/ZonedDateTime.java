package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.InterfaceC0018b;
import j$.time.chrono.InterfaceC0025i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public final class ZonedDateTime implements Temporal, InterfaceC0025i, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final ZoneId c;

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    public static ZonedDateTime O(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof ZonedDateTime) {
            return (ZonedDateTime) temporalAccessor;
        }
        try {
            ZoneId zoneIdO = ZoneId.O(temporalAccessor);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            return temporalAccessor.c(aVar) ? s(temporalAccessor.D(aVar), temporalAccessor.h(j$.time.temporal.a.NANO_OF_SECOND), zoneIdO) : P(LocalDateTime.R(h.Q(temporalAccessor), LocalTime.Q(temporalAccessor)), zoneIdO, null);
        } catch (b e) {
            throw new b(e.b("Unable to obtain ZonedDateTime from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()), e);
        }
    }

    public static ZonedDateTime P(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.e eVarP = zoneId.P();
        List listF = eVarP.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            Object objE = eVarP.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.U(Duration.ofSeconds(bVar.d.b - bVar.c.b).getSeconds());
            zoneOffset = bVar.d;
        } else if (zoneOffset == null || !listF.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listF.get(0);
            Objects.a(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZonedDateTime s(long j, int i, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.P().d(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.S(j, i, zoneOffsetD), zoneId, zoneOffsetD);
    }

    private Object writeReplace() {
        return new s((byte) 6, this);
    }

    @Override // j$.time.chrono.InterfaceC0025i
    public final InterfaceC0025i A(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        return this.c.equals(zoneId) ? this : P(this.a, zoneId, this.b);
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
        int i = y.a[((j$.time.temporal.a) lVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.D(lVar) : this.b.b : j$.desugar.sun.nio.fs.g.u(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object N(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.m.f ? this.a.a : j$.desugar.sun.nio.fs.g.r(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (ZonedDateTime) temporalUnit.h(this, j);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        int iCompareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        LocalDateTime localDateTime = this.a;
        if (iCompareTo >= 0 && chronoUnit != ChronoUnit.FOREVER) {
            return P(localDateTime.b(j, temporalUnit), zoneId, zoneOffset);
        }
        LocalDateTime localDateTimeB = localDateTime.b(j, temporalUnit);
        Objects.a(localDateTimeB, "localDateTime");
        Objects.a(zoneOffset, "offset");
        Objects.a(zoneId, "zone");
        return zoneId.P().f(localDateTimeB).contains(zoneOffset) ? new ZonedDateTime(localDateTimeB, zoneId, zoneOffset) : s(j$.desugar.sun.nio.fs.g.t(localDateTimeB, zoneOffset), localDateTimeB.b.d, zoneId);
    }

    @Override // j$.time.chrono.InterfaceC0025i
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime e(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        LocalDateTime localDateTime = this.a;
        localDateTime.getClass();
        return s(j$.desugar.sun.nio.fs.g.t(localDateTime, this.b), localDateTime.b.d, zoneId);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (ZonedDateTime) lVar.s(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        int i = y.a[aVar.ordinal()];
        ZoneId zoneId = this.c;
        LocalDateTime localDateTime = this.a;
        if (i == 1) {
            return s(j, localDateTime.b.d, zoneId);
        }
        ZoneOffset zoneOffset = this.b;
        if (i != 2) {
            return P(localDateTime.a(j, lVar), zoneId, zoneOffset);
        }
        ZoneOffset zoneOffsetX = ZoneOffset.X(aVar.d.a(j, aVar));
        return (zoneOffsetX.equals(zoneOffset) || !zoneId.P().f(localDateTime).contains(zoneOffsetX)) ? this : new ZonedDateTime(localDateTime, zoneId, zoneOffsetX);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            return true;
        }
        return lVar != null && lVar.h(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.desugar.sun.nio.fs.g.f(this, (InterfaceC0025i) obj);
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeO = O(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, zonedDateTimeO);
        }
        ZonedDateTime zonedDateTimeE = zonedDateTimeO.e(this.c);
        LocalDateTime localDateTime = zonedDateTimeE.a;
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        int iCompareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
        LocalDateTime localDateTime2 = this.a;
        return (iCompareTo < 0 || chronoUnit == ChronoUnit.FOREVER) ? new o(localDateTime2, this.b).d(new o(localDateTime, zonedDateTimeE.b), temporalUnit) : localDateTime2.d(localDateTime, temporalUnit);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.InterfaceC0025i
    public final j$.time.chrono.l getChronology() {
        return ((h) toLocalDate()).getChronology();
    }

    public int getDayOfMonth() {
        return this.a.a.c;
    }

    public int getHour() {
        return this.a.b.a;
    }

    public int getMinute() {
        return this.a.b.b;
    }

    public int getMonthValue() {
        return this.a.a.b;
    }

    @Override // j$.time.chrono.InterfaceC0025i
    public final ZoneOffset getOffset() {
        return this.b;
    }

    public int getSecond() {
        return this.a.b.c;
    }

    public int getYear() {
        return this.a.a.a;
    }

    @Override // j$.time.chrono.InterfaceC0025i
    public final ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return j$.desugar.sun.nio.fs.g.k(this, lVar);
        }
        int i = y.a[((j$.time.temporal.a) lVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.h(lVar) : this.b.b;
        }
        throw new j$.time.temporal.n("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(h hVar) {
        return P(LocalDateTime.R(hVar, this.a.b), this.c, this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? (lVar == j$.time.temporal.a.INSTANT_SECONDS || lVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) lVar).d : this.a.l(lVar) : lVar.k(this);
    }

    @Override // j$.time.chrono.InterfaceC0025i
    public final /* synthetic */ long toEpochSecond() {
        return j$.desugar.sun.nio.fs.g.u(this);
    }

    @Override // j$.time.chrono.InterfaceC0025i
    public final InterfaceC0018b toLocalDate() {
        return this.a.a;
    }

    @Override // j$.time.chrono.InterfaceC0025i
    public final ChronoLocalDateTime toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0025i
    public final LocalTime toLocalTime() {
        return this.a.b;
    }

    public final String toString() {
        String string = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = string + zoneOffset.c;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }
}
