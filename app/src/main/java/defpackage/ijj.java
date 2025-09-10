package defpackage;

import android.os.SystemClock;
import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;
import com.google.android.libraries.vision.opengl.Texture;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijj implements ilb {
    private final Map A;
    public final ile a;
    public final AtomicBoolean e;
    public final pql j;
    public float r;
    public ijo s;
    private final ilf t;
    private final pnq u;
    public final iio b = new iio();
    public double c = 0.0d;
    private double v = 0.0d;
    private final TrackerStats w = new TrackerStats();
    public float d = 0.0f;
    private double x = 0.0d;
    public double f = 0.0d;
    public double g = 0.0d;
    public final float[] h = new float[9];
    public boolean i = false;
    public double k = 0.0d;
    public final nmu l = new nmu(10);
    public long m = 0;
    public int n = 0;
    public int o = 0;
    public double p = 0.0d;
    private double y = 0.0d;
    private double z = 0.0d;
    public final Object q = new Object();

    public ijj(ilf ilfVar, ile ileVar, pql pqlVar, pnq pnqVar) {
        EnumMap enumMap = new EnumMap(iji.class);
        this.A = enumMap;
        this.t = ilfVar;
        this.a = ileVar;
        this.u = pnqVar;
        this.j = pqlVar;
        this.e = new AtomicBoolean(false);
        enumMap.put((EnumMap) iji.WHITE, (iji) Float.valueOf(25.0f));
        enumMap.put((EnumMap) iji.RED, (iji) Float.valueOf(35.0f));
    }

    @Override // defpackage.ilb
    public final void a(float[] fArr, long j) {
        float f;
        AtomicBoolean atomicBoolean = this.e;
        if (atomicBoolean.get()) {
            ile ileVar = this.a;
            TrackerStats trackerStats = this.w;
            ikr ikrVar = ileVar.d;
            ikrVar.getTrackerStats(trackerStats);
            i(this.i);
            float captureProgress = ikrVar.getCaptureProgress();
            float f2 = this.d;
            if (captureProgress < 0.0f) {
                if (captureProgress < f2) {
                    this.d = captureProgress;
                    f = captureProgress;
                }
                f = f2;
            } else {
                if (captureProgress > f2) {
                    this.d = captureProgress;
                    f = captureProgress;
                }
                f = f2;
            }
            if ((f2 >= 0.0f && f < 0.0f) || (f2 < 0.0f && f >= 0.0f)) {
                this.v = this.c;
            }
            ijo ijoVar = this.s;
            if (ijoVar != null) {
                if (f >= 1.0f || f <= -1.0f) {
                    ijoVar.e.execute(new hvm(ijoVar, 17, null));
                    return;
                }
                rnt.x(ijoVar);
                double d = this.y - this.x;
                this.f = d;
                if (Math.abs(d) > 25.0d || Math.abs(this.y) > 60.0d) {
                    ijoVar.g(3);
                    atomicBoolean.set(false);
                    return;
                }
                double dA = this.b.a(this.z);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = jElapsedRealtime - this.m;
                if (j2 != 0) {
                    this.m = jElapsedRealtime;
                    this.k = dA;
                    this.l.a((float) (((dA - this.k) / j2) * 1000.0d));
                }
                double dAbs = Math.abs(dA - this.c);
                double dAbs2 = Math.abs(this.v - this.c);
                if (dAbs > dAbs2) {
                    this.v = dA;
                } else {
                    dAbs = dAbs2;
                }
                double dAbs3 = Math.abs(dA - this.v);
                this.g = dAbs3;
                if (dAbs > 30.0d && dAbs3 > 30.0d) {
                    ijoVar.g(5);
                    atomicBoolean.set(false);
                    return;
                }
                int i = 6;
                if (Math.abs(this.l.a) >= 140.0f) {
                    ijoVar.g(6);
                    atomicBoolean.set(false);
                    return;
                }
                if (Math.abs(this.p) > 18.0d) {
                    ijoVar.g(4);
                    atomicBoolean.set(false);
                    return;
                }
                Map map = this.A;
                h(map);
                Float f3 = (Float) map.get(iji.RED);
                if (Math.abs(f()) < (f3 != null ? f3.floatValue() : 35.0f)) {
                    if (Math.abs(this.p) >= 10.0d) {
                        i = 4;
                    } else if (Math.abs(this.f) >= 10.0d || Math.abs(this.y) > 50.0d) {
                        i = 3;
                    } else {
                        i = 1;
                        if (dAbs > 30.0d && this.g > 10.0d) {
                            i = 5;
                        }
                    }
                }
                int i2 = i - 1;
                if (i2 == 2) {
                    ijoVar.d(ijoVar.d.k() ? ijoVar.v : ijoVar.u);
                } else if (i2 == 3) {
                    ijoVar.d(ijoVar.t);
                } else if (i2 == 4) {
                    ijoVar.d(ijoVar.s);
                } else if (i2 == 5) {
                    ijoVar.d(ijoVar.r);
                }
                ijoVar.n = captureProgress;
            }
        }
    }

    public final float f() {
        return this.l.a;
    }

    public final float g() {
        if (this.e.get()) {
            return this.d;
        }
        return 0.0f;
    }

    public final void h(Map map) {
        float f;
        synchronized (this.q) {
            f = this.r;
        }
        float f2 = 35.0f - f;
        float fMax = Math.max(8.0f, 25.0f - f);
        float fMax2 = Math.max(20.0f, f2);
        map.put(iji.WHITE, Float.valueOf(fMax));
        map.put(iji.RED, Float.valueOf(fMax2));
    }

    public final void i(boolean z) {
        float[] fArr = this.h;
        synchronized (fArr) {
            ilf ilfVar = this.t;
            ilfVar.e(fArr);
            this.y = ilfVar.c();
            this.z = ilfVar.a();
            this.p = ilfVar.b();
            if (this.n == 180 || (this.u.l() && this.o == 0)) {
                this.p = -this.p;
            }
            if (z) {
                this.i = false;
                double dA = this.b.a(this.z);
                this.c = dA;
                this.k = dA;
                this.v = dA;
                this.x = this.y;
            }
        }
    }

    public final boolean j() {
        return this.e.get();
    }

    public final boolean k() {
        return this.n % 180 == 0;
    }

    @Override // defpackage.ilb
    public final void d() {
    }

    @Override // defpackage.ilb
    public final void e(iiu iiuVar) {
    }

    @Override // defpackage.ilb
    public final void b(int i, int i2) {
    }

    @Override // defpackage.ilb
    public final void c(Texture texture, ila ilaVar) {
    }
}
