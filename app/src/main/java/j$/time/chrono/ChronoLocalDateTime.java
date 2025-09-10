package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC0018b;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;

/* loaded from: classes3.dex */
public interface ChronoLocalDateTime<D extends InterfaceC0018b> extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDateTime<?>> {
    /* renamed from: I */
    int compareTo(ChronoLocalDateTime chronoLocalDateTime);

    l getChronology();

    InterfaceC0025i m(ZoneOffset zoneOffset);

    InterfaceC0018b toLocalDate();

    LocalTime toLocalTime();
}
