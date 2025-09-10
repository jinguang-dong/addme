package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uos extends uoo {
    final /* synthetic */ uov a;
    private final uwx f;

    public uos(uov uovVar, uwx uwxVar) {
        this.a = uovVar;
        this.f = uwxVar;
    }

    @Override // defpackage.uoo
    public final void a(Throwable th) {
        uov uovVar = this.a;
        Object objC = uovVar.C();
        if (!(objC instanceof umt)) {
            objC = uow.b(objC);
        }
        this.f.g(uovVar, objC);
    }

    @Override // defpackage.uoo
    public final boolean b() {
        return false;
    }
}
