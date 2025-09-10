package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pes {
    public final rwc a;
    public final pas b;

    public pes() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pes) {
            pes pesVar = (pes) obj;
            if (this.a.equals(pesVar.a) && this.b.equals(pesVar.b)) {
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
        pas pasVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(pasVar) + "}";
    }

    public pes(rwc rwcVar, pas pasVar) {
        this.a = rwcVar;
        this.b = pasVar;
    }
}
