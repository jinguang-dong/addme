package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qcc implements reg {
    private static String b(String str, String str2) {
        return str + "|" + str2;
    }

    @Override // defpackage.reg
    public final /* bridge */ /* synthetic */ tqr a(qaq qaqVar, tqr tqrVar) throws NumberFormatException {
        pvo pvoVar = (pvo) tqrVar;
        if (pvoVar.e) {
            return pvoVar;
        }
        HashSet hashSet = new HashSet();
        tpc tpcVar = (tpc) pvoVar.a(5, null);
        tpcVar.r(pvoVar);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        pvo pvoVar2 = (pvo) tpcVar.b;
        int i = 2;
        pvoVar2.b |= 2;
        int i2 = 1;
        pvoVar2.e = true;
        sgj sgjVarListIterator = qaqVar.j().entrySet().listIterator();
        while (sgjVarListIterator.hasNext()) {
            List listF = rwr.c("|").f((CharSequence) ((Map.Entry) sgjVarListIterator.next()).getKey());
            if (listF.size() >= 4) {
                String str = (String) listF.get(0);
                String str2 = (String) listF.get(i2);
                int i3 = Integer.parseInt((String) listF.get(i));
                String str3 = str + "|" + str2 + "|" + i3;
                if (!hashSet.contains(str3)) {
                    hashSet.add(str3);
                    String strB = b(str3, "w");
                    String strB2 = b(str3, "c");
                    long jK = qaqVar.k(strB);
                    long jK2 = qaqVar.k(strB2);
                    tpc tpcVarM = pvg.a.m();
                    tpc tpcVarM2 = pvl.a.m();
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    tph tphVar = tpcVarM2.b;
                    int i4 = i2;
                    pvl pvlVar = (pvl) tphVar;
                    str2.getClass();
                    int i5 = i;
                    pvlVar.b |= 1;
                    pvlVar.c = str2;
                    if (!tphVar.C()) {
                        tpcVarM2.o();
                    }
                    pvl pvlVar2 = (pvl) tpcVarM2.b;
                    str.getClass();
                    pvlVar2.b |= 2;
                    pvlVar2.d = str;
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    pvg pvgVar = (pvg) tpcVarM.b;
                    pvl pvlVar3 = (pvl) tpcVarM2.l();
                    pvlVar3.getClass();
                    pvgVar.c = pvlVar3;
                    pvgVar.b |= 1;
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar2 = tpcVarM.b;
                    pvg pvgVar2 = (pvg) tphVar2;
                    pvgVar2.b |= 8;
                    pvgVar2.f = i3;
                    if (!tphVar2.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar3 = tpcVarM.b;
                    pvg pvgVar3 = (pvg) tphVar3;
                    pvgVar3.b |= 16;
                    pvgVar3.g = jK2;
                    if (!tphVar3.C()) {
                        tpcVarM.o();
                    }
                    pvg pvgVar4 = (pvg) tpcVarM.b;
                    pvgVar4.b |= 32;
                    pvgVar4.h = jK;
                    if (!tpcVar.b.C()) {
                        tpcVar.o();
                    }
                    pvo pvoVar3 = (pvo) tpcVar.b;
                    pvg pvgVar5 = (pvg) tpcVarM.l();
                    pvgVar5.getClass();
                    pvoVar3.b();
                    pvoVar3.d.add(pvgVar5);
                    i2 = i4;
                    i = i5;
                }
            }
        }
        return (pvo) tpcVar.l();
    }
}
