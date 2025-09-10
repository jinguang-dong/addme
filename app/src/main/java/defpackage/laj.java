package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class laj {
    public static final laj a;
    public final int b;
    public final int c;

    static {
        lai laiVar = new lai();
        laiVar.c(-1);
        laiVar.b(-1);
        a = laiVar.a();
    }

    public laj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof laj) {
            laj lajVar = (laj) obj;
            if (this.b == lajVar.b && this.c == lajVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ ((this.b ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.b + ", " + this.c + "}";
    }

    public laj(int i, int i2) {
        this.b = i;
        this.c = i2;
    }
}
