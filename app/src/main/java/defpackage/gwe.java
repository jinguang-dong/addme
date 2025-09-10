package defpackage;

import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwe implements uiv {
    final /* synthetic */ gwv a;
    final /* synthetic */ boolean b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ azr f;
    final /* synthetic */ azr g;

    public gwe(gwv gwvVar, boolean z, float f, float f2, float f3, azr azrVar, azr azrVar2) {
        this.a = gwvVar;
        this.b = z;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = azrVar;
        this.g = azrVar2;
    }

    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ayc aycVar = (ayc) obj2;
        ((Number) obj3).intValue();
        ((ocq) obj).getClass();
        gwv gwvVar = this.a;
        nhy nhyVarF = gwvVar.f();
        if (nhyVarF != null) {
            boolean z = this.b;
            float f = this.c;
            float f2 = this.d;
            float f3 = this.e;
            azr azrVar = this.f;
            azr azrVar2 = this.g;
            bic bicVar = bib.e;
            akp akpVar = akq.c;
            bih bihVar = bik.c;
            bsr bsrVarA = ala.a(akpVar, bicVar, aycVar, 54);
            int iR = a.r(bay.N(aycVar));
            bfk bfkVarM = aycVar.M();
            bik bikVarV = bay.v(aycVar, bihVar);
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
            if (aycVar.F() || !a.ao(aycVar.f(), Integer.valueOf(iR))) {
                Integer numValueOf = Integer.valueOf(iR);
                aycVar.w(numValueOf);
                aycVar.h(numValueOf, uiuVar);
            }
            bbr.a(aycVar, bikVarV, bum.b);
            jsv.M((String) gwvVar.L.a(), gwvVar.e(), false, z, aycVar, 384, 0);
            jsv.X(nhyVarF, gwvVar.V, f, f2 - byx.c(R.dimen.zoom_slider_drag_area_padding, aycVar), f3, gwvVar.t, azrVar, azrVar2, z, aycVar, 8, 0);
            aycVar.m();
        }
        return ufg.a;
    }
}
