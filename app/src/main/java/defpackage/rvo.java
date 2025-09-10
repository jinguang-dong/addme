package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rvo extends rvn {
    private final char a;
    private final char b;

    public rvo(char c, char c2) {
        a.I(c2 >= c);
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.rvs
    public final boolean b(char c) {
        return this.a <= c && c <= this.b;
    }

    public final String toString() {
        return "CharMatcher.inRange('" + rvs.c(this.a) + "', '" + rvs.c(this.b) + "')";
    }
}
