package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tjc extends tiv {
    final /* synthetic */ boolean a;
    final /* synthetic */ tih b;
    final /* synthetic */ tmk c;
    final /* synthetic */ tjd d;
    private volatile tiv e;

    public tjc(tjd tjdVar, boolean z, tih tihVar, tmk tmkVar) {
        this.a = z;
        this.b = tihVar;
        this.c = tmkVar;
        this.d = tjdVar;
    }

    @Override // defpackage.tiv
    public final Object a(tml tmlVar) throws IOException {
        if (this.a) {
            tmlVar.q();
            return null;
        }
        tiv tivVarC = this.e;
        if (tivVarC == null) {
            tivVarC = this.b.c(this.d, this.c);
            this.e = tivVarC;
        }
        return tivVarC.a(tmlVar);
    }
}
