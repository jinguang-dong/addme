package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgw {
    private final pdt a;
    private final pgk b;
    private final Set c;
    private final scn d;
    private final scn e;
    private final Set f;
    private final piu g;
    private final Set h;
    private final pmg i;
    private final pmv j;
    private final rcg k;
    private final ojl l;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public pgw(pdt pdtVar, pgk pgkVar, rcg rcgVar, pez pezVar, qrh qrhVar, ojl ojlVar, Set set, pmv pmvVar, pmg pmgVar, piu piuVar) {
        this.a = pdtVar;
        this.b = pgkVar;
        this.k = rcgVar;
        this.j = pmvVar;
        this.h = set;
        this.i = pmgVar;
        scl sclVar = new scl();
        synchronized (qrhVar) {
            Iterator it = qrhVar.c.iterator();
            while (it.hasNext()) {
                sclVar.d(((pfd) it.next()).i());
            }
        }
        this.c = sclVar.g();
        this.d = pezVar.b();
        this.e = pezVar.a();
        this.l = ojlVar;
        this.f = new HashSet();
        this.g = piuVar;
    }

    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, uem] */
    private final phj j(pek pekVar, Set set, Set set2, Set set3, Set set4, rwc rwcVar) {
        Iterator it = set4.iterator();
        while (it.hasNext()) {
            a.I(set3.contains(((pgf) it.next()).a));
        }
        scl sclVar = new scl();
        Iterator it2 = set3.iterator();
        while (it2.hasNext()) {
            sclVar.j(((pgb) it2.next()).c);
        }
        HashMap map = new HashMap();
        sgj sgjVarListIterator = this.a.h.listIterator();
        while (sgjVarListIterator.hasNext()) {
            pej pejVar = (pej) sgjVarListIterator.next();
            map.put(pejVar.a, pejVar);
        }
        Iterator it3 = set3.iterator();
        while (it3.hasNext()) {
            for (pej pejVar2 : ((pdv) it3.next()).c()) {
                CaptureRequest.Key key = pejVar2.a;
                if (map.containsKey(key)) {
                    pej pejVar3 = (pej) map.get(key);
                    pejVar3.getClass();
                    if (!pejVar2.equals(pejVar3)) {
                        throw new IllegalStateException("Conflicting parameter value for " + key.toString() + ": " + pejVar2.b.toString() + " and " + pejVar3.b.toString() + " do not match.");
                    }
                } else {
                    map.put(key, pejVar2);
                }
            }
        }
        Iterator it4 = set.iterator();
        while (it4.hasNext()) {
            pej pejVar4 = (pej) it4.next();
            CaptureRequest.Key key2 = pejVar4.a;
            if (!map.containsKey(key2)) {
                map.put(key2, pejVar4);
            }
        }
        sbp sbpVar = pekVar.b;
        int size = sbpVar.size();
        for (int i = 0; i < size; i++) {
            pej pejVar5 = (pej) sbpVar.get(i);
            CaptureRequest.Key key3 = pejVar5.a;
            if (!map.containsKey(key3)) {
                map.put(key3, pejVar5);
            }
        }
        pmg pmgVar = this.i;
        paq paqVarH = pmgVar.h();
        try {
            Set<pej> setM = pmg.m((phe) pmgVar.c);
            paqVarH.close();
            for (pej pejVar6 : setM) {
                CaptureRequest.Key key4 = pejVar6.a;
                if (!map.containsKey(key4)) {
                    map.put(key4, pejVar6);
                }
            }
            rwc rwcVarB = this.g.b();
            if (rwcVarB.h() && !map.containsKey(((pej) rwcVarB.c()).a)) {
                map.put(((pej) rwcVarB.c()).a, rwcVarB.c());
            }
            for (pej pejVar7 : this.h) {
                CaptureRequest.Key key5 = pejVar7.a;
                if (!map.containsKey(key5)) {
                    map.put(key5, pejVar7);
                }
            }
            scl sclVar2 = new scl();
            sclVar2.j(set2);
            rcg rcgVar = this.k;
            lat latVar = (lat) rcgVar.f.a();
            latVar.getClass();
            qrh qrhVar = (qrh) rcgVar.c.a();
            qrhVar.getClass();
            pgk pgkVar = (pgk) rcgVar.e.a();
            pgkVar.getClass();
            scn scnVar = (scn) rcgVar.a.a();
            scnVar.getClass();
            pbn pbnVar = (pbn) rcgVar.b.a();
            pbnVar.getClass();
            ojl ojlVar = (ojl) rcgVar.d.a();
            ojlVar.getClass();
            set4.getClass();
            sclVar2.d(new pfe(latVar, qrhVar, pgkVar, scnVar, pbnVar, ojlVar, set3, set4));
            sclVar2.d(this.b);
            return new phj(pekVar.a, scn.F(map.values()), sclVar2.g(), sclVar.g(), rwcVar);
        } finally {
        }
    }

    private final phj k(Set set, Set set2, Set set3, Set set4) {
        return j(o(set3) ? this.a.f : this.a.e, set, set2, set3, set4, rvk.a);
    }

    private final synchronized void l() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            pgf pgfVar = (pgf) it.next();
            if (pgfVar.l()) {
                it.remove();
                pgfVar.h();
            }
        }
    }

    private final synchronized void m() {
        l();
        Set<pgf> set = this.f;
        for (pgf pgfVar : set) {
            pgfVar.g();
            pgfVar.h();
        }
        set.clear();
    }

    private final synchronized void n(Set set) {
        l();
        this.f.addAll(set);
    }

    private static final boolean o(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((pdv) it.next()).d().iterator();
            while (it2.hasNext()) {
                if (((peo) it2.next()).f()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final synchronized pfg a(pee peeVar) {
        pfg pfgVarB;
        pfgVarB = b();
        pfgVarB.d();
        pfgVarB.a.clear();
        pfgVarB.c = rwc.j(peeVar);
        return pfgVarB;
    }

    public final synchronized pfg b() {
        pfg pfgVar;
        sfd sfdVar = sfd.a;
        pfgVar = new pfg(new HashMap(), new HashSet(sfdVar), new HashSet(sfdVar), rvk.a);
        pfgVar.b.addAll(this.c);
        pfgVar.f(this.d);
        pfgVar.g(this.l);
        scn scnVar = this.e;
        if (!scnVar.isEmpty()) {
            pfgVar.g(pdr.a(scnVar));
        }
        return pfgVar;
    }

    public final phj c(Set set, Set set2, Set set3, Set set4, rwc rwcVar) {
        return j(o(set3) ? this.a.d : this.a.c, set, set2, set3, set4, rwcVar);
    }

    public final synchronized void d() {
        try {
            this.j.e();
            m();
        } catch (CameraAccessException | pnv e) {
            throw new pco(e);
        }
    }

    public final synchronized void e() {
        this.j.g();
    }

    public final synchronized void f(List list, List list2) throws Throwable {
        pgw pgwVar;
        try {
            a.I(!list.isEmpty());
            int i = 0;
            a.I(list.size() == list2.size());
            ArrayList arrayList = new ArrayList(list.size());
            while (i < list.size()) {
                pfh pfhVar = (pfh) list.get(i);
                a.I(!pfhVar.d.h());
                Set set = (Set) list2.get(i);
                pgwVar = this;
                try {
                    arrayList.add(pgwVar.c(pfhVar.a, pfhVar.b, pfhVar.c, set, rvk.a));
                    pgwVar.n(set);
                    i++;
                    this = pgwVar;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            }
            pgw pgwVar2 = this;
            pgwVar2.j.i(arrayList);
        } catch (Throwable th3) {
            th = th3;
            pgwVar = this;
        }
    }

    public final synchronized void g(pfh pfhVar) {
        this.j.f(k(pfhVar.a, pfhVar.b, pfhVar.c, sfd.a));
    }

    public final synchronized void h(pfh pfhVar, Set set) throws Throwable {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            phj phjVarC = c(pfhVar.a, pfhVar.b, pfhVar.c, set, pfhVar.d);
            n(set);
            this.j.h(phjVarC);
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void i(pfh pfhVar) {
        this.j.h(k(pfhVar.a, pfhVar.b, pfhVar.c, sfd.a));
    }
}
