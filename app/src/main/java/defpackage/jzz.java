package defpackage;

import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jzz implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ jzz(Object obj, long j, Object obj2, Object obj3, int i) {
        this.e = i;
        this.b = obj;
        this.a = j;
        this.d = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, syx] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, syu] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        if (i == 0) {
            long j = this.a;
            Object obj = this.d;
            ((kai) this.b).l((ltd) this.c, (kbz) obj, j);
            return;
        }
        if (i == 1) {
            Object obj2 = this.c;
            Object obj3 = this.d;
            ((hep) this.b).l(this.a, (Instant) obj3, (String) obj2);
            return;
        }
        if (i != 2) {
            this.d.run();
            qpt.ah(this.b.schedule(this, this.a, (TimeUnit) this.c));
            return;
        }
        final long jAw = qpt.aw() - this.a;
        Object obj4 = this.b;
        final ?? r6 = this.d;
        final ?? r7 = this.c;
        final pwr pwrVar = (pwr) obj4;
        qsz.p(new Runnable() { // from class: pwd
            @Override // java.lang.Runnable
            public final void run() {
                int iN;
                sbp sbpVar;
                syu syuVar = r7;
                try {
                    ske.U(r6);
                    sbpVar = (sbp) ske.U(syuVar);
                    iN = 3;
                } catch (Throwable th) {
                    iN = prh.n(th);
                    sbpVar = null;
                }
                tpc tpcVarM = sve.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                sve sveVar = (sve) tphVar;
                sveVar.c = rkf.s(24);
                sveVar.b |= 1;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                tph tphVar2 = tpcVarM.b;
                sve sveVar2 = (sve) tphVar2;
                sveVar2.d = rkf.r(iN);
                sveVar2.b |= 2;
                if (!tphVar2.C()) {
                    tpcVarM.o();
                }
                long j2 = jAw;
                sve sveVar3 = (sve) tpcVarM.b;
                sveVar3.b |= 4;
                sveVar3.f = j2;
                if (sbpVar != null) {
                    int size = sbpVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        qao qaoVar = (qao) sbpVar.get(i2);
                        pvc pvcVar = qaoVar.b;
                        int i3 = pvcVar.b;
                        long j3 = (32768 & i3) != 0 ? pvcVar.s : -1L;
                        int i4 = (i3 & 8) != 0 ? pvcVar.f : -1;
                        tpc tpcVarM2 = suv.a.m();
                        String str = pvcVar.d;
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar3 = tpcVarM2.b;
                        suv suvVar = (suv) tphVar3;
                        str.getClass();
                        suvVar.b |= 1;
                        suvVar.c = str;
                        String str2 = pvcVar.e;
                        if (!tphVar3.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar4 = tpcVarM2.b;
                        suv suvVar2 = (suv) tphVar4;
                        str2.getClass();
                        suvVar2.b |= 4;
                        suvVar2.e = str2;
                        if (!tphVar4.C()) {
                            tpcVarM2.o();
                        }
                        suv suvVar3 = (suv) tpcVarM2.b;
                        suvVar3.b |= 2;
                        suvVar3.d = i4;
                        int size2 = pvcVar.o.size();
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar5 = tpcVarM2.b;
                        suv suvVar4 = (suv) tphVar5;
                        suvVar4.b |= 8;
                        suvVar4.f = size2;
                        String str3 = pvcVar.t;
                        if (!tphVar5.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar6 = tpcVarM2.b;
                        suv suvVar5 = (suv) tphVar6;
                        str3.getClass();
                        suvVar5.b |= 128;
                        suvVar5.j = str3;
                        if (!tphVar6.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar7 = tpcVarM2.b;
                        suv suvVar6 = (suv) tphVar7;
                        suvVar6.b |= 64;
                        suvVar6.i = j3;
                        int i5 = qaoVar.a.b & 4;
                        if (!tphVar7.C()) {
                            tpcVarM2.o();
                        }
                        boolean z = i5 != 0;
                        suv suvVar7 = (suv) tpcVarM2.b;
                        suvVar7.b |= 32;
                        suvVar7.h = z;
                        tpcVarM.V((suv) tpcVarM2.l());
                    }
                }
                pwrVar.b.g((sve) tpcVarM.l());
            }
        }, pwrVar.f);
    }

    public jzz(Runnable runnable, syx syxVar, long j, TimeUnit timeUnit, int i) {
        this.e = i;
        this.d = runnable;
        this.b = syxVar;
        this.a = j;
        this.c = timeUnit;
    }

    public /* synthetic */ jzz(kai kaiVar, ltd ltdVar, kbz kbzVar, long j, int i) {
        this.e = i;
        this.b = kaiVar;
        this.c = ltdVar;
        this.d = kbzVar;
        this.a = j;
    }
}
