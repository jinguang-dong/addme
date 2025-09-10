package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcz extends bdf {
    public static final bcz a = new bcz();

    private bcz() {
        super(1, 2);
    }

    @Override // defpackage.bdf
    protected final void a(bdi bdiVar, axr axrVar, baz bazVar, bfn bfnVar, bdg bdgVar) {
        int iG;
        Object objC = bdiVar.c(0);
        axq axqVar = (axq) bdiVar.c(1);
        boolean z = objC instanceof bar;
        int iA = bdiVar.a(0);
        if (z) {
            bfnVar.f((bar) objC);
        }
        int iA2 = bazVar.a(axqVar);
        Object objW = bazVar.w(iA2, iA, objC);
        if (!(objW instanceof bar)) {
            if (objW instanceof bai) {
                ((bai) objW).b();
                return;
            }
            return;
        }
        int iG2 = bazVar.g() - bazVar.o(iA2, iA);
        bar barVar = (bar) objW;
        axq axqVar2 = barVar.b;
        int iA3 = -1;
        if (axqVar2 == null || !axqVar2.a()) {
            iG = -1;
        } else {
            iA3 = bazVar.a(axqVar2);
            iG = bazVar.g() - bazVar.p(iA3);
        }
        bfnVar.d(barVar, iG2, iA3, iG);
    }
}
