package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbg implements pbc {
    private final pbc a;
    private final String b;

    public pbg(pbc pbcVar, String str) {
        this.a = pbcVar;
        this.b = str;
    }

    @Override // defpackage.pbc, defpackage.pbb
    public final pbc a(String str) {
        return new pbg(this.a.a(str), this.b);
    }

    @Override // defpackage.pbc
    public final void b(String str) {
        this.a.b(this.b.concat(String.valueOf(str)));
    }

    @Override // defpackage.pbc
    public final void c(String str, Throwable th) {
        this.a.c(this.b.concat(str), th);
    }

    @Override // defpackage.pbc
    public final void d(String str) {
        this.a.d(this.b.concat(String.valueOf(str)));
    }

    @Override // defpackage.pbc
    public final void e(String str, Throwable th) {
        this.a.e(this.b.concat(String.valueOf(str)), th);
    }

    @Override // defpackage.pbc
    public final void f(String str) {
        this.a.f(this.b.concat(String.valueOf(str)));
    }

    @Override // defpackage.pbc
    public final void g(String str) {
        this.a.g(this.b.concat(String.valueOf(str)));
    }

    @Override // defpackage.pbc
    public final void h(String str) {
        this.a.h(this.b.concat(String.valueOf(str)));
    }

    @Override // defpackage.pbc
    public final void i(String str, Throwable th) {
        this.a.i(this.b.concat(str), th);
    }
}
