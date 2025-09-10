package defpackage;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kpk implements kps, paq {
    public static final sgv a = sgv.g("kpk");
    public final khl d;
    public final lat e;
    public final Executor f;
    public final lfa g;
    public final pbn h;
    public int j;
    public boolean k;
    public final kpd l;
    public final ovx m;
    private final pdn n;
    private final kpi o;
    private paq q;
    private rwd r;
    public final Object b = new Object();
    public final Object c = new Object();
    public boolean i = false;
    private final ExecutorService p = ojl.bZ("waitForFrame");

    public kpk(pdn pdnVar, rww rwwVar, kpd kpdVar, khl khlVar, ovx ovxVar, lat latVar, Executor executor, Set set, pbn pbnVar) {
        this.n = pdnVar;
        this.l = kpdVar;
        this.d = khlVar;
        this.m = ovxVar;
        this.e = latVar;
        this.o = new kpi(this, rwwVar);
        this.f = executor;
        this.g = new lfa(set);
        this.h = pbnVar;
    }

    private final void d() {
        synchronized (this.b) {
            if (this.q != null) {
                pbn pbnVar = this.h;
                pbnVar.f("close");
                paq paqVar = this.q;
                paqVar.getClass();
                paqVar.close();
                pbnVar.g();
                this.q = null;
            }
        }
    }

    private final void e(long j) {
        hcv hcvVar = new hcv(this, j, 8);
        try {
            try {
                this.h.f("waitFuture");
                this.p.submit(hcvVar).get();
            } catch (RejectedExecutionException e) {
                ((sgt) ((sgt) a.b().i(e)).M(3375)).u("Error trying to wait for frame %d", j);
                throw new ExecutionException(e);
            }
        } finally {
            this.h.g();
        }
    }

    @Override // defpackage.kps
    public final rwc a() {
        rwc rwcVarA;
        synchronized (this.c) {
            rwcVarA = this.l.a();
        }
        return rwcVarA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        r6 = new defpackage.rwd(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        r10 = r6;
     */
    @Override // defpackage.kps
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.kpr b(long r8, defpackage.pfz r10, defpackage.pdv r11, defpackage.hxu r12) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpk.b(long, pfz, pdv, hxu):kpr");
    }

    public final void c() {
        ktu ktuVar;
        synchronized (this.b) {
            if (this.i) {
                return;
            }
            if (this.j <= 0 && this.q == null) {
                kpi kpiVar = this.o;
                pdn pdnVar = this.n;
                synchronized (kpiVar.a) {
                    pdnVar.l(kpiVar);
                    kpiVar.b = true;
                    ktuVar = new ktu(kpiVar, pdnVar, 1);
                }
                this.q = ktuVar;
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        Object obj = this.b;
        synchronized (obj) {
            if (this.i) {
                return;
            }
            this.i = true;
            synchronized (obj) {
                this.k = false;
                d();
                this.p.shutdownNow();
                this.o.close();
                this.n.close();
            }
        }
    }
}
