package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atu implements uiv {
    final /* synthetic */ atr a;
    final /* synthetic */ atr b;
    final /* synthetic */ List c;
    final /* synthetic */ String d;
    final /* synthetic */ rmr e;

    public atu(atr atrVar, atr atrVar2, List list, rmr rmrVar, String str) {
        this.a = atrVar;
        this.b = atrVar2;
        this.c = list;
        this.e = rmrVar;
        this.d = str;
    }

    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Object atvVar;
        Boolean bool;
        abz abzVar;
        uiu uiuVar = (uiu) obj;
        ayc aycVar = (ayc) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != aycVar.D(uiuVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && aycVar.G()) {
            aycVar.r();
        } else {
            final atr atrVar = this.a;
            final boolean zAo = a.ao(atrVar, this.b);
            int i = true != zAo ? 75 : 150;
            int i2 = (!zAo || cij.a(this.c).size() == 1) ? 0 : 75;
            adt adtVar = new adt(i, i2, acm.b);
            boolean zD = aycVar.D(atrVar);
            Object obj4 = this.e;
            boolean zD2 = zD | aycVar.D(obj4);
            Object objF = aycVar.f();
            if (zD2 || objF == ayb.a) {
                objF = new aet(atrVar, obj4, 5, null);
                aycVar.w(objF);
            }
            uif uifVar = (uif) objF;
            Object objF2 = aycVar.f();
            Object obj5 = ayb.a;
            if (objF2 == obj5) {
                objF2 = abs.a(true != zAo ? 1.0f : 0.0f);
                aycVar.w(objF2);
            }
            abr abrVar = (abr) objF2;
            Boolean boolValueOf = Boolean.valueOf(zAo);
            boolean zD3 = aycVar.D(abrVar) | aycVar.C(zAo) | aycVar.D(adtVar) | aycVar.B(uifVar);
            Object objF3 = aycVar.f();
            if (zD3 || objF3 == obj5) {
                bool = boolValueOf;
                atvVar = new atv(abrVar, zAo, adtVar, uifVar, null);
                aycVar.w(atvVar);
            } else {
                bool = boolValueOf;
                atvVar = objF3;
            }
            azb.f(bool, (uiu) atvVar, aycVar);
            abz abzVar2 = abrVar.a;
            adt adtVar2 = new adt(i, i2, acm.a);
            Object objF4 = aycVar.f();
            if (objF4 == obj5) {
                objF4 = abs.a(true == zAo ? 0.8f : 1.0f);
                aycVar.w(objF4);
            }
            abr abrVar2 = (abr) objF4;
            boolean zD4 = aycVar.D(abrVar2) | aycVar.C(zAo) | aycVar.D(adtVar2);
            Object objF5 = aycVar.f();
            if (zD4 || objF5 == obj5) {
                abzVar = abzVar2;
                Object deeVar = new dee(abrVar2, zAo, adtVar2, (uhb) null, 1);
                aycVar.w(deeVar);
                objF5 = deeVar;
            } else {
                abzVar = abzVar2;
            }
            azb.f(bool, (uiu) objF5, aycVar);
            abz abzVar3 = abrVar2.a;
            bik bikVarD = bko.d(bik.c, ((Number) abzVar3.a()).floatValue(), ((Number) abzVar3.a()).floatValue(), ((Number) abzVar.a()).floatValue(), 0.0f, null, 131064);
            boolean zC = aycVar.C(zAo);
            final String str = this.d;
            boolean zB = zC | aycVar.B(str) | aycVar.D(atrVar);
            Object objF6 = aycVar.f();
            if (zB || objF6 == obj5) {
                objF6 = new uiq() { // from class: att
                    @Override // defpackage.uiq
                    public final Object a(Object obj6) {
                        cbn cbnVar = (cbn) obj6;
                        if (zAo) {
                            uld[] uldVarArr = cbw.a;
                            cbz cbzVar = cbu.j;
                            uld uldVar = cbw.a[3];
                            cbnVar.e(cbzVar, new cbh());
                        }
                        atr atrVar2 = atrVar;
                        String str2 = str;
                        uld[] uldVarArr2 = cbw.a;
                        cbz cbzVar2 = cbu.d;
                        uld uldVar2 = cbw.a[2];
                        cbnVar.e(cbzVar2, str2);
                        cbnVar.e(cbm.t, new cbc(null, new ats(atrVar2, 0)));
                        return ufg.a;
                    }
                };
                aycVar.w(objF6);
            }
            bik bikVarB = cbp.b(bikVarD, false, (uiq) objF6);
            bsr bsrVarC = aku.c(bib.f, false);
            int iM = bay.M(aycVar);
            bfk bfkVarM = aycVar.M();
            bik bikVarV = bay.v(aycVar, bikVarB);
            uif uifVar2 = bum.a;
            aycVar.L();
            aycVar.v();
            if (aycVar.F()) {
                aycVar.j(uifVar2);
            } else {
                aycVar.x();
            }
            bbr.a(aycVar, bsrVarC, bum.d);
            bbr.a(aycVar, bfkVarM, bum.c);
            uiu uiuVar2 = bum.e;
            if (aycVar.F() || !a.ao(aycVar.f(), Integer.valueOf(iM))) {
                Object objValueOf = Integer.valueOf(iM);
                aycVar.w(objValueOf);
                aycVar.h(objValueOf, uiuVar2);
            }
            bbr.a(aycVar, bikVarV, bum.b);
            uiuVar.a(aycVar, Integer.valueOf(iIntValue & 14));
            aycVar.m();
        }
        return ufg.a;
    }
}
