package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lob implements lny {
    private static final sgv b = sgv.g("lob");
    public final hmy a;
    private final lnx[] c;
    private final Object d;
    private final Map e;

    public lob() {
        long jConvert = TimeUnit.SECONDS.convert(30000L, TimeUnit.MILLISECONDS) * 30;
        this.d = new Object();
        int i = (int) jConvert;
        this.a = new hmy(i);
        this.c = new lnx[i];
        this.e = new ConcurrentHashMap();
    }

    private final synchronized void e(lnx lnxVar) {
        for (Map.Entry entry : this.e.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new lmw(entry, 2));
            } catch (RejectedExecutionException e) {
                ((sgt) ((sgt) b.b().i(e)).M(4263)).E("RejectedExecutionException with listener %s on executor %s", entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // defpackage.lny
    public final lnx a(long j) {
        lnx lnxVar;
        synchronized (this.d) {
            int iF = this.a.f(j);
            lnxVar = iF >= 0 ? this.c[iF] : null;
        }
        return lnxVar;
    }

    @Override // defpackage.lny
    public final lnx b(long j) {
        synchronized (this.d) {
            hmy hmyVar = this.a;
            if (hmyVar.d() <= 0) {
                return null;
            }
            int iE = hmyVar.e(hmyVar.b(j));
            int iE2 = hmyVar.e(hmyVar.c(j));
            lnx lnxVar = iE >= 0 ? this.c[iE] : null;
            lnx lnxVar2 = iE2 >= 0 ? this.c[iE2] : null;
            if (lnxVar == null) {
                return lnxVar2;
            }
            if (lnxVar2 == null) {
                return lnxVar;
            }
            if (j - lnxVar.a >= lnxVar2.a - j) {
                lnxVar = lnxVar2;
            }
            return lnxVar;
        }
    }

    public final void d(lnx lnxVar) {
        try {
            synchronized (this.d) {
                this.c[this.a.a(lnxVar.a)] = lnxVar;
            }
            e(lnxVar);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // defpackage.lny
    public final void c() {
    }
}
