package defpackage;

import com.google.googlex.gcam.BurstSpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lds implements pdm {
    public final iby a;
    final /* synthetic */ ldt b;
    private int c = 0;

    public lds(ldt ldtVar, iby ibyVar) {
        this.b = ldtVar;
        this.a = ibyVar;
    }

    @Override // defpackage.pdm
    public final /* synthetic */ String a() {
        return "";
    }

    @Override // defpackage.pdm
    public final void d(phc phcVar) {
        if (this.c > 6) {
            return;
        }
        pdk pdkVarA = phcVar.a();
        if (pdkVarA == null) {
            ((sgt) ldt.a.c().M(4057)).t("Unable to acquire frame for shot %s, skipping.", this.a.a());
            return;
        }
        ldt ldtVar = this.b;
        int i = this.c + 1;
        this.c = i;
        if (i <= 6) {
            iby ibyVar = this.a;
            ibyVar.a();
            ldtVar.b(ibyVar, ldtVar.c.c(pdkVarA, 2));
        }
        if (this.c == 6) {
            synchronized (ldtVar) {
                ldtVar.d.remove(Integer.valueOf(this.a.a()));
            }
            ldtVar.b.m(this);
            ldt ldtVar2 = this.b;
            iby ibyVar2 = this.a;
            tcq tcqVar = hxy.a;
            ldtVar2.d(ibyVar2, new BurstSpec());
        }
    }
}
