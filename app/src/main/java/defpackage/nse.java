package defpackage;

import androidx.wear.ambient.AmbientModeSupport;
import androidx.wear.ambient.SharedLibraryVersion;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nse implements uiw {
    final /* synthetic */ List a;
    final /* synthetic */ dsd b;
    final /* synthetic */ nsk c;

    public nse(List list, dsd dsdVar, nsk nskVar) {
        this.a = list;
        this.b = dsdVar;
        this.c = nskVar;
    }

    @Override // defpackage.uiw
    public final /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        rar rarVar = (rar) obj;
        int iIntValue = ((Number) obj2).intValue();
        ayc aycVar = (ayc) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (true != ((iIntValue2 & 8) == 0 ? aycVar.B(rarVar) : aycVar.D(rarVar)) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= true != aycVar.z(iIntValue) ? 16 : 32;
        }
        if (aycVar.H((i & 147) != 146, i & 1)) {
            nry nryVar = (nry) this.a.get(iIntValue);
            aycVar.u(-615241792);
            bik bikVar = bik.c;
            aycVar.u(5004770);
            dsd dsdVar = this.b;
            boolean zD = aycVar.D(dsdVar);
            Object objF = aycVar.f();
            if (zD || objF == ayb.a) {
                objF = new nsd(dsdVar, 0);
                aycVar.w(objF);
            }
            aycVar.n();
            bik dljVar = rarVar.b ? bikVar : new dlj((uiu) ((ukz) objF));
            if (nryVar.g == nrn.a) {
                aycVar.u(-615105176);
                bsr bsrVarA = ala.a(akq.b, bib.e, aycVar, 48);
                int iR = a.r(bay.N(aycVar));
                bfk bfkVarM = aycVar.M();
                bik bikVarV = bay.v(aycVar, bikVar);
                uif uifVar = bum.a;
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
                AmbientModeSupport.AmbientCallback.g(dljVar, 0L, 0L, null, drm.a(rarVar, dsdVar), bdq.k(1152853957, new amj(nryVar, 9), aycVar), aycVar, ImageMetadata.EDGE_MODE);
                aycVar.u(-1449206835);
                Integer num = nryVar.b;
                if (num != null) {
                    float fC = byx.c(R.dimen.wear_setting_subtitle_horizontal_padding, aycVar);
                    float fC2 = byx.c(R.dimen.wear_setting_subtitle_top_padding, aycVar);
                    drp.b(clc.ae(num.intValue(), aycVar), byi.aI(bikVar, fC, fC2, fC, fC2), SharedLibraryVersion.h(aycVar).x, 0L, null, 0L, new chc(3), 0L, 0, false, 0, 0, null, SharedLibraryVersion.j(aycVar).l, aycVar, 0, 0, 65016);
                    aycVar = aycVar;
                }
                aycVar.n();
                aycVar.m();
                aycVar.n();
            } else {
                aycVar.u(-613814708);
                jsv.t(nryVar.a, nryVar.e, nryVar.b, this.c, nryVar.i, dljVar, nryVar.h, drm.a(rarVar, dsdVar), nryVar.f, aycVar, 0);
                aycVar = aycVar;
                aycVar.n();
            }
            aycVar.n();
        } else {
            aycVar.r();
        }
        return ufg.a;
    }
}
