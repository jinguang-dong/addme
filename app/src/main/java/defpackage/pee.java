package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pee {
    public final poj a;
    public final poe b;

    public pee() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pee) {
            pee peeVar = (pee) obj;
            if (this.a.equals(peeVar.a) && this.b.equals(peeVar.b)) {
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
        poe poeVar = this.b;
        return "{" + this.a.toString() + ", " + poeVar.toString() + "}";
    }

    public pee(poj pojVar, poe poeVar) {
        this.a = pojVar;
        poeVar.getClass();
        this.b = poeVar;
    }
}
