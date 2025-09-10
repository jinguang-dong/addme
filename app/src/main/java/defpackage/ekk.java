package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekk {
    static final iso a = iso.y("k");

    public static List a(elb elbVar, efh efhVar, float f, eky ekyVar, boolean z) {
        elb elbVar2;
        efh efhVar2;
        float f2;
        eky ekyVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (elbVar.p() == 6) {
            efhVar.d("Lottie doesn't support expressions.");
            return arrayList;
        }
        elbVar.h();
        while (elbVar.n()) {
            if (elbVar.q(a) != 0) {
                elbVar.m();
            } else if (elbVar.p() == 1) {
                elbVar.g();
                if (elbVar.p() != 7) {
                    while (elbVar.n()) {
                        elb elbVar3 = elbVar;
                        efh efhVar3 = efhVar;
                        float f3 = f;
                        eky ekyVar3 = ekyVar;
                        boolean z3 = z;
                        arrayList.add(ekj.a(elbVar3, efhVar3, f3, ekyVar3, true, z3));
                        elbVar = elbVar3;
                        efhVar = efhVar3;
                        f = f3;
                        ekyVar = ekyVar3;
                        z = z3;
                    }
                    elbVar2 = elbVar;
                    efhVar2 = efhVar;
                    f2 = f;
                    ekyVar2 = ekyVar;
                    z2 = z;
                } else {
                    elbVar2 = elbVar;
                    efhVar2 = efhVar;
                    f2 = f;
                    ekyVar2 = ekyVar;
                    z2 = z;
                    arrayList.add(ekj.a(elbVar2, efhVar2, f2, ekyVar2, false, z2));
                }
                elbVar2.i();
                elbVar = elbVar2;
                efhVar = efhVar2;
                f = f2;
                ekyVar = ekyVar2;
                z = z2;
            } else {
                elb elbVar4 = elbVar;
                arrayList.add(ekj.a(elbVar4, efhVar, f, ekyVar, false, z));
                elbVar = elbVar4;
            }
        }
        elbVar.j();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            elo eloVar = (elo) list.get(i2);
            i2++;
            elo eloVar2 = (elo) list.get(i2);
            eloVar.h = Float.valueOf(eloVar2.g);
            if (eloVar.c == null && (obj = eloVar2.b) != null) {
                eloVar.c = obj;
                if (eloVar instanceof ehl) {
                    ((ehl) eloVar).a();
                }
            }
        }
        elo eloVar3 = (elo) list.get(i);
        if ((eloVar3.b == null || eloVar3.c == null) && list.size() > 1) {
            list.remove(eloVar3);
        }
    }
}
