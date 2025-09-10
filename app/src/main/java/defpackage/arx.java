package defpackage;

import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.wear.ambient.AmbientModeSupport;
import androidx.wear.ambient.SharedLibraryVersion;
import androidx.wear.ambient.WearableControllerProvider;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arx implements uiv {
    private final /* synthetic */ int f;
    public static final arx e = new arx(5);
    public static final arx d = new arx(4);
    public static final arx c = new arx(3);
    public static final arx b = new arx(1);
    public static final arx a = new arx(0);

    public arx(int i) {
        this.f = i;
    }

    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        if (i == 0) {
            atr atrVar = (atr) obj;
            ayc aycVar = (ayc) obj2;
            int iIntValue = ((Number) obj3).intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true != ((iIntValue & 8) == 0 ? aycVar.B(atrVar) : aycVar.D(atrVar)) ? 2 : 4;
            }
            if ((iIntValue & 19) == 18 && aycVar.G()) {
                aycVar.r();
            } else {
                akg.r(atrVar, null, null, 0L, 0L, 0L, 0.0f, aycVar, iIntValue & 14);
            }
            return ufg.a;
        }
        if (i == 1) {
            ejs ejsVar = (ejs) obj;
            ayc aycVar2 = (ayc) obj2;
            int iIntValue2 = ((Number) obj3).intValue();
            if ((iIntValue2 & 6) == 0) {
                iIntValue2 |= true != aycVar2.B(ejsVar) ? 2 : 4;
            }
            if ((iIntValue2 & 19) == 18 && aycVar2.G()) {
                aycVar2.r();
            } else {
                e.x(ejsVar, null, null, aycVar2, iIntValue2 & 14);
            }
            return ufg.a;
        }
        if (i == 2) {
            ((Boolean) obj).booleanValue();
            ayc aycVar3 = (ayc) obj2;
            ((Number) obj3).intValue();
            aycVar3.u(-1315099283);
            aycVar3.n();
            return null;
        }
        if (i == 3) {
            ayc aycVar4 = (ayc) obj2;
            int iIntValue3 = ((Number) obj3).intValue();
            ((akx) obj).getClass();
            if ((iIntValue3 & 17) == 16 && aycVar4.G()) {
                aycVar4.r();
            } else {
                aycVar4.u(1849434622);
                Object objF = aycVar4.f();
                if (objF == ayb.a) {
                    objF = new drg(6);
                    aycVar4.w(objF);
                }
                uif uifVar = (uif) objF;
                aycVar4.n();
                alv alvVar = dok.a;
                long j = SharedLibraryVersion.h(aycVar4).c;
                long j2 = bkv.f;
                doq doqVarH = SharedLibraryVersion.h(aycVar4);
                doj dojVar = doqVarH.D;
                if (dojVar == null) {
                    long jB = dor.b(doqVarH, 18);
                    long jB2 = dor.b(doqVarH, 8);
                    long jB3 = dor.b(doqVarH, 8);
                    dojVar = new doj(jB, jB2, bko.k(bkv.d(jB3), bkv.c(jB3), bkv.b(jB3), 0.8f, bkv.f(jB3)), dor.b(doqVarH, 8), dor.a(dor.b(doqVarH, 12), 0.12f), dor.a(dor.b(doqVarH, 12), 0.38f), dor.a(dor.b(doqVarH, 12), 0.38f), dor.a(dor.b(doqVarH, 12), 0.38f));
                    doqVarH.D = dojVar;
                }
                AmbientModeSupport.AmbientCallback.l(uifVar, null, false, dojVar.c(j, j2, j2, j2, j2, j2, j2, j2), nrg.b, aycVar4, 12582918);
            }
            return ufg.a;
        }
        if (i == 4) {
            amc amcVar = (amc) obj;
            ayc aycVar5 = (ayc) obj2;
            int iIntValue4 = ((Number) obj3).intValue();
            amcVar.getClass();
            if ((iIntValue4 & 6) == 0) {
                iIntValue4 |= true != aycVar5.B(amcVar) ? 2 : 4;
            }
            if ((iIntValue4 & 19) == 18 && aycVar5.G()) {
                aycVar5.r();
            } else {
                drp.b(clc.ae(R.string.open_camera_on_phone, aycVar5), amd.e(bik.c, byx.c(R.dimen.wear_tap_to_open_camera_edge_button_text_width, aycVar5)).cM(new VerticalAlignElement(bib.b)), SharedLibraryVersion.h(aycVar5).e, 0L, null, 0L, new chc(3), 0L, 0, false, 0, 0, null, SharedLibraryVersion.j(aycVar5).i, aycVar5, 0, 0, 65016);
            }
            return ufg.a;
        }
        if (i == 5) {
            ayc aycVar6 = (ayc) obj2;
            int iIntValue5 = ((Number) obj3).intValue();
            ((dky) obj).getClass();
            if ((iIntValue5 & 17) == 16 && aycVar6.G()) {
                aycVar6.r();
            } else {
                drp.b(clc.ae(R.string.message_open_camera, aycVar6), amd.e(bik.c, byx.c(R.dimen.wear_tap_to_open_camera_description_width, aycVar6)), SharedLibraryVersion.h(aycVar6).x, 0L, null, 0L, new chc(3), 0L, 0, false, 0, 0, null, SharedLibraryVersion.j(aycVar6).f, aycVar6, 0, 0, 65016);
            }
            return ufg.a;
        }
        ayc aycVar7 = (ayc) obj2;
        int iIntValue6 = ((Number) obj3).intValue();
        ((akx) obj).getClass();
        if ((iIntValue6 & 17) == 16 && aycVar7.G()) {
            aycVar7.r();
        } else {
            Object[] objArr = new Object[0];
            bgb bgbVar = dlh.h;
            boolean z = aycVar7.z(1) | aycVar7.z(0);
            Object objF2 = aycVar7.f();
            if (z || objF2 == ayb.a) {
                objF2 = new agx(15);
                aycVar7.w(objF2);
            }
            dlh dlhVar = (dlh) bdq.p(objArr, bgbVar, (uif) objF2, aycVar7, 0, 4);
            WearableControllerProvider.j(dlhVar, nrg.c, null, null, null, 0.0f, null, bdq.k(1010765946, new nri(dlhVar, 0), aycVar7), aycVar7, 100663344);
        }
        return ufg.a;
    }
}
