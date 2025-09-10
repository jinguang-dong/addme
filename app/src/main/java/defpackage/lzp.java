package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzp implements pon, lze, lzh {
    public final owf a;
    public final owf b;
    public rwc c;
    public rwc d;
    public rwc e;
    public rwc f;
    public boolean g;
    public rwc h;
    public rwc i;
    public final Set j;
    private final Executor k;
    private final owf l;
    private rwc m;
    private final mdy n;

    public lzp(rwc rwcVar, owf owfVar, mdy mdyVar, owf owfVar2, owf owfVar3) {
        rvk rvkVar = rvk.a;
        this.c = rvkVar;
        this.d = rwc.j(Float.valueOf(1.0f));
        this.e = rvkVar;
        this.f = rvkVar;
        this.g = false;
        this.h = rvkVar;
        this.m = rvkVar;
        this.i = rvkVar;
        this.j = DesugarCollections.synchronizedSet(new HashSet());
        this.a = owfVar;
        a.I(rwcVar.h());
        this.k = (Executor) rwcVar.c();
        this.n = mdyVar;
        this.l = owfVar2;
        this.b = owfVar3;
    }

    public final synchronized paq a(rwc rwcVar, rwc rwcVar2, rwc rwcVar3) throws Throwable {
        ivk ivkVar;
        try {
            try {
                synchronized (this) {
                    try {
                        this.h = rwcVar;
                        this.m = rwcVar2;
                        this.i = rwcVar3;
                        ivkVar = new ivk(this, rwcVar, rwcVar2, rwcVar3, 2);
                    } finally {
                        th = th;
                        while (true) {
                            Throwable th = th;
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                return ivkVar;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }

    public final synchronized void d(rwc rwcVar, rwc rwcVar2, rwc rwcVar3) {
        if (this.h.h() && this.h.c() == ((rwg) rwcVar).a) {
            this.h = rvk.a;
        }
        if (this.i.h() && rwcVar3.h() && this.i.c() == rwcVar3.c()) {
            Executor executor = this.k;
            executor.execute(new iwh(10));
            this.i = rvk.a;
        }
        if (this.m.h() && this.m.c() == ((rwg) rwcVar2).a) {
            this.m = rvk.a;
        }
    }

    @Override // defpackage.lze
    public final void e() {
        if (this.c.h()) {
            if (((Float) ((rwg) this.d).a).equals(this.c.c())) {
                return;
            }
            mdy mdyVar = this.n;
            owf owfVar = this.l;
            double dRound = Math.round((((Float) owfVar.dL()).floatValue() - ((Float) this.c.c()).floatValue()) * 10.0d);
            double dRound2 = Math.round(((((Float) owfVar.dL()).floatValue() - ((Float) this.c.c()).floatValue()) / (((Float) this.c.c()).floatValue() + 1.0E-6d)) * 100.0d);
            float fFloatValue = ((Float) owfVar.dL()).floatValue();
            tpc tpcVarM = spq.a.m();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            tph tphVar = tpcVarM.b;
            spq spqVar = (spq) tphVar;
            spqVar.b |= 4;
            spqVar.e = (float) (dRound / 10.0d);
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            tph tphVar2 = tpcVarM.b;
            spq spqVar2 = (spq) tphVar2;
            spqVar2.b |= 8;
            spqVar2.f = (float) (dRound2 / 100.0d);
            if (!tphVar2.C()) {
                tpcVarM.o();
            }
            spq spqVar3 = (spq) tpcVarM.b;
            spqVar3.b |= 16;
            spqVar3.g = fFloatValue;
            mdyVar.x(9, null, null, null, null, (spq) tpcVarM.l(), null, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, joc] */
    @Override // defpackage.pon
    public final void eS() {
        synchronized (this) {
            if (!this.m.h()) {
                this.c = this.d;
                return;
            }
            poj pojVarE = this.m.c().e();
            if (pojVarE == null) {
                return;
            }
            this.k.execute(new lsn(this, pojVarE, 12));
            pojVarE.close();
        }
    }

    @Override // defpackage.lzh
    public final void dM() {
    }

    @Override // defpackage.lzh
    public final void f() {
    }

    @Override // defpackage.lzh
    public final void fa() {
    }

    @Override // defpackage.lzh
    public final void eZ(lzm lzmVar) {
    }
}
