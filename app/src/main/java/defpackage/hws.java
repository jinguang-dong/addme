package defpackage;

import com.pairip.VMRunner;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hws {
    public static final sgv a = sgv.g("hws");
    private static final Duration d = Duration.ofMillis(15);
    public final pas c;
    private final hgi g;
    private final pbn h;
    private final Object e = new Object();
    public final Object b = new Object();
    private final Object f = new Object();

    public hws(hgm hgmVar, Executor executor, pbn pbnVar) {
        this.g = new hgi(hgmVar, executor);
        this.c = hgmVar.b;
        this.h = pbnVar;
    }

    public final qib a(final lnl lnlVar, final lnl lnlVar2) {
        final szh szhVar;
        qib qibVarD = qib.d();
        if (c()) {
            synchronized (this.e) {
                final hgi hgiVar = this.g;
                szhVar = new szh();
                if (hgiVar.a.i()) {
                    hgiVar.b.execute(new Runnable() { // from class: hgf
                        @Override // java.lang.Runnable
                        public final void run() {
                            hgiVar.d(lnlVar, lnlVar2, szhVar);
                        }
                    });
                } else {
                    szhVar.cancel(false);
                }
            }
            if (szhVar.isCancelled()) {
                TimeUnit.SECONDS.getClass();
            }
            try {
                return (qib) szhVar.t(d.toMillis(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                TimeUnit.SECONDS.getClass();
                Thread.currentThread().interrupt();
            } catch (CancellationException unused2) {
                TimeUnit.SECONDS.getClass();
            } catch (ExecutionException unused3) {
                TimeUnit.SECONDS.getClass();
            } catch (TimeoutException unused4) {
                TimeUnit.SECONDS.getClass();
            }
        }
        return qibVarD;
    }

    public final List b(final lnl lnlVar, final lnl lnlVar2) {
        final szh szhVar;
        ArrayList arrayList = new ArrayList();
        if (c()) {
            synchronized (this.e) {
                final hgi hgiVar = this.g;
                szhVar = new szh();
                if (hgiVar.a.i()) {
                    hgiVar.b.execute(new Runnable() { // from class: hgh
                        @Override // java.lang.Runnable
                        public final void run() {
                            hgiVar.c(lnlVar, lnlVar2, szhVar);
                        }
                    });
                } else {
                    szhVar.cancel(false);
                }
            }
            if (szhVar.isCancelled()) {
                TimeUnit.SECONDS.getClass();
            }
            try {
                return (List) szhVar.t(d.toMillis(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                TimeUnit.SECONDS.getClass();
                Thread.currentThread().interrupt();
            } catch (CancellationException unused2) {
                TimeUnit.SECONDS.getClass();
            } catch (ExecutionException unused3) {
                TimeUnit.SECONDS.getClass();
            } catch (TimeoutException unused4) {
                TimeUnit.SECONDS.getClass();
            }
        }
        return arrayList;
    }

    public final boolean c() {
        boolean zI;
        synchronized (this.e) {
            zI = this.g.a.i();
        }
        return zI;
    }

    public boolean d() {
        return ((Boolean) VMRunner.invoke("IakbbBT7wG2sFi8D", new Object[]{this})).booleanValue();
    }
}
