package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfe extends ojl implements paq {
    private final pgk a;
    private final Set b;
    private final pbn c;
    private Set d;
    private scn e;
    private boolean f;
    private boolean g;
    private final boolean h;
    private final qrh i;
    private final lat j;
    private final ojl k;

    public pfe(lat latVar, qrh qrhVar, pgk pgkVar, scn scnVar, pbn pbnVar, ojl ojlVar, Set set, Set set2) {
        super((short[]) null);
        this.e = sfd.a;
        this.f = false;
        this.g = false;
        this.j = latVar;
        this.i = qrhVar;
        this.a = pgkVar;
        this.b = set;
        this.d = scn.F(set2);
        this.h = scnVar.contains(0);
        this.c = pbnVar;
        this.k = ojlVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f) {
                return;
            }
            this.f = true;
            Set set = this.d;
            this.d = null;
            if (set == null || set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((pgf) it.next()).h();
            }
        }
    }

    @Override // defpackage.ojl
    public final synchronized void dG(peo peoVar, long j) {
        sgj sgjVarListIterator = this.e.listIterator();
        while (sgjVarListIterator.hasNext()) {
            phx phxVar = (phx) sgjVarListIterator.next();
            if (peoVar == phxVar) {
                phxVar.a.b(peoVar, j);
            }
        }
    }

    @Override // defpackage.ojl
    public final synchronized void dH(piw piwVar) {
        Set<pgf> set = this.d;
        if (set != null) {
            boolean z = false;
            if (piwVar != null && piwVar.c()) {
                z = true;
            }
            if ((this.h && !this.g) || !z) {
                for (pgf pgfVar : set) {
                    pgfVar.h();
                    pgfVar.g();
                }
                this.d = null;
            }
        }
        if (piwVar != null) {
            long jB = piwVar.b();
            sgj sgjVarListIterator = this.e.listIterator();
            while (sgjVarListIterator.hasNext()) {
                phx phxVar = (phx) sgjVarListIterator.next();
                phxVar.a.b(phxVar, jB);
            }
        }
    }

    @Override // defpackage.ojl
    public final synchronized void dV(Set set) {
        scl sclVar = new scl();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            peo peoVar = (peo) it.next();
            if (peoVar instanceof phx) {
                sclVar.d((phx) peoVar);
            }
        }
        this.e = sclVar.g();
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.ojl
    public final synchronized void l(pdo pdoVar) {
        Set<pgf> setZ;
        pbn pbnVar = this.c;
        pbnVar.f("FrameDistributor#onStarted");
        this.g = true;
        scn scnVar = this.e;
        rnt.M(!this.f, "on started invoked after FrameDistributor was closed!");
        try {
            our ourVar = new our();
            try {
                pbnVar.f("frameAllocation");
                lat latVar = this.j;
                ourVar.d(latVar.x());
                sgj sgjVarListIterator = scnVar.listIterator();
                while (sgjVarListIterator.hasNext()) {
                    ourVar.d(((phx) sgjVarListIterator.next()).e.g());
                }
                Set set = this.d;
                this.d = null;
                if (set == null || set.isEmpty()) {
                    setZ = latVar.z(this.b);
                } else {
                    setZ = latVar.A(this.b, set);
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        rnt.L(setZ.contains((pgf) it.next()));
                    }
                }
                pbnVar.g();
                HashMap map = new HashMap();
                HashSet<pio> hashSet = new HashSet();
                for (pgf pgfVar : setZ) {
                    pdv pdvVar = pgfVar.a;
                    for (peo peoVar : pdvVar.d()) {
                        if (peoVar instanceof pil) {
                            if (((pil) peoVar).i() == pet.IMAGE_READER) {
                                hashSet.add(pgfVar.c(peoVar));
                            }
                        }
                    }
                    pgfVar.j(pdoVar);
                    map.put(pdvVar, pgfVar);
                }
                pbnVar.f("MetadataDistributor#onFrameStarted");
                this.a.cn(setZ);
                pbnVar.h("ImageDistributors#onResultStarted");
                for (pio pioVar : hashSet) {
                    peo peoVarD = pioVar.d();
                    if (peoVarD instanceof phx) {
                        if (scnVar.contains(peoVarD)) {
                            Iterator it2 = ((phx) peoVarD).a.d.iterator();
                            boolean z = false;
                            while (it2.hasNext()) {
                                pif pifVar = (pif) it2.next();
                                a.I(pioVar.d().a() == pifVar.b);
                                pifVar.h.add(pioVar);
                                pifVar.c.execute(pifVar.d);
                                z = true;
                            }
                            if (!z) {
                                pioVar.i(null);
                            }
                        } else {
                            pioVar.i(null);
                        }
                    }
                }
                pbnVar.h("FrameBuffers#add");
                qrh qrhVar = this.i;
                Set setKeySet = map.keySet();
                scl sclVar = new scl();
                synchronized (qrhVar) {
                    for (pfd pfdVar : qrhVar.c) {
                        if (setKeySet.contains(pfdVar.i())) {
                            sclVar.d(pfdVar);
                        }
                    }
                }
                for (pfd pfdVar2 : sclVar.g()) {
                    pgf pgfVar2 = (pgf) map.get(pfdVar2.i());
                    pgfVar2.getClass();
                    phc phcVar = new phc(pgfVar2.a, pgfVar2, pgfVar2.a(false), this.k);
                    rnt.B(phcVar.a == pfdVar2.b, "Frame does not match source!");
                    pfdVar2.c.f(pfdVar2.toString().concat("#add"));
                    synchronized (pfdVar2) {
                        if (pfdVar2.i) {
                            phcVar.c();
                        } else {
                            pfdVar2.d.addLast(phcVar);
                            if (phcVar.d()) {
                                pfdVar2.f.addLast(phcVar);
                            } else {
                                pfdVar2.e.addLast(phcVar);
                            }
                            pfdVar2.t();
                            pbn pbnVar2 = pfdVar2.c;
                            pbnVar2.f(pfdVar2.toString().concat("#invokeListeners-direct"));
                            for (pdl pdlVar : pfdVar2.h) {
                                pbnVar2.f(String.valueOf(String.valueOf(pdlVar)).concat("#onFrameAvailable"));
                                pdlVar.d(phcVar);
                                pbnVar2.g();
                            }
                            pbnVar2.g();
                            pfdVar2.a.execute(new ovw(pfdVar2, phcVar, 11));
                        }
                    }
                    pfdVar2.c.g();
                }
                pbn pbnVar3 = this.c;
                pbnVar3.g();
                Iterator it3 = setZ.iterator();
                while (it3.hasNext()) {
                    ((pgf) it3.next()).h();
                }
                if (set != null && !set.isEmpty()) {
                    close();
                }
                ourVar.close();
                pbnVar3.g();
            } finally {
            }
        } catch (Throwable th) {
            this.c.g();
            throw th;
        }
    }
}
