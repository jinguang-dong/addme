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
public final class q implements Temporal, TemporalAdjuster, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final LocalTime a;
    public final ZoneOffset b;

    static {
        LocalTime localTime = LocalTime.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localTime.getClass();
        new q(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localTime2.getClass();
        new q(localTime2, zoneOffset2);
    }

    public q(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.a(localTime, "time");
        this.a = localTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 9, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: B */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, chronoUnit).b(1L, chronoUnit) : b(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.OFFSET_SECONDS ? this.b.b : this.a.D(lVar) : lVar.l(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object N(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.m.d || nVar == j$.time.temporal.m.e) {
            return this.b;
        }
        if (((nVar == j$.time.temporal.m.a) || (nVar == j$.time.temporal.m.b)) || nVar == j$.time.temporal.m.f) {
            return null;
        }
        return nVar == j$.time.temporal.m.g ? this.a : nVar == j$.time.temporal.m.c ? ChronoUnit.NANOS : nVar.a(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final q b(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? Q(this.a.b(j, temporalUnit), this.b) : (q) temporalUnit.h(this, j);
    }

    public final long P() {
        return this.a.Z() - (this.b.b * 1000000000);
    }

    public final q Q(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.a == localTime && this.b.equals(zoneOffset)) ? this : new q(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (q) lVar.s(this, j);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        LocalTime localTime = this.a;
        if (lVar != aVar) {
            return Q(localTime.a(j, lVar), this.b);
        }
        j$.time.temporal.a aVar2 = (j$.time.temporal.a) lVar;
        return Q(localTime, ZoneOffset.X(aVar2.d.a(j, aVar2)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) lVar).D() || lVar == j$.time.temporal.a.OFFSET_SECONDS : lVar != null && lVar.h(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q qVar = (q) obj;
        ZoneOffset zoneOffset = qVar.b;
        LocalTime localTime = qVar.a;
        boolean zEquals = this.b.equals(zoneOffset);
        LocalTime localTime2 = this.a;
        if (zEquals) {
            return localTime2.compareTo(localTime);
        }
        int iCompare = Long.compare(P(), qVar.P());
        return iCompare == 0 ? localTime2.compareTo(localTime) : iCompare;
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        q qVar;
        if (temporal instanceof q) {
            qVar = (q) temporal;
        } else {
            try {
                qVar = new q(LocalTime.Q(temporal), ZoneOffset.U(temporal));
            } catch (b e) {
                throw new b(e.b("Unable to obtain OffsetTime from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, qVar);
        }
        long jP = qVar.P() - P();
        switch (p.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jP;
            case 2:
                return jP / 1000;
            case 3:
                return jP / 1000000;
            case 4:
                return jP / 1000000000;
            case 5:
                return jP / 60000000000L;
            case 6:
                return jP / 3600000000000L;
            case 7:
                return jP / 43200000000000L;
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.a.equals(qVar.a) && this.b.equals(qVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.a(this, lVar);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(h hVar) {
        return (q) j$.desugar.sun.nio.fs.g.a(hVar, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.k(this);
        }
        if (lVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return ((j$.time.temporal.a) lVar).d;
        }
        LocalTime localTime = this.a;
        localTime.getClass();
        return j$.time.temporal.m.d(localTime, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal s(Temporal temporal) {
        return temporal.a(this.a.Z(), j$.time.temporal.a.NANO_OF_DAY).a(this.b.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }
}
