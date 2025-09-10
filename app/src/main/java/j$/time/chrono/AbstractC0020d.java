package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.Serializable;

/* renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0020d implements InterfaceC0018b, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static InterfaceC0018b O(l lVar, Temporal temporal) {
        InterfaceC0018b interfaceC0018b = (InterfaceC0018b) temporal;
        if (lVar.equals(interfaceC0018b.getChronology())) {
            return interfaceC0018b;
        }
        throw new ClassCastException(j$.time.e.b("Chronology mismatch, expected: ", lVar.f(), ", actual: ", interfaceC0018b.getChronology().f()));
    }

    @Override // j$.time.chrono.InterfaceC0018b
    public long E() {
        return D(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.InterfaceC0018b
    public ChronoLocalDateTime F(LocalTime localTime) {
        return new C0022f(this, localTime);
    }

    @Override // j$.time.chrono.InterfaceC0018b
    public int K() {
        return v() ? 366 : 365;
    }

    @Override // java.lang.Comparable
    /* renamed from: L */
    public final /* synthetic */ int compareTo(InterfaceC0018b interfaceC0018b) {
        return j$.desugar.sun.nio.fs.g.d(this, interfaceC0018b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object N(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.p(this, nVar);
    }

    public m P() {
        return getChronology().y(j$.time.temporal.m.a(this, j$.time.temporal.a.ERA));
    }

    public final long Q(InterfaceC0018b interfaceC0018b) {
        if (getChronology().w(j$.time.temporal.a.MONTH_OF_YEAR).d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long jD = D(aVar) * 32;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((interfaceC0018b.D(aVar) * 32) + interfaceC0018b.h(aVar2)) - (jD + j$.time.temporal.m.a(this, aVar2))) / 32;
    }

    public abstract InterfaceC0018b R(long j);

    public abstract InterfaceC0018b S(long j);

    public abstract InterfaceC0018b T(long j);

    @Override // j$.time.temporal.Temporal
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public InterfaceC0018b k(TemporalAdjuster temporalAdjuster) {
        return O(getChronology(), temporalAdjuster.s(this));
    }

    @Override // j$.time.chrono.InterfaceC0018b, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean c(j$.time.temporal.l lVar) {
        return j$.desugar.sun.nio.fs.g.n(this, lVar);
    }

    @Override // j$.time.chrono.InterfaceC0018b, j$.time.temporal.Temporal
    public final long d(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        InterfaceC0018b interfaceC0018bC = getChronology().C(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.a(temporalUnit, "unit");
            return temporalUnit.between(this, interfaceC0018bC);
        }
        switch (AbstractC0019c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return interfaceC0018bC.E() - E();
            case 2:
                return (interfaceC0018bC.E() - E()) / 7;
            case 3:
                return Q(interfaceC0018bC);
            case 4:
                return Q(interfaceC0018bC) / 12;
            case 5:
                return Q(interfaceC0018bC) / 120;
            case 6:
                return Q(interfaceC0018bC) / 1200;
            case 7:
                return Q(interfaceC0018bC) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return interfaceC0018bC.D(aVar) - D(aVar);
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0018b) && j$.desugar.sun.nio.fs.g.d(this, (InterfaceC0018b) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int h(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.a(this, lVar);
    }

    @Override // j$.time.chrono.InterfaceC0018b
    public int hashCode() {
        long jE = E();
        return getChronology().hashCode() ^ ((int) (jE ^ (jE >>> 32)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.d(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final /* synthetic */ Temporal s(Temporal temporal) {
        return j$.desugar.sun.nio.fs.g.a(this, temporal);
    }

    @Override // j$.time.chrono.InterfaceC0018b
    public final String toString() {
        long jD = D(j$.time.temporal.a.YEAR_OF_ERA);
        long jD2 = D(j$.time.temporal.a.MONTH_OF_YEAR);
        long jD3 = D(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(P());
        sb.append(" ");
        sb.append(jD);
        sb.append(jD2 < 10 ? "-0" : "-");
        sb.append(jD2);
        sb.append(jD3 < 10 ? "-0" : "-");
        sb.append(jD3);
        return sb.toString();
    }

    @Override // j$.time.chrono.InterfaceC0018b
    public boolean v() {
        return getChronology().M(D(j$.time.temporal.a.YEAR));
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC0018b x(long j, TemporalUnit temporalUnit) {
        return O(getChronology(), j$.time.temporal.m.b(this, j, temporalUnit));
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC0018b a(long j, j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
        }
        return O(getChronology(), lVar.s(this, j));
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC0018b b(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (z) {
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
            return O(getChronology(), temporalUnit.h(this, j));
        }
        switch (AbstractC0019c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return R(j);
            case 2:
                return R(j$.desugar.sun.nio.fs.g.O(j, 7));
            case 3:
                return S(j);
            case 4:
                return T(j);
            case 5:
                return T(j$.desugar.sun.nio.fs.g.O(j, 10));
            case 6:
                return T(j$.desugar.sun.nio.fs.g.O(j, 100));
            case 7:
                return T(j$.desugar.sun.nio.fs.g.O(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(j$.desugar.sun.nio.fs.g.N(D(aVar), j), (j$.time.temporal.l) aVar);
            default:
                throw new j$.time.temporal.n("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }
}
