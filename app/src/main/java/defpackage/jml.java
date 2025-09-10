package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jml implements joc {
    public static final sgv a = sgv.g("jml");
    private final peo c;
    private final pdn d;
    private final List e = new ArrayList();
    private final Map f = new HashMap();
    public final AtomicBoolean b = new AtomicBoolean();

    public jml(peo peoVar, pdn pdnVar) {
        this.c = peoVar;
        this.d = pdnVar;
    }

    @Override // defpackage.joc
    public final synchronized long a() {
        pdo pdoVarB;
        if (this.b.get()) {
            List list = this.e;
            if (!list.isEmpty() && (pdoVarB = ((pdk) ujp.aQ(list)).b()) != null) {
                return pdoVarB.b;
            }
        } else {
            pdk pdkVarE = this.d.e();
            if (pdkVarE != null) {
                try {
                    pdo pdoVarB2 = pdkVarE.b();
                    long j = pdoVarB2 != null ? pdoVarB2.b : -1L;
                    pdkVarE.close();
                    return j;
                } finally {
                }
            }
        }
        return -1L;
    }

    @Override // defpackage.joc
    public final synchronized paq b(job jobVar, Executor executor) {
        jmh jmhVar = new jmh(this, jobVar, executor, 0);
        this.d.l(jmhVar);
        this.f.put(jobVar, jmhVar);
        return new hty(this, jobVar, 13);
    }

    @Override // defpackage.joc
    public final synchronized poj c(long j) {
        pdn pdnVar = this.d;
        int iB = pdnVar.b();
        if (iB <= 20) {
            ((sgt) a.c().M(2843)).t("Microvideo ring buffer size runs low (%d) and will cause large frame gaps in Microvideo/Long Shots.", iB);
        }
        poj pojVarE = null;
        if (!this.b.get()) {
            pdk pdkVarD = pdnVar.d(new jmj(j, 1));
            if (pdkVarD != null) {
                try {
                    pojVarE = pdkVarD.e(this.c);
                } finally {
                }
            }
            if (pdkVarD != null) {
                pdkVarD.close();
            }
            return pojVarE;
        }
        for (pdk pdkVar : this.e) {
            pdo pdoVarB = pdkVar.b();
            if (pdoVarB != null && pdoVarB.b > j) {
                return pdkVar.e(this.c);
            }
        }
        return null;
    }

    @Override // defpackage.joc
    public final synchronized poj d(long j) {
        poj pojVarE = null;
        if (!this.b.get()) {
            pdk pdkVarD = this.d.d(new jmj(j, 0));
            if (pdkVarD != null) {
                try {
                    pojVarE = pdkVarD.e(this.c);
                } finally {
                }
            }
            if (pdkVarD != null) {
                pdkVarD.close();
            }
            return pojVarE;
        }
        for (pdk pdkVar : this.e) {
            pdo pdoVarB = pdkVar.b();
            if (pdoVarB != null && pdoVarB.b == j) {
                return pdkVar.e(this.c);
            }
        }
        return null;
    }

    @Override // defpackage.joc
    public final synchronized poj e() {
        poj pojVarE = null;
        if (this.b.get()) {
            List list = this.e;
            if (list.isEmpty()) {
                return null;
            }
            return ((pdk) ujp.aQ(list)).e(this.c);
        }
        pdk pdkVarF = this.d.f(new pqr(1));
        if (pdkVarF != null) {
            try {
                pojVarE = pdkVarF.e(this.c);
            } finally {
            }
        }
        if (pdkVarF != null) {
            pdkVarF.close();
        }
        return pojVarE;
    }

    @Override // defpackage.joc
    public final synchronized rwc f(long j) {
        if (this.b.get()) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                pdo pdoVarB = ((pdk) it.next()).b();
                if (pdoVarB != null) {
                    long j2 = pdoVarB.b;
                    if (j2 > j) {
                        return rwc.j(Long.valueOf(j2));
                    }
                }
            }
            return rvk.a;
        }
        pdk pdkVarD = this.d.d(new jmj(j, 1));
        if (pdkVarD != null) {
            try {
                pdo pdoVarB2 = pdkVarD.b();
                if (pdoVarB2 != null) {
                    rwc rwcVarJ = rwc.j(Long.valueOf(pdoVarB2.b));
                    pdkVarD.close();
                    return rwcVarJ;
                }
            } finally {
            }
        }
        rvk rvkVar = rvk.a;
        if (pdkVarD != null) {
            pdkVarD.close();
        }
        return rvkVar;
    }

    @Override // defpackage.joc
    public final synchronized List g(long j) {
        ArrayList arrayList;
        this.b.set(true);
        arrayList = new ArrayList();
        sgk it = ((sbp) this.d.j()).iterator();
        while (it.hasNext()) {
            pdk pdkVar = (pdk) it.next();
            pdo pdoVarB = pdkVar.b();
            if (pdoVarB != null) {
                long j2 = pdoVarB.b;
                if (j2 > j) {
                    arrayList.add(Long.valueOf(j2));
                    this.e.add(pdkVar);
                }
            }
            pdkVar.close();
        }
        return arrayList;
    }

    @Override // defpackage.joc
    public final synchronized void h() {
        List list = this.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((pdk) it.next()).close();
        }
        list.clear();
        this.b.set(false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    public final synchronized void i(job jobVar) {
        pdm pdmVar;
        try {
            pdmVar = (pdm) this.f.remove(jobVar);
        } catch (RuntimeException e) {
            ((sgt) ((sgt) a.c().i(e)).M((char) 2845)).s("listener not found");
            pdmVar = null;
        }
        if (pdmVar != null) {
            this.d.m(pdmVar);
        }
    }

    @Override // defpackage.joc
    public final void j() {
    }
}
