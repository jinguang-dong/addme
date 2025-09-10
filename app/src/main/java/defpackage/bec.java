package defpackage;

import j$.util.List;
import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bec extends bea implements List, bdw {
    private final Object[] a;
    private final Object[] b;
    private final int c;
    private final int d;

    public bec(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (i <= 32) {
            bad.a("Trie-based persistent vector should have at least 33 elements, got " + i);
        }
        int length = objArr2.length;
    }

    private final int l() {
        return bdq.d(this.c);
    }

    private final bdw m(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.c - i;
        if (i4 != 1) {
            Object[] objArr2 = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf.getClass();
            int i5 = i4 - 1;
            if (i3 < i5) {
                rnt.ay(objArr2, objArrCopyOf, i3, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new bec(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                objArr.getClass();
            }
            return new beh(objArr);
        }
        scf scfVar = new scf((Object) null);
        Object[] objArrS = s(objArr, i2, i - 1, scfVar);
        objArrS.getClass();
        Object obj = scfVar.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrS[1] != null) {
            return new bec(objArrS, objArr3, i, i2);
        }
        Object obj2 = objArrS[0];
        obj2.getClass();
        return new bec((Object[]) obj2, objArr3, i, i2 - 5);
    }

    private final bec n(Object[] objArr, int i, Object obj) {
        int i2 = this.c;
        int iL = i2 - l();
        Object[] objArr2 = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf.getClass();
        int i3 = i + 1;
        if (iL < 32) {
            rnt.ay(objArr2, objArrCopyOf, i3, i, iL);
            objArrCopyOf[i] = obj;
            return new bec(objArr, objArrCopyOf, i2 + 1, this.d);
        }
        Object obj2 = objArr2[31];
        rnt.ay(objArr2, objArrCopyOf, i3, i, iL - 1);
        objArrCopyOf[i] = obj;
        return o(objArr, objArrCopyOf, bdq.e(obj2));
    }

    private final bec o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.c;
        int i2 = i + 1;
        int i3 = this.d;
        if ((i >> 5) <= (1 << i3)) {
            return new bec(p(objArr, i3, objArr2), objArr3, i2, i3);
        }
        int i4 = i3 + 5;
        return new bec(p(bdq.e(objArr), i4, objArr2), objArr3, i2, i4);
    }

    private final Object[] p(Object[] objArr, int i, Object[] objArr2) {
        Object[] objArrCopyOf;
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            objArrCopyOf.getClass();
        } else {
            objArrCopyOf = new Object[32];
        }
        int iC = bdq.c(this.c - 1, i);
        if (i == 5) {
            objArrCopyOf[iC] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iC] = p((Object[]) objArrCopyOf[iC], i - 5, objArr2);
        return objArrCopyOf;
    }

    private final Object[] q(Object[] objArr, int i, int i2, Object obj) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf.getClass();
        int iC = bdq.c(i2, i);
        if (i == 0) {
            objArrCopyOf[iC] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iC];
        obj2.getClass();
        objArrCopyOf[iC] = q((Object[]) obj2, i - 5, i2, obj);
        return objArrCopyOf;
    }

    private final Object[] r(Object[] objArr, int i, int i2, Object obj, scf scfVar) {
        Object[] objArrCopyOf;
        int iC = bdq.c(i2, i);
        if (i == 0) {
            if (iC == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                objArrCopyOf.getClass();
            }
            rnt.ay(objArr, objArrCopyOf, iC + 1, iC, 31);
            scfVar.a = objArr[31];
            objArrCopyOf[iC] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        objArrCopyOf2.getClass();
        int i3 = i - 5;
        Object obj2 = objArr[iC];
        obj2.getClass();
        objArrCopyOf2[iC] = r((Object[]) obj2, i3, i2, obj, scfVar);
        while (true) {
            iC++;
            if (iC >= 32 || objArrCopyOf2[iC] == null) {
                break;
            }
            Object obj3 = objArr[iC];
            obj3.getClass();
            objArrCopyOf2[iC] = r((Object[]) obj3, i3, 0, scfVar.a, scfVar);
        }
        return objArrCopyOf2;
    }

    private final Object[] s(Object[] objArr, int i, int i2, scf scfVar) {
        Object[] objArrS;
        int iC = bdq.c(i2, i);
        if (i == 5) {
            scfVar.a = objArr[iC];
            objArrS = null;
        } else {
            Object obj = objArr[iC];
            obj.getClass();
            objArrS = s((Object[]) obj, i - 5, i2, scfVar);
        }
        if (objArrS == null && iC == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf.getClass();
        objArrCopyOf[iC] = objArrS;
        return objArrCopyOf;
    }

    private final Object[] t(Object[] objArr, int i, int i2, scf scfVar) {
        Object[] objArrCopyOf;
        int iC = bdq.c(i2, i);
        if (i == 0) {
            if (iC == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                objArrCopyOf.getClass();
            }
            rnt.ay(objArr, objArrCopyOf, iC, iC + 1, 32);
            objArrCopyOf[31] = scfVar.a;
            scfVar.a = objArr[iC];
            return objArrCopyOf;
        }
        int iC2 = objArr[31] == null ? bdq.c(l() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        objArrCopyOf2.getClass();
        int i3 = i - 5;
        int i4 = iC + 1;
        if (i4 <= iC2) {
            while (true) {
                Object obj = objArrCopyOf2[iC2];
                obj.getClass();
                objArrCopyOf2[iC2] = t((Object[]) obj, i3, 0, scfVar);
                if (iC2 == i4) {
                    break;
                }
                iC2--;
            }
        }
        Object obj2 = objArrCopyOf2[iC];
        obj2.getClass();
        objArrCopyOf2[iC] = t((Object[]) obj2, i3, i2, scfVar);
        return objArrCopyOf2;
    }

    @Override // defpackage.ufi
    public final int a() {
        return this.c;
    }

    @Override // defpackage.bdw
    public final bdw b(Object obj) {
        int i = this.c;
        int iL = i - l();
        if (iL >= 32) {
            return o(this.a, this.b, bdq.e(obj));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.b, 32);
        objArrCopyOf.getClass();
        objArrCopyOf[iL] = obj;
        return new bec(this.a, objArrCopyOf, i + 1, this.d);
    }

    @Override // defpackage.bdw
    public final bdw c(int i, Object obj) {
        int i2 = this.c;
        a.aj(i, i2);
        if (i == i2) {
            return b(obj);
        }
        int iL = l();
        if (i >= iL) {
            return n(this.a, i - iL, obj);
        }
        scf scfVar = new scf((Object) null);
        return n(r(this.a, this.d, i, obj, scfVar), 0, scfVar.a);
    }

    @Override // defpackage.bdw
    public final bdw g(uiq uiqVar) {
        bed bedVarJ = j();
        bedVarJ.e(uiqVar);
        return bedVarJ.c();
    }

    @Override // defpackage.ufm, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        a.ai(i, this.c);
        if (l() <= i) {
            objArr = this.b;
        } else {
            Object[] objArr2 = this.a;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[bdq.c(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.bdw
    public final bdw h(int i) {
        a.ai(i, this.c);
        int iL = l();
        if (i >= iL) {
            return m(this.a, iL, this.d, i - iL);
        }
        Object[] objArr = this.a;
        int i2 = this.d;
        return m(t(objArr, i2, i, new scf(this.b[0])), iL, i2, 0);
    }

    @Override // defpackage.bdw
    public final bdw i(int i, Object obj) {
        int i2 = this.c;
        a.ai(i, i2);
        if (l() > i) {
            Object[] objArr = this.a;
            int i3 = this.d;
            return new bec(q(objArr, i3, i, obj), this.b, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.b, 32);
        objArrCopyOf.getClass();
        objArrCopyOf[i & 31] = obj;
        return new bec(this.a, objArrCopyOf, i2, this.d);
    }

    @Override // defpackage.bdw
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final bed j() {
        return new bed(this, this.a, this.b, this.d);
    }

    @Override // defpackage.ufm, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.c;
        a.aj(i, i2);
        return new bee(this.a, this.b, i, i2, (this.d / 5) + 1);
    }
}
