package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dgv extends dgq {
    final /* synthetic */ dgx a;

    public dgv(dgx dgxVar) {
        this.a = dgxVar;
    }

    @Override // defpackage.dgq, defpackage.dgm
    public final void a(dgp dgpVar) {
        dgx dgxVar = this.a;
        dgxVar.u.remove(dgpVar);
        if (dgxVar.A()) {
            return;
        }
        dgxVar.t(dgxVar, dgo.c, false);
        dgxVar.m = true;
        dgxVar.t(dgxVar, dgo.b, false);
    }
}
