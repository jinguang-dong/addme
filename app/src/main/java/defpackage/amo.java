package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.view.View;
import androidx.compose.material3.internal.ChildSemanticsNodeElement;
import com.google.ar.core.ImageMetadata;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class amo {
    public static final void a(String str) {
        throw new IllegalArgumentException("Padding must be non-negative");
    }

    public static final void b(String str) {
        throw new IllegalStateException("All weights <= 0 should have placeables");
    }

    public static final void c(bik bikVar, ayc aycVar) {
        amf amfVar = amf.a;
        int iR = a.r(bay.N(aycVar));
        bik bikVarV = bay.v(aycVar, bikVar);
        bfk bfkVarM = aycVar.M();
        uif uifVar = bum.a;
        aycVar.L();
        aycVar.v();
        if (aycVar.F()) {
            aycVar.j(uifVar);
        } else {
            aycVar.x();
        }
        bbr.a(aycVar, amfVar, bum.d);
        bbr.a(aycVar, bfkVarM, bum.c);
        bbr.a(aycVar, bikVarV, bum.b);
        uiu uiuVar = bum.e;
        if (aycVar.F() || !a.ao(aycVar.f(), Integer.valueOf(iR))) {
            Integer numValueOf = Integer.valueOf(iR);
            aycVar.w(numValueOf);
            aycVar.h(numValueOf, uiuVar);
        }
        aycVar.m();
    }

    public static final boolean d(ccm ccmVar) {
        int iA = ccmVar.a();
        List list = ccmVar.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ccl cclVar = (ccl) list.get(i);
                if ((cclVar.a instanceof ccu) && cco.b(0, iA, cclVar.b, cclVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void e(final long j, final cdo cdoVar, final uiu uiuVar, ayc aycVar, final int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-684938728);
        if (i3 == 0) {
            i2 = (true != aycVarC.A(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(cdoVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && aycVarC.G()) {
            aycVarC.r();
        } else {
            ayp aypVar = awt.a;
            bay.L(new bag[]{avs.a.b(new bkv(j)), aypVar.b(((cdo) aycVarC.e(aypVar)).k(cdoVar))}, uiuVar, aycVarC, ((i2 >> 3) & ScriptIntrinsicBLAS.TRANSPOSE) | 8);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: axg
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    long j2 = j;
                    cdo cdoVar2 = cdoVar;
                    amo.e(j2, cdoVar2, uiuVar, (ayc) obj, bay.j(i | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static /* synthetic */ bik f(bik bikVar) {
        return bikVar.cM(new ChildSemanticsNodeElement(new axa(1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(final defpackage.uif r26, defpackage.bik r27, boolean r28, defpackage.avu r29, defpackage.blp r30, final defpackage.uiu r31, defpackage.ayc r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amo.g(uif, bik, boolean, avu, blp, uiu, ayc, int, int):void");
    }

    public static final void h(bik bikVar, uif uifVar, boolean z, blp blpVar, avu avuVar, uiu uiuVar, ayc aycVar, int i) {
        bik bikVar2;
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-1134296466);
        if (i3 == 0) {
            bikVar2 = bikVar;
            i2 = (true != aycVarC.B(bikVar2) ? 2 : 4) | i;
        } else {
            bikVar2 = bikVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(uifVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.B(blpVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != aycVarC.B(avuVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != aycVarC.B(null) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        int i4 = i2;
        if ((599187 & i4) == 599186 && aycVarC.G()) {
            aycVarC.r();
        } else {
            aycVarC.u(977030605);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (objR == ayb.a) {
                objR = new ocq((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                aygVar.ac(objR);
            }
            ocq ocqVar = (ocq) objR;
            aygVar.Y();
            bik bikVarF = f(byi.bK(byi.aR(bdq.C(amd.d(awa.a(bikVar2), a.t((a.p(1, 0) ? 8.0f : a.p(1, 1) ? 16.0f : a.p(1, 2) ? 28.0f : 0.0f) + 24.0f, 40.0f)), blpVar), z ? avuVar.a : avuVar.c, blpVar), ocqVar, awl.a(), z, new cbk(0), uifVar, 8));
            bsr bsrVarC = aku.c(bib.j, false);
            int iM = bay.M(aycVarC);
            bfk bfkVarAg = aygVar.ag();
            bik bikVarV = bay.v(aycVarC, bikVarF);
            uif uifVar2 = bum.a;
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar2);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVarC, bum.d);
            bbr.a(aycVarC, bfkVarAg, bum.c);
            uiu uiuVar2 = bum.e;
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iM))) {
                Integer numValueOf = Integer.valueOf(iM);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar2);
            }
            bbr.a(aycVarC, bikVarV, bum.b);
            bay.K(avs.a.b(new bkv(z ? avuVar.b : avuVar.d)), uiuVar, aycVarC, ((i4 >> 15) & ScriptIntrinsicBLAS.TRANSPOSE) | 8);
            aycVarC.m();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new dph(bikVar2, uifVar, z, blpVar, avuVar, uiuVar, i, 1);
        }
    }

    public static void i(bww bwwVar) {
        bwwVar.cX();
    }

    public static void j(bww bwwVar) {
        bwwVar.cX();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(bij bijVar, uif uifVar) {
        bwn bwnVar = bijVar.r;
        if (bwnVar == null) {
            bwnVar = new bwn((bwm) bijVar);
            bijVar.r = bwnVar;
        }
        ((bxv) bko.D(bijVar)).t.d(bwnVar, bwn.a, uifVar);
    }

    public static final void l(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    public static final void m(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    public static final int n(bvt bvtVar, bqv bqvVar) {
        bvt bvtVarI = bvtVar.I();
        if (bvtVarI == null) {
            bqs.c(a.bz(bvtVar, "Child of ", " cannot be null when calculating alignment line"));
        }
        if (bvtVar.G().e().containsKey(bqvVar)) {
            Integer num = (Integer) bvtVar.G().e().get(bqvVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iDl = bvtVarI.dl(bqvVar);
        if (iDl == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        bvtVarI.j = true;
        bvtVar.k = true;
        bvtVar.M();
        bvtVarI.j = false;
        bvtVar.k = false;
        return iDl + (bqvVar instanceof brn ? chy.b(bvtVarI.E()) : chy.a(bvtVarI.E()));
    }

    public static int o(bve bveVar, brv brvVar, bru bruVar, int i) {
        return bveVar.a(new brx(brvVar, brvVar.m()), new bwk(bruVar, 2, 2, 0), chp.k(i, 0, 13)).a();
    }

    public static int p(bve bveVar, brv brvVar, bru bruVar, int i) {
        return bveVar.a(new brx(brvVar, brvVar.m()), new bwk(bruVar, 2, 1, 0), chp.k(0, i, 7)).b();
    }

    public static int q(bve bveVar, brv brvVar, bru bruVar, int i) {
        return bveVar.a(new brx(brvVar, brvVar.m()), new bwk(bruVar, 1, 2, 0), chp.k(i, 0, 13)).a();
    }

    public static int r(bve bveVar, brv brvVar, bru bruVar, int i) {
        return bveVar.a(new brx(brvVar, brvVar.m()), new bwk(bruVar, 1, 1, 0), chp.k(0, i, 7)).b();
    }

    public static final long s(float f, boolean z, boolean z2) {
        return (true != z ? 0L : 1L) | (true == z2 ? 2L : 0L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final View u(buo buoVar) {
        if (!buoVar.B().w) {
            bqs.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) bvp.a(bko.B(buoVar));
    }
}
