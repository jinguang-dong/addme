package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eso implements fbc {
    public eqi c;
    public boolean d;
    public boolean e;
    public esw f;
    public boolean g;
    ess h;
    public boolean i;
    esq j;
    public volatile boolean k;
    int l;
    public final ree m;
    public final ree n;
    private final cnj o;
    private final eue p;
    private final eue q;
    private final eue r;
    private boolean t;
    private esa u;
    final esn a = new esn(new ArrayList(2));
    public final fbf b = new fbf();
    private final AtomicInteger s = new AtomicInteger();

    public eso(eue eueVar, eue eueVar2, eue eueVar3, ree reeVar, ree reeVar2, cnj cnjVar) {
        this.p = eueVar;
        this.q = eueVar2;
        this.r = eueVar3;
        this.n = reeVar;
        this.m = reeVar2;
        this.o = cnjVar;
    }

    private final boolean j() {
        return this.i || this.g || this.k;
    }

    public final eue b() {
        return this.t ? this.r : this.q;
    }

    final void c() {
        esq esqVar;
        synchronized (this) {
            this.b.a();
            eoz.g(j(), "Not yet complete!");
            int iDecrementAndGet = this.s.decrementAndGet();
            eoz.g(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                esqVar = this.j;
                e();
            } else {
                esqVar = null;
            }
        }
        if (esqVar != null) {
            esqVar.f();
        }
    }

    final synchronized void d(int i) {
        esq esqVar;
        eoz.g(j(), "Not yet complete!");
        if (this.s.getAndAdd(i) != 0 || (esqVar = this.j) == null) {
            return;
        }
        esqVar.d();
    }

    @Override // defpackage.fbc
    public final fbf dF() {
        return this.b;
    }

    public final synchronized void e() {
        if (this.c == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.c = null;
        this.j = null;
        this.f = null;
        this.i = false;
        this.k = false;
        this.g = false;
        esa esaVar = this.u;
        if (esaVar.b.d()) {
            esaVar.c();
        }
        this.u = null;
        this.h = null;
        this.l = 0;
        this.o.b(this);
    }

    public final synchronized void f(esa esaVar) {
        this.u = esaVar;
        int iE = esaVar.e(1);
        ((iE == 2 || iE == 3) ? this.p : b()).execute(esaVar);
    }

    public final synchronized void g(ezt eztVar, Executor executor) {
        this.b.a();
        this.a.a.add(new esm(eztVar, executor));
        if (this.g) {
            d(1);
            executor.execute(new esl(this, eztVar, 0));
        } else if (!this.i) {
            eoz.g(!this.k, "Cannot add callbacks to a cancelled EngineJob");
        } else {
            d(1);
            executor.execute(new esl(this, eztVar, 1));
        }
    }

    public final synchronized void h(ezt eztVar) {
        this.b.a();
        esm esmVar = new esm(eztVar, fap.b);
        esn esnVar = this.a;
        esnVar.a.remove(esmVar);
        if (esnVar.c()) {
            if (!j()) {
                this.k = true;
                esa esaVar = this.u;
                esaVar.n = true;
                erx erxVar = esaVar.m;
                if (erxVar != null) {
                    erxVar.a();
                }
                this.n.j(this, this.c);
            }
            if ((this.g || this.i) && this.s.get() == 0) {
                e();
            }
        }
    }

    public final synchronized void i(eqi eqiVar, boolean z, boolean z2, boolean z3) {
        this.c = eqiVar;
        this.d = z;
        this.t = z2;
        this.e = z3;
    }
}
