package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kja implements syf {
    final /* synthetic */ szh a;
    final /* synthetic */ kqh b;
    final /* synthetic */ kjc c;

    public kja(kjc kjcVar, szh szhVar, kqh kqhVar) {
        this.a = szhVar;
        this.b = kqhVar;
        this.c = kjcVar;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        this.a.a(th);
        this.b.close();
        this.c.b();
    }

    @Override // defpackage.syf
    public final void b(Object obj) {
        this.a.e(obj);
        this.b.close();
        this.c.b();
    }
}
