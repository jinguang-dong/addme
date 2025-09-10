package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbg implements lcu {
    private final our a = new our();
    private final Set b;
    private final owf c;
    private final Map d;
    private final pdv e;

    public lbg(Map map, owf owfVar, pfl pflVar, boolean z) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = owfVar;
        HashMap map2 = new HashMap();
        for (lcz lczVar : map.keySet()) {
            pdv pdvVar = (pdv) map.get(lczVar);
            String strBY = qpt.bY(lczVar, pdvVar);
            strBY.getClass();
            map2.put(strBY, pdvVar);
            hashSet.add(pdvVar.b());
        }
        this.d = map2;
        for (Map.Entry entry : map2.entrySet()) {
            this.a.d(((pdv) entry.getValue()).b().dK(new leg(pflVar, entry, 1), sxo.a));
        }
        pdv pdvVar2 = (pdv) map.get(lcz.RAW_WIDE);
        pdv pdvVar3 = (pdv) map.get(lcz.RAW_WIDE_RM);
        if (pdvVar3 == null || !(z || pdvVar2 == null)) {
            pdvVar2.getClass();
            this.e = pdvVar2;
        } else {
            this.e = pdvVar3;
        }
        this.e.d();
    }

    @Override // defpackage.lcu
    public final owf b() {
        return owl.e(this.b);
    }

    @Override // defpackage.rww
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized pdv fr() {
        pdv pdvVar;
        Map map = this.d;
        owf owfVar = this.c;
        pdvVar = (pdv) map.get(owfVar.dL());
        if (pdvVar == null) {
            pdvVar = this.e;
        }
        owfVar.dL();
        return pdvVar;
    }

    public final void d() {
        this.a.close();
    }
}
