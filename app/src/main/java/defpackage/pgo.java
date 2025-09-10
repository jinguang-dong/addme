package defpackage;

import android.util.Log;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgo implements paq {
    private final pgw a;
    private final our b;
    private final plz c;
    private final pgv d;
    private final Runnable e;
    private final piu f;
    private final pbn g;
    private boolean h = false;
    private boolean i = false;

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, uem] */
    public pgo(pgx pgxVar, pmv pmvVar, pjo pjoVar, pbn pbnVar, plz plzVar, Runnable runnable, pmv pmvVar2, pmg pmgVar, pit pitVar) {
        this.c = plzVar;
        this.e = runnable;
        our ourVar = new our();
        this.b = ourVar;
        piu piuVar = new piu(pjoVar);
        this.f = piuVar;
        if (pitVar.b().h()) {
            piuVar.c(pitVar.a());
        }
        pdt pdtVarA = ((pfn) pgxVar.a).a();
        pgk pgkVar = (pgk) pgxVar.b.a();
        pgkVar.getClass();
        Object objA = pgxVar.c.a();
        pez pezVar = (pez) pgxVar.d.a();
        pezVar.getClass();
        qrh qrhVar = (qrh) pgxVar.e.a();
        qrhVar.getClass();
        ojl ojlVar = (ojl) pgxVar.f.a();
        ojlVar.getClass();
        ((ojl) pgxVar.g.a()).getClass();
        Set set = (Set) pgxVar.h.a();
        set.getClass();
        pgw pgwVar = new pgw(pdtVarA, pgkVar, (rcg) objA, pezVar, qrhVar, ojlVar, set, pmvVar2, pmgVar, piuVar);
        this.a = pgwVar;
        qqq qqqVar = (qqq) pmvVar.b.a();
        qqqVar.getClass();
        pgv pgvVar = new pgv(qqqVar, ((pfm) pmvVar.d).b(), ((pba) pmvVar.a).a(), ((pfn) pmvVar.c).a(), pgwVar, pmgVar);
        this.d = pgvVar;
        ourVar.d(pgvVar);
        this.g = pbnVar;
    }

    public final synchronized pdi a() {
        if (this.h) {
            throw new pco("getConfig3ABuilder() cannot be called after the session is closed.");
        }
        return this.d.a();
    }

    public final synchronized pfg b(pee peeVar) {
        if (this.h) {
            throw new pco("getReprocessingRequestBuilder() cannot be called after the session is closed.");
        }
        return this.a.a(peeVar);
    }

    public final synchronized pfg c() {
        if (this.h) {
            throw new pco("getRequestBuilder() cannot be called after the session is closed.");
        }
        return this.a.b();
    }

    public final synchronized syu d(pen penVar, boolean z) {
        if (this.h) {
            throw new pco("trigger3A() cannot be called after the session is closed.");
        }
        return this.d.b(penVar, z);
    }

    public final synchronized syu e(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.h) {
            throw new pco("unlock3A() cannot be called after the session is closed.");
        }
        return this.d.c(z, z2, z3, z4);
    }

    public final synchronized syu f(pdj pdjVar, boolean z) {
        if (this.h) {
            throw new pco("update3A() cannot be called after the session is closed.");
        }
        return this.d.d(pdjVar, z);
    }

    public final synchronized void g() {
        if (this.h) {
            throw new pco("abortCaptures() cannot be called after the session is closed.");
        }
        this.a.d();
    }

    public final synchronized void h() {
        if (this.h) {
            throw new pco("stopRepeating() cannot be called after the session is closed.");
        }
        this.i = true;
        this.a.e();
    }

    public final synchronized void i(List list, List list2) {
        if (this.h) {
            throw new pco("submit() cannot be called after the session is closed.");
        }
        this.a.f(list, list2);
    }

    public final synchronized void j(pfh pfhVar) {
        if (this.h) {
            throw new pco("setRepeating() cannot be called after the session is closed.");
        }
        this.a.g(pfhVar);
    }

    public final synchronized void k(pfh pfhVar, Set set) {
        if (this.h) {
            throw new pco("submit() cannot be called after the session is closed.");
        }
        this.a.h(pfhVar, set);
    }

    public final synchronized syu l(pdj pdjVar) {
        if (this.h) {
            throw new pco("lock3AImmediately() with config3a cannot be called after the session is closed.");
        }
        return this.d.e(pdjVar);
    }

    public final synchronized void m(pdj pdjVar) {
        if (this.h) {
            throw new pco("updateConfig3AWithLocksRetained() cannot be called after the session is closed.");
        }
        this.d.f(pdjVar);
    }

    public final synchronized void n(pdj pdjVar) {
        if (this.h) {
            throw new pco("submit3A() cannot be called after the session is closed.");
        }
        this.d.g(pdjVar);
    }

    public final synchronized void o(Set set, ojl ojlVar) {
        if (this.h) {
            throw new pco("submit(parameters, listener) cannot be called after the session is closed.");
        }
        pgw pgwVar = this.a;
        pfg pfgVarB = pgwVar.b();
        pfgVarB.f(set);
        pfgVarB.g(ojlVar);
        pgwVar.i(pfgVarB.b());
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.g.f("RPSession#close()");
        this.d.a.shutdownNow();
        synchronized (this) {
            if (!this.h) {
                if (this.i) {
                    try {
                        this.a.g(c().b());
                        this.i = false;
                    } catch (pco e) {
                        Log.e(cdVQ.uVRRdNhzVcITgx, "Failed to resume last repeating request " + e.toString());
                    }
                }
                this.h = true;
                this.b.close();
                this.c.close();
                Runnable runnable = this.e;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        this.g.g();
    }
}
