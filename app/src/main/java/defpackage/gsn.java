package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Process;
import android.os.Trace;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.Range;
import android.view.View;
import androidx.compose.foundation.ClickableElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import com.google.android.gms.analytics.EQvQ.UvOvSgfD;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gsn {
    public gsn() {
    }

    public static /* synthetic */ void A(tpc tpcVar) {
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        gyd gydVar = (gyd) tpcVar.b;
        gyd gydVar2 = gyd.a;
        gydVar.e = tpa.a;
    }

    public static float B(gyd gydVar, kgw kgwVar, nkw nkwVar, Float f, hfy hfyVar) {
        float fD;
        tpm tpmVar = gydVar.e;
        tpmVar.getClass();
        Float f2 = (Float) ske.bD(tpmVar);
        tpw tpwVar = gydVar.i;
        tpwVar.getClass();
        ArrayList arrayList = new ArrayList(ske.bq(tpwVar, 10));
        Iterator<E> it = tpwVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((gyc) it.next()).c));
        }
        Float f3 = (Float) ske.bD(arrayList);
        tpm tpmVar2 = gydVar.f;
        tpmVar2.getClass();
        Iterator it2 = rnt.ao(new Float[]{f2, f3, (Float) ske.bD(tpmVar2)}).iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = ((Number) it2.next()).floatValue();
        while (it2.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it2.next()).floatValue());
        }
        if (f != null) {
            fFloatValue = ukc.k(f.floatValue(), fFloatValue);
        }
        if (nkwVar == nkw.PORTRAIT) {
            double dAI = qpt.aI(kgwVar);
            List listU = kgwVar.u();
            float f4 = hfyVar.a;
            double dAI2 = qpt.aI(kgwVar);
            float fFloatValue2 = -1.0f;
            double d = -100.0d;
            for (Float f5 : kgwVar.u()) {
                double dAG = qpt.aG(f5.floatValue(), dAI2);
                double d2 = f4;
                if (Math.abs(dAG - d2) < Math.abs(d - d2)) {
                    fFloatValue2 = f5.floatValue();
                    d = dAG;
                }
            }
            fD = (float) (dAI / qpt.aH(qpt.aG(fFloatValue2, dAI), ((Float) Collections.min(listU)).floatValue()));
        } else {
            fD = kgwVar.d();
        }
        return ukc.k(fFloatValue, fD);
    }

    public static String C(String str, Object... objArr) {
        Locale locale = Locale.getDefault();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        str2.getClass();
        return str2;
    }

    public static Float D(List list, boolean z, float f) {
        int iIntValue;
        Object obj = null;
        if (z) {
            ugd it = ske.bo(list).iterator();
            while (true) {
                if (!((uku) it).a) {
                    break;
                }
                Object next = it.next();
                Float f2 = (Float) list.get(((Number) next).intValue());
                if (f2 != null && Float.compare(f2.floatValue(), f) > 0) {
                    obj = next;
                    break;
                }
            }
            Integer num = (Integer) obj;
            iIntValue = num != null ? num.intValue() : ske.bk(list);
        } else {
            ukv ukvVarBo = ske.bo(list);
            ugd it2 = new ukt(ukvVarBo.b, ukvVarBo.a, -ukvVarBo.c).iterator();
            while (true) {
                if (!((uku) it2).a) {
                    break;
                }
                Object next2 = it2.next();
                Float f3 = (Float) list.get(((Number) next2).intValue());
                if (f3 != null && Float.compare(f3.floatValue(), f) < 0) {
                    obj = next2;
                    break;
                }
            }
            Integer num2 = (Integer) obj;
            iIntValue = num2 != null ? num2.intValue() : 0;
        }
        return (Float) list.get(iIntValue);
    }

    public static float E(float f, Range range, Range range2) {
        Object lower = range.getLower();
        lower.getClass();
        float fFloatValue = f - ((Number) lower).floatValue();
        float fFloatValue2 = ((Number) range2.getUpper()).floatValue();
        Object lower2 = range2.getLower();
        lower2.getClass();
        float fFloatValue3 = fFloatValue2 - ((Number) lower2).floatValue();
        float fFloatValue4 = ((Number) range.getUpper()).floatValue();
        Object lower3 = range.getLower();
        lower3.getClass();
        float fFloatValue5 = fFloatValue4 - ((Number) lower3).floatValue();
        Object lower4 = range2.getLower();
        lower4.getClass();
        return ((fFloatValue * fFloatValue3) / fFloatValue5) + ((Number) lower4).floatValue();
    }

    public static boolean F(float f, gwi gwiVar) {
        if (f % 1.0f == 0.0f) {
            return true;
        }
        return gwiVar.a && f >= gwiVar.c;
    }

    public static gyb G(pka pkaVar) {
        int iOrdinal = pkaVar.ordinal();
        if (iOrdinal == 0) {
            return gyb.FACING_FRONT;
        }
        if (iOrdinal == 1) {
            return gyb.FACING_BACK;
        }
        if (iOrdinal == 2) {
            return gyb.FACING_EXTERNAL;
        }
        throw new uet();
    }

    public static Range H(List list) {
        return new Range((Comparable) ske.bB(list), (Comparable) ske.bF(list));
    }

    public static float I(float f, gwi gwiVar) {
        float fFloatValue = f * 10.0f;
        double d = fFloatValue;
        if (gwiVar.b && Float.compare(f, 1.0f) < 0) {
            return ((float) Math.floor(d)) / 10.0f;
        }
        Float fValueOf = Float.valueOf((float) Math.floor(d));
        if (fValueOf.floatValue() % 5.0f != 0.0f) {
            fValueOf = null;
        }
        if (fValueOf != null) {
            fFloatValue = fValueOf.floatValue();
        } else {
            Float fValueOf2 = Float.valueOf((float) Math.ceil(d));
            Float f2 = fValueOf2.floatValue() % 5.0f == 0.0f ? fValueOf2 : null;
            if (f2 != null) {
                fFloatValue = f2.floatValue();
            }
        }
        float fRint = ((float) Math.rint(fFloatValue)) / 10.0f;
        return F(fRint, gwiVar) ? (float) Math.rint(f) : fRint;
    }

    public static float J(bbo bboVar) {
        return ((cht) bboVar.a()).a;
    }

    public static void K(final gwv gwvVar, final bik bikVar, final azr azrVar, final uiv uivVar, ayc aycVar, final int i) {
        int i2;
        String strAe;
        String strAe2;
        ayg aygVar;
        bikVar.getClass();
        uivVar.getClass();
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(1504335148);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(gwvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(bikVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.B(azrVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.D(uivVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && aycVarC.G()) {
            aycVarC.r();
        } else {
            azr azrVar2 = gwvVar.u;
            Object objA = azrVar2.a();
            gxj gxjVar = gxj.a;
            if (objA == gxjVar) {
                aycVarC.u(1959905893);
                strAe = clc.ae(R.string.zoom_toggles_container_content_description, aycVarC);
                ((ayg) aycVarC).Y();
            } else {
                aycVarC.u(1959992166);
                strAe = clc.ae(R.string.zoom_slider_container_content_description, aycVarC);
                ((ayg) aycVarC).Y();
            }
            if (azrVar2.a() == gxjVar) {
                aycVarC.u(1960158295);
                strAe2 = clc.ae(R.string.zoom_container_open_hint, aycVarC);
                ((ayg) aycVarC).Y();
            } else {
                aycVarC.u(1960226774);
                strAe2 = clc.ae(R.string.zoom_container_close_hint, aycVarC);
                ((ayg) aycVarC).Y();
            }
            String str = strAe2;
            aycVarC.u(-1737875778);
            aycVarC.u(5004770);
            boolean zB = aycVarC.B(strAe);
            ayg aygVar2 = (ayg) aycVarC;
            Object objR = aygVar2.R();
            if (zB || objR == ayb.a) {
                objR = new dlz(strAe, 20);
                aygVar2.ac(objR);
            }
            aygVar2.Y();
            bik bikVarB = cbp.b(bikVar, false, (uiq) objR);
            if (!((Boolean) gwvVar.A.a()).booleanValue() || gwvVar.f() == null) {
                aygVar = aygVar2;
            } else {
                aycVarC.u(5004770);
                boolean zD = aycVarC.D(gwvVar);
                Object objR2 = aygVar2.R();
                if (zD || objR2 == ayb.a) {
                    objR2 = new dlc(gwvVar, i4);
                    aygVar2.ac(objR2);
                }
                aygVar2.Y();
                aygVar = aygVar2;
                bikVarB = bikVarB.cM(new ClickableElement(null, null, true, true, str, null, (uif) objR2));
            }
            aygVar.Y();
            aycVarC.u(5004770);
            int i5 = i2 & 896;
            Object objR3 = aygVar.R();
            if (i5 == 256 || objR3 == ayb.a) {
                objR3 = new arc(azrVar, 13);
                aygVar.ac(objR3);
            }
            aygVar.Y();
            bik bikVarJ = bko.J(bikVarB, (uiq) objR3);
            int i6 = i2 & 7168;
            bsr bsrVarC = aku.c(bib.f, false);
            int iR = a.r(bay.N(aycVarC));
            bfk bfkVarAg = aygVar.ag();
            bik bikVarV = bay.v(aycVarC, bikVarJ);
            uif uifVar = bum.a;
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVarC, bum.d);
            bbr.a(aycVarC, bfkVarAg, bum.c);
            uiu uiuVar = bum.e;
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iR))) {
                Integer numValueOf = Integer.valueOf(iR);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar);
            }
            bbr.a(aycVarC, bikVarV, bum.b);
            uivVar.a(aky.a, aycVarC, Integer.valueOf(((i6 >> 6) & ScriptIntrinsicBLAS.TRANSPOSE) | 6));
            aycVarC.m();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: gvp
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gwv gwvVar2 = gwvVar;
                    bik bikVar2 = bikVar;
                    azr azrVar3 = azrVar;
                    gsn.K(gwvVar2, bikVar2, azrVar3, uivVar, (ayc) obj, bay.j(i | 1));
                    return ufg.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void L(final defpackage.bik r21, final float r22, final android.graphics.Rect r23, final boolean r24, defpackage.ayc r25, final int r26) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gsn.L(bik, float, android.graphics.Rect, boolean, ayc, int):void");
    }

    public static void M(final boolean z, bik bikVar, final float f, float f2, ayc aycVar, final int i) {
        int i2;
        float fC;
        bik bikVar2;
        final float f3;
        bikVar.getClass();
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(714947542);
        if (i3 == 0) {
            i2 = (true != aycVarC.C(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(bikVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.y(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.y(f2) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && aycVarC.G()) {
            aycVarC.r();
            bikVar2 = bikVar;
            f3 = f2;
        } else {
            if (z) {
                aycVarC.u(259592363);
                fC = byx.c(R.dimen.toggle_background_height, aycVarC);
                ((ayg) aycVarC).Y();
            } else {
                aycVarC.u(259662950);
                fC = byx.c(R.dimen.zoom_slider_background_height, aycVarC);
                ((ayg) aycVarC).Y();
            }
            bikVar2 = bikVar;
            f3 = f2;
            aku.b(amd.b(amd.e(byi.bj(byi.aR(bdq.C(byi.aM(bikVar2, 0.0f, 0.0f, 0.0f, f3, 7), aqa.a(byx.c(R.dimen.background_corner_size, aycVarC))), byx.e(R.color.camera_protection_background, aycVarC), bll.a)), f), fC), aycVarC, 0);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            final bik bikVar3 = bikVar2;
            baiVarI.d = new uiu() { // from class: gvt
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    bik bikVar4 = bikVar3;
                    float f4 = f;
                    gsn.M(z2, bikVar4, f4, f3, (ayc) obj, bay.j(i | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static void N(final int i, final bik bikVar, ayc aycVar, final int i2) {
        int i3;
        bikVar.getClass();
        int i4 = i2 & 6;
        ayc aycVarC = aycVar.c(83236843);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != aycVarC.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != aycVarC.B(bikVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && aycVarC.G()) {
            aycVarC.r();
        } else {
            acy acyVarBf = byi.bf(0.8f, 800.0f, null, 4);
            acy acyVar = abu.a;
            bbo bboVarB = abu.b(new chy(ukj.x(((chq) aycVarC.e(bze.c)).dk(byx.c(R.dimen.toggle_touch_target_size, aycVarC)) * i) << 32), adu.g, acyVarBf, null, null, aycVarC, 384, 8);
            long j = bay.O(aycVarC).f;
            long j2 = bay.O(aycVarC).g;
            long j3 = nia.a;
            bik bikVarAM = byi.aM(bikVar, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            aycVarC.u(5004770);
            boolean zB = aycVarC.B(bboVarB);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (zB || objR == ayb.a) {
                objR = new gvx(bboVarB, i5);
                aygVar.ac(objR);
            }
            aygVar.Y();
            bik bikVarC = amd.c(byi.aG(byi.aN(bikVarAM, (uiq) objR), 2.0f), 44.0f);
            aycVarC.u(-1633490746);
            boolean zA = aycVarC.A(j) | aycVarC.A(j2);
            Object objR2 = aygVar.R();
            if (zA || objR2 == ayb.a) {
                het hetVar = new het(j, j2, 1);
                aygVar.ac(hetVar);
                objR2 = hetVar;
            }
            aygVar.Y();
            aku.b(bdq.B(bikVarC, (uiq) objR2), aycVarC, 0);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: gvr
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    int i7 = i2;
                    gsn.N(i6, bikVar, (ayc) obj, bay.j(i7 | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static void O(final gwv gwvVar, boolean z, final azr azrVar, ayc aycVar, final int i) {
        int i2;
        final boolean z2 = z;
        gwvVar.getClass();
        azrVar.getClass();
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(1684660182);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(gwvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.C(z2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.B(azrVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && aycVarC.G()) {
            aycVarC.r();
        } else {
            ((View) aycVarC.e(AndroidCompositionLocals_androidKt.f)).setHapticFeedbackEnabled(((Boolean) gwvVar.v.a()).booleanValue());
            adt adtVarBg = byi.bg(gwvVar.c() == gwq.a ? 0 : 217, gwvVar.c() != gwq.c ? 0 : 217, null, 4);
            mxm mxmVarE = gwvVar.e();
            bbo bboVarB = abu.b(Integer.valueOf(gwvVar.P.e()), adu.b, abu.a, null, null, aycVarC, 0, 8);
            aycVarC.u(1849434622);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            Object obj = ayb.a;
            if (objR == obj) {
                azz azzVar = new azz(null, bap.c);
                aygVar.ac(azzVar);
                objR = azzVar;
            }
            azr azrVar2 = (azr) objR;
            aygVar.Y();
            aycVarC.u(1849434622);
            Object objR2 = aygVar.R();
            if (objR2 == obj) {
                azz azzVar2 = new azz(false, bap.c);
                aygVar.ac(azzVar2);
                objR2 = azzVar2;
            }
            azr azrVar3 = (azr) objR2;
            aygVar.Y();
            Boolean boolValueOf = Boolean.valueOf(gwvVar.z());
            aycVarC.u(-1746271574);
            boolean zD = aycVarC.D(gwvVar);
            Object objR3 = aygVar.R();
            if (zD || objR3 == obj) {
                objR3 = new gwb(gwvVar, azrVar3, azrVar2, null);
                aygVar.ac(objR3);
            }
            aygVar.Y();
            azb.f(boolValueOf, (uiu) objR3, aycVarC);
            aycVarC.u(-244178712);
            if (gwvVar.f() != null) {
                ujz ujzVar = new ujz();
                long integer = ((Resources) aycVarC.e(AndroidCompositionLocals_androidKt.c)).getInteger(R.integer.timeout_millis);
                ujzVar.a = integer;
                if (gwvVar.F) {
                    ujzVar.a = integer * 10;
                }
                azb.f(gwvVar.t.a(), new ve(gwvVar, ujzVar, (uhb) null, 7), aycVarC);
            }
            aygVar.Y();
            boolean z3 = gwvVar.z();
            aaz aazVarE = aav.e(adtVarBg, 2);
            aba abaVarF = aav.f(adtVarBg, 2);
            bih bihVar = bik.c;
            aycVarC.u(5004770);
            boolean zB = aycVarC.B(bboVarB);
            Object objR4 = aygVar.R();
            if (zB || objR4 == obj) {
                objR4 = new arc(bboVarB, 14);
                aygVar.ac(objR4);
            }
            aygVar.Y();
            z2 = z;
            byi.bm(z3, byi.aN(bihVar, (uiq) objR4), aazVarE, abaVarF, null, bdq.k(-2095093762, new gwd(z2, gwvVar, mxmVarE, azrVar, azrVar3, azrVar2), aycVarC), aycVarC, ImageMetadata.EDGE_MODE, 16);
            aycVarC = aycVarC;
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: gvu
                @Override // defpackage.uiu
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    gwv gwvVar2 = gwvVar;
                    boolean z4 = z2;
                    int i4 = i;
                    gsn.O(gwvVar2, z4, azrVar, (ayc) obj2, bay.j(i4 | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static void P(final gwv gwvVar, final float f, final float f2, final float f3, final azr azrVar, final azr azrVar2, final bik bikVar, final boolean z, ayc aycVar, final int i) {
        int i2;
        float f4;
        float f5;
        float f6;
        azr azrVar3;
        azr azrVar4;
        boolean z2;
        ayc aycVar2;
        azrVar.getClass();
        azrVar2.getClass();
        bikVar.getClass();
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-136827946);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(gwvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            f4 = f;
            i2 |= true != aycVarC.y(f4) ? 16 : 32;
        } else {
            f4 = f;
        }
        if ((i & 384) == 0) {
            f5 = f2;
            i2 |= true != aycVarC.y(f5) ? 128 : 256;
        } else {
            f5 = f2;
        }
        if ((i & 3072) == 0) {
            f6 = f3;
            i2 |= true != aycVarC.y(f6) ? 1024 : 2048;
        } else {
            f6 = f3;
        }
        if ((i & 24576) == 0) {
            azrVar3 = azrVar;
            i2 |= true != aycVarC.B(azrVar3) ? 8192 : 16384;
        } else {
            azrVar3 = azrVar;
        }
        if ((196608 & i) == 0) {
            azrVar4 = azrVar2;
            i2 |= true != aycVarC.B(azrVar4) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        } else {
            azrVar4 = azrVar2;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != aycVarC.B(bikVar) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        if ((12582912 & i) == 0) {
            z2 = z;
            i2 |= true != aycVarC.C(z2) ? 4194304 : 8388608;
        } else {
            z2 = z;
        }
        if ((i2 & 4793491) == 4793490 && aycVarC.G()) {
            aycVarC.r();
            aycVar2 = aycVarC;
        } else {
            boolean z3 = gwvVar.u.a() == gxj.b;
            aaz aazVarE = aav.e(null, 3);
            aba abaVarF = aav.f(null, 3);
            aycVarC.u(1849434622);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (objR == ayb.a) {
                objR = new dvj(5);
                aygVar.ac(objR);
            }
            aygVar.Y();
            aycVar2 = aycVarC;
            byi.bm(z3, clc.ag(cbp.b(bikVar, false, (uiq) objR), "zoom_ruler_slider"), aazVarE, abaVarF, null, bdq.k(445578750, new gwe(gwvVar, z2, f4, f5, f6, azrVar3, azrVar4), aycVarC), aycVar2, 200064, 16);
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: gvs
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gwv gwvVar2 = gwvVar;
                    float f7 = f;
                    float f8 = f2;
                    float f9 = f3;
                    azr azrVar5 = azrVar;
                    azr azrVar6 = azrVar2;
                    bik bikVar2 = bikVar;
                    gsn.P(gwvVar2, f7, f8, f9, azrVar5, azrVar6, bikVar2, z, (ayc) obj, bay.j(i | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static void Q(final gwv gwvVar, final azr azrVar, final azr azrVar2, final float f, final boolean z, final bik bikVar, ayc aycVar, final int i) {
        int i2;
        boolean z2;
        azrVar.getClass();
        azrVar2.getClass();
        bikVar.getClass();
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(1224702570);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(gwvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(azrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.B(azrVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.y(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != aycVarC.C(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != aycVarC.B(bikVar) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((74899 & i2) == 74898 && aycVarC.G()) {
            aycVarC.r();
        } else {
            View view = (View) aycVarC.e(AndroidCompositionLocals_androidKt.f);
            ufg ufgVar = ufg.a;
            aycVarC.u(-1746271574);
            boolean zD = aycVarC.D(view) | aycVarC.D(gwvVar);
            boolean z3 = (i2 & ScriptIntrinsicBLAS.TRANSPOSE) == 32;
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if ((zD | z3) || objR == ayb.a) {
                objR = new gwg(azrVar, gwvVar, view, 1);
                aygVar.ac(objR);
            }
            aygVar.Y();
            bik bikVarA = bqh.a(bikVar, ufgVar, (PointerInputEventHandler) objR);
            aycVarC.u(-1746271574);
            boolean zD2 = ((i2 & 896) == 256) | aycVarC.D(gwvVar);
            Object objR2 = aygVar.R();
            if ((zD2 || z3) || objR2 == ayb.a) {
                z2 = false;
                objR2 = new gwg(gwvVar, azrVar2, azrVar, 0);
                aygVar.ac(objR2);
            } else {
                z2 = false;
            }
            aygVar.Y();
            bik bikVarA2 = bqh.a(bikVarA, ufgVar, (PointerInputEventHandler) objR2);
            bsr bsrVarC = aku.c(bib.f, z2);
            int iR = a.r(bay.N(aycVarC));
            bfk bfkVarAg = aygVar.ag();
            bik bikVarV = bay.v(aycVarC, bikVarA2);
            uif uifVar = bum.a;
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVarC, bum.d);
            bbr.a(aycVarC, bfkVarAg, bum.c);
            uiu uiuVar = bum.e;
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iR))) {
                Integer numValueOf = Integer.valueOf(iR);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar);
            }
            bbr.a(aycVarC, bikVarV, bum.b);
            azr azrVar3 = gwvVar.u;
            aky akyVar = aky.a;
            byi.bm(azrVar3.a() == gxj.a, akyVar.a(bik.c, bib.m), aav.e(null, 3), aav.f(null, 3), null, bdq.k(-1565988792, new gwh(gwvVar, f, z), aycVarC), aycVarC, 200064, 16);
            aycVarC.m();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: gvo
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gwv gwvVar2 = gwvVar;
                    azr azrVar4 = azrVar;
                    azr azrVar5 = azrVar2;
                    float f2 = f;
                    boolean z4 = z;
                    gsn.Q(gwvVar2, azrVar4, azrVar5, f2, z4, bikVar, (ayc) obj, bay.j(i | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static void R(final int i, final boolean z, final uiq uiqVar, final String str, final float f, final String str2, ayc aycVar, final int i2) {
        int i3;
        boolean z2;
        ayc aycVar2;
        int i4 = i2 & 6;
        ayc aycVarC = aycVar.c(-1983268642);
        if (i4 == 0) {
            i3 = (true != aycVarC.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != aycVarC.C(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != aycVarC.D(uiqVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != aycVarC.B(str) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != aycVarC.y(f) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != aycVarC.C(false) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != aycVarC.B(str2) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        if ((599187 & i3) == 599186 && aycVarC.G()) {
            aycVarC.r();
            aycVar2 = aycVarC;
        } else {
            View view = (View) aycVarC.e(AndroidCompositionLocals_androidKt.f);
            final String strAe = clc.ae(R.string.zoom_content_description, aycVarC);
            bih bihVar = bik.c;
            bik bikVarA = awa.a(bihVar);
            aycVarC.u(-1633490746);
            boolean zB = ((i3 & ScriptIntrinsicBLAS.TRANSPOSE) == 32) | aycVarC.B(strAe);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (zB || objR == ayb.a) {
                objR = new uiq() { // from class: gvv
                    @Override // defpackage.uiq
                    public final Object a(Object obj) {
                        cbn cbnVar = (cbn) obj;
                        cbnVar.getClass();
                        cbw.h(cbnVar, z);
                        cbw.d(cbnVar, strAe);
                        return ufg.a;
                    }
                };
                aygVar.ac(objR);
            }
            aygVar.Y();
            bik bikVarC = amd.c(cbp.b(bikVarA, false, (uiq) objR), byx.c(R.dimen.toggle_touch_target_size, aycVarC));
            aycVarC.u(1849434622);
            Object objR2 = aygVar.R();
            Object obj = ayb.a;
            if (objR2 == obj) {
                objR2 = new ocq((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                aygVar.ac(objR2);
            }
            ocq ocqVar = (ocq) objR2;
            aygVar.Y();
            cbk cbkVar = new cbk(0);
            aycVarC.u(-1224400529);
            boolean zD = ((458752 & i3) == 131072) | aycVarC.D(view);
            boolean z3 = (i3 & 896) == 256;
            boolean z4 = (i3 & 14) == 4;
            Object objR3 = aygVar.R();
            if ((z4 || (zD | z3)) || objR3 == obj) {
                z2 = false;
                objR3 = new gvw(view, uiqVar, i, 0);
                aygVar.ac(objR3);
            } else {
                z2 = false;
            }
            aygVar.Y();
            bik bikVarBK = byi.bK(bikVarC, ocqVar, null, false, cbkVar, (uif) objR3, 12);
            bsr bsrVarC = aku.c(bib.f, z2);
            int iR = a.r(bay.N(aycVarC));
            bfk bfkVarAg = aygVar.ag();
            bik bikVarV = bay.v(aycVarC, bikVarBK);
            uif uifVar = bum.a;
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVarC, bum.d);
            bbr.a(aycVarC, bfkVarAg, bum.c);
            uiu uiuVar = bum.e;
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iR))) {
                Integer numValueOf = Integer.valueOf(iR);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar);
            }
            bbr.a(aycVarC, bikVarV, bum.b);
            int i5 = true != z ? 500 : 600;
            aky akyVar = aky.a;
            long j = bkv.b;
            cfa.a("google-sans-flex");
            cfd cfdVarF = byx.f(byx.g("google-sans-flex", new cfp(i5), null, 12));
            cdo cdoVar = new cdo(z ? chp.C(16) : chp.C(14), null, null, null, 16777213);
            bik bikVarZ = bdq.z(akyVar.a(bihVar, bib.j), f);
            aycVarC.u(5004770);
            int i6 = 3670016 & i3;
            Object objR4 = aygVar.R();
            if (i6 == 1048576 || objR4 == obj) {
                objR4 = new gvx(str2, 0);
                aygVar.ac(objR4);
            }
            aygVar.Y();
            aycVar2 = aycVarC;
            awt.b(str, clc.ag(cbp.b(bikVarZ, false, (uiq) objR4), "zoom_toggle_".concat(str)), j, 0L, cfdVarF, 0L, 0L, 0, false, 0, 0, cdoVar, aycVar2, (14 & (i3 >> 9)) | 384, 0, 65464);
            aycVar2.m();
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: gvy
                @Override // defpackage.uiu
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i7 = i;
                    boolean z5 = z;
                    uiq uiqVar2 = uiqVar;
                    String str3 = str;
                    float f2 = f;
                    gsn.R(i7, z5, uiqVar2, str3, f2, str2, (ayc) obj2, bay.j(i2 | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static void S(final int i, boolean z, final uiq uiqVar, final String str, final float f, ayc aycVar, final int i2) {
        int i3;
        long jE;
        float fC;
        long j;
        boolean z2;
        ayc aycVar2;
        int i4 = i2 & 6;
        ayc aycVarC = aycVar.c(1081001109);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != aycVarC.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != aycVarC.C(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != aycVarC.D(uiqVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != aycVarC.B(str) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != aycVarC.y(f) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != aycVarC.C(false) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((74899 & i3) == 74898 && aycVarC.G()) {
            aycVarC.r();
            z2 = z;
            aycVar2 = aycVarC;
        } else {
            View view = (View) aycVarC.e(AndroidCompositionLocals_androidKt.f);
            String strAe = clc.ae(R.string.zoom_content_description, aycVarC);
            bih bihVar = bik.c;
            bik bikVarA = awa.a(bihVar);
            aycVarC.u(-1633490746);
            boolean zB = ((i3 & ScriptIntrinsicBLAS.TRANSPOSE) == 32) | aycVarC.B(strAe);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (zB || objR == ayb.a) {
                objR = new nrz(z, strAe, i5);
                aygVar.ac(objR);
            }
            aygVar.Y();
            bik bikVarC = amd.c(cbp.b(bikVarA, false, (uiq) objR), byx.c(R.dimen.toggle_touch_target_size, aycVarC));
            aycVarC.u(1849434622);
            Object objR2 = aygVar.R();
            Object obj = ayb.a;
            if (objR2 == obj) {
                objR2 = new ocq((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                aygVar.ac(objR2);
            }
            ocq ocqVar = (ocq) objR2;
            aygVar.Y();
            cbk cbkVar = new cbk(0);
            aycVarC.u(-1224400529);
            boolean zD = ((458752 & i3) == 131072) | aycVarC.D(view);
            boolean z3 = (i3 & 896) == 256;
            boolean z4 = (i3 & 14) == 4;
            Object objR3 = aygVar.R();
            if ((z4 | z3 | zD) || objR3 == obj) {
                objR3 = new gvw(view, uiqVar, i, 1);
                aygVar.ac(objR3);
            }
            aygVar.Y();
            bik bikVarBK = byi.bK(bikVarC, ocqVar, null, false, cbkVar, (uif) objR3, 12);
            bsr bsrVarC = aku.c(bib.f, false);
            int iR = a.r(bay.N(aycVarC));
            bfk bfkVarAg = aygVar.ag();
            bik bikVarV = bay.v(aycVarC, bikVarBK);
            uif uifVar = bum.a;
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVarC, bum.d);
            bbr.a(aycVarC, bfkVarAg, bum.c);
            uiu uiuVar = bum.e;
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iR))) {
                Integer numValueOf = Integer.valueOf(iR);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar);
            }
            bbr.a(aycVarC, bikVarV, bum.b);
            aky akyVar = aky.a;
            bik bikVarC2 = bdq.C(bihVar, aqa.a);
            if (z) {
                aycVarC.u(927903794);
                jE = bay.O(aycVarC).f;
                aygVar.Y();
            } else {
                aycVarC.u(927974722);
                jE = byx.e(R.color.toggle_unselected_background, aycVarC);
                aygVar.Y();
            }
            bik bikVarBj = byi.bj(byi.aR(bikVarC2, jE, bll.a));
            if (z) {
                aycVarC.u(928142246);
                fC = byx.c(R.dimen.toggle_selected_size, aycVarC);
                aygVar.Y();
            } else {
                aycVarC.u(928224644);
                fC = byx.c(R.dimen.toggle_unselected_size, aycVarC);
                aygVar.Y();
            }
            bik bikVarC3 = amd.c(bikVarBj, fC);
            bie bieVar = bib.j;
            aku.b(akyVar.a(bikVarC3, bieVar), aycVarC, 0);
            aycVarC.u(-385694400);
            long jDq = ((chq) aycVarC.e(bze.c)).dq(byx.c(R.dimen.toggle_text_size, aycVarC));
            aygVar.Y();
            if (z) {
                aycVarC.u(928520632);
                j = bay.O(aycVarC).g;
                aygVar.Y();
                z2 = true;
            } else {
                aycVarC.u(928585050);
                j = bay.O(aycVarC).q;
                aygVar.Y();
                z2 = false;
            }
            cfa.a("google-sans-text");
            cfd cfdVarF = byx.f(byx.g("google-sans-text", cfp.g, null, 12));
            cdo cdoVar = new cdo(jDq, null, null, null, 16777213);
            bik bikVarZ = bdq.z(akyVar.a(bihVar, bieVar), f);
            aycVarC.u(1849434622);
            Object objR4 = aygVar.R();
            int i6 = 14;
            if (objR4 == obj) {
                objR4 = new aks(i6);
                aygVar.ac(objR4);
            }
            aygVar.Y();
            aycVar2 = aycVarC;
            awt.b(str, clc.ag(cbp.b(bikVarZ, false, (uiq) objR4), "zoom_toggle_".concat(str)), j, 0L, cfdVarF, 0L, 0L, 0, false, 0, 0, cdoVar, aycVar2, (i3 >> 9) & 14, 0, 65464);
            aycVar2.m();
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            final boolean z5 = z2;
            baiVarI.d = new uiu() { // from class: gvn
                @Override // defpackage.uiu
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i7 = i;
                    boolean z6 = z5;
                    uiq uiqVar2 = uiqVar;
                    String str2 = str;
                    gsn.S(i7, z6, uiqVar2, str2, f, (ayc) obj2, bay.j(i2 | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static void T(bgz bgzVar, final int i, final uiq uiqVar, final float f, boolean z, ayc aycVar, int i2) {
        final bgz bgzVar2;
        int i3;
        boolean z2;
        ayc aycVar2;
        uiqVar.getClass();
        int i4 = i2 & 6;
        ayc aycVarC = aycVar.c(1132646631);
        if (i4 == 0) {
            bgzVar2 = bgzVar;
            i3 = (true != aycVarC.B(bgzVar2) ? 2 : 4) | i2;
        } else {
            bgzVar2 = bgzVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != aycVarC.z(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != aycVarC.D(uiqVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != aycVarC.y(f) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            z2 = z;
            i3 |= true != aycVarC.C(z2) ? 8192 : 16384;
        } else {
            z2 = z;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != aycVarC.C(false) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((74899 & i3) == 74898 && aycVarC.G()) {
            aycVarC.r();
            aycVar2 = aycVarC;
        } else {
            bik bikVarAe = bay.ae(bik.c);
            aycVarC.u(1849434622);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            Object obj = ayb.a;
            if (objR == obj) {
                objR = new aks(15);
                aygVar.ac(objR);
            }
            aygVar.Y();
            bik bikVarAg = clc.ag(cbp.b(bikVarAe, false, (uiq) objR), "zoom_toggle_row");
            aycVarC.u(-1224400529);
            boolean z3 = (i3 & 14) == 4;
            boolean z4 = (57344 & i3) == 16384;
            boolean z5 = (i3 & ScriptIntrinsicBLAS.TRANSPOSE) == 32;
            boolean z6 = (i3 & 896) == 256;
            int i5 = i3;
            boolean z7 = (i3 & 7168) == 2048;
            boolean z8 = (i5 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072;
            Object objR2 = aygVar.R();
            if ((z3 | z4 | z5 | z6 | z7 | z8) || objR2 == obj) {
                final boolean z9 = z2;
                uiq uiqVar2 = new uiq() { // from class: gvq
                    @Override // defpackage.uiq
                    public final Object a(Object obj2) {
                        ocq ocqVar = (ocq) obj2;
                        ocqVar.getClass();
                        bgz bgzVar3 = bgzVar2;
                        ocqVar.az(bgzVar3.a(), new gvz(bgzVar3, 0), new bfh(2039820996, true, new gwa(bgzVar3, z9, i, uiqVar, f)));
                        return ufg.a;
                    }
                };
                aygVar.ac(uiqVar2);
                objR2 = uiqVar2;
            }
            aygVar.Y();
            aycVar2 = aycVarC;
            byi.ay(bikVarAg, null, null, null, null, null, false, null, (uiq) objR2, aycVar2, 12582912, 382);
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new nid(bgzVar, i, uiqVar, f, z, i2, 1);
        }
    }

    public static Float U(float f, ocq ocqVar) {
        if (ocqVar != null) {
            return Float.valueOf(ukc.m((float) ocq.s(f, (sbp) ocqVar.a, true), 0.0f, 1.0f));
        }
        return null;
    }

    public static Float V(float f, float f2, float f3, ocq ocqVar) {
        if (ocqVar != null) {
            return Float.valueOf(ukc.m((float) ocq.s(f, (sbp) ocqVar.a, false), f2, f3));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static syu W(Context context) {
        if (context instanceof fsr) {
            return ((fsr) context).c();
        }
        if (context instanceof ContextWrapper) {
            return W(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Context does not supply an early-readiness Future.");
    }

    public static paq X() throws SecurityException, IllegalArgumentException {
        final int threadPriority = Process.getThreadPriority(0);
        Trace.beginSection("boost:-8");
        Process.setThreadPriority(-8);
        return new paq() { // from class: ftn
            @Override // defpackage.paq, java.lang.AutoCloseable
            public final void close() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(threadPriority);
                Trace.endSection();
            }
        };
    }

    public static void Y(our ourVar, Future future) {
        ourVar.d(new ffy(future, 4));
    }

    public static String Z(fre freVar) {
        return freVar.getClass().getName();
    }

    public static rwu aa() {
        return new rwu(rvj.a);
    }

    public static boolean ab(Rect rect, Rect rect2) {
        return Math.abs(rect.centerX() - rect2.centerX()) < 100 && Math.abs(rect.centerY() - rect2.centerY()) < 100;
    }

    public static eie ad(elb elbVar, efh efhVar) {
        return new eie(ak(elbVar, efhVar, ekc.b));
    }

    public static eif ae(elb elbVar, efh efhVar) {
        return af(elbVar, efhVar, true);
    }

    public static eif af(elb elbVar, efh efhVar, boolean z) {
        return new eif(al(elbVar, z ? eln.a() : 1.0f, efhVar, ekc.a));
    }

    public static eig ag(elb elbVar, efh efhVar, int i) {
        return new eig(ak(elbVar, efhVar, new ekf(i)));
    }

    public static eih ah(elb elbVar, efh efhVar) {
        return new eih(ak(elbVar, efhVar, ekc.c));
    }

    public static eij ai(elb elbVar, efh efhVar) {
        return new eij(ekk.a(elbVar, efhVar, eln.a(), ekc.e, true));
    }

    public static eil aj(elb elbVar, efh efhVar) {
        return new eil(al(elbVar, eln.a(), efhVar, eks.a));
    }

    public static List ak(elb elbVar, efh efhVar, eky ekyVar) {
        return ekk.a(elbVar, efhVar, 1.0f, ekyVar, false);
    }

    public static List al(elb elbVar, float f, efh efhVar, eky ekyVar) {
        return ekk.a(elbVar, efhVar, f, ekyVar, false);
    }

    public static Paint.Join am(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
    }

    public static Paint.Cap an(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
    }

    private static boolean ao(pnq pnqVar) {
        return pnqVar.y || pnqVar.z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(boolean z, boolean z2, final uiu uiuVar, ayc aycVar, final int i, final int i2) {
        int i3;
        avp avpVarA;
        ayc aycVar2;
        boolean z3;
        boolean z4 = z;
        boolean z5 = z2;
        uiuVar.getClass();
        int i4 = i2 & 1;
        ayc aycVarC = aycVar.c(625952631);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != aycVarC.C(z4) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        boolean z6 = i5 == 0;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != aycVarC.C(z5) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != aycVarC.D(uiuVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && aycVarC.G()) {
            aycVarC.r();
            aycVar2 = aycVarC;
            z3 = z4;
        } else {
            boolean z7 = (z4 ? 1 : 0) & (i4 ^ 1);
            z5 |= !z6;
            aycVarC.u(245063915);
            if (z5) {
                Context context = (Context) aycVarC.e(AndroidCompositionLocals_androidKt.b);
                avpVarA = avq.a(bay.S(context, android.R.color.system_primary_dark), bay.S(context, android.R.color.system_on_primary_dark), bay.S(context, android.R.color.system_primary_container_dark), bay.S(context, android.R.color.system_on_primary_container_dark), bay.S(context, android.R.color.system_primary_light), bay.S(context, android.R.color.system_secondary_dark), bay.S(context, android.R.color.system_on_secondary_dark), bay.S(context, android.R.color.system_secondary_container_dark), bay.S(context, android.R.color.system_on_secondary_container_dark), bay.S(context, android.R.color.system_tertiary_dark), bay.S(context, android.R.color.system_on_tertiary_dark), bay.S(context, android.R.color.system_tertiary_container_dark), bay.S(context, android.R.color.system_on_tertiary_container_dark), bay.S(context, android.R.color.system_background_dark), bay.S(context, android.R.color.system_on_background_dark), bay.S(context, android.R.color.system_surface_dark), bay.S(context, android.R.color.system_on_surface_dark), bay.S(context, android.R.color.system_surface_variant_dark), bay.S(context, android.R.color.system_on_surface_variant_dark), bay.S(context, android.R.color.system_primary_dark), bay.S(context, android.R.color.system_surface_light), bay.S(context, android.R.color.system_on_surface_light), bay.S(context, android.R.color.system_outline_dark), bay.S(context, android.R.color.system_outline_variant_dark), bay.S(context, android.R.color.system_surface_bright_dark), bay.S(context, android.R.color.system_surface_container_dark), bay.S(context, android.R.color.system_surface_container_high_dark), bay.S(context, android.R.color.system_surface_container_highest_dark), bay.S(context, android.R.color.system_surface_container_low_dark), bay.S(context, android.R.color.system_surface_container_lowest_dark), bay.S(context, android.R.color.system_surface_dim_dark), 331350016, 0);
            } else {
                avpVarA = avq.a(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15);
            }
            avp avpVar = avpVarA;
            ayg aygVar = (ayg) aycVarC;
            aygVar.Y();
            if (z7 != 0) {
                aycVarC.u(-992819398);
                aycVar2 = aycVarC;
                prh.i(avpVar, null, null, null, bdq.k(1389251773, new asu(uiuVar, 5), aycVarC), aycVar2, 24576);
                aygVar.Y();
                z3 = z7;
            } else {
                aycVarC.u(-992733404);
                qpt.at(avpVar, null, null, bdq.k(842164973, new gvi(uiuVar, 1), aycVarC), aycVarC, 3072);
                aycVar2 = aycVarC;
                aygVar.Y();
                z3 = z7;
            }
        }
        final boolean z8 = z5;
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            final boolean z9 = true == z3;
            baiVarI.d = new uiu() { // from class: gvc
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z10 = z9;
                    boolean z11 = z8;
                    gsn.l(z10, z11, uiuVar, (ayc) obj, bay.j(i | 1), i2);
                    return ufg.a;
                }
            };
        }
    }

    public static boolean m(hbj hbjVar) {
        return hbjVar.p(gzw.j) && hbjVar.p(gzw.i);
    }

    public static /* synthetic */ int n(ksa ksaVar) {
        switch (ksaVar.ordinal()) {
            case 50:
                return R.string.stabilization_standard;
            case 51:
                return R.string.stabilization_locked;
            case 52:
                return R.string.stabilization_active;
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
        }
    }

    public static /* synthetic */ void o(owq owqVar, kqy kqyVar, Boolean bool) {
        boolean z = false;
        if (bool.booleanValue() && ksa.VIDEO_FLASH_ON.equals(owqVar.dL())) {
            z = true;
        }
        kqyVar.g(z, R.drawable.quantum_gm_ic_flash_on_white_24, R.string.flash_on_desc, "VideoFlash", krs.BACK_VIDEO_FLASH);
    }

    public static /* synthetic */ gyd q(tpc tpcVar) {
        tph tphVarL = tpcVar.l();
        tphVarL.getClass();
        return (gyd) tphVarL;
    }

    public static /* synthetic */ tsd r(tpc tpcVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((gyd) tpcVar.b).i);
        listUnmodifiableList.getClass();
        return new tsd(listUnmodifiableList);
    }

    public static /* synthetic */ tsd s(tpc tpcVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((gyd) tpcVar.b).f);
        listUnmodifiableList.getClass();
        return new tsd(listUnmodifiableList);
    }

    public static /* synthetic */ tsd t(tpc tpcVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((gyd) tpcVar.b).e);
        listUnmodifiableList.getClass();
        return new tsd(listUnmodifiableList);
    }

    public static void u(ssc sscVar, tpc tpcVar) {
        sscVar.getClass();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        gyd gydVar = (gyd) tpcVar.b;
        gyd gydVar2 = gyd.a;
        gydVar.d = sscVar.T;
        gydVar.b |= 2;
    }

    public static void v(float f, tpc tpcVar) {
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        gyd gydVar = (gyd) tpcVar.b;
        gyd gydVar2 = gyd.a;
        gydVar.b |= 8;
        gydVar.h = f;
    }

    public static void w(gyb gybVar, tpc tpcVar) {
        gybVar.getClass();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        gyd gydVar = (gyd) tpcVar.b;
        gyd gydVar2 = gyd.a;
        gydVar.c = gybVar.e;
        gydVar.b |= 1;
    }

    public static void x(float f, tpc tpcVar) {
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        gyd gydVar = (gyd) tpcVar.b;
        gyd gydVar2 = gyd.a;
        gydVar.b |= 4;
        gydVar.g = f;
    }

    public static /* synthetic */ void y(tpc tpcVar) {
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        gyd gydVar = (gyd) tpcVar.b;
        gyd gydVar2 = gyd.a;
        gydVar.i = trb.a;
    }

    public static /* synthetic */ void z(tpc tpcVar) {
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        gyd gydVar = (gyd) tpcVar.b;
        gyd gydVar2 = gyd.a;
        gydVar.f = tpa.a;
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public gsn(int[] iArr) {
    }

    public static /* synthetic */ String ac(int i) {
        if (i == 12) {
            return "PET_FACE";
        }
        switch (i) {
            case 1:
                return "INVALID";
            case 2:
                return "DEFAULT";
            case 3:
                return "TOUCH";
            case 4:
                return YyLACfm.gHcKwxr;
            case 5:
                return "TRACKING";
            case 6:
                return "SALIENCY";
            case 7:
                return oUZhwRhE.OHvNbqaz;
            case 8:
                return PJGqOKsIpSdZ.RgNI;
            default:
                return "null";
        }
    }

    public static void p(hbj hbjVar, hbj hbjVar2, pnq pnqVar, hbc hbcVar) {
        hbjVar.g(gyg.f, Float.valueOf(1.3229325E7f));
        hbjVar.g(gyg.g, Float.valueOf(3.807744E7f));
        hbjVar.l(gzo.aU, true);
        hbjVar.l(gzo.bb, true);
        boolean z = pnqVar.A;
        hbjVar.c(gzo.l, Integer.valueOf(true != z ? 1600 : 1500));
        hbjVar.g(gzo.bk, Float.valueOf(1.580689f));
        hbjVar.j(gzo.am, true);
        hbjVar.l(gzo.ac, true);
        hbjVar.l(gzo.ad, true);
        hbjVar.l(gzo.bs, true);
        hbjVar.l(gzo.al, true);
        hbjVar.j(gzo.bA, false);
        hbjVar.l(gzo.ai, false);
        hbjVar.l(gzo.bd, true);
        hbjVar.g(hba.l, Float.valueOf(0.507838f));
        gzg gzgVar = hba.n;
        Float fValueOf = Float.valueOf(5.0f);
        hbjVar.g(gzgVar, fValueOf);
        hbjVar.g(hba.j, Float.valueOf(true != ao(pnqVar) ? 8.0f : 10.0f));
        hbjVar.c(hba.a, Integer.valueOf(true != ao(pnqVar) ? 1 : 10));
        ao(pnqVar);
        hbjVar.l(hba.i, z);
        hbjVar.l(hba.k, true);
        hbjVar.h(gzo.aR, "3840x2736");
        hbjVar.l(gyh.c, ao(pnqVar));
        hbjVar.g(gyh.a, Float.valueOf(0.626f));
        hbjVar.g(gyh.b, Float.valueOf(0.81f));
        hbjVar.l(gyh.g, ao(pnqVar));
        hbjVar.l(gyh.e, ao(pnqVar));
        hbjVar.l(gyh.f, ao(pnqVar));
        hbjVar.l(gyh.h, ao(pnqVar));
        hbjVar.l(gze.g, true);
        hbjVar.l(gze.h, true);
        hbjVar.l(gze.l, true);
        hbjVar.l(gze.k, true);
        hbjVar.l(gzb.b, true);
        hbjVar.l(gzb.c, true);
        hbjVar.l(gzb.d, true);
        hbjVar.l(gym.E, false);
        hbjVar.l(gym.ag, true);
        hbjVar.l(gym.K, true);
        hbjVar.l(gym.R, true);
        hbjVar.l(gym.S, true);
        hbjVar.l(gym.T, true);
        hbjVar.l(gym.V, true);
        hbjVar.l(gym.W, true);
        hbjVar.l(gym.Y, false);
        hbjVar.l(gym.ah, true);
        hbjVar.g(gym.y, Float.valueOf(true != ao(pnqVar) ? 7.0f : 20.0f));
        hbjVar.g(gym.z, Float.valueOf(true != ao(pnqVar) ? 7.0f : 20.0f));
        hbjVar.g(gym.A, Float.valueOf(7.0f));
        hbjVar.g(gym.x, Float.valueOf(true != ao(pnqVar) ? 7.0f : 20.0f));
        hbjVar.l(gym.w, false);
        hbjVar.l(gzo.Q, false);
        hbjVar.l(gym.am, true);
        hbjVar.l(gym.aj, true);
        hbjVar.l(gym.Z, false);
        hbjVar.l(gym.I, true);
        hbjVar.l(gym.ac, true);
        hbjVar.l(gym.B, true);
        hbjVar.l(gym.U, true);
        hbjVar.l(gym.at, true);
        hbjVar.c(gym.k, ao(pnqVar) ? 156 : 171);
        hbjVar.l(gym.ao, true);
        hbjVar.l(gym.au, true);
        hbjVar.l(gym.H, false);
        hbjVar.l(hax.c, ao(pnqVar));
        hbc hbcVar2 = hbc.DOGFOOD;
        hbcVar.b(hbcVar2);
        hbjVar.l(hax.e, ao(pnqVar));
        hbjVar.l(hax.j, ao(pnqVar));
        hbjVar.l(hax.g, ao(pnqVar));
        hbjVar.l(hax.f, ao(pnqVar));
        if (ao(pnqVar)) {
            hbcVar.b(hbcVar2);
        }
        hbjVar.h(haq.f, "avenh-model0-rio.tflite.uncompressed");
        hbjVar.l(gys.d, true);
        hbjVar.l(gyx.b, true);
        hbjVar.l(gyx.c, true);
        hbjVar.l(gyx.f, true);
        hbjVar.l(gyx.e, true);
        hbjVar.l(gyx.g, true);
        hbjVar.h(gyx.h, "deeprestore_face_float32_512x512_v13_rc2_float-graph-custom_op_p23.tflite.uncompressed");
        hbjVar.c(gyx.a, 4);
        hbjVar.l(gyx.i, true);
        gzg gzgVar2 = hah.a;
        hbjVar.h(hah.a, "8bd5e22b220348078faf705e9f359e3d.tflite.uncompressed");
        hbjVar.h(hah.b, "09071335e3914c00ac0a00f29193b4c7.tflite.uncompressed");
        hbjVar.h(has.g, "siamese_fe_darwinn_custom_op_rio_a0.tflite.uncompressed");
        hbjVar.h(has.h, "siamese_end2end_darwinn_custom_op_rio_a0.tflite.uncompressed");
        hbjVar.l(gze.m, true);
        hbjVar.l(gze.o, true);
        hbjVar.l(gzc.j, true);
        hbjVar.l(gzc.B, true);
        hbjVar.l(gzc.x, true);
        hbjVar.c(gzc.f, 2048);
        hbjVar.l(gzc.C, ao(pnqVar));
        hbjVar.g(gzc.L, fValueOf);
        hbjVar.l(gzc.R, ao(pnqVar));
        hbjVar.l(gzc.T, ao(pnqVar));
        hbjVar.h(gzc.F, rnt.ac(Integer.valueOf(nkw.PHOTO.u), Integer.valueOf(nkw.NIGHT_SIGHT.u), new Object[0]));
        hbjVar.l(gzc.U, ao(pnqVar));
        hbjVar.l(gzc.D, ao(pnqVar));
        hbjVar.l(gzc.V, ao(pnqVar));
        hbjVar.g(gzc.H, Float.valueOf(0.5f));
        hbjVar.g(gzc.I, Float.valueOf(-1.0f));
        hbjVar.h(gzc.E, "hawk_full_fov_custom-op-p23.tflite.uncompressed");
        hbjVar.l(gzc.n, true);
        hbjVar.l(gzc.k, true);
        gzg gzgVar3 = gzc.o;
        Float fValueOf2 = Float.valueOf(100.0f);
        hbjVar.g(gzgVar3, fValueOf2);
        hbjVar.h(gzc.l, "cyclops_tpu.tflite.uncompressed");
        hbjVar.g(gzs.ak, fValueOf2);
        hbjVar.l(gzs.aj, true);
        hbjVar.c(gzs.g, 2);
        hbjVar.l(gyz.b, true);
        hbjVar.h(gyz.c, UvOvSgfD.iRXfuXtfG);
        hbjVar.h(gyz.d, "a6e0c8748401410a834a9029d7050e25.uncompressed");
        hbjVar.h(gyz.e, "dbdaa025a5bf4d0889e146bc35281e3c.uncompressed");
        hbjVar.l(gzs.ab, true);
        hbjVar.l(gzs.at, true);
        hbjVar.l(hac.r, true);
        hbjVar.l(hac.q, true);
        hbjVar.l(gzs.ae, true);
        hbjVar.l(hac.O, ao(pnqVar));
        hbjVar.g(hac.I, Float.valueOf(-1.75f));
        hbjVar.g(hac.J, Float.valueOf(-1.65f));
        hbjVar.l(hac.L, true);
        hbjVar.l(gzo.bD, true);
        hbjVar.l(hab.d, true);
        hbjVar.l(hab.e, true);
        hbjVar.l(hab.f, true);
        hbjVar.l(hab.g, true);
        hbjVar.l(hab.h, true);
        hbjVar.h(hab.i, "motion-custom_op-p23.tflite.uncompressed");
        hbjVar.h(hab.j, "saliency-custom_op-p23.tflite.uncompressed");
        hbjVar.l(gze.i, true);
        hbjVar.j(gzz.h, false);
        hbjVar.l(gzz.l, false);
        hbjVar.l(gzz.x, true);
        hbjVar.l(gzz.w, true);
        hbjVar.l(gzz.E, true);
        hbjVar.l(haa.A, true);
        hbjVar.l(haa.aa, true);
        hbjVar.l(haa.W, true);
        hbjVar.l(haa.ab, true);
        hbjVar.l(haa.B, true);
        hbjVar.l(haa.Y, true);
        gzi gziVar = haa.d;
        hbc hbcVar3 = hbc.ENG;
        hbjVar.c(gziVar, Integer.valueOf(true != hbcVar.b(hbcVar3) ? 5 : 10));
        hbjVar.l(haa.o, true);
        hbjVar.l(haa.q, true);
        hbjVar.l(haa.D, true);
        hbjVar.l(haa.Z, true);
        hbjVar.l(gzo.aV, true);
        hbjVar.l(haa.y, true);
        hbjVar.l(haa.z, false);
        hbjVar.l(haa.ak, true);
        hbjVar.c(hae.b, Integer.valueOf(((Integer) hbjVar2.a(hae.c).get()).intValue() * 5));
        hbjVar.c(hae.a, 300);
        hbjVar.l(hae.k, false);
        hbjVar.l(hae.l, true);
        hbjVar.l(hae.x, true);
        hbjVar.j(hae.z, false);
        hbjVar.l(han.c, ao(pnqVar));
        hbjVar.l(han.d, ao(pnqVar));
        hbjVar.l(han.h, ao(pnqVar));
        hbjVar.l(han.j, ao(pnqVar));
        hbjVar.l(han.l, ao(pnqVar));
        hbjVar.l(han.g, true);
        ao(pnqVar);
        hbjVar.l(hak.w, true);
        hbjVar.l(hak.v, true);
        hbjVar.l(hak.F, true);
        hbjVar.l(hak.G, true);
        hbjVar.g(hak.c, Float.valueOf(1.5172f));
        hbjVar.g(hak.d, Float.valueOf(2.0f));
        hbjVar.l(hak.Z, true);
        hbjVar.g(hak.X, Float.valueOf(3.0f));
        hbjVar.l(hak.p, true);
        hbjVar.l(hak.q, true);
        hbjVar.l(hak.A, true);
        hbjVar.l(hak.K, true);
        hbjVar.l(hak.L, true);
        hbjVar.l(hak.aa, true);
        hbjVar.l(hak.ad, true);
        hbjVar.l(hak.ae, true);
        hbjVar.l(hak.x, true);
        hbjVar.h(hak.O, "06f781358e5e41a3b18d0a1f4c59c526/06f781358e5e41a3b18d0a1f4c59c526.uncompressed");
        hbjVar.h(hak.M, "dd674d048bbc43c1b338a6692cf9c481/dd674d048bbc43c1b338a6692cf9c481.uncompressed");
        hbjVar.h(hak.P, "0e14a3dd073345168f939198e03f2d4e/0e14a3dd073345168f939198e03f2d4e.uncompressed");
        hbjVar.h(hak.S, "efaffa0bfaf74be2ad2e17aeff79f3db/efaffa0bfaf74be2ad2e17aeff79f3db.uncompressed");
        hbjVar.h(hak.T, "a982533a4222473db9f191c212a99740/a982533a4222473db9f191c212a99740.uncompressed");
        hbjVar.h(hak.U, "f452199b34d445868df25db5b960f191/f452199b34d445868df25db5b960f191.uncompressed");
        hbjVar.j(hak.ai, true);
        hbjVar.l(hak.aj, true);
        hbjVar.c(hak.a, Integer.valueOf(true != ao(pnqVar) ? 4 : 10));
        hbjVar.c(gyk.b, 2016);
        hbjVar.c(gyk.c, 1512);
        hbjVar.c(gyk.a, 0);
        hbjVar.l(hak.s, false);
        hbjVar.l(hak.t, true);
        hbjVar.h(hak.u, "P23");
        hbjVar.l(haw.l, true);
        hbjVar.l(haw.n, true);
        hbjVar.l(haw.o, true);
        hbjVar.l(haw.v, true);
        hbjVar.l(haw.q, true);
        hbjVar.l(haw.w, true);
        hbjVar.l(gzo.Z, true);
        hbjVar.l(gzo.ab, true);
        hbjVar.l(hba.g, true);
        hbjVar.l(hba.h, true);
        hbjVar.l(gzo.aa, ao(pnqVar));
        gzi gziVar2 = hau.a;
        hbjVar.l(gyw.j, true);
        hbjVar.l(gzy.j, true);
        hbjVar.l(gzy.k, true);
        hbjVar.l(gzs.O, true);
        hbjVar.l(gzs.Q, true);
        hbjVar.h(gzs.P, "lancet_alpha_v2-p24.tflite.uncompressed");
        hbjVar.l(gzs.R, true);
        hbjVar.h(gzs.S, "kepler_v2/p24");
        hbjVar.l(gzs.au, true);
        hbjVar.h(gzs.aw, "pecan-p23-custom_op.tflite.uncompressed");
        hbjVar.l(gzs.aA, true);
        hbjVar.h(gzs.ax, yoGAhrpjU.ZbXLAwhXxrBe);
        hbjVar.l(gzs.av, true);
        hbjVar.h(gzs.ay, "pecan-p24-pie-custom_op.tflite.uncompressed");
        hbjVar.h(gzs.aL, "walnut-p23-custom_op.tflite.uncompressed");
        hbjVar.l(gzs.aM, true);
        hbjVar.h(gzs.aN, "almond-p24-custom_op.tflite.uncompressed");
        int i = gyu.a;
        hbjVar.l(gyo.f, true);
        hbjVar.l(haa.w, true);
        hbjVar.l(haa.aj, true);
        hbjVar.l(gyf.c, true);
        hbjVar.l(gyf.e, true);
        hbjVar.g(gyf.g, Float.valueOf(true != ao(pnqVar) ? 0.67f : 0.61f));
        hbjVar.l(hai.b, false);
        hbjVar.l(gzs.H, true);
        hbjVar.l(gzs.I, true);
        hbjVar.l(gzs.aF, true);
        hbjVar.l(hae.w, true);
        hbjVar.j(hal.a, ao(pnqVar));
        hbjVar.j(gzo.bC, z);
        hbjVar.l(gyg.i, true);
        hbjVar.l(gyg.j, true);
        hbjVar.l(gzq.d, true);
        hbjVar.l(gzq.e, true);
        int i2 = gzv.a;
        hbjVar.l(hak.af, true);
        hbjVar.h(hak.ag, "70ea5dedf8a14631bf31d89bf26dde7c.uncompressed");
        hbjVar.h(hak.ah, "c76dccefa6284f11902b8eadee538ca5.uncompressed");
        hbcVar.b(hbcVar3);
        hbcVar.b(hbcVar3);
        hbcVar.b(hbcVar3);
        hbjVar.h(hak.ac, "b933c7da1fa54d36a167d0287af1eb34/b933c7da1fa54d36a167d0287af1eb34.uncompressed");
        hbjVar.l(hak.ab, true);
        hbjVar.l(gzp.k, true);
        if (z) {
            hbjVar.g(gzp.n, Float.valueOf(0.75f));
        }
        hbjVar.j(gyi.h, true);
    }

    public gsn(hbj hbjVar, Deque deque, mdy mdyVar) {
        hbjVar.getClass();
        deque.getClass();
        mdyVar.getClass();
        gzi gziVar = hba.a;
    }

    public gsn(short[] sArr) {
        gzi gziVar = gzo.a;
    }
}
