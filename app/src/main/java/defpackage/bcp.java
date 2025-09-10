package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcp extends bdf {
    public static final bcp a = new bcp();

    private bcp() {
        super(1, 1);
    }

    @Override // defpackage.bdf
    protected final void a(bdi bdiVar, axr axrVar, baz bazVar, bfn bfnVar, bdg bdgVar) {
        axq axqVar = (axq) bdiVar.c(0);
        int iA = bdiVar.a(0);
        axrVar.h();
        axrVar.i(iA, bazVar.v(bazVar.a(axqVar)));
    }

    @Override // defpackage.bdf
    protected final axq b(bdi bdiVar) {
        return (axq) bdiVar.c(0);
    }
}
