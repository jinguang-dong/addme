package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruv implements Choreographer.FrameCallback {
    public Duration a;
    public ruz d;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);
    private Instant e = Instant.EPOCH;
    private int f = 0;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        AtomicBoolean atomicBoolean = this.b;
        if (!atomicBoolean.get() && !this.c.get()) {
            long j2 = j / 1000000000;
            Instant instantOfEpochSecond = Instant.ofEpochSecond(j2, j - (1000000000 * j2));
            if (this.e.equals(Instant.EPOCH)) {
                this.e = instantOfEpochSecond;
            }
            if (Duration.between(this.e, instantOfEpochSecond).compareTo(this.a.multipliedBy(this.f + 1).minusNanos(2000000L)) >= 0) {
                this.f++;
                ruz ruzVar = this.d;
                rux ruxVar = ruzVar.b;
                if (ruxVar.b) {
                    ruy ruyVar = ruzVar.d;
                    ruyVar.b();
                    Instant instantNow = Instant.now();
                    if ((ruzVar.g.isAfter(Instant.EPOCH) ? Duration.between(ruzVar.g, instantNow) : ruxVar.h.plusSeconds(1L)).compareTo(ruxVar.h) >= 0) {
                        ruzVar.g = instantNow;
                        double dA = ruyVar.a();
                        double d = ruxVar.f;
                        double d2 = ruxVar.g;
                        if (dA < d || dA > d2) {
                            String str = "StoredVideoFrameProcessor: current output FPS (" + ((int) dA) + ") is outside the allowed range (" + ((int) d) + ", " + ((int) d2) + ").";
                            sgv sgvVar = ruz.a;
                            ((sgt) sgvVar.c().M(5823)).v("%s", str);
                            ((sgt) sgvVar.c().M(5824)).s("SVFP: Output FPS warning");
                        }
                    }
                }
                int i = ruzVar.i;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 != 0) {
                    throw new RuntimeException(null, null);
                }
                Optional optionalOfNullable = Optional.ofNullable((rva) ruzVar.h.get());
                rtl rtlVar = ruzVar.k;
                rtlVar.getClass();
                optionalOfNullable.ifPresent(new mdw(rtlVar, 15));
            }
        }
        if (!atomicBoolean.get()) {
            Choreographer.getInstance().postFrameCallback(this);
        } else {
            Choreographer.getInstance().removeFrameCallback(this);
            Looper.myLooper().quitSafely();
        }
    }
}
