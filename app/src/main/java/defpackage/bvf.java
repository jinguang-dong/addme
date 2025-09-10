package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bvf extends bvu {
    final /* synthetic */ bvh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvf(bvh bvhVar) {
        super(bvhVar);
        this.f = bvhVar;
    }

    @Override // defpackage.bvu, defpackage.bru
    public final int c(int i) {
        bvh bvhVar = this.f;
        bve bveVar = bvhVar.f;
        bvu bvuVarY = bvhVar.C().y();
        bvuVarY.getClass();
        return bveVar.c(this, bvuVarY, i);
    }

    @Override // defpackage.bvu, defpackage.bru
    public final int d(int i) {
        bvh bvhVar = this.f;
        bve bveVar = bvhVar.f;
        bvu bvuVarY = bvhVar.C().y();
        bvuVarY.getClass();
        return bveVar.d(this, bvuVarY, i);
    }

    @Override // defpackage.bvu, defpackage.bru
    public final int e(int i) {
        bvh bvhVar = this.f;
        bve bveVar = bvhVar.f;
        bvu bvuVarY = bvhVar.C().y();
        bvuVarY.getClass();
        return bveVar.e(this, bvuVarY, i);
    }

    @Override // defpackage.bvu, defpackage.bru
    public final int f(int i) {
        bvh bvhVar = this.f;
        bve bveVar = bvhVar.f;
        bvu bvuVarY = bvhVar.C().y();
        bvuVarY.getClass();
        return bveVar.f(this, bvuVarY, i);
    }

    @Override // defpackage.bvt
    public final int p(bqv bqvVar) {
        zm zmVar = this.p;
        int iN = amo.n(this, bqvVar);
        zmVar.g(bqvVar, iN);
        return iN;
    }

    @Override // defpackage.bsq
    public final bte r(long j) {
        v(j);
        cho choVar = new cho(j);
        bvh bvhVar = this.f;
        bvhVar.g = choVar;
        bve bveVar = bvhVar.f;
        bvu bvuVarY = bvhVar.C().y();
        bvuVarY.getClass();
        super.A(bveVar.a(this, bvuVarY, j));
        return this;
    }
}
