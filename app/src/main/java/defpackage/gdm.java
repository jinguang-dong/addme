package defpackage;

import com.google.android.apps.camera.backup.cNHl.ibINv;
import j$.time.Duration;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gdm {
    private static final sgv f = sgv.g("gdm");
    public final mua a;
    public final nqp b;
    public final out c;
    public final rwu d;
    private final Timer g;
    private final Map h = new HashMap();
    public Optional e = Optional.empty();
    private final Map i = new HashMap();
    private final PriorityQueue j = new PriorityQueue();
    private final TimerTask k = new gdk(this);
    private Duration l = Duration.ZERO;
    private int m = -1;

    public gdm(mua muaVar, nqp nqpVar, out outVar, rwu rwuVar, Timer timer) {
        this.a = muaVar;
        this.b = nqpVar;
        this.c = outVar;
        this.d = rwuVar;
        this.g = timer;
    }

    private final void j(int i) {
        Duration durationOfMillis = Duration.ofMillis(this.d.a(TimeUnit.MILLISECONDS));
        this.h.put(Integer.valueOf(i), durationOfMillis.minus(this.l));
        this.l = durationOfMillis;
    }

    public final long a(int i) {
        Map map = this.h;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            return this.d.a(TimeUnit.MILLISECONDS) - this.l.toMillis();
        }
        Duration duration = (Duration) map.get(numValueOf);
        duration.getClass();
        return duration.toMillis();
    }

    public final void b(long j, gdl gdlVar) {
        if (this.d.a) {
            ((sgt) f.c().M(766)).s("New TimedRecordingActions cannot be added after recording started.");
        } else {
            this.i.put(Long.valueOf(j), gdlVar);
        }
    }

    public final synchronized void c(long j) {
        while (true) {
            PriorityQueue priorityQueue = this.j;
            if (!priorityQueue.isEmpty()) {
                Long l = (Long) priorityQueue.peek();
                l.getClass();
                if (l.longValue() > j) {
                    break;
                }
                Long l2 = (Long) priorityQueue.poll();
                l2.getClass();
                Map map = this.i;
                l2.longValue();
                gdl gdlVar = (gdl) map.get(l2);
                gdlVar.getClass();
                gdlVar.a();
                map.remove(l2);
            } else {
                break;
            }
        }
    }

    public final void d(int i) {
        int i2 = this.m;
        if (i2 != -1) {
            j(i2);
        }
        this.m = i;
    }

    public final void e() {
        rwu rwuVar = this.d;
        if (rwuVar.a) {
            rwuVar.f();
            out outVar = this.c;
            mua muaVar = this.a;
            muaVar.getClass();
            outVar.c(new gba(muaVar, 7));
            this.b.E("/video_state_paused", -1L);
        }
    }

    public final void f() {
        rwu rwuVar = this.d;
        if (rwuVar.a) {
            return;
        }
        rwuVar.e();
        out outVar = this.c;
        mua muaVar = this.a;
        muaVar.getClass();
        outVar.c(new gba(muaVar, 8));
        this.b.E("/video_state_resumed", -1L);
    }

    public final void g(oxh oxhVar) {
        this.e = Optional.of(oxhVar);
    }

    public final void h() {
        this.d.e();
        this.j.addAll(this.i.keySet());
        this.g.scheduleAtFixedRate(this.k, 0L, 1000L);
    }

    public final synchronized void i() {
        rwu rwuVar = this.d;
        if (rwuVar.a) {
            rwuVar.f();
        }
        this.j.clear();
        this.i.clear();
        this.e = Optional.empty();
        j(this.m);
        this.b.E(ibINv.gnpUBbetmSRZfl, -1L);
        this.g.cancel();
        this.k.cancel();
    }
}
