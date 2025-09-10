package defpackage;

import androidx.compose.foundation.layout.FillElement;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqp implements uiu {
    final /* synthetic */ afy a;
    final /* synthetic */ dkf b;
    final /* synthetic */ uiv c;
    final /* synthetic */ uiw d;
    final /* synthetic */ alv e;
    final /* synthetic */ kwp f;

    public dqp(afy afyVar, dkf dkfVar, uiv uivVar, uiw uiwVar, alv alvVar, kwp kwpVar) {
        this.a = afyVar;
        this.b = dkfVar;
        this.c = uivVar;
        this.d = uiwVar;
        this.e = alvVar;
        this.f = kwpVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        ayc aycVar = (ayc) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (aycVar.H(i != 2, iIntValue & 1)) {
            afy afyVar = this.a;
            dkf dkfVar = this.b;
            uiv uivVar = this.c;
            uiw uiwVar = this.d;
            alv alvVar = this.e;
            kwp kwpVar = this.f;
            FillElement fillElement = amd.b;
            bie bieVar = bib.f;
            bsr bsrVarC = aku.c(bieVar, false);
            int iM = bay.M(aycVar);
            bfk bfkVarM = aycVar.M();
            bik bikVarV = bay.v(aycVar, fillElement);
            uif uifVar = bum.a;
            aycVar.L();
            aycVar.v();
            if (aycVar.F()) {
                aycVar.j(uifVar);
            } else {
                aycVar.x();
            }
            uiu uiuVar = bum.d;
            bbr.a(aycVar, bsrVarC, uiuVar);
            uiu uiuVar2 = bum.c;
            bbr.a(aycVar, bfkVarM, uiuVar2);
            uiu uiuVar3 = bum.e;
            if (aycVar.F() || !a.ao(aycVar.f(), Integer.valueOf(iM))) {
                Integer numValueOf = Integer.valueOf(iM);
                aycVar.w(numValueOf);
                aycVar.h(numValueOf, uiuVar3);
            }
            uiu uiuVar4 = bum.b;
            bbr.a(aycVar, bikVarV, uiuVar4);
            aky akyVar = aky.a;
            bik bikVarA = aga.a(bik.c, afyVar);
            bsr bsrVarC2 = aku.c(bieVar, false);
            int iM2 = bay.M(aycVar);
            bfk bfkVarM2 = aycVar.M();
            bik bikVarV2 = bay.v(aycVar, bikVarA);
            aycVar.L();
            aycVar.v();
            if (aycVar.F()) {
                aycVar.j(uifVar);
            } else {
                aycVar.x();
            }
            bbr.a(aycVar, bsrVarC2, uiuVar);
            bbr.a(aycVar, bfkVarM2, uiuVar2);
            if (aycVar.F() || !a.ao(aycVar.f(), Integer.valueOf(iM2))) {
                Integer numValueOf2 = Integer.valueOf(iM2);
                aycVar.w(numValueOf2);
                aycVar.h(numValueOf2, uiuVar3);
            }
            bbr.a(aycVar, bikVarV2, uiuVar4);
            uiwVar.e(akyVar, alvVar, aycVar, 6);
            aycVar.m();
            aycVar.u(57511414);
            boolean zD = aycVar.D(kwpVar) | aycVar.D(dkfVar);
            Object objF = aycVar.f();
            byte[] bArr = null;
            if (zD || objF == ayb.a) {
                objF = new aet(kwpVar, dkfVar, 12, bArr);
                aycVar.w(objF);
            }
            dqe.a((uif) objF, null, uivVar, aycVar, 0);
            aycVar.n();
            aycVar.u(1248780609);
            aycVar.n();
            aycVar.m();
        } else {
            aycVar.r();
        }
        return ufg.a;
    }
}
