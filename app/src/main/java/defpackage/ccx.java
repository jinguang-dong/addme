package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccx implements cda {
    public final ccm a;
    public final List b;
    public final List d;
    public final ues c = rnt.aO(3, new ats(this, 9));
    private final ues e = rnt.aO(3, new ats(this, 10));

    public ccx(ccm ccmVar, cdo cdoVar, List list, chq chqVar, qqq qqqVar) {
        String strSubstring;
        ArrayList arrayList;
        String str;
        int i;
        ccm ccmVar2 = ccmVar;
        cdo cdoVar2 = cdoVar;
        this.a = ccmVar2;
        this.b = list;
        cdb cdbVar = cdoVar2.c;
        int i2 = cco.a;
        List list2 = ccmVar2.d;
        List listBM = list2 != null ? ske.bM(list2, new ccn(0)) : ufw.a;
        ArrayList arrayList2 = new ArrayList();
        ufu ufuVar = new ufu();
        int size = listBM.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            ccl cclVar = (ccl) listBM.get(i4);
            ccl cclVarA = ccl.a(cclVar, cdbVar.a((cdb) cclVar.a), 0, 14);
            while (true) {
                i = cclVarA.b;
                if (i3 >= i || ufuVar.isEmpty()) {
                    break;
                }
                ccl cclVar2 = (ccl) ufuVar.c();
                int i5 = cclVarA.b;
                int i6 = cclVar2.c;
                if (i5 < i6) {
                    arrayList2.add(new ccl(cclVar2.a, i3, i5));
                    i3 = cclVarA.b;
                } else {
                    arrayList2.add(new ccl(cclVar2.a, i3, i6));
                    i3 = cclVar2.c;
                    while (!ufuVar.isEmpty() && i3 == ((ccl) ufuVar.c()).c) {
                        ufuVar.removeLast();
                    }
                }
            }
            if (i3 < i) {
                arrayList2.add(new ccl(cdbVar, i3, i));
                i3 = cclVarA.b;
            }
            ccl cclVar3 = (ccl) ufuVar.e();
            if (cclVar3 != null) {
                int i7 = cclVar3.b;
                if (i7 == cclVarA.b && cclVar3.c == cclVarA.c) {
                    ufuVar.removeLast();
                    ufuVar.add(new ccl(((cdb) cclVar3.a).a((cdb) cclVarA.a), cclVarA.b, cclVarA.c));
                } else {
                    int i8 = cclVar3.c;
                    if (i7 == i8) {
                        arrayList2.add(new ccl(cclVar3.a, i7, i8));
                        ufuVar.removeLast();
                        ufuVar.add(new ccl(cclVarA.a, cclVarA.b, cclVarA.c));
                    } else {
                        if (i8 < cclVarA.c) {
                            throw new IllegalArgumentException();
                        }
                        ufuVar.add(new ccl(((cdb) cclVar3.a).a((cdb) cclVarA.a), cclVarA.b, cclVarA.c));
                    }
                }
            } else {
                ufuVar.add(new ccl(cclVarA.a, cclVarA.b, cclVarA.c));
            }
        }
        while (i3 <= ccmVar2.b.length() && !ufuVar.isEmpty()) {
            ccl cclVar4 = (ccl) ufuVar.c();
            arrayList2.add(new ccl(cclVar4.a, i3, cclVar4.c));
            i3 = cclVar4.c;
            while (!ufuVar.isEmpty() && i3 == ((ccl) ufuVar.c()).c) {
                ufuVar.removeLast();
            }
        }
        if (i3 < ccmVar2.b.length()) {
            arrayList2.add(new ccl(cdbVar, i3, ccmVar2.b.length()));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ccl(cdbVar, 0, 0));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i9 = 0;
        while (i9 < size2) {
            ccl cclVar5 = (ccl) arrayList2.get(i9);
            int i10 = cclVar5.b;
            int i11 = cclVar5.c;
            if (i10 != i11) {
                strSubstring = ccmVar2.b.substring(i10, i11);
                strSubstring.getClass();
            } else {
                strSubstring = "";
            }
            List listA = cco.a(ccmVar2, i10, i11, new axa(3));
            ccm ccmVar3 = new ccm(strSubstring, listA == null ? ufw.a : listA);
            cdb cdbVar2 = (cdb) cclVar5.a;
            if (a.p(cdbVar2.b, Integer.MIN_VALUE)) {
                arrayList = arrayList2;
                cdbVar2 = new cdb(cdbVar2.a, cdbVar.b, cdbVar2.c, cdbVar2.d, cdbVar2.e, cdbVar2.f, cdbVar2.g, cdbVar2.h, cdbVar2.i);
            } else {
                arrayList = arrayList2;
            }
            String str2 = ccmVar3.b;
            cdo cdoVar3 = new cdo(cdoVar2.b, cdoVar2.c.a(cdbVar2));
            List list3 = ccmVar3.a;
            List list4 = list3 == null ? ufw.a : list3;
            List list5 = this.b;
            int i12 = cclVar5.b;
            int i13 = cclVar5.c;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i14 = 0;
            while (i14 < size3) {
                int i15 = i14;
                ccl cclVar6 = (ccl) list5.get(i14);
                cdb cdbVar3 = cdbVar;
                int i16 = cclVar6.b;
                int i17 = size2;
                int i18 = cclVar6.c;
                if (cco.b(i12, i13, i16, i18)) {
                    if (i12 > i16 || i18 > i13) {
                        cgh.a("placeholder can not overlap with paragraph.");
                    }
                    str = str2;
                    arrayList4.add(new ccl(cclVar6.a, cclVar6.b - i12, cclVar6.c - i12));
                } else {
                    str = str2;
                }
                i14 = i15 + 1;
                str2 = str;
                cdbVar = cdbVar3;
                size2 = i17;
            }
            arrayList3.add(new ccz(new cgo(str2, cdoVar3, list4, arrayList4, qqqVar, chqVar), cclVar5.b, cclVar5.c));
            i9++;
            ccmVar2 = ccmVar;
            cdoVar2 = cdoVar;
            arrayList2 = arrayList;
            cdbVar = cdbVar;
        }
        this.d = arrayList3;
    }

    @Override // defpackage.cda
    public final float a() {
        return ((Number) this.e.a()).floatValue();
    }

    @Override // defpackage.cda
    public final float b() {
        throw null;
    }

    @Override // defpackage.cda
    public final boolean c() {
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((ccz) list.get(i)).a.c()) {
                return true;
            }
        }
        return false;
    }
}
