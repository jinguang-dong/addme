package defpackage;

import android.os.Handler;
import com.bumptech.glide.qd.MyBPCgKwEjJI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jpp implements AutoCloseable {
    public static final sgv a = sgv.g(MyBPCgKwEjJI.yIQngsKuPSuurE);
    private hvh H;
    private joo M;
    public final joc b;
    public final jpb c;
    public final Handler d;
    public final Handler e;
    public final rwc f;
    public final jpa g;
    public final qin o;
    public qju p;
    public qkr q;
    public final jqb t;
    public final lgj u;
    private final rwc w;
    private volatile jps y;
    private final pmv N = ojl.bb(((int) TimeUnit.SECONDS.convert(3000000, TimeUnit.MICROSECONDS)) * 60);
    private final AtomicBoolean v = new AtomicBoolean(false);
    private final qib x = qib.d();
    public volatile boolean h = false;
    private final AtomicLong z = new AtomicLong();
    private final AtomicLong A = new AtomicLong();
    public final AtomicLong i = new AtomicLong();
    public final AtomicLong j = new AtomicLong();
    public final AtomicLong k = new AtomicLong();
    private final AtomicLong B = new AtomicLong();
    private final AtomicLong C = new AtomicLong();
    private final AtomicLong D = new AtomicLong();
    private final AtomicLong E = new AtomicLong();
    public final AtomicLong l = new AtomicLong();
    private final AtomicLong F = new AtomicLong();
    private final AtomicLong G = new AtomicLong();
    public final AtomicInteger m = new AtomicInteger();
    public final AtomicInteger n = new AtomicInteger();
    private final AtomicInteger I = new AtomicInteger();
    public boolean r = false;
    public boolean s = false;
    private volatile long J = 0;
    private volatile long K = 0;
    private List L = new ArrayList();

    public jpp(iso isoVar, joc jocVar, jqb jqbVar, jpa jpaVar, jpb jpbVar, rwc rwcVar, jpw jpwVar) {
        gzi gziVar = gzz.a;
        this.b = jocVar;
        this.t = jqbVar;
        this.g = jpaVar;
        this.c = jpbVar;
        this.e = ojl.cg(new our(), "mv-vid-encode");
        this.d = ojl.cg(new our(), "mv-vid-update");
        this.f = rwcVar;
        qin qinVarG = isoVar.g("stabilized-vid-track");
        this.o = qinVarG;
        this.u = new lgj(qinVarG, jpaVar.a(), 1);
        hvh hvhVar = new hvh(qinVarG, 1);
        this.H = hvhVar;
        this.p = hvhVar.a();
        this.q = this.H.b(Collections.singletonList(qib.d()));
        this.w = !((Boolean) jpwVar.b.get()).booleanValue() ? rvk.a : rwc.j(jpw.a);
        gzi gziVar2 = gzo.a;
    }

    private final void g() {
        this.s = false;
        this.c.b(false);
        f();
        this.z.set(0L);
        this.A.set(0L);
        this.i.set(0L);
        this.j.set(0L);
        this.B.set(0L);
        this.D.set(0L);
        this.E.set(0L);
    }

    public final jot a(long j) {
        jot jotVar;
        pmv pmvVar = this.N;
        synchronized (pmvVar) {
            jotVar = (jot) pmvVar.k(j);
            if (jotVar == null) {
                jotVar = new jot(j, new szh(), new szh());
                pmvVar.o(j, jotVar);
            }
        }
        return jotVar;
    }

    public final void b() {
        if (this.h) {
            return;
        }
        this.d.post(new jmr(this, 10));
    }

    public final void c() {
        if (this.v.getAndSet(true)) {
            ((sgt) a.c().M(3010)).s("Shutdown already called. Skipping additional requests.");
            return;
        }
        f();
        jpa jpaVar = this.g;
        syu syuVarB = jpaVar != null ? jpaVar.b() : ske.M(null);
        jsv.a("VideoTrackSampler", syuVarB);
        syuVarB.c(new jmr(this, 9), sxo.a);
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.h) {
            ((sgt) a.c().M(3002)).s("Trying to close after handler shutdown");
            return;
        }
        Iterator it = this.b.g(this.K).iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            rwc rwcVar = this.f;
            if (rwcVar.h()) {
                ((hgj) rwcVar.c()).e(jLongValue);
            }
            b();
        }
        this.d.post(new jmr(this, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x027b A[Catch: all -> 0x0064, ExecutionException -> 0x02a8, TryCatch #2 {ExecutionException -> 0x02a8, blocks: (B:60:0x0137, B:62:0x014b, B:64:0x0150, B:66:0x0158, B:68:0x0167, B:70:0x0171, B:71:0x0182, B:73:0x0188, B:75:0x019a, B:77:0x01a2, B:80:0x01bc, B:79:0x01a6, B:81:0x01c9, B:85:0x01da, B:87:0x0204, B:88:0x0209, B:89:0x0219, B:99:0x0265, B:92:0x022e, B:94:0x0248, B:95:0x024c, B:97:0x0254, B:98:0x025b, B:100:0x026a, B:102:0x026e, B:105:0x0277, B:107:0x0284, B:109:0x029e, B:111:0x02a4, B:106:0x027b, B:67:0x015f, B:108:0x0294), top: B:131:0x0137, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 715
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpp.d():void");
    }

    public final synchronized void e(qfc qfcVar, joo jooVar) {
        this.M = jooVar;
        jpo jpoVar = new jpo(this, jooVar, 0);
        Handler handler = this.e;
        this.g.c(qfcVar, this.o, jpoVar, handler);
        this.c.b(true);
    }

    public final void f() {
        this.z.get();
        this.A.get();
        this.i.get();
        this.j.get();
        this.k.get();
        this.D.get();
        this.E.get();
        this.F.get();
        this.G.get();
        this.C.get();
        this.m.get();
    }
}
