package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jit implements imx {
    final /* synthetic */ imx a;
    final /* synthetic */ Object o;
    private final /* synthetic */ int p;

    public jit(imx imxVar, mdy mdyVar, int i) {
        this.p = i;
        this.a = imxVar;
        this.o = mdyVar;
    }

    @Override // defpackage.imx
    public final Object a(qzx qzxVar) {
        if (this.p != 0) {
            Object obj = qzxVar.b;
            Object obj2 = this.o;
            Object obj3 = qzxVar.c;
            HashMap map = (HashMap) obj2;
            Object objCast = ((Class) obj).cast(map.get(obj3));
            if (objCast == null) {
                objCast = this.a.a(qzxVar);
            }
            if (objCast != null) {
                map.put(obj3, objCast);
            }
            return objCast;
        }
        imx imxVar = this.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object objA = imxVar.a(qzxVar);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int i = qzxVar.a;
        int i2 = i < 15 ? iArr[i] : 1;
        boolean z = objA != null;
        Object obj4 = this.o;
        int i3 = (int) jCurrentTimeMillis2;
        tpc tpcVarM = stt.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        stt sttVar = (stt) tphVar;
        sttVar.c = 1;
        sttVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        stt sttVar2 = (stt) tphVar2;
        int i4 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        sttVar2.d = i4;
        sttVar2.b |= 2;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        stt sttVar3 = (stt) tphVar3;
        sttVar3.b |= 4;
        sttVar3.e = i3;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        stt sttVar4 = (stt) tpcVarM.b;
        sttVar4.b |= 8;
        sttVar4.f = z;
        stt sttVar5 = (stt) tpcVarM.l();
        tpc tpcVarM2 = sod.a.m();
        soc socVar = soc.SYSTEM_SERVICE_EVENT;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar4 = tpcVarM2.b;
        sod sodVar = (sod) tphVar4;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar4.C()) {
            tpcVarM2.o();
        }
        sod sodVar2 = (sod) tpcVarM2.b;
        sttVar5.getClass();
        sodVar2.Z = sttVar5;
        sodVar2.c |= Integer.MIN_VALUE;
        ((mdy) obj4).I(tpcVarM2);
        return objA;
    }

    public jit(HashMap map, imx imxVar, int i) {
        this.p = i;
        this.o = map;
        this.a = imxVar;
    }
}
