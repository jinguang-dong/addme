package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lff implements lfc {
    private final pfu a;

    public lff(pfu pfuVar) {
        this.a = pfuVar;
        gzi gziVar = gzs.a;
    }

    private static final scn c(Set set) {
        scl sclVar = new scl();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            peo peoVar = (peo) it.next();
            if (kzz.i(peoVar) || kzz.h(peoVar)) {
                sclVar.d(peoVar);
            }
        }
        return sclVar.g();
    }

    @Override // defpackage.lfc
    public final pdv a(pdv pdvVar) {
        Set setD = pdvVar.d();
        return setD.size() == 1 ? this.a.g(pdvVar.d(), pdvVar.c()) : this.a.g(c(setD), pdvVar.c());
    }

    @Override // defpackage.lfc
    public final scn b(lau lauVar) {
        return c(lauVar.a.c().d());
    }
}
