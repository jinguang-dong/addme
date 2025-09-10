package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class s extends AbstractC0017a implements Serializable {
    public static final s c = new s();
    private static final long serialVersionUID = -1440403870442975015L;

    private s() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0018b C(TemporalAccessor temporalAccessor) {
        return j$.time.h.Q(temporalAccessor);
    }

    @Override // j$.time.chrono.AbstractC0017a, j$.time.chrono.l
    public final ChronoLocalDateTime G(TemporalAccessor temporalAccessor) {
        return LocalDateTime.P(temporalAccessor);
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0025i J(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        return ZonedDateTime.s(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    @Override // j$.time.chrono.l
    public final boolean M(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.l
    public final String f() {
        return "ISO";
    }

    @Override // j$.time.chrono.l
    public final String o() {
        return "iso8601";
    }

    @Override // j$.time.chrono.AbstractC0017a, j$.time.chrono.l
    public final InterfaceC0025i q(TemporalAccessor temporalAccessor) {
        return ZonedDateTime.O(temporalAccessor);
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0018b u(int i) {
        return j$.time.h.Z(i, 1, 1);
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.o w(j$.time.temporal.a aVar) {
        return aVar.d;
    }

    public Object writeReplace() {
        return new E((byte) 1, this);
    }

    @Override // j$.time.chrono.l
    public final m y(int i) {
        if (i == 0) {
            return t.BCE;
        }
        if (i == 1) {
            return t.CE;
        }
        throw new j$.time.b("Invalid era: " + i);
    }
}
