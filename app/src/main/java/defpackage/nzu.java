package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzu {
    public final int a;
    public final int b;
    private final int c;

    public nzu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nzu) {
            nzu nzuVar = (nzu) obj;
            if (this.a == nzuVar.a && this.c == nzuVar.c && this.b == nzuVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((((this.a ^ 1000003) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.c + ", " + this.b + "}";
    }

    public nzu(int i, int i2, int i3) {
        this.a = i;
        this.c = i2;
        this.b = i3;
    }
}
