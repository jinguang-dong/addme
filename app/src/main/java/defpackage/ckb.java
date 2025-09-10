package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckb {
    public static final cjv a = new cjv();
    public static int b = 0;
    public static int c = 0;

    public static void a(int i, cjn cjnVar, ckm ckmVar, boolean z) {
        cjm cjmVar;
        cjm cjmVar2;
        float f;
        boolean z2;
        boolean z3;
        cjm cjmVar3;
        cjm cjmVar4;
        if (cjnVar.n) {
            return;
        }
        boolean z4 = true;
        b++;
        if (!(cjnVar instanceof cjo) && cjnVar.J() && c(cjnVar)) {
            cjo.X(cjnVar, ckmVar, new cjv());
        }
        cjm cjmVarK = cjnVar.K(2);
        cjm cjmVarK2 = cjnVar.K(4);
        int iA = cjmVarK.a();
        int iA2 = cjmVarK2.a();
        HashSet hashSet = cjmVarK.a;
        if (hashSet != null && cjmVarK.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                cjm cjmVar5 = (cjm) it.next();
                cjn cjnVar2 = cjmVar5.d;
                boolean zC = c(cjnVar2);
                if (cjnVar2.J() && zC) {
                    f = 0.0f;
                    cjo.X(cjnVar2, ckmVar, new cjv());
                } else {
                    f = 0.0f;
                }
                cjm cjmVar6 = cjnVar2.J;
                if ((cjmVar5 == cjmVar6 && (cjmVar4 = cjnVar2.L.e) != null && cjmVar4.c) || (cjmVar5 == cjnVar2.L && (cjmVar3 = cjmVar6.e) != null && cjmVar3.c)) {
                    z3 = z4;
                    z2 = z3;
                } else {
                    z2 = z4;
                    z3 = false;
                }
                if (cjnVar2.M() != 3 || zC) {
                    if (!cjnVar2.J()) {
                        if (cjmVar5 == cjmVar6 && cjnVar2.L.e == null) {
                            int iB = cjmVar6.b() + iA;
                            cjnVar2.v(iB, cjnVar2.j() + iB);
                            a(i2, cjnVar2, ckmVar, z);
                        } else {
                            cjm cjmVar7 = cjnVar2.L;
                            if (cjmVar5 == cjmVar7 && cjmVar6.e == null) {
                                int iB2 = iA - cjmVar7.b();
                                cjnVar2.v(iB2 - cjnVar2.j(), iB2);
                                a(i2, cjnVar2, ckmVar, z);
                            } else if (z3 && !cjnVar2.H()) {
                                e(i2, ckmVar, cjnVar2, z);
                            }
                        }
                    }
                } else if (cjnVar2.M() == 3 && cjnVar2.w >= 0 && cjnVar2.v >= 0 && ((cjnVar2.ah == 8 || (cjnVar2.s == 0 && cjnVar2.X == f)) && !cjnVar2.H() && z3 && !cjnVar2.H())) {
                    f(i2, cjnVar, ckmVar, cjnVar2, z);
                }
                z4 = z2;
            }
        }
        boolean z5 = z4;
        if (cjnVar instanceof cjq) {
            return;
        }
        HashSet hashSet2 = cjmVarK2.a;
        if (hashSet2 != null && cjmVarK2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                int i3 = i + 1;
                cjm cjmVar8 = (cjm) it2.next();
                cjn cjnVar3 = cjmVar8.d;
                boolean zC2 = c(cjnVar3);
                if (cjnVar3.J() && zC2) {
                    cjo.X(cjnVar3, ckmVar, new cjv());
                }
                cjm cjmVar9 = cjnVar3.J;
                boolean z6 = ((cjmVar8 == cjmVar9 && (cjmVar2 = cjnVar3.L.e) != null && cjmVar2.c) || (cjmVar8 == cjnVar3.L && (cjmVar = cjmVar9.e) != null && cjmVar.c)) ? z5 : false;
                if (cjnVar3.M() != 3 || zC2) {
                    if (!cjnVar3.J()) {
                        if (cjmVar8 == cjmVar9 && cjnVar3.L.e == null) {
                            int iB3 = cjmVar9.b() + iA2;
                            cjnVar3.v(iB3, cjnVar3.j() + iB3);
                            a(i3, cjnVar3, ckmVar, z);
                        } else {
                            cjm cjmVar10 = cjnVar3.L;
                            if (cjmVar8 == cjmVar10 && cjmVar9.e == null) {
                                int iB4 = iA2 - cjmVar10.b();
                                cjnVar3.v(iB4 - cjnVar3.j(), iB4);
                                a(i3, cjnVar3, ckmVar, z);
                            } else if (z6 && !cjnVar3.H()) {
                                e(i3, ckmVar, cjnVar3, z);
                            }
                        }
                    }
                } else if (cjnVar3.M() == 3 && cjnVar3.w >= 0 && cjnVar3.v >= 0 && (cjnVar3.ah == 8 || (cjnVar3.s == 0 && cjnVar3.X == 0.0f))) {
                    if (!cjnVar3.H() && z6 && !cjnVar3.H()) {
                        f(i3, cjnVar, ckmVar, cjnVar3, z);
                    }
                }
            }
        }
        cjnVar.n = z5;
    }

    public static void b(int i, cjn cjnVar, ckm ckmVar) {
        cjm cjmVar;
        cjm cjmVar2;
        cjm cjmVar3;
        cjm cjmVar4;
        cjm cjmVar5;
        if (cjnVar.o) {
            return;
        }
        c++;
        if (!(cjnVar instanceof cjo) && cjnVar.J() && c(cjnVar)) {
            cjo.X(cjnVar, ckmVar, new cjv());
        }
        cjm cjmVarK = cjnVar.K(3);
        cjm cjmVarK2 = cjnVar.K(5);
        int iA = cjmVarK.a();
        int iA2 = cjmVarK2.a();
        HashSet hashSet = cjmVarK.a;
        if (hashSet != null && cjmVarK.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                cjm cjmVar6 = (cjm) it.next();
                cjn cjnVar2 = cjmVar6.d;
                boolean zC = c(cjnVar2);
                if (cjnVar2.J() && zC) {
                    cjo.X(cjnVar2, ckmVar, new cjv());
                }
                cjm cjmVar7 = cjnVar2.K;
                boolean z = (cjmVar6 == cjmVar7 && (cjmVar5 = cjnVar2.M.e) != null && cjmVar5.c) || (cjmVar6 == cjnVar2.M && (cjmVar4 = cjmVar7.e) != null && cjmVar4.c);
                if (cjnVar2.N() != 3 || zC) {
                    if (!cjnVar2.J()) {
                        if (cjmVar6 == cjmVar7 && cjnVar2.M.e == null) {
                            int iB = cjmVar7.b() + iA;
                            cjnVar2.w(iB, cjnVar2.h() + iB);
                            b(i2, cjnVar2, ckmVar);
                        } else {
                            cjm cjmVar8 = cjnVar2.M;
                            if (cjmVar6 == cjmVar8 && cjmVar7.e == null) {
                                int iB2 = iA - cjmVar8.b();
                                cjnVar2.w(iB2 - cjnVar2.h(), iB2);
                                b(i2, cjnVar2, ckmVar);
                            } else if (z && !cjnVar2.I()) {
                                g(i2, ckmVar, cjnVar2);
                            }
                        }
                    }
                } else if (cjnVar2.N() == 3 && cjnVar2.z >= 0 && cjnVar2.y >= 0 && (cjnVar2.ah == 8 || (cjnVar2.t == 0 && cjnVar2.X == 0.0f))) {
                    if (!cjnVar2.I() && z && !cjnVar2.I()) {
                        h(i2, cjnVar, ckmVar, cjnVar2);
                    }
                }
            }
        }
        if (cjnVar instanceof cjq) {
            return;
        }
        HashSet hashSet2 = cjmVarK2.a;
        if (hashSet2 != null && cjmVarK2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                int i3 = i + 1;
                cjm cjmVar9 = (cjm) it2.next();
                cjn cjnVar3 = cjmVar9.d;
                boolean zC2 = c(cjnVar3);
                if (cjnVar3.J() && zC2) {
                    cjo.X(cjnVar3, ckmVar, new cjv());
                }
                cjm cjmVar10 = cjnVar3.K;
                boolean z2 = (cjmVar9 == cjmVar10 && (cjmVar3 = cjnVar3.M.e) != null && cjmVar3.c) || (cjmVar9 == cjnVar3.M && (cjmVar2 = cjmVar10.e) != null && cjmVar2.c);
                if (cjnVar3.N() != 3 || zC2) {
                    if (!cjnVar3.J()) {
                        if (cjmVar9 == cjmVar10 && cjnVar3.M.e == null) {
                            int iB3 = cjmVar10.b() + iA2;
                            cjnVar3.w(iB3, cjnVar3.h() + iB3);
                            b(i3, cjnVar3, ckmVar);
                        } else {
                            cjm cjmVar11 = cjnVar3.M;
                            if (cjmVar9 == cjmVar11 && cjmVar10.e == null) {
                                int iB4 = iA2 - cjmVar11.b();
                                cjnVar3.w(iB4 - cjnVar3.h(), iB4);
                                b(i3, cjnVar3, ckmVar);
                            } else if (z2 && !cjnVar3.I()) {
                                g(i3, ckmVar, cjnVar3);
                            }
                        }
                    }
                } else if (cjnVar3.N() == 3 && cjnVar3.z >= 0 && cjnVar3.y >= 0 && (cjnVar3.ah == 8 || (cjnVar3.t == 0 && cjnVar3.X == 0.0f))) {
                    if (!cjnVar3.I() && z2 && !cjnVar3.I()) {
                        h(i3, cjnVar, ckmVar, cjnVar3);
                    }
                }
            }
        }
        cjm cjmVarK3 = cjnVar.K(6);
        if (cjmVarK3.a != null && cjmVarK3.c) {
            int iA3 = cjmVarK3.a();
            Iterator it3 = cjmVarK3.a.iterator();
            while (it3.hasNext()) {
                int i4 = i + 1;
                cjm cjmVar12 = (cjm) it3.next();
                cjn cjnVar4 = cjmVar12.d;
                boolean zC3 = c(cjnVar4);
                if (cjnVar4.J() && zC3) {
                    cjo.X(cjnVar4, ckmVar, new cjv());
                }
                if (cjnVar4.N() != 3 || zC3) {
                    if (!cjnVar4.J() && cjmVar12 == (cjmVar = cjnVar4.N)) {
                        int iB5 = cjmVar12.b() + iA3;
                        if (cjnVar4.F) {
                            int i5 = iB5 - cjnVar4.ab;
                            int i6 = cjnVar4.W + i5;
                            cjnVar4.aa = i5;
                            cjnVar4.K.e(i5);
                            cjnVar4.M.e(i6);
                            cjmVar.e(iB5);
                            cjnVar4.m = true;
                        }
                        b(i4, cjnVar4, ckmVar);
                    }
                }
            }
        }
        cjnVar.o = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(defpackage.cjn r8) {
        /*
            int r0 = r8.M()
            int r1 = r8.N()
            cjn r2 = r8.U
            if (r2 != 0) goto Ld
            r2 = 0
        Ld:
            if (r2 == 0) goto L12
            r2.M()
        L12:
            if (r2 == 0) goto L17
            r2.N()
        L17:
            r2 = 2
            r3 = 0
            r4 = 3
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L4b
            boolean r7 = r8.e()
            if (r7 != 0) goto L4b
            if (r0 == r2) goto L4b
            if (r0 != r4) goto L39
            int r0 = r8.s
            if (r0 != 0) goto L3d
            float r0 = r8.X
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L3d
            boolean r0 = r8.F(r5)
            if (r0 != 0) goto L4b
            goto L3d
        L39:
            if (r0 == r4) goto L3d
        L3b:
            r0 = r5
            goto L4c
        L3d:
            int r0 = r8.s
            if (r0 != r6) goto L3b
            int r0 = r8.j()
            boolean r0 = r8.G(r5, r0)
            if (r0 == 0) goto L3b
        L4b:
            r0 = r6
        L4c:
            if (r1 == r6) goto L7b
            boolean r7 = r8.f()
            if (r7 != 0) goto L7b
            if (r1 == r2) goto L7b
            if (r1 != r4) goto L69
            int r1 = r8.t
            if (r1 != 0) goto L6d
            float r1 = r8.X
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L6d
            boolean r1 = r8.F(r6)
            if (r1 != 0) goto L7b
            goto L6d
        L69:
            if (r1 == r4) goto L6d
        L6b:
            r1 = r5
            goto L7c
        L6d:
            int r1 = r8.t
            if (r1 != r6) goto L6b
            int r1 = r8.h()
            boolean r1 = r8.G(r6, r1)
            if (r1 == 0) goto L6b
        L7b:
            r1 = r6
        L7c:
            float r8 = r8.X
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L8a
            if (r0 != 0) goto L89
            if (r1 != 0) goto L89
            r0 = r5
            r1 = r0
            goto L8a
        L89:
            return r6
        L8a:
            if (r0 == 0) goto L8f
            if (r1 == 0) goto L8f
            return r6
        L8f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckb.c(cjn):boolean");
    }

    public static void d(cjk cjkVar, ckm ckmVar, int i, boolean z) {
        if (cjkVar.c()) {
            if (i == 0) {
                a(1, cjkVar, ckmVar, z);
            } else {
                b(1, cjkVar, ckmVar);
            }
        }
    }

    private static void e(int i, ckm ckmVar, cjn cjnVar, boolean z) {
        float f = cjnVar.ae;
        cjm cjmVar = cjnVar.J;
        int iA = cjmVar.e.a();
        cjm cjmVar2 = cjnVar.L;
        int iA2 = cjmVar2.e.a();
        int iB = cjmVar.b() + iA;
        int iB2 = iA2 - cjmVar2.b();
        if (iA == iA2) {
            iB2 = iA2;
        }
        if (iA == iA2) {
            iB = iA;
        }
        if (iA == iA2) {
            f = 0.5f;
        }
        int iJ = cjnVar.j();
        int i2 = (iB2 - iB) - iJ;
        if (iB > iB2) {
            i2 = (iB - iB2) - iJ;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iB;
        int i4 = i3 + iJ;
        if (iB > iB2) {
            i4 = i3 - iJ;
        }
        cjnVar.v(i3, i4);
        a(i + 1, cjnVar, ckmVar, z);
    }

    private static void f(int i, cjn cjnVar, ckm ckmVar, cjn cjnVar2, boolean z) {
        float f = cjnVar2.ae;
        cjm cjmVar = cjnVar2.J;
        int iA = cjmVar.e.a() + cjmVar.b();
        cjm cjmVar2 = cjnVar2.L;
        int iA2 = cjmVar2.e.a() - cjmVar2.b();
        if (iA2 >= iA) {
            int iJ = cjnVar2.j();
            int i2 = iA2 - iA;
            if (cjnVar2.ah != 8) {
                int i3 = cjnVar2.s;
                if (i3 == 2) {
                    iJ = (int) (cjnVar2.ae * 0.5f * (cjnVar instanceof cjo ? cjnVar.j() : cjnVar.U.j()));
                } else if (i3 == 0) {
                    iJ = i2;
                }
                iJ = Math.max(cjnVar2.v, iJ);
                int i4 = cjnVar2.w;
                if (i4 > 0) {
                    iJ = Math.min(i4, iJ);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iJ)) + 0.5f));
            cjnVar2.v(i5, iJ + i5);
            a(i + 1, cjnVar2, ckmVar, z);
        }
    }

    private static void g(int i, ckm ckmVar, cjn cjnVar) {
        float f = cjnVar.af;
        cjm cjmVar = cjnVar.K;
        int iA = cjmVar.e.a();
        cjm cjmVar2 = cjnVar.M;
        int iA2 = cjmVar2.e.a();
        int iB = cjmVar.b() + iA;
        int iB2 = iA2 - cjmVar2.b();
        if (iA == iA2) {
            iB2 = iA2;
        }
        if (iA == iA2) {
            iB = iA;
        }
        if (iA == iA2) {
            f = 0.5f;
        }
        int iH = cjnVar.h();
        int i2 = (iB2 - iB) - iH;
        if (iB > iB2) {
            i2 = (iB - iB2) - iH;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iB + i3;
        int i5 = i4 + iH;
        if (iB > iB2) {
            i4 = iB - i3;
            i5 = i4 - iH;
        }
        cjnVar.w(i4, i5);
        b(i + 1, cjnVar, ckmVar);
    }

    private static void h(int i, cjn cjnVar, ckm ckmVar, cjn cjnVar2) {
        float f = cjnVar2.af;
        cjm cjmVar = cjnVar2.K;
        int iA = cjmVar.e.a() + cjmVar.b();
        cjm cjmVar2 = cjnVar2.M;
        int iA2 = cjmVar2.e.a() - cjmVar2.b();
        if (iA2 >= iA) {
            int iH = cjnVar2.h();
            int i2 = iA2 - iA;
            if (cjnVar2.ah != 8) {
                int i3 = cjnVar2.t;
                if (i3 == 2) {
                    iH = (int) (f * 0.5f * (cjnVar instanceof cjo ? cjnVar.h() : cjnVar.U.h()));
                } else if (i3 == 0) {
                    iH = i2;
                }
                iH = Math.max(cjnVar2.y, iH);
                int i4 = cjnVar2.z;
                if (i4 > 0) {
                    iH = Math.min(i4, iH);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iH)) + 0.5f));
            cjnVar2.w(i5, iH + i5);
            b(i + 1, cjnVar2, ckmVar);
        }
    }
}
