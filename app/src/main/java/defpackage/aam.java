package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aam extends ujq implements uiv {
    final /* synthetic */ uiq a;
    final /* synthetic */ ado b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aam(uiq uiqVar, ado adoVar) {
        super(3);
        this.a = uiqVar;
        this.b = adoVar;
    }

    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j;
        bst bstVar = (bst) obj;
        bte bteVarR = ((bsq) obj2).r(((cho) obj3).a);
        if (!bstVar.dt() || ((Boolean) this.a.a(this.b.e())).booleanValue()) {
            j = (bteVarR.a << 32) | (bteVarR.b & 4294967295L);
        } else {
            j = 0;
        }
        return bstVar.ds((int) (j >> 32), (int) (4294967295L & j), ufx.a, new aal(bteVarR, 0));
    }
}
