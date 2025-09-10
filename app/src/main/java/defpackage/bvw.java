package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bvw extends ujq implements uif {
    final /* synthetic */ bvx a;
    final /* synthetic */ bws b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvw(bvx bvxVar, bws bwsVar, long j) {
        super(0);
        this.a = bvxVar;
        this.b = bwsVar;
        this.c = j;
    }

    @Override // defpackage.uif
    public final /* synthetic */ Object a() {
        bvu bvuVarY;
        bvx bvxVar = this.a;
        btd btaVar = null;
        if (byi.q(bvxVar.p()) || bvxVar.f.c) {
            bwi bwiVar = bvxVar.x().w;
            if (bwiVar != null) {
                btaVar = bwiVar.l;
            }
        } else {
            bwi bwiVar2 = bvxVar.x().w;
            if (bwiVar2 != null && (bvuVarY = bwiVar2.y()) != null) {
                btaVar = bvuVarY.l;
            }
        }
        if (btaVar == null) {
            bws bwsVar = this.b;
            uiq uiqVar = btf.a;
            btaVar = new bta(bwsVar);
        }
        long j = this.c;
        bvu bvuVarY2 = bvxVar.x().y();
        bvuVarY2.getClass();
        btaVar.r(bvuVarY2, j);
        return ufg.a;
    }
}
