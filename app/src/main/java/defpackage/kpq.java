package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpq {
    public final pjr a;
    public final poe b;
    public final poj c;

    public kpq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        poj pojVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kpq) {
            kpq kpqVar = (kpq) obj;
            if (this.a.equals(kpqVar.a) && this.b.equals(kpqVar.b) && ((pojVar = this.c) != null ? pojVar.equals(kpqVar.c) : kpqVar.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.b ^ 1000003) * 1000003) ^ this.b.hashCode();
        poj pojVar = this.c;
        return (pojVar == null ? 0 : pojVar.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "{" + this.a.a + ", " + this.b.toString() + ", " + String.valueOf(this.c) + "}";
    }

    public kpq(pjr pjrVar, poe poeVar, poj pojVar) {
        this.a = pjrVar;
        this.b = poeVar;
        this.c = pojVar;
    }
}
