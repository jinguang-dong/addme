package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lep {
    public final boolean a;
    public final int b;

    public lep() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lep) {
            lep lepVar = (lep) obj;
            if (this.a == lepVar.a && this.b == lepVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + "}";
    }

    public lep(boolean z, int i) {
        this.a = z;
        this.b = i;
    }
}
