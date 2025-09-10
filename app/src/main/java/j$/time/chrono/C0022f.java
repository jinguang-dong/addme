package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0022f implements ChronoLocalDateTime, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient InterfaceC0018b a;
    public final transient LocalTime b;

    public C0022f(InterfaceC0018b interfaceC0018b, LocalTime localTime) {
        Objects.a(localTime, "time");
        this.a = interfaceC0018b;
        this.b = localTime;
    }

    public static C0022f O(l lVar, Temporal temporal) {
        C0022f c0022f = (C0022f) temporal;
        if (lVar.equals(c0022f.a.getChronology())) {
            return c0022f;
        }
        throw new ClassCastException(j$.time.e.b("Chronology mismatch, required: ", lVar.f(), ", actual: ", c0022f.a.getChronology().f()));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 2, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: B */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return O(this.a.getChronology(), j$.time.temporal.m.b(this, j, chronoUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) lVar).D() ? this.b.D(lVar) : this.a.D(lVar) : lVar.l(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: I */
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return j$.desugar.sun.nio.fs.g.e(this, chronoLocalDateTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object N(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.q(this, nVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final C0022f b(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        InterfaceC0018b interfaceC0018b = this.a;
        if (!z) {
            return O(interfaceC0018b.getChronology(), temporalUnit.h(this, j));
        }
        int i = AbstractC0021e.a[((ChronoUnit) temporalUnit).ordinal()];
        LocalTime localTime = this.b;
        switch (i) {
            case 1:
                return Q(this.a, 0L, 0L, 0L, j);
            case 2:
                C0022f c0022fS = S(interfaceC0018b.b(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return c0022fS.Q(c0022fS.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C0022f c0022fS2 = S(interfaceC0018b.b(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return c0022fS2.Q(c0022fS2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return Q(this.a, 0L, 0L, j, 0L);
            case 5:
                return Q(this.a, 0L, j, 0L, 0L);
            case 6:
                return Q(this.a, j, 0L, 0L, 0L);
            case 7:
                C0022f c0022fS3 = S(interfaceC0018b.b(j / 256, (TemporalUnit) ChronoUnit.DAYS), localTime);
                return c0022fS3.Q(c0022fS3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return S(interfaceC0018b.b(j, temporalUnit), localTime);
        }
    }

    public final C0022f Q(InterfaceC0018b interfaceC0018b, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTimeS = this.b;
        if (j5 == 0) {
            return S(interfaceC0018b, localTimeS);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jZ = localTimeS.Z();
        long j10 = j9 + jZ;
        long jF = j$.desugar.sun.nio.fs.g.F(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long jM = j$.desugar.sun.nio.fs.g.M(j10, 86400000000000L);
        if (jM != jZ) {
            localTimeS = LocalTime.S(jM);
        }
        return S(interfaceC0018b.b(jF, (TemporalUnit) ChronoUnit.DAYS), localTimeS);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final C0022f a(long j, j$.time.temporal.l lVar) {
        boolean z = lVar instanceof j$.time.temporal.a;
        InterfaceC0018b interfaceC0018b = this.a;
        if (!z) {
            return O(interfaceC0018b.getChronology(), lVar.s(this, j));
        }
        boolean zD = ((j$.time.temporal.a) lVar).D();
        LocalTime localTime = this.b;
        return zD ? S(interfaceC0018b, localTime.a(j, lVar)) : S(interfaceC0018b.a(j, lVar), localTime);
    }

    public final C0022f S(Temporal temporal, LocalTime localTime) {
        InterfaceC0018b interfaceC0018b = this.a;
        return (interfaceC0018b == temporal && this.b == localTime) ? this : new C0022f(AbstractC0020d.O(interfaceC0018b.getChronology(), temporal), localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar != null && lVar.h(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        return aVar.isDateBased() || aVar.D();
    }

    @Override // j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        InterfaceC0018b interfaceC0018b = this.a;
        ChronoLocalDateTime chronoLocalDateTimeG = interfaceC0018b.getChronology().G(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.a(temporalUnit, "unit");
            return temporalUnit.between(this, chronoLocalDateTimeG);
        }
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        int iCompareTo = ((ChronoUnit) temporalUnit).compareTo(chronoUnit);
        LocalTime localTime = this.b;
        if (iCompareTo >= 0) {
            InterfaceC0018b localDate = chronoLocalDateTimeG.toLocalDate();
            if (chronoLocalDateTimeG.toLocalTime().compareTo(localTime) < 0) {
                localDate = localDate.x(1L, chronoUnit);
            }
            return interfaceC0018b.d(localDate, temporalUnit);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long jD = chronoLocalDateTimeG.D(aVar) - interfaceC0018b.D(aVar);
        switch (AbstractC0021e.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                jD = j$.desugar.sun.nio.fs.g.O(jD, 86400000000000L);
                break;
            case 2:
                jD = j$.desugar.sun.nio.fs.g.O(jD, 86400000000L);
                break;
            case 3:
                jD = j$.desugar.sun.nio.fs.g.O(jD, 86400000L);
                break;
            case 4:
                jD = j$.desugar.sun.nio.fs.g.O(jD, 86400);
                break;
            case 5:
                jD = j$.desugar.sun.nio.fs.g.O(jD, 1440);
                break;
            case 6:
                jD = j$.desugar.sun.nio.fs.g.O(jD, 24);
                break;
            case 7:
                jD = j$.desugar.sun.nio.fs.g.O(jD, 2);
                break;
        }
        return j$.desugar.sun.nio.fs.g.N(jD, localTime.d(chronoLocalDateTimeG.toLocalTime(), temporalUnit));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && j$.desugar.sun.nio.fs.g.e(this, (ChronoLocalDateTime) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final l getChronology() {
        return this.a.getChronology();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) lVar).D() ? this.b.h(lVar) : this.a.h(lVar) : l(lVar).a(D(lVar), lVar);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(j$.time.h hVar) {
        return S(hVar, this.b);
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
        return k.O(zoneOffset, null, this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal s(Temporal temporal) {
        return temporal.a(toLocalDate().E(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().Z(), j$.time.temporal.a.NANO_OF_DAY);
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
}
