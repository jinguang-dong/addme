package defpackage;

import android.hardware.camera2.CaptureResult;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gcz extends ojl {
    private static final sgv j = sgv.g("gcz");
    private static final Long k = 4000L;
    private final long A;
    private boolean B;
    private final pqn C;
    private final hbj D;
    public long a;
    public final Deque b;
    public final gaw c;
    public final gau d;
    public final gho e;
    public final pbn f;
    public final gks g;
    public boolean h;
    public final cxb i;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;
    private int r;
    private int s;
    private long t;
    private long u;
    private final Queue v;
    private final Optional w;
    private final AtomicBoolean x;
    private final AtomicBoolean y;
    private final long z;

    public gcz(gaw gawVar, cxb cxbVar, hbj hbjVar, gks gksVar, gau gauVar, gho ghoVar, pbn pbnVar) {
        long j2;
        super((short[]) null);
        long j3 = -1;
        this.p = -1L;
        this.v = new ArrayDeque();
        this.b = new ArrayDeque();
        this.x = new AtomicBoolean(true);
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.y = atomicBoolean;
        this.h = false;
        this.c = gawVar;
        this.D = hbjVar;
        this.d = gauVar;
        this.e = ghoVar;
        this.f = pbnVar;
        this.C = pqn.b();
        oxh oxhVar = gawVar.c;
        if (oxhVar != oxh.FPS_AUTO && !gawVar.s && !gawVar.r) {
            j3 = 1000000 / oxhVar.k;
        }
        this.z = j3;
        if (oxhVar.g()) {
            j2 = j3 / 4;
        } else {
            k.longValue();
            j2 = 4000;
        }
        this.A = j2;
        this.i = cxbVar;
        this.g = gksVar;
        gzi gziVar = gym.a;
        this.w = Optional.empty();
        this.l = 1000000 / oxhVar.k;
        if (oxhVar.g()) {
            atomicBoolean.set(false);
        }
    }

    private final synchronized boolean cm(long j2) {
        while (true) {
            Deque deque = this.b;
            if (deque.isEmpty()) {
                return false;
            }
            seo seoVar = (seo) deque.peek();
            seoVar.getClass();
            if (seoVar.a(Long.valueOf(j2))) {
                return true;
            }
            if (seoVar.k() && ((Long) seoVar.h()).longValue() > j2) {
                return false;
            }
            deque.poll();
        }
    }

    @Override // defpackage.ojl
    public final synchronized void a(poe poeVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Long l = (Long) poeVar.a(CaptureResult.SENSOR_TIMESTAMP);
        l.getClass();
        long micros = timeUnit.toMicros(l.longValue());
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        Long l2 = (Long) poeVar.a(CaptureResult.SENSOR_FRAME_DURATION);
        l2.getClass();
        long micros2 = timeUnit2.toMicros(l2.longValue());
        rnt.M(micros2 > 0, "Sensor frame duration should be > 0");
        long j2 = this.z;
        if (j2 != -1) {
            micros2 = j2;
        }
        if (!cm(micros)) {
            this.v.offer(new oye(micros - this.a, micros2));
        }
        AtomicBoolean atomicBoolean = this.y;
        if (atomicBoolean.get()) {
            Queue queue = this.v;
            if (queue.size() > 100 || !this.c.E) {
                while (!queue.isEmpty()) {
                    this.q++;
                    oye oyeVar = (oye) queue.poll();
                    oyeVar.getClass();
                    j(oyeVar.a, oyeVar.b);
                }
            }
        } else {
            long jD = poeVar.d();
            if (this.p != jD) {
                this.p = jD;
                return;
            }
            atomicBoolean.set(true);
            while (true) {
                Queue queue2 = this.v;
                if (queue2.size() <= 2) {
                    break;
                } else {
                    queue2.poll();
                }
            }
        }
    }

    public final synchronized int f() {
        return this.r;
    }

    public final synchronized int g() {
        return this.s;
    }

    public final synchronized long h() {
        return this.q;
    }

    final synchronized void i() {
        while (true) {
            Queue queue = this.v;
            if (!queue.isEmpty()) {
                oye oyeVar = (oye) queue.peek();
                oyeVar.getClass();
                long j2 = this.A;
                if (oyeVar.a - j2 > this.t) {
                    break;
                }
                oye oyeVar2 = (oye) queue.poll();
                oyeVar2.getClass();
                long j3 = this.u;
                long j4 = oyeVar2.a;
                if (j3 - j4 <= j2) {
                    if (!this.B) {
                        this.B = true;
                    }
                    this.q++;
                    j(j4, oyeVar2.b);
                }
            } else {
                break;
            }
        }
    }

    final synchronized void j(long j2, long j3) {
        int i = 0;
        int i2 = 1;
        if (!this.x.compareAndSet(true, false) && j2 > this.o) {
            long j4 = j2 - this.n;
            long j5 = this.m;
            long j6 = this.l;
            rnt.M(j6 > 0, "expectedDelayUs should be > 0");
            int i3 = (int) ((j4 - j5) / j6);
            if (i3 < 0 || i3 > 1000) {
                ((sgt) j.b().M(749)).H("Likely error in frame drop calculation: %d = (%d - %d) / %d", Integer.valueOf(i3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6));
            }
            if (j3 <= this.l || i3 != 1) {
                this.s += i3;
                this.w.ifPresent(new gcy(this, i3, i2));
                if (i3 > this.r) {
                    this.r = i3;
                    this.D.a(gym.j).ifPresent(new gcy(this, i3, i));
                }
                ((sgt) j.c().M(752)).H("Frame presentation time: %d us. Expected FPS: %d. Delay: %d us. Possible frame loss counts: %d", Long.valueOf(j2), Long.valueOf(1000000 / j3), Long.valueOf(j4), Integer.valueOf(i3));
            }
        }
        long j7 = (long) (j3 * 0.4f);
        this.m = j7;
        this.l = j3;
        this.n = j2;
        this.o = j2 + j3 + j7;
    }

    public final synchronized void k(long j2) {
        long micros = TimeUnit.NANOSECONDS.toMicros(this.C.a + TimeUnit.MICROSECONDS.toNanos(j2 / this.c.c.a()));
        this.t = micros;
        if (this.u == 0) {
            this.u = micros;
        }
        i();
    }
}
