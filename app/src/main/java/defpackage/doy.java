package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class doy extends bij implements bve {
    public uiq a;
    public uif b;
    private Integer c;

    public doy(uiq uiqVar, uif uifVar) {
        this.a = uiqVar;
        this.b = uifVar;
    }

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        int iX = ukj.x(((Number) this.b.a()).floatValue());
        Integer num = this.c;
        if (num == null || (iX > 0 && num.intValue() != iX)) {
            this.a.a(Float.valueOf(bsqVar.c(cho.b(j))));
            this.c = Integer.valueOf(iX);
        }
        bte bteVarR = bsqVar.r(chp.d(cho.b(j), cho.b(j), iX, iX));
        int iB = cho.b(j);
        int iA = cho.a(j);
        return bstVar.ds(iB, iA, ufx.a, new ccv(iB, bteVarR, iA, 2));
    }

    @Override // defpackage.bve
    public final /* synthetic */ int c(brv brvVar, bru bruVar, int i) {
        return amo.o(this, brvVar, bruVar, i);
    }

    @Override // defpackage.bve
    public final /* synthetic */ int d(brv brvVar, bru bruVar, int i) {
        return amo.p(this, brvVar, bruVar, i);
    }

    @Override // defpackage.bve
    public final /* synthetic */ int e(brv brvVar, bru bruVar, int i) {
        return amo.q(this, brvVar, bruVar, i);
    }

    @Override // defpackage.bve
    public final /* synthetic */ int f(brv brvVar, bru bruVar, int i) {
        return amo.r(this, brvVar, bruVar, i);
    }
}
