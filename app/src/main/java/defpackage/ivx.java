package defpackage;

import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ivx {
    public static final sgv a = sgv.g("ivx");
    public final Executor d;
    public final pbn e;
    private final kjc f = new kjc(1);
    public final AtomicInteger b = new AtomicInteger(-1);
    public final Map c = new HashMap();
    private final Set g = new HashSet();
    private final Set h = new HashSet();

    public ivx(pbn pbnVar, Executor executor) {
        this.d = executor;
        this.e = pbnVar;
    }

    public final synchronized void a(int i, boolean z, Runnable runnable) {
        sgv sgvVar = a;
        ((sgt) sgvVar.c().M(2417)).t(OPuAVreQM.NlLaHmvCB, i);
        e(i, runnable);
        if (z) {
            ((sgt) sgvVar.c().M(2418)).t("Marking %s as pending shot in fatal state.", i);
            this.h.add(Integer.valueOf(i));
        }
        b(i, false);
    }

    public final synchronized void b(int i, boolean z) {
        Map map = this.c;
        Integer numValueOf = Integer.valueOf(i);
        ivw ivwVar = (ivw) map.remove(numValueOf);
        if (ivwVar != null) {
            ivwVar.c(z);
        } else {
            if (z) {
                return;
            }
            ((sgt) a.c().M(2419)).t("Aborting un-started stask %s", i);
            this.g.add(numValueOf);
        }
    }

    public final synchronized boolean c(int i, Runnable runnable) throws Throwable {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            Set set = this.g;
            Integer numValueOf = Integer.valueOf(i);
            if (set.remove(numValueOf)) {
                ((sgt) a.c().M(2429)).t("Cannot start task %s, already aborted", i);
                return false;
            }
            ivw ivwVar = new ivw(this, i, new ng(this, i, runnable, 10, (byte[]) null));
            this.c.put(numValueOf, ivwVar);
            this.f.a(ivwVar).c(new cmu(this, i, 18, null), sxo.a);
            return true;
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized int d(int i, String str, Runnable runnable, Runnable runnable2) throws Throwable {
        Throwable th;
        ivx ivxVar;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Map map = this.c;
            Integer numValueOf = Integer.valueOf(i);
            ivw ivwVar = (ivw) map.get(numValueOf);
            if (ivwVar != null) {
                if (!ivwVar.a.isDone()) {
                    ivwVar.d(new glk(this, str, i, runnable, 3), runnable2);
                    return 1;
                }
                ((sgt) a.c().M(2425)).t("Cannot execute, task already done: %s", i);
                runnable2.run();
                return 2;
            }
            try {
                ((sgt) a.c().M(2427)).t("Task not found: %s", i);
                runnable2.run();
                return this.h.contains(numValueOf) ? 3 : 2;
            } catch (Throwable th3) {
                th = th3;
                ivxVar = this;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            ivxVar = this;
            th = th;
            throw th;
        }
    }

    public final synchronized void e(int i, Runnable runnable) {
        d(i, "abortRunnable", runnable, new fij(16));
    }

    public final void f(Runnable runnable) {
        ivw ivwVar = new ivw(this, -1, new ivi(runnable, 3));
        ivwVar.d(new ivi(ivwVar, 4), new fij(17));
        this.f.a(ivwVar).c(new fij(18), sxo.a);
    }
}
