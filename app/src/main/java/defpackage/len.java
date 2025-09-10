package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class len {
    public final lem a;
    public final lem b;

    public len() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof len) {
            len lenVar = (len) obj;
            if (this.a.equals(lenVar.a) && this.b.equals(lenVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        lem lemVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(lemVar) + "}";
    }

    public len(lem lemVar, lem lemVar2) {
        this.a = lemVar;
        this.b = lemVar2;
    }
}
