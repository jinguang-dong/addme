package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lui {
    public final lud a;
    public final owq b;

    public lui() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lui) {
            lui luiVar = (lui) obj;
            if (this.a.equals(luiVar.a) && this.b.equals(luiVar.b)) {
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
        owq owqVar = this.b;
        return "{" + this.a.toString() + ", " + owqVar.toString() + "}";
    }

    public lui(lud ludVar, owq owqVar) {
        ludVar.getClass();
        this.a = ludVar;
        this.b = owqVar;
    }
}
