package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class saw extends AbstractMap implements Serializable, ryq {
    transient Object[] a;
    transient Object[] b;
    transient int c;
    transient int d;
    public transient int e;
    public transient int[] f;
    public transient ryq g;
    private transient int[] h;
    private transient int[] i;
    private transient int[] j;
    private transient int[] k;
    private transient int l;
    private transient int[] m;
    private transient Set n;
    private transient Set o;
    private transient Set p;

    public saw() {
        m();
    }

    private final int p(int i) {
        return (this.h.length - 1) & i;
    }

    private final void q(int i, int i2) {
        a.I(i != -1);
        int iP = p(i2);
        int[] iArr = this.h;
        int i3 = iArr[iP];
        if (i3 == i) {
            int[] iArr2 = this.j;
            iArr[iP] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.j[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with key ".concat(String.valueOf(String.valueOf(this.a[i]))));
            }
            if (i3 == i) {
                int[] iArr3 = this.j;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.j[i3];
        }
    }

    private final void r(int i, int i2) {
        a.I(i != -1);
        int iP = p(i2);
        int[] iArr = this.i;
        int i3 = iArr[iP];
        if (i3 == i) {
            int[] iArr2 = this.k;
            iArr[iP] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.k[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with value ".concat(String.valueOf(String.valueOf(this.b[i]))));
            }
            if (i3 == i) {
                int[] iArr3 = this.k;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.k[i3];
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        m();
        sla.e(this, objectInputStream, i);
    }

    private final void s(int i) {
        int length = this.j.length;
        if (length < i) {
            int iA = sbd.a(length, i);
            this.a = Arrays.copyOf(this.a, iA);
            this.b = Arrays.copyOf(this.b, iA);
            this.j = y(this.j, iA);
            this.k = y(this.k, iA);
            this.m = y(this.m, iA);
            this.f = y(this.f, iA);
        }
        if (this.h.length < i) {
            int iBc = ujp.bc(i);
            this.h = x(iBc);
            this.i = x(iBc);
            for (int i2 = 0; i2 < this.c; i2++) {
                int iP = p(ujp.bb(this.a[i2]));
                int[] iArr = this.j;
                int[] iArr2 = this.h;
                iArr[i2] = iArr2[iP];
                iArr2[iP] = i2;
                int iP2 = p(ujp.bb(this.b[i2]));
                int[] iArr3 = this.k;
                int[] iArr4 = this.i;
                iArr3[i2] = iArr4[iP2];
                iArr4[iP2] = i2;
            }
        }
    }

    private final void t(int i, int i2) {
        a.I(i != -1);
        int iP = p(i2);
        int[] iArr = this.j;
        int[] iArr2 = this.h;
        iArr[i] = iArr2[iP];
        iArr2[iP] = i;
    }

    private final void u(int i, int i2) {
        a.I(i != -1);
        int iP = p(i2);
        int[] iArr = this.k;
        int[] iArr2 = this.i;
        iArr[i] = iArr2[iP];
        iArr2[iP] = i;
    }

    private final void v(int i, int i2, int i3) {
        int i4;
        int i5;
        a.I(i != -1);
        q(i, i2);
        r(i, i3);
        w(this.m[i], this.f[i]);
        int i6 = this.c - 1;
        if (i6 != i) {
            int i7 = this.m[i6];
            int i8 = this.f[i6];
            w(i7, i);
            w(i, i8);
            Object[] objArr = this.a;
            Object obj = objArr[i6];
            Object[] objArr2 = this.b;
            Object obj2 = objArr2[i6];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int iP = p(ujp.bb(obj));
            int[] iArr = this.h;
            int i9 = iArr[iP];
            if (i9 == i6) {
                iArr[iP] = i;
            } else {
                int i10 = this.j[i9];
                while (true) {
                    i4 = i9;
                    i9 = i10;
                    if (i9 == i6) {
                        break;
                    } else {
                        i10 = this.j[i9];
                    }
                }
                this.j[i4] = i;
            }
            int[] iArr2 = this.j;
            iArr2[i] = iArr2[i6];
            iArr2[i6] = -1;
            int iP2 = p(ujp.bb(obj2));
            int[] iArr3 = this.i;
            int i11 = iArr3[iP2];
            if (i11 == i6) {
                iArr3[iP2] = i;
            } else {
                int i12 = this.k[i11];
                while (true) {
                    i5 = i11;
                    i11 = i12;
                    if (i11 == i6) {
                        break;
                    } else {
                        i12 = this.k[i11];
                    }
                }
                this.k[i5] = i;
            }
            int[] iArr4 = this.k;
            iArr4[i] = iArr4[i6];
            iArr4[i6] = -1;
        }
        Object[] objArr3 = this.a;
        int i13 = this.c - 1;
        objArr3[i13] = null;
        this.b[i13] = null;
        this.c = i13;
        this.d++;
    }

    private final void w(int i, int i2) {
        if (i == -2) {
            this.e = i2;
        } else {
            this.f[i] = i2;
        }
        if (i2 == -2) {
            this.l = i;
        } else {
            this.m[i2] = i;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        sla.g(this, objectOutputStream);
    }

    private static int[] x(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static int[] y(int[] iArr, int i) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(iArrCopyOf, length, i, -1);
        return iArrCopyOf;
    }

    final int a(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[p(i)];
        while (i2 != -1) {
            if (a.K(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    final int b(Object obj) {
        return c(obj, ujp.bb(obj));
    }

    final int c(Object obj, int i) {
        return a(obj, i, this.h, this.j, this.a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, (Object) null);
        Arrays.fill(this.h, -1);
        Arrays.fill(this.i, -1);
        Arrays.fill(this.j, 0, this.c, -1);
        Arrays.fill(this.k, 0, this.c, -1);
        Arrays.fill(this.m, 0, this.c, -1);
        Arrays.fill(this.f, 0, this.c, -1);
        this.c = 0;
        this.e = -2;
        this.l = -2;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return e(obj) != -1;
    }

    @Override // defpackage.ryq
    public final ryq d() {
        throw null;
    }

    final int e(Object obj) {
        return f(obj, ujp.bb(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.p;
        if (set != null) {
            return set;
        }
        sap sapVar = new sap(this);
        this.p = sapVar;
        return sapVar;
    }

    final int f(Object obj, int i) {
        return a(obj, i, this.i, this.k, this.b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g */
    public final Set values() {
        Set set = this.o;
        if (set != null) {
            return set;
        }
        sat satVar = new sat(this);
        this.o = satVar;
        return satVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int iB = b(obj);
        if (iB == -1) {
            return null;
        }
        return this.b[iB];
    }

    final Object h(Object obj, Object obj2, boolean z) {
        int iBb = ujp.bb(obj);
        int iC = c(obj, iBb);
        if (iC != -1) {
            Object obj3 = this.b[iC];
            if (a.K(obj3, obj2)) {
                return obj2;
            }
            l(iC, obj2, z);
            return obj3;
        }
        int iBb2 = ujp.bb(obj2);
        int iF = f(obj2, iBb2);
        if (!z) {
            rnt.F(iF == -1, "Value already present: %s", obj2);
        } else if (iF != -1) {
            j(iF, iBb2);
        }
        s(this.c + 1);
        Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = obj;
        this.b[i] = obj2;
        t(i, iBb);
        u(this.c, iBb2);
        w(this.l, this.c);
        w(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    final void i(int i, int i2) {
        v(i, i2, ujp.bb(this.b[i]));
    }

    final void j(int i, int i2) {
        v(i, ujp.bb(this.a[i]), i2);
    }

    @Override // defpackage.ryq
    public final void k(Object obj, Object obj2) {
        h(obj, obj2, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.n;
        if (set != null) {
            return set;
        }
        sas sasVar = new sas(this);
        this.n = sasVar;
        return sasVar;
    }

    public final void l(int i, Object obj, boolean z) {
        a.I(i != -1);
        int iBb = ujp.bb(obj);
        int iF = f(obj, iBb);
        if (iF != -1) {
            if (!z) {
                throw new IllegalArgumentException("Value already present in map: ".concat(String.valueOf(String.valueOf(obj))));
            }
            j(iF, iBb);
            if (i == this.c) {
                i = iF;
            }
        }
        r(i, ujp.bb(this.b[i]));
        this.b[i] = obj;
        u(i, iBb);
    }

    final void m() {
        ujp.bq(16, "expectedSize");
        int iBc = ujp.bc(16);
        this.c = 0;
        this.a = new Object[16];
        this.b = new Object[16];
        this.h = x(iBc);
        this.i = x(iBc);
        this.j = x(16);
        this.k = x(16);
        this.e = -2;
        this.l = -2;
        this.m = x(16);
        this.f = x(16);
    }

    final Object n(Object obj, Object obj2) {
        int iBb = ujp.bb(obj);
        int iF = f(obj, iBb);
        if (iF != -1) {
            Object obj3 = this.a[iF];
            if (a.K(obj3, obj2)) {
                return obj2;
            }
            o(iF, obj2);
            return obj3;
        }
        int i = this.l;
        int iBb2 = ujp.bb(obj2);
        rnt.F(c(obj2, iBb2) == -1, "Key already present: %s", obj2);
        s(this.c + 1);
        Object[] objArr = this.a;
        int i2 = this.c;
        objArr[i2] = obj2;
        this.b[i2] = obj;
        t(i2, iBb2);
        u(this.c, iBb);
        int i3 = i == -2 ? this.e : this.f[i];
        w(i, this.c);
        w(this.c, i3);
        this.c++;
        this.d++;
        return null;
    }

    public final void o(int i, Object obj) {
        a.I(i != -1);
        int iC = c(obj, ujp.bb(obj));
        int i2 = this.l;
        if (iC != -1) {
            throw new IllegalArgumentException("Key already present in map: ".concat(String.valueOf(String.valueOf(obj))));
        }
        if (i2 == i) {
            i2 = this.m[i];
        } else if (i2 == this.c) {
            i2 = iC;
        }
        if (i == -2) {
            iC = this.f[-2];
        } else if (this.c != -2) {
            iC = -2;
        }
        w(this.m[i], this.f[i]);
        q(i, ujp.bb(this.a[i]));
        this.a[i] = obj;
        t(i, ujp.bb(obj));
        w(i2, i);
        w(i, iC);
    }

    @Override // java.util.AbstractMap, java.util.Map, defpackage.ryq
    public final Object put(Object obj, Object obj2) {
        return h(obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int iBb = ujp.bb(obj);
        int iC = c(obj, iBb);
        if (iC == -1) {
            return null;
        }
        Object obj2 = this.b[iC];
        i(iC, iBb);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }
}
