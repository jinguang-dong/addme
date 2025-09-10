package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
final class trh {
    public static final trp a;

    static {
        tra traVar = tra.a;
        a = new trp();
    }

    public static void A(int i, List list, ocq ocqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof tpi)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((tos) ocqVar.a).B(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            tos tosVar = (tos) ocqVar.a;
            tosVar.A(i, 2);
            int iAb = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAb += tos.ab(((Integer) list.get(i3)).intValue());
            }
            tosVar.C(iAb);
            while (i2 < list.size()) {
                tosVar.C(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tpi tpiVar = (tpi) list;
        if (!z) {
            while (i2 < tpiVar.c) {
                ((tos) ocqVar.a).B(i, tpiVar.d(i2));
                i2++;
            }
            return;
        }
        tos tosVar2 = (tos) ocqVar.a;
        tosVar2.A(i, 2);
        int iAb2 = 0;
        for (int i4 = 0; i4 < tpiVar.c; i4++) {
            iAb2 += tos.ab(tpiVar.d(i4));
        }
        tosVar2.C(iAb2);
        while (i2 < tpiVar.c) {
            tosVar2.C(tpiVar.d(i2));
            i2++;
        }
    }

    public static void B(int i, List list, ocq ocqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof tqh)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((tos) ocqVar.a).D(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            tos tosVar = (tos) ocqVar.a;
            tosVar.A(i, 2);
            int iAd = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAd += tos.ad(((Long) list.get(i3)).longValue());
            }
            tosVar.C(iAd);
            while (i2 < list.size()) {
                tosVar.E(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        tqh tqhVar = (tqh) list;
        if (!z) {
            while (i2 < tqhVar.c) {
                ((tos) ocqVar.a).D(i, tqhVar.a(i2));
                i2++;
            }
            return;
        }
        tos tosVar2 = (tos) ocqVar.a;
        tosVar2.A(i, 2);
        int iAd2 = 0;
        for (int i4 = 0; i4 < tqhVar.c; i4++) {
            iAd2 += tos.ad(tqhVar.a(i4));
        }
        tosVar2.C(iAd2);
        while (i2 < tqhVar.c) {
            tosVar2.E(tqhVar.a(i2));
            i2++;
        }
    }

    static int a(List list) {
        return list.size() * 4;
    }

    static int b(List list) {
        return list.size() * 8;
    }

    static int c(int i, Object obj, trg trgVar) {
        return obj instanceof tqe ? tos.N(i, (tqe) obj) : tos.Z(i) + tos.R((tqr) obj, trgVar);
    }

    static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof tpi)) {
            int iU = 0;
            while (i < size) {
                iU += tos.U(((Integer) list.get(i)).intValue());
                i++;
            }
            return iU;
        }
        tpi tpiVar = (tpi) list;
        int iU2 = 0;
        while (i < size) {
            iU2 += tos.U(tpiVar.d(i));
            i++;
        }
        return iU2;
    }

    static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof tqh)) {
            int iW = 0;
            while (i < size) {
                iW += tos.W(((Long) list.get(i)).longValue());
                i++;
            }
            return iW;
        }
        tqh tqhVar = (tqh) list;
        int iW2 = 0;
        while (i < size) {
            iW2 += tos.W(tqhVar.a(i));
            i++;
        }
        return iW2;
    }

    static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof tpi)) {
            int iAb = 0;
            while (i < size) {
                iAb += tos.ab(((Integer) list.get(i)).intValue());
                i++;
            }
            return iAb;
        }
        tpi tpiVar = (tpi) list;
        int iAb2 = 0;
        while (i < size) {
            iAb2 += tos.ab(tpiVar.d(i));
            i++;
        }
        return iAb2;
    }

    static Object g(Object obj, int i, List list, tpl tplVar, Object obj2, trp trpVar) {
        if (tplVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!tplVar.a(iIntValue)) {
                    obj2 = h(obj, i, iIntValue, obj2, trpVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (tplVar.a(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = h(obj, i, iIntValue2, obj2, trpVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object h(Object obj, int i, int i2, Object obj2, trp trpVar) {
        if (obj2 == null) {
            obj2 = trpVar.b(obj);
        }
        trpVar.d(obj2, i, i2);
        return obj2;
    }

    static int i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * tos.au(i);
    }

    static int j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * tos.av(i);
    }

    public static /* synthetic */ int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof tpi)) {
            int iL = 0;
            while (i < size) {
                iL += tos.L(((Integer) list.get(i)).intValue());
                i++;
            }
            return iL;
        }
        tpi tpiVar = (tpi) list;
        int iL2 = 0;
        while (i < size) {
            iL2 += tos.L(tpiVar.d(i));
            i++;
        }
        return iL2;
    }

    public static /* synthetic */ int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof tqh)) {
            int iAd = 0;
            while (i < size) {
                iAd += tos.ad(((Long) list.get(i)).longValue());
                i++;
            }
            return iAd;
        }
        tqh tqhVar = (tqh) list;
        int iAd2 = 0;
        while (i < size) {
            iAd2 += tos.ad(tqhVar.a(i));
            i++;
        }
        return iAd2;
    }

    static void m(Object obj, Object obj2) {
        toy toyVarBd = rnt.bd(obj2);
        if (toyVarBd.h()) {
            return;
        }
        toy toyVarBe = rnt.be(obj);
        trl trlVar = toyVarBd.b;
        int i = trlVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            toyVarBe.f(trlVar.d(i2));
        }
        Iterator it = trlVar.a().iterator();
        while (it.hasNext()) {
            toyVarBe.f((Map.Entry) it.next());
        }
    }

    static void n(Object obj, Object obj2) {
        trq trqVarF = trp.f(obj);
        trq trqVarF2 = trp.f(obj2);
        trq trqVar = trq.a;
        if (!trqVar.equals(trqVarF2)) {
            if (trqVar.equals(trqVarF)) {
                int i = trqVarF.b + trqVarF2.b;
                int[] iArrCopyOf = Arrays.copyOf(trqVarF.c, i);
                System.arraycopy(trqVarF2.c, 0, iArrCopyOf, trqVarF.b, trqVarF2.b);
                Object[] objArrCopyOf = Arrays.copyOf(trqVarF.d, i);
                System.arraycopy(trqVarF2.d, 0, objArrCopyOf, trqVarF.b, trqVarF2.b);
                trqVarF = new trq(i, iArrCopyOf, objArrCopyOf, true);
            } else if (!trqVarF2.equals(trqVar)) {
                trqVarF.b();
                int i2 = trqVarF.b + trqVarF2.b;
                trqVarF.c(i2);
                System.arraycopy(trqVarF2.c, 0, trqVarF.c, trqVarF.b, trqVarF2.b);
                System.arraycopy(trqVarF2.d, 0, trqVarF.d, trqVarF.b, trqVarF2.b);
                trqVarF.b = i2;
            }
        }
        trp.g(obj, trqVarF);
    }

    public static void o(int i, List list, ocq ocqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof toa)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((tos) ocqVar.a).l(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            tos tosVar = (tos) ocqVar.a;
            tosVar.A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            tosVar.C(i3);
            while (i2 < list.size()) {
                tosVar.j(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        toa toaVar = (toa) list;
        if (!z) {
            while (i2 < toaVar.b) {
                ((tos) ocqVar.a).l(i, toaVar.g(i2));
                i2++;
            }
            return;
        }
        tos tosVar2 = (tos) ocqVar.a;
        tosVar2.A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < toaVar.b; i6++) {
            toaVar.g(i6);
            i5++;
        }
        tosVar2.C(i5);
        while (i2 < toaVar.b) {
            tosVar2.j(toaVar.g(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void p(int i, List list, ocq ocqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof tot)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((tos) ocqVar.a).aj(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            tos tosVar = (tos) ocqVar.a;
            tosVar.A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            tosVar.C(i3);
            while (i2 < list.size()) {
                tosVar.ak(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        tot totVar = (tot) list;
        if (!z) {
            while (i2 < totVar.b) {
                ((tos) ocqVar.a).aj(i, totVar.d(i2));
                i2++;
            }
            return;
        }
        tos tosVar2 = (tos) ocqVar.a;
        tosVar2.A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < totVar.b; i6++) {
            totVar.d(i6);
            i5 += 8;
        }
        tosVar2.C(i5);
        while (i2 < totVar.b) {
            tosVar2.ak(totVar.d(i2));
            i2++;
        }
    }

    public static void q(int i, List list, ocq ocqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof tpi)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((tos) ocqVar.a).s(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            tos tosVar = (tos) ocqVar.a;
            tosVar.A(i, 2);
            int iL = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iL += tos.L(((Integer) list.get(i3)).intValue());
            }
            tosVar.C(iL);
            while (i2 < list.size()) {
                tosVar.t(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tpi tpiVar = (tpi) list;
        if (!z) {
            while (i2 < tpiVar.c) {
                ((tos) ocqVar.a).s(i, tpiVar.d(i2));
                i2++;
            }
            return;
        }
        tos tosVar2 = (tos) ocqVar.a;
        tosVar2.A(i, 2);
        int iL2 = 0;
        for (int i4 = 0; i4 < tpiVar.c; i4++) {
            iL2 += tos.L(tpiVar.d(i4));
        }
        tosVar2.C(iL2);
        while (i2 < tpiVar.c) {
            tosVar2.t(tpiVar.d(i2));
            i2++;
        }
    }

    public static void r(int i, List list, ocq ocqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof tpi)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((tos) ocqVar.a).o(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            tos tosVar = (tos) ocqVar.a;
            tosVar.A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            tosVar.C(i3);
            while (i2 < list.size()) {
                tosVar.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tpi tpiVar = (tpi) list;
        if (!z) {
            while (i2 < tpiVar.c) {
                ((tos) ocqVar.a).o(i, tpiVar.d(i2));
                i2++;
            }
            return;
        }
        tos tosVar2 = (tos) ocqVar.a;
        tosVar2.A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < tpiVar.c; i6++) {
            tpiVar.d(i6);
            i5 += 4;
        }
        tosVar2.C(i5);
        while (i2 < tpiVar.c) {
            tosVar2.p(tpiVar.d(i2));
            i2++;
        }
    }

    public static void s(int i, List list, ocq ocqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof tqh)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((tos) ocqVar.a).q(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            tos tosVar = (tos) ocqVar.a;
            tosVar.A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            tosVar.C(i3);
            while (i2 < list.size()) {
                tosVar.r(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        tqh tqhVar = (tqh) list;
        if (!z) {
            while (i2 < tqhVar.c) {
                ((tos) ocqVar.a).q(i, tqhVar.a(i2));
                i2++;
            }
            return;
        }
        tos tosVar2 = (tos) ocqVar.a;
        tosVar2.A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < tqhVar.c; i6++) {
            tqhVar.a(i6);
            i5 += 8;
        }
        tosVar2.C(i5);
        while (i2 < tqhVar.c) {
            tosVar2.r(tqhVar.a(i2));
            i2++;
        }
    }

    public static void t(int i, List list, ocq ocqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof tpa)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((tos) ocqVar.a).al(i, ((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            tos tosVar = (tos) ocqVar.a;
            tosVar.A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            tosVar.C(i3);
            while (i2 < list.size()) {
                tosVar.am(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        tpa tpaVar = (tpa) list;
        if (!z) {
            while (i2 < tpaVar.c) {
                ((tos) ocqVar.a).al(i, tpaVar.d(i2));
                i2++;
            }
            return;
        }
        tos tosVar2 = (tos) ocqVar.a;
        tosVar2.A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < tpaVar.c; i6++) {
            tpaVar.d(i6);
            i5 += 4;
        }
        tosVar2.C(i5);
        while (i2 < tpaVar.c) {
            tosVar2.am(tpaVar.d(i2));
            i2++;
        }
    }

    public static void u(int i, List list, ocq ocqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof tpi)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((tos) ocqVar.a).s(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            tos tosVar = (tos) ocqVar.a;
            tosVar.A(i, 2);
            int iL = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iL += tos.L(((Integer) list.get(i3)).intValue());
            }
            tosVar.C(iL);
            while (i2 < list.size()) {
                tosVar.t(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tpi tpiVar = (tpi) list;
        if (!z) {
            while (i2 < tpiVar.c) {
                ((tos) ocqVar.a).s(i, tpiVar.d(i2));
                i2++;
            }
            return;
        }
        tos tosVar2 = (tos) ocqVar.a;
        tosVar2.A(i, 2);
        int iL2 = 0;
        for (int i4 = 0; i4 < tpiVar.c; i4++) {
            iL2 += tos.L(tpiVar.d(i4));
        }
        tosVar2.C(iL2);
        while (i2 < tpiVar.c) {
            tosVar2.t(tpiVar.d(i2));
            i2++;
        }
    }

    public static void v(int i, List list, ocq ocqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof tqh)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((tos) ocqVar.a).D(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            tos tosVar = (tos) ocqVar.a;
            tosVar.A(i, 2);
            int iAd = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAd += tos.ad(((Long) list.get(i3)).longValue());
            }
            tosVar.C(iAd);
            while (i2 < list.size()) {
                tosVar.E(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        tqh tqhVar = (tqh) list;
        if (!z) {
            while (i2 < tqhVar.c) {
                ((tos) ocqVar.a).D(i, tqhVar.a(i2));
                i2++;
            }
            return;
        }
        tos tosVar2 = (tos) ocqVar.a;
        tosVar2.A(i, 2);
        int iAd2 = 0;
        for (int i4 = 0; i4 < tqhVar.c; i4++) {
            iAd2 += tos.ad(tqhVar.a(i4));
        }
        tosVar2.C(iAd2);
        while (i2 < tqhVar.c) {
            tosVar2.E(tqhVar.a(i2));
            i2++;
        }
    }

    public static void w(int i, List list, ocq ocqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof tpi)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((tos) ocqVar.a).o(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            tos tosVar = (tos) ocqVar.a;
            tosVar.A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            tosVar.C(i3);
            while (i2 < list.size()) {
                tosVar.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tpi tpiVar = (tpi) list;
        if (!z) {
            while (i2 < tpiVar.c) {
                ((tos) ocqVar.a).o(i, tpiVar.d(i2));
                i2++;
            }
            return;
        }
        tos tosVar2 = (tos) ocqVar.a;
        tosVar2.A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < tpiVar.c; i6++) {
            tpiVar.d(i6);
            i5 += 4;
        }
        tosVar2.C(i5);
        while (i2 < tpiVar.c) {
            tosVar2.p(tpiVar.d(i2));
            i2++;
        }
    }

    public static void x(int i, List list, ocq ocqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof tqh)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((tos) ocqVar.a).q(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            tos tosVar = (tos) ocqVar.a;
            tosVar.A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            tosVar.C(i3);
            while (i2 < list.size()) {
                tosVar.r(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        tqh tqhVar = (tqh) list;
        if (!z) {
            while (i2 < tqhVar.c) {
                ((tos) ocqVar.a).q(i, tqhVar.a(i2));
                i2++;
            }
            return;
        }
        tos tosVar2 = (tos) ocqVar.a;
        tosVar2.A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < tqhVar.c; i6++) {
            tqhVar.a(i6);
            i5 += 8;
        }
        tosVar2.C(i5);
        while (i2 < tqhVar.c) {
            tosVar2.r(tqhVar.a(i2));
            i2++;
        }
    }

    public static void y(int i, List list, ocq ocqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof tpi)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((tos) ocqVar.a).ao(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            tos tosVar = (tos) ocqVar.a;
            tosVar.A(i, 2);
            int iU = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iU += tos.U(((Integer) list.get(i3)).intValue());
            }
            tosVar.C(iU);
            while (i2 < list.size()) {
                tosVar.ap(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tpi tpiVar = (tpi) list;
        if (!z) {
            while (i2 < tpiVar.c) {
                ((tos) ocqVar.a).ao(i, tpiVar.d(i2));
                i2++;
            }
            return;
        }
        tos tosVar2 = (tos) ocqVar.a;
        tosVar2.A(i, 2);
        int iU2 = 0;
        for (int i4 = 0; i4 < tpiVar.c; i4++) {
            iU2 += tos.U(tpiVar.d(i4));
        }
        tosVar2.C(iU2);
        while (i2 < tpiVar.c) {
            tosVar2.ap(tpiVar.d(i2));
            i2++;
        }
    }

    public static void z(int i, List list, ocq ocqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof tqh)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((tos) ocqVar.a).aq(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            tos tosVar = (tos) ocqVar.a;
            tosVar.A(i, 2);
            int iW = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iW += tos.W(((Long) list.get(i3)).longValue());
            }
            tosVar.C(iW);
            while (i2 < list.size()) {
                tosVar.ar(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        tqh tqhVar = (tqh) list;
        if (!z) {
            while (i2 < tqhVar.c) {
                ((tos) ocqVar.a).aq(i, tqhVar.a(i2));
                i2++;
            }
            return;
        }
        tos tosVar2 = (tos) ocqVar.a;
        tosVar2.A(i, 2);
        int iW2 = 0;
        for (int i4 = 0; i4 < tqhVar.c; i4++) {
            iW2 += tos.W(tqhVar.a(i4));
        }
        tosVar2.C(iW2);
        while (i2 < tqhVar.c) {
            tosVar2.ar(tqhVar.a(i2));
            i2++;
        }
    }
}
