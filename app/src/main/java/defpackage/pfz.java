package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pfz implements paq {
    public final pgo a;
    public final pbn b;
    public final lat c;
    public final ojl d;
    private final pbc e;

    public pfz(lat latVar, pbn pbnVar, pbc pbcVar, ojl ojlVar, pgo pgoVar) {
        this.c = latVar;
        this.b = pbnVar;
        this.e = pbcVar.a("FrameServerSession");
        this.d = ojlVar;
        this.a = pgoVar;
    }

    public static final void i(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Set) it.next()).iterator();
            while (it2.hasNext()) {
                ((pgf) it2.next()).h();
            }
        }
    }

    public static final List j(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pfh pfhVar = (pfh) it.next();
            a.I(pfhVar instanceof pfh);
            arrayList.add(scn.F(pfhVar.c));
        }
        return arrayList;
    }

    public final pdi a() {
        return this.a.a();
    }

    public final syu b(pdj pdjVar) {
        return this.a.f(pdjVar, false);
    }

    public final List c(List list) {
        List list2;
        String str = "#submit-burst size=" + list.size();
        pbc pbcVar = this.e;
        pbcVar.b(str);
        pbn pbnVar = this.b;
        pbnVar.f("FrameServerSession#submit(burst)");
        ArrayList<syu> arrayList = new ArrayList(list.size());
        List listJ = j(list);
        pbnVar.f("allocate");
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(this.c.y((Set) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        try {
            try {
                pbnVar.h("await");
                list2 = (List) ((swn) ske.I(arrayList)).s();
                try {
                    pbcVar.b("#submit-list allocations complete.");
                    rnt.L(list2.size() == list.size());
                    pbnVar.h("build_results");
                    ArrayList arrayList3 = new ArrayList(list.size());
                    for (int i = 0; i < list.size(); i++) {
                        Set<pgf> set = (Set) list2.get(i);
                        sbr sbrVarJ = sbv.j(set.size());
                        for (pgf pgfVar : set) {
                            pdk pdkVarK = pgy.k(pgfVar, this.d);
                            pdkVarK.getClass();
                            sbrVarJ.f(pgfVar.a, pdkVarK);
                        }
                        arrayList3.add(new pfy(sbrVarJ.b()));
                    }
                    try {
                        pbcVar.b("#submit-list frame results created, submitting to request processor.");
                        pbnVar.h("submit");
                        this.a.i(list, list2);
                        pbnVar.g();
                        pbnVar.g();
                        return arrayList3;
                    } catch (InterruptedException | ExecutionException | pco e) {
                        e = e;
                        arrayList2 = arrayList3;
                        for (syu syuVar : arrayList) {
                            if (!syuVar.cancel(true) || syuVar.isDone()) {
                                Set set2 = (Set) ojl.ci(syuVar);
                                if (set2 != null) {
                                    Iterator it2 = set2.iterator();
                                    while (it2.hasNext()) {
                                        ((pgf) it2.next()).h();
                                    }
                                }
                            }
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            ((pfy) it3.next()).close();
                        }
                        if (list2 != null) {
                            i(list2);
                        }
                        throw new pco(e);
                    }
                } catch (InterruptedException | ExecutionException | pco e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                pbn pbnVar2 = this.b;
                pbnVar2.g();
                pbnVar2.g();
                throw th;
            }
        } catch (InterruptedException | ExecutionException | pco e3) {
            e = e3;
            list2 = null;
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final void d() {
        this.a.g();
    }

    public final pfg e() {
        return this.a.c();
    }

    public final pfg f() {
        return this.a.c();
    }

    public final pfy g(pfh pfhVar) {
        pfy pfyVar;
        Set set;
        String strConcat = "#submit ".concat(pfhVar.toString());
        pbc pbcVar = this.e;
        pbcVar.b(strConcat);
        pbn pbnVar = this.b;
        pbnVar.f("FrameServerSession#submit(single)");
        pbnVar.f("allocate");
        a.I(true);
        syu syuVarY = this.c.y(pfhVar.c);
        Set set2 = null;
        try {
            try {
                pbnVar.h("await");
                Set<pgf> set3 = (Set) ((swn) syuVarY).s();
                try {
                    pbcVar.b("#submit allocations complete.");
                    sbr sbrVarJ = sbv.j(set3.size());
                    pbnVar.h("build_results");
                    for (pgf pgfVar : set3) {
                        pdk pdkVarK = pgy.k(pgfVar, this.d);
                        pdkVarK.getClass();
                        sbrVarJ.f(pgfVar.a, pdkVarK);
                    }
                    pfyVar = new pfy(sbrVarJ.b());
                    try {
                        pbnVar.h("submit");
                        pbcVar.b("#submit pending result created, submitting to request processor.");
                        this.a.k(pfhVar, set3);
                        pbnVar.g();
                        pbnVar.g();
                        return pfyVar;
                    } catch (InterruptedException | ExecutionException | pco e) {
                        e = e;
                        set2 = set3;
                        if ((!syuVarY.cancel(true) || syuVarY.isDone()) && (set = (Set) ojl.ci(syuVarY)) != null) {
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                ((pgf) it.next()).h();
                            }
                        }
                        if (pfyVar != null) {
                            pfyVar.close();
                        }
                        if (set2 != null) {
                            Iterator it2 = set2.iterator();
                            while (it2.hasNext()) {
                                ((pgf) it2.next()).h();
                            }
                        }
                        throw new pco(e);
                    }
                } catch (InterruptedException | ExecutionException | pco e2) {
                    e = e2;
                    pfyVar = null;
                }
            } catch (Throwable th) {
                pbn pbnVar2 = this.b;
                pbnVar2.g();
                pbnVar2.g();
                throw th;
            }
        } catch (InterruptedException | ExecutionException | pco e3) {
            e = e3;
            pfyVar = null;
        }
    }

    public final void h(pfh pfhVar) {
        this.a.j(pfhVar);
    }

    public final syu k(pdj pdjVar) {
        return this.a.l(pdjVar);
    }

    public final void l(pdj pdjVar) {
        this.a.n(pdjVar);
    }

    public final void m(Set set, ojl ojlVar) {
        this.a.o(set, ojlVar);
    }
}
