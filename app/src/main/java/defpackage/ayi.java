package defpackage;

import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayi {
    public static final Object a = new azt("provider");
    public static final Object b = new azt("provider");
    public static final Object c = new azt("compositionLocalMap");
    public static final Object d = new azt("providers");
    public static final Object e = new azt("reference");
    public static final Comparator f = new wp(5);

    public static final int a(boolean z) {
        return z ? 1 : 0;
    }

    public static final int b(bav bavVar, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = bavVar.e(i);
            i3++;
        }
        return i3;
    }

    public static final int c(List list, int i) {
        int iD = d(list, i);
        return iD < 0 ? -(iD + 1) : iD;
    }

    public static final int d(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iA = ujp.a(((azf) list.get(i3)).b, i);
            if (iA < 0) {
                i2 = i3 + 1;
            } else {
                if (iA <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final azf e(List list, int i, int i2) {
        int iC = c(list, i);
        if (iC >= list.size()) {
            return null;
        }
        azf azfVar = (azf) list.get(iC);
        if (azfVar.b < i2) {
            return azfVar;
        }
        return null;
    }

    public static final azf f(List list, int i) {
        int iD = d(list, i);
        if (iD >= 0) {
            return (azf) list.remove(iD);
        }
        return null;
    }

    public static final Void g(String str) {
        throw new axz(a.bw(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void h(bav bavVar, List list, int i) {
        if (bavVar.B(i)) {
            list.add(bavVar.o(i));
            return;
        }
        int iC = i + 1;
        int iC2 = i + bavVar.c(i);
        while (iC < iC2) {
            h(bavVar, list, iC);
            iC += bavVar.c(iC);
        }
    }

    public static final void i(String str) {
        throw new axz(a.bw(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void j(List list, int i, int i2) {
        int iC = c(list, i);
        while (iC < list.size() && ((azf) list.get(iC)).b < i2) {
        }
    }

    public static final boolean k(int i) {
        return i != 0;
    }

    public static final void l(baz bazVar, bfn bfnVar) {
        int iG;
        int[] iArr = bazVar.b;
        int i = bazVar.o;
        int iC = bazVar.c(iArr, bazVar.h(i + bazVar.j(i)));
        for (int iC2 = bazVar.c(bazVar.b, bazVar.h(bazVar.o)); iC2 < iC; iC2++) {
            Object obj = bazVar.c[bazVar.d(iC2)];
            int iA = -1;
            if (obj instanceof axy) {
                bfnVar.e((axy) obj, bazVar.g() - iC2, -1, -1);
            } else if (obj instanceof bar) {
                bar barVar = (bar) obj;
                if (!(barVar.a instanceof aye)) {
                    o(bazVar, iC2, obj);
                    int iG2 = bazVar.g() - iC2;
                    axq axqVar = barVar.b;
                    if (axqVar == null || !axqVar.a()) {
                        iG = -1;
                    } else {
                        iA = bazVar.a(axqVar);
                        iG = bazVar.g() - bazVar.p(iA);
                    }
                    bfnVar.d(barVar, iG2, iA, iG);
                }
            } else if (obj instanceof bai) {
                o(bazVar, iC2, obj);
                ((bai) obj).b();
            }
        }
    }

    public static final void m(baz bazVar, bfn bfnVar) {
        int iG;
        int[] iArr = bazVar.b;
        int i = bazVar.o;
        int iC = bazVar.c(iArr, bazVar.h(i + bazVar.j(i)));
        for (int iC2 = bazVar.c(bazVar.b, bazVar.h(bazVar.o)); iC2 < iC; iC2++) {
            Object obj = bazVar.c[bazVar.d(iC2)];
            int iA = -1;
            if (obj instanceof axy) {
                int iG2 = bazVar.g() - iC2;
                axy axyVar = (axy) obj;
                zw zwVar = bfnVar.d;
                if (zwVar == null) {
                    int i2 = zx.a;
                    zwVar = new zw((byte[]) null);
                    bfnVar.d = zwVar;
                }
                zwVar.h(axyVar);
                bfnVar.e(axyVar, iG2, -1, -1);
            }
            if (obj instanceof bar) {
                int iG3 = bazVar.g() - iC2;
                bar barVar = (bar) obj;
                axq axqVar = barVar.b;
                if (axqVar == null || !axqVar.a()) {
                    iG = -1;
                } else {
                    iA = bazVar.a(axqVar);
                    iG = bazVar.g() - bazVar.p(iA);
                }
                bfnVar.d(barVar, iG3, iA, iG);
            }
            if (obj instanceof bai) {
                ((bai) obj).b();
            }
        }
        bazVar.T();
    }

    public static final ejs n(ayn aynVar, azq azqVar, baz bazVar, axr axrVar) {
        baw bawVar = new baw();
        if (bazVar.e != null) {
            bawVar.e();
        }
        if (bazVar.s != null) {
            bawVar.d();
        }
        int i = bazVar.o;
        if (axrVar != null && bazVar.k(i) > 0) {
            int iL = bazVar.q;
            while (iL > 0 && !bazVar.S(iL)) {
                iL = bazVar.l(iL);
            }
            if (iL >= 0 && bazVar.S(iL)) {
                Object objV = bazVar.v(iL);
                int i2 = iL + 1;
                int iJ = iL + bazVar.j(iL);
                int iK = 0;
                while (i2 < iJ) {
                    int iJ2 = bazVar.j(i2) + i2;
                    if (iJ2 > i) {
                        break;
                    }
                    iK += bazVar.S(i2) ? 1 : bazVar.k(i2);
                    i2 = iJ2;
                }
                int iK2 = bazVar.S(i) ? 1 : bazVar.k(i);
                axrVar.d(objV);
                axrVar.l(iK, iK2);
                axrVar.h();
            }
        }
        baz bazVarC = bawVar.c();
        try {
            bazVarC.y();
            bazVarC.M(126665345, azqVar.a);
            baz.X(bazVarC);
            bazVarC.Z(azqVar.b);
            axq axqVar = azqVar.d;
            if (bazVarC.m <= 0) {
                i("Check failed");
            }
            if (bazVar.m != 0) {
                i("Check failed");
            }
            if (!axqVar.a()) {
                i("Check failed");
            }
            int iA = bazVar.a(axqVar) + 1;
            int i3 = bazVar.o;
            if (i3 > iA || iA >= bazVar.p) {
                i("Check failed");
            }
            int iL2 = bazVar.l(iA);
            int iJ3 = bazVar.j(iA);
            int iK3 = bazVar.S(iA) ? 1 : bazVar.k(iA);
            List listAj = byi.aj(bazVar, iA, bazVarC, false, false, true);
            bazVar.P(iL2);
            boolean z = iK3 > 0;
            while (iL2 >= i3) {
                int iH = bazVar.h(iL2);
                int[] iArr = bazVar.b;
                bay.h(iArr, iH, bay.a(iArr, iH) - iJ3);
                if (z) {
                    int[] iArr2 = bazVar.b;
                    int i4 = iArr2[(iH * 5) + 1];
                    if ((1073741824 & i4) != 0) {
                        z = false;
                    } else {
                        bay.i(iArr2, iH, (i4 & 67108863) - iK3);
                        z = true;
                    }
                } else {
                    z = false;
                }
                iL2 = bazVar.l(iL2);
            }
            if (z) {
                if (bazVar.n < iK3) {
                    i("Check failed");
                }
                bazVar.n -= iK3;
            }
            bazVarC.m();
            bazVarC.W();
            bazVarC.A();
            bazVarC.z(true);
            ejs ejsVar = new ejs(bawVar, (byte[]) null);
            if (!listAj.isEmpty()) {
                int size = listAj.size();
                for (int i5 = 0; i5 < size; i5++) {
                    axq axqVar2 = (axq) listAj.get(i5);
                    if (bawVar.f(axqVar2)) {
                        int iA2 = bawVar.a(axqVar2);
                        int iE = bay.e(bawVar.a, iA2);
                        int i6 = iA2 + 1;
                        if (((i6 < bawVar.b ? bawVar.a[(i6 * 5) + 4] : bawVar.c.length) - iE > 0 ? bawVar.c[iE] : ayb.a) instanceof bai) {
                            ayh ayhVar = new ayh(aynVar, azqVar);
                            bazVarC = bawVar.c();
                            try {
                                bay.l(bazVarC, listAj, ayhVar);
                                bazVarC.z(true);
                                return ejsVar;
                            } finally {
                            }
                        }
                    }
                }
            }
            return ejsVar;
        } finally {
        }
    }

    private static final void o(baz bazVar, int i, Object obj) {
        int iD = bazVar.d(i);
        Object[] objArr = bazVar.c;
        Object obj2 = objArr[iD];
        objArr[iD] = ayb.a;
        if (obj == obj2) {
            return;
        }
        i(mn.e((byte) 41, obj2, obj, "Slot table is out of sync (expected ", ", got "));
    }
}
