package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cke extends ckh {
    private static final int[] a = new int[2];

    public cke(cjn cjnVar) {
        super(cjnVar);
        this.h.l = 4;
        this.i.l = 5;
        this.f = 0;
    }

    private static final void n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i4 - i3;
        int i7 = i2 - i;
        if (i5 != -1) {
            if (i5 != 0) {
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f) + 0.5f);
                return;
            } else {
                iArr[0] = (int) ((i6 * f) + 0.5f);
                iArr[1] = i6;
                return;
            }
        }
        float f2 = (i7 / f) + 0.5f;
        int i8 = (int) ((i6 * f) + 0.5f);
        if (i8 <= i7) {
            iArr[0] = i8;
            iArr[1] = i6;
            return;
        }
        int i9 = (int) f2;
        if (i9 <= i6) {
            iArr[0] = i7;
            iArr[1] = i9;
        }
    }

    @Override // defpackage.ckh
    public final void b() {
        cjn cjnVar;
        cjn cjnVar2;
        cjn cjnVar3;
        cjn cjnVar4 = this.d;
        if (cjnVar4.e) {
            this.e.c(cjnVar4.j());
        }
        cka ckaVar = this.e;
        if (!ckaVar.i) {
            int iM = this.d.M();
            this.j = iM;
            if (iM != 3) {
                if (this.j == 4 && (cjnVar3 = this.d.U) != null && (cjnVar3.M() == 1 || cjnVar3.M() == 4)) {
                    int iJ = (cjnVar3.j() - this.d.J.b()) - this.d.L.b();
                    j(this.h, cjnVar3.h.h, this.d.J.b());
                    j(this.i, cjnVar3.h.i, -this.d.L.b());
                    ckaVar.c(iJ);
                    return;
                }
                if (this.j == 1) {
                    ckaVar.c(this.d.j());
                }
            }
        } else if (this.j == 4 && (cjnVar = this.d.U) != null && (cjnVar.M() == 1 || cjnVar.M() == 4)) {
            j(this.h, cjnVar.h.h, this.d.J.b());
            j(this.i, cjnVar.h.i, -this.d.L.b());
            return;
        }
        if (ckaVar.i) {
            cjn cjnVar5 = this.d;
            if (cjnVar5.e) {
                cjm[] cjmVarArr = cjnVar5.R;
                cjm cjmVar = cjmVarArr[0];
                cjm cjmVar2 = cjmVar.e;
                if (cjmVar2 != null && cjmVarArr[1].e != null) {
                    if (cjnVar5.H()) {
                        this.h.e = this.d.R[0].b();
                        this.i.e = -this.d.R[1].b();
                        return;
                    }
                    cjz cjzVarK = k(this.d.R[0]);
                    if (cjzVarK != null) {
                        j(this.h, cjzVarK, this.d.R[0].b());
                    }
                    cjz cjzVarK2 = k(this.d.R[1]);
                    if (cjzVarK2 != null) {
                        j(this.i, cjzVarK2, -this.d.R[1].b());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
                if (cjmVar2 != null) {
                    cjz cjzVarK3 = k(cjmVar);
                    if (cjzVarK3 != null) {
                        cjz cjzVar = this.h;
                        j(cjzVar, cjzVarK3, this.d.R[0].b());
                        j(this.i, cjzVar, ckaVar.f);
                        return;
                    }
                    return;
                }
                cjm cjmVar3 = cjmVarArr[1];
                if (cjmVar3.e != null) {
                    cjz cjzVarK4 = k(cjmVar3);
                    if (cjzVarK4 != null) {
                        cjz cjzVar2 = this.i;
                        j(cjzVar2, cjzVarK4, -this.d.R[1].b());
                        j(this.h, cjzVar2, -ckaVar.f);
                        return;
                    }
                    return;
                }
                if ((cjnVar5 instanceof cjr) || cjnVar5.U == null || cjnVar5.K(7).e != null) {
                    return;
                }
                cjn cjnVar6 = this.d;
                cjz cjzVar3 = cjnVar6.U.h.h;
                cjz cjzVar4 = this.h;
                j(cjzVar4, cjzVar3, cjnVar6.k());
                j(this.i, cjzVar4, ckaVar.f);
                return;
            }
        }
        if (this.j == 3) {
            cjn cjnVar7 = this.d;
            int i = cjnVar7.s;
            if (i == 2) {
                cjn cjnVar8 = cjnVar7.U;
                if (cjnVar8 != null) {
                    cka ckaVar2 = cjnVar8.i.e;
                    ckaVar.k.add(ckaVar2);
                    ckaVar2.j.add(ckaVar);
                    ckaVar.b = true;
                    cjz cjzVar5 = this.h;
                    List list = ckaVar.j;
                    list.add(cjzVar5);
                    list.add(this.i);
                }
            } else if (i == 3) {
                if (cjnVar7.t == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    ckf ckfVar = cjnVar7.i;
                    ckfVar.h.a = this;
                    ckfVar.i.a = this;
                    ckaVar.a = this;
                    if (cjnVar7.I()) {
                        List list2 = ckaVar.k;
                        list2.add(this.d.i.e);
                        this.d.i.e.j.add(ckaVar);
                        ckf ckfVar2 = this.d.i;
                        ckfVar2.e.a = this;
                        list2.add(ckfVar2.h);
                        list2.add(this.d.i.i);
                        this.d.i.h.j.add(ckaVar);
                        this.d.i.i.j.add(ckaVar);
                    } else if (this.d.H()) {
                        this.d.i.e.k.add(ckaVar);
                        ckaVar.j.add(this.d.i.e);
                    } else {
                        this.d.i.e.k.add(ckaVar);
                    }
                } else {
                    cka ckaVar3 = cjnVar7.i.e;
                    ckaVar.k.add(ckaVar3);
                    ckaVar3.j.add(ckaVar);
                    this.d.i.h.j.add(ckaVar);
                    this.d.i.i.j.add(ckaVar);
                    ckaVar.b = true;
                    cjz cjzVar6 = this.h;
                    List list3 = ckaVar.j;
                    list3.add(cjzVar6);
                    cjz cjzVar7 = this.i;
                    list3.add(cjzVar7);
                    cjzVar6.k.add(ckaVar);
                    cjzVar7.k.add(ckaVar);
                }
            }
        }
        cjn cjnVar9 = this.d;
        cjm[] cjmVarArr2 = cjnVar9.R;
        cjm cjmVar4 = cjmVarArr2[0];
        cjm cjmVar5 = cjmVar4.e;
        if (cjmVar5 != null && cjmVarArr2[1].e != null) {
            if (cjnVar9.H()) {
                this.h.e = this.d.R[0].b();
                this.i.e = -this.d.R[1].b();
                return;
            }
            cjz cjzVarK5 = k(this.d.R[0]);
            cjz cjzVarK6 = k(this.d.R[1]);
            if (cjzVarK5 != null) {
                cjzVarK5.a(this);
            }
            if (cjzVarK6 != null) {
                cjzVarK6.a(this);
            }
            this.k = 4;
            return;
        }
        if (cjmVar5 != null) {
            cjz cjzVarK7 = k(cjmVar4);
            if (cjzVarK7 != null) {
                cjz cjzVar8 = this.h;
                j(cjzVar8, cjzVarK7, this.d.R[0].b());
                i(this.i, cjzVar8, 1, ckaVar);
                return;
            }
            return;
        }
        cjm cjmVar6 = cjmVarArr2[1];
        if (cjmVar6.e != null) {
            cjz cjzVarK8 = k(cjmVar6);
            if (cjzVarK8 != null) {
                cjz cjzVar9 = this.i;
                j(cjzVar9, cjzVarK8, -this.d.R[1].b());
                i(this.h, cjzVar9, -1, ckaVar);
                return;
            }
            return;
        }
        if ((cjnVar9 instanceof cjr) || (cjnVar2 = cjnVar9.U) == null) {
            return;
        }
        cjz cjzVar10 = cjnVar2.h.h;
        cjz cjzVar11 = this.h;
        j(cjzVar11, cjzVar10, cjnVar9.k());
        i(this.i, cjzVar11, 1, ckaVar);
    }

    @Override // defpackage.ckh
    public final void c() {
        cjz cjzVar = this.h;
        if (cjzVar.i) {
            this.d.Z = cjzVar.f;
        }
    }

    @Override // defpackage.ckh
    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.e.b();
        this.g = false;
    }

    @Override // defpackage.ckh
    public final boolean e() {
        return this.j != 3 || this.d.s == 0;
    }

    @Override // defpackage.ckh, defpackage.cjx
    public final void f() {
        float f;
        int i = this.k;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 3) {
            cjn cjnVar = this.d;
            m(cjnVar.J, cjnVar.L, 0);
            return;
        }
        cka ckaVar = this.e;
        if (!ckaVar.i && this.j == 3) {
            cjn cjnVar2 = this.d;
            int i3 = cjnVar2.s;
            if (i3 == 2) {
                cjn cjnVar3 = cjnVar2.U;
                if (cjnVar3 != null) {
                    if (cjnVar3.h.e.i) {
                        ckaVar.c((int) ((r7.f * cjnVar2.x) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = cjnVar2.t;
                if (i4 == 0 || i4 == 3) {
                    ckf ckfVar = cjnVar2.i;
                    cjz cjzVar = ckfVar.h;
                    cjz cjzVar2 = ckfVar.i;
                    boolean z = cjnVar2.J.e != null;
                    boolean z2 = cjnVar2.K.e != null;
                    boolean z3 = cjnVar2.L.e != null;
                    boolean z4 = cjnVar2.M.e != null;
                    int i5 = cjnVar2.Y;
                    if (z && z2 && z3 && z4) {
                        float f2 = cjnVar2.X;
                        if (cjzVar.i && cjzVar2.i) {
                            cjz cjzVar3 = this.h;
                            if (cjzVar3.c) {
                                cjz cjzVar4 = this.i;
                                if (cjzVar4.c) {
                                    int i6 = ((cjz) cjzVar3.k.get(0)).f + cjzVar3.e;
                                    int i7 = ((cjz) cjzVar4.k.get(0)).f - cjzVar4.e;
                                    int i8 = cjzVar.f + cjzVar.e;
                                    int i9 = cjzVar2.f - cjzVar2.e;
                                    int[] iArr = a;
                                    n(iArr, i6, i7, i8, i9, f2, i5);
                                    ckaVar.c(iArr[0]);
                                    this.d.i.e.c(iArr[1]);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        cjz cjzVar5 = this.h;
                        if (cjzVar5.i) {
                            cjz cjzVar6 = this.i;
                            if (cjzVar6.i) {
                                if (!cjzVar.c || !cjzVar2.c) {
                                    return;
                                }
                                int i10 = cjzVar5.f + cjzVar5.e;
                                int i11 = cjzVar6.f - cjzVar6.e;
                                int i12 = ((cjz) cjzVar.k.get(0)).f + cjzVar.e;
                                int i13 = ((cjz) cjzVar2.k.get(0)).f - cjzVar2.e;
                                int[] iArr2 = a;
                                n(iArr2, i10, i11, i12, i13, f2, i5);
                                ckaVar.c(iArr2[0]);
                                this.d.i.e.c(iArr2[1]);
                            }
                        }
                        if (!cjzVar5.c) {
                            return;
                        }
                        cjz cjzVar7 = this.i;
                        if (!cjzVar7.c || !cjzVar.c || !cjzVar2.c) {
                            return;
                        }
                        int i14 = ((cjz) cjzVar5.k.get(0)).f + cjzVar5.e;
                        int i15 = ((cjz) cjzVar7.k.get(0)).f - cjzVar7.e;
                        int i16 = ((cjz) cjzVar.k.get(0)).f + cjzVar.e;
                        int i17 = ((cjz) cjzVar2.k.get(0)).f - cjzVar2.e;
                        int[] iArr3 = a;
                        n(iArr3, i14, i15, i16, i17, f2, i5);
                        ckaVar.c(iArr3[0]);
                        this.d.i.e.c(iArr3[1]);
                    } else if (z && z3) {
                        cjz cjzVar8 = this.h;
                        if (!cjzVar8.c) {
                            return;
                        }
                        cjz cjzVar9 = this.i;
                        if (!cjzVar9.c) {
                            return;
                        }
                        float f3 = cjnVar2.X;
                        int i18 = (((cjz) cjzVar9.k.get(0)).f - cjzVar9.e) - (((cjz) cjzVar8.k.get(0)).f + cjzVar8.e);
                        if (i5 == -1 || i5 == 0) {
                            int iH = h(i18, 0);
                            int i19 = (int) ((iH * f3) + 0.5f);
                            int iH2 = h(i19, 1);
                            if (i19 != iH2) {
                                iH = (int) ((iH2 / f3) + 0.5f);
                            }
                            ckaVar.c(iH);
                            this.d.i.e.c(iH2);
                        } else {
                            int iH3 = h(i18, 0);
                            int i20 = (int) ((iH3 / f3) + 0.5f);
                            int iH4 = h(i20, 1);
                            if (i20 != iH4) {
                                iH3 = (int) ((iH4 * f3) + 0.5f);
                            }
                            ckaVar.c(iH3);
                            this.d.i.e.c(iH4);
                        }
                    } else if (z2 && z4) {
                        if (!cjzVar.c || !cjzVar2.c) {
                            return;
                        }
                        float f4 = cjnVar2.X;
                        int i21 = (((cjz) cjzVar2.k.get(0)).f - cjzVar2.e) - (((cjz) cjzVar.k.get(0)).f + cjzVar.e);
                        if (i5 != 0) {
                            int iH5 = h(i21, 1);
                            int i22 = (int) ((iH5 / f4) + 0.5f);
                            int iH6 = h(i22, 0);
                            if (i22 != iH6) {
                                iH5 = (int) ((iH6 * f4) + 0.5f);
                            }
                            ckaVar.c(iH6);
                            this.d.i.e.c(iH5);
                        } else {
                            int iH7 = h(i21, 1);
                            int i23 = (int) ((iH7 * f4) + 0.5f);
                            int iH8 = h(i23, 0);
                            if (i23 != iH8) {
                                iH7 = (int) ((iH8 / f4) + 0.5f);
                            }
                            ckaVar.c(iH8);
                            this.d.i.e.c(iH7);
                        }
                    }
                } else {
                    int i24 = cjnVar2.Y;
                    if (i24 == -1 || i24 != 0) {
                        float f5 = cjnVar2.i.e.f;
                        float f6 = cjnVar2.X;
                        f = f5 * f6;
                        ckaVar.c((int) (f + 0.5f));
                    } else {
                        f = cjnVar2.i.e.f / cjnVar2.X;
                        ckaVar.c((int) (f + 0.5f));
                    }
                }
            }
        }
        cjz cjzVar10 = this.h;
        if (cjzVar10.c) {
            cjz cjzVar11 = this.i;
            if (cjzVar11.c) {
                if (cjzVar10.i && cjzVar11.i && ckaVar.i) {
                    return;
                }
                if (!ckaVar.i && this.j == 3) {
                    cjn cjnVar4 = this.d;
                    if (cjnVar4.s == 0 && !cjnVar4.H()) {
                        cjz cjzVar12 = (cjz) cjzVar10.k.get(0);
                        cjz cjzVar13 = (cjz) cjzVar11.k.get(0);
                        int i25 = cjzVar12.f + cjzVar10.e;
                        int i26 = cjzVar13.f + cjzVar11.e;
                        cjzVar10.c(i25);
                        cjzVar11.c(i26);
                        ckaVar.c(i26 - i25);
                        return;
                    }
                }
                if (!ckaVar.i && this.j == 3 && this.c == 1) {
                    List list = cjzVar10.k;
                    if (list.size() > 0) {
                        List list2 = cjzVar11.k;
                        if (list2.size() > 0) {
                            cjz cjzVar14 = (cjz) list.get(0);
                            int iMin = Math.min((((cjz) list2.get(0)).f + cjzVar11.e) - (cjzVar14.f + cjzVar10.e), ckaVar.m);
                            cjn cjnVar5 = this.d;
                            int i27 = cjnVar5.w;
                            int iMax = Math.max(cjnVar5.v, iMin);
                            if (i27 > 0) {
                                iMax = Math.min(i27, iMax);
                            }
                            ckaVar.c(iMax);
                        }
                    }
                }
                if (ckaVar.i) {
                    cjz cjzVar15 = (cjz) cjzVar10.k.get(0);
                    cjz cjzVar16 = (cjz) cjzVar11.k.get(0);
                    int i28 = cjzVar15.f;
                    int i29 = cjzVar10.e + i28;
                    int i30 = cjzVar16.f;
                    int i31 = cjzVar11.e + i30;
                    float f7 = this.d.ae;
                    if (cjzVar15 == cjzVar16) {
                        f7 = 0.5f;
                    }
                    if (cjzVar15 != cjzVar16) {
                        i30 = i31;
                    }
                    if (cjzVar15 != cjzVar16) {
                        i28 = i29;
                    }
                    cjzVar10.c((int) (i28 + 0.5f + (((i30 - i28) - ckaVar.f) * f7)));
                    cjzVar11.c(cjzVar10.f + ckaVar.f);
                }
            }
        }
    }

    public final void g() {
        this.g = false;
        cjz cjzVar = this.h;
        cjzVar.b();
        cjzVar.i = false;
        cjz cjzVar2 = this.i;
        cjzVar2.b();
        cjzVar2.i = false;
        this.e.i = false;
    }

    public final String toString() {
        return "HorizontalRun ".concat(String.valueOf(this.d.ai));
    }
}
