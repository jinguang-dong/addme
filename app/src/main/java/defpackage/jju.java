package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jju {
    public final boolean a;
    public final owf b;
    public final int c;
    public final int d;
    public final jjv e;
    private final int f;
    private final int g;

    public jju() {
        throw null;
    }

    public static jjr a() {
        jjr jjrVar = new jjr();
        jjrVar.b(true);
        return jjrVar;
    }

    public final jjs b() {
        return jjs.values()[this.g];
    }

    public final jjt c() {
        return jjt.values()[this.f];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jju) {
            jju jjuVar = (jju) obj;
            if (this.f == jjuVar.f && this.g == jjuVar.g && this.a == jjuVar.a && this.b.equals(jjuVar.b) && this.c == jjuVar.c && this.d == jjuVar.d && this.e.equals(jjuVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return this.e.hashCode() ^ ((((((((i ^ ((((this.f ^ 1000003) * 1000003) ^ this.g) * 1000003)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public jju(int i, int i2, boolean z, owf owfVar, int i3, int i4, jjv jjvVar) {
        this.f = i;
        this.g = i2;
        this.a = z;
        this.b = owfVar;
        this.c = i3;
        this.d = i4;
        this.e = jjvVar;
    }
}
