package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hcr implements syf {
    final /* synthetic */ pbc a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public hcr(pbc pbcVar, String str, String str2) {
        this.a = pbcVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        this.a.i(this.c, th);
    }

    @Override // defpackage.syf
    public final void b(Object obj) {
        this.a.f(this.b);
    }
}
