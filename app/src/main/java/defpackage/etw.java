package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class etw extends fat implements etx {
    public ree a;

    public etw(long j) {
        super(j);
    }

    @Override // defpackage.fat
    protected final /* bridge */ /* synthetic */ int a(Object obj) {
        esw eswVar = (esw) obj;
        if (eswVar == null) {
            return 1;
        }
        return eswVar.a();
    }

    @Override // defpackage.etx
    public final /* bridge */ /* synthetic */ esw b(eqi eqiVar) {
        return (esw) super.i(eqiVar);
    }

    @Override // defpackage.fat
    protected final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        esw eswVar = (esw) obj2;
        ree reeVar = this.a;
        if (reeVar == null || eswVar == null) {
            return;
        }
        ((nyt) reeVar.f).a(eswVar, true);
    }

    @Override // defpackage.etx
    public final /* bridge */ /* synthetic */ void d(eqi eqiVar, esw eswVar) {
    }
}
