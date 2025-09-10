package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bed extends ufp implements List, Collection, uke {
    public int a;
    public Object[] b;
    public Object[] c;
    public int d;
    private bdw e;
    private Object[] f;
    private Object[] g;
    private byi h = new byi();

    public bed(bdw bdwVar, Object[] objArr, Object[] objArr2, int i) {
        this.e = bdwVar;
        this.f = objArr;
        this.g = objArr2;
        this.a = i;
        this.b = this.f;
        this.c = this.g;
        this.d = this.e.size();
    }

    private final int A(uiq uiqVar, Object[] objArr, int i, scf scfVar) {
        Object[] objArrP = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) uiqVar.a(obj)).booleanValue()) {
                if (!z) {
                    objArrP = p(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrP[i2] = obj;
                i2++;
            }
        }
        scfVar.a = objArrP;
        return i2;
    }

    private final int B(uiq uiqVar, int i, scf scfVar) {
        int iA = A(uiqVar, this.c, i, scfVar);
        if (iA == i) {
            return i;
        }
        Object obj = scfVar.a;
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        rnt.af(objArr, null, iA, i);
        this.c = objArr;
        this.d -= i - iA;
        return iA;
    }

    private final Object[] C(Object[] objArr, int i, int i2, Object obj, scf scfVar) {
        Object obj2;
        int iC = bdq.c(i2, i);
        int i3 = iC + 1;
        if (i == 0) {
            scfVar.a = objArr[31];
            Object[] objArrP = p(objArr);
            rnt.ay(objArr, objArrP, i3, iC, 31);
            objArrP[iC] = obj;
            return objArrP;
        }
        Object[] objArrP2 = p(objArr);
        int i4 = i - 5;
        Object obj3 = objArrP2[iC];
        obj3.getClass();
        objArrP2[iC] = C((Object[]) obj3, i4, i2, obj, scfVar);
        while (i3 < 32 && (obj2 = objArrP2[i3]) != null) {
            objArrP2[i3] = C((Object[]) obj2, i4, 0, scfVar.a, scfVar);
            i3++;
        }
        return objArrP2;
    }

    private final Object[] D(Object[] objArr, int i, int i2, scf scfVar) {
        Object[] objArrD;
        int iC = bdq.c(i2 - 1, i);
        if (i == 5) {
            scfVar.a = objArr[iC];
            objArrD = null;
        } else {
            Object obj = objArr[iC];
            obj.getClass();
            objArrD = D((Object[]) obj, i - 5, i2, scfVar);
        }
        if (objArrD == null && iC == 0) {
            return null;
        }
        Object[] objArrP = p(objArr);
        objArrP[iC] = objArrD;
        return objArrP;
    }

    private final Object[] E(Object[] objArr, int i, int i2, scf scfVar) {
        int iC = bdq.c(i2, i);
        int i3 = iC + 1;
        if (i == 0) {
            Object obj = objArr[iC];
            Object[] objArrP = p(objArr);
            rnt.ay(objArr, objArrP, iC, i3, 32);
            objArrP[31] = scfVar.a;
            scfVar.a = obj;
            return objArrP;
        }
        int iC2 = objArr[31] == null ? bdq.c(f() - 1, i) : 31;
        Object[] objArrP2 = p(objArr);
        int i4 = i - 5;
        if (i3 <= iC2) {
            while (true) {
                Object obj2 = objArrP2[iC2];
                obj2.getClass();
                objArrP2[iC2] = E((Object[]) obj2, i4, 0, scfVar);
                if (iC2 == i3) {
                    break;
                }
                iC2--;
            }
        }
        Object obj3 = objArrP2[iC];
        obj3.getClass();
        objArrP2[iC] = E((Object[]) obj3, i4, i2, scfVar);
        return objArrP2;
    }

    private final Object[] F(Object[] objArr, int i, int i2, Object obj, scf scfVar) {
        Object[] objArrP = p(objArr);
        int iC = bdq.c(i2, i);
        if (i == 0) {
            if (objArrP != objArr) {
                this.modCount++;
            }
            scfVar.a = objArrP[iC];
            objArrP[iC] = obj;
            return objArrP;
        }
        Object obj2 = objArrP[iC];
        obj2.getClass();
        objArrP[iC] = F((Object[]) obj2, i - 5, i2, obj, scfVar);
        return objArrP;
    }

    private final int f() {
        int i = this.d;
        if (i <= 32) {
            return 0;
        }
        return bdq.d(i);
    }

    private final int g() {
        return y(this.d);
    }

    private final Object h(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.d - i;
        if (i4 == 1) {
            Object obj = this.c[0];
            l(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.c;
        Object obj2 = objArr2[i3];
        Object[] objArrP = p(objArr2);
        rnt.ay(objArr2, objArrP, i3, i3 + 1, i4);
        objArrP[i4 - 1] = null;
        this.b = objArr;
        this.c = objArrP;
        this.d = (i + i4) - 1;
        this.a = i2;
        return obj2;
    }

    private final ListIterator i(int i) {
        Object[] objArr = this.b;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iF = f() >> 5;
        a.aj(i, iF);
        int i2 = this.a;
        return i2 == 0 ? new beg(objArr, i) : new bei(objArr, i, iF, i2 / 5);
    }

    private final void j(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.b == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        ListIterator listIteratorI = i(f() >> 5);
        int i5 = i3;
        Object[] objArrQ = objArr2;
        while (listIteratorI.previousIndex() != i4) {
            Object[] objArr3 = (Object[]) listIteratorI.previous();
            rnt.ay(objArr3, objArrQ, 0, 32 - i2, 32);
            objArrQ = q(objArr3, i2);
            i5--;
            objArr[i5] = objArrQ;
        }
        Object[] objArr4 = (Object[]) listIteratorI.previous();
        int iF = i3 - (((f() >> 5) - 1) - i4);
        if (iF < i3) {
            objArr2 = objArr[iF];
            objArr2.getClass();
        }
        n(collection, i, objArr4, 32, objArr, iF, objArr2);
    }

    private final void k(Object[] objArr, int i, Object obj) {
        int iG = g();
        Object[] objArrP = p(this.c);
        int i2 = i + 1;
        if (iG < 32) {
            rnt.ay(this.c, objArrP, i2, i, iG);
            objArrP[i] = obj;
            this.b = objArr;
            this.c = objArrP;
            this.d++;
            return;
        }
        Object[] objArr2 = this.c;
        Object obj2 = objArr2[31];
        rnt.ay(objArr2, objArrP, i2, i, 31);
        objArrP[i] = obj;
        m(objArr, objArrP, s(obj2));
    }

    private final void l(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.b = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.c = objArr;
            this.d = i;
            this.a = 0;
            return;
        }
        scf scfVar = new scf((Object) null);
        objArr.getClass();
        Object[] objArrD = D(objArr, i2, i, scfVar);
        objArrD.getClass();
        Object obj = scfVar.a;
        obj.getClass();
        this.c = (Object[]) obj;
        this.d = i;
        if (objArrD[1] == null) {
            this.b = (Object[]) objArrD[0];
            this.a = i2 - 5;
        } else {
            this.b = objArrD;
            this.a = i2;
        }
    }

    private final void m(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.d;
        int i2 = i >> 5;
        int i3 = this.a;
        if (i2 > (1 << i3)) {
            this.b = w(s(objArr), objArr2, this.a + 5);
            this.c = objArr3;
            this.a += 5;
            this.d++;
            return;
        }
        if (objArr == null) {
            this.b = objArr2;
            this.c = objArr3;
            this.d = i + 1;
        } else {
            this.b = w(objArr, objArr2, i3);
            this.c = objArr3;
            this.d++;
        }
    }

    private final void n(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrR;
        if (i3 <= 0) {
            bad.a("requires at least one nullBuffer");
        }
        Object[] objArrP = p(objArr);
        objArr2[0] = objArrP;
        int i4 = i & 31;
        int size = ((i + collection.size()) - 1) & 31;
        int i5 = (i2 - i4) + size;
        int i6 = size + 1;
        if (i5 < 32) {
            rnt.ay(objArrP, objArr3, i6, i4, i2);
        } else {
            int i7 = i5 - 31;
            if (i3 == 1) {
                objArrR = objArrP;
            } else {
                objArrR = r();
                i3--;
                objArr2[i3] = objArrR;
            }
            int i8 = i2 - i7;
            rnt.ay(objArrP, objArr3, 0, i8, i2);
            rnt.ay(objArrP, objArrR, i6, i4, i8);
            objArr3 = objArrR;
        }
        Iterator it = collection.iterator();
        x(objArrP, i4, it);
        for (int i9 = 1; i9 < i3; i9++) {
            Object[] objArrR2 = r();
            x(objArrR2, 0, it);
            objArr2[i9] = objArrR2;
        }
        x(objArr3, 0, it);
    }

    private final boolean o(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.h;
    }

    private final Object[] p(Object[] objArr) {
        if (objArr == null) {
            return r();
        }
        if (o(objArr)) {
            return objArr;
        }
        Object[] objArrR = r();
        rnt.aJ(objArr, objArrR, 0, ukc.o(objArr.length, 32), 6);
        return objArrR;
    }

    private final Object[] q(Object[] objArr, int i) {
        int i2 = 32 - i;
        if (o(objArr)) {
            rnt.ay(objArr, objArr, i, 0, i2);
            return objArr;
        }
        Object[] objArrR = r();
        rnt.ay(objArr, objArrR, i, 0, i2);
        return objArrR;
    }

    private final Object[] r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.h;
        return objArr;
    }

    private final Object[] s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.h;
        return objArr;
    }

    private final Object[] t(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            bad.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iC = bdq.c(i, i2);
        Object obj = objArr[iC];
        obj.getClass();
        Object objT = t((Object[]) obj, i, i2 - 5);
        if (iC < 31) {
            int i3 = iC + 1;
            if (objArr[i3] != null) {
                if (o(objArr)) {
                    rnt.af(objArr, null, i3, 32);
                }
                Object[] objArrR = r();
                rnt.ay(objArr, objArrR, 0, 0, i3);
                objArr = objArrR;
            }
        }
        if (objT == objArr[iC]) {
            return objArr;
        }
        Object[] objArrP = p(objArr);
        objArrP[iC] = objT;
        return objArrP;
    }

    private final Object[] u(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            bad.a("invalid buffersIterator");
        }
        if (i2 < 0) {
            bad.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrP = p(objArr);
        int iC = bdq.c(i, i2);
        int i3 = i2 - 5;
        objArrP[iC] = u((Object[]) objArrP[iC], i, i3, it);
        while (true) {
            iC++;
            if (iC >= 32 || !it.hasNext()) {
                break;
            }
            objArrP[iC] = u((Object[]) objArrP[iC], 0, i3, it);
        }
        return objArrP;
    }

    private final Object[] v(Object[] objArr, int i, Object[][] objArr2) {
        Iterator itAu = ske.au(objArr2);
        int i2 = this.a;
        Object[] objArrU = (i >> 5) < (1 << i2) ? u(objArr, i, i2, itAu) : p(objArr);
        while (itAu.hasNext()) {
            this.a += 5;
            objArrU = s(objArrU);
            int i3 = this.a;
            u(objArrU, 1 << i3, i3, itAu);
        }
        return objArrU;
    }

    private final Object[] w(Object[] objArr, Object[] objArr2, int i) {
        int i2 = this.d - 1;
        Object[] objArrP = p(objArr);
        int iC = bdq.c(i2, i);
        if (i == 5) {
            objArrP[iC] = objArr2;
            return objArrP;
        }
        objArrP[iC] = w((Object[]) objArrP[iC], objArr2, i - 5);
        return objArrP;
    }

    private static final void x(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    private static final int y(int i) {
        return i <= 32 ? i : i - bdq.d(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int z(uiq uiqVar, Object[] objArr, int i, int i2, scf scfVar, List list, List list2) {
        if (o(objArr)) {
            list.add(objArr);
        }
        Object obj = scfVar.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrR = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) uiqVar.a(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrR = !list.isEmpty() ? (Object[]) list.remove(list.size() - 1) : r();
                    i2 = 0;
                }
                objArrR[i2] = obj2;
                i2++;
            }
        }
        scfVar.a = objArrR;
        if (objArr2 != scfVar.a) {
            list2.add(objArr2);
        }
        return i2;
    }

    public final int a() {
        return this.modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a.aj(i, this.d);
        if (i == this.d) {
            add(obj);
            return;
        }
        this.modCount++;
        int iF = f();
        if (i >= iF) {
            k(this.b, i - iF, obj);
            return;
        }
        scf scfVar = new scf((Object) null);
        Object[] objArr = this.b;
        objArr.getClass();
        k(C(objArr, this.a, i, obj, scfVar), 0, scfVar.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        bed bedVar;
        Collection collection2;
        Object[] objArrR;
        Object[][] objArr;
        a.aj(i, this.d);
        if (i == this.d) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((this.d - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = (i + collection.size()) - 1;
            Object[] objArr2 = this.c;
            Object[] objArrP = p(objArr2);
            rnt.ay(objArr2, objArrP, (size2 & 31) + 1, i3, g());
            x(objArrP, i3, collection.iterator());
            this.c = objArrP;
            this.d += collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int iG = g();
        int size3 = this.d + collection.size();
        if (i >= f()) {
            objArrR = r();
            objArr = objArr3;
            bedVar = this;
            collection2 = collection;
            bedVar.n(collection2, i, this.c, iG, objArr, size, objArrR);
        } else {
            bedVar = this;
            collection2 = collection;
            int iY = y(size3);
            if (iY > iG) {
                int i4 = iY - iG;
                Object[] objArrQ = bedVar.q(bedVar.c, i4);
                bedVar.j(collection2, i, i4, objArr3, size, objArrQ);
                objArr = objArr3;
                objArrR = objArrQ;
            } else {
                Object[] objArr4 = bedVar.c;
                objArrR = bedVar.r();
                int i5 = iG - iY;
                rnt.ay(objArr4, objArrR, 0, i5, iG);
                int i6 = 32 - i5;
                Object[] objArrQ2 = bedVar.q(bedVar.c, i6);
                int i7 = size - 1;
                objArr3[i7] = objArrQ2;
                bedVar.j(collection2, i, i6, objArr3, i7, objArrQ2);
                collection2 = collection2;
                objArr = objArr3;
                bedVar = bedVar;
            }
        }
        bedVar.b = bedVar.v(bedVar.b, i2, objArr);
        bedVar.c = objArrR;
        bedVar.d += collection2.size();
        return true;
    }

    @Override // defpackage.ufp
    public final int b() {
        return this.d;
    }

    public final bdw c() {
        bdw becVar;
        Object[] objArr = this.b;
        if (objArr == this.f && this.c == this.g) {
            becVar = this.e;
        } else {
            this.h = new byi();
            this.f = objArr;
            Object[] objArr2 = this.c;
            this.g = objArr2;
            if (objArr != null) {
                becVar = new bec(objArr, objArr2, this.d, this.a);
            } else if (objArr2.length == 0) {
                becVar = beh.a;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.c, this.d);
                objArrCopyOf.getClass();
                becVar = new beh(objArrCopyOf);
            }
        }
        this.e = becVar;
        return becVar;
    }

    @Override // defpackage.ufp
    public final Object d(int i) {
        a.ai(i, this.d);
        this.modCount++;
        int iF = f();
        if (i >= iF) {
            return h(this.b, iF, this.a, i - iF);
        }
        scf scfVar = new scf(this.c[0]);
        Object[] objArr = this.b;
        objArr.getClass();
        h(E(objArr, this.a, i, scfVar), iF, this.a, 0);
        return scfVar.a;
    }

    public final boolean e(uiq uiqVar) {
        Object[] objArrU;
        int i;
        uiq uiqVar2 = uiqVar;
        int iG = g();
        Object[] objArrT = null;
        scf scfVar = new scf((Object) null);
        boolean z = false;
        if (this.b != null) {
            ListIterator listIteratorI = i(0);
            int iA = 32;
            while (true) {
                if (iA == 32) {
                    if (!listIteratorI.hasNext()) {
                        iA = 32;
                        break;
                    }
                    iA = A(uiqVar2, (Object[]) listIteratorI.next(), 32, scfVar);
                } else {
                    break;
                }
            }
            if (iA == 32) {
                int iB = B(uiqVar2, iG, scfVar);
                if (iB == 0) {
                    l(this.b, this.d, this.a);
                    iB = 0;
                }
                if (iB != iG) {
                }
            } else {
                int iPreviousIndex = listIteratorI.previousIndex() << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iZ = iA;
                while (listIteratorI.hasNext()) {
                    iZ = z(uiqVar2, (Object[]) listIteratorI.next(), 32, iZ, scfVar, arrayList2, arrayList);
                    uiqVar2 = uiqVar;
                }
                int iZ2 = z(uiqVar, this.c, iG, iZ, scfVar, arrayList2, arrayList);
                Object obj = scfVar.a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                rnt.af(objArr, null, iZ2, 32);
                if (arrayList.isEmpty()) {
                    objArrU = this.b;
                    objArrU.getClass();
                } else {
                    objArrU = u(this.b, iPreviousIndex, this.a, arrayList.iterator());
                }
                int size = iPreviousIndex + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    bad.a("invalid size");
                }
                if (size == 0) {
                    this.a = 0;
                } else {
                    int i2 = size - 1;
                    while (true) {
                        i = this.a;
                        if ((i2 >> i) != 0) {
                            break;
                        }
                        this.a = i - 5;
                        Object[] objArr2 = objArrU[0];
                        objArr2.getClass();
                        objArrU = objArr2;
                    }
                    objArrT = t(objArrU, i2, i);
                }
                this.b = objArrT;
                this.c = objArr;
                this.d = size + iZ2;
            }
            z = true;
        } else if (B(uiqVar2, iG, scfVar) != iG) {
            z = true;
        }
        if (z) {
            this.modCount++;
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        a.ai(i, this.d);
        if (f() <= i) {
            objArr = this.c;
        } else {
            Object[] objArr2 = this.b;
            objArr2.getClass();
            for (int i2 = this.a; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[bdq.c(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return e(new asj(collection, 8));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a.ai(i, this.d);
        if (f() > i) {
            scf scfVar = new scf((Object) null);
            Object[] objArr = this.b;
            objArr.getClass();
            this.b = F(objArr, this.a, i, obj, scfVar);
            return scfVar.a;
        }
        Object[] objArrP = p(this.c);
        if (objArrP != this.c) {
            this.modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrP[i2];
        objArrP[i2] = obj;
        this.c = objArrP;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        a.aj(i, this.d);
        return new bef(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        this.modCount++;
        int iG = g();
        if (iG < 32) {
            Object[] objArrP = p(this.c);
            objArrP[iG] = obj;
            this.c = objArrP;
            this.d++;
        } else {
            m(this.b, this.c, s(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int iG = g();
        Iterator it = collection.iterator();
        if (32 - iG >= collection.size()) {
            Object[] objArrP = p(this.c);
            x(objArrP, iG, it);
            this.c = objArrP;
            this.d += collection.size();
        } else {
            int size = ((collection.size() + iG) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] objArrP2 = p(this.c);
            x(objArrP2, iG, it);
            objArr[0] = objArrP2;
            for (int i = 1; i < size; i++) {
                Object[] objArrR = r();
                x(objArrR, 0, it);
                objArr[i] = objArrR;
            }
            this.b = v(this.b, f(), objArr);
            Object[] objArrR2 = r();
            x(objArrR2, 0, it);
            this.c = objArrR2;
            this.d += collection.size();
        }
        return true;
    }
}
