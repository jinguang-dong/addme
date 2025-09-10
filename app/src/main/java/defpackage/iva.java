package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iva implements pdm {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public iva(ivb ivbVar, int i) {
        this.b = i;
        this.a = ivbVar;
    }

    @Override // defpackage.pdm
    public final /* synthetic */ String a() {
        return "";
    }

    @Override // defpackage.pdm
    public final void d(phc phcVar) {
        int i = this.b;
        int i2 = 0;
        if (i != 0) {
            if (i == 1) {
                ojl.bB(phcVar, new fuh(this.a, i2));
                return;
            }
            pdk pdkVarA = phcVar.a();
            if (pdkVarA != null) {
                pdkVarA.j(new mjd((mje) this.a, pdkVarA));
                return;
            }
            return;
        }
        Object obj = this.a;
        if (((ivb) obj).h) {
            ((sgt) ivb.a.c().M(2330)).s("Already closed, cannot process analysis frame.");
            return;
        }
        synchronized (obj) {
            if (((ivb) obj).g == null) {
                ((ivb) obj).g(phcVar, false);
            }
        }
    }

    public /* synthetic */ iva(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
