package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqd {
    public static final uev a;

    static {
        ufw ufwVar = ufw.a;
        a = new uev(ufwVar, ufwVar);
    }

    public static final void a(ccm ccmVar, List list, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-1794596951);
        int i4 = i3 == 0 ? (true != aycVarC.B(ccmVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i4 |= true != aycVarC.D(list) ? 16 : 32;
        }
        if (aycVarC.H((i4 & 19) != 18, i4 & 1)) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                ccl cclVar = (ccl) list.get(i5);
                uiv uivVar = (uiv) cclVar.a;
                int i6 = cclVar.b;
                int i7 = cclVar.c;
                ayg aygVar = (ayg) aycVarC;
                Object objR = aygVar.R();
                if (objR == ayb.a) {
                    objR = aqc.a;
                    aygVar.ac(objR);
                }
                bsr bsrVar = (bsr) objR;
                bih bihVar = bik.c;
                int iR = a.r(bay.N(aycVarC));
                bfk bfkVarAg = aygVar.ag();
                bik bikVarV = bay.v(aycVarC, bihVar);
                uif uifVar = bum.a;
                aycVarC.v();
                if (aygVar.v) {
                    aycVarC.j(uifVar);
                } else {
                    aycVarC.x();
                }
                bbr.a(aycVarC, bsrVar, bum.d);
                bbr.a(aycVarC, bfkVarAg, bum.c);
                uiu uiuVar = bum.e;
                if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iR))) {
                    Integer numValueOf = Integer.valueOf(iR);
                    aygVar.ac(numValueOf);
                    aycVarC.h(numValueOf, uiuVar);
                }
                bbr.a(aycVarC, bikVarV, bum.b);
                uivVar.a(ccmVar.subSequence(i6, i7).b, aycVarC, 0);
                aycVarC.m();
            }
            i2 = 0;
        } else {
            i2 = 0;
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aqb(ccmVar, list, i, i2);
        }
    }
}
