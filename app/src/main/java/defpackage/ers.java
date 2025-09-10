package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ers {
    final Map a;
    public final ReferenceQueue b;
    public volatile boolean c;
    public volatile erq d;

    public ers() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new erp());
        this.a = new HashMap();
        this.b = new ReferenceQueue();
        executorServiceNewSingleThreadExecutor.execute(new dzd(this, 13, null));
    }

    public final synchronized esq a(eqi eqiVar) {
        err errVar = (err) this.a.get(eqiVar);
        if (errVar == null) {
            return null;
        }
        esq esqVar = (esq) errVar.get();
        if (esqVar == null) {
            c(errVar);
        }
        return esqVar;
    }

    public final synchronized void b(eqi eqiVar, esq esqVar) {
        err errVar = (err) this.a.put(eqiVar, new err(eqiVar, esqVar, this.b));
        if (errVar != null) {
            errVar.a();
        }
    }

    public final void c(err errVar) {
        synchronized (this) {
            this.a.remove(errVar.a);
            if (errVar.b) {
                esw eswVar = errVar.c;
            }
        }
    }

    final synchronized void d(eqi eqiVar) {
        err errVar = (err) this.a.remove(eqiVar);
        if (errVar != null) {
            errVar.a();
        }
    }
}
