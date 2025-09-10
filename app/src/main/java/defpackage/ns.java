package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ns implements nb {
    final /* synthetic */ nu a;
    private final no b;

    public ns(nu nuVar, no noVar) {
        this.a = nuVar;
        this.b = noVar;
    }

    @Override // defpackage.nb
    public final void b() {
        nu nuVar = this.a;
        ufu ufuVar = nuVar.a;
        no noVar = this.b;
        ufuVar.remove(noVar);
        if (a.ao(nuVar.b, noVar)) {
            noVar.a();
            nuVar.b = null;
        }
        noVar.f(this);
        uif uifVar = noVar.d;
        if (uifVar != null) {
            uifVar.a();
        }
        noVar.d = null;
    }
}
