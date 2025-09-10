package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rvp extends rvn {
    private final char a;

    public rvp(char c) {
        this.a = c;
    }

    @Override // defpackage.rvs
    public final boolean b(char c) {
        return c == this.a;
    }

    public final String toString() {
        return "CharMatcher.is('" + rvs.c(this.a) + "')";
    }
}
