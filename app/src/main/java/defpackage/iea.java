package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iea {
    public static final iea a = b(idz.NONE, 3, sfc.a);
    public final sbv b;
    public final int c;
    private final int d;

    public iea() {
        throw null;
    }

    public static iea b(idz idzVar, int i, sbv sbvVar) {
        return new iea(idzVar.ordinal(), i, sbvVar);
    }

    public final idz a() {
        return idz.values()[this.d];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iea) {
            iea ieaVar = (iea) obj;
            if (this.d == ieaVar.d && this.c == ieaVar.c && this.b.equals(ieaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        a.aF(i);
        int i2 = this.d;
        return this.b.hashCode() ^ ((i ^ ((i2 ^ 1000003) * 1000003)) * 1000003);
    }

    public final String toString() {
        return "{" + this.d + ", " + ezh.R(this.c) + ", " + this.b.toString() + "}";
    }

    public iea(int i, int i2, sbv sbvVar) {
        this.d = i;
        this.c = i2;
        sbvVar.getClass();
        this.b = sbvVar;
    }
}
