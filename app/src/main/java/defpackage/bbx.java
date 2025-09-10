package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbx extends bdf {
    public static final bbx a = new bbx();

    private bbx() {
        super(0, 2, 1);
    }

    @Override // defpackage.bdf
    protected final void a(bdi bdiVar, axr axrVar, baz bazVar, bfn bfnVar, bdg bdgVar) {
        axq axqVar = (axq) bdiVar.c(0);
        Object objC = bdiVar.c(1);
        if (objC instanceof bar) {
            bfnVar.f((bar) objC);
        }
        if (bazVar.m != 0) {
            ayi.i("Can only append a slot if not current inserting");
        }
        int i = bazVar.h;
        int i2 = bazVar.i;
        int iA = bazVar.a(axqVar);
        int iC = bazVar.c(bazVar.b, bazVar.h(iA + 1));
        bazVar.h = iC;
        bazVar.i = iC;
        bazVar.E(1, iA);
        if (i >= iC) {
            i++;
            i2++;
        }
        bazVar.c[iC] = objC;
        bazVar.h = i;
        bazVar.i = i2;
    }
}
