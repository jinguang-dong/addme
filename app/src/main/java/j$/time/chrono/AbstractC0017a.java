package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;

/* renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0017a implements l {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        new Locale("ja", "JP", "JP");
    }

    public static l h(l lVar, String str) {
        String strO;
        l lVar2 = (l) a.putIfAbsent(str, lVar);
        if (lVar2 == null && (strO = lVar.o()) != null) {
            b.putIfAbsent(strO, lVar);
        }
        return lVar2;
    }

    @Override // j$.time.chrono.l
    public ChronoLocalDateTime G(TemporalAccessor temporalAccessor) {
        try {
            return C(temporalAccessor).F(LocalTime.Q(temporalAccessor));
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ".concat(String.valueOf(temporalAccessor.getClass())), e);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return f().compareTo(((l) obj).f());
    }

    @Override // j$.time.chrono.l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC0017a) && f().compareTo(((AbstractC0017a) obj).f()) == 0;
    }

    @Override // j$.time.chrono.l
    public final int hashCode() {
        return getClass().hashCode() ^ f().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [j$.time.chrono.i] */
    @Override // j$.time.chrono.l
    public InterfaceC0025i q(TemporalAccessor temporalAccessor) {
        try {
            ZoneId zoneIdO = ZoneId.O(temporalAccessor);
            try {
                temporalAccessor = J(Instant.P(temporalAccessor), zoneIdO);
                return temporalAccessor;
            } catch (j$.time.b unused) {
                return k.O(zoneIdO, null, C0022f.O(this, G(temporalAccessor)));
            }
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ".concat(String.valueOf(temporalAccessor.getClass())), e);
        }
    }

    @Override // j$.time.chrono.l
    public final String toString() {
        return f();
    }
}
