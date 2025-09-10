package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;

/* loaded from: classes3.dex */
public interface l extends Comparable {
    InterfaceC0018b C(TemporalAccessor temporalAccessor);

    ChronoLocalDateTime G(TemporalAccessor temporalAccessor);

    InterfaceC0025i J(Instant instant, ZoneId zoneId);

    boolean M(long j);

    boolean equals(Object obj);

    String f();

    int hashCode();

    String o();

    InterfaceC0025i q(TemporalAccessor temporalAccessor);

    String toString();

    InterfaceC0018b u(int i);

    j$.time.temporal.o w(j$.time.temporal.a aVar);

    m y(int i);
}
