package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class giq extends gjo {
    final /* synthetic */ git a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giq(git gitVar) {
        super(gitVar);
        this.a = gitVar;
    }

    @Override // defpackage.gjo, defpackage.gjy, defpackage.gjw
    public final void c() {
        git gitVar = this.a;
        mdb mdbVar = gitVar.a;
        mdbVar.e();
        super.c();
        mdbVar.g(gitVar.d);
    }

    @Override // defpackage.gjo, defpackage.gjy, defpackage.gjw
    public final void d() {
        git gitVar = this.a;
        mdb mdbVar = gitVar.a;
        mdbVar.e();
        super.d();
        mdbVar.g(gitVar.c);
    }
}
