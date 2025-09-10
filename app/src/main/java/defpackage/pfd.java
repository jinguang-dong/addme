package defpackage;

import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfd implements pdn {
    public final Executor a;
    public final pdv b;
    public final pbn c;
    public final Deque d;
    public final Deque e;
    public final Deque f;
    public final List g;
    public final List h;
    public boolean i = false;
    private final int j;
    private int k;
    private final Collection l;
    private final qrh m;
    private final mwq n;
    private rnu o;

    public pfd(qrh qrhVar, Executor executor, pdv pdvVar, mwq mwqVar, int i, pbn pbnVar) {
        int i2;
        this.m = qrhVar;
        this.a = executor;
        this.b = pdvVar;
        this.n = mwqVar;
        this.c = pbnVar;
        this.k = v(pdvVar, i);
        synchronized (phh.class) {
            i2 = phh.b;
            phh.b = i2 + 1;
        }
        this.j = i2;
        this.g = new CopyOnWriteArrayList();
        this.h = new CopyOnWriteArrayList();
        this.d = new ArrayDeque(i);
        this.e = new ArrayDeque(i);
        ArrayDeque arrayDeque = new ArrayDeque(i);
        this.l = DesugarCollections.unmodifiableCollection(arrayDeque);
        this.f = arrayDeque;
        ((phk) mwqVar.b).d.b(new Object[0]);
    }

    private static int v(pdv pdvVar, int i) {
        int iA = pdvVar.a();
        return iA == -1 ? i : Math.min(iA, i);
    }

    private final phc w() {
        String strConcat = toString().concat("#selectFrameToRemove");
        pbn pbnVar = this.c;
        pbnVar.f(strConcat);
        phc phcVar = null;
        if (this.o != null) {
            Deque deque = this.f;
            if (!deque.isEmpty()) {
                pbnVar.f("trimFilter#select");
                rnu rnuVar = this.o;
                ArrayList arrayList = new ArrayList(this.l);
                phcVar = (phc) arrayList.get(((pgx) rnuVar.a).a(arrayList));
                pbnVar.g();
                rnt.u(deque.contains(phcVar), "Trim filter returned frame not in buffer", new Object[0]);
            }
        }
        Deque deque2 = this.f;
        if (!deque2.isEmpty() && phcVar == null) {
            phcVar = (phc) deque2.peekFirst();
        }
        pbnVar.g();
        return phcVar;
    }

    private final boolean x(phc phcVar) {
        if (phcVar == null) {
            return false;
        }
        rnt.u(this.f.remove(phcVar), PNlJufQ.zetnycixY, new Object[0]);
        phcVar.c();
        this.e.addLast(phcVar);
        return true;
    }

    @Override // defpackage.pdn
    public final synchronized int a() {
        return this.k;
    }

    @Override // defpackage.pdn
    public final synchronized int b() {
        return this.f.size();
    }

    @Override // defpackage.pdn
    public final synchronized pdk c() {
        phc phcVar;
        if (!this.i) {
            Deque deque = this.f;
            if (!deque.isEmpty() && (phcVar = (phc) deque.peekFirst()) != null) {
                return phcVar.a();
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.pdn, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        boolean zRemove;
        synchronized (this) {
            if (this.i) {
                return;
            }
            this.i = true;
            Deque deque = this.f;
            Iterator it = deque.iterator();
            while (it.hasNext()) {
                ((phc) it.next()).c();
            }
            deque.clear();
            this.e.clear();
            this.d.clear();
            qrh qrhVar = this.m;
            synchronized (qrhVar) {
                ((qpf) qrhVar.g).k(this);
                zRemove = qrhVar.c.remove(this);
            }
            if (zRemove) {
                qrhVar.d();
            }
            ((phk) this.n.b).e.b(new Object[0]);
        }
    }

    @Override // defpackage.pdn
    public final synchronized pdk d(rwe rweVar) {
        if (!this.i) {
            Deque<phc> deque = this.f;
            if (!deque.isEmpty()) {
                for (phc phcVar : deque) {
                    if (rweVar.a(phcVar)) {
                        return phcVar.a();
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.pdn
    public final synchronized pdk e() {
        phc phcVar;
        if (!this.i) {
            Deque deque = this.f;
            if (!deque.isEmpty() && (phcVar = (phc) deque.peekLast()) != null) {
                return phcVar.a();
            }
        }
        return null;
    }

    @Override // defpackage.pdn
    public final synchronized pdk f(rwe rweVar) {
        if (!this.i) {
            final Deque deque = this.f;
            if (!deque.isEmpty()) {
                for (phc phcVar : new Iterable() { // from class: pfc
                    @Override // java.lang.Iterable
                    public final Iterator iterator() {
                        return deque.descendingIterator();
                    }
                }) {
                    if (rweVar.a(phcVar)) {
                        return phcVar.a();
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.pdn
    public final synchronized pdk g() {
        phc phcVar;
        if (!this.i) {
            Deque deque = this.f;
            if (!deque.isEmpty() && (phcVar = (phc) deque.peekFirst()) != null) {
                pdk pdkVarA = phcVar.a();
                x(phcVar);
                return pdkVarA;
            }
        }
        return null;
    }

    @Override // defpackage.pdn
    public final synchronized pdk h() {
        phc phcVar;
        if (!this.i) {
            Deque deque = this.f;
            if (!deque.isEmpty() && (phcVar = (phc) deque.peekLast()) != null) {
                pdk pdkVarA = phcVar.a();
                x(phcVar);
                return pdkVarA;
            }
        }
        return null;
    }

    @Override // defpackage.pdn
    public final synchronized List j() {
        if (!this.i) {
            Deque deque = this.f;
            if (!deque.isEmpty()) {
                sbk sbkVarE = sbp.e(deque.size());
                Iterator it = deque.iterator();
                while (it.hasNext()) {
                    pdk pdkVarA = ((phc) it.next()).a();
                    if (pdkVarA != null) {
                        sbkVarE.h(pdkVarA);
                    }
                }
                return sbkVarE.g();
            }
        }
        int i = sbp.d;
        return sex.a;
    }

    @Override // defpackage.pdn
    public final synchronized List k() {
        if (!this.i) {
            Deque<phc> deque = this.f;
            if (!deque.isEmpty()) {
                sbk sbkVarE = sbp.e(deque.size());
                for (phc phcVar : deque) {
                    pdk pdkVarA = phcVar.a();
                    if (pdkVarA != null) {
                        sbkVarE.h(pdkVarA);
                    }
                    this.e.addLast(phcVar);
                    phcVar.c();
                }
                deque.clear();
                return sbkVarE.g();
            }
        }
        int i = sbp.d;
        return sex.a;
    }

    @Override // defpackage.pdn
    public final void l(pdm pdmVar) {
        if (pdmVar instanceof pdl) {
            this.h.add((pdl) pdmVar);
        } else {
            this.g.add(pdmVar);
        }
    }

    @Override // defpackage.pdn
    public final void m(pdm pdmVar) {
        if (pdmVar instanceof pdl) {
            this.h.remove(pdmVar);
        } else {
            this.g.remove(pdmVar);
        }
    }

    @Override // defpackage.pdn
    public final synchronized void n(int i) {
        pdv pdvVar = this.b;
        int i2 = this.k;
        int iV = v(pdvVar, i);
        this.k = iV;
        if (iV < i2) {
            t();
        }
    }

    @Override // defpackage.pdn
    public final synchronized boolean o(pdo pdoVar) {
        phc phcVar;
        if (!this.i) {
            Deque deque = this.f;
            if (!deque.isEmpty()) {
                Iterator it = deque.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        phcVar = null;
                        break;
                    }
                    phcVar = (phc) it.next();
                    if (a.K(phcVar.b(), pdoVar)) {
                        break;
                    }
                }
                return x(phcVar);
            }
        }
        return false;
    }

    @Override // defpackage.pdn
    public final synchronized void p() {
        if (!this.i) {
            Deque<phc> deque = this.f;
            if (!deque.isEmpty()) {
                for (phc phcVar : deque) {
                    this.e.addLast(phcVar);
                    phcVar.c();
                }
                deque.clear();
            }
        }
    }

    @Override // defpackage.pdn
    public final synchronized void q(rnu rnuVar) {
        this.o = rnuVar;
    }

    public final synchronized long r() {
        return i().f * this.f.size();
    }

    @Override // defpackage.pdn
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final pgb i() {
        return (pgb) this.b;
    }

    public final void t() {
        String strConcat = toString().concat("#reduceToCapacity");
        pbn pbnVar = this.c;
        pbnVar.f(strConcat);
        while (true) {
            Deque deque = this.d;
            if (deque.isEmpty() || deque.size() <= this.k) {
                break;
            }
            Deque deque2 = this.e;
            if (deque2.isEmpty()) {
                phc phcVarW = w();
                this.f.remove(phcVarW);
                deque.remove(phcVarW);
                if (phcVarW != null) {
                    phcVarW.c();
                }
            } else {
                phc phcVar = (phc) deque2.removeFirst();
                deque.remove(phcVar);
                phcVar.c();
            }
        }
        pbnVar.g();
    }

    public final String toString() {
        return "FrameBuffer-" + this.j;
    }

    public final synchronized boolean u() {
        return x(w());
    }
}
