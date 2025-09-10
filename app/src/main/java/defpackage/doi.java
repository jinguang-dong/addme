package defpackage;

import androidx.compose.foundation.layout.FillElement;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class doi implements uiu {
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public doi(long j, Object obj, int i) {
        this.c = i;
        this.a = j;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, uiv] */
    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.c != 0) {
            ayc aycVar = (ayc) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && aycVar.G()) {
                aycVar.r();
            } else {
                bay.K(arz.a.b(Float.valueOf(bkv.a(this.a))), bdq.k(-1072292694, new asu(this.b, 2), aycVar), aycVar, 56);
            }
            return ufg.a;
        }
        ayc aycVar2 = (ayc) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (aycVar2.H(i != 2, iIntValue & 1)) {
            kwp kwpVar = (kwp) aycVar2.e(dqe.a);
            long j = this.a;
            FillElement fillElement = amd.b;
            bik bikVarAR = byi.aR(fillElement, j, bll.a);
            ?? r12 = this.b;
            bie bieVar = bib.f;
            bsr bsrVarC = aku.c(bieVar, false);
            int iM = bay.M(aycVar2);
            bfk bfkVarM = aycVar2.M();
            bik bikVarV = bay.v(aycVar2, bikVarAR);
            uif uifVar = bum.a;
            aycVar2.L();
            aycVar2.v();
            if (aycVar2.F()) {
                aycVar2.j(uifVar);
            } else {
                aycVar2.x();
            }
            uiu uiuVar = bum.d;
            bbr.a(aycVar2, bsrVarC, uiuVar);
            uiu uiuVar2 = bum.c;
            bbr.a(aycVar2, bfkVarM, uiuVar2);
            uiu uiuVar3 = bum.e;
            if (aycVar2.F() || !a.ao(aycVar2.f(), Integer.valueOf(iM))) {
                Integer numValueOf = Integer.valueOf(iM);
                aycVar2.w(numValueOf);
                aycVar2.h(numValueOf, uiuVar3);
            }
            uiu uiuVar4 = bum.b;
            bbr.a(aycVar2, bikVarV, uiuVar4);
            boolean zD = aycVar2.D(kwpVar);
            Object objF = aycVar2.f();
            if (zD || objF == ayb.a) {
                objF = new dlz(kwpVar, 7);
                aycVar2.w(objF);
            }
            bik bikVarC = bko.c(fillElement, (uiq) objF);
            bsr bsrVarC2 = aku.c(bieVar, false);
            int iM2 = bay.M(aycVar2);
            bfk bfkVarM2 = aycVar2.M();
            bik bikVarV2 = bay.v(aycVar2, bikVarC);
            aycVar2.L();
            aycVar2.v();
            if (aycVar2.F()) {
                aycVar2.j(uifVar);
            } else {
                aycVar2.x();
            }
            bbr.a(aycVar2, bsrVarC2, uiuVar);
            bbr.a(aycVar2, bfkVarM2, uiuVar2);
            if (aycVar2.F() || !a.ao(aycVar2.f(), Integer.valueOf(iM2))) {
                Integer numValueOf2 = Integer.valueOf(iM2);
                aycVar2.w(numValueOf2);
                aycVar2.h(numValueOf2, uiuVar3);
            }
            bbr.a(aycVar2, bikVarV2, uiuVar4);
            r12.a(aky.a, aycVar2, 6);
            new bfh(-1149020734, true, new asu(kwpVar.a, 4)).a(aycVar2, 0);
            aycVar2.m();
            aycVar2.m();
        } else {
            aycVar2.r();
        }
        return ufg.a;
    }
}
