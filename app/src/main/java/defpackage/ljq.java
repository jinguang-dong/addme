package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljq {
    public final int a;
    public final int b;
    public final boolean c;

    public ljq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ljq) {
            ljq ljqVar = (ljq) obj;
            if (this.a == ljqVar.a && this.b == ljqVar.b && this.c == ljqVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + "}";
    }

    public ljq(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }
}
