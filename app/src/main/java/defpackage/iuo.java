package defpackage;

import j$.time.Duration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuo {
    public static final Duration a;
    private static final sgv d;
    public final uem b;
    public final ScheduledExecutorService c;
    private syu e;
    private szh f;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        durationOfSeconds.getClass();
        a = durationOfSeconds;
        d = sgv.g("iuo");
    }

    public iuo(uem uemVar, ScheduledExecutorService scheduledExecutorService) {
        uemVar.getClass();
        scheduledExecutorService.getClass();
        this.b = uemVar;
        this.c = scheduledExecutorService;
    }

    private final synchronized syu d() {
        syu syuVar;
        syuVar = this.e;
        this.e = null;
        return syuVar;
    }

    public final srg a() {
        srg srgVar;
        try {
            syu syuVarD = d();
            if (syuVarD != null && (srgVar = (srg) syuVarD.get(0L, TimeUnit.MILLISECONDS)) != null) {
                return srgVar;
            }
            return ezh.G();
        } catch (CancellationException unused) {
            return ezh.G();
        } catch (TimeoutException unused2) {
            return ezh.G();
        }
    }

    public final synchronized syu b(szh szhVar) {
        szh szhVar2;
        szhVar2 = this.f;
        this.f = szhVar;
        return szhVar2;
    }

    public final synchronized void c() {
        szh szhVar = this.f;
        if (szhVar != null) {
            szhVar.f(((iun) this.b).a().a(iuh.c));
            return;
        }
        if (this.e != null) {
            ((sgt) d.c().M(2325)).s("Lap log is requested but the scope is not clear. Overwriting.");
        }
        this.e = ((iun) this.b).a().a(iuh.a);
    }
}
