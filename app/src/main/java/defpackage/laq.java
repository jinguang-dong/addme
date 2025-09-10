package defpackage;

import android.hardware.camera2.CaptureResult;
import com.google.googlex.gcam.BurstSpec;
import j$.time.Duration;
import j$.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class laq {
    public static final Duration a = Duration.ofMillis(33);
    private final pjp b;

    public laq(pjp pjpVar) {
        this.b = pjpVar;
    }

    public static final long b(int i) {
        return i * a.toMillis();
    }

    public static final long c(rwc rwcVar, int i, int i2, float f) {
        if (!rwcVar.h() || i <= 0) {
            return 0L;
        }
        long jRound = Math.round(((BurstSpec) rwcVar.c()).a(f));
        return i2 > 0 ? jRound + b(i2) : jRound;
    }

    private static final float d(pjo pjoVar) {
        return Duration.ofNanos(tgq.A(pjoVar)).toMillis();
    }

    public final long a(pjo pjoVar, BurstSpec burstSpec, rwc rwcVar, int i, int i2, int i3, boolean z, poe poeVar) {
        float fD;
        try {
            fD = d(pjoVar);
        } catch (IllegalArgumentException e) {
            Set setKeySet = poeVar.g().keySet();
            if (setKeySet.isEmpty()) {
                throw e;
            }
            fD = d(this.b.a(pjr.b((String) Collection.EL.stream(setKeySet).findFirst().get())));
        }
        long jC = c(rwcVar, i2, i3, fD);
        if (i > 0) {
            long jRound = Math.round(burstSpec.a(fD));
            jC += jRound;
            if (z) {
                jC += jRound / burstSpec.c().a();
            }
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Long l = (Long) poeVar.a(CaptureResult.SENSOR_FRAME_DURATION);
        l.getClass();
        timeUnit.toMillis(l.longValue());
        return jC;
    }
}
