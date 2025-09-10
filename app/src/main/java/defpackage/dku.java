package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dku implements uiv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dku(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, uiq] */
    @Override // defpackage.uiv
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        if (i == 0) {
            int iIntValue = ((Number) this.a.a()).intValue();
            bte bteVarR = ((bsq) obj2).r(cho.k(((cho) obj3).a, 0, 0, iIntValue, iIntValue, 3));
            return ((bst) obj).ds(bteVarR.a, bteVarR.b, ufx.a, new asj(bteVarR, 20));
        }
        int i2 = 1;
        if (i == 1) {
            this.a.a(new bkf(((bpv) obj2).c));
            return ufg.a;
        }
        if (i != 2) {
            if (i == 3) {
                this.a.a((Throwable) obj);
                return ufg.a;
            }
            boolean z = unf.a;
            uxa uxaVar = (uxa) this.a;
            uxaVar.a.c(null);
            uxaVar.d();
            return ufg.a;
        }
        bst bstVar = (bst) obj;
        bsq bsqVar = (bsq) obj2;
        long j = ((cho) obj3).a;
        int iB = cho.h(j) ? cho.b(j) : cho.d(j);
        int iA = cho.g(j) ? cho.a(j) : cho.c(j);
        dre dreVar = (dre) this.a;
        dreVar.b((Float.floatToRawIntBits(iB) << 32) | (Float.floatToRawIntBits(iA) & 4294967295L));
        bkg bkgVarA = dreVar.a();
        float f = bkgVarA.d - bkgVarA.b;
        float f2 = bkgVarA.e - bkgVarA.c;
        bte bteVarR2 = bsqVar.r(chp.d(ukj.x(f), ukj.x(f), ukj.x(f2), ukj.x(f2)));
        return bstVar.ds(ukc.p(bteVarR2.a, cho.d(j), cho.b(j)), ukc.p(bteVarR2.b, cho.c(j), cho.a(j)), ufx.a, new dql(bteVarR2, bkgVarA, i2));
    }
}
