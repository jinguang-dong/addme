package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jls {
    public static final jls a = a().a();
    public final int b;
    public final int c;
    public final String d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    private final int j;
    private final boolean k;

    public jls() {
        throw null;
    }

    public static jlr a() {
        jlr jlrVar = new jlr();
        jlrVar.c = (short) (jlrVar.c | 48);
        jlrVar.b(false);
        jlrVar.c(false);
        jlrVar.d(false);
        jlrVar.f(false);
        jlrVar.e(false);
        jlrVar.c = (short) (jlrVar.c | 2048);
        jlrVar.i(-1);
        jlrVar.h(-1);
        jlrVar.g(-1);
        jlrVar.a = -1;
        jlrVar.c = (short) (jlrVar.c | 1);
        jlrVar.b = "";
        return jlrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jls) {
            jls jlsVar = (jls) obj;
            if (this.j == jlsVar.j && this.b == jlsVar.b && this.c == jlsVar.c && this.d.equals(jlsVar.d) && this.e == jlsVar.e && this.k == jlsVar.k && this.f == jlsVar.f && this.g == jlsVar.g && this.h == jlsVar.h && this.i == jlsVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((this.j ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "{" + this.j + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", false, false, " + this.k + ", " + this.f + ", " + this.g + ", " + this.h + ", " + this.i + ", false}";
    }

    public jls(int i, int i2, int i3, String str, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.j = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = i4;
        this.k = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }
}
