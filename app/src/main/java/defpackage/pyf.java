package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pyf implements sxh {
    public final /* synthetic */ pvl a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ pyf(pwr pwrVar, pxu pxuVar, pvl pvlVar, boolean z, pun punVar, String str, int i) {
        this.g = i;
        this.c = pwrVar;
        this.f = pxuVar;
        this.a = pvlVar;
        this.b = z;
        this.d = punVar;
        this.e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, sxi] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, sxi] */
    @Override // defpackage.sxh
    public final syu a() {
        int i = this.g;
        if (i == 0) {
            Object obj = this.f;
            ?? r6 = this.e;
            boolean z = this.b;
            Object obj2 = this.d;
            pvl pvlVar = this.a;
            pzb pzbVar = (pzb) this.c;
            return pzbVar.l.i(new pyf(pzbVar, pvlVar, (pvc) obj2, z, (sxi) r6, (qev) obj, 2), pzbVar.g);
        }
        if (i != 1) {
            Object obj3 = this.f;
            ?? r5 = this.e;
            return ((pzb) this.c).D(this.a, (pvc) this.d, this.b, r5, (qev) obj3);
        }
        final pwr pwrVar = (pwr) this.c;
        tql tqlVar = pwrVar.k;
        String str = ((pxu) this.f).a;
        final syu syuVarE = pwrVar.j.e(str);
        final syu syuVarE2 = tqlVar.e(str);
        qaq qaqVarQ = qsp.Q(syuVarE, syuVarE2);
        Object obj4 = this.e;
        Object obj5 = this.d;
        final boolean z2 = this.b;
        final pvl pvlVar2 = this.a;
        final pun punVar = (pun) obj5;
        final String str2 = (String) obj4;
        return qaqVarQ.g(new sxh() { // from class: pwa
            @Override // defpackage.sxh
            public final syu a() {
                syu syuVar = syuVarE;
                if (((rwc) ske.U(syuVar)).h()) {
                    return ske.M(new pxx((syu) ((rwc) ske.U(syuVar)).c()));
                }
                syu syuVar2 = syuVarE2;
                if (((rwc) ske.U(syuVar2)).h()) {
                    return ske.M(new pxx((syu) ((rwc) ske.U(syuVar2)).c()));
                }
                String str3 = str2;
                pun punVar2 = punVar;
                boolean z3 = z2;
                pvl pvlVar3 = pvlVar2;
                pwr pwrVar2 = pwrVar;
                syu syuVarE3 = pwrVar2.d.e(pvlVar3, false);
                kjl kjlVar = new kjl(pwrVar2, pvlVar3, 10, null);
                Executor executor = pwrVar2.f;
                return qsz.n(qsz.n(syuVarE3, kjlVar, executor), new pym(pwrVar2, pvlVar3, z3, punVar2, str3, 1), executor);
            }
        }, pwrVar.f);
    }

    public /* synthetic */ pyf(pzb pzbVar, pvl pvlVar, pvc pvcVar, boolean z, sxi sxiVar, qev qevVar, int i) {
        this.g = i;
        this.c = pzbVar;
        this.a = pvlVar;
        this.d = pvcVar;
        this.b = z;
        this.e = sxiVar;
        this.f = qevVar;
    }
}
