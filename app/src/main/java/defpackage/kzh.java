package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kzh implements pdm {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kzh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.pdm
    public final /* synthetic */ String a() {
        return "";
    }

    @Override // defpackage.pdm
    public final void d(phc phcVar) {
        Executor executor;
        sbp sbpVarJ;
        int i = this.b;
        if (i == 0) {
            Object obj = this.a;
            kzi kziVar = (kzi) obj;
            if (kziVar.e || (executor = kziVar.c) == null) {
                return;
            }
            executor.execute(new kee(obj, phcVar, 13));
            return;
        }
        if (i == 1) {
            pdk pdkVarA = phcVar.a();
            if (pdkVarA != null) {
                Object obj2 = this.a;
                final hbv hbvVar = new hbv(pdkVarA, 12);
                final sxo sxoVar = sxo.a;
                final ovo ovoVar = ((hla) obj2).d;
                new Executor() { // from class: ovm
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        syu syuVarA = ovoVar.a(runnable);
                        syuVarA.c(new nzq(syuVarA, hbvVar, 16, (byte[]) null), sxoVar);
                    }
                }.execute(new hdk(obj2, pdkVarA, 8));
                return;
            }
            return;
        }
        Object obj3 = this.a;
        if (((kzl) obj3).f) {
            return;
        }
        synchronized (obj3) {
            sbpVarJ = sbp.j(((kzl) obj3).c);
        }
        int size = sbpVarJ.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((pdm) sbpVarJ.get(i2)).d(phcVar);
        }
    }
}
