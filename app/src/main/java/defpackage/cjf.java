package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjf {
    public static boolean a = false;
    public static long b;
    public final pmg j;
    private final cje r;
    private cje s;
    private int k = 1000;
    public boolean c = false;
    int d = 0;
    private int l = 32;
    private int m = 32;
    public boolean f = false;
    public boolean g = false;
    private boolean[] n = new boolean[32];
    int h = 1;
    int i = 0;
    private int o = 32;
    private cji[] p = new cji[1000];
    private int q = 0;
    cje[] e = new cje[32];

    public cjf() {
        t();
        pmg pmgVar = new pmg((char[]) null);
        this.j = pmgVar;
        this.r = new cjh(pmgVar);
        this.s = new cje(pmgVar);
    }

    public static final int o(Object obj) {
        cji cjiVar = ((cjm) obj).h;
        if (cjiVar != null) {
            return (int) (cjiVar.f + 0.5f);
        }
        return 0;
    }

    private final void q(cje cjeVar) {
        int i;
        if (cjeVar.d) {
            cjeVar.a.d(this, cjeVar.b);
        } else {
            cje[] cjeVarArr = this.e;
            int i2 = this.i;
            cjeVarArr[i2] = cjeVar;
            cji cjiVar = cjeVar.a;
            cjiVar.d = i2;
            this.i = i2 + 1;
            cjiVar.e(this, cjeVar);
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < this.i) {
                if (this.e[i3] == null) {
                    System.out.println("WTF");
                }
                cje cjeVar2 = this.e[i3];
                if (cjeVar2 != null && cjeVar2.d) {
                    cjeVar2.a.d(this, cjeVar2.b);
                    ((iua) this.j.a).f(cjeVar2);
                    this.e[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.i;
                        if (i4 >= i) {
                            break;
                        }
                        cje[] cjeVarArr2 = this.e;
                        int i6 = i4 - 1;
                        cje cjeVar3 = cjeVarArr2[i4];
                        cjeVarArr2[i6] = cjeVar3;
                        cji cjiVar2 = cjeVar3.a;
                        if (cjiVar2.d == i4) {
                            cjiVar2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.e[i5] = null;
                    }
                    this.i = i - 1;
                    i3--;
                }
                i3++;
            }
            this.c = false;
        }
    }

    private final void r() {
        for (int i = 0; i < this.i; i++) {
            cje cjeVar = this.e[i];
            cjeVar.a.f = cjeVar.b;
        }
    }

    private final void s() {
        int i = this.l;
        int i2 = i + i;
        this.l = i2;
        this.e = (cje[]) Arrays.copyOf(this.e, i2);
        pmg pmgVar = this.j;
        pmgVar.c = (cji[]) Arrays.copyOf((Object[]) pmgVar.c, this.l);
        int i3 = this.l;
        this.n = new boolean[i3];
        this.m = i3;
        this.o = i3;
    }

    private final void t() {
        for (int i = 0; i < this.i; i++) {
            cje cjeVar = this.e[i];
            if (cjeVar != null) {
                ((iua) this.j.a).f(cjeVar);
            }
            this.e[i] = null;
        }
    }

    private final void u(cje cjeVar) {
        cjd cjdVar;
        int i;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.n[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            z = true;
            i3++;
            int i4 = this.h;
            if (i3 >= i4 + i4) {
                return;
            }
            cji cjiVar = cjeVar.a;
            if (cjiVar != null) {
                this.n[cjiVar.c] = true;
            }
            cji cjiVarK = cjeVar.k(this.n);
            if (cjiVarK != null) {
                boolean[] zArr = this.n;
                int i5 = cjiVarK.c;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (cjiVarK != null) {
                float f = Float.MAX_VALUE;
                int i6 = -1;
                for (int i7 = 0; i7 < this.i; i7++) {
                    cje cjeVar2 = this.e[i7];
                    if (cjeVar2.a.n != 1 && !cjeVar2.d && (i = (cjdVar = cjeVar2.e).e) != -1) {
                        int i8 = 0;
                        while (true) {
                            if (i == -1 || i8 >= cjdVar.a) {
                                break;
                            }
                            if (cjdVar.b[i] == cjiVarK.c) {
                                float fA = cjeVar2.e.a(cjiVarK);
                                if (fA < 0.0f) {
                                    float f2 = (-cjeVar2.b) / fA;
                                    if (f2 < f) {
                                        i6 = i7;
                                        f = f2;
                                    }
                                }
                            } else {
                                i = cjdVar.c[i];
                                i8++;
                            }
                        }
                    }
                }
                if (i6 >= 0) {
                    cje cjeVar3 = this.e[i6];
                    cjeVar3.a.d = -1;
                    cjeVar3.b(cjiVarK);
                    cji cjiVar2 = cjeVar3.a;
                    cjiVar2.d = i6;
                    cjiVar2.e(this, cjeVar3);
                }
                z = false;
            }
        }
    }

    private final cji v(int i) {
        cji cjiVar = (cji) ((iua) this.j.b).e();
        if (cjiVar == null) {
            cjiVar = new cji(i);
            cjiVar.n = i;
        } else {
            cjiVar.c();
            cjiVar.n = i;
        }
        int i2 = this.q;
        int i3 = this.k;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            this.k = i4;
            this.p = (cji[]) Arrays.copyOf(this.p, i4);
        }
        cji[] cjiVarArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        cjiVarArr[i5] = cjiVar;
        return cjiVar;
    }

    public final cje a() {
        pmg pmgVar = this.j;
        cje cjeVar = (cje) ((iua) pmgVar.a).e();
        if (cjeVar == null) {
            cjeVar = new cje(pmgVar);
            b++;
        } else {
            cjeVar.a = null;
            cjeVar.e.f();
            cjeVar.b = 0.0f;
            cjeVar.d = false;
        }
        cji.a++;
        return cjeVar;
    }

    public final cji b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            s();
        }
        cjm cjmVar = (cjm) obj;
        cji cjiVar = cjmVar.h;
        if (cjiVar == null) {
            cjmVar.i();
            cjiVar = cjmVar.h;
        }
        int i = cjiVar.c;
        if (i != -1) {
            if (i <= this.d && ((cji[]) this.j.c)[i] != null) {
                return cjiVar;
            }
            if (i != -1) {
                cjiVar.c();
            }
        }
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        cjiVar.c = i2;
        cjiVar.n = 1;
        ((cji[]) this.j.c)[i2] = cjiVar;
        return cjiVar;
    }

    public final cji c() {
        if (this.h + 1 >= this.m) {
            s();
        }
        cji cjiVarV = v(3);
        int i = this.d + 1;
        this.d = i;
        this.h++;
        cjiVarV.c = i;
        ((cji[]) this.j.c)[i] = cjiVarV;
        return cjiVarV;
    }

    public final void d(cji cjiVar, cji cjiVar2, int i, float f, cji cjiVar3, cji cjiVar4, int i2, int i3) {
        cje cjeVarA = a();
        if (cjiVar2 == cjiVar3) {
            cjeVarA.e.g(cjiVar, 1.0f);
            cjeVarA.e.g(cjiVar4, 1.0f);
            cjeVarA.e.g(cjiVar2, -2.0f);
        } else if (f == 0.5f) {
            cjeVarA.e.g(cjiVar, 1.0f);
            cjeVarA.e.g(cjiVar2, -1.0f);
            cjeVarA.e.g(cjiVar3, -1.0f);
            cjeVarA.e.g(cjiVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                cjeVarA.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            cjeVarA.e.g(cjiVar, -1.0f);
            cjeVarA.e.g(cjiVar2, 1.0f);
            cjeVarA.b = i;
        } else if (f >= 1.0f) {
            cjeVarA.e.g(cjiVar4, -1.0f);
            cjeVarA.e.g(cjiVar3, 1.0f);
            cjeVarA.b = -i2;
        } else {
            float f2 = 1.0f - f;
            cjeVarA.e.g(cjiVar, f2);
            cjeVarA.e.g(cjiVar2, -f2);
            cjeVarA.e.g(cjiVar3, -f);
            cjeVarA.e.g(cjiVar4, f);
            if (i > 0 || i2 > 0) {
                cjeVarA.b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            cjeVarA.f(this, i3);
        }
        e(cjeVarA);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b6 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.cje r18) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjf.e(cje):void");
    }

    public final void f(cji cjiVar, int i) {
        int i2 = cjiVar.d;
        if (i2 == -1) {
            cjiVar.d(this, i);
            for (int i3 = 0; i3 < this.d + 1; i3++) {
                cji cjiVar2 = ((cji[]) this.j.c)[i3];
            }
            return;
        }
        if (i2 == -1) {
            float f = i;
            cje cjeVarA = a();
            cjeVarA.a = cjiVar;
            cjiVar.f = f;
            cjeVarA.b = f;
            cjeVarA.d = true;
            e(cjeVarA);
            return;
        }
        cje cjeVar = this.e[i2];
        if (cjeVar.d) {
            cjeVar.b = i;
            return;
        }
        if (cjeVar.e.a == 0) {
            cjeVar.d = true;
            cjeVar.b = i;
            return;
        }
        cje cjeVarA2 = a();
        if (i < 0) {
            cjeVarA2.b = -i;
            cjeVarA2.e.g(cjiVar, 1.0f);
        } else {
            cjeVarA2.b = i;
            cjeVarA2.e.g(cjiVar, -1.0f);
        }
        e(cjeVarA2);
    }

    public final void g(cji cjiVar, cji cjiVar2, int i, int i2) {
        cje cjeVarA = a();
        cji cjiVarC = c();
        cjiVarC.e = 0;
        cjeVarA.h(cjiVar, cjiVar2, cjiVarC, i);
        if (i2 != 8) {
            i(cjeVarA, (int) (-cjeVarA.e.a(cjiVarC)), i2);
        }
        e(cjeVarA);
    }

    public final void h(cji cjiVar, cji cjiVar2, int i, int i2) {
        cje cjeVarA = a();
        cji cjiVarC = c();
        cjiVarC.e = 0;
        cjeVarA.i(cjiVar, cjiVar2, cjiVarC, i);
        if (i2 != 8) {
            i(cjeVarA, (int) (-cjeVarA.e.a(cjiVarC)), i2);
        }
        e(cjeVarA);
    }

    final void i(cje cjeVar, int i, int i2) {
        cjeVar.e.g(p(i2), i);
    }

    public final void j() {
        cje cjeVar = this.r;
        if (cjeVar.e()) {
            r();
            return;
        }
        if (!this.g) {
            l(cjeVar);
            return;
        }
        for (int i = 0; i < this.i; i++) {
            if (!this.e[i].d) {
                l(cjeVar);
                return;
            }
        }
        r();
    }

    public final void k() {
        pmg pmgVar;
        int i = 0;
        while (true) {
            pmgVar = this.j;
            cji[] cjiVarArr = (cji[]) pmgVar.c;
            if (i >= cjiVarArr.length) {
                break;
            }
            cji cjiVar = cjiVarArr[i];
            if (cjiVar != null) {
                cjiVar.c();
            }
            i++;
        }
        Object obj = pmgVar.b;
        cji[] cjiVarArr2 = this.p;
        int i2 = this.q;
        int length = cjiVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            cji cjiVar2 = cjiVarArr2[i3];
            iua iuaVar = (iua) obj;
            int i4 = iuaVar.a;
            if (i4 < 256) {
                ((Object[]) iuaVar.b)[i4] = cjiVar2;
                iuaVar.a = i4 + 1;
            }
        }
        this.q = 0;
        Arrays.fill((Object[]) pmgVar.c, (Object) null);
        this.d = 0;
        cjh cjhVar = (cjh) this.r;
        cjhVar.f = 0;
        cjhVar.b = 0.0f;
        this.h = 1;
        for (int i5 = 0; i5 < this.i; i5++) {
            cje cjeVar = this.e[i5];
        }
        t();
        this.i = 0;
        this.s = new cje(pmgVar);
    }

    final void l(cje cjeVar) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.i) {
                break;
            }
            cje cjeVar2 = this.e[i];
            if (cjeVar2.a.n != 1) {
                float f = 0.0f;
                if (cjeVar2.b < 0.0f) {
                    boolean z2 = false;
                    int i2 = 0;
                    while (!z2) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.i) {
                            cje cjeVar3 = this.e[i5];
                            if (cjeVar3.a.n != 1 && !cjeVar3.d && cjeVar3.b < f) {
                                int i7 = cjeVar3.e.a;
                                int i8 = 0;
                                while (i8 < i7) {
                                    cji cjiVarD = cjeVar3.e.d(i8);
                                    float fA = cjeVar3.e.a(cjiVarD);
                                    if (fA > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = cjiVarD.h[i9] / fA;
                                            if ((f3 < f2 && i9 == i6) || i9 > i6) {
                                                i4 = cjiVarD.c;
                                                i6 = i9;
                                                f2 = f3;
                                                i3 = i5;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i5++;
                            f = 0.0f;
                        }
                        if (i3 != -1) {
                            cje cjeVar4 = this.e[i3];
                            cjeVar4.a.d = -1;
                            cjeVar4.b(((cji[]) this.j.c)[i4]);
                            cji cjiVar = cjeVar4.a;
                            cjiVar.d = i3;
                            cjiVar.e(this, cjeVar4);
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 = (!(i2 <= this.h / 2)) | z;
                        f = 0.0f;
                    }
                }
            }
            i++;
        }
        u(cjeVar);
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.cji r6, defpackage.cji r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L17
            boolean r9 = r7.g
            if (r9 == 0) goto L16
            int r9 = r6.d
            r1 = -1
            if (r9 == r1) goto Le
            goto L16
        Le:
            float r7 = r7.f
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.d(r5, r7)
            return
        L16:
            r9 = r0
        L17:
            cje r1 = r5.a()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L38
            if (r8 >= 0) goto L26
            int r8 = -r8
            r4 = 1
            goto L27
        L26:
            r4 = 0
        L27:
            float r8 = (float) r8
            r1.b = r8
            if (r4 != 0) goto L2d
            goto L38
        L2d:
            cjd r8 = r1.e
            r8.g(r6, r2)
            cjd r6 = r1.e
            r6.g(r7, r3)
            goto L42
        L38:
            cjd r8 = r1.e
            r8.g(r6, r3)
            cjd r6 = r1.e
            r6.g(r7, r2)
        L42:
            if (r9 == r0) goto L47
            r1.f(r5, r9)
        L47:
            r5.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjf.m(cji, cji, int, int):void");
    }

    public final void n(cji cjiVar, cji cjiVar2, cji cjiVar3, cji cjiVar4, float f) {
        cje cjeVarA = a();
        cjeVarA.g(cjiVar, cjiVar2, cjiVar3, cjiVar4, f);
        e(cjeVarA);
    }

    public final cji p(int i) {
        if (this.h + 1 >= this.m) {
            s();
        }
        cji cjiVarV = v(4);
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        cjiVarV.c = i2;
        cjiVarV.e = i;
        ((cji[]) this.j.c)[i2] = cjiVarV;
        cjh cjhVar = (cjh) this.r;
        cjg cjgVar = cjhVar.g;
        cjgVar.a = cjiVarV;
        Arrays.fill(cjgVar.a.i, 0.0f);
        cjiVarV.i[cjiVarV.e] = 1.0f;
        cjhVar.m(cjiVarV);
        return cjiVarV;
    }
}
