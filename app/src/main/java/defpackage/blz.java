package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class blz {
    public final String a;
    public final long b;
    public final int c;

    public blz(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public float c(float f, float f2, float f3) {
        throw null;
    }

    public long d(float f, float f2, float f3) {
        throw null;
    }

    public long e(float f, float f2, float f3, float f4, blz blzVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        blz blzVar = (blz) obj;
        if (this.c == blzVar.c && a.ao(this.a, blzVar.a)) {
            return a.q(this.b, blzVar.b);
        }
        return false;
    }

    public boolean f() {
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + ((int) (this.b ^ 3))) * 31) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) bly.a(this.b)) + ')';
    }
}
