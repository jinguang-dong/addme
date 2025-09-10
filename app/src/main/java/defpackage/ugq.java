package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ugq implements Map, Serializable, ukg {
    public static final ugq a;
    public Object[] b;
    public Object[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    private int[] i;
    private int j;
    private int k;
    private ugs l;
    private ugt m;
    private ugr n;

    static {
        ugq ugqVar = new ugq(0);
        ugqVar.h = true;
        a = ugqVar;
    }

    public ugq() {
        this(8);
    }

    private final int l() {
        return this.i.length;
    }

    private final int m(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.k;
    }

    private final void n(boolean z) {
        int i;
        Object[] objArr = this.c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.e;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.d;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                int i5 = i3 + 1;
                Object[] objArr2 = this.b;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.i[i4] = i5;
                }
                i3 = i5;
            }
            i2++;
        }
        ske.aQ(this.b, i3, i);
        if (objArr != null) {
            ske.aQ(objArr, i3, this.e);
        }
        this.e = i3;
    }

    private final void o(int i) {
        int iD = d();
        int i2 = this.e;
        int i3 = iD - i2;
        int i4 = i2 - this.g;
        if (i3 < i && i3 + i4 >= i && i4 >= (d() >> 2)) {
            n(true);
            return;
        }
        int i5 = this.e + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > d()) {
            int iAK = rnt.aK(d(), i5);
            this.b = ske.aT(this.b, iAK);
            Object[] objArr = this.c;
            this.c = objArr != null ? ske.aT(objArr, iAK) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.d, iAK);
            iArrCopyOf.getClass();
            this.d = iArrCopyOf;
            int iAL = ske.aL(iAK);
            if (iAL > l()) {
                q(iAL);
            }
        }
    }

    private final void p() {
        this.f++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r3[r0] = r6;
        r5.d[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void q(int r6) {
        /*
            r5 = this;
            r5.p()
            int r0 = r5.e
            int r1 = r5.g
            r2 = 0
            if (r0 <= r1) goto Ld
            r5.n(r2)
        Ld:
            int[] r0 = new int[r6]
            r5.i = r0
            int r6 = defpackage.ske.aM(r6)
            r5.k = r6
        L17:
            int r6 = r5.e
            if (r2 >= r6) goto L4e
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.b
            r0 = r0[r2]
            int r0 = r5.m(r0)
            int r1 = r5.j
        L27:
            int[] r3 = r5.i
            r4 = r3[r0]
            if (r4 != 0) goto L35
            r3[r0] = r6
            int[] r1 = r5.d
            r1[r2] = r0
            r2 = r6
            goto L17
        L35:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L46
            int r3 = r0 + (-1)
            if (r0 != 0) goto L44
            int r0 = r5.l()
            int r0 = r0 + (-1)
            goto L27
        L44:
            r0 = r3
            goto L27
        L46:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r5.<init>(r6)
            throw r5
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugq.q(int):void");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.h) {
            return new ugv(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(Object obj) {
        f();
        while (true) {
            int iM = m(obj);
            int i = this.j;
            int i2 = i + i;
            int iL = l() >> 1;
            int i3 = 0;
            while (true) {
                int i4 = this.i[iM];
                if (i4 <= 0) {
                    if (this.e < d()) {
                        int i5 = this.e;
                        int i6 = i5 + 1;
                        this.e = i6;
                        this.b[i5] = obj;
                        this.d[i5] = iM;
                        this.i[iM] = i6;
                        this.g++;
                        p();
                        if (i3 > this.j) {
                            this.j = i3;
                        }
                        return i5;
                    }
                    o(1);
                } else {
                    if (a.ao(this.b[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > ukc.o(i2, iL)) {
                        int iL2 = l();
                        q(iL2 + iL2);
                        break;
                    }
                    iM = iM == 0 ? l() - 1 : iM - 1;
                }
            }
        }
    }

    public final int b(Object obj) {
        int iM = m(obj);
        int i = this.j;
        while (true) {
            int i2 = this.i[iM];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (a.ao(this.b[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM = iM == 0 ? l() - 1 : iM - 1;
        }
    }

    public final int c(Object obj) {
        int i = this.e;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.d[i] >= 0) {
                Object[] objArr = this.c;
                objArr.getClass();
                if (a.ao(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        f();
        int i = this.e - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.i[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        ske.aQ(this.b, 0, this.e);
        Object[] objArr = this.c;
        if (objArr != null) {
            ske.aQ(objArr, 0, this.e);
        }
        this.g = 0;
        this.e = 0;
        p();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c(obj) >= 0;
    }

    public final int d() {
        return this.b.length;
    }

    public final Map e() {
        f();
        this.h = true;
        if (this.g > 0) {
            return this;
        }
        ugq ugqVar = a;
        ugqVar.getClass();
        return ugqVar;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        ugr ugrVar = this.n;
        if (ugrVar != null) {
            return ugrVar;
        }
        ugr ugrVar2 = new ugr(this);
        this.n = ugrVar2;
        return ugrVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.g == map.size() && h(map.entrySet())) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.h) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:6:0x0021->B:30:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r11) {
        /*
            r10 = this;
            java.lang.Object[] r0 = r10.b
            defpackage.ske.aP(r0, r11)
            java.lang.Object[] r0 = r10.c
            if (r0 == 0) goto Lc
            defpackage.ske.aP(r0, r11)
        Lc:
            int[] r0 = r10.d
            r0 = r0[r11]
            int r1 = r10.j
            int r1 = r1 + r1
            int r2 = r10.l()
            int r2 = r2 >> 1
            int r1 = defpackage.ukc.o(r1, r2)
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L21:
            r5 = -1
            if (r0 != 0) goto L2a
            int r0 = r10.l()
            int r0 = r0 + r5
            goto L2c
        L2a:
            int r0 = r0 + (-1)
        L2c:
            int r4 = r4 + 1
            int r6 = r10.j
            if (r4 <= r6) goto L37
            int[] r0 = r10.i
            r0[r1] = r2
            goto L6a
        L37:
            int[] r6 = r10.i
            r7 = r6[r0]
            if (r7 != 0) goto L40
            r6[r1] = r2
            goto L6a
        L40:
            if (r7 >= 0) goto L47
            r6[r1] = r5
        L44:
            r1 = r0
            r4 = r2
            goto L63
        L47:
            java.lang.Object[] r6 = r10.b
            int r8 = r7 + (-1)
            r6 = r6[r8]
            int r6 = r10.m(r6)
            int r6 = r6 - r0
            int r9 = r10.l()
            int r9 = r9 + r5
            r6 = r6 & r9
            if (r6 < r4) goto L63
            int[] r4 = r10.i
            r4[r1] = r7
            int[] r4 = r10.d
            r4[r8] = r1
            goto L44
        L63:
            int r3 = r3 + r5
            if (r3 >= 0) goto L21
            int[] r0 = r10.i
            r0[r1] = r5
        L6a:
            int[] r0 = r10.d
            r0[r11] = r5
            int r11 = r10.g
            int r11 = r11 + r5
            r10.g = r11
            r10.p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugq.g(int):void");
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iB = b(obj);
        if (iB < 0) {
            return null;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr[iB];
    }

    public final boolean h(Collection collection) {
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!i((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        ugm ugmVar = new ugm(this);
        int i = 0;
        while (ugmVar.hasNext()) {
            int i2 = ugmVar.b;
            ugq ugqVar = ugmVar.a;
            if (i2 >= ugqVar.e) {
                throw new NoSuchElementException();
            }
            ugmVar.b = i2 + 1;
            ugmVar.c = i2;
            Object obj = ugqVar.b[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ugqVar.c;
            objArr.getClass();
            Object obj2 = objArr[ugmVar.c];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            ugmVar.b();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final boolean i(Map.Entry entry) {
        int iB = b(entry.getKey());
        if (iB < 0) {
            return false;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        return a.ao(objArr[iB], entry.getValue());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.g == 0;
    }

    public final boolean j(Object obj) {
        f();
        int iB = b(obj);
        if (iB < 0) {
            return false;
        }
        g(iB);
        return true;
    }

    public final Object[] k() {
        Object[] objArr = this.c;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrAS = ske.aS(d());
        this.c = objArrAS;
        return objArrAS;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        ugs ugsVar = this.l;
        if (ugsVar != null) {
            return ugsVar;
        }
        ugs ugsVar2 = new ugs(this);
        this.l = ugsVar2;
        return ugsVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        f();
        int iA = a(obj);
        Object[] objArrK = k();
        if (iA >= 0) {
            objArrK[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArrK[i];
        objArrK[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        f();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        o(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArrK = k();
            if (iA >= 0) {
                objArrK[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!a.ao(entry.getValue(), objArrK[i])) {
                    objArrK[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        f();
        int iB = b(obj);
        if (iB < 0) {
            return null;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        Object obj2 = objArr[iB];
        g(iB);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.g * 3) + 2);
        sb.append("{");
        ugm ugmVar = new ugm(this);
        int i = 0;
        while (ugmVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = ugmVar.b;
            ugq ugqVar = ugmVar.a;
            if (i2 >= ugqVar.e) {
                throw new NoSuchElementException();
            }
            ugmVar.b = i2 + 1;
            ugmVar.c = i2;
            Object obj = ugqVar.b[i2];
            if (obj == ugqVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ugqVar.c;
            objArr.getClass();
            Object obj2 = objArr[ugmVar.c];
            if (obj2 == ugqVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            ugmVar.b();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        ugt ugtVar = this.m;
        if (ugtVar != null) {
            return ugtVar;
        }
        ugt ugtVar2 = new ugt(this);
        this.m = ugtVar2;
        return ugtVar2;
    }

    public ugq(int i) {
        Object[] objArrAS = ske.aS(i);
        int[] iArr = new int[i];
        int[] iArr2 = new int[ske.aL(i)];
        this.b = objArrAS;
        this.c = null;
        this.d = iArr;
        this.i = iArr2;
        this.j = 2;
        this.e = 0;
        this.k = ske.aM(l());
    }
}
