package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pht implements tzt {
    private final tzx a;
    private final tzx b;

    public pht(tzx tzxVar, tzx tzxVar2) {
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        String str;
        String str2;
        List arrayList;
        ocq ocqVarBP;
        sbp<pjj> sbpVar;
        qaq qaqVar;
        pdt pdtVarA = ((pfn) this.a).a();
        lat latVar = (lat) this.b.a();
        latVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<peq> arrayList2 = new ArrayList();
        sgk it = pdtVarA.g.iterator();
        it.getClass();
        while (it.hasNext()) {
            peq peqVar = (peq) it.next();
            if (peqVar.t != -1) {
                peqVar.getClass();
                arrayList2.add(peqVar);
            } else {
                pjr pjrVar = (pjr) peqVar.b.f();
                if (pjrVar != null) {
                    String str3 = pjrVar.a;
                    str3.getClass();
                    pp.b(str3);
                    str2 = str3;
                } else {
                    str2 = null;
                }
                peo peoVarW = latVar.w(peqVar);
                phx phxVar = peoVarW instanceof phx ? (phx) peoVarW : null;
                if (phxVar == null || (sbpVar = phxVar.a.c) == null) {
                    arrayList = ufw.a;
                } else {
                    arrayList = new ArrayList(ske.bq(sbpVar, 10));
                    for (pjj pjjVar : sbpVar) {
                        phx phxVar2 = (phx) peoVarW;
                        pas pasVar = phxVar2.b;
                        Size size = new Size(pasVar.a, pasVar.b);
                        int iA = phxVar2.a();
                        synchronized (pjjVar.a) {
                            qaqVar = new qaq(pjjVar.b);
                        }
                        Object obj = qaqVar.a;
                        obj.getClass();
                        arrayList.add(new qq(size, iA, (OutputConfiguration) obj, ufw.a));
                    }
                }
                if (arrayList.isEmpty()) {
                    pas pasVar2 = peqVar.d;
                    Size size2 = new Size(pasVar2.a, pasVar2.b);
                    int i = peqVar.e;
                    qx qxVarBq = ojl.bq(peqVar.r);
                    int i2 = peqVar.v;
                    if (i2 == 0) {
                        throw null;
                    }
                    ocqVarBP = byi.bP(size2, i, str2, ojl.bp(peqVar.n), qxVarBq, ojl.bs(i2), ojl.br(peqVar.l), 1080);
                } else {
                    arrayList.size();
                    Objects.toString(peoVarW);
                    ocqVarBP = new ocq(arrayList);
                }
                linkedHashMap.put(peqVar, ocqVarBP);
            }
        }
        if (!arrayList2.isEmpty()) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (peq peqVar2 : arrayList2) {
                int i3 = peqVar2.t;
                if (i3 == -1) {
                    throw new IllegalStateException("Check failed.");
                }
                Integer numValueOf = Integer.valueOf(i3);
                Object arrayList3 = linkedHashMap3.get(numValueOf);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap3.put(numValueOf, arrayList3);
                }
                ((List) arrayList3).add(peqVar2);
            }
            for (Map.Entry entry : linkedHashMap3.entrySet()) {
                ((Number) entry.getKey()).intValue();
                List list = (List) entry.getValue();
                list.size();
                peq peqVar3 = (peq) list.get(0);
                pjr pjrVar2 = (pjr) peqVar3.b.f();
                if (pjrVar2 != null) {
                    String str4 = pjrVar2.a;
                    str4.getClass();
                    pp.b(str4);
                    str = str4;
                } else {
                    str = null;
                }
                pas pasVar3 = peqVar3.d;
                Size size3 = new Size(pasVar3.a, pasVar3.b);
                int i4 = peqVar3.e;
                qx qxVarBq2 = ojl.bq(peqVar3.r);
                int i5 = peqVar3.v;
                if (i5 == 0) {
                    throw null;
                }
                qs qsVarBB = byi.bB(size3, i4, str, qv.a, ojl.bp(peqVar3.n), qxVarBq2, ojl.bs(i5), ojl.br(peqVar3.l));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    linkedHashMap2.put((peq) it2.next(), byi.bO(qsVarBB));
                }
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        return linkedHashMap;
    }
}
