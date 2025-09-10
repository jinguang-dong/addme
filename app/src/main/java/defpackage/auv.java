package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auv {
    private static final ayp a = new ayz(bap.c, new agx(10));

    public static final void a(cdo cdoVar, uiu uiuVar, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-13499697);
        if (i3 == 0) {
            i2 = (true != aycVarC.B(cdoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && aycVarC.G()) {
            aycVarC.r();
        } else {
            ayp aypVar = a;
            bay.K(aypVar.b(((cdo) aycVarC.e(aypVar)).k(cdoVar)), uiuVar, aycVarC, (i2 & ScriptIntrinsicBLAS.TRANSPOSE) | 8);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aqb(cdoVar, uiuVar, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r37, defpackage.bik r38, long r39, long r41, long r43, long r45, int r47, boolean r48, int r49, int r50, defpackage.uiq r51, defpackage.cdo r52, defpackage.ayc r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auv.b(java.lang.String, bik, long, long, long, long, int, boolean, int, int, uiq, cdo, ayc, int, int, int):void");
    }

    @ueo
    public static final /* synthetic */ void c(bik bikVar, long j, long j2, long j3, long j4, int i, boolean z, int i2, uiq uiqVar, cdo cdoVar, ayc aycVar, final int i3, final int i4) {
        int i5;
        long j5;
        long j6;
        boolean z2;
        int i6;
        uiq uiqVar2;
        cdo cdoVar2;
        int i7;
        int i8;
        bik bikVar2;
        long j7;
        long j8;
        ayc aycVar2;
        final bik bikVar3;
        final long j9;
        final long j10;
        final long j11;
        final long j12;
        final int i9;
        final boolean z3;
        final int i10;
        final uiq uiqVar3;
        final cdo cdoVar3;
        ayc aycVarC = aycVar.c(-366126944);
        if ((i3 & 6) == 0) {
            i5 = i3 | (true != aycVarC.B("Next") ? 2 : 4);
        } else {
            i5 = i3;
        }
        int i11 = i4 | 28086;
        if ((196608 & i4) == 0) {
            i11 = 93622 | i4;
        }
        int i12 = i5 | 920350128;
        if ((306783379 & i12) == 306783378 && (74899 & i11) == 74898 && aycVarC.G()) {
            aycVarC.r();
            j9 = j;
            j10 = j2;
            j11 = j3;
            j12 = j4;
            i9 = i;
            z3 = z;
            i10 = i2;
            uiqVar3 = uiqVar;
            cdoVar3 = cdoVar;
            aycVar2 = aycVarC;
            bikVar3 = bikVar;
        } else {
            int i13 = (-458753) & i11;
            aycVarC.s();
            if ((i3 & 1) == 0 || aycVarC.E()) {
                bih bihVar = bik.c;
                j5 = bkv.f;
                j6 = cid.a;
                ayg aygVar = (ayg) aycVarC;
                Object objR = aygVar.R();
                if (objR == ayb.a) {
                    objR = new add(19);
                    aygVar.ac(objR);
                }
                z2 = true;
                i6 = i13;
                uiqVar2 = (uiq) objR;
                cdoVar2 = (cdo) aycVarC.e(a);
                i7 = Integer.MAX_VALUE;
                i8 = 1;
                bikVar2 = bihVar;
                j7 = j6;
                j8 = j7;
            } else {
                aycVarC.r();
                bikVar2 = bikVar;
                j5 = j;
                j6 = j3;
                j8 = j4;
                i8 = i;
                z2 = z;
                i7 = i2;
                uiqVar2 = uiqVar;
                cdoVar2 = cdoVar;
                i6 = i13;
                j7 = j2;
            }
            aycVarC.l();
            int i14 = (i11 & 14) | 24576 | (i11 & ScriptIntrinsicBLAS.TRANSPOSE) | (i11 & 896) | (i11 & 7168) | ((i6 << 3) & ImageMetadata.JPEG_GPS_COORDINATES);
            int i15 = i12 & 2147483646;
            long j13 = j5;
            long j14 = j6;
            long j15 = j8;
            boolean z4 = z2;
            int i16 = i8;
            int i17 = i7;
            uiq uiqVar4 = uiqVar2;
            cdo cdoVar4 = cdoVar2;
            aycVar2 = aycVarC;
            b("Next", bikVar2, j13, j7, j14, j15, i16, z4, i17, 1, uiqVar4, cdoVar4, aycVar2, i15, i14, 0);
            bikVar3 = bikVar2;
            j9 = j13;
            j10 = j7;
            j11 = j14;
            j12 = j15;
            i9 = i16;
            z3 = z4;
            i10 = i17;
            uiqVar3 = uiqVar4;
            cdoVar3 = cdoVar4;
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: aut
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bik bikVar4 = bikVar3;
                    long j16 = j9;
                    long j17 = j10;
                    long j18 = j11;
                    long j19 = j12;
                    int i18 = i9;
                    boolean z5 = z3;
                    int i19 = i10;
                    uiq uiqVar5 = uiqVar3;
                    int i20 = i3;
                    auv.c(bikVar4, j16, j17, j18, j19, i18, z5, i19, uiqVar5, cdoVar3, (ayc) obj, bay.j(i20 | 1), bay.j(i4));
                    return ufg.a;
                }
            };
        }
    }
}
