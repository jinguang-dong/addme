package defpackage;

import com.google.android.apps.camera.backup.cNHl.ibINv;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pym implements sxi {
    public final /* synthetic */ pvl a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ pym(pwr pwrVar, pvl pvlVar, boolean z, pun punVar, String str, int i) {
        this.f = i;
        this.c = pwrVar;
        this.a = pvlVar;
        this.b = z;
        this.e = punVar;
        this.d = str;
    }

    public /* synthetic */ pym(pzb pzbVar, List list, pvl pvlVar, pvc pvcVar, boolean z, int i) {
        this.f = i;
        this.c = pzbVar;
        this.d = list;
        this.a = pvlVar;
        this.e = pvcVar;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.Object, puo] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, puo] */
    @Override // defpackage.sxi
    public final syu a(Object obj) {
        int i = this.f;
        final boolean z = true;
        if (i != 0) {
            if (i != 1) {
                pua puaVar = (pua) obj;
                if (puaVar == pua.SUCCESS) {
                    return syq.a;
                }
                pvl pvlVar = this.a;
                boolean z2 = this.b;
                Object obj2 = this.e;
                Object obj3 = this.d;
                Object obj4 = this.c;
                ((qev) obj3).a((pvc) obj2);
                syu syuVarM = ske.M(true);
                if (z2 && puaVar != pua.FAILURE_KEEP_PENDING) {
                    syuVarM = ((pzb) obj4).d.i(pvlVar);
                }
                return ((pzb) obj4).r(syuVarM, new pyn(obj4, (tph) pvlVar, 6));
            }
            qap qapVar = (qap) obj;
            pvc pvcVar = qapVar.a;
            if (pvcVar != null) {
                return ske.M(new pxy(pvcVar));
            }
            Object obj5 = this.e;
            boolean z3 = this.b;
            pvl pvlVar2 = this.a;
            pvc pvcVar2 = qapVar.b;
            if (pvcVar2 == null) {
                tfm tfmVarA = pul.a();
                tfmVarA.b = puk.GROUP_NOT_FOUND_ERROR;
                tfmVarA.c = ibINv.wXQbmZqBRvUL.concat(String.valueOf(pvlVar2.c));
                pul pulVarC = tfmVarA.c();
                if (z3) {
                    ((pun) obj5).h.c().d();
                }
                return ske.L(pulVarC);
            }
            Object obj6 = this.c;
            if (z3) {
                pun punVar = (pun) obj5;
                ((qdc) ((pwr) obj6).g.c()).c(punVar.a, punVar.h.c());
            } else {
                z = false;
            }
            Object obj7 = this.d;
            final pwr pwrVar = (pwr) obj6;
            rwc rwcVarK = pwr.k(pvlVar2, pvcVar2, pwrVar.e);
            final pun punVar2 = (pun) obj5;
            boolean z4 = punVar2.j;
            pzr pzrVar = pwrVar.d;
            Executor executor = pwrVar.f;
            final String str = (String) obj7;
            qdp qdpVarF = qdp.e(pwr.p(pvcVar2, rwcVarK, null, 2, z4, pzrVar, executor, pwrVar.m)).f(new mdv(15), executor).f(new rvu() { // from class: pwb
                /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, puo] */
                @Override // defpackage.rvu
                public final Object apply(Object obj8) {
                    boolean z5 = z;
                    pun punVar3 = punVar2;
                    pts ptsVar = (pts) obj8;
                    if (z5) {
                        try {
                            punVar3.h.c().a(ptsVar);
                        } catch (Exception e) {
                            qbu.j(e, "%s: Listener onComplete failed for group %s", "MobileDataDownload", ptsVar.c);
                        }
                        ((qdc) pwrVar.g.c()).e(str);
                    }
                    return ptsVar;
                }
            }, executor);
            qsz.o(qdpVarF.a, new pwk(pwrVar, z, str), executor);
            return qdpVarF.f(new mdv(12), sxo.a);
        }
        ?? r0 = this.d;
        pza pzaVar = (pza) obj;
        ptv.b(r0, "Failed to import files, %d attempted", Integer.valueOf(r0.size()));
        Object obj8 = this.c;
        pvl pvlVar3 = this.a;
        Object obj9 = this.e;
        if (pzaVar != pza.DOWNLOADED) {
            pzb pzbVar = (pzb) obj8;
            pzc pzcVar = pzbVar.d;
            tpc tpcVar = (tpc) pvlVar3.a(5, null);
            tpcVar.r(pvlVar3);
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            boolean z5 = this.b;
            pvl pvlVar4 = (pvl) tpcVar.b;
            pvl pvlVar5 = pvl.a;
            pvlVar4.b |= 8;
            pvlVar4.f = z5;
            return pzbVar.r(pzcVar.l((pvl) tpcVar.l(), (pvc) obj9), new pyg(obj8, 11));
        }
        qbq qbqVar = ((pzb) obj8).b;
        tpc tpcVarM = suv.a.m();
        String str2 = pvlVar3.c;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        suv suvVar = (suv) tphVar;
        str2.getClass();
        suvVar.b = 1 | suvVar.b;
        suvVar.c = str2;
        String str3 = pvlVar3.d;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        suv suvVar2 = (suv) tphVar2;
        str3.getClass();
        suvVar2.b |= 4;
        suvVar2.e = str3;
        pvc pvcVar3 = (pvc) obj9;
        int i2 = pvcVar3.f;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        suv suvVar3 = (suv) tphVar3;
        suvVar3.b |= 2;
        suvVar3.d = i2;
        long j = pvcVar3.s;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        tph tphVar4 = tpcVarM.b;
        suv suvVar4 = (suv) tphVar4;
        suvVar4.b |= 64;
        suvVar4.i = j;
        String str4 = pvcVar3.t;
        if (!tphVar4.C()) {
            tpcVarM.o();
        }
        suv suvVar5 = (suv) tpcVarM.b;
        str4.getClass();
        suvVar5.b |= 128;
        suvVar5.j = str4;
        qbqVar.q(3, (suv) tpcVarM.l(), 2);
        return syq.a;
    }

    public /* synthetic */ pym(pzb pzbVar, qev qevVar, pvc pvcVar, boolean z, pvl pvlVar, int i) {
        this.f = i;
        this.c = pzbVar;
        this.d = qevVar;
        this.e = pvcVar;
        this.b = z;
        this.a = pvlVar;
    }
}
