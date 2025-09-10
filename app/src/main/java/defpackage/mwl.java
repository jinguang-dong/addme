package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwl {
    public final pnu a;
    public final boolean b;

    public mwl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwl) {
            mwl mwlVar = (mwl) obj;
            if (this.a.equals(mwlVar.a) && this.b == mwlVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.a.toString() + ", " + this.b + "}";
    }

    public mwl(pnu pnuVar, boolean z) {
        this.a = pnuVar;
        this.b = z;
    }
}
