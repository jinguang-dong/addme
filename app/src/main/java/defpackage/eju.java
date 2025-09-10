package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eju {
    private static final iso a = iso.y("k", "x", "y");

    public static eii a(elb elbVar, efh efhVar) {
        ArrayList arrayList = new ArrayList();
        if (elbVar.p() == 1) {
            elbVar.g();
            while (elbVar.n()) {
                elb elbVar2 = elbVar;
                efh efhVar2 = efhVar;
                arrayList.add(new ehl(efhVar2, ekj.a(elbVar2, efhVar2, eln.a(), ekc.d, elbVar.p() == 3, false)));
                elbVar = elbVar2;
                efhVar = efhVar2;
            }
            elbVar.i();
            ekk.b(arrayList);
        } else {
            arrayList.add(new elo(eki.c(elbVar, eln.a())));
        }
        return new eii(arrayList);
    }

    static eip b(elb elbVar, efh efhVar) {
        elbVar.h();
        boolean z = false;
        eii eiiVarA = null;
        eif eifVarAe = null;
        eif eifVarAe2 = null;
        while (elbVar.p() != 4) {
            int iQ = elbVar.q(a);
            if (iQ == 0) {
                eiiVarA = a(elbVar, efhVar);
            } else if (iQ != 1) {
                if (iQ != 2) {
                    elbVar.l();
                    elbVar.m();
                } else if (elbVar.p() == 6) {
                    elbVar.m();
                    z = true;
                } else {
                    eifVarAe2 = gsn.ae(elbVar, efhVar);
                }
            } else if (elbVar.p() == 6) {
                elbVar.m();
                z = true;
            } else {
                eifVarAe = gsn.ae(elbVar, efhVar);
            }
        }
        elbVar.j();
        if (z) {
            efhVar.d("Lottie doesn't support expressions.");
        }
        return eiiVarA != null ? eiiVarA : new eim(eifVarAe, eifVarAe2);
    }
}
