package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;

/* renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0018b extends Temporal, TemporalAdjuster, Comparable {
    long E();

    ChronoLocalDateTime F(LocalTime localTime);

    int K();

    /* renamed from: L */
    int compareTo(InterfaceC0018b interfaceC0018b);

    @Override // j$.time.temporal.Temporal
    InterfaceC0018b a(long j, j$.time.temporal.l lVar);

    @Override // j$.time.temporal.Temporal
    InterfaceC0018b b(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.TemporalAccessor
    boolean c(j$.time.temporal.l lVar);

    @Override // j$.time.temporal.Temporal
    long d(Temporal temporal, TemporalUnit temporalUnit);

    l getChronology();

    int hashCode();

    String toString();

    boolean v();

    InterfaceC0018b x(long j, TemporalUnit temporalUnit);
}
