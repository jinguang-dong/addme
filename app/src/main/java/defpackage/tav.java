package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tav {
    private final shd a;
    private final String b;

    public tav() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tav) {
            tav tavVar = (tav) obj;
            if (this.a.equals(tavVar.a) && ((str = this.b) != null ? str.equals(tavVar.b) : tavVar.b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "{" + this.a.toString() + ", " + this.b + "}";
    }

    public tav(shd shdVar, String str) {
        this.a = shdVar;
        this.b = str;
    }
}
