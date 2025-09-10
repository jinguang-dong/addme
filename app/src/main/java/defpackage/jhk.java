package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhk extends no {
    final /* synthetic */ jhl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhk(jhl jhlVar) {
        super(false);
        this.a = jhlVar;
    }

    @Override // defpackage.no
    public final void b() {
        jhl jhlVar = this.a;
        if (jhlVar.x.C()) {
            return;
        }
        g(false);
        jhlVar.j().d();
    }
}
