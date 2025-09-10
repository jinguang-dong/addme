package defpackage;

import androidx.wear.ambient.AmbientLifecycleObserverKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class drc {
    public static final /* synthetic */ int a = 0;
    private static final ack b = new aci(0.0f, 0.0f, 0.3f, 1.0f);

    public static final float a(float f, Float f2, ajd ajdVar, boolean z) {
        return (f2 == null || z) ? f : ((f2.floatValue() >= 0.0f || ajdVar.d()) && (f2.floatValue() <= 0.0f || ajdVar.c())) ? f : ukc.m(f - (b.a(ukc.l(Math.abs(f2.floatValue()), 1.0f)) * 0.1f), 0.0f, 1.0f);
    }

    public static final aby b(bbo bboVar) {
        return (aby) bboVar.a();
    }

    public static final void c(bvo bvoVar, float f, float f2, float f3, long j, long j2, long j3, float f4, float f5) {
        if (f2 > f5) {
            byi.al(bvoVar, j, f + (f5 / 2.0f), Math.max(f2 - f5, 0.0f), j3, j2, new bmy(f4, 0.0f, 1, 0, 26), 0, 832);
            return;
        }
        float fA = AmbientLifecycleObserverKt.a(0.0f, f5, f2);
        float fX = chp.x(0.0f, f4 / 2.0f, fA);
        long jK = bko.k(bkv.d(j), bkv.c(j), bkv.b(j), bkv.a(j) * fA, bkv.f(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) + f3;
        double d = ((f + (f2 / 2.0f)) * 3.1415927f) / 180.0f;
        float fCos = ((float) Math.cos(d)) * f3;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) + f3;
        float fSin = ((float) Math.sin(d)) * f3;
        byi.am(bvoVar, jK, fX, (Float.floatToRawIntBits(fIntBitsToFloat2 + fSin) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat + fCos) << 32), null, 0, 120);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0263 A[PHI: r5 r6
      0x0263: PHI (r5v24 float) = (r5v22 float), (r5v25 float) binds: [B:131:0x0261, B:127:0x0257] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r6v21 long) = (r6v19 long), (r6v22 long) binds: [B:131:0x0261, B:127:0x0257] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final defpackage.dpj r29, final float r30, final float r31, final float r32, final defpackage.bik r33, final long r34, final long r36, boolean r38, final defpackage.aby r39, defpackage.ayc r40, final int r41) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drc.d(dpj, float, float, float, bik, long, long, boolean, aby, ayc, int):void");
    }

    public static final void e(dlh dlhVar, bik bikVar, dqt dqtVar, aby abyVar, ayc aycVar, int i) {
        int i2;
        ayc aycVar2;
        dqt dqtVarA;
        aby abyVar2;
        aby abyVar3;
        ayc aycVarC = aycVar.c(-2023145874);
        if ((i & 6) == 0) {
            i2 = (true != aycVarC.B(dlhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(bikVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 = i2 | 11264;
        }
        if (aycVarC.H((i3 & 9363) != 9362, i3 & 1)) {
            int i4 = (-58241) & i3;
            aycVarC.s();
            if ((i & 1) == 0 || aycVarC.E()) {
                aby abyVar4 = dqu.a;
                dqtVarA = dqu.a(aycVarC);
                abyVar3 = dqu.a;
            } else {
                aycVarC.r();
                dqtVarA = dqtVar;
                abyVar3 = abyVar;
            }
            aycVarC.l();
            afy afyVarB = aga.b(aycVarC);
            dpq dpqVar = null;
            if (afyVarB != null && (afyVarB instanceof dpq)) {
                dpqVar = (dpq) afyVarB;
            }
            dqi dqiVar = new dqi(dlhVar, dpqVar, ((Boolean) aycVarC.e(djh.a)).booleanValue());
            aby abyVar5 = dqu.a;
            aycVar2 = aycVarC;
            d(dqiVar, dqu.b, dqu.b(aycVarC), dqu.d, bikVar, dqtVarA.b, dqtVarA.a, false, abyVar3, aycVar2, ((i4 << 9) & 57344) | ((i4 << 12) & 29360128));
            abyVar2 = abyVar3;
        } else {
            aycVar2 = aycVarC;
            aycVar2.r();
            dqtVarA = dqtVar;
            abyVar2 = abyVar;
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new dms(dlhVar, bikVar, dqtVarA, abyVar2, i, 2);
        }
    }

    public static final void f(dme dmeVar, bik bikVar, dqt dqtVar, aby abyVar, ayc aycVar, int i) {
        int i2;
        ayc aycVar2;
        dqt dqtVarA;
        aby abyVar2;
        aby abyVar3;
        ayc aycVarC = aycVar.c(1134664703);
        if ((i & 6) == 0) {
            i2 = (true != aycVarC.B(dmeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(bikVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 = i2 | 11264;
        }
        if (aycVarC.H((i3 & 9363) != 9362, i3 & 1)) {
            int i4 = (-58241) & i3;
            aycVarC.s();
            if ((i & 1) == 0 || aycVarC.E()) {
                aby abyVar4 = dqu.a;
                dqtVarA = dqu.a(aycVarC);
                abyVar3 = dqu.a;
            } else {
                aycVarC.r();
                dqtVarA = dqtVar;
                abyVar3 = abyVar;
            }
            aycVarC.l();
            afy afyVarB = aga.b(aycVarC);
            dpq dpqVar = null;
            if (afyVarB != null && (afyVarB instanceof dpq)) {
                dpqVar = (dpq) afyVarB;
            }
            dru druVar = new dru(dmeVar, dpqVar, ((Boolean) aycVarC.e(djh.a)).booleanValue());
            aby abyVar5 = dqu.a;
            aycVar2 = aycVarC;
            d(druVar, dqu.b, dqu.b(aycVarC), dqu.d, bikVar, dqtVarA.b, dqtVarA.a, false, abyVar3, aycVar2, ((i4 << 9) & 57344) | ((i4 << 12) & 29360128));
            abyVar2 = abyVar3;
        } else {
            aycVar2 = aycVarC;
            aycVar2.r();
            dqtVarA = dqtVar;
            abyVar2 = abyVar;
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new dms(dmeVar, bikVar, dqtVarA, abyVar2, i, 3);
        }
    }

    private static final float g(float f, float f2) {
        float fAsin = (((float) Math.asin((f / 2.0f) / f2)) * 180.0f) / 3.1415927f;
        return fAsin + fAsin;
    }
}
