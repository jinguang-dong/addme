package defpackage;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjq extends AbstractMap implements Serializable {
    public static final Comparator a = new cbi(12);
    tjp b;
    int c;
    int d;
    final tjp e;
    private final Comparator f;
    private final boolean g;
    private tjl h;
    private tjn i;

    public tjq() {
        this(a, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void f(defpackage.tjp r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            tjp r0 = r9.b
            tjp r1 = r9.c
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.i
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.i
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            tjp r0 = r1.b
            tjp r3 = r1.c
            if (r3 == 0) goto L22
            int r3 = r3.i
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.i
            goto L29
        L28:
            r0 = r2
        L29:
            int r0 = r0 - r3
            r3 = -1
            if (r0 == r3) goto L3a
            if (r0 != 0) goto L32
            if (r10 != 0) goto L33
            goto L3b
        L32:
            r7 = r10
        L33:
            r8.i(r1)
            r8.h(r9)
            goto L3f
        L3a:
            r2 = r10
        L3b:
            r8.h(r9)
            r7 = r2
        L3f:
            if (r7 != 0) goto L84
            goto L80
        L42:
            r1 = 2
            if (r5 != r1) goto L6d
            tjp r1 = r0.b
            tjp r3 = r0.c
            if (r3 == 0) goto L4e
            int r3 = r3.i
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.i
            goto L55
        L54:
            r1 = r2
        L55:
            int r1 = r1 - r3
            if (r1 == r7) goto L65
            if (r1 != 0) goto L5d
            if (r10 != 0) goto L5e
            goto L66
        L5d:
            r7 = r10
        L5e:
            r8.h(r0)
            r8.i(r9)
            goto L6a
        L65:
            r2 = r10
        L66:
            r8.i(r9)
            r7 = r2
        L6a:
            if (r7 == 0) goto L80
            goto L84
        L6d:
            if (r5 != 0) goto L76
            int r3 = r3 + 1
            r9.i = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.i = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            tjp r9 = r9.a
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tjq.f(tjp, boolean):void");
    }

    private final void g(tjp tjpVar, tjp tjpVar2) {
        tjp tjpVar3 = tjpVar.a;
        tjpVar.a = null;
        if (tjpVar2 != null) {
            tjpVar2.a = tjpVar3;
        }
        if (tjpVar3 == null) {
            this.b = tjpVar2;
        } else if (tjpVar3.b == tjpVar) {
            tjpVar3.b = tjpVar2;
        } else {
            tjpVar3.c = tjpVar2;
        }
    }

    private final void h(tjp tjpVar) {
        tjp tjpVar2 = tjpVar.b;
        tjp tjpVar3 = tjpVar.c;
        tjp tjpVar4 = tjpVar3.b;
        tjp tjpVar5 = tjpVar3.c;
        tjpVar.c = tjpVar4;
        if (tjpVar4 != null) {
            tjpVar4.a = tjpVar;
        }
        g(tjpVar, tjpVar3);
        tjpVar3.b = tjpVar;
        tjpVar.a = tjpVar3;
        int iMax = Math.max(tjpVar2 != null ? tjpVar2.i : 0, tjpVar4 != null ? tjpVar4.i : 0) + 1;
        tjpVar.i = iMax;
        tjpVar3.i = Math.max(iMax, tjpVar5 != null ? tjpVar5.i : 0) + 1;
    }

    private final void i(tjp tjpVar) {
        tjp tjpVar2 = tjpVar.b;
        tjp tjpVar3 = tjpVar.c;
        tjp tjpVar4 = tjpVar2.b;
        tjp tjpVar5 = tjpVar2.c;
        tjpVar.b = tjpVar5;
        if (tjpVar5 != null) {
            tjpVar5.a = tjpVar;
        }
        g(tjpVar, tjpVar2);
        tjpVar2.c = tjpVar;
        tjpVar.a = tjpVar2;
        int iMax = Math.max(tjpVar3 != null ? tjpVar3.i : 0, tjpVar5 != null ? tjpVar5.i : 0) + 1;
        tjpVar.i = iMax;
        tjpVar2.i = Math.max(iMax, tjpVar4 != null ? tjpVar4.i : 0) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    final tjp a(Object obj, boolean z) {
        int iCompareTo;
        tjp tjpVar;
        Comparator comparator = this.f;
        tjp tjpVar2 = this.b;
        if (tjpVar2 != null) {
            Comparable comparable = comparator == a ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(tjpVar2.f) : comparator.compare(obj, tjpVar2.f);
                if (iCompareTo == 0) {
                    return tjpVar2;
                }
                tjp tjpVar3 = iCompareTo < 0 ? tjpVar2.b : tjpVar2.c;
                if (tjpVar3 == null) {
                    break;
                }
                tjpVar2 = tjpVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i = iCompareTo;
        if (!z) {
            return null;
        }
        tjp tjpVar4 = this.e;
        if (tjpVar2 != null) {
            tjp tjpVar5 = tjpVar2;
            tjpVar = new tjp(this.g, tjpVar5, obj, tjpVar4, tjpVar4.e);
            if (i < 0) {
                tjpVar5.b = tjpVar;
            } else {
                tjpVar5.c = tjpVar;
            }
            f(tjpVar5, true);
        } else {
            if (comparator == a && !(obj instanceof Comparable)) {
                throw new ClassCastException(String.valueOf(obj.getClass().getName()).concat(" is not Comparable"));
            }
            tjpVar = new tjp(this.g, null, obj, tjpVar4, tjpVar4.e);
            this.b = tjpVar;
        }
        this.c++;
        this.d++;
        return tjpVar;
    }

    final tjp b(Map.Entry entry) {
        tjp tjpVarC = c(entry.getKey());
        if (tjpVarC == null || !Objects.equals(tjpVarC.h, entry.getValue())) {
            return null;
        }
        return tjpVarC;
    }

    final tjp c(Object obj) {
        if (obj != null) {
            try {
                return a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = null;
        this.c = 0;
        this.d++;
        tjp tjpVar = this.e;
        tjpVar.e = tjpVar;
        tjpVar.d = tjpVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    final tjp d(Object obj) {
        tjp tjpVarC = c(obj);
        if (tjpVarC != null) {
            e(tjpVarC, true);
        }
        return tjpVarC;
    }

    final void e(tjp tjpVar, boolean z) {
        tjp tjpVar2;
        tjp tjpVar3;
        int i;
        if (z) {
            tjp tjpVar4 = tjpVar.e;
            tjpVar4.d = tjpVar.d;
            tjpVar.d.e = tjpVar4;
        }
        tjp tjpVar5 = tjpVar.b;
        tjp tjpVar6 = tjpVar.c;
        tjp tjpVar7 = tjpVar.a;
        int i2 = 0;
        if (tjpVar5 == null || tjpVar6 == null) {
            if (tjpVar5 != null) {
                g(tjpVar, tjpVar5);
                tjpVar.b = null;
            } else if (tjpVar6 != null) {
                g(tjpVar, tjpVar6);
                tjpVar.c = null;
            } else {
                g(tjpVar, null);
            }
            f(tjpVar7, false);
            this.c--;
            this.d++;
            return;
        }
        if (tjpVar5.i > tjpVar6.i) {
            do {
                tjpVar3 = tjpVar5;
                tjpVar5 = tjpVar5.c;
            } while (tjpVar5 != null);
        } else {
            do {
                tjpVar2 = tjpVar6;
                tjpVar6 = tjpVar6.b;
            } while (tjpVar6 != null);
            tjpVar3 = tjpVar2;
        }
        e(tjpVar3, false);
        tjp tjpVar8 = tjpVar.b;
        if (tjpVar8 != null) {
            i = tjpVar8.i;
            tjpVar3.b = tjpVar8;
            tjpVar8.a = tjpVar3;
            tjpVar.b = null;
        } else {
            i = 0;
        }
        tjp tjpVar9 = tjpVar.c;
        if (tjpVar9 != null) {
            i2 = tjpVar9.i;
            tjpVar3.c = tjpVar9;
            tjpVar9.a = tjpVar3;
            tjpVar.c = null;
        }
        tjpVar3.i = Math.max(i, i2) + 1;
        g(tjpVar, tjpVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        tjl tjlVar = this.h;
        if (tjlVar != null) {
            return tjlVar;
        }
        tjl tjlVar2 = new tjl(this);
        this.h = tjlVar2;
        return tjlVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        tjp tjpVarC = c(obj);
        if (tjpVarC != null) {
            return tjpVarC.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        tjn tjnVar = this.i;
        if (tjnVar != null) {
            return tjnVar;
        }
        tjn tjnVar2 = new tjn(this);
        this.i = tjnVar2;
        return tjnVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.g) {
            throw new NullPointerException("value == null");
        }
        tjp tjpVarA = a(obj, true);
        Object obj3 = tjpVarA.h;
        tjpVarA.h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        tjp tjpVarD = d(obj);
        if (tjpVarD != null) {
            return tjpVarD.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    public tjq(Comparator comparator, boolean z) {
        this.c = 0;
        this.d = 0;
        this.f = comparator;
        this.g = z;
        this.e = new tjp(z);
    }
}
