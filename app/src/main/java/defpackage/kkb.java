package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkb implements rvu {
    final /* synthetic */ List a;

    public kkb(List list) {
        this.a = list;
    }

    @Override // defpackage.rvu
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Object next;
        Set set = (Set) obj;
        set.getClass();
        rnt.L(set.size() == 1);
        if (set instanceof List) {
            next = ((List) set).get(0);
        } else {
            Iterator it = set.iterator();
            int iAI = ujp.aI(it, 0);
            if (!it.hasNext()) {
                throw new IndexOutOfBoundsException(a.bE(iAI, "position (0) must be less than the number of elements that remained (", ")"));
            }
            next = it.next();
        }
        poj pojVar = ((lmg) next).a;
        long jD = pojVar.d();
        pojVar.close();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((poj) it2.next()).d()));
        }
        int iIndexOf = arrayList.indexOf(Long.valueOf(jD));
        rnt.L(iIndexOf >= 0);
        return Integer.valueOf(iIndexOf);
    }
}
