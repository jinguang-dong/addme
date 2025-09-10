package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dgr extends dgq {
    final /* synthetic */ yd a;
    final /* synthetic */ dgs b;

    public dgr(dgs dgsVar, yd ydVar) {
        this.b = dgsVar;
        this.a = ydVar;
    }

    @Override // defpackage.dgq, defpackage.dgm
    public final void b(dgp dgpVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(dgpVar);
        dgpVar.F(this);
    }
}
