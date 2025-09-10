package defpackage;

import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwd implements uiv {
    final /* synthetic */ boolean a;
    final /* synthetic */ gwv b;
    final /* synthetic */ mxm c;
    final /* synthetic */ azr d;
    final /* synthetic */ azr e;
    final /* synthetic */ azr f;

    public gwd(boolean z, gwv gwvVar, mxm mxmVar, azr azrVar, azr azrVar2, azr azrVar3) {
        this.a = z;
        this.b = gwvVar;
        this.c = mxmVar;
        this.d = azrVar;
        this.e = azrVar2;
        this.f = azrVar3;
    }

    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        float fC;
        boolean z;
        float fA;
        int i;
        azr azrVar;
        boolean z2;
        ayc aycVar = (ayc) obj2;
        ((Number) obj3).intValue();
        ((ocq) obj).getClass();
        boolean z3 = this.a;
        if (z3) {
            aycVar.u(-473294572);
            long j = nia.a;
            fC = nia.b(aycVar);
            aycVar.n();
            z = true;
        } else {
            aycVar.u(-473240229);
            fC = byx.c(R.dimen.zoom_slider_background_width, aycVar);
            aycVar.n();
            z = false;
        }
        aycVar.u(954569083);
        gwv gwvVar = this.b;
        if (gwvVar.u.a() == gxj.b) {
            fA = fC;
        } else {
            fA = (gwvVar.I.a() * byx.c(R.dimen.toggle_touch_target_size, aycVar)) - byx.c(true != z3 ? R.dimen.toggle_background_offset : R.dimen.freeway_toggle_background_offset, aycVar);
        }
        aycVar.n();
        long j2 = nia.a;
        float fA2 = nia.a(aycVar) + byx.c(R.dimen.slider_to_action_button_padding, aycVar);
        float f = fC + fA2 + fA2;
        aycVar.u(954588201);
        bih bihVar = bik.c;
        bik bikVarAg = clc.ag(bihVar, "zoom_root");
        aycVar.u(1849434622);
        Object objF = aycVar.f();
        Object obj4 = ayb.a;
        if (objF == obj4) {
            objF = new dvj(6);
            aycVar.w(objF);
        }
        aycVar.n();
        bik bikVarE = amd.e(bko.c(bikVarAg, (uiq) objF), f);
        if (((Boolean) gwvVar.z.a()).booleanValue()) {
            aycVar.u(1849434622);
            Object objF2 = aycVar.f();
            if (objF2 == obj4) {
                objF2 = new dvj(7);
                aycVar.w(objF2);
            }
            aycVar.n();
            int i2 = cbp.a;
            bikVarE = bikVarE.cM(new ClearAndSetSemanticsElement((uiq) objF2));
        }
        aycVar.n();
        mxm mxmVar = this.c;
        azr azrVar2 = this.d;
        azr azrVar3 = this.e;
        azr azrVar4 = this.f;
        bsr bsrVarC = aku.c(bib.f, false);
        int iR = a.r(bay.N(aycVar));
        bfk bfkVarM = aycVar.M();
        bik bikVarV = bay.v(aycVar, bikVarE);
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
        aky akyVar = aky.a;
        bbo bboVarA = abu.a(qpt.aM(mxmVar), ojl.bn((mxm) gwvVar.s.a(), mxmVar, false), null, aycVar, 0, 28);
        if (z) {
            i = R.dimen.zoom_slider_background_height;
            azrVar = azrVar2;
            z2 = true;
        } else {
            i = R.dimen.toggle_background_height;
            azrVar = azrVar2;
            z2 = false;
        }
        gsn.K(gwvVar, akyVar.a(amd.i(bihVar, null, 3), bib.m), azrVar, bdq.k(2139657118, new gwc(z2, gwvVar, fA, ((byx.c(R.dimen.toggle_touch_target_size, aycVar) - byx.c(i, aycVar)) / 2.0f) + 16.0f, azrVar3, azrVar4, bboVarA), aycVar), aycVar, 3072);
        aycVar.u(867813959);
        aycVar.n();
        aycVar.m();
        return ufg.a;
    }
}
