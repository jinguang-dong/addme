package defpackage;

import androidx.compose.foundation.layout.FillElement;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqe {
    public static final ayp a = new ayz(bap.c, new drg(1));

    public static final void a(uif uifVar, aby abyVar, uiv uivVar, ayc aycVar, int i) {
        int i2;
        ayc aycVarC = aycVar.c(-215800099);
        if ((i & 6) == 0) {
            i2 = (true != aycVarC.D(uifVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != aycVarC.D(uivVar) ? 128 : 256;
        }
        if (aycVarC.H((i3 & 147) != 146, i3 & 1)) {
            abyVar = byi.bf(0.0f, 400.0f, null, 5);
            if (uivVar == null) {
                aycVarC.u(665600820);
                ((ayg) aycVarC).Y();
            } else {
                aycVarC.u(665600821);
                aycVarC.u(1999240128);
                ayg aygVar = (ayg) aycVarC;
                Object objR = aygVar.R();
                Object obj = ayb.a;
                if (objR == obj) {
                    objR = new azv(0.0f);
                    aygVar.ac(objR);
                }
                bbb bbbVar = (bbb) objR;
                boolean zD = aycVarC.D(abyVar) | ((i3 & 14) == 4);
                Object objR2 = aygVar.R();
                if (zD || objR2 == obj) {
                    objR2 = new dqd(uifVar, bbbVar, abyVar, null);
                    aygVar.ac(objR2);
                }
                azb.f(uifVar, (uiu) objR2, aycVarC);
                FillElement fillElement = amd.b;
                Object objR3 = aygVar.R();
                if (objR3 == obj) {
                    objR3 = new dlz(bbbVar, 10);
                    aygVar.ac(objR3);
                }
                bik bikVarC = bko.c(fillElement, (uiq) objR3);
                bsr bsrVarC = aku.c(bib.f, false);
                int iM = bay.M(aycVarC);
                bfk bfkVarAg = aygVar.ag();
                bik bikVarV = bay.v(aycVarC, bikVarC);
                uif uifVar2 = bum.a;
                aycVarC.v();
                if (aygVar.v) {
                    aycVarC.j(uifVar2);
                } else {
                    aycVarC.x();
                }
                bbr.a(aycVarC, bsrVarC, bum.d);
                bbr.a(aycVarC, bfkVarAg, bum.c);
                uiu uiuVar = bum.e;
                if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iM))) {
                    Integer numValueOf = Integer.valueOf(iM);
                    aygVar.ac(numValueOf);
                    aycVarC.h(numValueOf, uiuVar);
                }
                bbr.a(aycVarC, bikVarV, bum.b);
                uivVar.a(aky.a, aycVarC, 6);
                aycVarC.m();
                aygVar.Y();
                aygVar.Y();
            }
        } else {
            aycVarC.r();
        }
        aby abyVar2 = abyVar;
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new apc((Object) uifVar, (Object) abyVar2, uivVar, i, 8);
        }
    }
}
