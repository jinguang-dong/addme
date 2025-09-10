package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class o implements Temporal, TemporalAdjuster, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        new o(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        new o(localDateTime2, zoneOffset2);
    }

    public o(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static o O(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.P().d(instant);
        return new o(LocalDateTime.S(instant.getEpochSecond(), instant.getNano(), zoneOffsetD), zoneOffsetD);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 10, this);
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
        int i = n.a[((j$.time.temporal.a) lVar).ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        if (i != 1) {
            return i != 2 ? localDateTime.D(lVar) : zoneOffset.b;
        }
        localDateTime.getClass();
        return j$.desugar.sun.nio.fs.g.t(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object N(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.m.d || nVar == j$.time.temporal.m.e) {
            return this.b;
        }
        if (nVar == j$.time.temporal.m.a) {
            return null;
        }
        j$.desugar.sun.nio.fs.n nVar2 = j$.time.temporal.m.f;
        LocalDateTime localDateTime = this.a;
        return nVar == nVar2 ? localDateTime.a : nVar == j$.time.temporal.m.g ? localDateTime.b : nVar == j$.time.temporal.m.b ? j$.time.chrono.s.c : nVar == j$.time.temporal.m.c ? ChronoUnit.NANOS : nVar.a(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final o b(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? Q(this.a.b(j, temporalUnit), this.b) : (o) temporalUnit.h(this, j);
    }

    public final o Q(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new o(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (o) lVar.s(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        int i = n.a[aVar.ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        return i != 1 ? i != 2 ? Q(localDateTime.a(j, lVar), zoneOffset) : Q(localDateTime, ZoneOffset.X(aVar.d.a(j, aVar))) : O(Instant.ofEpochSecond(j, localDateTime.b.d), zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            return true;
        }
        return lVar != null && lVar.h(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompare;
        o oVar = (o) obj;
        ZoneOffset zoneOffset = oVar.b;
        LocalDateTime localDateTime = oVar.a;
        ZoneOffset zoneOffset2 = this.b;
        boolean zEquals = zoneOffset2.equals(zoneOffset);
        LocalDateTime localDateTime2 = this.a;
        if (zEquals) {
            iCompare = localDateTime2.compareTo(localDateTime);
        } else {
            localDateTime2.getClass();
            long jT = j$.desugar.sun.nio.fs.g.t(localDateTime2, zoneOffset2);
            ZoneOffset zoneOffset3 = oVar.b;
            localDateTime.getClass();
            iCompare = Long.compare(jT, j$.desugar.sun.nio.fs.g.t(localDateTime, zoneOffset3));
            if (iCompare == 0) {
                iCompare = localDateTime2.b.d - localDateTime.b.d;
            }
        }
        return iCompare == 0 ? localDateTime2.compareTo(localDateTime) : iCompare;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [j$.time.o] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        if (temporal instanceof o) {
            temporal = (o) temporal;
        } else {
            try {
                ZoneOffset zoneOffsetU = ZoneOffset.U(temporal);
                h hVar = (h) temporal.N(j$.time.temporal.m.f);
                LocalTime localTime = (LocalTime) temporal.N(j$.time.temporal.m.g);
                temporal = (hVar == null || localTime == null) ? O(Instant.P(temporal), zoneOffsetU) : new o(LocalDateTime.R(hVar, localTime), zoneOffsetU);
            } catch (b e) {
                throw new b(e.b("Unable to obtain OffsetDateTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, temporal);
        }
        ZoneOffset zoneOffset = temporal.b;
        ZoneOffset zoneOffset2 = this.b;
        o oVar = temporal;
        if (!zoneOffset2.equals(zoneOffset)) {
            oVar = new o(temporal.a.U(zoneOffset2.b - zoneOffset.b), zoneOffset2);
        }
        return this.a.d(oVar.a, temporalUnit);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.a.equals(oVar.a) && this.b.equals(oVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.m.a(this, lVar);
        }
        int i = n.a[((j$.time.temporal.a) lVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.h(lVar) : this.b.b;
        }
        throw new j$.time.temporal.n("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(h hVar) {
        return Q(this.a.k(hVar), this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? (lVar == j$.time.temporal.a.INSTANT_SECONDS || lVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) lVar).d : this.a.l(lVar) : lVar.k(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal s(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.a;
        return temporal.a(localDateTime.a.E(), aVar).a(localDateTime.b.Z(), j$.time.temporal.a.NANO_OF_DAY).a(this.b.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }
}
