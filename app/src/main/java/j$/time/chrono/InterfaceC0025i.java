package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.Temporal;

/* renamed from: j$.time.chrono.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0025i extends Temporal, Comparable {
    InterfaceC0025i A(ZoneId zoneId);

    InterfaceC0025i e(ZoneId zoneId);

    l getChronology();

    ZoneOffset getOffset();

    ZoneId getZone();

    long toEpochSecond();

    InterfaceC0018b toLocalDate();

    ChronoLocalDateTime toLocalDateTime();

    LocalTime toLocalTime();
}
