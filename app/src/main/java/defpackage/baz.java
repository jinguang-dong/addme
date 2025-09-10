package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class baz {
    public final baw a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public yq s;
    public yq t;
    private yo u;
    private final lwm v;
    private final lwm w;
    private final lwm x;

    public baz(baw bawVar) {
        this.a = bawVar;
        this.b = bawVar.a;
        this.c = bawVar.c;
        this.d = bawVar.h;
        this.e = bawVar.i;
        this.s = bawVar.j;
        int i = bawVar.b;
        this.f = i;
        this.g = (this.b.length / 5) - i;
        int i2 = bawVar.d;
        this.j = i2;
        this.k = this.c.length - i2;
        this.l = i;
        this.v = new lwm(null);
        this.w = new lwm(null);
        this.x = new lwm(null);
        this.p = i;
        this.q = -1;
    }

    public static final int V(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static /* synthetic */ void X(baz bazVar) {
        int i = bazVar.q;
        int iH = bazVar.h(i) * 5;
        int[] iArr = bazVar.b;
        int i2 = iH + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) == 0) {
            bazVar.P(bazVar.l(i));
        }
    }

    private final int ab(int[] iArr, int i) {
        return c(iArr, i) + Integer.bitCount(iArr[(i * 5) + 1] >> 29);
    }

    private final int ac(int[] iArr, int i) {
        return ad(iArr[(h(i) * 5) + 2]);
    }

    private final int ad(int i) {
        return i > -2 ? i : f() + i + 2;
    }

    private final int ae(int i, int i2) {
        return i < i2 ? i : -((f() - i) + 2);
    }

    private final void af() {
        this.w.e((e() - this.g) - this.p);
    }

    private final void ag(int i, Object obj, boolean z, Object obj2) {
        int iA;
        lwm lwmVar = this.x;
        int i2 = this.q;
        int i3 = this.m;
        lwmVar.e(this.n);
        if (i3 > 0) {
            int i4 = this.o;
            int iC = c(this.b, h(i4));
            D(1);
            this.h = iC;
            this.i = iC;
            int iH = h(i4);
            Object obj3 = ayb.a;
            int i5 = obj != obj3 ? 1 : 0;
            int i6 = (z || obj2 == obj3) ? 0 : 1;
            int i7 = this.k;
            int i8 = this.j;
            int length = this.c.length;
            int iV = V(iC, i8, i7, length);
            if (iV >= 0 && this.l < i4) {
                iV = -(((length - i7) - iV) + 1);
            }
            int[] iArr = this.b;
            int i9 = this.q;
            int i10 = iH * 5;
            iArr[i10] = i;
            iArr[i10 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i10 + 2] = i9;
            iArr[i10 + 3] = 0;
            iArr[i10 + 4] = iV;
            int i11 = (z ? 1 : 0) + i5 + i6;
            if (i11 > 0) {
                E(i11, i4);
                Object[] objArr = this.c;
                int i12 = this.h;
                if (z) {
                    objArr[i12] = obj2;
                    i12++;
                }
                if (i5 != 0) {
                    objArr[i12] = obj;
                    i12++;
                }
                if (i6 != 0) {
                    objArr[i12] = obj2;
                    i12++;
                }
                this.h = i12;
            }
            this.n = 0;
            iA = i4 + 1;
            this.q = i4;
            this.o = iA;
            if (i2 >= 0 && aa(i2) != null) {
                throw null;
            }
        } else {
            this.v.e(i2);
            af();
            int i13 = this.o;
            int iH2 = h(i13);
            if (!a.ao(obj2, ayb.a)) {
                if (z) {
                    Q(this.o, obj2);
                } else {
                    O(obj2);
                }
            }
            this.h = n(this.b, iH2);
            this.i = c(this.b, h(this.o + 1));
            int[] iArr2 = this.b;
            this.n = iArr2[(iH2 * 5) + 1] & 67108863;
            this.q = i13;
            this.o = i13 + 1;
            iA = i13 + bay.a(iArr2, iH2);
        }
        this.p = iA;
    }

    private static final int ah(int i, int i2, int i3) {
        return i < 0 ? (i3 - i2) + i + 1 : i;
    }

    private final void ai() {
        this.p = (e() - this.g) - this.w.c();
    }

    private final void aj(Object obj) {
        if (this.m > 0) {
            E(1, this.q);
        }
        Object[] objArr = this.c;
        int i = this.h;
        int i2 = i + 1;
        this.h = i2;
        Object obj2 = objArr[d(i)];
        if (i2 > this.i) {
            ayi.i("Writing to an invalid slot");
        }
        this.c[d(this.h - 1)] = obj;
    }

    public final void A() {
        if (this.m <= 0) {
            bad.b("Unbalanced begin/end insert");
        }
        int i = this.m - 1;
        this.m = i;
        if (i == 0) {
            if (this.x.a != this.v.a) {
                ayi.i("startGroup/endGroup mismatch while inserting");
            }
            ai();
        }
    }

    public final void B(int i) {
        if (this.m > 0) {
            ayi.i("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.q;
        if (i2 != i) {
            if (i < i2 || i >= this.p) {
                ayi.i(a.bu(i2, i, "Started group at ", " must be a subgroup of the group at "));
            }
            int i3 = this.o;
            int i4 = this.h;
            int i5 = this.i;
            this.o = i;
            L();
            this.o = i3;
            this.h = i4;
            this.i = i5;
        }
    }

    public final void C(int i, int i2, int i3) {
        int iAe = ae(i, this.f);
        while (i3 < i2) {
            int[] iArr = this.b;
            iArr[(h(i3) * 5) + 2] = iAe;
            int iA = bay.a(iArr, h(i3)) + i3;
            C(i3, iA, i3 + 1);
            i3 = iA;
        }
    }

    public final void D(int i) {
        if (i > 0) {
            int i2 = this.o;
            F(i2);
            int i3 = this.f;
            int i4 = this.g;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length + length, i5 + i), 32);
                int i6 = iMax * 5;
                int i7 = iMax - i5;
                int[] iArr2 = new int[i6];
                rnt.aw(iArr, iArr2, 0, 0, i3 * 5);
                rnt.aw(iArr, iArr2, (i3 + i7) * 5, (i4 + i3) * 5, length * 5);
                this.b = iArr2;
                i4 = i7;
            }
            int i8 = this.p;
            if (i8 >= i3) {
                this.p = i8 + i;
            }
            int i9 = i3 + i;
            this.f = i9;
            this.g = i4 - i;
            int iV = V(i5 > 0 ? b(i2 + i) : 0, this.l >= i3 ? this.j : 0, this.k, this.c.length);
            for (int i10 = i3; i10 < i9; i10++) {
                this.b[(i10 * 5) + 4] = iV;
            }
            int i11 = this.l;
            if (i11 >= i3) {
                this.l = i11 + i;
            }
        }
    }

    public final void E(int i, int i2) {
        if (i > 0) {
            G(this.h, i2);
            int i3 = this.j;
            int i4 = this.k;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length + length, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.i;
            if (i9 >= i3) {
                this.i = i9 + i;
            }
            this.j = i3 + i;
            this.k = i4 - i;
        }
    }

    public final void F(int i) {
        axq axqVar;
        int i2;
        axq axqVar2;
        int i3;
        int i4;
        int i5 = this.g;
        int i6 = this.f;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iE = e() - this.g;
                if (i6 < i) {
                    for (int iB = bay.b(this.d, i6, iE); iB < this.d.size() && (i3 = (axqVar2 = (axq) this.d.get(iB)).a) < 0 && (i4 = i3 + iE) < i; iB++) {
                        axqVar2.a = i4;
                    }
                } else {
                    for (int iB2 = bay.b(this.d, i, iE); iB2 < this.d.size() && (i2 = (axqVar = (axq) this.d.get(iB2)).a) >= 0; iB2++) {
                        axqVar.a = -(iE - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                int i10 = i7 + i8;
                if (i < i6) {
                    rnt.aw(iArr, iArr, i10, i7, i9);
                } else {
                    rnt.aw(iArr, iArr, i9, i8 + i9, i10);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iE2 = e();
            if (i6 >= iE2) {
                ayi.i("Check failed");
            }
            while (i6 < iE2) {
                int i11 = (i6 * 5) + 2;
                int i12 = this.b[i11];
                int iAe = ae(ad(i12), i);
                if (iAe != i12) {
                    this.b[i11] = iAe;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.f = i;
    }

    public final void G(int i, int i2) {
        int i3 = this.k;
        int i4 = this.j;
        int i5 = this.l;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, f());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iH = h(iMin);
                int iH2 = h(i5);
                int i7 = this.f;
                while (iH < iH2) {
                    int i8 = (iH * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        ayi.i("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iH++;
                    if (iH == i7) {
                        iH += this.g;
                    }
                }
            } else {
                int iH3 = h(i5);
                int iH4 = h(iMin);
                while (iH3 < iH4) {
                    int i10 = (iH3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        ayi.i("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iH3++;
                    if (iH3 == this.f) {
                        iH3 += this.g;
                    }
                }
            }
            this.l = iMin;
        }
        this.j = i;
    }

    public final void H() {
        int i;
        yo yoVar = this.u;
        if (yoVar != null) {
            while (bae.c(yoVar)) {
                int iA = bae.a(yoVar);
                int iH = h(iA) * 5;
                int iJ = iA + 1;
                int iJ2 = j(iA) + iA;
                while (true) {
                    if (iJ >= iJ2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(h(iJ) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iJ += j(iJ);
                    }
                }
                int[] iArr = this.b;
                int i2 = iH + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iL = l(iA);
                    if (iL >= 0) {
                        bae.b(yoVar, iL);
                    }
                }
            }
        }
    }

    public final void I(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.k;
            int i5 = i + i2;
            G(i5, i3);
            this.j = i;
            this.k = i4 + i2;
            rnt.af(this.c, null, i, i5);
            int i6 = this.i;
            if (i6 >= i) {
                this.i = i6 - i2;
            }
        }
    }

    public final void J() {
        int i = this.p;
        this.o = i;
        this.h = c(this.b, h(i));
    }

    public final void K(int i, Object obj, Object obj2) {
        ag(i, obj, false, obj2);
    }

    public final void L() {
        if (this.m != 0) {
            ayi.i("Key must be supplied when inserting");
        }
        Object obj = ayb.a;
        ag(0, obj, false, obj);
    }

    public final void M(int i, Object obj) {
        ag(i, obj, false, ayb.a);
    }

    public final void N(int i, Object obj) {
        ag(i, obj, true, ayb.a);
    }

    public final void O(Object obj) {
        int iH = h(this.o);
        if ((this.b[(iH * 5) + 1] & 268435456) == 0) {
            ayi.i("Updating the data of a group that was not created with a data slot");
        }
        this.c[d(ab(this.b, iH))] = obj;
    }

    public final void P(int i) {
        if (i >= 0) {
            yo yoVar = this.u;
            if (yoVar == null) {
                yoVar = new yo((byte[]) null);
                this.u = yoVar;
            }
            bae.b(yoVar, i);
        }
    }

    public final void Q(int i, Object obj) {
        int iH = h(i);
        int[] iArr = this.b;
        if (iH >= iArr.length || (iArr[(iH * 5) + 1] & 1073741824) == 0) {
            ayi.i(a.bE(i, "Updating the node of a group at ", " that was not created with as a node group"));
        }
        this.c[d(c(this.b, iH))] = obj;
    }

    public final boolean R(int i, int i2) {
        int iE;
        int iJ;
        if (i2 == this.q) {
            iE = this.p;
        } else {
            lwm lwmVar = this.v;
            if (i2 > lwmVar.b(0)) {
                iJ = j(i2);
            } else {
                int[] iArr = (int[]) lwmVar.b;
                int iMin = Math.min(iArr.length, lwmVar.a);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iJ = j(i2);
                } else {
                    iE = (e() - this.g) - ((int[]) this.w.b)[i3];
                }
            }
            iE = iJ + i2;
        }
        return i > i2 && i < iE;
    }

    public final boolean S(int i) {
        return (this.b[(h(i) * 5) + 1] & 1073741824) != 0;
    }

    public final boolean T() {
        if (this.m != 0) {
            ayi.i("Cannot remove group while inserting");
        }
        int i = this.o;
        int i2 = this.h;
        int iC = c(this.b, h(i));
        int iM = m();
        if (aa(this.q) != null && s(i) != null) {
            throw null;
        }
        yo yoVar = this.u;
        if (yoVar != null) {
            while (bae.c(yoVar)) {
                if (yoVar.b == 0) {
                    a.bo("IntList is empty.");
                }
                if (yoVar.a[0] < i) {
                    break;
                }
                bae.a(yoVar);
            }
        }
        boolean zU = U(i, this.o - i);
        I(iC, this.h - iC, i - 1);
        this.o = i;
        this.h = i2;
        this.n -= iM;
        return zU;
    }

    public final boolean U(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            F(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.e;
                int i3 = i + i2;
                int iB = bay.b(this.d, i3, e() - this.g);
                if (iB >= this.d.size()) {
                    iB--;
                }
                int i4 = iB + 1;
                int i5 = 0;
                while (iB >= 0) {
                    axq axqVar = (axq) this.d.get(iB);
                    int iA = a(axqVar);
                    if (iA < i) {
                        break;
                    }
                    if (iA < i3) {
                        axqVar.a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iB + 1;
                        }
                        i4 = iB;
                    }
                    iB--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.f = i;
            this.g += i2;
            int i6 = this.l;
            if (i6 > i) {
                this.l = Math.max(i, i6 - i2);
            }
            int i7 = this.p;
            if (i7 >= this.f) {
                this.p = i7 - i2;
            }
            int i8 = this.q;
            if (i8 >= 0 && (this.b[(h(i8) * 5) + 1] & 67108864) != 0) {
                P(i8);
            }
        }
        return z;
    }

    public final void W() {
        zo zoVar;
        int i = this.m;
        int i2 = this.o;
        int i3 = this.p;
        int i4 = this.q;
        int iH = h(i4);
        int i5 = i2 - i4;
        int i6 = this.n;
        int i7 = (iH * 5) + 1;
        int i8 = this.b[i7] & 1073741824;
        if (i > 0) {
            yq yqVar = this.t;
            if (yqVar != null && (zoVar = (zo) yqVar.a(i4)) != null) {
                Object[] objArr = zoVar.a;
                int i9 = zoVar.b;
                for (int i10 = 0; i10 < i9; i10++) {
                    aj(objArr[i10]);
                }
            }
            bay.h(this.b, iH, i5);
            bay.i(this.b, iH, i6);
            lwm lwmVar = this.x;
            if (i8 != 0) {
                i6 = 1;
            }
            this.n = lwmVar.c() + i6;
            int iAc = ac(this.b, i4);
            this.q = iAc;
            int iF = iAc < 0 ? f() : h(iAc + 1);
            iC = iF >= 0 ? c(this.b, iF) : 0;
            this.h = iC;
            this.i = iC;
            return;
        }
        if (i2 != i3) {
            ayi.i("Expected to be at the end of a group");
        }
        int iA = bay.a(this.b, iH);
        int[] iArr = this.b;
        int i11 = iArr[i7] & 67108863;
        bay.h(iArr, iH, i5);
        bay.i(this.b, iH, i6);
        int iC = this.v.c();
        ai();
        this.q = iC;
        int iAc2 = ac(this.b, i4);
        int iC2 = this.x.c();
        this.n = iC2;
        if (iAc2 == iC) {
            this.n = iC2 + (i8 == 0 ? i6 - i11 : 0);
            return;
        }
        int i12 = i5 - iA;
        int i13 = i8 != 0 ? 0 : i6 - i11;
        if (i12 != 0 || i13 != 0) {
            while (iAc2 != 0 && iAc2 != iC) {
                if (i13 == 0) {
                    if (i12 == 0) {
                        break;
                    } else {
                        i13 = 0;
                    }
                }
                int iH2 = h(iAc2);
                int i14 = (iH2 * 5) + 1;
                if (i12 != 0) {
                    bay.h(this.b, iH2, bay.a(this.b, iH2) + i12);
                }
                if (i13 != 0) {
                    int[] iArr2 = this.b;
                    bay.i(iArr2, iH2, (iArr2[i14] & 67108863) + i13);
                }
                int[] iArr3 = this.b;
                if ((iArr3[i14] & 1073741824) != 0) {
                    i13 = 0;
                }
                iAc2 = ac(iArr3, iAc2);
            }
            iC = i13;
        }
        this.n += iC;
    }

    public final void Y(baw bawVar, int i) {
        baw bawVar2;
        int i2;
        if (this.m <= 0) {
            ayi.i("Check failed");
        }
        if (i == 0) {
            if (this.o == 0 && this.a.b == 0) {
                int iA = bay.a(bawVar.a, 0);
                int i3 = bawVar.b;
                if (iA == i3) {
                    int[] iArr = this.b;
                    Object[] objArr = this.c;
                    ArrayList arrayList = this.d;
                    HashMap map = this.e;
                    yq yqVar = this.s;
                    int[] iArr2 = bawVar.a;
                    Object[] objArr2 = bawVar.c;
                    int i4 = bawVar.d;
                    HashMap map2 = bawVar.i;
                    yq yqVar2 = bawVar.j;
                    this.b = iArr2;
                    this.c = objArr2;
                    this.d = bawVar.h;
                    this.f = i3;
                    this.g = (iArr2.length / 5) - i3;
                    this.j = i4;
                    this.k = objArr2.length - i4;
                    this.l = i3;
                    this.e = map2;
                    this.s = yqVar2;
                    bawVar.g(iArr, 0, objArr, 0, arrayList, map, yqVar);
                    return;
                }
            }
            bawVar2 = bawVar;
            i2 = 0;
        } else {
            bawVar2 = bawVar;
            i2 = i;
        }
        baz bazVarC = bawVar2.c();
        try {
            byi.aj(bazVarC, i2, this, true, true, false);
            bazVarC.z(true);
        } catch (Throwable th) {
            bazVarC.z(false);
            throw th;
        }
    }

    public final void Z(Object obj) {
        if (this.m <= 0 || this.h == this.j) {
            aj(obj);
            return;
        }
        yq yqVar = this.t;
        byte[] bArr = null;
        if (yqVar == null) {
            yqVar = new yq((byte[]) null);
        }
        this.t = yqVar;
        int i = this.q;
        Object objA = yqVar.a(i);
        if (objA == null) {
            objA = new zo(bArr);
            yqVar.f(i, objA);
        }
        ((zo) objA).o(obj);
    }

    public final int a(axq axqVar) {
        int i = axqVar.a;
        return i < 0 ? f() + i : i;
    }

    public final bay aa(int i) {
        axq axqVarS;
        HashMap map = this.e;
        if (map == null || (axqVarS = s(i)) == null) {
            return null;
        }
        return (bay) map.get(axqVarS);
    }

    public final int b(int i) {
        return c(this.b, h(i));
    }

    public final int c(int[] iArr, int i) {
        return i >= e() ? this.c.length - this.k : ah(iArr[(i * 5) + 4], this.k, this.c.length);
    }

    public final int d(int i) {
        return i + (this.k * (i < this.j ? 0 : 1));
    }

    public final int e() {
        return this.b.length / 5;
    }

    public final int f() {
        return e() - this.g;
    }

    public final int g() {
        return this.c.length - this.k;
    }

    public final int h(int i) {
        return i + (this.g * (i < this.f ? 0 : 1));
    }

    public final int i(int i) {
        return this.b[h(i) * 5];
    }

    public final int j(int i) {
        return bay.a(this.b, h(i));
    }

    public final int k(int i) {
        return this.b[(h(i) * 5) + 1] & 67108863;
    }

    public final int l(int i) {
        return ac(this.b, i);
    }

    public final int m() {
        int i = this.o;
        int iH = h(i);
        int iA = i + bay.a(this.b, iH);
        this.o = iA;
        this.h = c(this.b, h(iA));
        int i2 = this.b[(iH * 5) + 1];
        if ((1073741824 & i2) != 0) {
            return 1;
        }
        return i2 & 67108863;
    }

    public final int n(int[] iArr, int i) {
        return i >= e() ? this.c.length - this.k : ah(bay.e(iArr, i), this.k, this.c.length);
    }

    public final int o(int i, int i2) {
        int iN = n(this.b, h(i));
        int iC = c(this.b, h(i + 1));
        int i3 = iN + i2;
        if (i3 >= iN && i3 < iC) {
            return i3;
        }
        ayi.i(a.bu(i, i2, "Write to an invalid slot index ", " for group "));
        return i3;
    }

    public final int p(int i) {
        return c(this.b, h(i + j(i)));
    }

    public final int q(int i) {
        return n(this.b, h(i));
    }

    public final axq r(int i) {
        ArrayList arrayList = this.d;
        int iD = bay.d(arrayList, i, f());
        if (iD >= 0) {
            return (axq) arrayList.get(iD);
        }
        if (i > this.f) {
            i = -(f() - i);
        }
        axq axqVar = new axq(i);
        arrayList.add(-(iD + 1), axqVar);
        return axqVar;
    }

    public final axq s(int i) {
        if (i < 0 || i >= f()) {
            return null;
        }
        return bay.f(this.d, i, f());
    }

    public final Object t(int i) {
        int iH = h(i);
        int[] iArr = this.b;
        return (iArr[(iH * 5) + 1] & 268435456) != 0 ? this.c[ab(iArr, iH)] : ayb.a;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.o + " end=" + this.p + " size = " + f() + " gap=" + this.f + '-' + (this.f + this.g) + ')';
    }

    public final Object u(int i) {
        int iH = h(i);
        int[] iArr = this.b;
        if ((iArr[(iH * 5) + 1] & 536870912) != 0) {
            return this.c[bay.c(iArr, iH)];
        }
        return null;
    }

    public final Object v(int i) {
        int iH = h(i);
        int[] iArr = this.b;
        if ((iArr[(iH * 5) + 1] & 1073741824) != 0) {
            return this.c[d(c(iArr, iH))];
        }
        return null;
    }

    public final Object w(int i, int i2, Object obj) {
        int iD = d(o(i, i2));
        Object[] objArr = this.c;
        Object obj2 = objArr[iD];
        objArr[iD] = obj;
        return obj2;
    }

    public final void x(int i) {
        if (i < 0) {
            ayi.i("Cannot seek backwards");
        }
        if (this.m > 0) {
            bad.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.o + i;
        if (i2 < this.q || i2 > this.p) {
            ayi.i("Cannot seek outside the current group (" + this.q + '-' + this.p + ')');
        }
        this.o = i2;
        int iC = c(this.b, h(i2));
        this.h = iC;
        this.i = iC;
    }

    public final void y() {
        int i = this.m;
        this.m = i + 1;
        if (i == 0) {
            af();
        }
    }

    public final void z(boolean z) {
        this.r = true;
        if (z && this.v.a == 0) {
            F(f());
            G(this.c.length - this.k, this.f);
            int i = this.j;
            rnt.af(this.c, null, i, this.k + i);
            H();
        }
        baw bawVar = this.a;
        int[] iArr = this.b;
        int i2 = this.f;
        Object[] objArr = this.c;
        int i3 = this.j;
        ArrayList arrayList = this.d;
        HashMap map = this.e;
        yq yqVar = this.s;
        if (!bawVar.f) {
            bad.a("Unexpected writer close()");
        }
        bawVar.f = false;
        bawVar.g(iArr, i2, objArr, i3, arrayList, map, yqVar);
    }
}
