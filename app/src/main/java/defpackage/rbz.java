package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbz {
    public final edw a;
    public final edw b;

    public rbz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rbz) {
            rbz rbzVar = (rbz) obj;
            edw edwVar = this.a;
            if (edwVar != null ? edwVar.equals(rbzVar.a) : rbzVar.a == null) {
                edw edwVar2 = this.b;
                if (edwVar2 != null ? edwVar2.equals(rbzVar.b) : rbzVar.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        edw edwVar = this.a;
        int iHashCode = edwVar == null ? 0 : edwVar.hashCode();
        edw edwVar2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (edwVar2 != null ? edwVar2.hashCode() : 0);
    }

    public final String toString() {
        edw edwVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(edwVar) + "}";
    }

    public rbz(edw edwVar, edw edwVar2) {
        this.a = edwVar;
        this.b = edwVar2;
    }
}
