package defpackage;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pwf implements sxh {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ pwf(Object obj, syu syuVar, sxi sxiVar, Executor executor, int i) {
        this.e = i;
        this.c = obj;
        this.a = syuVar;
        this.b = sxiVar;
        this.d = executor;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, sxi] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, sxi] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, sxi] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.sxh
    public final syu a() {
        byte[] bArr = null;
        switch (this.e) {
            case 0:
                sbp sbpVarG = ((sbk) this.d).g();
                pvl pvlVar = (pvl) this.b;
                String str = pvlVar.c;
                String str2 = pvlVar.d;
                int i = qbu.a;
                pwr pwrVar = (pwr) this.a;
                pzr pzrVar = pwrVar.d;
                syu syuVarF = pzrVar.f();
                sxi sxiVar = pwrVar.i;
                puw puwVar = (puw) this.c;
                rwc rwcVar = puwVar.d;
                return qsz.n(syuVarF, new pzp(pzrVar, pvlVar, puwVar.b, puwVar.c, sbpVarG, puwVar.f, rwcVar, sxiVar, 0), pzrVar.k);
            case 1:
                ptz ptzVar = (ptz) ((rwc) this.b).c();
                qsp.R(((qao) this.c).b);
                return ptzVar.a();
            case 2:
                ?? r4 = this.d;
                ?? r3 = this.a;
                Object obj = this.c;
                pzb pzbVar = (pzb) this.b;
                return pzbVar.l.i(new pwf(pzbVar, (pvl) obj, (sxi) r3, (List) r4, 3), pzbVar.g);
            case 3:
                Object obj2 = this.c;
                Object obj3 = this.b;
                pzb pzbVar2 = (pzb) obj3;
                return pzbVar2.r(qsz.l(new pwe(obj3, obj2, 4, bArr), pzbVar2.g), new pyj(pzbVar2, (pvl) obj2, (sxi) this.a, (List) this.d, 9));
            case 4:
                syu syuVarM = ske.M(true);
                int i2 = 0;
                while (true) {
                    ?? r2 = this.a;
                    Object obj4 = this.c;
                    if (i2 >= r2.size()) {
                        return qsz.m(syuVarM, new pyb(this.b, 8), ((pzh) obj4).d);
                    }
                    pzh pzhVar = (pzh) obj4;
                    syuVarM = qsz.n(syuVarM, new pyu(pzhVar, (pvp) r2.get(i2), (pvr) ske.U((Future) this.d.get(i2)), 11), pzhVar.d);
                    i2++;
                }
            case 5:
                ?? r0 = this.b;
                Object obj5 = this.d;
                try {
                    Map map = (Map) ((rwc) ske.U(r0)).f();
                    if (map != null) {
                        tpc tpcVar = (tpc) obj5;
                        long j = ((uyr) tpcVar.b).c;
                        for (Map.Entry entry : map.entrySet()) {
                            Integer num = (Integer) entry.getKey();
                            num.intValue();
                            long jLongValue = ((Long) entry.getValue()).longValue() - j;
                            if (!tpcVar.b.C()) {
                                tpcVar.o();
                            }
                            uyr uyrVar = (uyr) tpcVar.b;
                            tqm tqmVar = uyrVar.w;
                            if (!tqmVar.b) {
                                uyrVar.w = tqmVar.a();
                            }
                            uyrVar.w.put(num, Long.valueOf(jLongValue));
                        }
                    }
                } catch (Exception e) {
                    ((sgt) ((sgt) qnj.a.c().i(e)).M((char) 5763)).s("Failed to get custom timestamps future");
                }
                Object obj6 = this.c;
                qql qqlVarA = qqm.a();
                tpc tpcVarM = uzu.a.m();
                tpc tpcVarM2 = uyn.a.m();
                long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                tph tphVar = tpcVarM2.b;
                uyn uynVar = (uyn) tphVar;
                uynVar.b |= 1;
                uynVar.c = leastSignificantBits;
                if (!tphVar.C()) {
                    tpcVarM2.o();
                }
                tph tphVar2 = tpcVarM2.b;
                uyn uynVar2 = (uyn) tphVar2;
                uynVar2.d = 2;
                uynVar2.b = 2 | uynVar2.b;
                if (!tphVar2.C()) {
                    tpcVarM2.o();
                }
                uyn uynVar3 = (uyn) tpcVarM2.b;
                uyr uyrVar2 = (uyr) ((tpc) obj5).l();
                uyrVar2.getClass();
                uynVar3.f = uyrVar2;
                uynVar3.b |= 16;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                qqp qqpVar = ((quj) obj6).a;
                ?? r13 = this.a;
                uzu uzuVar = (uzu) tpcVarM.b;
                uyn uynVar4 = (uyn) tpcVarM2.l();
                uynVar4.getClass();
                uzuVar.l = uynVar4;
                uzuVar.b |= 2048;
                qqlVarA.f((uzu) tpcVarM.l());
                qqlVarA.b = (uyd) ((rwc) ske.U(r13)).f();
                qqlVarA.c = null;
                qqlVarA.d(true);
                return qqpVar.b(qqlVarA.a());
            case 6:
                Object obj7 = this.c;
                red redVar = new red(obj7, 5);
                ?? r1 = this.d;
                ?? r32 = this.b;
                ?? r132 = this.a;
                sxo sxoVar = sxo.a;
                syu syuVarJ = swz.j(r132, redVar, sxoVar);
                syu syuVarJ2 = swz.j(syuVarJ, r32, r1);
                return swz.j(syuVarJ2, rsx.c(new qab(obj7, syuVarJ, syuVarJ2, 5, null)), sxoVar);
            default:
                return swz.j(this.a, rsx.c(new qab(this.c, this.b, this.d, 6, null)), sxo.a);
        }
    }

    public /* synthetic */ pwf(pwr pwrVar, pvl pvlVar, puw puwVar, sbk sbkVar, int i) {
        this.e = i;
        this.a = pwrVar;
        this.b = pvlVar;
        this.c = puwVar;
        this.d = sbkVar;
    }

    public /* synthetic */ pwf(pzb pzbVar, pvl pvlVar, sxi sxiVar, List list, int i) {
        this.e = i;
        this.b = pzbVar;
        this.c = pvlVar;
        this.a = sxiVar;
        this.d = list;
    }

    public /* synthetic */ pwf(pzh pzhVar, List list, List list2, Boolean bool, int i) {
        this.e = i;
        this.c = pzhVar;
        this.a = list;
        this.d = list2;
        this.b = bool;
    }

    public /* synthetic */ pwf(quj qujVar, tpc tpcVar, syu syuVar, syu syuVar2, int i) {
        this.e = i;
        this.c = qujVar;
        this.d = tpcVar;
        this.b = syuVar;
        this.a = syuVar2;
    }

    public /* synthetic */ pwf(syu syuVar, syu syuVar2, rwc rwcVar, qao qaoVar, int i) {
        this.e = i;
        this.a = syuVar;
        this.d = syuVar2;
        this.b = rwcVar;
        this.c = qaoVar;
    }
}
