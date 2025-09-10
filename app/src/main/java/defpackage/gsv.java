package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
class gsv extends gsz {
    final /* synthetic */ gsy a;

    public gsv(gsy gsyVar) {
        this.a = gsyVar;
    }

    @Override // defpackage.gsz, defpackage.mcz, defpackage.mda
    public final void a() {
        gsy gsyVar = this.a;
        gqc gqcVar = gsyVar.c;
        grm grmVar = gqcVar.h;
        if (grmVar != null) {
            try {
                rnt.x(grmVar);
                grmVar.c();
                gqcVar.e.b();
            } catch (IOException | RuntimeException e) {
                gqcVar.a(e, "Unable to close Vision kit");
            }
            gqcVar.h = null;
        }
        gri griVar = gqcVar.d;
        griVar.d.execute(new gpk(griVar, 8));
        gsyVar.a.e();
        gsyVar.k.c();
    }
}
