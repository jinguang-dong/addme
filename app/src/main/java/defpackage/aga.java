package defpackage;

import androidx.compose.foundation.OverscrollModifierElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aga {
    public static final ayp a = new ayr(new vd(20));

    public static final bik a(bik bikVar, afy afyVar) {
        bik overscrollModifierElement;
        if (afyVar == null || (overscrollModifierElement = afyVar.c()) == null) {
            overscrollModifierElement = bik.c;
        }
        if (overscrollModifierElement == bik.c) {
            overscrollModifierElement = new OverscrollModifierElement(afyVar);
        }
        return bikVar.cM(overscrollModifierElement);
    }

    public static final afy b(ayc aycVar) {
        aycVar.u(282942128);
        afz afzVar = (afz) aycVar.e(a);
        if (afzVar == null) {
            ((ayg) aycVar).Y();
            return null;
        }
        boolean zB = aycVar.B(afzVar);
        ayg aygVar = (ayg) aycVar;
        Object objR = aygVar.R();
        if (zB || objR == ayb.a) {
            objR = afzVar.a();
            aygVar.ac(objR);
        }
        afy afyVar = (afy) objR;
        aygVar.Y();
        return afyVar;
    }
}
