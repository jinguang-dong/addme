package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qpx extends qqa {
    public static final qpx a = new qpx();

    private qpx() {
    }

    @Override // defpackage.qqa
    public final /* bridge */ /* synthetic */ tqr a(String str, Object obj) {
        int iIntValue = ((Long) obj).intValue();
        if (iIntValue == 0) {
            return null;
        }
        tpc tpcVarM = uxq.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        uxq uxqVar = (uxq) tpcVarM.b;
        uxqVar.b |= 1;
        uxqVar.c = iIntValue;
        if (str != null) {
            uxr uxrVarN = qpt.n(str);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxq uxqVar2 = (uxq) tpcVarM.b;
            uxrVarN.getClass();
            uxqVar2.d = uxrVarN;
            uxqVar2.b |= 2;
        }
        return (uxq) tpcVarM.l();
    }

    @Override // defpackage.qqa
    public final /* synthetic */ tqr b(tqr tqrVar, tqr tqrVar2) {
        int i;
        uxq uxqVar = (uxq) tqrVar;
        uxq uxqVar2 = (uxq) tqrVar2;
        if (uxqVar == null || uxqVar2 == null) {
            return uxqVar;
        }
        if ((uxqVar.b & 1) == 0 || (i = uxqVar.c - uxqVar2.c) == 0) {
            return null;
        }
        tpc tpcVarM = uxq.a.m();
        if ((uxqVar.b & 2) != 0) {
            uxr uxrVar = uxqVar.d;
            if (uxrVar == null) {
                uxrVar = uxr.a;
            }
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxq uxqVar3 = (uxq) tpcVarM.b;
            uxrVar.getClass();
            uxqVar3.d = uxrVar;
            uxqVar3.b |= 2;
        }
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        uxq uxqVar4 = (uxq) tpcVarM.b;
        uxqVar4.b |= 1;
        uxqVar4.c = i;
        return (uxq) tpcVarM.l();
    }

    @Override // defpackage.qqa
    public final /* bridge */ /* synthetic */ String c(tqr tqrVar) {
        uxr uxrVar = ((uxq) tqrVar).d;
        if (uxrVar == null) {
            uxrVar = uxr.a;
        }
        return uxrVar.d;
    }
}
