package defpackage;

import android.graphics.Region;
import android.os.Trace;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbs {
    private static final bkg a = new bkg(0.0f, 0.0f, 10.0f, 10.0f);

    public static final boolean a(cbr cbrVar) {
        bwi bwiVarE = cbrVar.e();
        if (bwiVarE != null && bwiVarE.aq()) {
            return true;
        }
        cbn cbnVar = cbrVar.c;
        return cbnVar.f(cbu.p) || cbnVar.f(cbu.o);
    }

    public static final boolean b(cbr cbrVar) {
        if (a(cbrVar)) {
            return false;
        }
        cbn cbnVar = cbrVar.c;
        if (cbnVar.a) {
            return true;
        }
        zu zuVar = cbnVar.c;
        Object[] objArr = zuVar.b;
        Object[] objArr2 = zuVar.c;
        long[] jArr = zuVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 < i4) {
                            if ((255 & j) < 128) {
                                int i5 = (i << 3) + i3;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((cbz) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                            i3++;
                        } else if (i4 != 8) {
                            return false;
                        }
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public static final yq c(cey ceyVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            cbr cbrVarC = ceyVar.c();
            bvm bvmVar = cbrVarC.b;
            if (bvmVar.ah() && bvmVar.ag()) {
                yq yqVar = new yq(48);
                ejs ejsVar = new ejs((char[]) null, (byte[]) null);
                ejsVar.u(chx.c(cbrVarC.c()));
                d(ejsVar, cbrVarC, yqVar, cbrVarC, new ejs((char[]) null, (byte[]) null));
                return yqVar;
            }
            yq yqVar2 = yr.a;
            yqVar2.getClass();
            return yqVar2;
        } finally {
            Trace.endSection();
        }
    }

    private static final void d(ejs ejsVar, cbr cbrVar, yq yqVar, cbr cbrVar2, ejs ejsVar2) {
        buo buoVarAb;
        bkg bkgVarO;
        bvm bvmVar;
        bvm bvmVar2 = cbrVar2.b;
        boolean z = (bvmVar2.ah() && bvmVar2.ag()) ? false : true;
        Region region = (Region) ejsVar.a;
        if (!region.isEmpty() || cbrVar2.e == cbrVar.e) {
            if (!z || cbrVar2.d) {
                cbn cbnVar = cbrVar2.c;
                if (!cbnVar.a || (buoVarAb = clc.ab(bvmVar2)) == null) {
                    buoVarAb = cbrVar2.a;
                }
                bij bijVarB = buoVarAb.B();
                Object objAd = clc.ad(cbnVar, cbm.b);
                if (!bijVarB.m.w) {
                    bkgVarO = bkg.a;
                } else if (objAd != null) {
                    bwi bwiVarC = bko.C(bijVarB, 8);
                    if (bwiVarC.dm()) {
                        bry bryVarX = byi.x(bwiVarC);
                        bke bkeVarV = bwiVarC.V();
                        long jR = bwiVarC.R(bwiVarC.S());
                        int i = (int) (jR >> 32);
                        bkeVarV.a = -Float.intBitsToFloat(i);
                        int i2 = (int) (jR & 4294967295L);
                        bkeVarV.b = -Float.intBitsToFloat(i2);
                        bkeVarV.c = bwiVarC.t() + Float.intBitsToFloat(i);
                        bkeVarV.d = bwiVarC.s() + Float.intBitsToFloat(i2);
                        while (true) {
                            if (bwiVarC == bryVarX) {
                                bkgVarO = acv.o(bkeVarV);
                                break;
                            }
                            bwiVarC.al(bkeVarV, false, true);
                            if (bkeVarV.c()) {
                                bkgVarO = bkg.a;
                                break;
                            } else {
                                bwiVarC = bwiVarC.w;
                                bwiVarC.getClass();
                            }
                        }
                    } else {
                        bkgVarO = bkg.a;
                    }
                } else {
                    bkgVarO = byi.v(bko.C(bijVarB, 8));
                }
                chz chzVarC = chx.c(bkgVarO);
                ejsVar2.u(chzVarC);
                int i3 = cbrVar2.e;
                if (i3 == cbrVar.e) {
                    i3 = -1;
                }
                if (!((Region) ejsVar2.a).op(region, Region.Op.INTERSECT)) {
                    if (cbrVar2.d) {
                        cbr cbrVarH = cbrVar2.h();
                        yqVar.f(i3, new ebn(cbrVar2, chx.c((cbrVarH == null || (bvmVar = cbrVarH.b) == null || !bvmVar.ah()) ? a : cbrVarH.c())));
                        return;
                    } else {
                        if (i3 == -1) {
                            yqVar.f(-1, new ebn(cbrVar2, ejsVar2.t()));
                            return;
                        }
                        return;
                    }
                }
                yqVar.f(i3, new ebn(cbrVar2, ejsVar2.t()));
                List listJ = cbrVar2.j();
                for (int size = listJ.size() - 1; size >= 0; size--) {
                    if (!((cbr) listJ.get(size)).f().f(cbu.x)) {
                        d(ejsVar, cbrVar, yqVar, (cbr) listJ.get(size), ejsVar2);
                    }
                }
                if (b(cbrVar2)) {
                    region.op(chzVarC.b, chzVarC.c, chzVarC.d, chzVarC.e, Region.Op.DIFFERENCE);
                }
            }
        }
    }
}
