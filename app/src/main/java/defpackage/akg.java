package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.view.KeyEvent;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.layout.LayoutIdElement;
import com.google.ar.core.ImageMetadata;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akg {
    public static final boolean A(bpv bpvVar) {
        return bpvVar.h && !bpvVar.d;
    }

    public static final boolean B(bpv bpvVar, long j, long j2) {
        boolean zP = a.p(bpvVar.i, 1);
        long j3 = bpvVar.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float f = zP ? 1.0f : 0.0f;
        float f2 = fIntBitsToFloat3 * f;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > ((float) ((int) (j >> 32))) + f2) | (fIntBitsToFloat < (-f2)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((float) ((int) (j & 4294967295L))) + fIntBitsToFloat4);
    }

    public static final boolean C(bpv bpvVar) {
        return !a.q(J(bpvVar, true), 0L);
    }

    public static final long E(int i) {
        return i << 32;
    }

    public static final int F(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final long G(KeyEvent keyEvent) {
        return E(keyEvent.getKeyCode());
    }

    public static /* synthetic */ int H(double d) {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void I(final defpackage.uif r20, defpackage.bik r21, boolean r22, defpackage.blp r23, long r24, long r26, final float r28, final defpackage.ocq r29, final defpackage.uiu r30, defpackage.ayc r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akg.I(uif, bik, boolean, blp, long, long, float, ocq, uiu, ayc, int, int):void");
    }

    private static final long J(bpv bpvVar, boolean z) {
        long jAc = a.ac(bpvVar.c, bpvVar.g);
        if (z || !bpvVar.c()) {
            return jAc;
        }
        return 0L;
    }

    public static final Void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void c(String str) {
        throw new IllegalStateException(str);
    }

    public static final void d(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void e(bik bikVar, bie bieVar, uiv uivVar, ayc aycVar, int i) {
        int i2;
        bie bieVar2;
        ayc aycVarC = aycVar.c(380139498);
        int i3 = 1;
        if ((i & 6) == 0) {
            i2 = (true != aycVarC.B(bikVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != aycVarC.C(true) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i4 |= true != aycVarC.D(uivVar) ? 1024 : 2048;
        }
        if (aycVarC.H((i4 & 1171) != 1170, i4 & 1)) {
            boolean z = (i4 & 7168) == 2048;
            bieVar2 = bib.f;
            bsr bsrVarC = aku.c(bieVar2, true);
            boolean zB = z | aycVarC.B(bsrVarC);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (zB || objR == ayb.a) {
                objR = new dmt(bsrVarC, uivVar, i3);
                aygVar.ac(objR);
            }
            btq.a(bikVar, (uiu) objR, aycVarC, i4 & 14, 0);
        } else {
            aycVarC.r();
            bieVar2 = bieVar;
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new apc((Object) bikVar, (Object) bieVar2, uivVar, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca A[Catch: anu -> 0x01ac, TryCatch #4 {anu -> 0x01ac, blocks: (B:33:0x00c6, B:35:0x00ca, B:37:0x00d4, B:39:0x00e3, B:45:0x00f5, B:49:0x0122), top: B:107:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3 A[Catch: anu -> 0x01ac, TryCatch #4 {anu -> 0x01ac, blocks: (B:33:0x00c6, B:35:0x00ca, B:37:0x00d4, B:39:0x00e3, B:45:0x00f5, B:49:0x0122), top: B:107:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0219  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0179 -> B:18:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(defpackage.and r28, int r29, int r30, int r31, defpackage.chq r32, defpackage.uhb r33) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akg.f(and, int, int, int, chq, uhb):java.lang.Object");
    }

    public static final boolean g(boolean z, and andVar, int i, int i2) {
        if (z) {
            if (andVar.b() > i) {
                return true;
            }
            return andVar.b() == i && andVar.c() > i2;
        }
        if (andVar.b() < i) {
            return true;
        }
        return andVar.b() == i && andVar.c() < i2;
    }

    public static final boolean h(and andVar, int i) {
        return i <= andVar.d() && andVar.b() <= i;
    }

    public static final int i(ana anaVar) {
        List list = anaVar.i;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((anb) list.get(i2)).h;
        }
        return (i / list.size()) + anaVar.o;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(final defpackage.uif r28, final defpackage.avo r29, final defpackage.bik r30, final boolean r31, final defpackage.avi r32, defpackage.avl r33, final defpackage.alv r34, final defpackage.uiv r35, defpackage.ayc r36, final int r37) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akg.k(uif, avo, bik, boolean, avi, avl, alv, uiv, ayc, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(defpackage.bik r24, defpackage.blp r25, long r26, long r28, float r30, final defpackage.uiu r31, defpackage.ayc r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akg.l(bik, blp, long, long, float, uiu, ayc, int, int):void");
    }

    public static final /* synthetic */ bik m(bik bikVar, blp blpVar, long j, float f) {
        blp blpVar2;
        long j2 = bla.a;
        if (Float.compare(f, 0.0f) > 0) {
            blpVar2 = blpVar;
            bikVar = bikVar.cM(new ShadowGraphicsLayerElement(f, blpVar2, j2, j2));
        } else {
            blpVar2 = blpVar;
        }
        return bdq.C(byi.aR(bikVar.cM(bik.c), j, blpVar2), blpVar2);
    }

    public static final /* synthetic */ long n(long j, asc ascVar, float f, ayc aycVar) {
        long jL = e.l(aycVar).l();
        long j2 = bkv.a;
        if (!a.q(j, jL) || ascVar == null) {
            aycVar.u(-1124527499);
            aycVar.n();
            return j;
        }
        aycVar.u(-1124595606);
        aycVar.u(-1687113661);
        art artVarL = e.l(aycVar);
        if (Float.compare(f, 0.0f) <= 0 || artVarL.m()) {
            aycVar.u(-1095440862);
            aycVar.n();
        } else {
            aycVar.u(-1095579370);
            float fLog = (float) Math.log(f + 1.0f);
            long jA = aru.a(j, aycVar);
            j = bko.l(bko.k(bkv.d(jA), bkv.c(jA), bkv.b(jA), ((fLog * 4.5f) + 2.0f) / 100.0f, bkv.f(jA)), j);
            aycVar.n();
        }
        aycVar.n();
        aycVar.n();
        return j;
    }

    public static final void o(uiu uiuVar, uiu uiuVar2, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(1302703572);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(uiuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(uiuVar2) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && aycVarC.G()) {
            aycVarC.r();
        } else {
            bik bikVarAM = byi.aM(bik.c, 16.0f, 0.0f, 8.0f, 0.0f, 10);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (objR == ayb.a) {
                objR = new djn(1);
                aygVar.ac(objR);
            }
            bsr bsrVar = (bsr) objR;
            int iM = bay.M(aycVarC);
            bfk bfkVarAg = aygVar.ag();
            bik bikVarV = bay.v(aycVarC, bikVarAM);
            uif uifVar = bum.a;
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            uiu uiuVar3 = bum.d;
            bbr.a(aycVarC, bsrVar, uiuVar3);
            uiu uiuVar4 = bum.c;
            bbr.a(aycVarC, bfkVarAg, uiuVar4);
            uiu uiuVar5 = bum.e;
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iM))) {
                Integer numValueOf = Integer.valueOf(iM);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar5);
            }
            uiu uiuVar6 = bum.b;
            bbr.a(aycVarC, bikVarV, uiuVar6);
            bik bikVarAL = byi.aL(new LayoutIdElement("text"), 0.0f, 6.0f, 1);
            bie bieVar = bib.f;
            bsr bsrVarC = aku.c(bieVar, false);
            int iM2 = bay.M(aycVarC);
            bfk bfkVarAg2 = aygVar.ag();
            bik bikVarV2 = bay.v(aycVarC, bikVarAL);
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVarC, uiuVar3);
            bbr.a(aycVarC, bfkVarAg2, uiuVar4);
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iM2))) {
                Integer numValueOf2 = Integer.valueOf(iM2);
                aygVar.ac(numValueOf2);
                aycVarC.h(numValueOf2, uiuVar5);
            }
            bbr.a(aycVarC, bikVarV2, uiuVar6);
            uiuVar.a(aycVarC, Integer.valueOf(i2 & 14));
            aycVarC.m();
            LayoutIdElement layoutIdElement = new LayoutIdElement("action");
            bsr bsrVarC2 = aku.c(bieVar, false);
            int iM3 = bay.M(aycVarC);
            bfk bfkVarAg3 = aygVar.ag();
            bik bikVarV3 = bay.v(aycVarC, layoutIdElement);
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVarC2, uiuVar3);
            bbr.a(aycVarC, bfkVarAg3, uiuVar4);
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iM3))) {
                Integer numValueOf3 = Integer.valueOf(iM3);
                aygVar.ac(numValueOf3);
                aycVarC.h(numValueOf3, uiuVar5);
            }
            bbr.a(aycVarC, bikVarV3, uiuVar6);
            uiuVar2.a(aycVarC, Integer.valueOf((i2 >> 3) & 14));
            aycVarC.m();
            aycVarC.m();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aqb(uiuVar, uiuVar2, i, 2);
        }
    }

    public static final void p(uiu uiuVar, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(343813818);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(uiuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && aycVarC.G()) {
            aycVarC.r();
        } else {
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (objR == ayb.a) {
                objR = aqc.c;
                aygVar.ac(objR);
            }
            bsr bsrVar = (bsr) objR;
            bih bihVar = bik.c;
            int iM = bay.M(aycVarC);
            bfk bfkVarAg = aygVar.ag();
            bik bikVarV = bay.v(aycVarC, bihVar);
            uif uifVar = bum.a;
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            uiu uiuVar2 = bum.d;
            bbr.a(aycVarC, bsrVar, uiuVar2);
            uiu uiuVar3 = bum.c;
            bbr.a(aycVarC, bfkVarAg, uiuVar3);
            uiu uiuVar4 = bum.e;
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iM))) {
                Integer numValueOf = Integer.valueOf(iM);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar4);
            }
            uiu uiuVar5 = bum.b;
            bbr.a(aycVarC, bikVarV, uiuVar5);
            bik bikVarAH = byi.aH(bihVar, 16.0f, 6.0f);
            bsr bsrVarC = aku.c(bib.f, false);
            int iM2 = bay.M(aycVarC);
            bfk bfkVarAg2 = aygVar.ag();
            bik bikVarV2 = bay.v(aycVarC, bikVarAH);
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVarC, uiuVar2);
            bbr.a(aycVarC, bfkVarAg2, uiuVar3);
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iM2))) {
                Integer numValueOf2 = Integer.valueOf(iM2);
                aygVar.ac(numValueOf2);
                aycVarC.h(numValueOf2, uiuVar4);
            }
            bbr.a(aycVarC, bikVarV2, uiuVar5);
            uiuVar.a(aycVarC, Integer.valueOf(i2 & 14));
            aycVarC.m();
            aycVarC.m();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new ape(uiuVar, i, 3);
        }
    }

    public static final void q(final bik bikVar, final uiu uiuVar, final blp blpVar, final long j, final long j2, final float f, final uiu uiuVar2, ayc aycVar, final int i) {
        bik bikVar2;
        int i2;
        ayc aycVar2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-662779944);
        if (i3 == 0) {
            bikVar2 = bikVar;
            i2 = (true != aycVarC.B(bikVar2) ? 2 : 4) | i;
        } else {
            bikVar2 = bikVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.C(false) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.B(blpVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != aycVarC.A(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != aycVarC.A(j2) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((i & 1572864) == 0) {
            i2 |= true != aycVarC.y(f) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != aycVarC.D(uiuVar2) ? 4194304 : 8388608;
        }
        if ((4793491 & i2) == 4793490 && aycVarC.G()) {
            aycVarC.r();
            aycVar2 = aycVarC;
        } else {
            aycVarC.s();
            if ((i & 1) != 0 && !aycVarC.E()) {
                aycVarC.r();
            }
            aycVarC.l();
            int i4 = i2 >> 6;
            aycVar2 = aycVarC;
            l(bikVar2, blpVar, j, j2, f, bdq.k(-1429068516, new ars(uiuVar, uiuVar2, 9), aycVarC), aycVar2, (i2 & 14) | 1572864 | (i4 & ScriptIntrinsicBLAS.TRANSPOSE) | (i4 & 896) | (i4 & 7168) | ((i2 >> 3) & ImageMetadata.JPEG_GPS_COORDINATES), 16);
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: atx
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bik bikVar3 = bikVar;
                    uiu uiuVar3 = uiuVar;
                    blp blpVar2 = blpVar;
                    long j3 = j;
                    long j4 = j2;
                    float f2 = f;
                    akg.q(bikVar3, uiuVar3, blpVar2, j3, j4, f2, uiuVar2, (ayc) obj, bay.j(i | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static final void r(final atr atrVar, bik bikVar, blp blpVar, long j, long j2, long j3, float f, ayc aycVar, final int i) {
        int i2;
        bik bikVar2;
        int i3;
        int i4;
        long jI;
        blp blpVar2;
        long j4;
        float f2;
        int i5;
        long j5;
        long j6;
        bfh bfhVarK;
        ayc aycVar2;
        final bik bikVar3;
        final long j7;
        final blp blpVar3;
        final long j8;
        final long j9;
        final float f3;
        ayc aycVarC = aycVar.c(258660814);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? aycVarC.B(atrVar) : aycVarC.D(atrVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 432;
        if ((i & 3072) == 0) {
            i6 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i6 |= 8192;
        }
        if ((196608 & i) == 0) {
            i6 |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i) == 0) {
            i6 |= ImageMetadata.LENS_APERTURE;
        }
        int i7 = i6 | 12582912;
        if ((4793491 & i7) == 4793490 && aycVarC.G()) {
            aycVarC.r();
            bikVar3 = bikVar;
            blpVar3 = blpVar;
            j8 = j;
            j9 = j2;
            j7 = j3;
            f3 = f;
            aycVar2 = aycVarC;
        } else {
            int i8 = (-4193281) & i7;
            aycVarC.s();
            if ((i & 1) == 0 || aycVarC.E()) {
                bikVar2 = bik.c;
                apu apuVar = e.m(aycVarC).a;
                long jG = e.l(aycVarC).g();
                long jL = bko.l(bko.k(bkv.d(jG), bkv.c(jG), bkv.b(jG), 0.8f, bkv.f(jG)), e.l(aycVarC).l());
                long jL2 = e.l(aycVarC).l();
                art artVarL = e.l(aycVarC);
                if (artVarL.m()) {
                    long jH = artVarL.h();
                    i3 = 12582912;
                    i4 = i7;
                    long jL3 = artVarL.l();
                    jI = bko.l(bko.k(bkv.d(jL3), bkv.c(jL3), bkv.b(jL3), 0.6f, bkv.f(jL3)), jH);
                } else {
                    i3 = 12582912;
                    i4 = i7;
                    jI = artVarL.i();
                }
                blpVar2 = apuVar;
                j4 = jL2;
                f2 = 6.0f;
                i5 = i4;
                j5 = jL;
            } else {
                aycVarC.r();
                bikVar2 = bikVar;
                blpVar2 = blpVar;
                j5 = j;
                j4 = j2;
                f2 = f;
                i3 = 12582912;
                i5 = i7;
                jI = j3;
            }
            aycVarC.l();
            String strA = atrVar.a();
            if (strA != null) {
                aycVarC.u(593508069);
                long j10 = jI;
                avn avnVar = new avn(j10, atrVar, strA, 1);
                j6 = j10;
                bfhVarK = bdq.k(1843479216, avnVar, aycVarC);
                ((ayg) aycVarC).Y();
            } else {
                j6 = jI;
                aycVarC.u(593806072);
                ((ayg) aycVarC).Y();
                bfhVarK = null;
            }
            aycVar2 = aycVarC;
            q(byi.aG(bikVar2, 12.0f), bfhVarK, blpVar2, j5, j4, f2, bdq.k(-261845785, new asu(atrVar, 3), aycVarC), aycVar2, (i5 & 896) | i3 | ((i8 >> 3) & 3670016));
            bikVar3 = bikVar2;
            j7 = j6;
            blpVar3 = blpVar2;
            j8 = j5;
            j9 = j4;
            f3 = f2;
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: atw
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    atr atrVar2 = atrVar;
                    bik bikVar4 = bikVar3;
                    blp blpVar4 = blpVar3;
                    long j11 = j8;
                    long j12 = j9;
                    long j13 = j7;
                    akg.r(atrVar2, bikVar4, blpVar4, j11, j12, j13, f3, (ayc) obj, bay.j(i | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static final float s(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final void t(bqo bqoVar, bpv bpvVar) {
        u(bqoVar, bpvVar, 0L);
    }

    public static final void u(bqo bqoVar, bpv bpvVar, long j) {
        if (y(bpvVar)) {
            bqoVar.d();
        }
        if (!A(bpvVar)) {
            List listA = bpvVar.a();
            int size = listA.size();
            for (int i = 0; i < size; i++) {
                bpi bpiVar = (bpi) listA.get(i);
                bqoVar.c(bpiVar.a, a.E(bpiVar.c, j));
            }
            bqoVar.c(bpvVar.b, a.E(bpvVar.k, j));
        }
        if (A(bpvVar) && bpvVar.b - bqoVar.a > 40) {
            bqoVar.d();
        }
        bqoVar.a = bpvVar.b;
    }

    public static final long w(bpv bpvVar) {
        return J(bpvVar, false);
    }

    public static final long x(bpv bpvVar) {
        return J(bpvVar, true);
    }

    public static final boolean y(bpv bpvVar) {
        return !bpvVar.h && bpvVar.d;
    }

    public static final boolean z(bpv bpvVar) {
        return (bpvVar.c() || !bpvVar.h || bpvVar.d) ? false : true;
    }
}
