package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lie {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final String f;
    public final int g;

    public lie() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lie) {
            lie lieVar = (lie) obj;
            if (this.a == lieVar.a && this.b == lieVar.b && this.c == lieVar.c && this.d == lieVar.d && this.e == lieVar.e && this.g == lieVar.g && this.f.equals(lieVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        a.aQ(i);
        return ((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ i) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + Integer.toString(this.g - 1) + ", " + this.f + "}";
    }

    public lie(int i, int i2, int i3, int i4, boolean z, int i5, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.g = i5;
        this.f = str;
    }
}
