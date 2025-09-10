package defpackage;

import android.widget.EdgeEffect;
import androidx.compose.ui.draw.DrawBehindElement;
import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import com.google.ar.core.ImageMetadata;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acv {
    public static final boolean A(bkb bkbVar) {
        bvm bvmVar;
        bwi bwiVar;
        bvm bvmVar2;
        bwi bwiVar2 = bkbVar.s;
        return (bwiVar2 == null || (bvmVar = bwiVar2.s) == null || !bvmVar.ah() || (bwiVar = bkbVar.s) == null || (bvmVar2 = bwiVar.s) == null || !bvmVar2.ag()) ? false : true;
    }

    public static final boolean B(bkb bkbVar, boolean z) {
        int iOrdinal = bkbVar.c().ordinal();
        if (iOrdinal == 0) {
            ((bxv) bko.D(bkbVar)).D.e(null);
            bkbVar.l(bka.a, bka.d);
            return true;
        }
        if (iOrdinal == 1) {
            bkb bkbVarY = y(bkbVar);
            if (bkbVarY != null && !B(bkbVarY, z)) {
                return false;
            }
            bkbVar.l(bka.b, bka.d);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            throw new uet();
        }
        if (!z) {
            return z;
        }
        ((bxv) bko.D(bkbVar)).D.e(null);
        bkbVar.l(bka.c, bka.d);
        return true;
    }

    public static final int C(bkb bkbVar, int i) {
        int iOrdinal = bkbVar.c().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                int iC = C(S(bkbVar), i);
                if (iC == 1) {
                    iC = 0;
                }
                if (iC != 0) {
                    return iC;
                }
                if (bkbVar.a) {
                    return 1;
                }
                bkbVar.a = true;
                try {
                    bjv bjvVarO = bkbVar.o();
                    kk kkVar = new kk(null);
                    E(bkbVar);
                    bju bjuVar = ((bxv) bko.D(bkbVar)).D;
                    bkb bkbVar2 = bjuVar.f;
                    bjvVarO.k.a(kkVar);
                    bkb bkbVar3 = bjuVar.f;
                    if (bkbVar2 == bkbVar3 || bkbVar3 == null) {
                        return 1;
                    }
                    return bjw.c == bjw.b ? 2 : 3;
                } finally {
                    bkbVar.a = false;
                }
            }
            if (iOrdinal == 2) {
                return 2;
            }
            if (iOrdinal != 3) {
                throw new uet();
            }
        }
        return 1;
    }

    public static final int D(bkb bkbVar, int i) {
        bij bijVar;
        bwe bweVar;
        int iOrdinal = bkbVar.c().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return C(S(bkbVar), i);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new uet();
                }
                if (!bkbVar.m.w) {
                    bqs.c("visitAncestors called on an unattached node");
                }
                bij bijVar2 = bkbVar.m.p;
                bvm bvmVarB = bko.B(bkbVar);
                loop0: while (true) {
                    bijVar = null;
                    if (bvmVarB == null) {
                        break;
                    }
                    if ((bvmVarB.s.f.o & 1024) != 0) {
                        while (bijVar2 != null) {
                            if ((bijVar2.n & 1024) != 0) {
                                bij bijVarY = bijVar2;
                                bdp bdpVar = null;
                                while (bijVarY != null) {
                                    if (bijVarY instanceof bkb) {
                                        bijVar = bijVarY;
                                        break loop0;
                                    }
                                    if ((bijVarY.n & 1024) != 0 && (bijVarY instanceof bup)) {
                                        int i2 = 0;
                                        for (bij bijVar3 = ((bup) bijVarY).y; bijVar3 != null; bijVar3 = bijVar3.q) {
                                            if ((bijVar3.n & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    bijVarY = bijVar3;
                                                } else {
                                                    if (bdpVar == null) {
                                                        bdpVar = new bdp(new bij[16]);
                                                    }
                                                    if (bijVarY != null) {
                                                        bdpVar.n(bijVarY);
                                                    }
                                                    bdpVar.n(bijVar3);
                                                    bijVarY = null;
                                                }
                                            }
                                        }
                                        if (i2 != 1) {
                                        }
                                    }
                                    bijVarY = bko.y(bdpVar);
                                }
                            }
                            bijVar2 = bijVar2.p;
                        }
                    }
                    bvmVarB = bvmVarB.j();
                    bijVar2 = (bvmVarB == null || (bweVar = bvmVarB.s) == null) ? null : bweVar.e;
                }
                bkb bkbVar2 = (bkb) bijVar;
                if (bkbVar2 == null) {
                    return 1;
                }
                int iOrdinal2 = bkbVar2.c().ordinal();
                if (iOrdinal2 == 0) {
                    return T(bkbVar2);
                }
                if (iOrdinal2 == 1) {
                    return D(bkbVar2, i);
                }
                if (iOrdinal2 == 2) {
                    return 2;
                }
                if (iOrdinal2 != 3) {
                    throw new uet();
                }
                int iD = D(bkbVar2, i);
                int i3 = iD != 1 ? iD : 0;
                return i3 == 0 ? T(bkbVar2) : i3;
            }
        }
        return 1;
    }

    public static final void E(bkb bkbVar) {
        bvm bvmVar;
        bws bwsVar;
        bwi bwiVar = bkbVar.m.s;
        if (bwiVar == null || (bvmVar = bwiVar.s) == null || (bwsVar = bvmVar.i) == null) {
            return;
        }
        bju bjuVar = ((bxv) bwsVar).D;
    }

    public static final mwu G(bkb bkbVar) {
        return ((bxv) bko.D(bkbVar)).D.h;
    }

    private static final long H(int i, bkg bkgVar, bkg bkgVar2) {
        float f;
        float f2;
        float f3;
        long jO = (long) O(bkgVar2, i, bkgVar);
        if (a.p(i, 3) || a.p(i, 4)) {
            float f4 = bkgVar.c;
            f = f4 + ((bkgVar.e - f4) / 2.0f);
            f2 = bkgVar2.c;
            f3 = bkgVar2.e;
        } else {
            if (!a.p(i, 5) && !a.p(i, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f5 = bkgVar.b;
            f = f5 + ((bkgVar.d - f5) / 2.0f);
            f2 = bkgVar2.b;
            f3 = bkgVar2.d;
        }
        float f6 = f - (f2 + ((f3 - f2) / 2.0f));
        long j = 13 * jO * jO;
        long j2 = (long) f6;
        return j + (j2 * j2);
    }

    private static final bkb I(bdp bdpVar, bkg bkgVar, int i) {
        bkg bkgVarD;
        if (a.p(i, 3)) {
            bkgVarD = bkgVar.d((bkgVar.d - bkgVar.b) + 1.0f, 0.0f);
        } else if (a.p(i, 4)) {
            bkgVarD = bkgVar.d(-((bkgVar.d - bkgVar.b) + 1.0f), 0.0f);
        } else if (a.p(i, 5)) {
            bkgVarD = bkgVar.d(0.0f, (bkgVar.e - bkgVar.c) + 1.0f);
        } else {
            if (!a.p(i, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            bkgVarD = bkgVar.d(0.0f, -((bkgVar.e - bkgVar.c) + 1.0f));
        }
        Object[] objArr = bdpVar.a;
        int i2 = bdpVar.b;
        bkb bkbVar = null;
        for (int i3 = 0; i3 < i2; i3++) {
            bkb bkbVar2 = (bkb) objArr[i3];
            if (A(bkbVar2)) {
                bkg bkgVarZ = z(bkbVar2);
                if (s(bkgVarZ, bkgVarD, bkgVar, i)) {
                    bkbVar = bkbVar2;
                    bkgVarD = bkgVarZ;
                }
            }
        }
        return bkbVar;
    }

    private static final void J(buo buoVar, bdp bdpVar) {
        bij bijVar = (bij) buoVar;
        if (!bijVar.m.w) {
            bqs.c("visitChildren called on an unattached node");
        }
        bdp bdpVar2 = new bdp(new bij[16]);
        bij bijVar2 = bijVar.m;
        bij bijVar3 = bijVar2.q;
        if (bijVar3 == null) {
            bko.G(bdpVar2, bijVar2);
        } else {
            bdpVar2.n(bijVar3);
        }
        while (true) {
            int i = bdpVar2.b;
            if (i == 0) {
                return;
            }
            bij bijVarY = (bij) bdpVar2.c(i - 1);
            if ((bijVarY.o & 1024) == 0) {
                bko.G(bdpVar2, bijVarY);
            } else {
                while (true) {
                    if (bijVarY == null) {
                        break;
                    }
                    if ((bijVarY.n & 1024) != 0) {
                        bdp bdpVar3 = null;
                        while (bijVarY != null) {
                            if (bijVarY instanceof bkb) {
                                bkb bkbVar = (bkb) bijVarY;
                                if (bkbVar.w && !bko.B(bkbVar).w) {
                                    if (bkbVar.o().a) {
                                        bdpVar.n(bkbVar);
                                    } else {
                                        J(bkbVar, bdpVar);
                                    }
                                }
                            } else if ((bijVarY.n & 1024) != 0 && (bijVarY instanceof bup)) {
                                int i2 = 0;
                                for (bij bijVar4 = ((bup) bijVarY).y; bijVar4 != null; bijVar4 = bijVar4.q) {
                                    if ((bijVar4.n & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            bijVarY = bijVar4;
                                        } else {
                                            if (bdpVar3 == null) {
                                                bdpVar3 = new bdp(new bij[16]);
                                            }
                                            if (bijVarY != null) {
                                                bdpVar3.n(bijVarY);
                                            }
                                            bdpVar3.n(bijVar4);
                                            bijVarY = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            bijVarY = bko.y(bdpVar3);
                        }
                    } else {
                        bijVarY = bijVarY.q;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean K(defpackage.bkg r9, defpackage.bkg r10, defpackage.bkg r11, int r12) {
        /*
            boolean r0 = L(r11, r12, r9)
            r1 = 0
            if (r0 != 0) goto Lac
            boolean r0 = L(r10, r12, r9)
            if (r0 != 0) goto Le
            return r1
        Le:
            r0 = 3
            boolean r2 = defpackage.a.p(r12, r0)
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r4 = 6
            r5 = 5
            r6 = 4
            r7 = 1
            if (r2 == 0) goto L25
            float r2 = r9.b
            float r8 = r11.d
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 < 0) goto L24
            goto L52
        L24:
            return r7
        L25:
            boolean r2 = defpackage.a.p(r12, r6)
            if (r2 == 0) goto L34
            float r2 = r9.d
            float r8 = r11.b
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 <= 0) goto L52
            return r7
        L34:
            boolean r2 = defpackage.a.p(r12, r5)
            if (r2 == 0) goto L43
            float r2 = r9.c
            float r8 = r11.e
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 >= 0) goto L52
            return r7
        L43:
            boolean r2 = defpackage.a.p(r12, r4)
            if (r2 == 0) goto La6
            float r2 = r9.e
            float r8 = r11.c
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 <= 0) goto L52
            return r7
        L52:
            boolean r2 = defpackage.a.p(r12, r0)
            if (r2 != 0) goto La5
            boolean r2 = defpackage.a.p(r12, r6)
            if (r2 == 0) goto L5f
            return r7
        L5f:
            float r10 = O(r10, r12, r9)
            boolean r0 = defpackage.a.p(r12, r0)
            if (r0 == 0) goto L6f
            float r9 = r9.b
            float r11 = r11.b
        L6d:
            float r9 = r9 - r11
            goto L92
        L6f:
            boolean r0 = defpackage.a.p(r12, r6)
            if (r0 == 0) goto L7c
            float r11 = r11.d
            float r9 = r9.d
        L79:
            float r9 = r11 - r9
            goto L92
        L7c:
            boolean r0 = defpackage.a.p(r12, r5)
            if (r0 == 0) goto L87
            float r9 = r9.c
            float r11 = r11.c
            goto L6d
        L87:
            boolean r12 = defpackage.a.p(r12, r4)
            if (r12 == 0) goto L9f
            float r11 = r11.e
            float r9 = r9.e
            goto L79
        L92:
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r12 >= 0) goto L99
            r9 = r11
        L99:
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 < 0) goto L9e
            return r1
        L9e:
            return r7
        L9f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        La5:
            return r7
        La6:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acv.K(bkg, bkg, bkg, int):boolean");
    }

    private static final boolean L(bkg bkgVar, int i, bkg bkgVar2) {
        if (a.p(i, 3) || a.p(i, 4)) {
            return bkgVar.e > bkgVar2.c && bkgVar.c < bkgVar2.e;
        }
        if (a.p(i, 5) || a.p(i, 6)) {
            return bkgVar.d > bkgVar2.b && bkgVar.b < bkgVar2.d;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final boolean M(bkb bkbVar, bkg bkgVar, int i, uiq uiqVar) {
        if (t(bkbVar, bkgVar, i, uiqVar)) {
            return true;
        }
        mwu mwuVarG = G(bkbVar);
        int i2 = mwuVarG.a;
        Boolean bool = (Boolean) kk.i(bkbVar, i, new bkc(mwuVarG, ((bxv) bko.D(bkbVar)).D.f, bkbVar, bkgVar, i, uiqVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean N(bkg bkgVar, int i, bkg bkgVar2) {
        if (a.p(i, 3)) {
            float f = bkgVar2.d;
            float f2 = bkgVar.d;
            return (f > f2 || bkgVar2.b >= f2) && bkgVar2.b > bkgVar.b;
        }
        if (a.p(i, 4)) {
            float f3 = bkgVar2.b;
            float f4 = bkgVar.b;
            return (f3 < f4 || bkgVar2.d <= f4) && bkgVar2.d < bkgVar.d;
        }
        if (a.p(i, 5)) {
            float f5 = bkgVar2.e;
            float f6 = bkgVar.e;
            return (f5 > f6 || bkgVar2.c >= f6) && bkgVar2.c > bkgVar.c;
        }
        if (!a.p(i, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f7 = bkgVar2.c;
        float f8 = bkgVar.c;
        return (f7 < f8 || bkgVar2.e <= f8) && bkgVar2.e < bkgVar.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ float O(defpackage.bkg r1, int r2, defpackage.bkg r3) {
        /*
            r0 = 3
            boolean r0 = defpackage.a.p(r2, r0)
            if (r0 == 0) goto Ld
            float r2 = r3.b
            float r1 = r1.d
        Lb:
            float r2 = r2 - r1
            goto L33
        Ld:
            r0 = 4
            boolean r0 = defpackage.a.p(r2, r0)
            if (r0 == 0) goto L1b
            float r1 = r1.b
            float r2 = r3.d
        L18:
            float r2 = r1 - r2
            goto L33
        L1b:
            r0 = 5
            boolean r0 = defpackage.a.p(r2, r0)
            if (r0 == 0) goto L27
            float r2 = r3.c
            float r1 = r1.e
            goto Lb
        L27:
            r0 = 6
            boolean r2 = defpackage.a.p(r2, r0)
            if (r2 == 0) goto L3a
            float r1 = r1.c
            float r2 = r3.e
            goto L18
        L33:
            r1 = 0
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 >= 0) goto L39
            return r1
        L39:
            return r2
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This function should only be used for 2-D focus search"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acv.O(bkg, int, bkg):float");
    }

    private static final boolean P(bkb bkbVar, bkb bkbVar2, int i, uiq uiqVar) {
        if (w(bkbVar, bkbVar2, i, uiqVar)) {
            return true;
        }
        mwu mwuVarG = G(bkbVar);
        int i2 = mwuVarG.a;
        Boolean bool = (Boolean) kk.i(bkbVar, i, new bkc(mwuVarG, ((bxv) bko.D(bkbVar)).D.f, bkbVar, bkbVar2, i, uiqVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean Q(bkb bkbVar, uiq uiqVar) {
        bdp bdpVar = new bdp(new bkb[16]);
        if (!bkbVar.m.w) {
            bqs.c("visitChildren called on an unattached node");
        }
        bdp bdpVar2 = new bdp(new bij[16]);
        bij bijVar = bkbVar.m;
        bij bijVar2 = bijVar.q;
        if (bijVar2 == null) {
            bko.G(bdpVar2, bijVar);
        } else {
            bdpVar2.n(bijVar2);
        }
        while (true) {
            int i = bdpVar2.b;
            if (i == 0) {
                break;
            }
            bij bijVarY = (bij) bdpVar2.c(i - 1);
            if ((bijVarY.o & 1024) == 0) {
                bko.G(bdpVar2, bijVarY);
            } else {
                while (true) {
                    if (bijVarY == null) {
                        break;
                    }
                    if ((bijVarY.n & 1024) != 0) {
                        bdp bdpVar3 = null;
                        while (bijVarY != null) {
                            if (bijVarY instanceof bkb) {
                                bdpVar.n((bkb) bijVarY);
                            } else if ((bijVarY.n & 1024) != 0 && (bijVarY instanceof bup)) {
                                int i2 = 0;
                                for (bij bijVar3 = ((bup) bijVarY).y; bijVar3 != null; bijVar3 = bijVar3.q) {
                                    if ((bijVar3.n & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            bijVarY = bijVar3;
                                        } else {
                                            if (bdpVar3 == null) {
                                                bdpVar3 = new bdp(new bij[16]);
                                            }
                                            if (bijVarY != null) {
                                                bdpVar3.n(bijVarY);
                                            }
                                            bdpVar3.n(bijVar3);
                                            bijVarY = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            bijVarY = bko.y(bdpVar3);
                        }
                    } else {
                        bijVarY = bijVarY.q;
                    }
                }
            }
        }
        bdpVar.j(cbi.b);
        int i3 = bdpVar.b - 1;
        Object[] objArr = bdpVar.a;
        if (i3 < objArr.length) {
            while (i3 >= 0) {
                bkb bkbVar2 = (bkb) objArr[i3];
                if (A(bkbVar2) && u(bkbVar2, uiqVar)) {
                    return true;
                }
                i3--;
            }
        }
        return false;
    }

    private static final boolean R(bkb bkbVar, uiq uiqVar) {
        bdp bdpVar = new bdp(new bkb[16]);
        if (!bkbVar.m.w) {
            bqs.c("visitChildren called on an unattached node");
        }
        bdp bdpVar2 = new bdp(new bij[16]);
        bij bijVar = bkbVar.m;
        bij bijVar2 = bijVar.q;
        if (bijVar2 == null) {
            bko.G(bdpVar2, bijVar);
        } else {
            bdpVar2.n(bijVar2);
        }
        while (true) {
            int i = bdpVar2.b;
            if (i == 0) {
                break;
            }
            bij bijVarY = (bij) bdpVar2.c(i - 1);
            if ((bijVarY.o & 1024) == 0) {
                bko.G(bdpVar2, bijVarY);
            } else {
                while (true) {
                    if (bijVarY == null) {
                        break;
                    }
                    if ((bijVarY.n & 1024) != 0) {
                        bdp bdpVar3 = null;
                        while (bijVarY != null) {
                            if (bijVarY instanceof bkb) {
                                bdpVar.n((bkb) bijVarY);
                            } else if ((bijVarY.n & 1024) != 0 && (bijVarY instanceof bup)) {
                                int i2 = 0;
                                for (bij bijVar3 = ((bup) bijVarY).y; bijVar3 != null; bijVar3 = bijVar3.q) {
                                    if ((bijVar3.n & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            bijVarY = bijVar3;
                                        } else {
                                            if (bdpVar3 == null) {
                                                bdpVar3 = new bdp(new bij[16]);
                                            }
                                            if (bijVarY != null) {
                                                bdpVar3.n(bijVarY);
                                            }
                                            bdpVar3.n(bijVar3);
                                            bijVarY = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            bijVarY = bko.y(bdpVar3);
                        }
                    } else {
                        bijVarY = bijVarY.q;
                    }
                }
            }
        }
        bdpVar.j(cbi.b);
        Object[] objArr = bdpVar.a;
        int i3 = bdpVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            bkb bkbVar2 = (bkb) objArr[i4];
            if (A(bkbVar2) && v(bkbVar2, uiqVar)) {
                return true;
            }
        }
        return false;
    }

    private static final bkb S(bkb bkbVar) {
        bkb bkbVarY = y(bkbVar);
        if (bkbVarY != null) {
            return bkbVarY;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }

    private static final int T(bkb bkbVar) {
        if (!bkbVar.b) {
            bkbVar.b = true;
            try {
                bjv bjvVarO = bkbVar.o();
                kk kkVar = new kk(null);
                E(bkbVar);
                bju bjuVar = ((bxv) bko.D(bkbVar)).D;
                bkb bkbVar2 = bjuVar.f;
                bjvVarO.j.a(kkVar);
                bkb bkbVar3 = bjuVar.f;
                if (bkbVar2 != bkbVar3 && bkbVar3 != null) {
                    return bjw.c == bjw.b ? 2 : 3;
                }
            } finally {
                bkbVar.b = false;
            }
        }
        return 1;
    }

    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final void c(bik bikVar, uiq uiqVar, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-932836462);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != aycVarC.B(bikVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(uiqVar) ? 16 : 32;
        }
        if (aycVarC.H((i2 & 19) != 18, i2 & 1)) {
            amo.c(bikVar.cM(new DrawBehindElement(uiqVar)), aycVarC);
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aqb(bikVar, uiqVar, i, i4);
        }
    }

    public static final float d(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static final float e(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static final float f(EdgeEffect edgeEffect, float f, float f2, chq chqVar) {
        float f3 = afd.a;
        float fA = chqVar.a() * 386.0878f;
        double d = afd.a * fA * 160.0f * 0.84f;
        if (((float) (d * Math.exp((afd.b / afd.c) * Math.log((Math.abs(f) * 0.35f) / d)))) > d(edgeEffect) * f2) {
            return 0.0f;
        }
        edgeEffect.onAbsorb(ukj.x(f));
        return f;
    }

    public static final long g(bbo bboVar) {
        return ((bkv) bboVar.a()).g;
    }

    public static final void h(uif uifVar, bik bikVar, blp blpVar, asb asbVar, alv alvVar, uiv uivVar, ayc aycVar, int i) {
        uif uifVar2;
        int i2;
        ayc aycVar2;
        ayc aycVarC = aycVar.c(-1084573925);
        if ((i & 6) == 0) {
            uifVar2 = uifVar;
            i2 = (true != aycVarC.D(uifVar2) ? 2 : 4) | i;
        } else {
            uifVar2 = uifVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(bikVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.C(true) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.B(null) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != aycVarC.B(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != aycVarC.B(blpVar) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != aycVarC.B(null) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != aycVarC.B(asbVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != aycVarC.B(alvVar) ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            i2 |= true != aycVarC.D(uivVar) ? 268435456 : 536870912;
        }
        if ((306783379 & i2) == 306783378 && aycVarC.G()) {
            aycVarC.r();
            aycVar2 = aycVarC;
        } else {
            aycVarC.s();
            if ((i & 1) != 0 && !aycVarC.E()) {
                aycVarC.r();
            }
            aycVarC.l();
            aycVarC.u(497771488);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            Object obj = ayb.a;
            if (objR == obj) {
                objR = new ocq((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                aygVar.ac(objR);
            }
            ocq ocqVar = (ocq) objR;
            aygVar.Y();
            int i3 = i2 >> 6;
            aycVarC.u(-2133647540);
            bbo bboVarAh = byi.ah(new bkv(asbVar.b), aycVarC);
            aygVar.Y();
            Object objR2 = aygVar.R();
            if (objR2 == obj) {
                objR2 = new add(15);
                aygVar.ac(objR2);
            }
            bik bikVarB = cbp.b(bikVar, false, (uiq) objR2);
            aycVarC.u(-655254499);
            bbo bboVarAh2 = byi.ah(new bkv(asbVar.a), aycVarC);
            aygVar.Y();
            long j = ((bkv) bboVarAh2.a()).g;
            long jG = g(bboVarAh);
            long jK = bko.k(bkv.d(jG), bkv.c(jG), bkv.b(jG), 1.0f, bkv.f(jG));
            aycVarC.u(498178145);
            aygVar.Y();
            aycVar2 = aycVarC;
            akg.I(uifVar2, bikVarB, true, blpVar, j, jK, 0.0f, ocqVar, bdq.k(-20345758, new chm(bboVarAh, alvVar, uivVar, 1), aycVarC), aycVar2, (i2 & 14) | 805306368 | (i2 & 896) | (i3 & 7168) | (i2 & 3670016), 0);
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new dqk(uifVar, bikVar, blpVar, asbVar, alvVar, uivVar, i, 1);
        }
    }

    public static /* synthetic */ void i(ayc aycVar, int i) {
        if ((i & 3) == 2 && aycVar.G()) {
            aycVar.r();
        }
    }

    public static final boolean j(caa caaVar, bpv bpvVar, bpv bpvVar2) {
        return bkf.a(a.ac(bpvVar.c, bpvVar2.c)) < a.aZ(caaVar, bpvVar.i);
    }

    public static final boolean k(bpp bppVar) {
        List list = bppVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!a.p(((bpv) list.get(i)).i, 2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(defpackage.bqk r7, defpackage.uhb r8) {
        /*
            boolean r0 = r8 instanceof defpackage.arj
            if (r0 == 0) goto L13
            r0 = r8
            arj r0 = (defpackage.arj) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            arj r0 = new arj
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            bqk r7 = r0.c
            defpackage.rnt.aN(r8)
            goto L40
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.rnt.aN(r8)
        L34:
            r0.c = r7
            r0.b = r3
            r8 = 2
            java.lang.Object r8 = r7.s(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            bpp r8 = (defpackage.bpp) r8
            java.util.List r2 = r8.a
            int r4 = r2.size()
            r5 = 0
        L49:
            if (r5 >= r4) goto L5b
            java.lang.Object r6 = r2.get(r5)
            bpv r6 = (defpackage.bpv) r6
            boolean r6 = defpackage.akg.y(r6)
            if (r6 != 0) goto L58
            goto L34
        L58:
            int r5 = r5 + 1
            goto L49
        L5b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acv.l(bqk, uhb):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
    
        if (r11 != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094 A[Catch: CancellationException -> 0x0044, TryCatch #0 {CancellationException -> 0x0044, blocks: (B:13:0x002a, B:41:0x00ae, B:43:0x00b6, B:45:0x00c3, B:47:0x00cf, B:48:0x00d2, B:49:0x00d5, B:51:0x00df, B:52:0x00e3, B:18:0x003d, B:26:0x0064, B:28:0x0068, B:30:0x0072, B:32:0x007c, B:39:0x0098, B:35:0x0085, B:36:0x008a, B:38:0x0094, B:23:0x004a), top: B:59:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v7, types: [bry, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(defpackage.bqk r8, defpackage.aqx r9, defpackage.bpp r10, defpackage.uhb r11) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acv.m(bqk, aqx, bpp, uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r13v1, types: [caa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [bry, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object n(defpackage.bqk r16, defpackage.aqy r17, defpackage.ogk r18, defpackage.bpp r19, defpackage.uhb r20) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acv.n(bqk, aqy, ogk, bpp, uhb):java.lang.Object");
    }

    public static final bkg o(bke bkeVar) {
        return new bkg(bkeVar.a, bkeVar.b, bkeVar.c, bkeVar.d);
    }

    public static final String p(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static final boolean r(bkb bkbVar, int i, uiq uiqVar) {
        bkg bkgVar;
        bdp bdpVar = new bdp(new bkb[16]);
        J(bkbVar, bdpVar);
        int i2 = bdpVar.b;
        if (i2 <= 1) {
            bkb bkbVar2 = (bkb) (i2 == 0 ? null : bdpVar.a[0]);
            if (bkbVar2 != null) {
                return ((Boolean) uiqVar.a(bkbVar2)).booleanValue();
            }
        } else {
            if (true == a.p(i, 7)) {
                i = 4;
            }
            if (a.p(i, 4) || a.p(i, 6)) {
                bkg bkgVarZ = z(bkbVar);
                float f = bkgVarZ.b;
                float f2 = bkgVarZ.c;
                bkgVar = new bkg(f, f2, f, f2);
            } else {
                if (!a.p(i, 3) && !a.p(i, 5)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                bkg bkgVarZ2 = z(bkbVar);
                float f3 = bkgVarZ2.d;
                float f4 = bkgVarZ2.e;
                bkgVar = new bkg(f3, f4, f3, f4);
            }
            bkb bkbVarI = I(bdpVar, bkgVar, i);
            if (bkbVarI != null) {
                return ((Boolean) uiqVar.a(bkbVarI)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean s(bkg bkgVar, bkg bkgVar2, bkg bkgVar3, int i) {
        if (!N(bkgVar, i, bkgVar3)) {
            return false;
        }
        if (N(bkgVar2, i, bkgVar3) && !K(bkgVar3, bkgVar, bkgVar2, i)) {
            return !K(bkgVar3, bkgVar2, bkgVar, i) && H(i, bkgVar3, bkgVar) < H(i, bkgVar3, bkgVar2);
        }
        return true;
    }

    public static final boolean t(bkb bkbVar, bkg bkgVar, int i, uiq uiqVar) {
        bkb bkbVarI;
        bdp bdpVar = new bdp(new bkb[16]);
        if (!bkbVar.m.w) {
            bqs.c("visitChildren called on an unattached node");
        }
        bdp bdpVar2 = new bdp(new bij[16]);
        bij bijVar = bkbVar.m;
        bij bijVar2 = bijVar.q;
        if (bijVar2 == null) {
            bko.G(bdpVar2, bijVar);
        } else {
            bdpVar2.n(bijVar2);
        }
        while (true) {
            int i2 = bdpVar2.b;
            if (i2 == 0) {
                break;
            }
            bij bijVarY = (bij) bdpVar2.c(i2 - 1);
            if ((bijVarY.o & 1024) == 0) {
                bko.G(bdpVar2, bijVarY);
            } else {
                while (true) {
                    if (bijVarY == null) {
                        break;
                    }
                    if ((bijVarY.n & 1024) != 0) {
                        bdp bdpVar3 = null;
                        while (bijVarY != null) {
                            if (bijVarY instanceof bkb) {
                                bkb bkbVar2 = (bkb) bijVarY;
                                if (bkbVar2.w) {
                                    bdpVar.n(bkbVar2);
                                }
                            } else if ((bijVarY.n & 1024) != 0 && (bijVarY instanceof bup)) {
                                int i3 = 0;
                                for (bij bijVar3 = ((bup) bijVarY).y; bijVar3 != null; bijVar3 = bijVar3.q) {
                                    if ((bijVar3.n & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            bijVarY = bijVar3;
                                        } else {
                                            if (bdpVar3 == null) {
                                                bdpVar3 = new bdp(new bij[16]);
                                            }
                                            if (bijVarY != null) {
                                                bdpVar3.n(bijVarY);
                                            }
                                            bdpVar3.n(bijVar3);
                                            bijVarY = null;
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            bijVarY = bko.y(bdpVar3);
                        }
                    } else {
                        bijVarY = bijVarY.q;
                    }
                }
            }
        }
        while (bdpVar.b != 0 && (bkbVarI = I(bdpVar, bkgVar, i)) != null) {
            if (bkbVarI.o().a) {
                return ((Boolean) uiqVar.a(bkbVarI)).booleanValue();
            }
            if (M(bkbVarI, bkgVar, i, uiqVar)) {
                return true;
            }
            bdpVar.m(bkbVarI);
        }
        return false;
    }

    public static final boolean u(bkb bkbVar, uiq uiqVar) {
        int iOrdinal = bkbVar.c().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                bkb bkbVarY = y(bkbVar);
                if (bkbVarY == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = bkbVarY.c().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (u(bkbVarY, uiqVar) || P(bkbVar, bkbVarY, 2, uiqVar)) {
                            return true;
                        }
                        return bkbVarY.o().a && ((Boolean) uiqVar.a(bkbVarY)).booleanValue();
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new uet();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                return P(bkbVar, bkbVarY, 2, uiqVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new uet();
                }
                if (Q(bkbVar, uiqVar)) {
                    return true;
                }
                return bkbVar.o().a && ((Boolean) uiqVar.a(bkbVar)).booleanValue();
            }
        }
        return Q(bkbVar, uiqVar);
    }

    public static final boolean v(bkb bkbVar, uiq uiqVar) {
        int iOrdinal = bkbVar.c().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                bkb bkbVarY = y(bkbVar);
                if (bkbVarY != null) {
                    return v(bkbVarY, uiqVar) || P(bkbVar, bkbVarY, 1, uiqVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return bkbVar.o().a ? ((Boolean) uiqVar.a(bkbVar)).booleanValue() : R(bkbVar, uiqVar);
                }
                throw new uet();
            }
        }
        return R(bkbVar, uiqVar);
    }

    public static final boolean w(bkb bkbVar, bkb bkbVar2, int i, uiq uiqVar) {
        bij bijVar;
        bwe bweVar;
        if (bkbVar.c() != bka.b) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        bdp bdpVar = new bdp(new bkb[16]);
        if (!bkbVar.m.w) {
            bqs.c("visitChildren called on an unattached node");
        }
        bdp bdpVar2 = new bdp(new bij[16]);
        bij bijVar2 = bkbVar.m;
        bij bijVar3 = bijVar2.q;
        if (bijVar3 == null) {
            bko.G(bdpVar2, bijVar2);
        } else {
            bdpVar2.n(bijVar3);
        }
        while (true) {
            int i2 = bdpVar2.b;
            bijVar = null;
            if (i2 == 0) {
                break;
            }
            bij bijVarY = (bij) bdpVar2.c(i2 - 1);
            if ((bijVarY.o & 1024) == 0) {
                bko.G(bdpVar2, bijVarY);
            } else {
                while (true) {
                    if (bijVarY == null) {
                        break;
                    }
                    if ((bijVarY.n & 1024) != 0) {
                        bdp bdpVar3 = null;
                        while (bijVarY != null) {
                            if (bijVarY instanceof bkb) {
                                bdpVar.n((bkb) bijVarY);
                            } else if ((bijVarY.n & 1024) != 0 && (bijVarY instanceof bup)) {
                                int i3 = 0;
                                for (bij bijVar4 = ((bup) bijVarY).y; bijVar4 != null; bijVar4 = bijVar4.q) {
                                    if ((bijVar4.n & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            bijVarY = bijVar4;
                                        } else {
                                            if (bdpVar3 == null) {
                                                bdpVar3 = new bdp(new bij[16]);
                                            }
                                            if (bijVarY != null) {
                                                bdpVar3.n(bijVarY);
                                            }
                                            bdpVar3.n(bijVar4);
                                            bijVarY = null;
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            bijVarY = bko.y(bdpVar3);
                        }
                    } else {
                        bijVarY = bijVarY.q;
                    }
                }
            }
        }
        bdpVar.j(cbi.b);
        if (a.p(i, 1)) {
            ukv ukvVarU = ukc.u(0, bdpVar.b);
            int i4 = ukvVarU.a;
            int i5 = ukvVarU.b;
            if (i4 <= i5) {
                boolean zAo = false;
                while (true) {
                    if (zAo) {
                        bkb bkbVar3 = (bkb) bdpVar.a[i4];
                        if (A(bkbVar3) && v(bkbVar3, uiqVar)) {
                            return true;
                        }
                    }
                    zAo |= a.ao(bdpVar.a[i4], bkbVar2);
                    if (i4 == i5) {
                        break;
                    }
                    i4++;
                }
            }
        } else {
            if (!a.p(i, 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            ukv ukvVarU2 = ukc.u(0, bdpVar.b);
            int i6 = ukvVarU2.a;
            int i7 = ukvVarU2.b;
            if (i6 <= i7) {
                boolean zAo2 = false;
                while (true) {
                    if (zAo2) {
                        bkb bkbVar4 = (bkb) bdpVar.a[i7];
                        if (A(bkbVar4) && u(bkbVar4, uiqVar)) {
                            return true;
                        }
                    }
                    zAo2 |= a.ao(bdpVar.a[i7], bkbVar2);
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
        }
        if (!a.p(i, 1) && bkbVar.o().a) {
            if (!bkbVar.m.w) {
                bqs.c("visitAncestors called on an unattached node");
            }
            bij bijVar5 = bkbVar.m.p;
            bvm bvmVarB = bko.B(bkbVar);
            loop5: while (true) {
                if (bvmVarB == null) {
                    break;
                }
                if ((bvmVarB.s.f.o & 1024) != 0) {
                    while (bijVar5 != null) {
                        if ((bijVar5.n & 1024) != 0) {
                            bij bijVarY2 = bijVar5;
                            bdp bdpVar4 = null;
                            while (bijVarY2 != null) {
                                if (bijVarY2 instanceof bkb) {
                                    bijVar = bijVarY2;
                                    break loop5;
                                }
                                if ((bijVarY2.n & 1024) != 0 && (bijVarY2 instanceof bup)) {
                                    int i8 = 0;
                                    for (bij bijVar6 = ((bup) bijVarY2).y; bijVar6 != null; bijVar6 = bijVar6.q) {
                                        if ((bijVar6.n & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                bijVarY2 = bijVar6;
                                            } else {
                                                if (bdpVar4 == null) {
                                                    bdpVar4 = new bdp(new bij[16]);
                                                }
                                                if (bijVarY2 != null) {
                                                    bdpVar4.n(bijVarY2);
                                                }
                                                bdpVar4.n(bijVar6);
                                                bijVarY2 = null;
                                            }
                                        }
                                    }
                                    if (i8 != 1) {
                                    }
                                }
                                bijVarY2 = bko.y(bdpVar4);
                            }
                        }
                        bijVar5 = bijVar5.p;
                    }
                }
                bvmVarB = bvmVarB.j();
                bijVar5 = (bvmVarB == null || (bweVar = bvmVarB.s) == null) ? null : bweVar.e;
            }
            if (bijVar != null) {
                return ((Boolean) uiqVar.a(bkbVar)).booleanValue();
            }
        }
        return false;
    }

    public static final bkb x(bkb bkbVar) {
        bkb bkbVar2 = ((bxv) bko.D(bkbVar)).D.f;
        if (bkbVar2 == null || !bkbVar2.w) {
            return null;
        }
        return bkbVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x001b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.bkb y(defpackage.bkb r8) {
        /*
            bij r8 = r8.m
            boolean r0 = r8.w
            r1 = 0
            if (r0 == 0) goto La0
            bdp r0 = new bdp
            r2 = 16
            bij[] r3 = new defpackage.bij[r2]
            r0.<init>(r3)
            bij r3 = r8.q
            if (r3 != 0) goto L18
            defpackage.bko.G(r0, r8)
            goto L1b
        L18:
            r0.n(r3)
        L1b:
            int r8 = r0.b
            if (r8 == 0) goto La0
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.c(r8)
            bij r8 = (defpackage.bij) r8
            int r3 = r8.o
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L31
            defpackage.bko.G(r0, r8)
            goto L1b
        L31:
            if (r8 == 0) goto L1b
            int r3 = r8.n
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L9d
            r3 = r1
        L3a:
            if (r8 == 0) goto L1b
            boolean r4 = r8 instanceof defpackage.bkb
            r5 = 1
            if (r4 == 0) goto L63
            bkb r8 = (defpackage.bkb) r8
            bij r4 = r8.m
            boolean r4 = r4.w
            if (r4 == 0) goto L98
            bka r4 = r8.c()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L62
            if (r4 == r5) goto L62
            r5 = 2
            if (r4 == r5) goto L62
            r8 = 3
            if (r4 != r8) goto L5c
            goto L98
        L5c:
            uet r8 = new uet
            r8.<init>()
            throw r8
        L62:
            return r8
        L63:
            int r4 = r8.n
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L98
            boolean r4 = r8 instanceof defpackage.bup
            if (r4 == 0) goto L98
            r4 = r8
            bup r4 = (defpackage.bup) r4
            bij r4 = r4.y
            r6 = 0
        L73:
            if (r4 == 0) goto L96
            int r7 = r4.n
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L93
            int r6 = r6 + 1
            if (r6 != r5) goto L81
            r8 = r4
            goto L93
        L81:
            if (r3 != 0) goto L8a
            bdp r3 = new bdp
            bij[] r7 = new defpackage.bij[r2]
            r3.<init>(r7)
        L8a:
            if (r8 == 0) goto L8f
            r3.n(r8)
        L8f:
            r3.n(r4)
            r8 = r1
        L93:
            bij r4 = r4.q
            goto L73
        L96:
            if (r6 == r5) goto L3a
        L98:
            bij r8 = defpackage.bko.y(r3)
            goto L3a
        L9d:
            bij r8 = r8.q
            goto L31
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acv.y(bkb):bkb");
    }

    public static final bkg z(bkb bkbVar) {
        bwi bwiVar = bkbVar.s;
        return bwiVar != null ? byi.x(bwiVar).n(bwiVar, false) : bkg.a;
    }

    public static final Boolean q(bkb bkbVar, int i, bkg bkgVar, uiq uiqVar) {
        Object objValueOf;
        int iOrdinal = bkbVar.c().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        if (bkbVar.o().a) {
                            objValueOf = uiqVar.a(bkbVar);
                        } else if (bkgVar == null) {
                            objValueOf = Boolean.valueOf(r(bkbVar, i, uiqVar));
                        } else {
                            objValueOf = Boolean.valueOf(t(bkbVar, bkgVar, i, uiqVar));
                        }
                        return (Boolean) objValueOf;
                    }
                    throw new uet();
                }
            } else {
                bkb bkbVarY = y(bkbVar);
                if (bkbVarY != null) {
                    int iOrdinal2 = bkbVarY.c().ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 != 1) {
                            if (iOrdinal2 != 2) {
                                if (iOrdinal2 != 3) {
                                    throw new uet();
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                        } else {
                            Boolean boolQ = q(bkbVarY, i, bkgVar, uiqVar);
                            if (!a.ao(boolQ, false)) {
                                return boolQ;
                            }
                            if (bkgVar == null) {
                                if (bkbVarY.c() == bka.b) {
                                    bkb bkbVarX = x(bkbVarY);
                                    if (bkbVarX != null) {
                                        bkgVar = z(bkbVarX);
                                    } else {
                                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                                    }
                                } else {
                                    throw new IllegalStateException(PJGqOKsIpSdZ.mLM);
                                }
                            }
                            return Boolean.valueOf(M(bkbVar, bkgVar, i, uiqVar));
                        }
                    }
                    if (bkgVar == null) {
                        bkgVar = z(bkbVarY);
                    }
                    return Boolean.valueOf(M(bkbVar, bkgVar, i, uiqVar));
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        }
        return Boolean.valueOf(r(bkbVar, i, uiqVar));
    }
}
