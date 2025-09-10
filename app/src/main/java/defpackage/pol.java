package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pol {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;
    public final int g;

    public pol() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pol) {
            pol polVar = (pol) obj;
            if (this.a == polVar.a && this.b == polVar.b && this.c == polVar.c && this.d == polVar.d && this.e == polVar.e && this.f == polVar.f) {
                int i = polVar.g;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.e;
        return (this.f ^ ((((int) (j ^ (j >>> 32))) ^ ((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003)) * 1000003)) * 1000003;
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + ", 0}";
    }

    public pol(int i, int i2, int i3, int i4, long j, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
        this.f = i5;
        this.g = 0;
    }
}
