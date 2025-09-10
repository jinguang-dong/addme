package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Matrix;
import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.graphics.GraphicsLayerElement;
import androidx.compose.ui.layout.OnGloballyPositionedElement;
import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bko {
    /* JADX WARN: Multi-variable type inference failed */
    public static final bve A(bij bijVar) {
        if ((bijVar.n & 2) == 0) {
            return null;
        }
        if (bijVar instanceof bve) {
            return (bve) bijVar;
        }
        if (!(bijVar instanceof bup)) {
            return null;
        }
        bij bijVar2 = ((bup) bijVar).y;
        while (bijVar2 != 0) {
            if (bijVar2 instanceof bve) {
                return (bve) bijVar2;
            }
            bijVar2 = (!(bijVar2 instanceof bup) || (bijVar2.n & 2) == 0) ? bijVar2.q : ((bup) bijVar2).y;
        }
        return null;
    }

    public static final bvm B(buo buoVar) {
        bwi bwiVar = buoVar.B().s;
        if (bwiVar != null) {
            return bwiVar.s;
        }
        bqs.a("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new uer();
    }

    public static final bwi C(buo buoVar, int i) {
        bwi bwiVar = buoVar.B().s;
        bwiVar.getClass();
        if (bwiVar.x() != buoVar || !bwj.h(i)) {
            return bwiVar;
        }
        bwi bwiVar2 = bwiVar.v;
        bwiVar2.getClass();
        return bwiVar2;
    }

    public static final bws D(buo buoVar) {
        bws bwsVar = B(buoVar).i;
        if (bwsVar != null) {
            return bwsVar;
        }
        bqs.a("This node does not have an owner.");
        throw new uer();
    }

    public static final chq E(buo buoVar) {
        return B(buoVar).o;
    }

    public static final cib F(buo buoVar) {
        return B(buoVar).p;
    }

    public static final /* synthetic */ void G(bdp bdpVar, bij bijVar) {
        bdp bdpVarI = B(bijVar).i();
        int i = bdpVarI.b - 1;
        Object[] objArr = bdpVarI.a;
        if (i < objArr.length) {
            while (i >= 0) {
                bdpVar.n(((bvm) objArr[i]).s.f);
                i--;
            }
        }
    }

    public static final Object H(bun bunVar, ayp aypVar) {
        if (!bunVar.B().w) {
            bqs.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return B(bunVar).y.h(aypVar);
    }

    public static final long I(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static final bik J(bik bikVar, uiq uiqVar) {
        return bikVar.cM(new OnGloballyPositionedElement(uiqVar));
    }

    public static bss K(bst bstVar, int i, int i2, Map map, uiq uiqVar) {
        return bstVar.du(i, i2, map, uiqVar);
    }

    public static final void a(String str) {
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }

    public static final int b(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return Float.isNaN(f2) ? 0 : 1;
    }

    public static final bik c(bik bikVar, uiq uiqVar) {
        return bikVar.cM(new BlockGraphicsLayerElement(uiqVar));
    }

    public static /* synthetic */ bik d(bik bikVar, float f, float f2, float f3, float f4, blp blpVar, int i) {
        long j = (i & 1024) != 0 ? blt.a : 0L;
        blp blpVar2 = (i & 2048) != 0 ? bll.a : blpVar;
        int i2 = i & 32;
        int i3 = i & 4;
        int i4 = i & 2;
        int i5 = i & 1;
        float f5 = (i & 512) != 0 ? 8.0f : 0.0f;
        float f6 = i2 != 0 ? 0.0f : f4;
        float f7 = i3 != 0 ? 1.0f : f3;
        float f8 = i4 != 0 ? 1.0f : f2;
        float f9 = 1 == i5 ? 1.0f : f;
        long j2 = bla.a;
        return e(bikVar, f9, f8, f7, f6, 0.0f, f5, j, blpVar2, false, j2, j2);
    }

    public static final bik e(bik bikVar, float f, float f2, float f3, float f4, float f5, float f6, long j, blp blpVar, boolean z, long j2, long j3) {
        return bikVar.cM(new GraphicsLayerElement(f, f2, f3, f4, f5, f6, j, blpVar, z, j2, j3));
    }

    public static /* synthetic */ bik f(bik bikVar, float f, float f2, blp blpVar, boolean z, int i) {
        long j = (i & 1024) != 0 ? blt.a : 0L;
        blp blpVar2 = (i & 2048) != 0 ? bll.a : blpVar;
        int i2 = i & 256;
        int i3 = i & 4;
        int i4 = i & 2;
        int i5 = i & 1;
        float f3 = (i & 512) != 0 ? 8.0f : 0.0f;
        float f4 = i2 != 0 ? 0.0f : f2;
        float f5 = i3 != 0 ? 1.0f : f;
        float f6 = i4 != 0 ? 1.0f : 0.0f;
        float f7 = 1 == i5 ? 1.0f : 0.0f;
        boolean z2 = ((i & 4096) == 0) & z;
        long j2 = bla.a;
        return e(bikVar, f7, f6, f5, 0.0f, f4, f3, j, blpVar2, z2, j2, j2);
    }

    public static final float g(long j) {
        blz blzVarF = bkv.f(j);
        long j2 = blzVarF.b;
        if (!a.q(j2, 12884901888L)) {
            String strA = bly.a(j2);
            Objects.toString(strA);
            blb.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(strA));
        }
        blzVarF.getClass();
        bmg bmgVar = ((bmn) blzVarF).p;
        float fA = (float) ((bmgVar.a(bkv.d(j)) * 0.2126d) + (bmgVar.a(bkv.c(j)) * 0.7152d) + (bmgVar.a(bkv.b(j)) * 0.0722d));
        if (fA < 0.0f) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            return 1.0f;
        }
        return fA;
    }

    public static final int h(long j) {
        float[] fArr = bmb.a;
        return (int) (bkv.e(j, bmb.e) >>> 32);
    }

    public static final long i(int i) {
        long j = bkv.a;
        return i << 32;
    }

    public static final long j(long j) {
        long j2 = bkv.a;
        return j << 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long k(float r20, float r21, float r22, float r23, defpackage.blz r24) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bko.k(float, float, float, float, blz):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long l(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bko.l(long, long):long");
    }

    public static final void n(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    public static final Bitmap o(bkl bklVar) {
        if (bklVar instanceof bkl) {
            return bklVar.a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final BlendMode p(int i) {
        return a.p(i, 0) ? BlendMode.CLEAR : a.p(i, 1) ? BlendMode.SRC : a.p(i, 2) ? BlendMode.DST : a.p(i, 3) ? BlendMode.SRC_OVER : a.p(i, 4) ? BlendMode.DST_OVER : a.p(i, 5) ? BlendMode.SRC_IN : a.p(i, 6) ? BlendMode.DST_IN : a.p(i, 7) ? BlendMode.SRC_OUT : a.p(i, 8) ? BlendMode.DST_OUT : a.p(i, 9) ? BlendMode.SRC_ATOP : a.p(i, 10) ? BlendMode.DST_ATOP : a.p(i, 11) ? BlendMode.XOR : a.p(i, 12) ? BlendMode.PLUS : a.p(i, 13) ? BlendMode.MODULATE : a.p(i, 14) ? BlendMode.SCREEN : a.p(i, 15) ? BlendMode.OVERLAY : a.p(i, 16) ? BlendMode.DARKEN : a.p(i, 17) ? BlendMode.LIGHTEN : a.p(i, 18) ? BlendMode.COLOR_DODGE : a.p(i, 19) ? BlendMode.COLOR_BURN : a.p(i, 20) ? BlendMode.HARD_LIGHT : a.p(i, 21) ? BlendMode.SOFT_LIGHT : a.p(i, 22) ? BlendMode.DIFFERENCE : a.p(i, 23) ? BlendMode.EXCLUSION : a.p(i, 24) ? BlendMode.MULTIPLY : a.p(i, 25) ? BlendMode.HUE : a.p(i, 26) ? BlendMode.SATURATION : a.p(i, 27) ? BlendMode.COLOR : a.p(i, 28) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final long q(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final bkg r(long j) {
        return bdq.t(0L, j);
    }

    public static /* synthetic */ String s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "Idle" : "LookaheadLayingOut" : INRGuObcrHjSQz.MYofgp : "LookaheadMeasuring" : "Measuring";
    }

    public static final void t(bve bveVar) {
        C(bveVar, 2).ac();
    }

    public static final void u(bve bveVar) {
        B(bveVar).G();
    }

    public static final void v(bve bveVar) {
        B(bveVar).S(false);
    }

    public static final void w(bve bveVar) {
        B(bveVar).B();
    }

    public static final void x(buu buuVar) {
        if (buuVar.B().w) {
            C(buuVar, 1).ac();
        }
    }

    public static final bij y(bdp bdpVar) {
        int i;
        if (bdpVar == null || (i = bdpVar.b) == 0) {
            return null;
        }
        return (bij) bdpVar.c(i - 1);
    }

    public static final bry z(buo buoVar) {
        if (!buoVar.B().w) {
            bqs.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        bwi bwiVarC = C(buoVar, 2);
        if (!bwiVarC.dm()) {
            bqs.c("LayoutCoordinates is not attached.");
        }
        return bwiVarC;
    }
}
