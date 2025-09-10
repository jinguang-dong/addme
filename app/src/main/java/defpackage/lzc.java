package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzc {
    public final int a;
    public final int b;
    public final lzl c;

    public lzc() {
        throw null;
    }

    public static olm a() {
        olm olmVar = new olm();
        olmVar.f(3);
        olmVar.g(10);
        return olmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lzc) {
            lzc lzcVar = (lzc) obj;
            if (this.a == lzcVar.a && this.b == lzcVar.b && this.c.equals(lzcVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        lzl lzlVar = this.c;
        return ((this.b ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ lzlVar.hashCode();
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + String.valueOf(this.c) + "}";
    }

    public lzc(int i, int i2, lzl lzlVar) {
        this.a = i;
        this.b = i2;
        this.c = lzlVar;
    }
}
