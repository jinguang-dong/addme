package defpackage;

import androidx.wear.ambient.AmbientMode;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class miv {
    public static final sgv a = sgv.g("miv");
    public final miq k;
    public final mky l;
    public mlc m;
    public mkx n;
    public mkv o;
    public boolean q;
    public int s;
    public kcq t;
    public final hbj u;
    public AmbientMode.AmbientController v;
    private int w;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicLong d = new AtomicLong(0);
    public final AtomicLong e = new AtomicLong(0);
    public final AtomicLong f = new AtomicLong(0);
    public final AtomicLong g = new AtomicLong(0);
    public final AtomicLong h = new AtomicLong(0);
    public final AtomicLong i = new AtomicLong(0);
    public final Object j = new Object();
    public syu p = syq.a;
    public int r = 0;

    public miv(hbj hbjVar, owq owqVar, mky mkyVar, our ourVar, miq miqVar) {
        this.w = 0;
        this.u = hbjVar;
        this.n = (mkx) owqVar.dL();
        this.l = mkyVar;
        this.k = miqVar;
        this.w = ((Integer) hbjVar.a(haw.e).get()).intValue();
        ourVar.d(owqVar.dK(new lld(this, 20), ojl.ce()));
    }

    private final long d() {
        return this.i.get();
    }

    final long a() {
        long j = 1;
        if (!c()) {
            return 1L;
        }
        int i = this.w;
        if (i > 0) {
            return i;
        }
        while (d() / j >= 30000) {
            j += j;
        }
        return j;
    }

    public final void b() {
        mlc mlcVar;
        long millis;
        mky mkyVar;
        Object obj = this.j;
        synchronized (obj) {
            mlcVar = this.m;
            mlcVar.getClass();
            millis = TimeUnit.SECONDS.toMillis(this.e.get());
            synchronized (obj) {
                mkyVar = this.l;
            }
        }
        long j = millis / mkyVar.e;
        synchronized (mlcVar.b) {
            mlcVar.p = j;
        }
        long jD = d();
        synchronized (mlcVar.b) {
            mlcVar.q = jD;
        }
        this.g.get();
        synchronized (mlcVar.b) {
        }
        this.e.get();
        this.g.get();
        synchronized (mlcVar.b) {
        }
    }

    final boolean c() {
        boolean zEquals;
        synchronized (this.j) {
            zEquals = this.n.equals(mkx.AUTO);
        }
        return zEquals;
    }
}
