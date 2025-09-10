package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bby extends bdf {
    public static final bby a = new bby();

    private bby() {
        super(0, 2, 1);
    }

    @Override // defpackage.bdf
    protected final void a(bdi bdiVar, axr axrVar, baz bazVar, bfn bfnVar, bdg bdgVar) {
        bfi bfiVar = (bfi) bdiVar.c(1);
        int i = bfiVar != null ? bfiVar.a : 0;
        bbt bbtVar = (bbt) bdiVar.c(0);
        if (i > 0) {
            axrVar = new azs(axrVar, i);
        }
        bbtVar.k(axrVar, bazVar, bfnVar, bdgVar != null ? new bdh(bdgVar, bazVar) : null);
    }
}
