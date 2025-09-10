package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qce implements sxh {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ qce(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, pzc] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.sxh
    public final syu a() {
        int i = this.c;
        if (i == 0) {
            Object obj = this.b;
            qcl qclVar = (qcl) obj;
            return qdp.e(qclVar.a.c()).g(new rrl(obj, this.a, 1), qclVar.g);
        }
        if (i != 1) {
            return ((rrp) this.b).d(this.a);
        }
        final tql tqlVar = (tql) this.b;
        ?? r1 = tqlVar.c;
        final int i2 = this.a;
        return qsz.n(r1.c(), new sxi() { // from class: qbr
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.concurrent.Executor] */
            /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, java.util.concurrent.Executor] */
            @Override // defpackage.sxi
            public final syu a(Object obj2) {
                syu syuVarM;
                ArrayList arrayList = new ArrayList();
                for (qao qaoVar : (List) obj2) {
                    pvl pvlVar = qaoVar.a;
                    pvc pvcVar = qaoVar.b;
                    tpc tpcVarM = suv.a.m();
                    String str = pvlVar.c;
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar = tpcVarM.b;
                    suv suvVar = (suv) tphVar;
                    str.getClass();
                    suvVar.b |= 1;
                    suvVar.c = str;
                    String str2 = pvlVar.d;
                    if (!tphVar.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar2 = tpcVarM.b;
                    suv suvVar2 = (suv) tphVar2;
                    str2.getClass();
                    suvVar2.b |= 4;
                    suvVar2.e = str2;
                    int i3 = pvcVar.f;
                    if (!tphVar2.C()) {
                        tpcVarM.o();
                    }
                    suv suvVar3 = (suv) tpcVarM.b;
                    suvVar3.b |= 2;
                    suvVar3.d = i3;
                    int size = pvcVar.o.size();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    suv suvVar4 = (suv) tpcVarM.b;
                    suvVar4.b |= 8;
                    suvVar4.f = size;
                    Iterator it = pvcVar.o.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        if (qsp.ae((pva) it.next())) {
                            i4++;
                        }
                    }
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    suv suvVar5 = (suv) tpcVarM.b;
                    suvVar5.b |= 16;
                    suvVar5.g = i4;
                    boolean z = !pvlVar.e.isEmpty();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar3 = tpcVarM.b;
                    suv suvVar6 = (suv) tphVar3;
                    suvVar6.b |= 32;
                    suvVar6.h = z;
                    long j = pvcVar.s;
                    if (!tphVar3.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar4 = tpcVarM.b;
                    suv suvVar7 = (suv) tphVar4;
                    suvVar7.b |= 64;
                    suvVar7.i = j;
                    String str3 = pvcVar.t;
                    if (!tphVar4.C()) {
                        tpcVarM.o();
                    }
                    suv suvVar8 = (suv) tpcVarM.b;
                    str3.getClass();
                    suvVar8.b |= 128;
                    suvVar8.j = str3;
                    suv suvVar9 = (suv) tpcVarM.l();
                    tpc tpcVarM2 = svd.a.m();
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    int i5 = i2;
                    svd svdVar = (svd) tpcVarM2.b;
                    svdVar.b |= 8;
                    svdVar.f = i5;
                    pvb pvbVar = pvcVar.c;
                    if (pvbVar == null) {
                        pvbVar = pvb.a;
                    }
                    if ((pvbVar.b & 2) != 0) {
                        pvb pvbVar2 = pvcVar.c;
                        if (pvbVar2 == null) {
                            pvbVar2 = pvb.a;
                        }
                        long j2 = pvbVar2.d / 1000;
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        svd svdVar2 = (svd) tpcVarM2.b;
                        svdVar2.b |= 2;
                        svdVar2.d = j2;
                    } else {
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        svd svdVar3 = (svd) tpcVarM2.b;
                        svdVar3.b |= 2;
                        svdVar3.d = -1L;
                    }
                    tql tqlVar2 = tqlVar;
                    if (pvlVar.f) {
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar5 = tpcVarM2.b;
                        svd svdVar4 = (svd) tphVar5;
                        svdVar4.c = a.at(3);
                        svdVar4.b |= 1;
                        pvb pvbVar3 = pvcVar.c;
                        if (((pvbVar3 == null ? pvb.a : pvbVar3).b & 4) != 0) {
                            if (pvbVar3 == null) {
                                pvbVar3 = pvb.a;
                            }
                            long j3 = pvbVar3.e / 1000;
                            if (!tphVar5.C()) {
                                tpcVarM2.o();
                            }
                            svd svdVar5 = (svd) tpcVarM2.b;
                            svdVar5.b |= 4;
                            svdVar5.e = j3;
                        } else {
                            if (!tphVar5.C()) {
                                tpcVarM2.o();
                            }
                            svd svdVar6 = (svd) tpcVarM2.b;
                            svdVar6.b |= 4;
                            svdVar6.e = -1L;
                        }
                        syuVarM = ske.M((svd) tpcVarM2.l());
                    } else {
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        svd svdVar7 = (svd) tpcVarM2.b;
                        svdVar7.b |= 4;
                        svdVar7.e = -1L;
                        syuVarM = qsz.m(((pzb) tqlVar2.b).h(pvcVar), new pzu(tpcVarM2, 13), tqlVar2.a);
                    }
                    arrayList.add(qsz.m(syuVarM, new pzu(suvVar9, 12), tqlVar2.a));
                }
                return ske.I(arrayList);
            }
        }, tqlVar.a);
    }
}
