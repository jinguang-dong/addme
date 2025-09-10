package defpackage;

import androidx.wear.ambient.AmbientDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dnq extends bup implements bqp {
    public afy a;
    public final urk b;
    public dnj c;
    public final AmbientDelegate d;
    private final uqm e;
    private final bpb f;
    private final boy g;

    public dnq(dnj dnjVar, afy afyVar) {
        this.c = dnjVar;
        this.a = afyVar;
        uqm uqmVarP = ukc.P(-1, 0, null, 6);
        this.e = uqmVarP;
        this.b = new urg(uqmVarP);
        bpb bpbVar = new bpb();
        this.f = bpbVar;
        dnp dnpVar = new dnp();
        this.g = dnpVar;
        this.d = new AmbientDelegate(this.a, bpbVar);
        M(new bpe(dnpVar, bpbVar));
    }

    @Override // defpackage.bqp
    public final boolean a(bqr bqrVar) {
        this.e.j(bqrVar);
        return true;
    }

    @Override // defpackage.bqp
    public final boolean c(bqr bqrVar) {
        return false;
    }

    @Override // defpackage.bij
    public final void cW() {
        d();
        ukc.C(C(), null, 0, new aie(this, (uhb) null, 3), 3);
    }

    public final void d() {
        dnj dnjVar = this.c;
        if (true != (dnjVar instanceof dnj)) {
            dnjVar = null;
        }
        if (dnjVar != null) {
            dnjVar.g = this.d;
        }
    }
}
