package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ldf extends ojl {
    final /* synthetic */ lss a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ldg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldf(ldg ldgVar, lss lssVar, boolean z, boolean z2) {
        super((short[]) null);
        this.a = lssVar;
        this.b = z;
        this.c = z2;
        this.d = ldgVar;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        lss lssVar = this.a;
        int i = lssVar.l().a;
        poeVar.d();
        ldg.q(poeVar);
        ldg ldgVar = this.d;
        ldgVar.h(poeVar);
        ldgVar.j(poeVar);
        ldgVar.k(poeVar);
        ldgVar.r(poeVar);
        if (this.c) {
            nzf nzfVar = new nzf(lssVar.h());
            nzfVar.b = poeVar;
            lssVar.V(nzfVar.i());
        } else {
            boolean z = this.b;
            nzf nzfVar2 = new nzf(lssVar.h());
            nzfVar2.j(z);
            nzfVar2.a = poeVar;
            lssVar.V(nzfVar2.i());
        }
    }
}
