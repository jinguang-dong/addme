package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccc {
    public static final /* synthetic */ int a = 0;
    private static final Comparator[] b;
    private static final uiu c;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new aod(new ccb(i == 0 ? cbi.c : cbi.a, bvm.b), 6);
            i++;
        }
        b = comparatorArr;
        c = cca.a;
    }

    public static final List a(cbr cbrVar, uiq uiqVar, uiq uiqVar2, List list) {
        int i;
        ArrayList arrayList;
        yq yqVar = yr.a;
        yq yqVar2 = new yq((byte[]) null);
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            b((cbr) list.get(i2), arrayList2, uiqVar, uiqVar2, yqVar2);
        }
        char c2 = cbrVar.b.p == cib.b ? (char) 0 : (char) 1;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() / 2);
        int iBk = ske.bk(arrayList2);
        if (iBk >= 0) {
            int i3 = 0;
            while (true) {
                cbr cbrVar2 = (cbr) arrayList2.get(i3);
                if (i3 != 0) {
                    float f = cbrVar2.d().c;
                    float f2 = cbrVar2.d().e;
                    int iBk2 = ske.bk(arrayList3);
                    if (iBk2 >= 0) {
                        int i4 = 0;
                        while (true) {
                            bkg bkgVar = (bkg) ((uev) arrayList3.get(i4)).a;
                            i = 0;
                            float f3 = bkgVar.c;
                            float f4 = bkgVar.e;
                            if (f < f2 && f3 < f4 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList = arrayList2;
                                arrayList3.set(i4, new uev(new bkg(Math.max(bkgVar.b, 0.0f), Math.max(f3, f), Math.min(bkgVar.d, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((uev) arrayList3.get(i4)).b));
                                ((List) ((uev) arrayList3.get(i4)).b).add(cbrVar2);
                                break;
                            }
                            arrayList = arrayList2;
                            if (i4 == iBk2) {
                                break;
                            }
                            i4++;
                            arrayList2 = arrayList;
                        }
                    } else {
                        arrayList = arrayList2;
                        i = 0;
                    }
                } else {
                    arrayList = arrayList2;
                    i = 0;
                    i3 = 0;
                }
                bkg bkgVarD = cbrVar2.d();
                cbr[] cbrVarArr = new cbr[1];
                cbrVarArr[i] = cbrVar2;
                arrayList3.add(new uev(bkgVarD, ske.bn(cbrVarArr)));
                if (i3 == iBk) {
                    break;
                }
                i3++;
                arrayList2 = arrayList;
            }
        } else {
            i = 0;
        }
        ske.bs(arrayList3, cbi.d);
        ArrayList arrayList4 = new ArrayList();
        Comparator comparator = b[c2];
        int size2 = arrayList3.size();
        for (int i5 = i; i5 < size2; i5++) {
            Object obj = ((uev) arrayList3.get(i5)).b;
            ske.bs((List) obj, comparator);
            arrayList4.addAll((Collection) obj);
        }
        ske.bs(arrayList4, new aod(c, 5, null));
        int size3 = i;
        while (size3 <= ske.bk(arrayList4)) {
            List list2 = (List) yqVar2.a(((cbr) arrayList4.get(size3)).e);
            if (list2 != null) {
                if (((Boolean) uiqVar2.a(arrayList4.get(size3))).booleanValue()) {
                    size3++;
                } else {
                    arrayList4.remove(size3);
                }
                arrayList4.addAll(size3, list2);
                size3 += list2.size();
            } else {
                size3++;
            }
        }
        return arrayList4;
    }

    private static final void b(cbr cbrVar, ArrayList arrayList, uiq uiqVar, uiq uiqVar2, yq yqVar) {
        boolean zBooleanValue = ((Boolean) cbrVar.c.c(cbu.m, bre.g)).booleanValue();
        if (zBooleanValue || ((Boolean) uiqVar2.a(cbrVar)).booleanValue()) {
            if (((Boolean) uiqVar.a(cbrVar)).booleanValue()) {
                arrayList.add(cbrVar);
            }
            if (zBooleanValue) {
                yqVar.f(cbrVar.e, a(cbrVar, uiqVar, uiqVar2, cbrVar.i()));
                return;
            }
        }
        List listI = cbrVar.i();
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            b((cbr) listI.get(i), arrayList, uiqVar, uiqVar2, yqVar);
        }
    }
}
