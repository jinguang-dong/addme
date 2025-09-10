package defpackage;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svz {
    public static final Duration a = Duration.ofSeconds(Long.MIN_VALUE);
    public static final Duration b = Duration.ofSeconds(Long.MAX_VALUE, 999999999);

    static {
        Duration.ofMillis(Long.MAX_VALUE);
        Duration.ofMillis(Long.MIN_VALUE);
        b(Long.MAX_VALUE);
        b(Long.MIN_VALUE);
        Duration.ofNanos(Long.MAX_VALUE);
        Duration.ofNanos(Long.MIN_VALUE);
        BigDecimal.valueOf(9.223372036854776E18d);
        BigDecimal.valueOf(-9.223372036854776E18d);
    }

    public static long a(Duration duration) {
        return duration.getSeconds() < -9223372036854L ? rkf.i(rkf.j(duration.getSeconds() + 1, 1000000L), (duration.getNano() / 1000) - 1000000) : rkf.i(rkf.j(duration.getSeconds(), 1000000L), duration.getNano() / 1000);
    }

    public static Duration b(long j) {
        return Duration.of(j, ChronoUnit.MICROS);
    }

    public static boolean c(Duration duration) {
        return (duration.isNegative() || duration.isZero()) ? false : true;
    }
}
