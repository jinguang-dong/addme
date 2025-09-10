package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lzd implements lzg {
    private ScheduledFuture a;
    private final String b;
    private final AtomicBoolean c;
    private boolean d;
    private lzl e;
    private final int f;
    private int g;
    private int h;
    private int i;
    protected final ScheduledExecutorService j;
    private int k;
    private lzm l;
    private final ocq m;

    public lzd(ScheduledExecutorService scheduledExecutorService, ocq ocqVar, String str) {
        this(scheduledExecutorService, ocqVar, str, 3);
    }

    protected abstract lzc a();

    protected abstract boolean b(poe poeVar);

    @Override // defpackage.lzg
    public void d(pjo pjoVar) {
        e();
        this.k = 0;
    }

    @Override // defpackage.lzh
    public final void dM() {
        ScheduledFuture scheduledFuture = this.a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void e() {
        lzm lzmVar;
        if (!this.c.compareAndSet(true, false) || (lzmVar = this.l) == null) {
            return;
        }
        lzmVar.a();
    }

    @Override // defpackage.lzh
    public void eZ(lzm lzmVar) {
        this.l = lzmVar;
        lzc lzcVarA = a();
        lzl lzlVarA = lzcVarA.c;
        Runnable runnable = lzlVarA.h;
        if (runnable != null) {
            lzk lzkVar = new lzk(lzlVarA);
            lzkVar.f = new lsn(this, runnable, 11);
            lzlVarA = lzkVar.a();
        }
        this.e = lzlVarA;
        this.g = lzcVarA.a;
        this.i = lzcVarA.b;
    }

    @Override // defpackage.lzh
    public void f() {
        this.c.set(false);
    }

    @Override // defpackage.lzg
    public final void h(poe poeVar) {
        int iMin;
        lzm lzmVar;
        lzm lzmVar2;
        int i = this.h + 1;
        this.h = i;
        if (i < this.g) {
            return;
        }
        this.h = 0;
        if (b(poeVar)) {
            iMin = Math.min(this.k + 1, this.i);
            this.k = iMin;
        } else {
            this.k = 0;
            iMin = 0;
        }
        if (iMin == this.i && !this.d) {
            this.d = true;
            if (this.m.an(this.b, this.f)) {
                if (!this.c.compareAndSet(false, true) || (lzmVar2 = this.l) == null) {
                    return;
                }
                lzmVar2.b(this.e);
                return;
            }
        }
        if (!this.c.compareAndSet(true, false) || (lzmVar = this.l) == null) {
            return;
        }
        long j = this.e.a;
        if (j == 0) {
            this.a = this.j.schedule(new lmw(lzmVar, 18), 1000L, TimeUnit.MILLISECONDS);
        } else if (j > 0) {
            this.a = this.j.schedule(new lmw(lzmVar, 18), j, TimeUnit.MILLISECONDS);
        } else {
            lzmVar.a();
        }
    }

    public lzd(ScheduledExecutorService scheduledExecutorService, ocq ocqVar, String str, int i) {
        this.j = scheduledExecutorService;
        this.c = new AtomicBoolean(false);
        this.m = ocqVar;
        this.b = str;
        this.f = i;
    }

    @Override // defpackage.lzh
    public final void fa() {
    }
}
