package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngp {
    public final pka a;
    public final pas b;
    public final pae c;
    public final rwc d;

    public ngp() {
        throw null;
    }

    public static ngp a(pka pkaVar, pas pasVar, pae paeVar) {
        return b(pkaVar, pasVar, paeVar, rvk.a);
    }

    public static ngp b(pka pkaVar, pas pasVar, pae paeVar, rwc rwcVar) {
        pkaVar.getClass();
        pasVar.getClass();
        return new ngp(pkaVar, pasVar, paeVar, rwcVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ngp) {
            ngp ngpVar = (ngp) obj;
            if (this.a.equals(ngpVar.a) && this.b.equals(ngpVar.b) && this.c.equals(ngpVar.c) && this.d.equals(ngpVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        rwc rwcVar = this.d;
        pae paeVar = this.c;
        pas pasVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(pasVar) + ", " + String.valueOf(paeVar) + ", " + String.valueOf(rwcVar) + "}";
    }

    public ngp(pka pkaVar, pas pasVar, pae paeVar, rwc rwcVar) {
        this.a = pkaVar;
        this.b = pasVar;
        this.c = paeVar;
        this.d = rwcVar;
    }
}
