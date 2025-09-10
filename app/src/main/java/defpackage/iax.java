package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class iax implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ iax(hbj hbjVar, kgw kgwVar, rwc rwcVar, fuk fukVar, our ourVar, int i) {
        this.f = i;
        this.b = hbjVar;
        this.d = kgwVar;
        this.c = rwcVar;
        this.a = fukVar;
        this.e = ourVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, owq] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        if (i == 0) {
            ?? r1 = this.b;
            owf owfVarA = owb.a(r1);
            knl knlVar = new knl(1);
            ?? r5 = this.c;
            paq paqVarDK = owfVarA.dK(knlVar, r5);
            our ourVar = (our) this.a;
            ourVar.d(paqVarDK);
            owf owfVarA2 = owl.a(this.d, r1);
            Object obj = this.e;
            ourVar.d(owfVarA2.dK(new hib(obj, 19), r5));
            ourVar.d(new iew(obj, 1));
            return;
        }
        if (i != 1) {
            ?? r12 = this.d;
            ((jgt) this.a).k(new lhy(this.e, this.b, this.c, r12));
            return;
        }
        if (((hbj) this.b).p(gyj.a) && ((pkb) this.d).l() == pka.FRONT) {
            rwc rwcVar = (rwc) this.c;
            if (rwcVar.h()) {
                Object obj2 = this.e;
                Object obj3 = this.a;
                peo peoVar = (peo) rwcVar.c();
                fuk fukVar = (fuk) obj3;
                ovx ovxVar = (ovx) fukVar.a.a();
                ovxVar.getClass();
                owq owqVar = (owq) fukVar.b.a();
                owqVar.getClass();
                pfl pflVar = (pfl) fukVar.c.a();
                pflVar.getClass();
                fuy fuyVar = (fuy) fukVar.d.a();
                fuyVar.getClass();
                Executor executor = (Executor) fukVar.f.a();
                executor.getClass();
                pfu pfuVar = (pfu) fukVar.g.a();
                pfuVar.getClass();
                owf owfVar = (owf) fukVar.h.a();
                owfVar.getClass();
                tgq tgqVarA = ((tgr) fukVar.i).a();
                jzw jzwVar = (jzw) fukVar.j.a();
                jzwVar.getClass();
                ?? A = fukVar.k.a();
                A.getClass();
                pbn pbnVar = (pbn) fukVar.l.a();
                pbnVar.getClass();
                fuj fujVar = new fuj(ovxVar, owqVar, pflVar, fuyVar, fukVar.e, executor, pfuVar, owfVar, tgqVarA, jzwVar, A, pbnVar, peoVar);
                ((our) obj2).d(fujVar);
                fujVar.f.execute(new foh(fujVar, 8));
            }
        }
    }

    public /* synthetic */ iax(jgt jgtVar, owq owqVar, owf owfVar, owq owqVar2, owf owfVar2, int i) {
        this.f = i;
        this.a = jgtVar;
        this.e = owqVar;
        this.b = owfVar;
        this.c = owqVar2;
        this.d = owfVar2;
    }

    public /* synthetic */ iax(our ourVar, owf owfVar, Executor executor, owf owfVar2, owq owqVar, int i) {
        this.f = i;
        this.a = ourVar;
        this.b = owfVar;
        this.c = executor;
        this.d = owfVar2;
        this.e = owqVar;
    }
}
