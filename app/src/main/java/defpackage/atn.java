package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atn {
    public static final ayp a = new bbp(new agx(8));

    public static final void a(final int i, final uiu uiuVar, final uiv uivVar, final uiu uiuVar2, final uiu uiuVar3, final ami amiVar, final uiu uiuVar4, ayc aycVar, final int i2) {
        int i3;
        uiv uivVar2;
        final uiu uiuVar5;
        uiu uiuVar6;
        ami amiVar2;
        ayc aycVarC = aycVar.c(675142332);
        if ((i2 & 6) == 0) {
            i3 = (true != aycVarC.C(false) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != aycVarC.z(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != aycVarC.D(uiuVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            uivVar2 = uivVar;
            i3 |= true != aycVarC.D(uivVar2) ? 1024 : 2048;
        } else {
            uivVar2 = uivVar;
        }
        if ((i2 & 24576) == 0) {
            uiuVar5 = uiuVar2;
            i3 |= true != aycVarC.D(uiuVar5) ? 8192 : 16384;
        } else {
            uiuVar5 = uiuVar2;
        }
        if ((196608 & i2) == 0) {
            uiuVar6 = uiuVar3;
            i3 |= true != aycVarC.D(uiuVar6) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        } else {
            uiuVar6 = uiuVar3;
        }
        if ((1572864 & i2) == 0) {
            amiVar2 = amiVar;
            i3 |= true != aycVarC.B(amiVar2) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        } else {
            amiVar2 = amiVar;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != aycVarC.D(uiuVar4) ? 4194304 : 8388608;
        }
        if ((4793491 & i3) == 4793490 && aycVarC.G()) {
            aycVarC.r();
        } else {
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            Object obj = ayb.a;
            if (objR == obj) {
                objR = new atm();
                aygVar.ac(objR);
            }
            boolean z = (i3 & 896) == 256;
            boolean z2 = (57344 & i3) == 16384;
            boolean z3 = (3670016 & i3) == 1048576;
            boolean z4 = (458752 & i3) == 131072;
            boolean z5 = (i3 & ScriptIntrinsicBLAS.TRANSPOSE) == 32;
            boolean z6 = (i3 & 14) == 4;
            boolean z7 = (29360128 & i3) == 8388608;
            boolean z8 = (i3 & 7168) == 2048;
            final atm atmVar = (atm) objR;
            Object objR2 = aygVar.R();
            if ((z8 | z7 | z | z2 | z3 | z4 | z5 | z6) || objR2 == obj) {
                final uiv uivVar3 = uivVar2;
                final uiu uiuVar7 = uiuVar6;
                final ami amiVar3 = amiVar2;
                uiu uiuVar8 = new uiu() { // from class: atg
                    /* JADX WARN: Removed duplicated region for block: B:107:0x0231  */
                    @Override // defpackage.uiu
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object a(java.lang.Object r26, java.lang.Object r27) {
                        /*
                            Method dump skipped, instructions count: 924
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.atg.a(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                aygVar.ac(uiuVar8);
                objR2 = uiuVar8;
            }
            btq.a(null, (uiu) objR2, aycVarC, 0, 1);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: ath
                @Override // defpackage.uiu
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i4 = i;
                    uiu uiuVar9 = uiuVar;
                    uiv uivVar4 = uivVar;
                    uiu uiuVar10 = uiuVar2;
                    uiu uiuVar11 = uiuVar3;
                    ami amiVar4 = amiVar;
                    atn.a(i4, uiuVar9, uivVar4, uiuVar10, uiuVar11, amiVar4, uiuVar4, (ayc) obj2, bay.j(i2 | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static final void b(final ami amiVar, bik bikVar, final ejs ejsVar, final uiu uiuVar, final uiu uiuVar2, final uiv uivVar, final uiu uiuVar3, final int i, final boolean z, final blp blpVar, final float f, final long j, final long j2, final long j3, final long j4, final long j5, final uiv uivVar2, ayc aycVar, final int i2, final int i3) {
        int i4;
        uiu uiuVar4;
        int i5;
        uiv uivVar3;
        int i6;
        uiu uiuVar5;
        int i7;
        int i8;
        int i9;
        int i10;
        ayc aycVar2;
        final bik bikVar2;
        int i11 = i2 & 6;
        ayc aycVarC = aycVar.c(50073903);
        if (i11 == 0) {
            i4 = (true != aycVarC.B(amiVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != aycVarC.B(bikVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != aycVarC.B(ejsVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            uiuVar4 = uiuVar;
            i4 |= true != aycVarC.D(uiuVar4) ? 1024 : 2048;
        } else {
            uiuVar4 = uiuVar;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != aycVarC.D(uiuVar2) ? 8192 : 16384;
        }
        int i12 = i2 & ImageMetadata.EDGE_MODE;
        int i13 = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        if (i12 == 0) {
            i5 = 196608;
            uivVar3 = uivVar;
            i4 |= true != aycVarC.D(uivVar3) ? 65536 : 131072;
        } else {
            i5 = 196608;
            uivVar3 = uivVar;
        }
        if ((i2 & 1572864) == 0) {
            i6 = 1572864;
            uiuVar5 = uiuVar3;
            i4 |= true != aycVarC.D(uiuVar5) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        } else {
            i6 = 1572864;
            uiuVar5 = uiuVar3;
        }
        if ((i2 & 12582912) == 0) {
            i7 = 12582912;
            i8 = i;
            i4 |= true != aycVarC.z(i8) ? 4194304 : 8388608;
        } else {
            i7 = 12582912;
            i8 = i;
        }
        if ((i2 & 100663296) == 0) {
            i9 = 100663296;
            i4 |= true != aycVarC.C(false) ? 33554432 : 67108864;
        } else {
            i9 = 100663296;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != aycVarC.D(null) ? 268435456 : 536870912;
        }
        int i14 = i4;
        if ((i3 & 6) == 0) {
            i10 = (true != aycVarC.C(z) ? 2 : 4) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= true != aycVarC.B(blpVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i10 |= true != aycVarC.y(f) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i10 |= true != aycVarC.A(j) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i10 |= true == aycVarC.A(j2) ? 16384 : 8192;
        }
        if ((i3 & i5) == 0) {
            if (true == aycVarC.A(j3)) {
                i13 = 131072;
            }
            i10 |= i13;
        }
        if ((i3 & i6) == 0) {
            i10 |= true != aycVarC.A(j4) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        if ((i3 & i7) == 0) {
            i10 |= true != aycVarC.A(j5) ? 4194304 : 8388608;
        }
        if ((i3 & i9) == 0) {
            i10 |= true != aycVarC.D(uivVar2) ? 33554432 : 67108864;
        }
        if ((i14 & 306783379) == 306783378 && (38347923 & i10) == 38347922 && aycVarC.G()) {
            aycVarC.r();
            bikVar2 = bikVar;
            aycVar2 = aycVarC;
        } else {
            aycVarC.s();
            if ((i2 & 1) != 0 && !aycVarC.E()) {
                aycVarC.r();
            }
            aycVarC.l();
            int i15 = i14 & 14;
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (i15 == 4 || objR == ayb.a) {
                objR = new asz(amiVar);
                aygVar.ac(objR);
            }
            aycVar2 = aycVarC;
            bfh bfhVarK = bdq.k(-1236753028, new atl((asz) objR, amiVar, j4, j5, i8, uiuVar4, uivVar2, uiuVar5, uiuVar2, uivVar3, ejsVar), aycVar2);
            aycVar2.u(1400747316);
            bikVar2 = bikVar;
            bfhVarK.a(bikVar2, aycVar2, Integer.valueOf(((i14 >> 3) & 14) | 48));
            aygVar.Y();
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: atf
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ami amiVar2 = amiVar;
                    bik bikVar3 = bikVar2;
                    ejs ejsVar2 = ejsVar;
                    uiu uiuVar6 = uiuVar;
                    uiu uiuVar7 = uiuVar2;
                    uiv uivVar4 = uivVar;
                    uiu uiuVar8 = uiuVar3;
                    int i16 = i;
                    boolean z2 = z;
                    blp blpVar2 = blpVar;
                    float f2 = f;
                    long j6 = j;
                    long j7 = j2;
                    long j8 = j3;
                    long j9 = j4;
                    long j10 = j5;
                    int i17 = i2;
                    atn.b(amiVar2, bikVar3, ejsVar2, uiuVar6, uiuVar7, uivVar4, uiuVar8, i16, z2, blpVar2, f2, j6, j7, j8, j9, j10, uivVar2, (ayc) obj, bay.j(i17 | 1), bay.j(i3));
                    return ufg.a;
                }
            };
        }
    }

    public static final void c(bik bikVar, ejs ejsVar, uiu uiuVar, uiu uiuVar2, uiv uivVar, final uiu uiuVar3, int i, boolean z, blp blpVar, float f, long j, long j2, long j3, long j4, long j5, final uiv uivVar2, ayc aycVar, final int i2, final int i3) {
        uiu uiuVar4;
        bik bikVar2;
        uiu uiuVar5;
        uiv uivVar3;
        blp blpVar2;
        float f2;
        long jL;
        long jA;
        int i4;
        ayc aycVar2;
        ejs ejsVar2;
        long j6;
        boolean z2;
        uiu uiuVar6;
        long j7;
        int i5;
        long j8;
        final bik bikVar3;
        final ejs ejsVar3;
        final uiu uiuVar7;
        final uiu uiuVar8;
        final uiv uivVar4;
        final int i6;
        final boolean z3;
        final blp blpVar3;
        final float f3;
        final long j9;
        final long j10;
        final long j11;
        final long j12;
        final long j13;
        int i7 = i2 | 6;
        ayc aycVarC = aycVar.c(1135600301);
        if ((i2 & 48) == 0) {
            i7 = i2 | 22;
        }
        int i8 = i7 | 28032;
        if ((i2 & ImageMetadata.EDGE_MODE) == 0) {
            uiuVar4 = uiuVar3;
            i8 |= true != aycVarC.D(uiuVar4) ? 65536 : 131072;
        } else {
            uiuVar4 = uiuVar3;
        }
        int i9 = (i3 & 6) == 0 ? i3 | 2 : i3;
        int i10 = i9 | 48;
        if ((i3 & 384) == 0) {
            i10 = i9 | 176;
        }
        if ((i3 & 3072) == 0) {
            i10 |= 1024;
        }
        if ((i3 & 24576) == 0) {
            i10 |= 8192;
        }
        if ((196608 & i3) == 0) {
            i10 |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i3) == 0) {
            i10 |= ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i3) == 0) {
            i10 |= true != aycVarC.D(uivVar2) ? 4194304 : 8388608;
        }
        int i11 = i8 | 920125440;
        if ((306783379 & i11) == 306783378 && (4793491 & i10) == 4793490 && aycVarC.G()) {
            aycVarC.r();
            bikVar3 = bikVar;
            uiuVar7 = uiuVar;
            uiuVar8 = uiuVar2;
            uivVar4 = uivVar;
            i6 = i;
            z3 = z;
            blpVar3 = blpVar;
            f3 = f;
            j9 = j;
            j10 = j2;
            j11 = j3;
            j12 = j4;
            j13 = j5;
            aycVar2 = aycVarC;
            ejsVar3 = ejsVar;
        } else {
            int i12 = (-4194191) & i10;
            int i13 = i11 & (-113);
            aycVarC.s();
            if ((i2 & 1) == 0 || aycVarC.E()) {
                bikVar2 = bik.c;
                ask askVar = ask.a;
                int i14 = asi.a;
                ayg aygVar = (ayg) aycVarC;
                Object objR = aygVar.R();
                Object obj = ayb.a;
                if (objR == obj) {
                    objR = new add(16);
                    aygVar.ac(objR);
                }
                uiq uiqVar = (uiq) objR;
                Object[] objArr = new Object[0];
                bgb bgbVar = new bgb(new aud(1), new asj(uiqVar, 2));
                boolean zB = aycVarC.B(uiqVar);
                Object objR2 = aygVar.R();
                if (zB || objR2 == obj) {
                    objR2 = new aet(askVar, uiqVar, 4);
                    aygVar.ac(objR2);
                }
                Object objR3 = aygVar.R();
                if (objR3 == obj) {
                    objR3 = new ejs((short[]) null);
                    aygVar.ac(objR3);
                }
                ejs ejsVar4 = (ejs) objR3;
                Object objR4 = aygVar.R();
                if (objR4 == obj) {
                    objR4 = new ejs(ejsVar4, (byte[]) null);
                    aygVar.ac(objR4);
                }
                uiu uiuVar9 = arw.a;
                uiuVar5 = arw.b;
                uivVar3 = arw.c;
                blpVar2 = e.m(aycVarC).b;
                float f4 = ash.a;
                f2 = ash.a;
                jL = e.l(aycVarC).l();
                jA = aru.a(jL, aycVarC);
                long jG = e.l(aycVarC).g();
                long jK = bko.k(bkv.d(jG), bkv.c(jG), bkv.b(jG), 0.32f, bkv.f(jG));
                long jA2 = e.l(aycVarC).a();
                long jA3 = aru.a(jA2, aycVarC);
                i4 = i13;
                aycVar2 = aycVarC;
                ejsVar2 = (ejs) objR4;
                j6 = jA3;
                z2 = true;
                uiuVar6 = uiuVar9;
                j7 = jA2;
                i11 = i11;
                i5 = 2;
                j8 = jK;
            } else {
                aycVarC.r();
                bikVar2 = bikVar;
                uiuVar6 = uiuVar;
                uiuVar5 = uiuVar2;
                uivVar3 = uivVar;
                i5 = i;
                z2 = z;
                blpVar2 = blpVar;
                f2 = f;
                jL = j;
                jA = j2;
                j8 = j3;
                j7 = j4;
                j6 = j5;
                aycVar2 = aycVarC;
                i4 = i13;
                ejsVar2 = ejsVar;
            }
            aycVar2.l();
            int i15 = i12 << 3;
            int i16 = i5;
            int i17 = (i15 & 896) | ((i11 >> 27) & 14) | (234881024 & i15);
            bik bikVar4 = bikVar2;
            uiu uiuVar10 = uiuVar5;
            uiv uivVar5 = uivVar3;
            b(new all(), bikVar4, ejsVar2, uiuVar6, uiuVar10, uivVar5, uiuVar4, i16, z2, blpVar2, f2, jL, jA, j8, j7, j6, uivVar2, aycVar2, (i4 << 3) & 2147482736, i17);
            bikVar3 = bikVar4;
            ejsVar3 = ejsVar2;
            uiuVar7 = uiuVar6;
            uiuVar8 = uiuVar10;
            uivVar4 = uivVar5;
            i6 = i16;
            z3 = z2;
            blpVar3 = blpVar2;
            f3 = f2;
            j9 = jL;
            j10 = jA;
            j11 = j8;
            j12 = j7;
            j13 = j6;
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: ati
                @Override // defpackage.uiu
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    bik bikVar5 = bikVar3;
                    ejs ejsVar5 = ejsVar3;
                    uiu uiuVar11 = uiuVar7;
                    uiu uiuVar12 = uiuVar8;
                    uiv uivVar6 = uivVar4;
                    uiu uiuVar13 = uiuVar3;
                    int i18 = i6;
                    boolean z4 = z3;
                    blp blpVar4 = blpVar3;
                    float f5 = f3;
                    long j14 = j9;
                    long j15 = j10;
                    long j16 = j11;
                    long j17 = j12;
                    long j18 = j13;
                    int i19 = i2;
                    atn.c(bikVar5, ejsVar5, uiuVar11, uiuVar12, uivVar6, uiuVar13, i18, z4, blpVar4, f5, j14, j15, j16, j17, j18, uivVar2, (ayc) obj2, bay.j(i19 | 1), bay.j(i3));
                    return ufg.a;
                }
            };
        }
    }
}
