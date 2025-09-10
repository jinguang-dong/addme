package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mew {
    public final boolean a;
    public final boolean b;

    public mew() {
        throw null;
    }

    public static mev a() {
        mev mevVar = new mev();
        mevVar.c(true);
        mevVar.b(true);
        return mevVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mew) {
            mew mewVar = (mew) obj;
            if (this.a == mewVar.a && this.b == mewVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + "}";
    }

    public mew(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
