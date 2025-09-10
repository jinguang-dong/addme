package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bck extends bdf {
    public static final bck a = new bck();

    private bck() {
        super(1, 2);
    }

    @Override // defpackage.bdf
    protected final void a(bdi bdiVar, axr axrVar, baz bazVar, bfn bfnVar, bdg bdgVar) {
        Object objA = ((uif) bdiVar.c(0)).a();
        axq axqVar = (axq) bdiVar.c(1);
        int iA = bdiVar.a(0);
        bazVar.Q(bazVar.a(axqVar), objA);
        axrVar.j(iA, objA);
        axrVar.d(objA);
    }

    @Override // defpackage.bdf
    protected final axq b(bdi bdiVar) {
        return (axq) bdiVar.c(1);
    }
}
