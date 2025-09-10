package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hxp implements iam {
    final /* synthetic */ hxs a;
    final /* synthetic */ gga b;

    public hxp(hxs hxsVar, gga ggaVar) {
        this.b = ggaVar;
        this.a = hxsVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lss] */
    private final void a(iag iagVar) {
        gga ggaVar = this.b;
        ((kfl) ggaVar.d).e.close();
        ?? r0 = ggaVar.b;
        r0.A(iagVar);
        cxb cxbVar = this.a.g;
        if (cxbVar.C()) {
            ((kca) cxbVar.B()).g(r0.l());
        }
    }

    @Override // defpackage.iam
    public final void m(iby ibyVar) {
        this.a.c.b("Shot aborted.");
        a(new iag("Aborted HDR+ shot."));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.iam
    public final void o(iby ibyVar, mdr mdrVar) {
        mdq mdqVar;
        pbn pbnVar = this.a.b;
        pbnVar.f("ShotStatus-ShotCompleted");
        if (mdrVar != null && (mdqVar = ((mdo) this.b.b.o()).o) != null) {
            mdqVar.b = mdrVar.c;
            sbp sbpVarJ = sbp.j(mdrVar.d);
            mdqVar.i = ((Long) Collections.min(sbpVarJ)).longValue();
            mdqVar.j = ((Long) Collections.max(sbpVarJ)).longValue();
        }
        pbnVar.g();
    }

    @Override // defpackage.iam
    public final void p(iby ibyVar, iag iagVar) {
        this.a.c.c("Shot threw an error:", iagVar);
        a(iagVar);
    }
}
