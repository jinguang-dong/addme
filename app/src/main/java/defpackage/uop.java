package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uop extends uml {
    private final uov f;

    public uop(uhb uhbVar, uov uovVar) {
        super(uhbVar, 1);
        this.f = uovVar;
    }

    @Override // defpackage.uml
    protected final String m() {
        return "AwaitContinuation";
    }

    @Override // defpackage.uml
    public final Throwable n(uol uolVar) {
        Throwable thD;
        Object objC = this.f.C();
        return (!(objC instanceof uor) || (thD = ((uor) objC).d()) == null) ? objC instanceof umt ? ((umt) objC).b : uolVar.n() : thD;
    }
}
