package defpackage;

import android.content.Context;
import com.google.android.material.button.xlT.JvFFEwFNdCrxf;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chp {
    public static final long A(double d) {
        return D(4294967296L, (float) d);
    }

    public static final long B(float f) {
        return D(4294967296L, f);
    }

    public static final long C(int i) {
        return D(4294967296L, i);
    }

    public static final long D(long j, float f) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long j2 = cid.a;
        return j | (jFloatToRawIntBits & 4294967295L);
    }

    public static final long E() {
        return D(8589934592L, 0.0f);
    }

    public static final void F() {
        D(8589934592L, 0.25f);
    }

    public static final long G(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final long H(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + chy.a(j2);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + chy.b(j2);
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static final long I(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static float J(chw chwVar, long j) {
        cig cigVarB;
        if (!a.q(cid.b(j), 4294967296L)) {
            chx.b("Only Sp can convert to Px");
        }
        int i = cih.a;
        if (cih.a(chwVar.b()) && (cigVarB = cih.b(chwVar.b())) != null) {
            return cigVarB.b(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        float fB = chwVar.b();
        return fIntBitsToFloat * fB;
    }

    public static long K(chw chwVar, float f) {
        int i = cih.a;
        if (!cih.a(chwVar.b())) {
            return B(f / chwVar.b());
        }
        cig cigVarB = cih.b(chwVar.b());
        return B(cigVarB != null ? cigVarB.a(f) : f / chwVar.b());
    }

    public static float L(chq chqVar, float f) {
        return f / chqVar.a();
    }

    public static float M(chq chqVar, int i) {
        return i / chqVar.a();
    }

    public static float N(chq chqVar, long j) {
        if (!a.q(cid.b(j), 4294967296L)) {
            chx.b("Only Sp can convert to Px");
        }
        return chqVar.dk(chqVar.dg(j));
    }

    public static float O(chq chqVar, float f) {
        return f * chqVar.a();
    }

    public static int P(chq chqVar, float f) {
        float fDk = chqVar.dk(f);
        if (Float.isInfinite(fDk)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fDk);
    }

    public static long Q(chq chqVar, long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fDk = chqVar.dk(Float.intBitsToFloat((int) (j >> 32)));
        float fDk2 = chqVar.dk(Float.intBitsToFloat((int) (j & 4294967295L)));
        return (Float.floatToRawIntBits(fDk) << 32) | (Float.floatToRawIntBits(fDk2) & 4294967295L);
    }

    public static long R(chq chqVar, float f) {
        return chqVar.dq(chqVar.dh(f));
    }

    public static final int a(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i >= 262143 ? 255 : 18;
    }

    public static final int b(long j, int i) {
        int iC = cho.c(j);
        if (i < iC) {
            i = iC;
        }
        int iA = cho.a(j);
        return i > iA ? iA : i;
    }

    public static final int c(long j, int i) {
        int iD = cho.d(j);
        if (i < iD) {
            i = iD;
        }
        int iB = cho.b(j);
        return i > iB ? iB : i;
    }

    public static final long d(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            chx.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return g(i, i2, i3, i4);
    }

    public static final long e(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iD = cho.d(j);
        if (i < iD) {
            i = iD;
        }
        int iB = cho.b(j);
        if (i > iB) {
            i = iB;
        }
        long j3 = i << 32;
        int iA = cho.a(j);
        int i2 = (int) (j2 & 4294967295L);
        int iC = cho.c(j);
        if (i2 < iC) {
            i2 = iC;
        }
        if (i2 <= iA) {
            iA = i2;
        }
        return iA | j3;
    }

    public static final long f(long j, long j2) {
        int iD = cho.d(j2);
        int iD2 = cho.d(j);
        if (iD < iD2) {
            iD = iD2;
        }
        int iB = cho.b(j);
        if (iD > iB) {
            iD = iB;
        }
        int iB2 = cho.b(j2);
        if (iB2 >= iD2) {
            iD2 = iB2;
        }
        if (iD2 <= iB) {
            iB = iD2;
        }
        int iC = cho.c(j2);
        int iC2 = cho.c(j);
        if (iC < iC2) {
            iC = iC2;
        }
        int iA = cho.a(j);
        if (iC > iA) {
            iC = iA;
        }
        int iA2 = cho.a(j2);
        if (iA2 >= iC2) {
            iC2 = iA2;
        }
        if (iC2 <= iA) {
            iA = iC2;
        }
        return d(iD, iB, iC, iA);
    }

    public static final long g(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iA = a(i5);
        int iA2 = a(i6);
        if (iA + iA2 > 31) {
            j(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iA2 - 13;
        return (((~(i7 >> 31)) & i7) << 33) | (i << 2) | ((i9 >> 1) + (i9 & 1)) | (i3 << (iA2 + 2)) | (((~(i8 >> 31)) & i8) << (iA2 + 33));
    }

    public static final long h(long j, int i, int i2) {
        int iB = cho.b(j);
        if (iB != Integer.MAX_VALUE && (iB = iB + i) < 0) {
            iB = 0;
        }
        int iC = cho.c(j) + i2;
        if (iC < 0) {
            iC = 0;
        }
        int iA = cho.a(j);
        if (iA != Integer.MAX_VALUE && (iA = iA + i2) < 0) {
            iA = 0;
        }
        int iD = cho.d(j) + i;
        return d(iD >= 0 ? iD : 0, iB, iC, iA);
    }

    public static final Void i(int i) {
        throw new IllegalArgumentException(a.bE(i, "Can't represent a size of ", " in Constraints"));
    }

    public static /* synthetic */ long k(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return d(0, i, 0, i2);
    }

    public static final long l(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    i(i6);
                    throw new uer();
                }
                i5 = 8190;
            }
        }
        return d(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static final long m(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    i(i6);
                    throw new uer();
                }
                i5 = 8190;
            }
        }
        return d(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    public static final chq n(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        int i = cih.a;
        cig cigVarB = cih.b(f);
        if (cigVarB == null) {
            cigVarB = new cic(f);
        }
        return new chs(f2, f, cigVarB);
    }

    public static final chg o(long j) {
        return j != 16 ? new cgx(j) : chf.a;
    }

    public static chg p(chg chgVar, chg chgVar2) {
        boolean z = chgVar2 instanceof cgw;
        if (!z || !(chgVar instanceof cgw)) {
            return (!z || (chgVar instanceof cgw)) ? (z || !(chgVar instanceof cgw)) ? chgVar2.d(new apa(chgVar, 9)) : chgVar : chgVar2;
        }
        throw null;
    }

    public static chg q(chg chgVar, uif uifVar) {
        return !a.ao(chgVar, chf.a) ? chgVar : (chg) uifVar.a();
    }

    public static final int r(int i) {
        return i & 255;
    }

    public static final int s(int i) {
        return (i >> 8) & 255;
    }

    public static final int t(int i) {
        return i >> 16;
    }

    public static final boolean u(cdh cdhVar) {
        return (cdhVar.f == null && cdhVar.d == null && cdhVar.c == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0738 A[PHI: r9
      0x0738: PHI (r9v22 cji) = (r9v21 cji), (r9v27 cji) binds: [B:415:0x072c, B:418:0x0736] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void v(defpackage.cjo r40, defpackage.cjf r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instructions count: 1898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chp.v(cjo, cjf, java.util.ArrayList, int):void");
    }

    public static final float w(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final float x(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    public static final int y(int i, int i2, float f) {
        return i + ((int) Math.round((i2 - i) * f));
    }

    public static final float z(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float fD;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            fD = fArr2[iBinarySearch];
        } else {
            int i = -(iBinarySearch + 1);
            int i2 = i - 1;
            int length = fArr.length - 1;
            float f5 = 0.0f;
            if (i2 >= length) {
                float f6 = fArr[length];
                float f7 = fArr2[length];
                if (f6 == 0.0f) {
                    return 0.0f;
                }
                return f * (f7 / f6);
            }
            if (i2 == -1) {
                f2 = fArr[0];
                f3 = fArr2[0];
                f4 = 0.0f;
            } else {
                float f8 = fArr[i2];
                f2 = fArr[i];
                f5 = fArr2[i2];
                f3 = fArr2[i];
                f4 = f8;
            }
            fD = cij.d(f5, f3, f4, f2, fAbs);
        }
        return fSignum * fD;
    }

    public static final void j(int i, int i2) {
        throw new IllegalArgumentException(a.bD(i2, i, "Can't represent a width of ", JvFFEwFNdCrxf.QAlTqaYfQqjR, " in Constraints"));
    }
}
