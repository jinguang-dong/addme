package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dgw extends dgq {
    final dgx a;

    public dgw(dgx dgxVar) {
        this.a = dgxVar;
    }

    @Override // defpackage.dgq, defpackage.dgm
    public final void b(dgp dgpVar) {
        dgx dgxVar = this.a;
        int i = dgxVar.v - 1;
        dgxVar.v = i;
        if (i == 0) {
            dgxVar.w = false;
            dgxVar.s();
        }
        dgpVar.F(this);
    }

    @Override // defpackage.dgq, defpackage.dgm
    public final void e(dgp dgpVar) {
        dgx dgxVar = this.a;
        if (dgxVar.w) {
            return;
        }
        dgxVar.z();
        dgxVar.w = true;
    }
}
