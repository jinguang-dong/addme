package defpackage;

import androidx.wear.ambient.WearableControllerProvider;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ars implements uiu {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ars(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [alv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [alv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r11v30, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r11v44, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r13v108, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r13v113, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r13v118, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r13v123, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r13v29, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r13v40, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r13v45, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r13v82, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r13v91, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r13v96, types: [java.lang.Object, uiv] */
    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = 3;
        switch (this.c) {
            case 0:
                ayc aycVar = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar.G()) {
                    aycVar.r();
                } else {
                    bih bihVar = bik.c;
                    float f = arr.a;
                    bik bikVarAF = byi.aF(amd.a(bihVar, arr.a, arr.b), this.a);
                    ?? r11 = this.b;
                    bsr bsrVarA = ama.a(akq.d, bib.b, aycVar, 54);
                    int iM = bay.M(aycVar);
                    bfk bfkVarM = aycVar.M();
                    bik bikVarV = bay.v(aycVar, bikVarAF);
                    uif uifVar = bum.a;
                    aycVar.L();
                    aycVar.v();
                    if (aycVar.F()) {
                        aycVar.j(uifVar);
                    } else {
                        aycVar.x();
                    }
                    bbr.a(aycVar, bsrVarA, bum.d);
                    bbr.a(aycVar, bfkVarM, bum.c);
                    uiu uiuVar = bum.e;
                    if (aycVar.F() || !a.ao(aycVar.f(), Integer.valueOf(iM))) {
                        Integer numValueOf = Integer.valueOf(iM);
                        aycVar.w(numValueOf);
                        aycVar.h(numValueOf, uiuVar);
                    }
                    bbr.a(aycVar, bikVarV, bum.b);
                    r11.a(amc.a, aycVar, 6);
                    aycVar.m();
                }
                break;
            case 1:
                ayc aycVar2 = (ayc) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (aycVar2.H((iIntValue & 3) != 2, iIntValue & 1)) {
                    this.b.a(this.a, aycVar2, 0);
                } else {
                    aycVar2.r();
                }
                break;
            case 2:
                ayc aycVar3 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar3.G()) {
                    aycVar3.r();
                } else {
                    auv.a(e.n(aycVar3).b, bdq.k(165539859, new ars(this.a, this.b, 0), aycVar3), aycVar3, 48);
                }
                break;
            case 3:
                ayc aycVar4 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar4.G()) {
                    aycVar4.r();
                } else {
                    this.b.a(((ejs) this.a).a, aycVar4, 0);
                }
                break;
            case 4:
                ayc aycVar5 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar5.G()) {
                    aycVar5.r();
                } else {
                    this.b.a(this.a, aycVar5, 6);
                }
                break;
            case 5:
                ayc aycVar6 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar6.G()) {
                    aycVar6.r();
                } else {
                    bay.K(atn.a.b(this.a), this.b, aycVar6, 8);
                }
                break;
            case 6:
                ayc aycVar7 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar7.G()) {
                    aycVar7.r();
                } else {
                    ?? r13 = this.b;
                    Object obj3 = this.a;
                    obj3.getClass();
                    r13.a(obj3, aycVar7, 0);
                }
                break;
            case 7:
                ayc aycVar8 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar8.G()) {
                    aycVar8.r();
                } else {
                    ?? r132 = this.a;
                    if (r132 == 0) {
                        aycVar8.u(1845819398);
                        akg.p(this.b, aycVar8, 0);
                        aycVar8.n();
                    } else {
                        aycVar8.u(1845823628);
                        akg.o(this.b, r132, aycVar8, 0);
                        aycVar8.n();
                    }
                }
                break;
            case 8:
                ayc aycVar9 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar9.G()) {
                    aycVar9.r();
                } else {
                    auv.a(e.n(aycVar9).a, bdq.k(1789628237, new ars(this.a, this.b, 7), aycVar9), aycVar9, 48);
                }
                break;
            case 9:
                ayc aycVar10 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar10.G()) {
                    aycVar10.r();
                } else {
                    bay.K(arz.a.b(Float.valueOf(e.q(1.0f, 0.87f, aycVar10))), bdq.k(1236486620, new ars(this.a, this.b, 8), aycVar10), aycVar10, 56);
                }
                break;
            case 10:
                ayc aycVar11 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar11.G()) {
                    aycVar11.r();
                } else {
                    bih bihVar2 = bik.c;
                    float f2 = avj.a;
                    bik bikVarAF2 = byi.aF(amd.a(bihVar2, avj.a, avj.b), this.a);
                    ?? r112 = this.b;
                    bsr bsrVarA2 = ama.a(akq.d, bib.b, aycVar11, 54);
                    int iM2 = bay.M(aycVar11);
                    bfk bfkVarM2 = aycVar11.M();
                    bik bikVarV2 = bay.v(aycVar11, bikVarAF2);
                    uif uifVar2 = bum.a;
                    aycVar11.L();
                    aycVar11.v();
                    if (aycVar11.F()) {
                        aycVar11.j(uifVar2);
                    } else {
                        aycVar11.x();
                    }
                    bbr.a(aycVar11, bsrVarA2, bum.d);
                    bbr.a(aycVar11, bfkVarM2, bum.c);
                    uiu uiuVar2 = bum.e;
                    if (aycVar11.F() || !a.ao(aycVar11.f(), Integer.valueOf(iM2))) {
                        Integer numValueOf2 = Integer.valueOf(iM2);
                        aycVar11.w(numValueOf2);
                        aycVar11.h(numValueOf2, uiuVar2);
                    }
                    bbr.a(aycVar11, bikVarV2, bum.b);
                    r112.a(amc.a, aycVar11, 6);
                    aycVar11.m();
                }
                break;
            case 11:
                ayc aycVar12 = (ayc) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (aycVar12.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    chk.a((String) this.a, (String) this.b, aycVar12, new Object[0]);
                } else {
                    aycVar12.r();
                }
                break;
            case 12:
                ayc aycVar13 = (ayc) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (aycVar13.H((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    Object obj4 = this.b;
                    uiu uiuVar3 = chl.a;
                    boolean zD = aycVar13.D(obj4);
                    Object obj5 = this.a;
                    Object objF = aycVar13.f();
                    if (zD || objF == ayb.a) {
                        objF = new aet(obj5, obj4, 9);
                        aycVar13.w(objF);
                    }
                    e.p(uiuVar3, (uif) objF, null, null, 0L, 0L, null, aycVar13, 6);
                } else {
                    aycVar13.r();
                }
                break;
            case 13:
                ayc aycVar14 = (ayc) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (aycVar14.H((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    Object obj6 = this.b;
                    Object obj7 = this.a;
                    tdy tdyVar = (tdy) obj6;
                    Object objA = tdyVar.b.a();
                    dmp dmpVar = (dmp) obj7;
                    int iA = dmpVar.c;
                    dlm dlmVar = (dlm) objA;
                    if ((iA >= dlmVar.b() || !a.ao(dlmVar.d(iA), dmpVar.a)) && (iA = dlmVar.a(dmpVar.a)) != -1) {
                        dmpVar.c = iA;
                    }
                    if (iA != -1) {
                        aycVar14.u(-247805883);
                        WearableControllerProvider.b(dlmVar, tdyVar.c, iA, dmpVar.a, aycVar14, 0);
                        aycVar14.n();
                    } else {
                        aycVar14.u(-247571399);
                        aycVar14.n();
                    }
                    Object obj8 = dmpVar.a;
                    boolean zD2 = aycVar14.D(obj7);
                    Object objF2 = aycVar14.f();
                    if (zD2 || objF2 == ayb.a) {
                        objF2 = new dlz(obj7, i);
                        aycVar14.w(objF2);
                    }
                    azb.c(obj8, (uiq) objF2, aycVar14);
                } else {
                    aycVar14.r();
                }
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ayc aycVar15 = (ayc) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (aycVar15.H((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    this.b.a(this.a, aycVar15, 0);
                } else {
                    aycVar15.r();
                }
                break;
            case 15:
                ayc aycVar16 = (ayc) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (aycVar16.H((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    this.b.a(this.a, aycVar16, 0);
                } else {
                    aycVar16.r();
                }
                break;
            case 16:
                ayc aycVar17 = (ayc) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (aycVar17.H((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    drp.a(((drv) this.a).k, this.b, aycVar17, 0);
                } else {
                    aycVar17.r();
                }
                break;
            case 17:
                ayc aycVar18 = (ayc) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (aycVar18.H((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    this.b.a(this.a, aycVar18, 0);
                } else {
                    aycVar18.r();
                }
                break;
            case 18:
                ayc aycVar19 = (ayc) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (aycVar19.H((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    this.b.a(this.a, aycVar19, 0);
                } else {
                    aycVar19.r();
                }
                break;
            case 19:
                ayc aycVar20 = (ayc) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (aycVar20.H((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    this.b.a(this.a, aycVar20, 0);
                } else {
                    aycVar20.r();
                }
                break;
            default:
                ayc aycVar21 = (ayc) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                int i2 = iIntValue11 & 3;
                if (aycVar21.H(i2 != 2, iIntValue11 & 1)) {
                    this.b.a(this.a, aycVar21, 0);
                } else {
                    aycVar21.r();
                }
                break;
        }
        return ufg.a;
    }

    public ars(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
