package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pwv {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public pwv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pwv) {
            pwv pwvVar = (pwv) obj;
            if (this.a == pwvVar.a && this.b == pwvVar.b && this.c == pwvVar.c) {
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

    public pwv(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
