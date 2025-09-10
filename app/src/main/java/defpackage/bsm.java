package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bsm extends ujq implements uiu {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsm(bsd bsdVar, uiu uiuVar, int i) {
        super(2);
        this.c = i;
        this.a = bsdVar;
        this.b = uiuVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, uiu] */
    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.c != 0) {
            int iIntValue = ((Number) obj).intValue();
            cbr cbrVar = (cbr) obj2;
            if (!((ys) ((byz) this.b).b).a(cbrVar.e)) {
                bjc bjcVar = (bjc) this.a;
                bjcVar.f(iIntValue, cbrVar);
                bjcVar.d();
            }
            return ufg.a;
        }
        ayc aycVar = (ayc) obj;
        int iIntValue2 = ((Number) obj2).intValue();
        int i = iIntValue2 & 3;
        if (aycVar.H(i != 2, iIntValue2 & 1)) {
            Object obj3 = this.a;
            ?? r4 = this.b;
            boolean zA = ((bsd) obj3).a();
            aycVar.K(Boolean.valueOf(zA));
            boolean zC = aycVar.C(zA);
            if (zA) {
                r4.a(aycVar, 0);
            } else {
                aycVar.k(zC);
            }
            aycVar.p();
        } else {
            aycVar.r();
        }
        return ufg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsm(byz byzVar, bjc bjcVar, int i) {
        super(2);
        this.c = i;
        this.b = byzVar;
        this.a = bjcVar;
    }
}
