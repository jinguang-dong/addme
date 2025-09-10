package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcd extends bdf {
    public static final bcd a = new bcd();

    private bcd() {
        super(0, 1, 1);
    }

    @Override // defpackage.bdf
    protected final void a(bdi bdiVar, axr axrVar, baz bazVar, bfn bfnVar, bdg bdgVar) {
        for (Object obj : (Object[]) bdiVar.c(0)) {
            axrVar.d(obj);
        }
    }
}
