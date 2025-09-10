package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class upe extends uoo {
    private final uml a;

    public upe(uml umlVar) {
        this.a = umlVar;
    }

    @Override // defpackage.uoo
    public final void a(Throwable th) {
        Object objC = e().C();
        boolean z = unf.a;
        if (objC instanceof umt) {
            this.a.fW(rnt.aM(((umt) objC).b));
        } else {
            this.a.fW(uow.b(objC));
        }
    }

    @Override // defpackage.uoo
    public final boolean b() {
        return false;
    }
}
