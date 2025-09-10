package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pch {
    public final boolean a;

    public pch() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof pch) && this.a == ((pch) obj).a;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1000;
    }

    public final String toString() {
        return "{" + this.a + ", 1000}";
    }

    public pch(boolean z) {
        this.a = z;
    }
}
