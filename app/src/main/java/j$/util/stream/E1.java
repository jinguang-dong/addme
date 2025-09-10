package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class E1 {
    public static final E1 DISTINCT;
    public static final E1 ORDERED;
    public static final E1 SHORT_CIRCUIT;
    public static final E1 SIZED;
    public static final E1 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final /* synthetic */ E1[] u;
    public final EnumMap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        D1 d1 = D1.SPLITERATOR;
        j$.desugar.sun.nio.fs.h hVarB = B(d1);
        D1 d12 = D1.STREAM;
        hVarB.b(d12);
        D1 d13 = D1.OP;
        ((EnumMap) hVarB.b).put((EnumMap) d13, (D1) 3);
        E1 e1 = new E1("DISTINCT", 0, 0, hVarB);
        DISTINCT = e1;
        j$.desugar.sun.nio.fs.h hVarB2 = B(d1);
        hVarB2.b(d12);
        ((EnumMap) hVarB2.b).put((EnumMap) d13, (D1) 3);
        E1 e12 = new E1("SORTED", 1, 1, hVarB2);
        SORTED = e12;
        j$.desugar.sun.nio.fs.h hVarB3 = B(d1);
        hVarB3.b(d12);
        EnumMap enumMap = (EnumMap) hVarB3.b;
        enumMap.put((EnumMap) d13, (D1) 3);
        D1 d14 = D1.TERMINAL_OP;
        enumMap.put((EnumMap) d14, (D1) 2);
        D1 d15 = D1.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) d15, (D1) 2);
        E1 e13 = new E1("ORDERED", 2, 2, hVarB3);
        ORDERED = e13;
        j$.desugar.sun.nio.fs.h hVarB4 = B(d1);
        hVarB4.b(d12);
        ((EnumMap) hVarB4.b).put((EnumMap) d13, (D1) 2);
        E1 e14 = new E1("SIZED", 3, 3, hVarB4);
        SIZED = e14;
        j$.desugar.sun.nio.fs.h hVarB5 = B(d13);
        hVarB5.b(d14);
        int i2 = 0;
        E1 e15 = new E1("SHORT_CIRCUIT", 4, 12, hVarB5);
        SHORT_CIRCUIT = e15;
        u = new E1[]{e1, e12, e13, e14, e15};
        f = k(d1);
        g = k(d12);
        h = k(d13);
        k(d14);
        k(d15);
        for (E1 e16 : values()) {
            i2 |= e16.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        E1 e17 = DISTINCT;
        m = e17.c;
        n = e17.d;
        E1 e18 = SORTED;
        int i5 = e18.c;
        o = e18.d;
        E1 e19 = ORDERED;
        p = e19.c;
        q = e19.d;
        E1 e110 = SIZED;
        r = e110.c;
        s = e110.d;
        t = SHORT_CIRCUIT.c;
    }

    public E1(String str, int i2, int i3, j$.desugar.sun.nio.fs.h hVar) {
        EnumMap enumMap = (EnumMap) hVar.b;
        for (D1 d1 : D1.values()) {
            Map.EL.putIfAbsent(enumMap, d1, 0);
        }
        this.a = enumMap;
        int i4 = i3 * 2;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public static j$.desugar.sun.nio.fs.h B(D1 d1) {
        j$.desugar.sun.nio.fs.h hVar = new j$.desugar.sun.nio.fs.h(15, new EnumMap(D1.class));
        hVar.b(d1);
        return hVar;
    }

    public static int h(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1))));
    }

    public static int k(D1 d1) {
        int iIntValue = 0;
        for (E1 e1 : values()) {
            iIntValue |= ((Integer) e1.a.get(d1)).intValue() << e1.b;
        }
        return iIntValue;
    }

    public static int l(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }

    public static E1 valueOf(String str) {
        return (E1) Enum.valueOf(E1.class, str);
    }

    public static E1[] values() {
        return (E1[]) u.clone();
    }

    public final boolean s(int i2) {
        return (i2 & this.e) == this.c;
    }
}
