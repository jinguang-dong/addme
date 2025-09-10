package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.camera2.CameraAccessException;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class e {
    public e() {
    }

    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "SIMPLE";
            case 3:
                return "CHOICE";
            case 4:
                return "PLURAL";
            case 5:
                return "SELECT";
            case 6:
                return "SELECTORDINAL";
            default:
                return "null";
        }
    }

    public static boolean b(int i) {
        return i == 4 || i == 6;
    }

    public static int c(CameraAccessException cameraAccessException) {
        int reason = cameraAccessException.getReason();
        if (reason == 1) {
            return 3;
        }
        if (reason == 2) {
            return 6;
        }
        if (reason == 3) {
            return 0;
        }
        if (reason == 4) {
            return 1;
        }
        if (reason == 5) {
            return 2;
        }
        throw new IllegalArgumentException("Unexpected CameraAccessException reason:" + cameraAccessException.getReason());
    }

    public static int d(Throwable th) {
        if (th instanceof CameraAccessException) {
            return c((CameraAccessException) th);
        }
        if (th instanceof IllegalArgumentException) {
            return 7;
        }
        if (th instanceof SecurityException) {
            return 8;
        }
        Objects.toString(th);
        Log.w("CXCP", "Unexpected throwable: ".concat(th.toString()));
        return 11;
    }

    public static /* synthetic */ nw e(int i, int i2) {
        return new nw(i, i2, new add(1));
    }

    public static int h(ld ldVar, kf kfVar, View view, View view2, kq kqVar, boolean z) {
        if (kqVar.an() == 0 || ldVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(kq.bi(view) - kq.bi(view2)) + 1;
        }
        return Math.min(kfVar.k(), kfVar.a(view2) - kfVar.d(view));
    }

    public static int i(ld ldVar, kf kfVar, View view, View view2, kq kqVar, boolean z, boolean z2) {
        if (kqVar.an() == 0 || ldVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (ldVar.a() - Math.max(kq.bi(view), kq.bi(view2))) - 1) : Math.max(0, Math.min(kq.bi(view), kq.bi(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(kfVar.a(view2) - kfVar.d(view)) / (Math.abs(kq.bi(view) - kq.bi(view2)) + 1))) + (kfVar.j() - kfVar.d(view)));
        }
        return iMax;
    }

    public static int j(ld ldVar, kf kfVar, View view, View view2, kq kqVar, boolean z) {
        if (kqVar.an() == 0 || ldVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return ldVar.a();
        }
        return (int) (((kfVar.a(view2) - kfVar.d(view)) / (Math.abs(kq.bi(view) - kq.bi(view2)) + 1)) * ldVar.a());
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static void k(atr atrVar, bik bikVar, uiv uivVar, ayc aycVar, int i) {
        rmr rmrVar;
        atr atrVar2 = atrVar;
        int i2 = i & 6;
        ayc aycVarC = aycVar.c(1354335728);
        int i3 = i2 == 0 ? (true != ((i & 8) == 0 ? aycVarC.B(atrVar2) : aycVarC.D(atrVar2)) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != aycVarC.B(bikVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != aycVarC.D(uivVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && aycVarC.G()) {
            aycVarC.r();
        } else {
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (objR == ayb.a) {
                objR = new rmr((byte[]) null);
                aygVar.ac(objR);
            }
            rmr rmrVar2 = (rmr) objR;
            aycVarC.e(AndroidCompositionLocals_androidKt.a);
            Resources resources = ((Context) aycVarC.e(AndroidCompositionLocals_androidKt.b)).getResources();
            String string = a.p(7, 0) ? resources.getString(R.string.navigation_menu) : a.p(7, 1) ? resources.getString(R.string.close_drawer) : a.p(7, 2) ? resources.getString(R.string.close_sheet) : a.p(7, 3) ? resources.getString(R.string.default_error_message) : a.p(7, 4) ? resources.getString(R.string.dropdown_menu) : a.p(7, 5) ? resources.getString(R.string.range_start) : a.p(7, 6) ? resources.getString(R.string.range_end) : a.p(7, 7) ? resources.getString(R.string.mc2_snackbar_pane_title) : "";
            if (a.ao(atrVar2, rmrVar2.b)) {
                rmrVar = rmrVar2;
                aycVarC.u(95895026);
                aygVar.Y();
            } else {
                aycVarC.u(141556958);
                rmrVar2.b = atrVar2;
                ?? r12 = rmrVar2.c;
                ArrayList arrayList = new ArrayList(r12.size());
                int size = r12.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(((aso) r12.get(i4)).a);
                }
                List listBP = ske.bP(arrayList);
                if (!listBP.contains(atrVar2)) {
                    listBP.add(atrVar2);
                }
                r12.clear();
                List listA = cij.a(listBP);
                int i5 = 0;
                for (int size2 = listA.size(); i5 < size2; size2 = size2) {
                    atr atrVar3 = (atr) listA.get(i5);
                    int i6 = i5;
                    rmr rmrVar3 = rmrVar2;
                    r12.add(new aso(atrVar3, bdq.k(-1032415134, new atu(atrVar3, atrVar2, listBP, rmrVar3, string), aycVarC)));
                    i5 = i6 + 1;
                    rmrVar2 = rmrVar3;
                    atrVar2 = atrVar;
                }
                rmrVar = rmrVar2;
                aygVar.Y();
            }
            bsr bsrVarC = aku.c(bib.f, false);
            int iM = bay.M(aycVarC);
            bfk bfkVarAg = aygVar.ag();
            bik bikVarV = bay.v(aycVarC, bikVar);
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
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iM))) {
                Integer numValueOf = Integer.valueOf(iM);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar);
            }
            bbr.a(aycVarC, bikVarV, bum.b);
            bai baiVarO = aygVar.O();
            if (baiVarO == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            baiVarO.n();
            rmrVar.a = baiVarO;
            aycVarC.u(-1757732554);
            ?? r0 = rmrVar.c;
            int size3 = r0.size();
            for (int i7 = 0; i7 < size3; i7++) {
                aso asoVar = (aso) r0.get(i7);
                Object obj = asoVar.a;
                uiv uivVar2 = asoVar.b;
                aycVarC.t(-1515535286, obj);
                uivVar2.a(bdq.k(2017516783, new ars(uivVar, obj, 6, null), aycVarC), aycVarC, 6);
                aygVar.Y();
            }
            aygVar.Y();
            aycVarC.m();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new apc((Object) atrVar, (Object) bikVar, (Object) uivVar, i, 3);
        }
    }

    public static art l(ayc aycVar) {
        return (art) aycVar.e(aru.a);
    }

    public static atp m(ayc aycVar) {
        return (atp) aycVar.e(atq.a);
    }

    public static aux n(ayc aycVar) {
        return (aux) aycVar.e(auy.b);
    }

    public static void o(uif uifVar, bik bikVar, blp blpVar, long j, long j2, ase aseVar, uiu uiuVar, ayc aycVar, int i) {
        int i2;
        blp blpVar2;
        long j3;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-482679837);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(uifVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(bikVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.B(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            blpVar2 = blpVar;
            i2 |= true != aycVarC.B(blpVar2) ? 1024 : 2048;
        } else {
            blpVar2 = blpVar;
        }
        if ((i & 24576) == 0) {
            j3 = j;
            i2 |= true != aycVarC.A(j3) ? 8192 : 16384;
        } else {
            j3 = j;
        }
        if ((196608 & i) == 0) {
            i2 |= true != aycVarC.A(j2) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != aycVarC.B(aseVar) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? 4194304 : 8388608;
        }
        if ((4793491 & i2) == 4793490 && aycVarC.G()) {
            aycVarC.r();
        } else {
            aycVarC.s();
            if ((i & 1) != 0 && !aycVarC.E()) {
                aycVarC.r();
            }
            aycVarC.l();
            aycVarC.u(36082328);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            Object obj = ayb.a;
            if (objR == obj) {
                objR = new ocq((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                aygVar.ac(objR);
            }
            ocq ocqVar = (ocq) objR;
            aygVar.Y();
            Object objR2 = aygVar.R();
            if (objR2 == obj) {
                objR2 = new add(17);
                aygVar.ac(objR2);
            }
            bik bikVarB = cbp.b(bikVar, false, (uiq) objR2);
            int i4 = i2 >> 15;
            aycVarC.u(-478475335);
            boolean zB = aycVarC.B(ocqVar);
            Object objR3 = aygVar.R();
            if (zB || objR3 == obj) {
                objR3 = new ass();
                aygVar.ac(objR3);
            }
            ass assVar = (ass) objR3;
            boolean zD = aycVarC.D(assVar) | ((((i4 & ScriptIntrinsicBLAS.TRANSPOSE) ^ 48) > 32 && aycVarC.B(aseVar)) || (i4 & 48) == 32);
            Object objR4 = aygVar.R();
            if (zD || objR4 == obj) {
                objR4 = new aej(assVar, aseVar, (uhb) null, 10);
                aygVar.ac(objR4);
            }
            azb.f(aseVar, (uiu) objR4, aycVarC);
            boolean zB2 = aycVarC.B(ocqVar) | aycVarC.D(assVar);
            Object objR5 = aygVar.R();
            if (zB2 || objR5 == obj) {
                objR5 = new dzp(ocqVar, assVar, (uhb) null, 1);
                aygVar.ac(objR5);
            }
            azb.f(ocqVar, (uiu) objR5, aycVarC);
            abz abzVar = assVar.e.a;
            aygVar.Y();
            blp blpVar3 = blpVar2;
            long j4 = j3;
            akg.I(uifVar, bikVarB, false, blpVar3, j4, j2, ((cht) abzVar.a()).a, ocqVar, bdq.k(-1823447062, new doi(j2, uiuVar, 1), aycVarC), aycVarC, (i2 & 14) | 805306368 | (i2 & 7168) | (57344 & i2) | (i2 & ImageMetadata.JPEG_GPS_COORDINATES), 68);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ast(uifVar, bikVar, blpVar, j, j2, aseVar, uiuVar, i, 1);
        }
    }

    public static void p(uiu uiuVar, uif uifVar, bik bikVar, blp blpVar, long j, long j2, ase aseVar, ayc aycVar, int i) {
        int i2;
        uif uifVar2;
        int i3;
        blp blpVar2;
        bik bikVar2;
        ase aseVar2;
        long j3;
        long j4;
        bik bikVar3;
        ayc aycVarC = aycVar.c(-1506973027);
        if ((i & 6) == 0) {
            i2 = i | (true != aycVarC.D(uiuVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            uifVar2 = uifVar;
            i2 |= true != aycVarC.D(uifVar2) ? 16 : 32;
        } else {
            uifVar2 = uifVar;
        }
        int i4 = i2 | 28032;
        if ((i & ImageMetadata.EDGE_MODE) == 0) {
            i4 = i2 | 93568;
        }
        if ((i & 1572864) == 0) {
            i4 |= ImageMetadata.LENS_APERTURE;
        }
        if ((i & 12582912) == 0) {
            i4 |= 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        if ((38347923 & i4) == 38347922 && aycVarC.G()) {
            aycVarC.r();
            bikVar3 = bikVar;
            blpVar2 = blpVar;
            j3 = j;
            j4 = j2;
            aseVar2 = aseVar;
        } else {
            int i5 = (-268369921) & i4;
            aycVarC.s();
            if ((i & 1) == 0 || aycVarC.E()) {
                bih bihVar = bik.c;
                apu apuVar = m(aycVarC).a;
                apv apvVarAd = bay.ad(50);
                apz apzVar = new apz(apvVarAd, apvVarAd, apvVarAd, apvVarAd);
                long j5 = l(aycVarC).j();
                long jA = aru.a(j5, aycVarC);
                boolean zY = aycVarC.y(6.0f) | aycVarC.y(12.0f) | aycVarC.y(8.0f) | aycVarC.y(8.0f);
                ayg aygVar = (ayg) aycVarC;
                Object objR = aygVar.R();
                if (zY || objR == ayb.a) {
                    objR = new ase();
                    aygVar.ac(objR);
                }
                i3 = i5;
                blpVar2 = apzVar;
                bikVar2 = bihVar;
                aseVar2 = (ase) objR;
                j3 = j5;
                j4 = jA;
            } else {
                aycVarC.r();
                bikVar2 = bikVar;
                j3 = j;
                j4 = j2;
                aseVar2 = aseVar;
                i3 = i5;
                blpVar2 = blpVar;
            }
            aycVarC.l();
            o(uifVar2, new SizeElement(48.0f, 48.0f, Float.NaN, Float.NaN, true), blpVar2, j3, j4, aseVar2, bdq.k(-555697957, new asu(uiuVar, 1), aycVarC), aycVarC, 12582912 | ((i3 >> 3) & 14) | ((i3 >> 6) & 896));
            bikVar3 = bikVar2;
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ast(uiuVar, uifVar, bikVar3, blpVar2, j3, j4, aseVar2, i, 0);
        }
    }

    public static float q(float f, float f2, ayc aycVar) {
        long j = ((bkv) aycVar.e(asa.a)).g;
        return (!l(aycVar).m() ? ((double) bko.g(j)) >= 0.5d : ((double) bko.g(j)) <= 0.5d) ? f : f2;
    }

    public static float r(ayc aycVar) {
        return q(0.38f, 0.38f, aycVar);
    }

    public static boolean t(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static Object u(bqc bqcVar, uiu uiuVar, uhb uhbVar) {
        Object objN = bqcVar.n(new ahv(uhbVar.q(), uiuVar, null), uhbVar);
        return objN == uhi.a ? objN : ufg.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:21:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object w(defpackage.bqk r8, int r9, defpackage.uhb r10) {
        /*
            boolean r0 = r10 instanceof defpackage.ahu
            if (r0 == 0) goto L13
            r0 = r10
            ahu r0 = (defpackage.ahu) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ahu r0 = new ahu
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            int r8 = r0.d
            bqk r9 = r0.c
            defpackage.rnt.aN(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L5e
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            defpackage.rnt.aN(r10)
            bpp r10 = r8.n()
            java.util.List r10 = r10.a
            int r2 = r10.size()
            r5 = r3
        L45:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r10.get(r5)
            bpv r6 = (defpackage.bpv) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L77
        L51:
            r0.c = r8
            r0.d = r9
            r0.b = r4
            java.lang.Object r10 = r8.s(r9, r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            bpp r10 = (defpackage.bpp) r10
            java.util.List r10 = r10.a
            int r2 = r10.size()
            r5 = r3
        L67:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r10.get(r5)
            bpv r6 = (defpackage.bpv) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L74
            goto L51
        L74:
            int r5 = r5 + 1
            goto L67
        L77:
            int r5 = r5 + 1
            goto L45
        L7a:
            ufg r8 = defpackage.ufg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.w(bqk, int, uhb):java.lang.Object");
    }

    public static void x(ejs ejsVar, bik bikVar, uiv uivVar, ayc aycVar, int i) {
        int i2;
        ayc aycVarC = aycVar.c(1351125615);
        if ((i & 6) == 0) {
            i2 = (true != aycVarC.B(ejsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if ((i3 & 147) == 146 && aycVarC.G()) {
            aycVarC.r();
        } else {
            bikVar = bik.c;
            uivVar = ary.a;
            atr atrVarZ = ejsVar.z();
            ocq ocqVar = (ocq) aycVarC.e(bze.a);
            boolean zD = aycVarC.D(atrVarZ) | aycVarC.D(ocqVar);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (zD || objR == ayb.a) {
                objR = new aej(atrVarZ, ocqVar, (uhb) null, 12);
                aygVar.ac(objR);
            }
            azb.f(atrVarZ, (uiu) objR, aycVarC);
            k(ejsVar.z(), bikVar, uivVar, aycVarC, i3 & 1008);
        }
        bik bikVar2 = bikVar;
        uiv uivVar2 = uivVar;
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new apc((Object) ejsVar, (Object) bikVar2, (Object) uivVar2, i, 4);
        }
    }

    public static dh y(ViewGroup viewGroup, byi byiVar) {
        byiVar.getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof dh) {
            return (dh) tag;
        }
        dh dhVar = new dh(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, dhVar);
        return dhVar;
    }

    public e(byte[] bArr) {
    }

    public void f(Window window) {
    }

    public void g(nw nwVar, nw nwVar2, Window window, View view, boolean z, boolean z2) {
    }
}
