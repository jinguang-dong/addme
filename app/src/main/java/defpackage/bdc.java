package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdc extends bdf {
    public static final bdc a = new bdc();

    private bdc() {
        super(1, 1);
    }

    @Override // defpackage.bdf
    protected final void a(bdi bdiVar, axr axrVar, baz bazVar, bfn bfnVar, bdg bdgVar) {
        Object objC = bdiVar.c(0);
        boolean z = objC instanceof bar;
        int iA = bdiVar.a(0);
        if (z) {
            bfnVar.f((bar) objC);
        }
        Object objW = bazVar.w(bazVar.o, iA, objC);
        if (objW instanceof bar) {
            bfnVar.d((bar) objW, bazVar.g() - bazVar.o(bazVar.o, iA), -1, -1);
        } else if (objW instanceof bai) {
            ((bai) objW).b();
        }
    }
}
