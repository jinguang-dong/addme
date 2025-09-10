package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aub implements uiu {
    final /* synthetic */ bik a;
    final /* synthetic */ blp b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ uiu f;

    public aub(bik bikVar, blp blpVar, long j, float f, float f2, uiu uiuVar) {
        this.a = bikVar;
        this.b = blpVar;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.f = uiuVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        ayc aycVar = (ayc) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && aycVar.G()) {
            aycVar.r();
        } else {
            bik bikVarM = akg.m(this.a, this.b, akg.n(this.c, (asc) aycVar.e(asm.a), this.d, aycVar), this.e);
            Object objF = aycVar.f();
            Object obj3 = ayb.a;
            if (objF == obj3) {
                objF = new add(18);
                aycVar.w(objF);
            }
            bik bikVarB = cbp.b(bikVarM, false, (uiq) objF);
            ufg ufgVar = ufg.a;
            Object objF2 = aycVar.f();
            if (objF2 == obj3) {
                objF2 = new byo((uhb) null, 1, (byte[]) null);
                aycVar.w(objF2);
            }
            bpp bppVar = bqh.a;
            bik bikVarCM = bikVarB.cM(new SuspendPointerInputElement(ufgVar, null, new bqg((uiu) objF2), 6));
            uiu uiuVar = this.f;
            bsr bsrVarC = aku.c(bib.f, true);
            int iM = bay.M(aycVar);
            bfk bfkVarM = aycVar.M();
            bik bikVarV = bay.v(aycVar, bikVarCM);
            uif uifVar = bum.a;
            aycVar.L();
            aycVar.v();
            if (aycVar.F()) {
                aycVar.j(uifVar);
            } else {
                aycVar.x();
            }
            bbr.a(aycVar, bsrVarC, bum.d);
            bbr.a(aycVar, bfkVarM, bum.c);
            uiu uiuVar2 = bum.e;
            if (aycVar.F() || !a.ao(aycVar.f(), Integer.valueOf(iM))) {
                Integer numValueOf = Integer.valueOf(iM);
                aycVar.w(numValueOf);
                aycVar.h(numValueOf, uiuVar2);
            }
            bbr.a(aycVar, bikVarV, bum.b);
            uiuVar.a(aycVar, 0);
            aycVar.m();
        }
        return ufg.a;
    }
}
