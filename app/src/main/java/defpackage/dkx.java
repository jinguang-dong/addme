package defpackage;

import androidx.wear.ambient.AmbientLifecycleObserverKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkx implements uiv {
    final /* synthetic */ dli a;
    final /* synthetic */ alv b;
    final /* synthetic */ dlh c;
    final /* synthetic */ akp d;
    final /* synthetic */ dki e;
    final /* synthetic */ boolean f;
    final /* synthetic */ afy g;
    final /* synthetic */ uiq h;
    final /* synthetic */ azr i;
    final /* synthetic */ bic j;
    final /* synthetic */ apg k;

    public dkx(dli dliVar, alv alvVar, dlh dlhVar, akp akpVar, dki dkiVar, bic bicVar, apg apgVar, boolean z, afy afyVar, uiq uiqVar, azr azrVar) {
        this.a = dliVar;
        this.b = alvVar;
        this.c = dlhVar;
        this.d = akpVar;
        this.e = dkiVar;
        this.j = bicVar;
        this.k = apgVar;
        this.f = z;
        this.g = afyVar;
        this.h = uiqVar;
        this.i = azrVar;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, uiq] */
    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        akz akzVar = (akz) obj;
        ayc aycVar = (ayc) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != aycVar.B(akzVar) ? 2 : 4;
        }
        if (aycVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
            chq chqVar = (chq) aycVar.e(bze.c);
            cib cibVar = (cib) aycVar.e(bze.h);
            boolean zBooleanValue = ((Boolean) aycVar.e(djh.a)).booleanValue();
            dli dliVar = this.a;
            long j = akzVar.a;
            int iIntValue2 = ((Number) ((dks) dliVar).a.a(new cho(j))).intValue();
            dli dksVar = zBooleanValue ? new dks(dliVar, 0) : dliVar;
            alv alvVar = this.b;
            dlh dlhVar = this.c;
            akp akpVar = this.d;
            dki dkiVar = this.e;
            bic bicVar = this.j;
            apg apgVar = this.k;
            boolean z = this.f;
            afy afyVar = this.g;
            uiq uiqVar = this.h;
            azr azrVar = this.i;
            final float fDi = chqVar.di(iIntValue2);
            dkk dkkVar = new dkk(alvVar, fDi);
            alw alwVar = (alw) alvVar;
            float f = alwVar.a;
            int iMo0do = chqVar.mo0do(f);
            float f2 = alwVar.b;
            int iMo0do2 = chqVar.mo0do(f2);
            dky dkyVar = new dky(chqVar, chp.h(j, -((int) chqVar.dk(byi.aE(alvVar, cibVar) + byi.aD(alvVar, cibVar))), -chqVar.mo0do(f + f2)));
            dlhVar.d.b(new dle(iIntValue2, iMo0do, iMo0do2, dksVar, chqVar.mo0do(((akm) akpVar).a), cho.a(j), dkiVar, ((Boolean) aycVar.e(bzs.a)).booleanValue()));
            bik bikVarR = byi.r(bdq.D(bik.c), new uiv() { // from class: dkv
                @Override // defpackage.uiv
                public final Object a(Object obj4, Object obj5, Object obj6) {
                    bst bstVar = (bst) obj4;
                    bsq bsqVar = (bsq) obj5;
                    long j2 = ((cho) obj6).a;
                    if (!cho.g(j2)) {
                        throw new IllegalArgumentException("height should be bounded");
                    }
                    float f3 = fDi;
                    int iDo = bstVar.mo0do(f3 + f3);
                    bte bteVarR = bsqVar.r(cho.k(j2, 0, 0, cho.c(j2) + iDo, cho.a(j2) + iDo, 3));
                    return bstVar.ds(bteVarR.t(), cho.a(j2), ufx.a, new aoy(bteVarR, bstVar, f3, 2));
                }
            });
            boolean zB = aycVar.B(dlhVar);
            Object objF = aycVar.f();
            byte[] bArr = null;
            if (zB || objF == ayb.a) {
                objF = new aff(dlhVar, azrVar, 17, bArr);
                aycVar.w(objF);
            }
            bik bikVarJ = bko.J(bikVarR, (uiq) objF);
            ank ankVar = dlhVar.b;
            boolean zB2 = aycVar.B(dkiVar) | aycVar.B(dlhVar) | aycVar.B(dkyVar) | aycVar.B(uiqVar);
            Object objF2 = aycVar.f();
            if (zB2 || objF2 == ayb.a) {
                objF2 = new ahg(dlhVar, dkyVar, uiqVar, 3);
                aycVar.w(objF2);
            }
            byi.ax(bikVarJ, ankVar, dkkVar, akpVar, bicVar, apgVar, z, afyVar, (uiq) objF2, aycVar, 0, 0);
            if (AmbientLifecycleObserverKt.f(azrVar)) {
                aycVar.u(612861732);
                boolean zB3 = aycVar.B(dlhVar);
                Object objF3 = aycVar.f();
                if (zB3 || objF3 == ayb.a) {
                    objF3 = new crd(dlhVar, (uhb) null, 7);
                    aycVar.w(objF3);
                }
                azb.f(dlhVar, (uiu) objF3, aycVar);
                aycVar.n();
            } else {
                aycVar.u(612943417);
                aycVar.n();
            }
        } else {
            aycVar.r();
        }
        return ufg.a;
    }
}
