package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pcg implements pcf {
    private final pai a;
    private final pcf b;
    private boolean c = true;
    private boolean d = false;

    public pcg(pcf pcfVar, pai paiVar) {
        this.b = pcfVar;
        this.a = paiVar;
    }

    @Override // defpackage.pcf
    public final pjo a() {
        if (this.c) {
            this.c = false;
            pcf pcfVar = this.b;
            for (pjo pjoVarA = pcfVar.a(); pjoVarA != null; pjoVarA = pcfVar.a()) {
                if (((Boolean) this.a.a(pjoVarA)).booleanValue()) {
                    this.d = true;
                    return pjoVarA;
                }
            }
            pcfVar.b();
        }
        if (!this.d) {
            return this.b.a();
        }
        pcf pcfVar2 = this.b;
        for (pjo pjoVarA2 = pcfVar2.a(); pjoVarA2 != null; pjoVarA2 = pcfVar2.a()) {
            if (((Boolean) this.a.a(pjoVarA2)).booleanValue()) {
                return pjoVarA2;
            }
        }
        return null;
    }

    @Override // defpackage.pcf
    public final void b() {
        this.b.b();
    }
}
