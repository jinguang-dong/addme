package defpackage;

import com.bumptech.glide.qd.MyBPCgKwEjJI;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgq implements paq {
    public Runnable a;
    private final our b;
    private final pmb c;
    private final uem d;
    private final pit e;
    private final piu f;
    private final pbn g;
    private pgo h;
    private boolean i;
    private final pmv j;
    private final pmv k;

    public pgq(pmv pmvVar, our ourVar, pmv pmvVar2, uem uemVar, pjo pjoVar, pit pitVar, pbn pbnVar) {
        this.j = pmvVar;
        this.b = ourVar;
        this.k = pmvVar2;
        this.d = uemVar;
        pmb pmbVar = new pmb(1L);
        ourVar.d(pmbVar);
        this.c = pmbVar;
        this.e = pitVar;
        piu piuVar = new piu(pjoVar);
        this.f = piuVar;
        if (pitVar.b().h()) {
            piuVar.c(pitVar.a());
        }
        this.g = pbnVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, uem] */
    private final pgo c(plz plzVar) {
        pgo pgoVar;
        pgo pgoVar2;
        synchronized (this) {
            if (this.b.b() || this.i) {
                plzVar.close();
                throw new pco("FrameServer is closed.");
            }
            pgoVar = this.h;
        }
        if (pgoVar != null) {
            pgoVar.close();
        }
        synchronized (this) {
            pmv pmvVar = this.k;
            Runnable runnable = this.a;
            pmv pmvVar2 = this.j;
            pmg pmgVarB = ((pgu) this.d).a();
            pit pitVar = this.e;
            Object objA = pmvVar.b.a();
            Object objA2 = pmvVar.c.a();
            pjo pjoVarB = ((pfm) pmvVar.d).b();
            pbn pbnVar = (pbn) pmvVar.a.a();
            pbnVar.getClass();
            plzVar.getClass();
            pmvVar2.getClass();
            pitVar.getClass();
            pgoVar2 = new pgo((pgx) objA, (pmv) objA2, pjoVarB, pbnVar, plzVar, runnable, pmvVar2, pmgVarB, pitVar);
            this.h = pgoVar2;
        }
        return pgoVar2;
    }

    public final pgo b() {
        pbn pbnVar = this.g;
        pbnVar.f("RPSessionManager#tryAcquireSession");
        plz plzVarB = this.c.b(1L);
        pgo pgoVarC = null;
        if (plzVarB == null) {
            pbnVar.g();
            return null;
        }
        try {
            pgoVarC = c(plzVarB);
        } catch (pco unused) {
        } catch (Throwable th) {
            this.g.g();
            throw th;
        }
        this.g.g();
        return pgoVarC;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.i) {
                return;
            }
            this.i = true;
            pgo pgoVar = this.h;
            this.h = null;
            if (pgoVar != null) {
                pgoVar.close();
            }
        }
    }

    public final pgo a() {
        this.g.f(MyBPCgKwEjJI.qZsDcsKyWSIM);
        syu syuVarC = this.c.c(1L);
        try {
            try {
                try {
                    return c((plz) syuVarC.get());
                } catch (InterruptedException e) {
                    syuVarC.cancel(true);
                    try {
                        ((plz) ske.U(syuVarC)).close();
                    } catch (CancellationException unused) {
                    } catch (ExecutionException e2) {
                        e.addSuppressed(e2);
                    }
                    throw e;
                }
            } catch (ExecutionException e3) {
                throw new pco(e3);
            }
        } finally {
            this.g.g();
        }
    }
}
