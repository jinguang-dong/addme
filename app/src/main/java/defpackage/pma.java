package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pma {
    public final szh a;
    public final long b;
    public final /* synthetic */ pmb c;

    public pma(pmb pmbVar, long j) {
        this.c = pmbVar;
        this.b = j;
        szh szhVar = new szh();
        this.a = szhVar;
        szhVar.c(new pgr(this, 5), sxo.a);
    }

    final void a(plz plzVar) {
        szh szhVar = this.a;
        if (plzVar == null) {
            szhVar.a(new pco());
        } else {
            if (szhVar.e(plzVar)) {
                return;
            }
            plzVar.close();
        }
    }
}
