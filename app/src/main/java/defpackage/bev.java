package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bev {
    public static final bev a = new bev(0, 0, new Object[0]);
    public Object[] b;
    private int c;
    private int d;
    private final byi e;

    public bev(int i, int i2, Object[] objArr, byi byiVar) {
        this.c = i;
        this.d = i2;
        this.e = byiVar;
        this.b = objArr;
    }

    private final int n() {
        if (this.d == 0) {
            return this.b.length >> 1;
        }
        int iBitCount = Integer.bitCount(this.c);
        int length = this.b.length;
        for (int i = iBitCount + iBitCount; i < length; i++) {
            iBitCount += i(i).n();
        }
        return iBitCount;
    }

    private final bev o(int i, beo beoVar) {
        beoVar.g(beoVar.b() - 1);
        beoVar.b = s(i);
        Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e != beoVar.e) {
            return new bev(0, 0, byi.af(objArr, i), beoVar.e);
        }
        this.b = byi.af(objArr, i);
        return this;
    }

    private final bev p(int i, int i2, beo beoVar) {
        beoVar.g(beoVar.b() - 1);
        beoVar.b = s(i);
        Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e != beoVar.e) {
            return new bev(i2 ^ this.c, this.d, byi.af(objArr, i), beoVar.e);
        }
        this.b = byi.af(objArr, i);
        this.c ^= i2;
        return this;
    }

    private final bev q(int i, int i2, bev bevVar) {
        Object[] objArr = bevVar.b;
        if (objArr.length != 2 || bevVar.d != 0) {
            Object[] objArr2 = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf.getClass();
            objArrCopyOf[i] = bevVar;
            return new bev(this.c, this.d, objArrCopyOf);
        }
        if (this.b.length == 1) {
            bevVar.c = this.d;
            return bevVar;
        }
        int iB = b(i2);
        Object[] objArr3 = this.b;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        int length = objArr3.length;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, length + 1);
        objArrCopyOf2.getClass();
        rnt.ay(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, length);
        rnt.ay(objArrCopyOf2, objArrCopyOf2, iB + 2, iB, i);
        objArrCopyOf2[iB] = obj;
        objArrCopyOf2[iB + 1] = obj2;
        return new bev(this.c ^ i2, this.d ^ i2, objArrCopyOf2);
    }

    private final Object r(int i) {
        return this.b[i];
    }

    private final Object s(int i) {
        return this.b[i + 1];
    }

    private final boolean t(Object obj) {
        ukt uktVarT = ukc.t(ukc.u(0, this.b.length), 2);
        int i = uktVarT.a;
        int i2 = uktVarT.b;
        int i3 = uktVarT.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!a.ao(obj, this.b[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    private final boolean u(bev bevVar) {
        if (this == bevVar) {
            return true;
        }
        if (this.d != bevVar.d || this.c != bevVar.c) {
            return false;
        }
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            if (this.b[i] != bevVar.b[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean v(int i) {
        return (this.d & i) != 0;
    }

    private final bev w(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, byi byiVar) {
        if (i3 > 30) {
            return new bev(0, 0, new Object[]{obj, obj2, obj3, obj4}, byiVar);
        }
        int iAd = byi.ad(i, i3);
        int iAd2 = byi.ad(i2, i3);
        if (iAd == iAd2) {
            return new bev(0, 1 << iAd, new Object[]{w(i, obj, obj2, i2, obj3, obj4, i3 + 5, byiVar)}, byiVar);
        }
        Object[] objArr = new Object[4];
        if (iAd < iAd2) {
            objArr[0] = obj;
            objArr[1] = obj2;
            objArr[2] = obj3;
            objArr[3] = obj4;
        } else {
            objArr[0] = obj3;
            objArr[1] = obj4;
            objArr[2] = obj;
            objArr[3] = obj2;
        }
        return new bev((1 << iAd) | (1 << iAd2), 0, objArr, byiVar);
    }

    private final bev x(bev bevVar, bev bevVar2, int i, int i2, byi byiVar) {
        if (bevVar2 != null) {
            return (this.e == byiVar || bevVar != bevVar2) ? y(i, bevVar2, byiVar) : this;
        }
        Object[] objArr = this.b;
        if (objArr.length == 1) {
            return null;
        }
        if (this.e != byiVar) {
            return new bev(this.c, this.d ^ i2, byi.ag(objArr, i), byiVar);
        }
        this.b = byi.ag(objArr, i);
        this.d ^= i2;
        return this;
    }

    private final bev y(int i, bev bevVar, byi byiVar) {
        Object[] objArr = this.b;
        int length = objArr.length;
        if (length == 1) {
            if (bevVar.b.length == 2 && bevVar.d == 0) {
                bevVar.c = this.d;
                return bevVar;
            }
            length = 1;
        }
        if (this.e == byiVar) {
            objArr[i] = bevVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        objArrCopyOf.getClass();
        objArrCopyOf[i] = bevVar;
        return new bev(this.c, this.d, objArrCopyOf, byiVar);
    }

    private final Object[] z(int i, int i2, int i3, Object obj, Object obj2, int i4, byi byiVar) {
        Object objR = r(i);
        bev bevVarW = w(objR != null ? objR.hashCode() : 0, objR, s(i), i3, obj, obj2, i4 + 5, byiVar);
        int iC = c(i2);
        int i5 = iC + 1;
        Object[] objArr = this.b;
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 1];
        rnt.aJ(objArr, objArr2, 0, i, 6);
        rnt.ay(objArr, objArr2, i, i + 2, i5);
        objArr2[iC - 1] = bevVarW;
        rnt.ay(objArr, objArr2, iC, i5, length);
        return objArr2;
    }

    public final int a() {
        return Integer.bitCount(this.c);
    }

    public final int b(int i) {
        int iBitCount = Integer.bitCount(this.c & (i - 1));
        return iBitCount + iBitCount;
    }

    public final int c(int i) {
        return (this.b.length - 1) - Integer.bitCount(this.d & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        if (r12 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d8, code lost:
    
        if (r12 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        r12.a = q(r10, r4, r12.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e3, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.beu d(int r11, java.lang.Object r12, java.lang.Object r13, int r14) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bev.d(int, java.lang.Object, java.lang.Object, int):beu");
    }

    public final bev e(int i, Object obj, Object obj2, int i2, beo beoVar) {
        beo beoVar2;
        bev bevVarE;
        int iAd = 1 << byi.ad(i, i2);
        if (m(iAd)) {
            int iB = b(iAd);
            if (!a.ao(obj, r(iB))) {
                beoVar.g(beoVar.b() + 1);
                byi byiVar = beoVar.e;
                if (this.e != byiVar) {
                    return new bev(this.c ^ iAd, this.d | iAd, z(iB, iAd, i, obj, obj2, i2, byiVar), byiVar);
                }
                this.b = z(iB, iAd, i, obj, obj2, i2, byiVar);
                this.c ^= iAd;
                this.d |= iAd;
                return this;
            }
            beoVar.b = s(iB);
            if (s(iB) == obj2) {
                return this;
            }
            int i3 = iB + 1;
            if (this.e == beoVar.e) {
                this.b[i3] = obj2;
                return this;
            }
            beoVar.c++;
            Object[] objArr = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf.getClass();
            objArrCopyOf[i3] = obj2;
            return new bev(this.c, this.d, objArrCopyOf, beoVar.e);
        }
        if (!v(iAd)) {
            beoVar.g(beoVar.b() + 1);
            byi byiVar2 = beoVar.e;
            int iB2 = b(iAd);
            if (this.e != byiVar2) {
                return new bev(this.c | iAd, this.d, byi.ae(this.b, iB2, obj, obj2), byiVar2);
            }
            this.b = byi.ae(this.b, iB2, obj, obj2);
            this.c |= iAd;
            return this;
        }
        int iC = c(iAd);
        bev bevVarI = i(iC);
        if (i2 == 30) {
            ukt uktVarT = ukc.t(ukc.u(0, bevVarI.b.length), 2);
            int i4 = uktVarT.a;
            int i5 = uktVarT.b;
            int i6 = uktVarT.c;
            if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
                beoVar.g(beoVar.b() + 1);
                bevVarE = new bev(0, 0, byi.ae(bevVarI.b, 0, obj, obj2), beoVar.e);
                beoVar2 = beoVar;
            } else {
                while (!a.ao(obj, bevVarI.r(i4))) {
                    if (i4 == i5) {
                        beoVar.g(beoVar.b() + 1);
                        bevVarE = new bev(0, 0, byi.ae(bevVarI.b, 0, obj, obj2), beoVar.e);
                        break;
                    }
                    i4 += i6;
                }
                int i7 = i4 + 1;
                beoVar.b = bevVarI.s(i4);
                if (bevVarI.e == beoVar.e) {
                    bevVarI.b[i7] = obj2;
                    beoVar2 = beoVar;
                    bevVarE = bevVarI;
                } else {
                    beoVar.c++;
                    Object[] objArr2 = bevVarI.b;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    objArrCopyOf2.getClass();
                    objArrCopyOf2[i7] = obj2;
                    bevVarE = new bev(0, 0, objArrCopyOf2, beoVar.e);
                    beoVar2 = beoVar;
                }
            }
        } else {
            beoVar2 = beoVar;
            bevVarE = bevVarI.e(i, obj, obj2, i2 + 5, beoVar2);
        }
        return bevVarI != bevVarE ? y(iC, bevVarE, beoVar2.e) : this;
    }

    public final bev f(bev bevVar, int i, bfd bfdVar, beo beoVar) {
        bev bevVar2;
        beo beoVar2;
        Object[] objArr;
        int i2;
        bev bevVarW;
        int i3;
        int iHashCode;
        beo beoVar3 = beoVar;
        if (this == bevVar) {
            bfdVar.a += n();
            return this;
        }
        int i4 = 0;
        if (i > 30) {
            byi byiVar = beoVar3.e;
            Object[] objArr2 = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + bevVar.b.length);
            objArrCopyOf.getClass();
            int length = this.b.length;
            ukt uktVarT = ukc.t(ukc.u(0, bevVar.b.length), 2);
            int i5 = uktVarT.a;
            int i6 = uktVarT.b;
            int i7 = uktVarT.c;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (true) {
                    if (t(bevVar.b[i5])) {
                        bfdVar.a++;
                    } else {
                        Object[] objArr3 = bevVar.b;
                        objArrCopyOf[length] = objArr3[i5];
                        objArrCopyOf[length + 1] = objArr3[i5 + 1];
                        length += 2;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5 += i7;
                }
            }
            if (length != this.b.length) {
                if (length != bevVar.b.length) {
                    if (length == objArrCopyOf.length) {
                        return new bev(0, 0, objArrCopyOf, byiVar);
                    }
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                    objArrCopyOf2.getClass();
                    return new bev(0, 0, objArrCopyOf2, byiVar);
                }
            }
            return this;
        }
        int i8 = this.d | bevVar.d;
        int i9 = this.c;
        int i10 = bevVar.c;
        int i11 = i9 ^ i10;
        int i12 = i9 & i10;
        int i13 = (~i8) & i11;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            if (a.ao(r(b(iLowestOneBit)), bevVar.r(bevVar.b(iLowestOneBit)))) {
                i13 |= iLowestOneBit;
            } else {
                i8 |= iLowestOneBit;
            }
            i12 ^= iLowestOneBit;
        }
        if ((i8 & i13) != 0) {
            bad.b("Check failed.");
        }
        if (a.ao(this.e, beoVar3.e) && this.c == i13 && this.d == i8) {
            bevVar2 = this;
        } else {
            int iBitCount = Integer.bitCount(i13);
            bevVar2 = new bev(i13, i8, new Object[iBitCount + iBitCount + Integer.bitCount(i8)]);
        }
        int i14 = i8;
        int i15 = 0;
        while (i14 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i14);
            Object[] objArr4 = bevVar2.b;
            int length2 = (objArr4.length - 1) - i15;
            if (v(iLowestOneBit2)) {
                bevVarW = i(c(iLowestOneBit2));
                if (bevVar.v(iLowestOneBit2)) {
                    bevVarW = bevVarW.f(bevVar.i(bevVar.c(iLowestOneBit2)), i + 5, bfdVar, beoVar3);
                    beoVar2 = beoVar3;
                } else {
                    if (bevVar.m(iLowestOneBit2)) {
                        int i16 = i + 5;
                        int iB = bevVar.b(iLowestOneBit2);
                        Object objR = bevVar.r(iB);
                        Object objS = bevVar.s(iB);
                        int iB2 = beoVar3.b();
                        if (objR != null) {
                            i3 = iB2;
                            iHashCode = objR.hashCode();
                        } else {
                            int i17 = i4;
                            i3 = iB2;
                            iHashCode = i17;
                        }
                        bevVarW = bevVarW.e(iHashCode, objR, objS, i16, beoVar3);
                        if (beoVar.b() == i3) {
                            bfdVar.a++;
                        }
                    }
                    beoVar2 = beoVar;
                }
            } else if (bevVar.v(iLowestOneBit2)) {
                bevVarW = bevVar.i(bevVar.c(iLowestOneBit2));
                if (m(iLowestOneBit2)) {
                    int i18 = i + 5;
                    int iB3 = b(iLowestOneBit2);
                    Object objR2 = r(iB3);
                    if (bevVarW.l(objR2 != null ? objR2.hashCode() : 0, objR2, i18)) {
                        bfdVar.a++;
                    } else {
                        beoVar3 = beoVar;
                        bevVarW = bevVarW.e(objR2 != null ? objR2.hashCode() : 0, objR2, s(iB3), i18, beoVar3);
                        beoVar2 = beoVar3;
                    }
                }
                beoVar2 = beoVar;
            } else {
                beoVar2 = beoVar;
                int i19 = i + 5;
                int iB4 = b(iLowestOneBit2);
                Object objR3 = r(iB4);
                Object objS2 = s(iB4);
                int iB5 = bevVar.b(iLowestOneBit2);
                Object objR4 = bevVar.r(iB5);
                objArr = objArr4;
                i2 = iLowestOneBit2;
                bevVarW = w(objR3 != null ? objR3.hashCode() : 0, objR3, objS2, objR4 != null ? objR4.hashCode() : 0, objR4, bevVar.s(iB5), i19, beoVar2.e);
                objArr[length2] = bevVarW;
                i14 ^= i2;
                i15++;
                beoVar3 = beoVar2;
                i4 = 0;
            }
            i2 = iLowestOneBit2;
            objArr = objArr4;
            objArr[length2] = bevVarW;
            i14 ^= i2;
            i15++;
            beoVar3 = beoVar2;
            i4 = 0;
        }
        int i20 = 0;
        while (i13 != 0) {
            int i21 = i20 + i20;
            int i22 = i21 + 1;
            int iLowestOneBit3 = Integer.lowestOneBit(i13);
            if (bevVar.m(iLowestOneBit3)) {
                int iB6 = bevVar.b(iLowestOneBit3);
                bevVar2.b[i21] = bevVar.r(iB6);
                bevVar2.b[i22] = bevVar.s(iB6);
                if (m(iLowestOneBit3)) {
                    bfdVar.a++;
                }
            } else {
                int iB7 = b(iLowestOneBit3);
                bevVar2.b[i21] = r(iB7);
                bevVar2.b[i22] = s(iB7);
            }
            i13 ^= iLowestOneBit3;
            i20++;
        }
        if (!u(bevVar2)) {
            return bevVar.u(bevVar2) ? bevVar : bevVar2;
        }
        return this;
    }

    public final bev g(int i, Object obj, int i2, beo beoVar) {
        bev bevVarG;
        bev bevVar;
        int iAd = 1 << byi.ad(i, i2);
        if (m(iAd)) {
            int iB = b(iAd);
            if (a.ao(obj, r(iB))) {
                return p(iB, iAd, beoVar);
            }
        } else if (v(iAd)) {
            int iC = c(iAd);
            bev bevVarI = i(iC);
            if (i2 == 30) {
                ukt uktVarT = ukc.t(ukc.u(0, bevVarI.b.length), 2);
                int i3 = uktVarT.a;
                int i4 = uktVarT.b;
                int i5 = uktVarT.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!a.ao(obj, bevVarI.r(i3))) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    bevVarG = bevVarI.o(i3, beoVar);
                }
                bevVar = bevVarI;
                return x(bevVarI, bevVar, iC, iAd, beoVar.e);
            }
            bevVarG = bevVarI.g(i, obj, i2 + 5, beoVar);
            bevVar = bevVarG;
            return x(bevVarI, bevVar, iC, iAd, beoVar.e);
        }
        return this;
    }

    public final bev h(int i, Object obj, Object obj2, int i2, beo beoVar) {
        beo beoVar2;
        bev bevVarH;
        int iAd = 1 << byi.ad(i, i2);
        if (m(iAd)) {
            int iB = b(iAd);
            return (a.ao(obj, r(iB)) && a.ao(obj2, s(iB))) ? p(iB, iAd, beoVar) : this;
        }
        if (!v(iAd)) {
            return this;
        }
        int iC = c(iAd);
        bev bevVarI = i(iC);
        if (i2 == 30) {
            ukt uktVarT = ukc.t(ukc.u(0, bevVarI.b.length), 2);
            int i3 = uktVarT.a;
            int i4 = uktVarT.b;
            int i5 = uktVarT.c;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                beoVar2 = beoVar;
                bevVarH = bevVarI;
            } else {
                while (true) {
                    if (!a.ao(obj, bevVarI.r(i3)) || !a.ao(obj2, bevVarI.s(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        bevVarH = bevVarI.o(i3, beoVar);
                        beoVar2 = beoVar;
                        break;
                    }
                }
                beoVar2 = beoVar;
                bevVarH = bevVarI;
            }
        } else {
            beoVar2 = beoVar;
            bevVarH = bevVarI.h(i, obj, obj2, i2 + 5, beoVar2);
        }
        return x(bevVarI, bevVarH, iC, iAd, beoVar2.e);
    }

    public final bev i(int i) {
        Object obj = this.b[i];
        obj.getClass();
        return (bev) obj;
    }

    public final bev j(int i, Object obj, int i2) {
        bev bevVarJ;
        int iAd = 1 << byi.ad(i, i2);
        if (m(iAd)) {
            int iB = b(iAd);
            if (!a.ao(obj, r(iB))) {
                return this;
            }
            Object[] objArr = this.b;
            if (objArr.length == 2) {
                return null;
            }
            return new bev(this.c ^ iAd, this.d, byi.af(objArr, iB));
        }
        if (!v(iAd)) {
            return this;
        }
        int iC = c(iAd);
        bev bevVarI = i(iC);
        if (i2 == 30) {
            ukt uktVarT = ukc.t(ukc.u(0, bevVarI.b.length), 2);
            int i3 = uktVarT.a;
            int i4 = uktVarT.b;
            int i5 = uktVarT.c;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                bevVarJ = bevVarI;
                break;
            }
            while (!a.ao(obj, bevVarI.r(i3))) {
                if (i3 == i4) {
                    bevVarJ = bevVarI;
                    break;
                }
                i3 += i5;
            }
            Object[] objArr2 = bevVarI.b;
            bevVarJ = objArr2.length == 2 ? null : new bev(0, 0, byi.af(objArr2, i3));
        } else {
            bevVarJ = bevVarI.j(i, obj, i2 + 5);
        }
        if (bevVarJ != null) {
            return bevVarI != bevVarJ ? q(iC, iAd, bevVarJ) : this;
        }
        Object[] objArr3 = this.b;
        if (objArr3.length == 1) {
            return null;
        }
        return new bev(this.c, this.d ^ iAd, byi.ag(objArr3, iC));
    }

    public final Object k(int i, Object obj, int i2) {
        int iAd = 1 << byi.ad(i, i2);
        if (m(iAd)) {
            int iB = b(iAd);
            if (a.ao(obj, r(iB))) {
                return s(iB);
            }
            return null;
        }
        if (!v(iAd)) {
            return null;
        }
        bev bevVarI = i(c(iAd));
        if (i2 != 30) {
            return bevVarI.k(i, obj, i2 + 5);
        }
        ukt uktVarT = ukc.t(ukc.u(0, bevVarI.b.length), 2);
        int i3 = uktVarT.a;
        int i4 = uktVarT.b;
        int i5 = uktVarT.c;
        if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
            while (!a.ao(obj, bevVarI.r(i3))) {
                if (i3 != i4) {
                    i3 += i5;
                }
            }
            return bevVarI.s(i3);
        }
        return null;
    }

    public final boolean l(int i, Object obj, int i2) {
        int iAd = 1 << byi.ad(i, i2);
        if (m(iAd)) {
            return a.ao(obj, r(b(iAd)));
        }
        if (!v(iAd)) {
            return false;
        }
        bev bevVarI = i(c(iAd));
        return i2 == 30 ? bevVarI.t(obj) : bevVarI.l(i, obj, i2 + 5);
    }

    public final boolean m(int i) {
        return (this.c & i) != 0;
    }

    public bev(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
    }
}
