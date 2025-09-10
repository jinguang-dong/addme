package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chj {
    public static final chj a = new chj(2, false);
    public static final chj b = new chj(1, true);
    public final int c;
    public final boolean d;

    public chj(int i, boolean z) {
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chj)) {
            return false;
        }
        chj chjVar = (chj) obj;
        return a.p(this.c, chjVar.c) && this.d == chjVar.d;
    }

    public final int hashCode() {
        return (this.c * 31) + a.o(this.d);
    }

    public final String toString() {
        return a.ao(this, a) ? "TextMotion.Static" : a.ao(this, b) ? "TextMotion.Animated" : "Invalid";
    }
}
