package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import androidx.wear.compose.material3.DynamicHeightElement;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqn implements uiw {
    final /* synthetic */ uiv a;
    final /* synthetic */ uiw b;
    final /* synthetic */ alv c;
    final /* synthetic */ chq d;
    final /* synthetic */ dkf e;
    final /* synthetic */ float f;
    final /* synthetic */ float g;

    public dqn(uiv uivVar, uiw uiwVar, alv alvVar, chq chqVar, dkf dkfVar, float f, float f2) {
        this.a = uivVar;
        this.b = uiwVar;
        this.c = alvVar;
        this.d = chqVar;
        this.e = dkfVar;
        this.f = f;
        this.g = f2;
    }

    public static final Float a(azr azrVar) {
        return (Float) azrVar.a();
    }

    @Override // defpackage.uiw
    public final /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        akx akxVar = (akx) obj;
        ayc aycVar = (ayc) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != aycVar.B(akxVar) ? 2 : 4;
        }
        if (aycVar.H((iIntValue & ScriptIntrinsicBLAS.NON_UNIT) != 130, iIntValue & 1)) {
            uiv uivVar = this.a;
            boolean zB = aycVar.B(uivVar);
            Object objF = aycVar.f();
            if (zB || objF == ayb.a) {
                objF = new azz(null, bap.c);
                aycVar.w(objF);
            }
            uiw uiwVar = this.b;
            alv alvVar = this.c;
            chq chqVar = this.d;
            float f = this.g;
            azr azrVar = (azr) objF;
            Float fA = a(azrVar);
            uiwVar.e(akxVar, new dpw(alvVar, (fA != null ? chqVar.dh(fA.floatValue()) : 0.0f) + f), aycVar, Integer.valueOf(iIntValue & 14));
            bie bieVar = bib.m;
            bik bikVarA = akxVar.a(bik.c, bieVar);
            boolean zB2 = aycVar.B(azrVar);
            Object objF2 = aycVar.f();
            if (zB2 || objF2 == ayb.a) {
                objF2 = new dlz(azrVar, 12);
                aycVar.w(objF2);
            }
            Object obj5 = this.e;
            uiq uiqVar = (uiq) objF2;
            boolean zD = aycVar.D(obj5);
            float f2 = this.f;
            boolean zY = zD | aycVar.y(f2);
            Object objF3 = aycVar.f();
            if (zY || objF3 == ayb.a) {
                objF3 = new dqy(obj5, f2, 1);
                aycVar.w(objF3);
            }
            bik bikVarCM = bikVarA.cM(new DynamicHeightElement(uiqVar, (uif) objF3));
            bsr bsrVarC = aku.c(bieVar, false);
            int iM = bay.M(aycVar);
            bfk bfkVarM = aycVar.M();
            bik bikVarV = bay.v(aycVar, bikVarCM);
            uif uifVar = bum.a;
            aycVar.v();
            if (aycVar.F()) {
                aycVar.j(uifVar);
            } else {
                aycVar.x();
            }
            bbr.a(aycVar, bsrVarC, bum.d);
            bbr.a(aycVar, bfkVarM, bum.c);
            uiu uiuVar = bum.e;
            if (aycVar.F() || !a.ao(aycVar.f(), Integer.valueOf(iM))) {
                Object objValueOf = Integer.valueOf(iM);
                aycVar.w(objValueOf);
                aycVar.h(objValueOf, uiuVar);
            }
            bbr.a(aycVar, bikVarV, bum.b);
            uivVar.a(aky.a, aycVar, 6);
            aycVar.m();
        } else {
            aycVar.r();
        }
        return ufg.a;
    }
}
