package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dmv implements uiv {
    final /* synthetic */ bbo a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public dmv(AmbientDelegate ambientDelegate, bik bikVar, uiu uiuVar, bbo bboVar, int i) {
        this.e = i;
        this.b = ambientDelegate;
        this.c = bikVar;
        this.d = uiuVar;
        this.a = bboVar;
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [bik, java.lang.Object] */
    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = 0;
        if (this.e != 0) {
            alv alvVar = (alv) obj;
            ayc aycVar = (ayc) obj2;
            int iIntValue = ((Number) obj3).intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true != aycVar.B(alvVar) ? 2 : 4;
            }
            if (aycVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
                bik bikVarAF = byi.aF(bik.c, alvVar);
                Object obj4 = this.c;
                Object obj5 = this.b;
                Object obj6 = this.d;
                bbo bboVar = this.a;
                bsr bsrVarC = aku.c(bib.f, false);
                int iR = a.r(bay.N(aycVar));
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
                bbr.a(aycVar, bsrVarC, bum.d);
                bbr.a(aycVar, bfkVarM, bum.c);
                uiu uiuVar = bum.e;
                if (aycVar.F() || !a.ao(aycVar.f(), Integer.valueOf(iR))) {
                    Integer numValueOf = Integer.valueOf(iR);
                    aycVar.w(numValueOf);
                    aycVar.h(numValueOf, uiuVar);
                }
                bbr.a(aycVar, bikVarV, bum.b);
                String str = (String) obj4;
                chk.a(str, (String) obj5, aycVar, ((Object[]) obj6)[((bbd) bboVar).e()]);
                aycVar.m();
            } else {
                aycVar.r();
            }
            return ufg.a;
        }
        bfs bfsVar = (bfs) obj;
        ayc aycVar2 = (ayc) obj2;
        ((Number) obj3).intValue();
        Object objF = aycVar2.f();
        Object obj7 = ayb.a;
        if (objF == obj7) {
            tdy tdyVar = new tdy(bfsVar, new dlc(this.a, 3));
            aycVar2.w(tdyVar);
            objF = tdyVar;
        }
        tdy tdyVar2 = (tdy) objF;
        Object objF2 = aycVar2.f();
        if (objF2 == obj7) {
            objF2 = new hls(new dmr(tdyVar2));
            aycVar2.w(objF2);
        }
        Object obj8 = this.b;
        hls hlsVar = (hls) objF2;
        if (obj8 != null) {
            aycVar2.u(-2049724596);
            aycVar2.u(-1867233830);
            dnf dnfVar = dnh.a;
            if (dnfVar != null) {
                aycVar2.u(1637475700);
                aycVar2.n();
            } else {
                aycVar2.u(1637514605);
                View view = (View) aycVar2.e(AndroidCompositionLocals_androidKt.f);
                boolean zB = aycVar2.B(view);
                Object objF3 = aycVar2.f();
                if (zB || objF3 == obj7) {
                    objF3 = new dmh(view);
                    aycVar2.w(objF3);
                }
                dnfVar = (dmh) objF3;
                aycVar2.n();
            }
            dnf dnfVar2 = dnfVar;
            aycVar2.n();
            Object[] objArr = {obj8, tdyVar2, hlsVar, dnfVar2};
            boolean zB2 = aycVar2.B(obj8) | aycVar2.D(tdyVar2) | aycVar2.D(hlsVar) | aycVar2.D(dnfVar2);
            Object objF4 = aycVar2.f();
            if (zB2 || objF4 == obj7) {
                ahz ahzVar = new ahz((AmbientDelegate) obj8, tdyVar2, hlsVar, dnfVar2, 2);
                aycVar2.w(ahzVar);
                objF4 = ahzVar;
            }
            azb.d(objArr, (uiq) objF4, aycVar2);
            aycVar2.n();
        } else {
            aycVar2.u(-2049295990);
            aycVar2.n();
        }
        ?? r9 = this.c;
        long j = dmz.a;
        bik bikVar = r9;
        if (obj8 != null) {
            bik bikVarCM = r9.cM(new TraversablePrefetchStateModifierElement((AmbientDelegate) obj8));
            bikVar = r9;
            if (bikVarCM != null) {
                bikVar = bikVarCM;
            }
        }
        boolean zB3 = aycVar2.B(tdyVar2);
        Object obj9 = this.d;
        boolean zB4 = zB3 | aycVar2.B(obj9);
        Object objF5 = aycVar2.f();
        if (zB4 || objF5 == obj7) {
            objF5 = new dmt(tdyVar2, obj9, i);
            aycVar2.w(objF5);
        }
        btq.b(hlsVar, bikVar, (uiu) objF5, aycVar2, 8);
        return ufg.a;
    }

    public dmv(String str, String str2, Object[] objArr, bbd bbdVar, int i) {
        this.e = i;
        this.c = str;
        this.b = str2;
        this.d = objArr;
        this.a = bbdVar;
    }
}
