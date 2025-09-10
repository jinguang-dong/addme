package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmd implements lmc {
    public final List a = new ArrayList();
    public final HashMap b = new HashMap();

    private final List e(long j) {
        ArrayList arrayList = new ArrayList();
        for (lmc lmcVar : this.a) {
            HashMap map = this.b;
            if (map.get(lmcVar) == null || ((Long) map.get(lmcVar)).longValue() == j) {
                arrayList.add(lmcVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.lmc
    public final void a(lmo lmoVar, ltd ltdVar) {
        List listE;
        synchronized (this.a) {
            listE = e(lmoVar.a);
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            ((lmc) it.next()).a(lmoVar, ltdVar);
        }
    }

    @Override // defpackage.lmc
    public final void b(lmo lmoVar) {
        List listE;
        synchronized (this.a) {
            listE = e(lmoVar.a);
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            ((lmc) it.next()).b(lmoVar);
        }
    }

    @Override // defpackage.lmc
    public final void c(lmo lmoVar, lpa lpaVar) {
        List listE;
        synchronized (this.a) {
            listE = e(lmoVar.a);
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            ((lmc) it.next()).c(lmoVar, lpaVar);
        }
    }

    @Override // defpackage.lmc
    public final void d(lmo lmoVar, ggg gggVar) {
        List listE;
        synchronized (this.a) {
            listE = e(lmoVar.a);
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            ((lmc) it.next()).d(lmoVar, gggVar);
        }
    }
}
