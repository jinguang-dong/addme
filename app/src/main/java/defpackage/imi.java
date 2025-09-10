package defpackage;

import android.os.Handler;
import j$.util.Optional;
import java.util.Date;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imi implements mxl, jhh, jhe, jhc {
    public static final Object a = new Object();
    public final out b;
    public final jgt c;
    public png e;
    public rww f;
    public final owf o;
    public final owf p;
    public imj q;
    public final pnk r;
    public final our s;
    private final Handler t;
    private Runnable v;
    private final Set u = new HashSet();
    public final PriorityQueue d = new PriorityQueue(new ccn(14));
    private boolean w = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public mxm k = mxm.PORTRAIT;
    public mxj l = mxj.PHONE_LAYOUT;
    public Optional m = Optional.empty();
    public boolean n = false;

    public imi(out outVar, our ourVar, Handler handler, jgt jgtVar, pnk pnkVar, owf owfVar, owf owfVar2) {
        this.s = ourVar;
        this.b = outVar;
        this.t = handler;
        this.c = jgtVar;
        this.r = pnkVar;
        this.p = owfVar;
        this.o = owfVar2;
    }

    private final void k() {
        synchronized (a) {
            imj imjVar = this.q;
            if (imjVar != null) {
                this.b.execute(new ild(imjVar, 3));
                if (this.q.p()) {
                    this.d.remove(this.q);
                }
            }
            this.q = null;
            Handler handler = this.t;
            if (handler.hasCallbacks(this.v)) {
                handler.removeCallbacks(this.v);
            }
        }
    }

    private final void l(imj imjVar, Runnable runnable) {
        if (this.g) {
            return;
        }
        img imgVar = new img(this, runnable, 3);
        synchronized (a) {
            this.b.execute(new gdq((Object) this, (Object) imjVar, (Object) imgVar, 7, (byte[]) null));
            Handler handler = this.t;
            if (handler.hasCallbacks(this.v)) {
                handler.removeCallbacks(this.v);
            }
        }
    }

    private final boolean m(imj imjVar) {
        synchronized (a) {
            if (this.w) {
                return false;
            }
            return !this.u.contains(imjVar.c());
        }
    }

    public final paq a(imj imjVar) {
        Object obj = a;
        synchronized (obj) {
            imjVar.k(new Date());
            if (this.d.contains(imjVar)) {
                if (imjVar.equals(this.q)) {
                    synchronized (obj) {
                        imj imjVar2 = this.q;
                        if (imjVar2 != null && !imjVar2.q()) {
                            Handler handler = this.t;
                            handler.removeCallbacks(this.v);
                            handler.postDelayed(this.v, this.q.b());
                            this.b.execute(new imf(this, this.q, 0));
                        }
                    }
                }
                return new hty(this, imjVar, 6);
            }
            if (imjVar.p() && (!m(imjVar) || (this.q != null && (ins.c(imjVar.t()) <= ins.c(this.q.t()) || this.q.o())))) {
                return new fgp(10);
            }
            PriorityQueue priorityQueue = this.d;
            priorityQueue.add(imjVar);
            int i = 14;
            if (m(imjVar)) {
                if (this.q == null) {
                    i(imjVar);
                } else if (imjVar.equals(priorityQueue.peek())) {
                    if (this.q.o()) {
                        l(this.q, new fij(14));
                    } else {
                        k();
                        i(imjVar);
                    }
                }
            }
            return new ffx(this, imjVar, i);
        }
    }

    public final paq d(imk imkVar) {
        g(imkVar);
        return new hty(this, imkVar, 7);
    }

    public final rwc e() {
        synchronized (a) {
            if (this.w) {
                return rvk.a;
            }
            PriorityQueue priorityQueue = new PriorityQueue(this.d);
            for (imj imjVar = (imj) priorityQueue.peek(); imjVar != null; imjVar = (imj) priorityQueue.peek()) {
                if (m(imjVar)) {
                    return rwc.j(imjVar);
                }
                priorityQueue.poll();
            }
            return rvk.a;
        }
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) {
        synchronized (a) {
            myd mydVar = ((mxu) this.f.fr()).b;
            boolean z = true;
            if (mydVar != null && !mydVar.P()) {
                z = false;
            }
            this.i = z;
            this.k = mxmVar;
            this.l = mxjVar;
            this.b.execute(new ild(this, 4));
        }
    }

    @Override // defpackage.jhc
    public final void ea() {
        this.w = true;
        synchronized (a) {
            for (imj imjVar : (imj[]) this.d.toArray(new imj[0])) {
                if (!imjVar.r()) {
                    f(imjVar);
                }
            }
        }
        k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [imj, java.lang.Object] */
    @Override // defpackage.jhe
    public final void eb() {
        this.w = false;
        rwc rwcVarE = e();
        if (rwcVarE.h()) {
            i(rwcVarE.c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [imj, java.lang.Object] */
    public final void f(imj imjVar) {
        synchronized (a) {
            if (!imjVar.equals(this.q)) {
                this.d.remove(imjVar);
            } else if (this.q.o()) {
                l(this.q, new img(this, imjVar, 0));
                this.g = true;
            } else {
                k();
                this.d.remove(imjVar);
                rwc rwcVarE = e();
                if (rwcVarE.h()) {
                    i(rwcVarE.c());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [imj, java.lang.Object] */
    public final void g(imk imkVar) {
        synchronized (a) {
            Set set = this.u;
            set.add(imkVar);
            imj imjVar = this.q;
            if (imjVar != null && set.contains(imjVar.c())) {
                k();
                rwc rwcVarE = e();
                if (rwcVarE.h()) {
                    i(rwcVarE.c());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [imj, java.lang.Object] */
    public final void h(imk imkVar) {
        synchronized (a) {
            this.u.remove(imkVar);
            rwc rwcVarE = e();
            if (rwcVarE.h() && !rwcVarE.c().equals(this.q)) {
                k();
                i(rwcVarE.c());
            }
        }
    }

    public final void i(imj imjVar) {
        synchronized (a) {
            this.b.execute(new img(this, imjVar, 2));
            this.q = imjVar;
            if (!imjVar.q()) {
                hjp hjpVar = new hjp(this, 15);
                this.v = hjpVar;
                this.t.postDelayed(hjpVar, imjVar.b());
            }
        }
    }

    public final void j() {
        synchronized (a) {
            imj imjVar = this.q;
            if (imjVar != null) {
                imjVar.n(this.h, this.i, this.j, this.k, this.l, this.m, this.n);
            }
        }
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
