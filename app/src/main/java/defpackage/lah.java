package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lah {
    public final boolean a;
    public final boolean b;

    public lah() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lah) {
            lah lahVar = (lah) obj;
            if (this.a == lahVar.a && this.b == lahVar.b) {
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

    public lah(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
