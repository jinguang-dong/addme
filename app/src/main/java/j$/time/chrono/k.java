package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public final class k implements InterfaceC0025i, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient C0022f a;
    public final transient ZoneOffset b;
    public final transient ZoneId c;

    public k(ZoneId zoneId, ZoneOffset zoneOffset, C0022f c0022f) {
        Objects.a(c0022f, "dateTime");
        this.a = c0022f;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
        Objects.a(zoneId, "zone");
        this.c = zoneId;
    }

    public static k O(ZoneId zoneId, ZoneOffset zoneOffset, C0022f c0022f) {
        Objects.a(c0022f, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new k(zoneId, (ZoneOffset) zoneId, c0022f);
        }
        j$.time.zone.e eVarP = zoneId.P();
        LocalDateTime localDateTimeP = LocalDateTime.P(c0022f);
        List listF = eVarP.f(localDateTimeP);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() == 0) {
            Object objE = eVarP.e(localDateTimeP);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            c0022f = c0022f.Q(c0022f.a, 0L, 0L, Duration.ofSeconds(bVar.d.b - bVar.c.b).getSeconds(), 0L);
            zoneOffset = bVar.d;
        } else {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            c0022f = c0022f;
        }
        Objects.a(zoneOffset, "offset");
        return new k(zoneId, zoneOffset, c0022f);
    }

    public static k P(l lVar, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.P().d(instant);
        Objects.a(zoneOffsetD, "offset");
        return new k(zoneId, zoneOffsetD, (C0022f) lVar.G(LocalDateTime.S(instant.getEpochSecond(), instant.getNano(), zoneOffsetD)));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static k s(l lVar, Temporal temporal) {
        k kVar = (k) temporal;
        if (lVar.equals(kVar.getChronology())) {
            return kVar;
        }
        throw new ClassCastException(j$.time.e.b("Chronology mismatch, required: ", lVar.f(), ", actual: ", kVar.getChronology().f()));
    }

    private Object writeReplace() {
        return new E((byte) 3, this);
    }

    @Override // j$.time.chrono.InterfaceC0025i
    public final InterfaceC0025i A(ZoneId zoneId) {
        return O(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: B */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return s(getChronology(), j$.time.temporal.m.b(this, j, chronoUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        int i = AbstractC0024h.a[((j$.time.temporal.a) lVar).ordinal()];
        return i != 1 ? i != 2 ? ((C0022f) toLocalDateTime()).D(lVar) : getOffset().b : toEpochSecond();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object N(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.r(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final k b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return s(getChronology(), temporalUnit.h(this, j));
        }
        return s(getChronology(), this.a.b(j, temporalUnit).s(this));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return s(getChronology(), lVar.s(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        int i = AbstractC0026j.a[aVar.ordinal()];
        if (i == 1) {
            return b(j - j$.desugar.sun.nio.fs.g.u(this), ChronoUnit.SECONDS);
        }
        ZoneId zoneId = this.c;
        C0022f c0022f = this.a;
        if (i != 2) {
            return O(zoneId, this.b, c0022f.a(j, lVar));
        }
        ZoneOffset zoneOffsetX = ZoneOffset.X(aVar.d.a(j, aVar));
        c0022f.getClass();
        return P(getChronology(), Instant.ofEpochSecond(j$.desugar.sun.nio.fs.g.t(c0022f, zoneOffsetX), c0022f.b.d), zoneId);
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
        Objects.a(temporal, "endExclusive");
        InterfaceC0025i interfaceC0025iQ = getChronology().q(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.a.d(interfaceC0025iQ.e(this.b).toLocalDateTime(), temporalUnit);
        }
        Objects.a(temporalUnit, "unit");
        return temporalUnit.between(this, interfaceC0025iQ);
    }

    @Override // j$.time.chrono.InterfaceC0025i
    public final InterfaceC0025i e(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        C0022f c0022f = this.a;
        c0022f.getClass();
        return P(getChronology(), Instant.ofEpochSecond(j$.desugar.sun.nio.fs.g.t(c0022f, this.b), c0022f.b.d), zoneId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0025i) && j$.desugar.sun.nio.fs.g.f(this, (InterfaceC0025i) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0025i
    public final l getChronology() {
        return toLocalDate().getChronology();
    }

    @Override // j$.time.chrono.InterfaceC0025i
    public final ZoneOffset getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.InterfaceC0025i
    public final ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int h(j$.time.temporal.l lVar) {
        return j$.desugar.sun.nio.fs.g.k(this, lVar);
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(j$.time.h hVar) {
        return s(getChronology(), hVar.s(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? (lVar == j$.time.temporal.a.INSTANT_SECONDS || lVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) lVar).d : ((C0022f) toLocalDateTime()).l(lVar) : lVar.k(this);
    }

    @Override // j$.time.chrono.InterfaceC0025i
    public final /* synthetic */ long toEpochSecond() {
        return j$.desugar.sun.nio.fs.g.u(this);
    }

    @Override // j$.time.chrono.InterfaceC0025i
    public final InterfaceC0018b toLocalDate() {
        return ((C0022f) toLocalDateTime()).toLocalDate();
    }

    @Override // j$.time.chrono.InterfaceC0025i
    public final ChronoLocalDateTime toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0025i
    public final LocalTime toLocalTime() {
        return ((C0022f) toLocalDateTime()).toLocalTime();
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
