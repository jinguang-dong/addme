package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgn {
    public final pbc a;
    private final pbn b;
    private final Deque c = new ArrayDeque();
    private final Deque d = new ArrayDeque();
    private boolean e = false;
    private boolean f = false;
    private Runnable g;
    private final pfl h;
    private final rcg i;
    private final lat j;
    private final ojl k;

    public pgn(lat latVar, rcg rcgVar, pfl pflVar, our ourVar, pbc pbcVar, pbn pbnVar, ojl ojlVar) {
        this.j = latVar;
        this.i = rcgVar;
        this.h = pflVar;
        this.b = pbnVar;
        this.a = pbcVar.a("PendingFrameQueue");
        this.k = ojlVar;
        ourVar.d(new ngh(this, 6));
    }

    private final pgf h(pdv pdvVar) {
        scl sclVar = new scl();
        Iterator it = pdvVar.d().iterator();
        while (it.hasNext()) {
            sclVar.d(phz.f((peo) it.next()));
        }
        pgf pgfVarO = pgf.o(this.h, pdvVar, sclVar.g());
        pgfVarO.g();
        return pgfVarO;
    }

    public final synchronized pdk a(pdv pdvVar) {
        pgm pgmVar;
        pbn pbnVar = this.b;
        pbnVar.f("submit#FrameStream");
        a.I(this.i.f(pdvVar));
        pgmVar = new pgm(pdvVar, this.k);
        if (this.f) {
            pgmVar.k(h(pdvVar));
        } else {
            this.c.addLast(pgmVar);
            f();
        }
        pbnVar.g();
        return pgmVar;
    }

    final synchronized Set b() {
        Deque deque = this.d;
        if (!deque.isEmpty() && !this.f) {
            Set set = (Set) deque.removeFirst();
            f();
            return set;
        }
        return null;
    }

    public final synchronized void c(Set set, Set set2) {
        if (this.f) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                pgf pgfVar = (pgf) it.next();
                pgfVar.g();
                pgfVar.h();
            }
            sgj sgjVarListIterator = ((sfm) set).listIterator();
            while (sgjVarListIterator.hasNext()) {
                pgm pgmVar = (pgm) sgjVarListIterator.next();
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    pgf pgfVar2 = (pgf) it2.next();
                    if (pgfVar2.a == pgmVar.a) {
                        pgmVar.k(pgfVar2);
                    }
                }
            }
        } else {
            pbn pbnVar = this.b;
            pbnVar.f("onRequestAllocated");
            sgj sgjVarListIterator2 = ((sfm) set).listIterator();
            while (sgjVarListIterator2.hasNext()) {
                pgm pgmVar2 = (pgm) sgjVarListIterator2.next();
                Iterator it3 = set2.iterator();
                while (it3.hasNext()) {
                    pgf pgfVar3 = (pgf) it3.next();
                    if (pgfVar3.a == pgmVar2.a) {
                        pgmVar2.k(pgfVar3);
                    }
                }
            }
            Deque deque = this.d;
            deque.add(set2);
            pbnVar.g();
            if (!deque.isEmpty() && !this.f && this.g != null) {
                pbnVar.f("invokeSubmitListener");
                this.g.run();
                pbnVar.g();
            }
        }
    }

    public final synchronized void d(Runnable runnable) {
        rnt.L(this.g == null);
        rnt.L(this.d.isEmpty());
        rnt.L(!this.f);
        this.g = runnable;
    }

    public final synchronized void e() {
        if (this.f) {
            return;
        }
        this.f = true;
        Deque<pgm> deque = this.c;
        if (!deque.isEmpty() || !this.d.isEmpty()) {
            this.a.b("Aborting pending frames on shutdown.");
        }
        for (pgm pgmVar : deque) {
            pgmVar.k(h(pgmVar.a));
        }
        deque.clear();
        Deque deque2 = this.d;
        Iterator it = deque2.iterator();
        while (it.hasNext()) {
            for (pgf pgfVar : (Set) it.next()) {
                pgfVar.g();
                pgfVar.h();
            }
        }
        deque2.clear();
    }

    public final synchronized void f() {
        if (!this.e) {
            Deque deque = this.c;
            if (!deque.isEmpty() && this.d.isEmpty() && !this.f) {
                pbn pbnVar = this.b;
                pbnVar.f("allocate#FrameStream(s)");
                pgm pgmVar = (pgm) deque.removeFirst();
                pgmVar.getClass();
                sfm sfmVar = new sfm(pgmVar);
                sfm sfmVar2 = new sfm((pgb) pgmVar.a);
                this.e = true;
                ske.W(this.j.y(sfmVar2), new lso(this, sfmVar, sfmVar2, 2), sxo.a);
                pbnVar.g();
            }
        }
    }
}
