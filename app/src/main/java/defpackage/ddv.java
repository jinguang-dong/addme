package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddv extends ddw {
    private final dfq a;

    public ddv(dfa dfaVar, String str) {
        super(dfaVar, str);
        this.a = dfaVar.k(str);
    }

    @Override // defpackage.dey
    public final int a() {
        k();
        return 0;
    }

    @Override // defpackage.dey
    public final long b(int i) {
        k();
        cog.q(21, "no row");
        throw new uer();
    }

    @Override // defpackage.dey
    public final String c(int i) {
        k();
        cog.q(21, "no row");
        throw new uer();
    }

    @Override // defpackage.dey, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        m();
    }

    @Override // defpackage.dey
    public final String d(int i) {
        k();
        cog.q(21, "no row");
        throw new uer();
    }

    @Override // defpackage.dey
    public final void e(int i, long j) {
        k();
        this.a.e(i, j);
    }

    @Override // defpackage.dey
    public final void f(int i) {
        k();
        this.a.f(i);
    }

    @Override // defpackage.dey
    public final void g(int i, String str) {
        k();
        this.a.g(i, str);
    }

    @Override // defpackage.dey
    public final boolean i(int i) {
        k();
        cog.q(21, "no row");
        throw new uer();
    }

    @Override // defpackage.dey
    public final boolean j() {
        k();
        this.a.a.execute();
        return false;
    }

    @Override // defpackage.dey
    public final void h() {
    }
}
