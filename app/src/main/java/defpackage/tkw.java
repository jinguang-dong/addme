package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkw extends tkv {
    final tih a;
    private final tik b;
    private final tmk c;
    private final tiw d;
    private final boolean e;
    private volatile tiv f;

    public tkw(tik tikVar, tih tihVar, tmk tmkVar, tiw tiwVar, boolean z) {
        this.b = tikVar;
        this.a = tihVar;
        this.c = tmkVar;
        this.d = tiwVar;
        this.e = z;
    }

    @Override // defpackage.tiv
    public final Object a(tml tmlVar) {
        tik tikVar = this.b;
        if (tikVar == null) {
            tiv tivVarC = this.f;
            if (tivVarC == null) {
                tivVarC = this.a.c(this.d, this.c);
                this.f = tivVarC;
            }
            return tivVarC.a(tmlVar);
        }
        til tilVarY = sla.y(tmlVar);
        if (this.e && (tilVarY instanceof tin)) {
            return null;
        }
        return tikVar.a();
    }
}
