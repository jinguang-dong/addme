package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzr {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public dzr(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzr)) {
            return false;
        }
        dzr dzrVar = (dzr) obj;
        return this.a == dzrVar.a && this.b == dzrVar.b && this.c == dzrVar.c && this.d == dzrVar.d;
    }

    public final int hashCode() {
        int iO = a.o(this.a);
        boolean z = this.d;
        return (((((iO * 31) + a.o(this.b)) * 31) + a.o(this.c)) * 31) + a.o(z);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isNotRoaming=" + this.d + ')';
    }
}
