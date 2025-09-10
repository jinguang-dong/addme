package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import androidx.compose.foundation.HoverableElement;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqp {
    public final azr a = new azz(null, bap.c);
    public ccm b;
    public final bgz c;
    private final ccm d;

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public aqp(ccm ccmVar) {
        this.d = ccmVar;
        add addVar = new add(13);
        cck cckVar = new cck(ccmVar);
        List list = cckVar.a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ?? A = addVar.a(((ccj) list.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList2 = new ArrayList(A.size());
            int size2 = A.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(bqs.u((ccl) A.get(i2)));
            }
            ske.bT(arrayList, arrayList2);
        }
        cckVar.a.clear();
        cckVar.a.addAll(arrayList);
        this.b = cckVar.a();
        this.c = new bgz();
    }

    public static final ccl d(ccl cclVar, cdl cdlVar) {
        int iB = cdlVar.b() - 1;
        int i = cclVar.b;
        int i2 = cdl.i(cdlVar, iB);
        if (i < i2) {
            return ccl.a(cclVar, null, Math.min(cclVar.c, i2), 11);
        }
        return null;
    }

    public final cdl a() {
        return (cdl) this.a.a();
    }

    public final void b(ayc aycVar, int i) {
        int i2 = i & 6;
        ayc aycVarC = aycVar.c(1154651354);
        int i3 = i2 == 0 ? (true != aycVarC.D(this) ? 2 : 4) | i : i;
        if (aycVarC.H((i3 & 3) != 2, i3 & 1)) {
            byx byxVar = (byx) aycVarC.e(bze.i);
            ccm ccmVar = this.b;
            List listC = ccmVar.c(ccmVar.a());
            int size = listC.size();
            for (int i4 = 0; i4 < size; i4++) {
                ccl cclVar = (ccl) listC.get(i4);
                if (cclVar.b != cclVar.c) {
                    aycVarC.u(725478904);
                    ayg aygVar = (ayg) aycVarC;
                    Object objR = aygVar.R();
                    Object obj = ayb.a;
                    if (objR == obj) {
                        objR = new ocq((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                        aygVar.ac(objR);
                    }
                    ocq ocqVar = (ocq) objR;
                    bik bikVarC = bko.c(bik.c, new aff(this, cclVar, 8));
                    Object objR2 = aygVar.R();
                    if (objR2 == obj) {
                        objR2 = new add(14);
                        aygVar.ac(objR2);
                    }
                    bik bikVarCM = cbp.b(bikVarC, false, (uiq) objR2).cM(new aqr(new aqn(this, cclVar))).cM(new HoverableElement(ocqVar)).cM(new PointerHoverIconModifierElement(bpr.c));
                    boolean zD = aycVarC.D(this) | aycVarC.B(cclVar) | aycVarC.D(byxVar);
                    Object objR3 = aygVar.R();
                    if (zD || objR3 == obj) {
                        objR3 = new aei(cclVar, 12);
                        aygVar.ac(objR3);
                    }
                    aku.b(byi.bL(bikVarCM, ocqVar, null, false, null, (uif) objR3, 508), aycVarC, 0);
                    ((ccu) cclVar.a).a();
                    aycVarC.u(728330718);
                    aygVar.Y();
                    aygVar.Y();
                } else {
                    aycVarC.u(728344606);
                    ((ayg) aycVarC).Y();
                }
            }
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(this, i, 2);
        }
    }

    public final void c(Object[] objArr, uiq uiqVar, ayc aycVar, int i) {
        int i2 = i & 48;
        ayc aycVarC = aycVar.c(-2083052099);
        int i3 = i2 == 0 ? (true != aycVarC.D(uiqVar) ? 16 : 32) | i : i;
        if ((i & 384) == 0) {
            i3 |= true != aycVarC.D(this) ? 128 : 256;
        }
        aycVarC.t(-358305778, 7);
        int i4 = i3 | (true != aycVarC.z(7) ? 0 : 4);
        for (int i5 = 0; i5 < 7; i5++) {
            i4 |= true != aycVarC.D(objArr[i5]) ? 0 : 4;
        }
        ayg aygVar = (ayg) aycVarC;
        aygVar.Y();
        if ((i4 & 14) == 0) {
            i4 |= 2;
        }
        if (aycVarC.H((i4 & 147) != 146, i4 & 1)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(uiqVar);
            ujk.a(objArr, arrayList);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zD = aycVarC.D(this) | ((i4 & ScriptIntrinsicBLAS.TRANSPOSE) == 32);
            Object objR = aygVar.R();
            if (zD || objR == ayb.a) {
                objR = new aff(this, uiqVar, 9);
                aygVar.ac(objR);
            }
            azb.d(array, (uiq) objR, aycVarC);
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new apc(this, objArr, uiqVar, i, 2);
        }
    }
}
