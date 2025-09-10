package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bcu extends bdf {
    public static final bcu a = new bcu();

    private bcu() {
        super(0, 0, 3);
    }

    @Override // defpackage.bdf
    protected final void a(bdi bdiVar, axr axrVar, baz bazVar, bfn bfnVar, bdg bdgVar) {
        if (bazVar.m != 0) {
            ayi.i("Cannot reset when inserting");
        }
        bazVar.H();
        bazVar.o = 0;
        bazVar.p = bazVar.e() - bazVar.g;
        bazVar.h = 0;
        bazVar.i = 0;
        bazVar.n = 0;
    }
}
