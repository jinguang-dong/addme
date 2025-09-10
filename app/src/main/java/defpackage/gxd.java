package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxd implements tzt {
    private final tzx a;
    private final tzx b;

    public gxd(tzx tzxVar, tzx tzxVar2) {
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* bridge */ /* synthetic */ Object a() {
        hbj hbjVar = (hbj) this.a.a();
        pnq pnqVar = (pnq) this.b.a();
        hbjVar.getClass();
        pnqVar.getClass();
        if (!hbjVar.p(hba.u)) {
            return ufx.a;
        }
        gxl gxoVar = pnqVar.x ? gxk.a : pnqVar.p ? gxm.a : pnqVar.r ? gxn.a : pnqVar.B ? new gxo() : pnqVar.u ? gxq.a : pnqVar.w ? gxr.a : (pnqVar.y || pnqVar.z) ? new gxs(hbjVar) : pnqVar.t ? gxt.a : pnqVar.m ? gxu.a : pnqVar.s ? gxv.a : pnqVar.n ? gxw.a : pnqVar.v ? gxx.a : pnqVar.l() ? gxy.a : pnqVar.C ? new gxz() : pnqVar.A ? new gya() : null;
        List list = gxp.a;
        List list2 = gxp.a;
        List listA = gxoVar != null ? gxoVar.a() : null;
        if (listA == null) {
            listA = ufw.a;
        }
        List<gyd> listBJ = ske.bJ(list2, listA);
        ArrayList arrayList = new ArrayList(ske.bq(listBJ, 10));
        for (gyd gydVar : listBJ) {
            tpc tpcVar = (tpc) gydVar.a(5, null);
            tpcVar.r(gydVar);
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            gyd gydVar2 = (gyd) tpcVar.b;
            gyd gydVar3 = gyd.a;
            tpa tpaVar = tpa.a;
            gydVar2.e = tpaVar;
            tpm tpmVar = gydVar.e;
            tpmVar.getClass();
            tpcVar.v(ske.bL(tpmVar));
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            ((gyd) tpcVar.b).f = tpaVar;
            tpm tpmVar2 = gydVar.f;
            tpmVar2.getClass();
            tpcVar.u(ske.bL(tpmVar2));
            tph tphVarL = tpcVar.l();
            tphVarL.getClass();
            arrayList.add((gyd) tphVarL);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ukc.n(ske.aZ(ske.bq(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            gyd gydVar4 = (gyd) obj;
            gyb gybVarB = gyb.b(gydVar4.c);
            if (gybVarB == null) {
                gybVarB = gyb.FACING_UNSPECIFIED;
            }
            ssc sscVarB = ssc.b(gydVar4.d);
            if (sscVarB == null) {
                sscVarB = ssc.UNKNOWN_MODE;
            }
            linkedHashMap.put(new uev(gybVarB, sscVarB), obj);
        }
        return linkedHashMap;
    }
}
