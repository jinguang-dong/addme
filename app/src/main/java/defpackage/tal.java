package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tal {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public tal() {
        throw null;
    }

    public static tak a() {
        tak takVar = new tak();
        takVar.b(false);
        takVar.c(false);
        takVar.d(false);
        return takVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tal) {
            tal talVar = (tal) obj;
            if (this.a == talVar.a && this.b == talVar.b && this.c == talVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + "}";
    }

    public tal(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
