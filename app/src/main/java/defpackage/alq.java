package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class alq extends alp {
    public int b = 2;
    public boolean a = true;

    @Override // defpackage.alp, defpackage.bve
    public final int d(brv brvVar, bru bruVar, int i) {
        return this.b == 1 ? bruVar.f(i) : bruVar.d(i);
    }

    @Override // defpackage.alp, defpackage.bve
    public final int f(brv brvVar, bru bruVar, int i) {
        return this.b == 1 ? bruVar.f(i) : bruVar.d(i);
    }

    @Override // defpackage.alp
    public final boolean h() {
        return this.a;
    }

    @Override // defpackage.alp
    public final long k(bsq bsqVar, long j) {
        int iF = this.b == 1 ? bsqVar.f(cho.a(j)) : bsqVar.d(cho.a(j));
        if (iF < 0) {
            iF = 0;
        }
        return chp.g(iF, iF, 0, Integer.MAX_VALUE);
    }
}
