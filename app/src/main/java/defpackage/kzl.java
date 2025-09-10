package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kzl implements pdn {
    public static final sgv a = sgv.g("kzl");
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock(true);
    public final List c = new ArrayList();
    public String d;
    public pdn e;
    public boolean f;
    public final pdm g;
    public rnu h;
    private final ScheduledExecutorService i;
    private final pfu j;

    public kzl(pfu pfuVar, our ourVar, Executor executor, ScheduledExecutorService scheduledExecutorService, owf owfVar, Map map, int i, String str) {
        this.d = "";
        kzh kzhVar = new kzh(this, 2);
        this.g = kzhVar;
        a.I(true ^ map.isEmpty());
        this.j = pfuVar;
        this.i = scheduledExecutorService;
        if (str != null) {
            pdv pdvVar = (pdv) map.get(str);
            pdvVar.getClass();
            this.e = pfuVar.c(pdvVar, i);
            Stream map2 = Collection.EL.stream(pdvVar.d()).map(new jkv(19));
            int i2 = sbp.d;
            map2.collect(ryv.a);
            this.e.l(kzhVar);
            this.d = str;
        } else {
            this.e = new kzg((pdv) map.values().iterator().next(), i);
        }
        try {
            ourVar.b();
            ourVar.d(owfVar.dK(new kzk(this, map, pfuVar, scheduledExecutorService, executor, 0), executor));
        } catch (RejectedExecutionException e) {
            ((sgt) a.c().M(3845)).v("Error attaching active camera monitor: %s", e.getMessage());
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [sgt, shi] */
    private final void t(pfu pfuVar, pdn pdnVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        if (pdnVar != null) {
            pdnVar.close();
            try {
                scheduledExecutorService.schedule(new hjq(this, z, pdnVar, pfuVar, 2), 210L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                ((sgt) ((sgt) a.c().i(e)).M((char) 3849)).s("Error scheduling stream drain.");
            }
        }
    }

    @Override // defpackage.pdn
    public final int a() {
        return this.e.a();
    }

    @Override // defpackage.pdn
    public final int b() {
        return this.e.b();
    }

    @Override // defpackage.pdn
    public final pdk c() {
        return this.e.c();
    }

    @Override // defpackage.pdn, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            return;
        }
        synchronized (this) {
            this.c.clear();
        }
        paq paqVarR = r(this.b.writeLock());
        try {
            this.f = true;
            this.e.m(this.g);
            t(this.j, this.e, this.i, true);
            paqVarR.close();
        } catch (Throwable th) {
            try {
                paqVarR.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.pdn
    public final pdk d(rwe rweVar) {
        return this.e.d(rweVar);
    }

    @Override // defpackage.pdn
    public final pdk e() {
        return this.e.e();
    }

    @Override // defpackage.pdn
    public final pdk f(rwe rweVar) {
        return this.e.f(rweVar);
    }

    @Override // defpackage.pdn
    public final pdk g() {
        return this.e.g();
    }

    @Override // defpackage.pdn
    public final pdk h() {
        return this.e.h();
    }

    @Override // defpackage.pdn
    public final pdv i() {
        return this.e.i();
    }

    @Override // defpackage.pdn
    public final List j() {
        return this.e.j();
    }

    @Override // defpackage.pdn
    public final List k() {
        return this.e.k();
    }

    @Override // defpackage.pdn
    public final synchronized void l(pdm pdmVar) {
        this.c.add(pdmVar);
    }

    @Override // defpackage.pdn
    public final synchronized void m(pdm pdmVar) {
        this.c.remove(pdmVar);
    }

    @Override // defpackage.pdn
    public final void n(int i) {
        this.e.n(i);
    }

    @Override // defpackage.pdn
    public final boolean o(pdo pdoVar) {
        return this.e.o(pdoVar);
    }

    @Override // defpackage.pdn
    public final void p() {
        throw null;
    }

    @Override // defpackage.pdn
    public final void q(rnu rnuVar) {
        this.h = rnuVar;
        this.e.q(rnuVar);
    }

    public final paq r(Lock lock) {
        lock.lock();
        return new kyc(this, new AtomicBoolean(true), lock, 2);
    }

    public final /* synthetic */ void s(Map map, pfu pfuVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) throws Throwable {
        kzl kzlVar;
        ReentrantReadWriteLock.WriteLock writeLock;
        Thread.currentThread().getId();
        ReentrantReadWriteLock reentrantReadWriteLock = this.b;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (this.f || !map.containsKey(str) || str.equals(this.d)) {
                writeLock = reentrantReadWriteLock.writeLock();
            } else {
                int iA = this.e.a();
                this.e.m(this.g);
                pdn pdnVar = this.e;
                Stream map2 = Collection.EL.stream(pdnVar.i().d()).map(new jkv(19));
                int i = sbp.d;
                map2.collect(ryv.a);
                t(pfuVar, pdnVar, scheduledExecutorService, false);
                kzlVar = this;
                try {
                    hts htsVar = new hts(kzlVar, str, map, pfuVar, iA, 2);
                    htsVar.hashCode();
                    try {
                        executor.execute(htsVar);
                        kzlVar.d = str;
                        return;
                    } catch (RejectedExecutionException e) {
                        ((sgt) ((sgt) a.c().i(e)).M(3858)).v("Error attaching FrameBuffer for camera %s", str);
                        writeLock = kzlVar.b.writeLock();
                    }
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    kzlVar.b.writeLock().unlock();
                    throw th2;
                }
            }
            writeLock.unlock();
        } catch (Throwable th3) {
            th = th3;
            kzlVar = this;
        }
    }
}
