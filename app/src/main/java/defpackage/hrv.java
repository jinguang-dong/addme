package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrv implements owf, paq {
    private static final paq a = new fgp(9);
    private final owq b;
    private final owf c;
    private final Executor d;
    private owq e;
    private paq f;
    private owq g;
    private paq h;
    private owq i;
    private paq j;
    private owf k;
    private paq l;
    private owf m;
    private paq n;
    private owq o;
    private paq p;
    private owf q;
    private paq r;
    private owf s;
    private paq t;
    private Boolean u;
    private final hbj v;

    public hrv(Executor executor, hbj hbjVar) {
        ovx ovxVar = new ovx(hsa.INACTIVE);
        this.b = ovxVar;
        this.c = owb.a(ovxVar);
        this.e = new ovx(false);
        paq paqVar = a;
        this.f = paqVar;
        this.g = new ovx(false);
        this.h = paqVar;
        this.i = new ovx(false);
        this.j = paqVar;
        this.k = new ovx(false);
        this.l = paqVar;
        this.m = new ovx(false);
        this.n = paqVar;
        this.o = new ovx(ltw.OFF);
        this.p = paqVar;
        this.q = new ovx(0);
        this.r = paqVar;
        this.s = new ovx(true);
        this.t = paqVar;
        this.u = false;
        this.d = executor;
        this.v = hbjVar;
    }

    private final synchronized hsa o() {
        if (!this.u.booleanValue()) {
            return hsa.INACTIVE_APP_MODE;
        }
        if (((Boolean) this.g.dL()).booleanValue()) {
            return hsa.INACTIVE_CATCHER_BOTTOM_SHEET;
        }
        if (((Boolean) this.i.dL()).booleanValue()) {
            return hsa.INACTIVE_HOTSHOT;
        }
        if (((Boolean) this.k.dL()).booleanValue()) {
            return hsa.INACTIVE_LONG_PRESS;
        }
        if (((Boolean) this.m.dL()).booleanValue()) {
            return hsa.INACTIVE_GROUP_PHOTO_ANIMATION;
        }
        if (((Boolean) this.e.dL()).booleanValue()) {
            return hsa.INACTIVE_COUNT_DOWN;
        }
        int iJ = this.v.p(gyo.g) ? ((Boolean) ((ovx) this.s).d).booleanValue() ? 2 : 3 : hgc.j(((Integer) ((ovx) this.q).d).intValue());
        if (iJ != 3) {
            if (this.o.dL() != ltw.THREE) {
                if (this.o.dL() != ltw.FIVE) {
                    if (this.o.dL() != ltw.TEN) {
                        if (this.o.dL() == ltw.OFF && iJ == 2) {
                        }
                    }
                }
            }
            return hsa.ACTIVE;
        }
        return hsa.INACTIVE;
    }

    @Override // defpackage.owf
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hsa dL() {
        return (hsa) this.c.dL();
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        paq paqVar = this.f;
        if (paqVar != null) {
            paqVar.close();
            this.f = a;
        }
        paq paqVar2 = this.h;
        if (paqVar2 != null) {
            paqVar2.close();
            this.h = a;
        }
        paq paqVar3 = this.j;
        if (paqVar3 != null) {
            paqVar3.close();
            this.j = a;
        }
        paq paqVar4 = this.l;
        if (paqVar4 != null) {
            paqVar4.close();
            this.l = a;
        }
        paq paqVar5 = this.n;
        if (paqVar5 != null) {
            paqVar5.close();
            this.n = a;
        }
        paq paqVar6 = this.p;
        if (paqVar6 != null) {
            paqVar6.close();
            this.p = a;
        }
        paq paqVar7 = this.r;
        if (paqVar7 != null) {
            paqVar7.close();
            this.r = a;
        }
        paq paqVar8 = this.t;
        if (paqVar8 != null) {
            paqVar8.close();
            this.t = a;
        }
    }

    public final synchronized void d() {
        m();
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        return this.c.dK(pauVar, executor);
    }

    public final synchronized void e(owq owqVar) {
        this.g = owqVar;
        this.h.close();
        this.h = owqVar.dK(new hib(this, 7), this.d);
    }

    public final synchronized void f(owf owfVar) {
        this.s = owfVar;
        this.t.close();
        this.t = owfVar.dK(new hib(this, 8), this.d);
    }

    public final synchronized void g(owf owfVar) {
        this.q = owfVar;
        this.r.close();
        this.r = owfVar.dK(new hdg(this, 6), this.d);
    }

    public final synchronized void h(owq owqVar) {
        this.e = owqVar;
        this.f.close();
        this.f = owqVar.dK(new hib(this, 9), sxo.a);
    }

    public final synchronized void i(owq owqVar) {
        this.m = owqVar;
        this.n.close();
        this.n = owqVar.dK(new hib(this, 11), this.d);
    }

    public final synchronized void j(owq owqVar) {
        this.i = owqVar;
        this.j.close();
        this.j = owqVar.dK(new hib(this, 10), this.d);
    }

    public final synchronized void k(owf owfVar) {
        this.k = owfVar;
        this.l.close();
        this.l = owfVar.dK(new hib(this, 12), this.d);
    }

    public final synchronized void l(owq owqVar) {
        this.o = owqVar;
        this.p.close();
        this.p = owqVar.dK(new hib(this, 6), this.d);
    }

    public final synchronized void m() {
        owq owqVar = this.b;
        hsa hsaVarO = o();
        if (hsaVarO != ((ovx) owqVar).d) {
            shl shlVar = shx.a;
            TimeUnit.SECONDS.getClass();
            Object obj = ((ovx) owqVar).d;
            owqVar.a(hsaVarO);
        }
    }

    public final synchronized void n(Boolean bool) {
        this.u = bool;
        m();
    }
}
